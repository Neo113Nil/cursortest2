package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pt implements k3, qh0 {
    public final /* synthetic */ qt MdtA4re8;
    public final m3 NCTxEWno;

    public pt(qt qtVar, m3 m3Var) {
        this.MdtA4re8 = qtVar;
        this.NCTxEWno = m3Var;
    }

    @Override // defpackage.g9
    public final void P7K7Inc8(Object obj) {
        this.NCTxEWno.P7K7Inc8(obj);
    }

    @Override // defpackage.k3
    public final void jb9XjC4I(Object obj, el elVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qt.eVhOlqcC;
        qt qtVar = this.MdtA4re8;
        atomicReferenceFieldUpdater.set(qtVar, null);
        b2ZJblxo b2zjblxo = new b2ZJblxo(qtVar, this);
        m3 m3Var = this.NCTxEWno;
        m3Var.lwWCatUu(xe0.qoPGr6Ce, m3Var.wxUZMvaN, new l3(0, b2zjblxo));
    }

    @Override // defpackage.k3
    public final lf k3x7lurq(Object obj, el elVar) {
        qt qtVar = this.MdtA4re8;
        l3 l3Var = new l3(qtVar, this);
        lf k3x7lurq = this.NCTxEWno.k3x7lurq((xe0) obj, l3Var);
        if (k3x7lurq != null) {
            qt.eVhOlqcC.set(qtVar, null);
        }
        return k3x7lurq;
    }

    @Override // defpackage.qh0
    public final void qoPGr6Ce(b60 b60Var, int i) {
        this.NCTxEWno.qoPGr6Ce(b60Var, i);
    }

    @Override // defpackage.g9
    public final l9 wxUZMvaN() {
        return this.NCTxEWno.P7K7Inc8;
    }

    @Override // defpackage.k3
    public final void ygLcUYwZ(Object obj) {
        this.NCTxEWno.ygLcUYwZ(obj);
    }
}
