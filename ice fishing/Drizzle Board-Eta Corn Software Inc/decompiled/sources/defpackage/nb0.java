package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nb0 implements k60 {
    public final zk MdtA4re8;
    public final k60 NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ nb0(k60 k60Var, zk zkVar, int i) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = k60Var;
        this.MdtA4re8 = zkVar;
    }

    @Override // defpackage.k60
    public final Iterator iterator() {
        switch (this.qoPGr6Ce) {
            case 0:
                return new vg(this);
            default:
                return new nd0(this);
        }
    }
}
