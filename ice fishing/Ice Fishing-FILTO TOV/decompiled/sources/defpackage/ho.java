package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public interface ho extends el {
    static void Fm8W7vP7q(i60 i60Var, qj qjVar, long j, long j2, long j3, qj qjVar2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        i60Var.EljAMC1QTz(qjVar, j4, (i & 4) != 0 ? jed7WnvkLvFq(i60Var.OOA6hdeuvCS.xqGvceK5x(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? sr.Mjvvu5DE : qjVar2);
    }

    static /* synthetic */ void JB4pnjMK(ho hoVar, long j, float f, long j2, float f2, j61 j61Var, int i) {
        if ((i & 4) != 0) {
            j2 = hoVar.z19UFEN2I();
        }
        hoVar.A1EKNP6CxJ(j, f, j2, (i & 8) != 0 ? 1.0f : f2, (i & 16) != 0 ? sr.Mjvvu5DE : j61Var);
    }

    static /* synthetic */ void WIEu4Ya2g8(ho hoVar, qj qjVar, long j, long j2, float f, qj qjVar2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = jed7WnvkLvFq(hoVar.xqGvceK5x(), j3);
        }
        hoVar.cilMamHF(qjVar, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? sr.Mjvvu5DE : qjVar2);
    }

    static /* synthetic */ void YTyqgZhdF(ho hoVar, h1 h1Var, qj qjVar, float f, j61 j61Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        qj qjVar2 = j61Var;
        if ((i & 8) != 0) {
            qjVar2 = sr.Mjvvu5DE;
        }
        hoVar.SyyZR548qbcW(h1Var, qjVar, f2, qjVar2, (i & 32) != 0 ? 3 : 0);
    }

    static long jed7WnvkLvFq(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void k8h8IjolWQ(ho hoVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = jed7WnvkLvFq(hoVar.xqGvceK5x(), 0L);
        }
        hoVar.ZB4nixHlTE(j, 0L, j2, sr.Mjvvu5DE, (i & 64) != 0 ? 3 : 0);
    }

    static void mE4lRynR(ho hoVar, w0 w0Var, long j, float f, s6 s6Var, int i) {
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        hoVar.TpUsjqg3bxO(w0Var, j, j, f, s6Var);
    }

    void A1EKNP6CxJ(long j, float f, long j2, float f2, qj qjVar);

    void MZhzXH72(ma0 ma0Var, long j, long j2, float f);

    void SyyZR548qbcW(h1 h1Var, qj qjVar, float f, qj qjVar2, int i);

    void TpUsjqg3bxO(w0 w0Var, long j, long j2, float f, s6 s6Var);

    void WdrkLMV3xh(ss0 ss0Var, float f, long j);

    void ZB4nixHlTE(long j, long j2, long j3, qj qjVar, int i);

    f4 arNh8D4Z5gB();

    void c4eaifQP(long j, long j2, long j3, float f);

    void cilMamHF(qj qjVar, long j, long j2, float f, qj qjVar2);

    p50 getLayoutDirection();

    void pog2g9KITJA(long j, long j2, long j3, long j4, qj qjVar);

    void qugwajBSa59j(ma0 ma0Var, long j, long j2);

    void uFEq9NpZ(long j, float f, long j2, long j3, qj qjVar);

    default long xqGvceK5x() {
        return arNh8D4Z5gB().mOu10nynGul();
    }

    default long z19UFEN2I() {
        return n4.mOu10nynGul(arNh8D4Z5gB().mOu10nynGul());
    }
}
