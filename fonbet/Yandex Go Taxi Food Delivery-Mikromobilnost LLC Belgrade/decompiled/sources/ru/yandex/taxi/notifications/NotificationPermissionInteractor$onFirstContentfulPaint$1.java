package ru.yandex.taxi.notifications;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xi60;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.notifications.NotificationPermissionInteractor$onFirstContentfulPaint$1", f = "NotificationPermissionInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class NotificationPermissionInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ xi60 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.notifications.NotificationPermissionInteractor$onFirstContentfulPaint$1$1", f = "NotificationPermissionInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.notifications.NotificationPermissionInteractor$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ xi60 this$0;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: ru.yandex.taxi.notifications.NotificationPermissionInteractor$onFirstContentfulPaint$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        final /* synthetic */ class C01081 extends AdaptedFunctionReference implements zls {
            public static final C01081 a = new C01081(3, 4, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new Pair((hl3) obj, bool);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xi60 xi60Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = xi60Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                xi60 xi60Var = this.this$0;
                tpr t = kotlinx.coroutines.flow.e.t(new m0(xi60Var.c.f, (e) xi60Var.f.c, C01081.a));
                xi60 xi60Var2 = this.this$0;
                o oVar = new o(t, new NotificationPermissionInteractor$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                ocz oczVar = new ocz(17, xi60Var2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(oczVar, this) == coroutineSingletons) {
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
    public NotificationPermissionInteractor$onFirstContentfulPaint$1(xi60 xi60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xi60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationPermissionInteractor$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationPermissionInteractor$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xi60 xi60Var = this.this$0;
            Lifecycle lifecycle = xi60Var.g;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(xi60Var, null);
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
