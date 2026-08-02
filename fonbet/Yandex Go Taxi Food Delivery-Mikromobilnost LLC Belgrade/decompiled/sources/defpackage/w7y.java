package defpackage;

@gsq0
/* loaded from: classes9.dex */
public final class w7y {
    public static final v7y Companion = new v7y();
    public final String a;

    public /* synthetic */ w7y(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, u7y.a.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        return oyr.p("Common(version='", this.a, "')");
    }

    public w7y() {
        this.a = "1.0";
    }
}
