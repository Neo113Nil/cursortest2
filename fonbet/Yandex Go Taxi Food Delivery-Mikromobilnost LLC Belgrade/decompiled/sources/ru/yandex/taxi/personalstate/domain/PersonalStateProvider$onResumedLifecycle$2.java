package ru.yandex.taxi.personalstate.domain;

import defpackage.a7b0;
import defpackage.d7b0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yk;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2", f = "PersonalStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersonalStateProvider$onResumedLifecycle$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2$1", f = "PersonalStateProvider.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, o oVar) {
            super(2, continuation);
            this.this$0 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation, this.this$0);
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
                o oVar = this.this$0;
                this.label = 1;
                Set set = o.y;
                if (new kotlinx.coroutines.flow.o(new m0(new m0(new mth(oVar.d.r, 6), oVar.f(), new PersonalStateProvider$authorizedWithTokenZoneFlow$1(3, null)), com.yandex.go.coroutines.b.d(oVar.v, new PersonalStateProvider$subscribeFetchPersonalStateTriggers$$inlined$start$1(2, null)), new PersonalStateProvider$subscribeFetchPersonalStateTriggers$3(3, null)), new PersonalStateProvider$subscribeFetchPersonalStateTriggers$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new a7b0(oVar, 0), this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2$2", f = "PersonalStateProvider.kt", l = {110}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, o oVar) {
            super(2, continuation);
            this.this$0 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                o oVar = this.this$0;
                this.label = 1;
                if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new h(oVar.l.a), new j(new com.yandex.go.requirements.comment.repositories.b(oVar.n.c)), new l(new f(kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) oVar.i).j.b(), new yk(18))))}, 3)), new PersonalStateProvider$subscribeSavePersonalStateTriggers$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new a7b0(oVar, i2), this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2$3", f = "PersonalStateProvider.kt", l = {111}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.personalstate.domain.PersonalStateProvider$onResumedLifecycle$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Continuation continuation, o oVar) {
            super(2, continuation);
            this.this$0 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(continuation, this.this$0);
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
                o oVar = this.this$0;
                this.label = 1;
                if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.X(new m0(oVar.t, new m0(new mth(oVar.d.r, 6), oVar.f(), new PersonalStateProvider$authorizedWithTokenZoneFlow$1(3, null)), new PersonalStateProvider$requestPatchPreconditionsFlow$1(3, null)), new PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$flatMapLatest$1(null, oVar)), new PersonalStateProvider$subscribeRequestPatchPersonalState$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new d7b0(), this) == coroutineSingletons) {
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
    public PersonalStateProvider$onResumedLifecycle$2(Continuation continuation, o oVar) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PersonalStateProvider$onResumedLifecycle$2 personalStateProvider$onResumedLifecycle$2 = new PersonalStateProvider$onResumedLifecycle$2(continuation, this.this$0);
        personalStateProvider$onResumedLifecycle$2.L$0 = obj;
        return personalStateProvider$onResumedLifecycle$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalStateProvider$onResumedLifecycle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tje.N(tseVar, null, null, new AnonymousClass1(null, this.this$0), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(null, this.this$0), 3);
        return tje.N(tseVar, null, null, new AnonymousClass3(null, this.this$0), 3);
    }
}
