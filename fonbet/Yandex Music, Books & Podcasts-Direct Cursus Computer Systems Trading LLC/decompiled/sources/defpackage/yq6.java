package defpackage;

/* loaded from: classes.dex */
public final class yq6 extends zq6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq6(String str, int i) {
        super(str, "android.credentials.CreateCredentialException.TYPE_INTERRUPTED");
        switch (i) {
            case 3:
                super(str, "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
                break;
            case 4:
                super(str, "android.credentials.CreateCredentialException.TYPE_UNKNOWN");
                break;
            case 5:
                super(str, "androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                break;
            default:
                break;
        }
    }

    public yq6(String str, String str2) {
        super(str2, str);
        if (str.length() > 0) {
            return;
        }
        xq0.x("type must not be empty");
        throw null;
    }
}
