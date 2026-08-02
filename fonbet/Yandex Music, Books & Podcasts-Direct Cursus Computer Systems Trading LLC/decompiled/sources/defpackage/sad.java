package defpackage;

/* loaded from: classes.dex */
public final class sad extends m7d {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sad(o2 o2Var, String str) {
        super(str, r2);
        String concat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(o2Var.a);
        this.a = concat;
        if (concat.length() > 0) {
            return;
        }
        xq0.x("type must not be empty");
        throw null;
    }
}
