package ru.yandex.taxi.requirements.ui.selector.usual;

import defpackage.jmw0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov21;
import defpackage.qv21;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorPresenter$attachView$1", f = "UsualOptionSelectorPresenter.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class UsualOptionSelectorPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ov21 $mvpView;
    int label;
    final /* synthetic */ qv21 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljmw0;", "requirement", "Lzy11;", "<unused var>", "<anonymous>", "(Lcom/yandex/go/requirements/api/domain/model/SupportedRequirement$OptionsRequirement;V)Lcom/yandex/go/requirements/api/domain/model/SupportedRequirement$OptionsRequirement;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorPresenter$attachView$1$1", f = "UsualOptionSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (jmw0) obj;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            jmw0 jmw0Var = (jmw0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return jmw0Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ltf70;", "models", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorPresenter$attachView$1$3", f = "UsualOptionSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorPresenter$attachView$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ ov21 $mvpView;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ qv21 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(qv21 qv21Var, ov21 ov21Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = qv21Var;
            this.$mvpView = ov21Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$mvpView, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((List) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.E = list;
            this.$mvpView.render(list);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsualOptionSelectorPresenter$attachView$1(qv21 qv21Var, ov21 ov21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qv21Var;
        this.$mvpView = ov21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UsualOptionSelectorPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UsualOptionSelectorPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qv21 qv21Var = this.this$0;
            tpr t = e.t(new b(new m0(new mth(qv21Var.D, 6), qv21Var.z.b(), new AnonymousClass1(3, null)), this.this$0));
            this.this$0.x.getClass();
            tpr F = e.F(t, uyj.a);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$mvpView, null);
            this.label = 1;
            if (e.k(F, anonymousClass3, this) == coroutineSingletons) {
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
