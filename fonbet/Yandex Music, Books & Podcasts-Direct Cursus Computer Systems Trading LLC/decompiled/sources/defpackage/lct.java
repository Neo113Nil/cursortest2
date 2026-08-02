package defpackage;

/* loaded from: classes3.dex */
public final class lct implements fu4 {
    public final Object a;

    public lct(mxo mxoVar) {
        mxoVar.getClass();
        this.a = mxoVar;
    }

    @Override // defpackage.fu4
    public final boolean a() {
        Object obj = this.a;
        if (obj instanceof fvf) {
            return ((fvf) obj).h() == 0 && ((fvf) obj).i() == 0;
        }
        if (obj instanceof tsf) {
            tsf tsfVar = (tsf) obj;
            return tsfVar.g() == 0 && tsfVar.d.c.h() == 0;
        }
        throw new IllegalArgumentException(obj + " not supported");
    }
}
