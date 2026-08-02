package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class urr extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ bsr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ urr(int i, bsr bsrVar, Continuation continuation) {
        super(2, continuation);
        this.j = i;
        this.k = bsrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new urr(0, this.k, continuation);
            default:
                return new urr(1, this.k, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((urr) create((mns) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((urr) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        bsr bsrVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
        }
        return Boolean.valueOf(!bsrVar.f.get());
    }
}
