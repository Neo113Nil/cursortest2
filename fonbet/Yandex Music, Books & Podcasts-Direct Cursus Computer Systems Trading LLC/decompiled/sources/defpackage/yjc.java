package defpackage;

import com.yandex.passport.common.mvi.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yjc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ aur n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yjc(pjc pjcVar, pyc pycVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        switch (i) {
            case 1:
                this.m = pjcVar;
                this.n = (aur) pycVar;
                super(2, continuation);
                break;
            case 2:
                this.m = pjcVar;
                this.n = (aur) pycVar;
                super(2, continuation);
                break;
            default:
                this.m = pjcVar;
                this.n = (aur) pycVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                yjc yjcVar = new yjc(this.m, this.n, continuation, 0);
                yjcVar.l = obj;
                return yjcVar;
            case 1:
                yjc yjcVar2 = new yjc(this.m, this.n, continuation, 1);
                yjcVar2.l = obj;
                return yjcVar2;
            default:
                yjc yjcVar3 = new yjc(this.m, this.n, continuation, 2);
                yjcVar3.l = obj;
                return yjcVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((yjc) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((yjc) create((pjq) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((yjc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    xqn xqnVar = new xqn();
                    xqnVar.a = quj.f;
                    tl0 tl0Var = new tl0(xqnVar, (pyc) this.n, rjcVar);
                    this.k = 1;
                    if (this.m.collect(tl0Var, this) == nm6Var) {
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
                    akc akcVar = new akc((pyc) this.n, new i64((pjq) this.l), (Continuation) null);
                    this.k = 1;
                    if (zsd.O(this.m, akcVar, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    c cVar = new c((pyc) this.n, mm6Var);
                    this.l = null;
                    this.k = 1;
                    if (this.m.collect(cVar, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
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
