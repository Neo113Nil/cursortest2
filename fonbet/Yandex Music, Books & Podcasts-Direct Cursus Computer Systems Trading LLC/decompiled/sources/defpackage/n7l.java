package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class n7l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ xdh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7l(xdh xdhVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = xdhVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new n7l(this.k, continuation, 0);
            case 1:
                return new n7l(this.k, continuation, 1);
            case 2:
                return new n7l(this.k, continuation, 2);
            case 3:
                return new n7l(this.k, continuation, 3);
            case 4:
                return new n7l(this.k, continuation, 4);
            case 5:
                return new n7l(this.k, continuation, 5);
            case 6:
                return new n7l(this.k, continuation, 6);
            case 7:
                return new n7l(this.k, continuation, 7);
            default:
                return new n7l(this.k, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 1:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 2:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 3:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 4:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 5:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 6:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 7:
                ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            default:
                return ((n7l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Long l;
        int i = this.j;
        xdh xdhVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return new Long(Math.max(0L, ((xrb) xdhVar.a).t0()));
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                Long l2 = new Long(((xrb) xdhVar.a).getDuration());
                Long l3 = l2.longValue() != -9223372036854775807L ? l2 : null;
                return new Long(l3 != null ? l3.longValue() : -1L);
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                xrb xrbVar = (xrb) xdhVar.a;
                int c = xrbVar.V().c(false);
                sis V = xrbVar.V();
                if (V.p()) {
                    V = null;
                }
                ris m = V != null ? V.m(c, (ris) xdhVar.d, 0L) : null;
                if (m != null && m.i && m.h) {
                    r1 = dvt.m0(m.l);
                }
                return new Long(r1);
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return new Float(((xrb) xdhVar.a).m().a);
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return new Long(Math.max(0L, ((xrb) xdhVar.a).J0()));
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                xrb xrbVar2 = (xrb) xdhVar.a;
                Object S0 = xrbVar2.S0();
                if (S0 instanceof d97) {
                    l = new Long(((d97) S0).h);
                } else {
                    int v0 = xrbVar2.v0();
                    sis V2 = xrbVar2.V();
                    if (V2.p()) {
                        V2 = null;
                    }
                    ris m2 = V2 != null ? V2.m(v0, (ris) xdhVar.d, 0L) : null;
                    l = m2 != null ? new Long(m2.f) : null;
                }
                Long l4 = (l == null || l.longValue() != -9223372036854775807L) ? l : null;
                return new Long(l4 != null ? l4.longValue() : 0L);
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                xrb xrbVar3 = (xrb) xdhVar.a;
                xrbVar3.N1();
                return new Float(xrbVar3.Z);
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                ((xrb) xdhVar.a).N1();
                return Boolean.FALSE;
            default:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(((xrb) xdhVar.a).e());
        }
    }
}
