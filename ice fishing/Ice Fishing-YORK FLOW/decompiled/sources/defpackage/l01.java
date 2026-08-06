package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l01 implements defpackage.rb0 {
    public final defpackage.ne ZpBGe2uQfcn8;
    public final defpackage.be0 giKS3J6vZuNy;

    public l01(defpackage.ne neVar) {
        neVar.getClass();
        this.ZpBGe2uQfcn8 = neVar;
        this.giKS3J6vZuNy = defpackage.t80.oCu53ZX2v4Ju(defpackage.yf0.WDYagTQQm9ns, new defpackage.l3(22, this));
    }

    @Override // defpackage.rb0
    public final void ZpBGe2uQfcn8(defpackage.up0 up0Var, java.lang.Object obj) {
        obj.getClass();
        ((defpackage.l21) up0Var.JhCgjQRTAOCT).getClass();
        defpackage.ne neVar = this.ZpBGe2uQfcn8;
        neVar.getClass();
        neVar.JhCgjQRTAOCT(obj);
        defpackage.ne ZpBGe2uQfcn8 = defpackage.b41.ZpBGe2uQfcn8(obj.getClass());
        java.lang.String fWTAfUmVKrZq = ZpBGe2uQfcn8.fWTAfUmVKrZq();
        if (fWTAfUmVKrZq == null) {
            fWTAfUmVKrZq = java.lang.String.valueOf(ZpBGe2uQfcn8);
        }
        throw new defpackage.nc1("Serializer for subclass '" + fWTAfUmVKrZq + "' is not found " + ("in the polymorphic scope of '" + neVar.fWTAfUmVKrZq() + '\'') + ".\nCheck if class with serial name '" + fWTAfUmVKrZq + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + fWTAfUmVKrZq + "' has to be '@Serializable', and the base class '" + neVar.fWTAfUmVKrZq() + "' has to be sealed and '@Serializable'.");
    }

    @Override // defpackage.rb0
    public final defpackage.hc1 giKS3J6vZuNy() {
        return (defpackage.hc1) this.giKS3J6vZuNy.getValue();
    }

    public final java.lang.String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.ZpBGe2uQfcn8 + ')';
    }
}
