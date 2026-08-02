package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import kotlin.text.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ft6 implements OutcomeReceiver {
    public final /* synthetic */ jzi a;

    public ft6(jzi jziVar, gt6 gt6Var) {
        this.a = jziVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(Throwable th) {
        l7d l7dVar;
        Object obj;
        GetCredentialException getCredentialException = (GetCredentialException) th;
        getCredentialException.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String type = getCredentialException.getType();
        type.getClass();
        String message = getCredentialException.getMessage();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    obj = new l7d(4, message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i = sad.c;
                    String obj2 = message != null ? message.toString() : null;
                    try {
                    } catch (uvc unused) {
                        l7dVar = new l7d(obj2, type);
                    }
                    if (!c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new uvc();
                    }
                    int i2 = sad.c;
                    obj = nt0.w(type, obj2);
                    this.a.f(obj);
                    return;
                }
                l7dVar = new l7d(message, type);
                obj = l7dVar;
                this.a.f(obj);
                return;
            case -408155724:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    obj = new l7d(5, message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = l7dVar;
                this.a.f(obj);
                return;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    obj = new l7d(2, message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = l7dVar;
                this.a.f(obj);
                return;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    obj = new l7d(0, message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = l7dVar;
                this.a.f(obj);
                return;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    obj = new l7d(6, message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = l7dVar;
                this.a.f(obj);
                return;
            case 1594095913:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    obj = new l7d(3, message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = l7dVar;
                this.a.f(obj);
                return;
            default:
                if (c.v(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = l7dVar;
                this.a.f(obj);
                return;
        }
    }

    public final void onResult(Object obj) {
        c3x ww6Var;
        c3x ww6Var2;
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        getCredentialResponse.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        try {
        } catch (uvc unused) {
            ww6Var = new ww6(data, type);
        }
        switch (type.hashCode()) {
            case -1678407252:
                if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                    try {
                        String string = data.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                        string.getClass();
                        ww6Var2 = new ww6(data, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                ww6Var = ww6Var2;
                                this.a.onResult(new o7d(ww6Var));
                                return;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                    } catch (Exception unused3) {
                        throw new uvc();
                    }
                }
                throw new uvc();
            case -1072734346:
                if (type.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                    if (string2 == null) {
                        throw new l7d(6, "The device does not contain a restore credential.");
                    }
                    ww6Var2 = new ww6(data, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            ww6Var = ww6Var2;
                            this.a.onResult(new o7d(ww6Var));
                            return;
                        } catch (Exception unused4) {
                        }
                    }
                    throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                }
                throw new uvc();
            case -543568185:
                if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    try {
                        String string3 = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                        String string4 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                        string3.getClass();
                        string4.getClass();
                        ww6Var2 = new z9k(string3, string4, data);
                        ww6Var = ww6Var2;
                        this.a.onResult(new o7d(ww6Var));
                        return;
                    } catch (Exception unused5) {
                        throw new uvc();
                    }
                }
                throw new uvc();
            case -95037569:
                if (type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    try {
                        String string5 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                        string5.getClass();
                        ww6Var = new h0n(data, string5);
                        this.a.onResult(new o7d(ww6Var));
                        return;
                    } catch (Exception unused6) {
                        throw new uvc();
                    }
                }
                throw new uvc();
            default:
                throw new uvc();
        }
    }
}
