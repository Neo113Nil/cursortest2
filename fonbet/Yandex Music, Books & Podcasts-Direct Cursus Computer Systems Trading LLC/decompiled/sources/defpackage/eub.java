package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class eub extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ kub l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eub(kub kubVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = kubVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new eub(this.l, continuation, 0);
            case 1:
                return new eub(this.l, continuation, 1);
            default:
                return new eub(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((eub) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = this.l.n;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (x0qVar.emit(unit, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(10000L, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                kub kubVar = this.l;
                rnl rnlVar = (rnl) kubVar.h.a.getValue();
                if (rnlVar != null) {
                    if (rnlVar.g != null && ((v7l) kubVar.j.a.getValue()).a) {
                        xdr xdrVar = kubVar.m;
                        Object value = xdrVar.getValue();
                        s3h s3hVar = value instanceof s3h ? (s3h) value : null;
                        if (s3hVar != null) {
                            s3h a = s3h.a(s3hVar, null, true, 3);
                            xdrVar.getClass();
                            xdrVar.m(null, a);
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(5000L, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                kub kubVar2 = this.l;
                rnl rnlVar2 = (rnl) kubVar2.h.a.getValue();
                if (rnlVar2 != null) {
                    if (rnlVar2.g != null && ((v7l) kubVar2.j.a.getValue()).a) {
                        xdr xdrVar2 = kubVar2.m;
                        Object value2 = xdrVar2.getValue();
                        s3h s3hVar2 = value2 instanceof s3h ? (s3h) value2 : null;
                        if (s3hVar2 != null) {
                            s3h a2 = s3h.a(s3hVar2, a3h.b, false, 5);
                            xdrVar2.getClass();
                            xdrVar2.m(null, a2);
                        }
                    }
                    break;
                } else {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
