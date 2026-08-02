package defpackage;

/* loaded from: classes5.dex */
public final class g0u extends j0u {
    public static final g0u b = new g0u(0);
    public static final g0u c = new g0u(1);
    public final /* synthetic */ int a;

    public /* synthetic */ g0u(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Failure: No certificates";
            default:
                return "Failure: This certificate does not have any Signed Certificate Timestamps in it.";
        }
    }
}
