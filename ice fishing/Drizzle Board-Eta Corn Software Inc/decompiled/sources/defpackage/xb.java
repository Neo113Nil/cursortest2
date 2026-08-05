package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xb implements k60 {
    public final ll MdtA4re8;
    public final Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public xb(CharSequence charSequence, kx kxVar) {
        this.qoPGr6Ce = 0;
        charSequence.getClass();
        this.NCTxEWno = charSequence;
        this.MdtA4re8 = kxVar;
    }

    @Override // defpackage.k60
    public final Iterator iterator() {
        switch (this.qoPGr6Ce) {
            case 0:
                return new wb(this);
            case 1:
                return new vg(this);
            default:
                return new wl(this);
        }
    }

    public /* synthetic */ xb(Object obj, zk zkVar, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
        this.MdtA4re8 = zkVar;
    }
}
