package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ko implements defpackage.a91 {
    public final /* synthetic */ defpackage.lo ZpBGe2uQfcn8;

    public ko(defpackage.lo loVar) {
        this.ZpBGe2uQfcn8 = loVar;
    }

    @Override // defpackage.a91
    public final float ZpBGe2uQfcn8(float f) {
        if (java.lang.Float.isNaN(f)) {
            return 0.0f;
        }
        defpackage.lo loVar = this.ZpBGe2uQfcn8;
        float floatValue = ((java.lang.Number) loVar.ZpBGe2uQfcn8.P05cfTpS5W5L(java.lang.Float.valueOf(f))).floatValue();
        loVar.WDYagTQQm9ns.setValue(java.lang.Boolean.valueOf(floatValue > 0.0f));
        loVar.oh71FJcDz6S2.setValue(java.lang.Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
