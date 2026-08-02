package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class hkt extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jkt l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hkt(jkt jktVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = jktVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hkt(this.l, continuation, 0);
            case 1:
                return new hkt(this.l, continuation, 1);
            case 2:
                return new hkt(this.l, continuation, 2);
            default:
                return new hkt(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((hkt) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (jkt.a(this.l, this) == nm6Var) {
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
                    jkt jktVar = this.l;
                    mjt mjtVar = jktVar.d;
                    gjt gjtVar = jktVar.b;
                    String str = gjtVar.a;
                    String str2 = gjtVar.b;
                    ujt ujtVar = jktVar.c;
                    this.k = 1;
                    Object a = mjtVar.a(str, str2, ujtVar, 100, this);
                    if (a == nm6Var2) {
                        break;
                    }
                } else {
                    if (i2 == 1) {
                        qgg.h0(obj);
                    } else {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        obj = null;
                    }
                    break;
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                jkt jktVar2 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (jkt.a(jktVar2, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                xdr xdrVar = jktVar2.g;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (jkt.a(this.l, this) == nm6Var4) {
                    }
                } else if (i4 != 1) {
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
