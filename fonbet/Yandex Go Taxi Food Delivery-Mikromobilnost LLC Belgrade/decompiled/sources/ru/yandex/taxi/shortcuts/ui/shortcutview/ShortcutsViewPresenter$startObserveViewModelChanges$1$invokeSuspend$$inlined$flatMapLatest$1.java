package ru.yandex.taxi.shortcuts.ui.shortcutview;

import defpackage.d4s0;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w201;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ShortcutsViewPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, f fVar) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1 shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1 = new ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d4s0 d4s0Var = (d4s0) obj2;
            List list = d4s0Var.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof w201) {
                    arrayList.add(obj3);
                }
            }
            f fVar = this.this$0;
            fVar.getClass();
            e eVar = new e(arrayList.isEmpty() ? new g92(2, d4s0Var) : new c(fVar.R.a(arrayList), d4s0Var), arrayList);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(eVar, vprVar, this) == coroutineSingletons) {
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
