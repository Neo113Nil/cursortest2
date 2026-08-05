package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sw extends co implements zk {
    public final /* synthetic */ int MdtA4re8;
    public final /* synthetic */ ax wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw(ax axVar, int i) {
        super(1);
        this.MdtA4re8 = i;
        this.wxUZMvaN = axVar;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        int i = this.MdtA4re8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj2 = null;
        ax axVar = this.wxUZMvaN;
        switch (i) {
            case 0:
                ((l1) obj).getClass();
                q0 q0Var = axVar.NCTxEWno;
                ListIterator listIterator = q0Var.listIterator(q0Var.qoPGr6Ce());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((wi) previous).qoPGr6Ce) {
                            obj2 = previous;
                        }
                    }
                }
                axVar.MdtA4re8 = (wi) obj2;
                break;
            default:
                ((l1) obj).getClass();
                q0 q0Var2 = axVar.NCTxEWno;
                ListIterator listIterator2 = q0Var2.listIterator(q0Var2.qoPGr6Ce());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((wi) previous2).qoPGr6Ce) {
                            obj2 = previous2;
                        }
                    }
                }
                break;
        }
        return xe0Var;
    }
}
