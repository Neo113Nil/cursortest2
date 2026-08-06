package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xj extends defpackage.dc {
    public final defpackage.zb ZVVdXbWmyCSK;

    public xj(int i, defpackage.zb zbVar) {
        super(i);
        this.ZVVdXbWmyCSK = zbVar;
        if (zbVar == defpackage.zb.WDYagTQQm9ns) {
            defpackage.p81.JhCgjQRTAOCT("This implementation does not support suspension for senders, use ", defpackage.b41.ZpBGe2uQfcn8(defpackage.dc.class).fWTAfUmVKrZq(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        defpackage.p81.fWTAfUmVKrZq("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    public final java.lang.Object OVwOqzUGHcCU(java.lang.Object obj, boolean z) {
        if (this.ZVVdXbWmyCSK != defpackage.zb.QiMR8OkAhezm) {
            return xahdJg25P1Bv(obj);
        }
        java.lang.Object fWTAfUmVKrZq = super.fWTAfUmVKrZq(obj);
        return (!(fWTAfUmVKrZq instanceof defpackage.zd) || (fWTAfUmVKrZq instanceof defpackage.yd)) ? fWTAfUmVKrZq : defpackage.gs1.ZpBGe2uQfcn8;
    }

    @Override // defpackage.dc, defpackage.bc1
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.kl klVar, java.lang.Object obj) {
        if (OVwOqzUGHcCU(obj, true) instanceof defpackage.yd) {
            throw BHfvd2J71qpO();
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }

    @Override // defpackage.dc
    public final boolean blKFvluuDQOf() {
        return this.ZVVdXbWmyCSK == defpackage.zb.oh71FJcDz6S2;
    }

    @Override // defpackage.dc, defpackage.bc1
    public final java.lang.Object fWTAfUmVKrZq(java.lang.Object obj) {
        return OVwOqzUGHcCU(obj, false);
    }
}
