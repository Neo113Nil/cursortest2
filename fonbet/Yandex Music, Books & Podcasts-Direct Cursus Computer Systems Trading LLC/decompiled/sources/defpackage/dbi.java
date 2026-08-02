package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class dbi extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ bci l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dbi(bci bciVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bciVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new dbi(this.l, continuation, 0);
            case 1:
                return new dbi(this.l, continuation, 1);
            case 2:
                return new dbi(this.l, continuation, 2);
            case 3:
                return new dbi(this.l, continuation, 3);
            default:
                return new dbi(this.l, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((dbi) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object a2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.d(this) == nm6Var) {
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
                    if (this.l.d(this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.d(this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                Object obj2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    bci bciVar = this.l;
                    j9h e = bciVar.b.e();
                    cci cciVar = cci.b;
                    if (e.a.containsKey(cciVar)) {
                        a = bci.a(bciVar, cciVar, this);
                        if (a != obj2) {
                            a = Unit.a;
                        }
                    } else {
                        a = Unit.a;
                    }
                    if (a == obj2) {
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    bci bciVar2 = this.l;
                    j9h e2 = bciVar2.b.e();
                    cci cciVar2 = cci.c;
                    if (e2.a.containsKey(cciVar2)) {
                        a2 = bci.a(bciVar2, cciVar2, this);
                        if (a2 != obj3) {
                            a2 = Unit.a;
                        }
                    } else {
                        a2 = Unit.a;
                    }
                    if (a2 == obj3) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
