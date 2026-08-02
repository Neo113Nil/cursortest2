package ru.yandex.taxi.scooters.presentation.finish_info;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.gci0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.wls;
import defpackage.wmn0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.experiments.FinishCard;
import ru.yandex.taxi.scooters.experiments.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1", f = "ScootersFinishInfoPresenter.kt", l = {144}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1$1", f = "ScootersFinishInfoPresenter.kt", l = {152}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ FinishCard $finishCardExperiment;
        int label;
        final /* synthetic */ d this$0;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljwo0;", "<unused var>", "", "currentRating", "Lzy11;", "<anonymous>", "(Ljwo0;I)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1$1$1", f = "ScootersFinishInfoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C01161 extends SuspendLambda implements zls {
            final /* synthetic */ FinishCard $finishCardExperiment;
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01161(d dVar, FinishCard finishCard, Continuation continuation) {
                super(3, continuation);
                this.this$0 = dVar;
                this.$finishCardExperiment = finishCard;
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int intValue = ((Number) obj2).intValue();
                C01161 c01161 = new C01161(this.this$0, this.$finishCardExperiment, (Continuation) obj3);
                c01161.I$0 = intValue;
                zy11 zy11Var = zy11.a;
                c01161.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.I$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                wmn0 wmn0Var = (wmn0) this.this$0.Dg();
                FinishCard finishCard = this.$finishCardExperiment;
                boolean z = false;
                if (finishCard != null && finishCard.f.contains(new Integer(i))) {
                    z = true;
                }
                wmn0Var.qg(z);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, FinishCard finishCard, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$finishCardExperiment = finishCard;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$finishCardExperiment, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                m0 m0Var = new m0(new mth(kotlinx.coroutines.flow.e.d((r0) this.this$0.O.e.w), 6), new ru.yandex.taxi.scooters.presentation.feedback.domain.b(kotlinx.coroutines.flow.e.d((r0) this.this$0.O.e.x)), new C01161(this.this$0, this.$finishCardExperiment, null));
                this.label = 1;
                if (kotlinx.coroutines.flow.e.j(m0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1$2", f = "ScootersFinishInfoPresenter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ FinishCard $finishCardExperiment;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, FinishCard finishCard, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$finishCardExperiment = finishCard;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$finishCardExperiment, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                gci0 d = kotlinx.coroutines.flow.e.d((r0) this.this$0.O.e.w);
                p9g0 p9g0Var = new p9g0(7, this.this$0, this.$finishCardExperiment);
                this.label = 1;
                Object collect = d.collect(new h0(p9g0Var), this);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    collect = zy11Var;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1 scootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1 = new ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1(this.this$0, continuation);
        scootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1.L$0 = obj;
        return scootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoPresenter$listenSpecifiedFeedbackSettings$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ukn0 ukn0Var = this.this$0.z;
            this.L$0 = tseVar;
            this.label = 1;
            obj = ukn0Var.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        FinishCard finishCard = ((g0) obj).h;
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, finishCard, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, finishCard, null), 3);
        return zy11.a;
    }
}
