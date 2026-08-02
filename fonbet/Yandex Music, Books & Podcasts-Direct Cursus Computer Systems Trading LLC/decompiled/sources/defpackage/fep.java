package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fep extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xep s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fep(xep xepVar, int i) {
        super(1);
        this.r = i;
        this.s = xepVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xdp xdpVar;
        xdp xdpVar2;
        boolean z;
        switch (this.r) {
            case 0:
                return new hi(15, this.s);
            case 1:
                long longValue = ((Number) obj).longValue();
                xep xepVar = this.s;
                if (xepVar.a.a().b(longValue)) {
                    xepVar.o();
                    xepVar.q();
                }
                return Unit.a;
            case 2:
                long longValue2 = ((Number) obj).longValue();
                xep xepVar2 = this.s;
                if (xepVar2.a.a().b(longValue2)) {
                    xepVar2.i();
                    xepVar2.m(null);
                }
                return Unit.a;
            case 3:
                long longValue3 = ((Number) obj).longValue();
                xep xepVar3 = this.s;
                ydp e = xepVar3.e();
                if (e != null && (xdpVar2 = e.a) != null && longValue3 == xdpVar2.c) {
                    xepVar3.n.setValue(null);
                }
                ydp e2 = xepVar3.e();
                if (e2 != null && (xdpVar = e2.b) != null && longValue3 == xdpVar.c) {
                    xepVar3.o.setValue(null);
                }
                if (xepVar3.a.a().b(longValue3)) {
                    xepVar3.q();
                }
                return Unit.a;
            case 4:
                wof wofVar = (wof) obj;
                xep xepVar4 = this.s;
                xepVar4.k = wofVar;
                if (((Boolean) xepVar4.i.getValue()).booleanValue() && xepVar4.e() != null) {
                    enj enjVar = wofVar != null ? new enj(wofVar.A(0L)) : null;
                    if (!Intrinsics.d(xepVar4.j, enjVar)) {
                        xepVar4.j = enjVar;
                        xepVar4.o();
                        xepVar4.q();
                    }
                }
                return Unit.a;
            case 5:
                bpc bpcVar = (bpc) obj;
                xep xepVar5 = this.s;
                x6k x6kVar = xepVar5.i;
                if (!bpcVar.a() && ((Boolean) x6kVar.getValue()).booleanValue()) {
                    xepVar5.i();
                }
                x6kVar.setValue(Boolean.valueOf(bpcVar.a()));
                return Unit.a;
            case 6:
                this.s.l(((Boolean) obj).booleanValue());
                return Unit.a;
            case 7:
                if (ox6.h.v(((qaf) obj).a) == iaf.COPY) {
                    this.s.b();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                this.s.m((ydp) obj);
                return Unit.a;
        }
    }
}
