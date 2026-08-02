package ru.yandex.logistics.care.ui;

import defpackage.g92;
import defpackage.jl40;
import defpackage.l7;
import defpackage.mvg;
import defpackage.nt8;
import defpackage.ny61;
import defpackage.ot8;
import defpackage.pt8;
import defpackage.rt8;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$special$$inlined$flatMapLatest$2", f = "CareWebViewViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class CareWebViewViewModelImpl$special$$inlined$flatMapLatest$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$special$$inlined$flatMapLatest$2(Continuation continuation, l lVar) {
        super(3, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CareWebViewViewModelImpl$special$$inlined$flatMapLatest$2 careWebViewViewModelImpl$special$$inlined$flatMapLatest$2 = new CareWebViewViewModelImpl$special$$inlined$flatMapLatest$2((Continuation) obj3, this.this$0);
        careWebViewViewModelImpl$special$$inlined$flatMapLatest$2.L$0 = (vpr) obj;
        careWebViewViewModelImpl$special$$inlined$flatMapLatest$2.L$1 = obj2;
        return careWebViewViewModelImpl$special$$inlined$flatMapLatest$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            pt8 pt8Var = (pt8) this.L$1;
            int i2 = 2;
            if (pt8Var instanceof nt8) {
                g92Var = new l7(i2, ((nt8) pt8Var).a.h, pt8Var, this.this$0);
            } else {
                if (!jl40.l(pt8Var, ot8.a)) {
                    w511.b();
                    return null;
                }
                g92Var = new g92(2, rt8.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
