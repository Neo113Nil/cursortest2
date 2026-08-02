package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class y5c {
    public static final x5c Companion = new x5c();
    public final String a;
    public final String b;

    public /* synthetic */ y5c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w5c.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
