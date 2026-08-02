package ru.yandex.taxi.requirements.ui.selector;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pjj0;
import defpackage.qjj0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectPresenter$attachView$2", f = "RequirementOptionsSelectPresenter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementOptionsSelectPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ pjj0 $mvpView;
    int label;
    final /* synthetic */ qjj0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectPresenter$attachView$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((pjj0) this.receiver).applyTheme((ThemeType) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementOptionsSelectPresenter$attachView$2(qjj0 qjj0Var, pjj0 pjj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qjj0Var;
        this.$mvpView = pjj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementOptionsSelectPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementOptionsSelectPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.this$0.y.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.$mvpView, pjj0.class, "applyTheme", "applyTheme(Lru/yandex/taxi/theme/ThemeType;)V", 4);
            this.label = 1;
            if (e.k(a, anonymousClass1, this) == coroutineSingletons) {
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
