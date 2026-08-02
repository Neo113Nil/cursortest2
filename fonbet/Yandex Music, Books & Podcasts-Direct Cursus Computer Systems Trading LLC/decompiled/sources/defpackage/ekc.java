package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ekc extends aur implements pyc {
    public final /* synthetic */ int j = 1;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekc(Continuation continuation, nsl nslVar, long j) {
        super(3, continuation);
        this.o = nslVar;
        this.n = j;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                ekc ekcVar = new ekc((Function1) this.o, this.n, continuation);
                ekcVar.l = rjcVar;
                ekcVar.m = obj2;
                return ekcVar.invokeSuspend(Unit.a);
            default:
                ekc ekcVar2 = new ekc(continuation, (nsl) this.o, this.n);
                ekcVar2.l = rjcVar;
                ekcVar2.m = obj2;
                return ekcVar2.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (r0.emit(r4, r11) == r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        if (defpackage.y2x.o(r8, r11) == r5) goto L38;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eno b;
        switch (this.j) {
            case 0:
                rjc rjcVar = this.l;
                Object obj2 = this.m;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    if (((Boolean) ((Function1) this.o).invoke(obj2)).booleanValue()) {
                        long j = this.n;
                        this.l = rjcVar;
                        this.m = obj2;
                        this.k = 1;
                        break;
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.l = null;
                this.m = null;
                this.k = 2;
                break;
            default:
                l18 l18Var = l18.b;
                long j2 = this.n;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    u0j u0jVar = ((x66) this.m).b;
                    u0j u0jVar2 = u0j.a;
                    nsl nslVar = (nsl) this.o;
                    Continuation continuation = null;
                    if (u0jVar == u0jVar2) {
                        klg a = nslVar.a();
                        a.getClass();
                        jyr jyrVar = i2q.e;
                        if (lsq.v()) {
                            bdt I = hag.I(frt.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            ((frt) qdcVar.C(I)).c().a.getClass();
                            xlg a2 = a.a();
                            a2.getClass();
                            b = a2.g(new plg(a2, j2, continuation, 1));
                        } else {
                            b = klg.b(new jlg(a, j2, continuation, 1));
                        }
                    } else {
                        klg a3 = nslVar.a();
                        a3.getClass();
                        jyr jyrVar2 = i2q.e;
                        if (lsq.v()) {
                            bdt I2 = hag.I(frt.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            ((frt) qdcVar2.C(I2)).c().a.getClass();
                            xlg a4 = a3.a();
                            a4.getClass();
                            b = a4.g(new plg(a4, j2, continuation, 0));
                        } else {
                            b = klg.b(new jlg(a3, j2, continuation, 0));
                        }
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, b, this) == nm6Var2) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekc(Function1 function1, long j, Continuation continuation) {
        super(3, continuation);
        this.o = function1;
        this.n = j;
    }
}
