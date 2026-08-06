package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class q50 implements defpackage.cd1 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public static final defpackage.q50 giKS3J6vZuNy = new defpackage.q50(0);
    public static final defpackage.q50 fWTAfUmVKrZq = new defpackage.q50(1);

    public /* synthetic */ q50(int i) {
        this.ZpBGe2uQfcn8 = i;
    }

    @Override // defpackage.cd1
    public final defpackage.j80 ZpBGe2uQfcn8(long j, defpackage.sc0 sc0Var, defpackage.hp hpVar) {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                float OVwOqzUGHcCU = hpVar.OVwOqzUGHcCU(30.0f);
                return new defpackage.iv0(new defpackage.s31(0.0f, -OVwOqzUGHcCU, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + OVwOqzUGHcCU));
            case 1:
                float OVwOqzUGHcCU2 = hpVar.OVwOqzUGHcCU(30.0f);
                return new defpackage.iv0(new defpackage.s31(-OVwOqzUGHcCU2, 0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) + OVwOqzUGHcCU2, java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new defpackage.iv0(defpackage.n70.oh71FJcDz6S2(0L, j));
        }
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
