package ru.yandex.taxi.logistics.sdk;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.bi60;
import defpackage.mvg;
import defpackage.npe;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8g;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1", f = "LogisticsNotificationManagerDelegate.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    final /* synthetic */ npe $coreFeatures;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1$1", f = "LogisticsNotificationManagerDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ bi60 $notificationManager;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bi60 bi60Var, l lVar, Continuation continuation) {
            super(2, continuation);
            this.$notificationManager = bi60Var;
            this.this$0 = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$notificationManager, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            tje.N(tseVar, null, null, new LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$1(((com.yandex.delivery.utils.notificationmanager.impl.b) this.$notificationManager).b, null, this.this$0), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1(npe npeVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.$coreFeatures = npeVar;
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1(this.$coreFeatures, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogisticsNotificationManagerDelegate$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bi60 bi60Var = (bi60) ((y8g) this.$coreFeatures).b0.get();
            l lVar = this.this$0;
            Lifecycle lifecycle = lVar.b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bi60Var, lVar, null);
            this.L$0 = null;
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
