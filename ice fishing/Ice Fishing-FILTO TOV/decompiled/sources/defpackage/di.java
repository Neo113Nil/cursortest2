package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class di extends d71 implements hv {
    public int mOu10nynGul;

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            this.mOu10nynGul = 1;
            throw null;
        }
        if (i == 1) {
            o50.A1EKNP6CxJ(obj);
            return kc1.GWasM1elztuh;
        }
        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        di diVar = new di(1, (vg) obj);
        kc1 kc1Var = kc1.GWasM1elztuh;
        diVar.WIEu4Ya2g8(kc1Var);
        return kc1Var;
    }
}
