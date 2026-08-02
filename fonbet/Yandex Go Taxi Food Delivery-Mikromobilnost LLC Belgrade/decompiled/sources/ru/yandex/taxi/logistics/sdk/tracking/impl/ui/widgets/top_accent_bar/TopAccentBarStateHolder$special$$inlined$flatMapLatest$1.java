package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar;

import defpackage.ari;
import defpackage.fzw;
import defpackage.g92;
import defpackage.gri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t701;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.TopAccentBarStateHolder$special$$inlined$flatMapLatest$1", f = "TopAccentBarStateHolder.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TopAccentBarStateHolder$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAccentBarStateHolder$special$$inlined$flatMapLatest$1(Continuation continuation, e eVar) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TopAccentBarStateHolder$special$$inlined$flatMapLatest$1 topAccentBarStateHolder$special$$inlined$flatMapLatest$1 = new TopAccentBarStateHolder$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        topAccentBarStateHolder$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        topAccentBarStateHolder$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return topAccentBarStateHolder$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            t701 t701Var = (t701) this.L$1;
            e eVar = this.this$0;
            gri griVar = t701Var.a;
            int i2 = e.e;
            eVar.getClass();
            tpr fzwVar = griVar.x instanceof ari ? new fzw(26, eVar.b.a(e.d), griVar) : new g92(2, griVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(fzwVar, vprVar, this) == coroutineSingletons) {
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
