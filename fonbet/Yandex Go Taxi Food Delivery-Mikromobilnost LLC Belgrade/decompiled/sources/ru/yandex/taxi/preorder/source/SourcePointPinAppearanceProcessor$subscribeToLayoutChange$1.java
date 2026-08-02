package ru.yandex.taxi.preorder.source;

import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.w29;
import defpackage.wls;
import defpackage.yg6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1", f = "SourcePointPinAppearanceProcessor.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $runnable;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1(View view, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$view = view;
        this.$runnable = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1(this.$view, this.$runnable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.b g = kotlinx.coroutines.flow.e.g(new SourcePointPinAppearanceProcessor$subscribeToLayoutChange$1$invokeSuspend$$inlined$simpleCallbackApiToFlow$1(new w29(this.$view, 11), null));
            yg6 yg6Var = new yg6(1, this.$runnable);
            this.label = 1;
            if (g.collect(yg6Var, this) == coroutineSingletons) {
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
