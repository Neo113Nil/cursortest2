package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.dp01;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ri01;
import defpackage.tje;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.x8;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2", f = "TransferRequirementStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$1", f = "TransferRequirementStateInteractor.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $optionName;
        final /* synthetic */ String $requirementName;
        int label;
        final /* synthetic */ u0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u0 u0Var, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = u0Var;
            this.$requirementName = str;
            this.$optionName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$requirementName, this.$optionName, continuation);
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
                u0 u0Var = this.this$0;
                String str = this.$requirementName;
                String str2 = this.$optionName;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(new t0(new mth(new kotlinx.coroutines.flow.j0(null, u0Var.c.d(), new TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$withPreviousEmit$1(3, null)), 6), u0Var, str, str2), new TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$3(u0Var, null), this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$2", f = "TransferRequirementStateInteractor.kt", l = {110}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ String $optionName;
        final /* synthetic */ String $requirementName;
        int label;
        final /* synthetic */ u0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(u0 u0Var, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = u0Var;
            this.$requirementName = str;
            this.$optionName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$requirementName, this.$optionName, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                u0 u0Var = this.this$0;
                String str = this.$requirementName;
                String str2 = this.$optionName;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(vng.l(u0Var.c.d(), new ri01(29), vng.c), new TransferRequirementStateInteractor$subscribeSelectedTariffChanged$3(u0Var, str, str2, null), this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$3", f = "TransferRequirementStateInteractor.kt", l = {113}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ String $requirementName;
        int label;
        final /* synthetic */ u0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(u0 u0Var, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = u0Var;
            this.$requirementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$requirementName, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                u0 u0Var = this.this$0;
                String str = this.$requirementName;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(new mth(new kotlinx.coroutines.flow.j0(null, kotlinx.coroutines.flow.e.t(new r0(kotlinx.coroutines.flow.e.K(new n0(u0Var.f.a), new p0(((x8) u0Var.e).b)), u0Var, str)), new TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$withPreviousEmit$1(3, null)), 6), new TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$5(u0Var, null), this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$4", f = "TransferRequirementStateInteractor.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        final /* synthetic */ String $optionName;
        final /* synthetic */ String $requirementName;
        int label;
        final /* synthetic */ u0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(u0 u0Var, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = u0Var;
            this.$requirementName = str;
            this.$optionName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.this$0, this.$requirementName, this.$optionName, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                u0 u0Var = this.this$0;
                String str = this.$requirementName;
                String str2 = this.$optionName;
                this.label = 1;
                if (u0.b(u0Var, str, str2, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2 transferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2 = new TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2(this.this$0, continuation);
        transferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2.L$0 = obj;
        return transferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2 transferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2 = (TransferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferRequirementStateInteractor$subscribeRequirementAvailabilityParams$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = ((dp01) this.this$0.d()).c.d().d;
        String str2 = ((dp01) this.this$0.d()).c.d().e;
        zy11 zy11Var = zy11.a;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, str, str2, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, str, str2, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, str, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass4(this.this$0, str, str2, null), 3);
        }
        return zy11Var;
    }
}
