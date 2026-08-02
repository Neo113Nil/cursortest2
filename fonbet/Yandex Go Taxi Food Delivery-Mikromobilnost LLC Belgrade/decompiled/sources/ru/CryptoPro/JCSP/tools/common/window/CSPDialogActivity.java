package ru.CryptoPro.JCSP.tools.common.window;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import defpackage.g8e;
import defpackage.jzh0;
import defpackage.rch0;
import defpackage.s1i0;
import defpackage.woh0;
import java.util.Locale;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;
import ru.CryptoPro.JCSP.tools.common.window.ipc.IRemoteCallback;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteParameters;
import ru.cprocsp.ACSP.tools.common.AppUtils;
import ru.cprocsp.ACSP.tools.common.CSPNotificationManager;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* loaded from: classes4.dex */
public class CSPDialogActivity extends AppCompatActivity implements IDialogId, DialogConstants, RemoteParameters {
    protected CSPDialog dialogFragment;

    private Context updateResources(Context context, Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        return context.createConfigurationContext(configuration);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(updateResources(context, Locale.getDefault()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null && extras.getInt(IDialogId.INTENT_EXTRA_IN_PIN_TYPE) == -2) {
            setTheme(s1i0.CryptoPro_AppTheme_NoActionBar);
        }
        Bundle bundleExtra = intent.getBundleExtra(RemoteParameters.BUNDLE_NAME);
        boolean z = false;
        boolean z2 = (bundleExtra == null || bundleExtra.getBinder(RemoteParameters.BINDER_NAME) == null) ? false : true;
        setContentView(woh0.activity_dialog);
        if (Build.VERSION.SDK_INT > 34) {
            AppUtils.setWindowInsets(findViewById(rch0.emptyLayout));
        }
        CSPNotificationManager.deleteCSPNotification(this, (NotificationManager) getSystemService(NotificationManager.class));
        if (bundle == null) {
            if (!z2) {
                if (extras == null) {
                    extras = new Bundle();
                }
                String string = getString(jzh0.InterruptedCSPOperation);
                if (extras.getString(IDialogId.INTENT_EXTRA_IN_REPLACED_MESSAGE) == null) {
                    extras.putString(IDialogId.INTENT_EXTRA_IN_REPLACED_MESSAGE, string);
                }
                extras.putString(IDialogId.INTENT_EXTRA_IN_MESSAGE, string);
                extras.putBoolean(IDialogId.INTENT_EXTRA_IN_CANCEL_ENABLED, false);
                extras.putBoolean(IDialogId.INTENT_EXTRA_IN_OK_ENABLED, true);
                IRemoteCallback.Stub stub = new IRemoteCallback.Stub() { // from class: ru.CryptoPro.JCSP.tools.common.window.CSPDialogActivity.1
                    @Override // ru.CryptoPro.JCSP.tools.common.window.ipc.IRemoteCallback.Stub, ru.CryptoPro.JCSP.tools.common.window.ipc.IRemoteCallback
                    public void sendResult(Bundle bundle2) throws RemoteException {
                    }
                };
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putBinder(RemoteParameters.BINDER_NAME, stub.asBinder());
                extras.putBundle(RemoteParameters.BUNDLE_NAME, bundleExtra);
                this.dialogFragment = new CSPMessage();
            } else if (extras != null) {
                long j = extras.getLong(IDialogId.INTENT_EXTRA_IN_FUN_RESULT);
                int i = extras.getInt(IDialogId.INTENT_EXTRA_IN_PIN_TYPE);
                if (i == -3) {
                    this.dialogFragment = new CSPSelectReader();
                } else if (i == -2) {
                    this.dialogFragment = new CSPBio();
                    z = true;
                } else if (i == -1) {
                    this.dialogFragment = new CSPMessage();
                    if (!extras.getBoolean(IDialogId.INTENT_EXTRA_IN_CANCEL_ENABLED, false)) {
                        extras.putBoolean(IDialogId.INTENT_EXTRA_IN_OK_ENABLED, true);
                    }
                } else if (j == DialogConstants.NTE_TOKEN_KEYSET_STORAGE_FULL) {
                    this.dialogFragment = new CSPMessage();
                    extras.putBoolean(IDialogId.INTENT_EXTRA_IN_CANCEL_ENABLED, true);
                    extras.putBoolean(IDialogId.INTENT_EXTRA_IN_OK_ENABLED, false);
                } else {
                    this.dialogFragment = new CSPPin();
                    extras.putBoolean(IDialogId.INTENT_EXTRA_IN_CANCEL_ENABLED, true);
                }
            }
            CSPDialog cSPDialog = this.dialogFragment;
            if (cSPDialog != null) {
                cSPDialog.setCurrentVersion(4);
                this.dialogFragment.setArguments(extras);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                if (!z) {
                    this.dialogFragment.show(supportFragmentManager, "dialog");
                    return;
                }
                a h = g8e.h(supportFragmentManager, supportFragmentManager);
                h.f = Constants.INTENT_ADDRESS_ID;
                h.f(rch0.emptyLayout, this.dialogFragment, null, 1);
                h.c(null);
                h.d();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        CSPDialog cSPDialog;
        super.onPause();
        if (!isFinishing() || (cSPDialog = this.dialogFragment) == null || cSPDialog.isCallingEndDialog()) {
            return;
        }
        this.dialogFragment.endDialog(1, null);
    }
}
