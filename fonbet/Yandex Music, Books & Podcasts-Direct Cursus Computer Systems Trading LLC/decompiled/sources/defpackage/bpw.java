package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class bpw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ epw b;

    public /* synthetic */ bpw(epw epwVar, int i) {
        this.a = i;
        this.b = epwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.j;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 1:
                this.b.b().a((qmw) obj);
                break;
            case 2:
                faq faqVar = (faq) obj;
                epw epwVar = this.b;
                tnl tnlVar = tnl.a;
                epw.c(epwVar, faqVar, false, 2);
                epw.c(epwVar, faqVar, false, 6);
                break;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rmw b = this.b.b();
                if (!booleanValue) {
                    b.c.V();
                } else if (!b.c.d.a()) {
                    b.c.g();
                    ox6.B(b.g, b.d, new lot(26, b));
                }
                epw.c(this.b, null, booleanValue, 5);
                break;
            default:
                epw epwVar2 = this.b;
                if (((Boolean) ((Pair) obj).b).booleanValue()) {
                    tnl tnlVar2 = tnl.a;
                    epw.c(epwVar2, null, false, 3);
                    epw.c(epwVar2, null, false, 7);
                }
                break;
        }
        return Unit.a;
    }
}
