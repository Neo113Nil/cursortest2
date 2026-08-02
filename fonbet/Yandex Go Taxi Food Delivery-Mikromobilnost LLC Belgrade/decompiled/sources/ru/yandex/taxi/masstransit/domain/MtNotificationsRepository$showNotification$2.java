package ru.yandex.taxi.masstransit.domain;

import defpackage.fq30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtNotificationsRepository$showNotification$2", f = "MtNotificationsRepository.kt", l = {82, 85}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtNotificationsRepository$showNotification$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $delay;
    final /* synthetic */ NotificationItemComponent<?> $notification;
    final /* synthetic */ long $timeout;
    int label;
    final /* synthetic */ fq30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtNotificationsRepository$showNotification$2(long j, fq30 fq30Var, NotificationItemComponent notificationItemComponent, long j2, Continuation continuation) {
        super(2, continuation);
        this.$delay = j;
        this.this$0 = fq30Var;
        this.$notification = notificationItemComponent;
        this.$timeout = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtNotificationsRepository$showNotification$2(this.$delay, this.this$0, this.$notification, this.$timeout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtNotificationsRepository$showNotification$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (kotlinx.coroutines.a.i(r3, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (kotlinx.coroutines.a.i(r4, r8) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$delay;
            if (j > 0) {
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.c.closeNotification(this.$notification);
                this.this$0.f.remove(this.$notification.getNotificationId());
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        this.this$0.c.showNotification(this.$notification);
        long j2 = this.$timeout;
        this.label = 2;
    }
}
