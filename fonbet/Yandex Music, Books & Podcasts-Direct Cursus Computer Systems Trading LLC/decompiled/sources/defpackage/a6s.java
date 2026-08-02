package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a6s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ pqm k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6s(pqm pqmVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = pqmVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a6s(this.k, continuation, 0);
            case 1:
                return new a6s(this.k, continuation, 1);
            case 2:
                return new a6s(this.k, continuation, 2);
            case 3:
                return new a6s(this.k, continuation, 3);
            case 4:
                return new a6s(this.k, continuation, 4);
            case 5:
                return new a6s(this.k, continuation, 5);
            case 6:
                return new a6s(this.k, continuation, 6);
            default:
                return new a6s(this.k, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a6s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        pqm pqmVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                pqmVar.b();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                pqmVar.c();
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                pqmVar.c();
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                pqmVar.b();
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                pqmVar.c();
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                pqmVar.c();
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                pqmVar.b();
                break;
            default:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                pqmVar.c();
                break;
        }
        return Unit.a;
    }
}
