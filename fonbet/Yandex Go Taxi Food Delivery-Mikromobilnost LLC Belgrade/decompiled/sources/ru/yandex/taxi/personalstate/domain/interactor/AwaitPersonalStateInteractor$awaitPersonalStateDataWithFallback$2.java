package ru.yandex.taxi.personalstate.domain.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.personalstate.domain.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lj6b0;", "<anonymous>", "(Ltse;)Lj6b0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.domain.interactor.AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2", f = "AwaitPersonalStateInteractor.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2 extends SuspendLambda implements wls {
    final /* synthetic */ Zone $zone;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isFirstPersonalStateDataHandledState", "Lp6b0;", "personalStateLoadingState", "Lj6b0;", "<anonymous>", "(ZLp6b0;)Lj6b0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.personalstate.domain.interactor.AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2$1", f = "AwaitPersonalStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.personalstate.domain.interactor.AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ Zone $zone;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Zone zone, Continuation continuation) {
            super(3, continuation);
            this.$zone = zone;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$zone, (Continuation) obj3);
            anonymousClass1.Z$0 = booleanValue;
            anonymousClass1.L$0 = (p6b0) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Zone zone;
            Zone zone2;
            boolean z = this.Z$0;
            p6b0 p6b0Var = (p6b0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (!z || ((zone = this.$zone) != null && ((zone2 = p6b0Var.b.b) == null || !zone2.i(zone)))) {
                return null;
            }
            return p6b0Var.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2(e eVar, Zone zone, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$zone = zone;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2(this.this$0, this.$zone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AwaitPersonalStateInteractor$awaitPersonalStateDataWithFallback$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o oVar = this.this$0.a;
        mth mthVar = new mth(new m0(oVar.w, new d(oVar.x), new AnonymousClass1(this.$zone, null)), 6);
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(mthVar, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
