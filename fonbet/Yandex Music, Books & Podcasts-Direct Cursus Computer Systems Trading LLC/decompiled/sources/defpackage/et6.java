package defpackage;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class et6 implements OutcomeReceiver {
    public final /* synthetic */ rp7 a;
    public final /* synthetic */ ar6 b;

    public et6(rp7 rp7Var, ar6 ar6Var, gt6 gt6Var) {
        this.a = rp7Var;
        this.b = ar6Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(Throwable th) {
        yq6 yq6Var;
        Object obj;
        CreateCredentialException createCredentialException = (CreateCredentialException) th;
        createCredentialException.getClass();
        Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
        String type = createCredentialException.getType();
        type.getClass();
        String message = createCredentialException.getMessage();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    obj = new xq6(message);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i = as6.a;
                    String obj2 = message != null ? message.toString() : null;
                    try {
                    } catch (uvc unused) {
                        yq6Var = new yq6(type, obj2);
                    }
                    if (!StringsKt.M(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new uvc();
                    }
                    int i2 = as6.a;
                    obj = y2x.n(type, obj2);
                    this.a.f(obj);
                    return;
                }
                yq6Var = new yq6(type, message);
                obj = yq6Var;
                this.a.f(obj);
                return;
            case -1166690414:
                if (type.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    obj = new yq6(message, 5);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = yq6Var;
                this.a.f(obj);
                return;
            case -580283253:
                if (type.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    obj = new yq6(message, 3);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = yq6Var;
                this.a.f(obj);
                return;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    obj = new yq6(message, 4);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = yq6Var;
                this.a.f(obj);
                return;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    obj = new yq6(message, 1);
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = yq6Var;
                this.a.f(obj);
                return;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    obj = new yq6((CharSequence) message, "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS");
                    this.a.f(obj);
                    return;
                }
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = yq6Var;
                this.a.f(obj);
                return;
            default:
                if (c.v(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = yq6Var;
                this.a.f(obj);
                return;
        }
    }

    public final void onResult(Object obj) {
        br6 cr6Var;
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) obj;
        createCredentialResponse.getClass();
        Log.i("CredManProvService", "Create Result returned from framework: ");
        String str = this.b.a;
        Bundle data = createCredentialResponse.getData();
        data.getClass();
        try {
            if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                cr6Var = new cr6();
            } else {
                if (!str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new uvc();
                }
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                    string.getClass();
                    cr6Var = new cs6(data, string);
                } catch (Exception unused) {
                    throw new uvc();
                }
            }
        } catch (uvc unused2) {
            cr6Var = new cr6();
            if (str.length() <= 0) {
                xq0.x("type should not be empty");
                return;
            }
        }
        this.a.onResult(cr6Var);
    }
}
