package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class CredentialProviderController {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final CredentialProviderBaseController$Companion Companion = new CredentialProviderBaseController$Companion();
    public static final Set retryables = ArraysKt___ArraysKt.toSet(new Integer[]{7, 20});
    public static final int CONTROLLER_REQUEST_CODE = 1;

    public static void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", CONTROLLER_REQUEST_CODE);
        intent.putExtra("RESULT_RECEIVER", toIpcFriendlyResultReceiver(resultReceiver));
        intent.setFlags(65536);
    }

    public static boolean maybeReportErrorFromResultReceiver(Bundle bundle, Function2 function2, Executor executor, CredentialManagerCallback credentialManagerCallback, CancellationSignal cancellationSignal) {
        bundle.getClass();
        executor.getClass();
        credentialManagerCallback.getClass();
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        Object invoke = function2.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return true;
        }
        executor.execute(new DispatchQueue$$ExternalSyntheticLambda0(2, credentialManagerCallback, invoke));
        return true;
    }

    public static ResultReceiver toIpcFriendlyResultReceiver(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}
