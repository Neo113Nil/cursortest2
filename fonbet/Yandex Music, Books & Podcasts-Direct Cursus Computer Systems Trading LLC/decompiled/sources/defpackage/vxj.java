package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class vxj extends qo4 {
    public final /* synthetic */ wxj b;

    public vxj(wxj wxjVar) {
        this.b = wxjVar;
    }

    @Override // defpackage.qo4
    public final void m(sgr sgrVar) {
        qxj qxjVar = this.b.a;
        boolean g = sgrVar.g();
        txj txjVar = qxjVar.a;
        if (txjVar.e == null && txjVar.f == null) {
            return;
        }
        aqd aqdVar = qxjVar.b;
        if (g) {
            ((AtomicLong) aqdVar.b).getAndIncrement();
        } else {
            ((AtomicLong) aqdVar.c).getAndIncrement();
        }
    }
}
