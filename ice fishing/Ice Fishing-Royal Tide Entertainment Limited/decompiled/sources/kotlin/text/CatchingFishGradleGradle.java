package kotlin.text;

/* loaded from: classes.dex */
public enum CatchingFishGradleGradle {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String CatchingFishReduxKtor;

    CatchingFishGradleGradle(String str) {
        this.CatchingFishReduxKtor = str;
    }

    public static CatchingFishGradleGradle CatchingFishParcelableFAB(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }
}
