package ru.yandex.taxi.vendor_api.google.push;

import com.adjust.sdk.Constants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.yandex.go.messenger_native.d;
import defpackage.dne0;
import defpackage.ep90;
import defpackage.fn21;
import defpackage.jb7;
import defpackage.jst;
import defpackage.rs2;
import defpackage.rv10;
import defpackage.tje;
import defpackage.tjp;
import defpackage.wjp;
import defpackage.wwg;
import defpackage.y2g0;
import defpackage.z8g;
import defpackage.zzf;
import io.appmetrica.analytics.push.provider.firebase.AppMetricaMessagingService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.taxi.am.SupportedPushPlatform;
import ru.yandex.taxi.am.p0;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/vendor_api/google/push/FcmNotificationService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "handleMessageByPassport", "(Lcom/google/firebase/messaging/RemoteMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzy11;", "onCreate", "", "s", "onNewToken", "(Ljava/lang/String;)V", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Ly2g0;", "dependencies", "Ly2g0;", "Lwjp;", "fcmPushTokenStorage", "Lwjp;", "Companion", "tjp", Constants.REFERRER_API_GOOGLE}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FcmNotificationService extends FirebaseMessagingService {
    public static final tjp Companion = new tjp();
    public static final String KEY_BODY = "notification_body";
    public static final String KEY_TITLE = "notification_title";
    private y2g0 dependencies;
    private wjp fcmPushTokenStorage;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleMessageByPassport(RemoteMessage remoteMessage, Continuation<? super Boolean> continuation) {
        String from = remoteMessage.getFrom();
        if (from == null) {
            return Boolean.FALSE;
        }
        Map<String, String> data = remoteMessage.getData();
        y2g0 y2g0Var = this.dependencies;
        if (y2g0Var == null) {
            y2g0Var = null;
        }
        return new p0((ep90) ((zzf) y2g0Var).S0.get()).a(SupportedPushPlatform.FCM, from, data, continuation);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        y2g0 y2g0Var = (y2g0) wwg.e(this, y2g0.class);
        this.dependencies = y2g0Var;
        dne0 dne0Var = (dne0) ((zzf) y2g0Var).d.get();
        y2g0 y2g0Var2 = this.dependencies;
        if (y2g0Var2 == null) {
            y2g0Var2 = null;
        }
        this.fcmPushTokenStorage = new wjp(dne0Var, (rs2) ((zzf) y2g0Var2).e.get());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        tje.Y(EmptyCoroutineContext.a, new FcmNotificationService$onMessageReceived$1(this, remoteMessage, null));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String s) {
        super.onNewToken(s);
        jst.e.getClass();
        wjp wjpVar = this.fcmPushTokenStorage;
        if (wjpVar == null) {
            wjpVar = null;
        }
        wjpVar.b(s);
        y2g0 y2g0Var = this.dependencies;
        if (y2g0Var == null) {
            y2g0Var = null;
        }
        if (((h) ((fn21) ((zzf) y2g0Var).a0.get())).Kg()) {
            y2g0 y2g0Var2 = this.dependencies;
            if (y2g0Var2 == null) {
                y2g0Var2 = null;
            }
            ((c) ((zzf) y2g0Var2).n5.get()).c("onFCMTokenRefresh");
        }
        y2g0 y2g0Var3 = this.dependencies;
        if (y2g0Var3 == null) {
            y2g0Var3 = null;
        }
        d dVar = (d) ((zzf) y2g0Var3).L6.get();
        if (((Boolean) dVar.c.c()).booleanValue()) {
            jb7 jb7Var = new jb7(dVar.a);
            ((z8g) jb7Var.k()).a().reportEvent("tech_cloud_token_refresh");
            ((z8g) jb7Var.k()).b().a(new rv10(14));
        }
        tje.Y(EmptyCoroutineContext.a, new FcmNotificationService$onNewToken$1(this, null));
        new AppMetricaMessagingService().processToken(this, s);
    }
}
