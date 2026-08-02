package ru.yandex.taxi.shortcuts.ui.shortcutview;

import com.yandex.go.shortcuts.models.LoadingMode;
import defpackage.c3s0;
import defpackage.e6v;
import defpackage.ga5;
import defpackage.k4s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsViewPresenter$onItemClick$1", f = "ShortcutsViewPresenter.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShortcutsViewPresenter$onItemClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ e6v $identifiable;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsViewPresenter$onItemClick$1(f fVar, e6v e6vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$identifiable = e6vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutsViewPresenter$onItemClick$1(this.this$0, this.$identifiable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutsViewPresenter$onItemClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            com.yandex.go.shortcuts.impl.b bVar = fVar.O;
            e6v e6vVar = this.$identifiable;
            LoadingMode Ab = ((c3s0) fVar.Dg()).Ab();
            k4s0 k4s0Var = new k4s0(this.this$0);
            this.label = 1;
            if (bVar.d(e6vVar, Ab, k4s0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (this.$identifiable instanceof ga5) {
            ((c3s0) this.this$0.Dg()).a3((ga5) this.$identifiable);
        }
        return zy11.a;
    }
}
