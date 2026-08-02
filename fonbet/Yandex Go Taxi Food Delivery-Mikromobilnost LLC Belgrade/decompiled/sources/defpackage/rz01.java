package defpackage;

@gsq0
/* loaded from: classes10.dex */
public final class rz01 {
    public static final qz01 Companion = new qz01();
    public final String a;

    public /* synthetic */ rz01(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, pz01.a.getDescriptor());
            throw null;
        }
    }

    public rz01(String str) {
        this.a = str;
    }
}
