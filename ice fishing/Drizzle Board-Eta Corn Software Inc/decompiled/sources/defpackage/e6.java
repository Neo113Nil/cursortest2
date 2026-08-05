package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e6 implements k60 {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ e6(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    @Override // defpackage.k60
    public final Iterator iterator() {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            default:
                return (Iterator) obj;
        }
    }
}
