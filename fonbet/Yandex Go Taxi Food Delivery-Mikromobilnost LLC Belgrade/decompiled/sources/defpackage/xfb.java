package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class xfb {
    public static final wfb Companion = new wfb();
    public final String a;
    public final String b;

    public /* synthetic */ xfb(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, vfb.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public xfb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
