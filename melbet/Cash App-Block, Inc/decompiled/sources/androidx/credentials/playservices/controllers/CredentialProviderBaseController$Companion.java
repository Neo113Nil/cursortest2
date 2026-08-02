package androidx.credentials.playservices.controllers;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CredentialProviderBaseController$Companion {
    public static CreateCredentialException createCredentialExceptionTypeToException$credentials_play_services_auth(String str, String str2) {
        return Intrinsics.areEqual(str, "CREATE_CANCELED") ? new CreateCredentialCancellationException(str2) : Intrinsics.areEqual(str, "CREATE_INTERRUPTED") ? new CreateCredentialInterruptedException(str2) : new CreateCredentialUnknownException(str2);
    }

    public static GetCredentialException getCredentialExceptionTypeToException$credentials_play_services_auth(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new NoCredentialException(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new GetCredentialCancellationException(str2);
            }
        }
        return new GetCredentialUnknownException(str2);
    }

    public static void reportError$credentials_play_services_auth(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
