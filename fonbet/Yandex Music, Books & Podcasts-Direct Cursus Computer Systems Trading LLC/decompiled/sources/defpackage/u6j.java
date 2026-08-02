package defpackage;

/* loaded from: classes5.dex */
public final class u6j extends myo {
    public static final u6j d = new u6j(0);
    public static final u6j e = new u6j(1);
    public final /* synthetic */ int c;

    public /* synthetic */ u6j(int i) {
        this.c = i;
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "Chain with PreCertificate or Certificate must contain issuer";
            default:
                return "Chain with PreCertificate signed by PreCertificate Signing Cert must contain issuer";
        }
    }
}
