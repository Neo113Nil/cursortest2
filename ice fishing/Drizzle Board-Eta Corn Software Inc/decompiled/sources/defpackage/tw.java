package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tw extends co implements ok {
    public final /* synthetic */ int MdtA4re8;
    public final /* synthetic */ ax wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw(ax axVar, int i) {
        super(0);
        this.MdtA4re8 = i;
        this.wxUZMvaN = axVar;
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        Object obj;
        int i = this.MdtA4re8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        ax axVar = this.wxUZMvaN;
        switch (i) {
            case 0:
                axVar.NCTxEWno();
                break;
            case 1:
                q0 q0Var = axVar.NCTxEWno;
                ListIterator listIterator = q0Var.listIterator(q0Var.qoPGr6Ce());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((wi) obj).qoPGr6Ce) {
                        }
                    } else {
                        obj = null;
                    }
                }
                axVar.MdtA4re8 = null;
                break;
            default:
                axVar.NCTxEWno();
                break;
        }
        return xe0Var;
    }
}
