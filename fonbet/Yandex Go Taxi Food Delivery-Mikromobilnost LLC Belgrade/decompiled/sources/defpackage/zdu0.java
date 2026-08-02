package defpackage;

/* loaded from: classes13.dex */
public final class zdu0 {
    public final boolean a;
    public final boolean b;

    public zdu0(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public zdu0() {
        this(false, false, 3);
    }
}
