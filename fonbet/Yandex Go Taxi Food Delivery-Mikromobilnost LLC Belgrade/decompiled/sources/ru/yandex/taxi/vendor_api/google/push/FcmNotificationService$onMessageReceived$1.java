package ru.yandex.taxi.vendor_api.google.push;

import com.google.firebase.messaging.RemoteMessage;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.domain.s;
import defpackage.c731;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wfz;
import defpackage.wls;
import defpackage.xjp;
import defpackage.y2g0;
import defpackage.zy11;
import defpackage.zzf;
import io.appmetrica.analytics.push.provider.firebase.AppMetricaMessagingService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.push.FcmNotificationService$onMessageReceived$1", f = "FcmNotificationService.kt", l = {54, 82, HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class FcmNotificationService$onMessageReceived$1 extends SuspendLambda implements wls {
    final /* synthetic */ RemoteMessage $remoteMessage;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ FcmNotificationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmNotificationService$onMessageReceived$1(FcmNotificationService fcmNotificationService, RemoteMessage remoteMessage, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fcmNotificationService;
        this.$remoteMessage = remoteMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FcmNotificationService$onMessageReceived$1(this.this$0, this.$remoteMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FcmNotificationService$onMessageReceived$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r13 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xjp xjpVar;
        y2g0 y2g0Var;
        c731 c731Var;
        RemoteMessage remoteMessage;
        FcmNotificationService fcmNotificationService;
        xjp xjpVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            super/*com.google.firebase.messaging.FirebaseMessagingService*/.onMessageReceived(this.$remoteMessage);
            RemoteMessage remoteMessage2 = this.$remoteMessage;
            if (remoteMessage2 == null) {
                jst.e.k(new NullPointerException("Fcm remote message is null."), "EonMessageReceived error");
                return zy11Var;
            }
            xjpVar = new xjp(remoteMessage2);
            unr0.C(new Object[]{wfz.r(xjpVar)}, 1, "on FCM message Received:\n%s", jst.e);
            FcmNotificationService fcmNotificationService2 = this.this$0;
            RemoteMessage remoteMessage3 = this.$remoteMessage;
            this.L$0 = xjpVar;
            this.label = 1;
            obj = fcmNotificationService2.handleMessageByPassport(remoteMessage3, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                fcmNotificationService = (FcmNotificationService) this.L$4;
                xjpVar2 = (xjp) this.L$3;
                remoteMessage = (RemoteMessage) this.L$2;
                c731Var = (c731) this.L$1;
                b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (AppMetricaMessagingService.isNotificationRelatedToSDK(remoteMessage)) {
                        new AppMetricaMessagingService().processPush(fcmNotificationService, remoteMessage);
                        unr0.C(new Object[]{wfz.r(xjpVar2)}, 1, "on message Received:\n%s", jst.e);
                        return zy11Var;
                    }
                    com.yandex.go.notifications.domain.a aVar = c731Var.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (aVar.b(xjpVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            xjpVar = (xjp) this.L$0;
            b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            y2g0Var = this.this$0.dependencies;
            if (y2g0Var == null) {
                y2g0Var = null;
            }
            zzf zzfVar = (zzf) y2g0Var;
            com.yandex.go.notifications.domain.a aVar2 = (com.yandex.go.notifications.domain.a) zzfVar.Pi.get();
            s sVar = new s((u) zzfVar.V1.get());
            c731Var = new c731(aVar2, sVar);
            remoteMessage = this.$remoteMessage;
            FcmNotificationService fcmNotificationService3 = this.this$0;
            Map<String, String> data = xjpVar.a.getData();
            this.L$0 = null;
            this.L$1 = c731Var;
            this.L$2 = remoteMessage;
            this.L$3 = xjpVar;
            this.L$4 = fcmNotificationService3;
            this.label = 2;
            Object b = sVar.b(data, this);
            if (b != coroutineSingletons) {
                xjp xjpVar3 = xjpVar;
                fcmNotificationService = fcmNotificationService3;
                obj = b;
                xjpVar2 = xjpVar3;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            return coroutineSingletons;
        }
        return zy11Var;
    }
}
