package ru.CryptoPro.JCSP.tools.common.window;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import defpackage.jzh0;
import defpackage.ny61;
import defpackage.qog0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import ru.CryptoPro.JCSP.CSPInternalConfig;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.CryptoPro.JCSP.tools.common.window.ipc.IRemoteCallback;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteParameters;
import ru.cprocsp.ACSP.tools.common.CSPNotificationManager;

/* loaded from: classes4.dex */
public abstract class CSPDialog extends DialogFragment implements IDialogId, ICSPDialogController, DialogConstants, RemoteParameters, RemoteBioParameters {
    public static final int VERSION = 4;
    protected Bundle bundle;
    protected IRemoteCallback remoteCallback;
    protected int dialogType = -100;
    protected String userMessage = null;
    protected int currentVersion = 0;
    private boolean callingEndDialog = false;

    private static int showActivity(int i, String str, byte[] bArr, int i2, int i3, String[] strArr, long j, String str2, String str3, String str4, Collection collection) {
        Application applicationContext = CSPInternalConfig.getApplicationContext();
        if (applicationContext == null) {
            Log.e(DialogConstants.APP_LOGGER_TAG, "Application context has not obtained from native code. Dialog " + i + " cannot be shown.");
            return -1;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final DialogTransport dialogTransport = new DialogTransport(countDownLatch);
        Intent intent = new Intent(applicationContext, (Class<?>) CSPDialogActivity.class);
        intent.addFlags(268435460);
        if (i == -2) {
            intent.putExtra(IDialogId.INTENT_EXTRA_IN_MESSAGE, str);
        } else {
            String messageForPinType = CSPMessageConverter.getMessageForPinType(applicationContext, i, str, bArr, str3, j);
            String replaceCSPMessage = CSPMessageConverter.replaceCSPMessage(applicationContext, i, messageForPinType, str4, collection == null || collection.isEmpty(), j);
            if (!CSPMessageConverter.shouldCSPMessageBeShown) {
                return 0;
            }
            intent.putExtra(IDialogId.INTENT_EXTRA_IN_MESSAGE, messageForPinType);
            intent.putExtra(IDialogId.INTENT_EXTRA_IN_REPLACED_MESSAGE, replaceCSPMessage);
        }
        IRemoteCallback.Stub stub = new IRemoteCallback.Stub() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPDialog.1
            @Override // ru.CryptoPro.JCSP.tools.common.window.ipc.IRemoteCallback.Stub, ru.CryptoPro.JCSP.tools.common.window.ipc.IRemoteCallback
            public void sendResult(Bundle bundle) throws RemoteException {
                if (bundle.getInt("type", -100) != -2) {
                    DialogTransport.this.setResult(bundle.getInt(IDialogId.INTENT_EXTRA_OUT_RESULT));
                    DialogTransport.this.setPassword(bundle.getString(IDialogId.INTENT_EXTRA_OUT_PASSWORD));
                    countDownLatch.countDown();
                } else {
                    int[] iArr = new int[2];
                    bundle.putInt(RemoteBioParameters.BIO_RESULT, CSPBio.onTouchEvent(bundle.getInt(RemoteBioParameters.X), bundle.getInt(RemoteBioParameters.Y), bundle.getLong(RemoteBioParameters.TIME), iArr));
                    bundle.putInt(RemoteBioParameters.BIO_PROGRESS_LENGTH, iArr[0]);
                    bundle.putInt(RemoteBioParameters.BIO_PROGRESS_MAX, iArr[1]);
                }
            }
        };
        Bundle bundle = new Bundle();
        bundle.putBinder(RemoteParameters.BINDER_NAME, stub.asBinder());
        intent.putExtra(RemoteParameters.BUNDLE_NAME, bundle);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_PIN_TYPE, i);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_MAX, i2);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_OK_ENABLED, (i3 & 1) != 0);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_CANCEL_ENABLED, (i3 & 2) != 0);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_FUN_RESULT, j);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_HEADER, str2);
        intent.putExtra(IDialogId.INTENT_EXTRA_IN_TEXT_FOR_EMPTY, str4);
        if (collection != null) {
            intent.putParcelableArrayListExtra(IDialogId.INTENT_EXTRA_IN_READER_INFO, new ArrayList<>(collection));
        }
        if (applicationContext.getResources().getBoolean(qog0.ShowCSPNotification)) {
            CSPNotificationManager.showCSPNotification(applicationContext, PendingIntent.getActivity(applicationContext, 0, intent, 201326592), bundle);
        }
        applicationContext.startActivity(intent);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        if (i == 301 || i == 2109) {
            strArr[0] = dialogTransport.getPassword();
        }
        return dialogTransport.getResult();
    }

    public static int showDialogEx(int i, String str, byte[] bArr, int i2, int i3, String[] strArr, long j) {
        return showActivity(i, str, bArr, i2, i3, strArr, j, null, null, null, null);
    }

    public static int showSelectReaderDialog(String str, String str2, String str3, Collection collection, int i) {
        return showActivity(-3, null, null, i, 0, null, -1L, str, str2, str3, collection);
    }

    public void createCustomizer() {
    }

    @Override // ru.CryptoPro.JCSP.tools.common.window.ICSPDialogController
    public void endDialog(int i, String str) {
        this.callingEndDialog = true;
        Bundle bundle = new Bundle();
        bundle.putInt(IDialogId.INTENT_EXTRA_OUT_RESULT, i);
        bundle.putString(IDialogId.INTENT_EXTRA_OUT_PASSWORD, str);
        try {
            this.remoteCallback.sendResult(bundle);
        } catch (RemoteException e) {
            Log.e(DialogConstants.APP_LOGGER_TAG, "Remote exception occurred: " + e.getMessage(), e);
        }
        if (this.dialogType == -2) {
            dismiss();
        }
        if (requireActivity().isFinishing()) {
            return;
        }
        requireActivity().finishAndRemoveTask();
    }

    public String getDialogTitle() {
        return getString(jzh0.CompanyName);
    }

    public void initReceiver() {
    }

    public boolean isCallingEndDialog() {
        return this.callingEndDialog;
    }

    public boolean keyBackController(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        int i2 = this.dialogType == -3 ? -1 : 1;
        setFinished();
        endDialog(i2, null);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IBinder binder;
        super.onCreate(bundle);
        setCancelable(false);
        Bundle arguments = getArguments();
        this.bundle = arguments;
        if (arguments != null) {
            this.dialogType = arguments.getInt(IDialogId.INTENT_EXTRA_IN_PIN_TYPE);
            Bundle bundle2 = this.bundle.getBundle(RemoteParameters.BUNDLE_NAME);
            if (bundle2 != null && (binder = bundle2.getBinder(RemoteParameters.BINDER_NAME)) != null) {
                this.remoteCallback = IRemoteCallback.Stub.asInterface(binder);
            }
            if (this.remoteCallback == null) {
                ny61.r("Binder not found, communication is broken.");
                return;
            }
            this.userMessage = this.bundle.getString(IDialogId.INTENT_EXTRA_IN_MESSAGE);
        }
        createCustomizer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        super.onResume();
        int i = this.dialogType;
        if (i == 301 || i == 2109 || (view = getView()) == null) {
            return;
        }
        view.setFocusableInTouchMode(true);
        view.requestFocus();
    }

    public void releaseReceiver() {
    }

    public void setCurrentVersion(int i) {
        this.currentVersion = i;
    }

    public void setFinished() {
    }

    public static int showDialogEx(int i, String str, byte[] bArr, int i2, int i3, String[] strArr) {
        return showDialogEx(i, str, bArr, i2, i3, strArr, 0L);
    }
}
