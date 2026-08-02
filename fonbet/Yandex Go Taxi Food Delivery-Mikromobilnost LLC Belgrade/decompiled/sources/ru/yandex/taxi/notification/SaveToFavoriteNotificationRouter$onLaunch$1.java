package ru.yandex.taxi.notification;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.d6i;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o950;
import defpackage.qq80;
import defpackage.qu;
import defpackage.sls;
import defpackage.tse;
import defpackage.usr0;
import defpackage.wls;
import defpackage.wz1;
import defpackage.xyg0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.notification.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.notification.SaveToFavoriteNotificationRouter$onLaunch$1", f = "SaveToFavoriteNotificationRouter.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SaveToFavoriteNotificationRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ qq80 $payload;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.notification.SaveToFavoriteNotificationRouter$onLaunch$1$1", f = "SaveToFavoriteNotificationRouter.kt", l = {27}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.notification.SaveToFavoriteNotificationRouter$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ qq80 $payload;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, qq80 qq80Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$payload = qq80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$payload, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            final int i2 = 1;
            if (i == 0) {
                b.b(obj);
                d6i d6iVar = this.this$0.F;
                this.label = 1;
                obj = e.y(d6iVar.a.a(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            usr0 usr0Var = (usr0) obj;
            boolean z = usr0Var.b;
            List list = usr0Var.g;
            if (z && (list.isEmpty() || list.contains(this.$payload.a))) {
                long millis = TimeUnit.SECONDS.toMillis(usr0Var.d != null ? r0.intValue() : 5L);
                final a aVar = this.this$0;
                String Y = d6z.Y(usr0Var, usr0Var.e);
                String Y2 = d6z.Y(usr0Var, usr0Var.f);
                aVar.getClass();
                if (Y.length() == 0 || Y2.length() == 0) {
                    aVar.r(new qu(9));
                }
                final int i3 = 0;
                SavedToFavoriteNotification savedToFavoriteNotification = new SavedToFavoriteNotification(aVar.D, Y, Y2, xyg0.ic_deferred_save_to_favorites, "DeferredSavedToFavoriteNotification", new sls() { // from class: x0m0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        switch (i4) {
                            case 0:
                                aVar2.r(new z0l0(29));
                                aVar2.E.c("DeferredSavedToFavoriteNotification");
                                break;
                            default:
                                aVar2.E.c("DeferredSavedToFavoriteNotification");
                                break;
                        }
                        return zy11Var;
                    }
                });
                c.z(new sls() { // from class: x0m0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        switch (i4) {
                            case 0:
                                aVar2.r(new z0l0(29));
                                aVar2.E.c("DeferredSavedToFavoriteNotification");
                                break;
                            default:
                                aVar2.E.c("DeferredSavedToFavoriteNotification");
                                break;
                        }
                        return zy11Var;
                    }
                }, savedToFavoriteNotification);
                aVar.E.e(savedToFavoriteNotification);
                savedToFavoriteNotification.setExpiresListener(new wz1(12, aVar));
                savedToFavoriteNotification.startExpiresTimer(millis);
            } else {
                this.this$0.r(new qu(9));
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveToFavoriteNotificationRouter$onLaunch$1(a aVar, qq80 qq80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = qq80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SaveToFavoriteNotificationRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SaveToFavoriteNotificationRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            o950 lifecycle = this.this$0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$payload, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
