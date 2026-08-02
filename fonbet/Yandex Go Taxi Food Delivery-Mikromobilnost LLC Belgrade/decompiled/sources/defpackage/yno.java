package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.util.Log;
import android.webkit.WebView;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.g;
import androidx.media3.exoplayer.f;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.plus.experiment.CashbackExperiment;
import com.yandex.go.plus.notification.CashbackTimedNotificationItem;
import com.yandex.plus.home.feature.webviews.internal.settings.domain.a;
import defpackage.c3f;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import java.util.List;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes10.dex */
public final /* synthetic */ class yno implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ yno(o370 o370Var, String str, boolean z, a aVar) {
        this.a = 3;
        this.c = o370Var;
        this.w = str;
        this.b = z;
        this.x = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        LogSessionId sessionId;
        boolean equals;
        PlaybackSession createPlaybackSession;
        boolean z;
        LogSessionId unused;
        ue10 ue10Var = null;
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z2 = this.b;
                f fVar = (f) this.w;
                vyc0 vyc0Var = (vyc0) this.x;
                MediaMetricsManager g = xbm.g(context.getSystemService("media_metrics"));
                if (g != null) {
                    createPlaybackSession = g.createPlaybackSession();
                    ue10Var = new ue10(context, createPlaybackSession);
                }
                if (ue10Var == null) {
                    lk91.j("MediaMetricsService unavailable.");
                    return;
                }
                if (z2) {
                    fVar.addAnalyticsListener(ue10Var);
                }
                sessionId = ue10Var.d.getSessionId();
                synchronized (vyc0Var) {
                    uyc0 uyc0Var = vyc0Var.b;
                    uyc0Var.getClass();
                    LogSessionId logSessionId = uyc0Var.a;
                    unused = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                    d6z.x(equals);
                    uyc0Var.a = sessionId;
                }
                return;
            case 1:
                g gVar = (g) this.c;
                znw0 znw0Var = (znw0) this.w;
                Timebase timebase = (Timebase) this.x;
                boolean z3 = this.b;
                znw0 znw0Var2 = gVar.z;
                if (znw0Var2 != null && !znw0Var2.a()) {
                    gVar.z.d();
                }
                gVar.m0 = z3;
                gVar.z = znw0Var;
                gVar.A = timebase;
                gVar.h(znw0Var, timebase, true);
                return;
            case 2:
                u0r0 u0r0Var = (u0r0) this.c;
                c3f.e.d dVar = (c3f.e.d) this.w;
                pgo pgoVar = (pgo) this.x;
                boolean z4 = this.b;
                Log.isLoggable("FirebaseCrashlytics", 3);
                u0r0Var.b.d(dVar, pgoVar.a, z4);
                return;
            case 3:
                o370 o370Var = (o370) this.c;
                String str = (String) this.w;
                boolean z5 = this.b;
                a aVar = (a) this.x;
                r5d0 r5d0Var = (r5d0) o370Var.a;
                reu reuVar = new reu(22, aVar);
                if (!"composite_payment.enabled".equals(str)) {
                    r5d0Var.getClass();
                    reuVar.I(new IllegalArgumentException("unsupported settingId requested"));
                    return;
                }
                boolean b = ((i) r5d0Var.a.b).g.b.b();
                if (b == z5) {
                    reuVar.A(str, b);
                    return;
                }
                i iVar = (i) r5d0Var.a.b;
                lea0 e = iVar.e();
                if (!iVar.g.d(e != null ? e.c() : null)) {
                    r5d0Var.b.a();
                    reuVar.I(new IllegalStateException("correct flow is not supported yet"));
                    return;
                }
                j29 j29Var = r5d0Var.a;
                List list = ((i) j29Var.b).a.b.g().e.a;
                if (!(list.isEmpty() ? PersonalAccount.l : (PersonalAccount) list.get(0)).equals(PersonalAccount.l)) {
                    boolean z6 = j29Var.a.b;
                    cba0 cba0Var = j29Var.b;
                    if (z6) {
                        if (((i) cba0Var).g.a()) {
                            ((i) j29Var.b).m(false);
                            j29Var.a.b = false;
                        }
                        z = true;
                    } else {
                        i iVar2 = (i) cba0Var;
                        xxc g2 = iVar2.u.b.g();
                        if (g2 != null) {
                            iVar2.i(g2, null, true);
                        }
                        if (((i) j29Var.b).g.b.b()) {
                            j29Var.a.b = true;
                            z = true;
                        }
                    }
                    x39 x39Var = r5d0Var.c;
                    if (z) {
                        x39Var.a.c("cashback_payment_changed_to_wallet");
                    } else {
                        wnb0 wnb0Var = new wnb0(12, r5d0Var.b);
                        tj60 tj60Var = x39Var.a;
                        CashbackExperiment a = x39Var.d.a();
                        if (a.e.a.a) {
                            NotificationStackComponent notificationStackComponent = tj60Var.a;
                            if (!((notificationStackComponent == null || notificationStackComponent.getIsHidden()) ? false : true)) {
                                tj60Var.f();
                            }
                            final String Y = d6z.Y(a, a.e.a.b);
                            if (!evu0.J(Y)) {
                                final a49 a49Var = x39Var.e;
                                final Activity activity = x39Var.b;
                                final tj60 tj60Var2 = x39Var.a;
                                final ju8 ju8Var = new ju8(8, x39Var);
                                final ky7 ky7Var = new ky7(13, x39Var, wnb0Var);
                                String str2 = a49Var.b.a().e.b;
                                final int i = 0;
                                tls tlsVar = new tls() { // from class: y39
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        int i2 = i;
                                        zy11 zy11Var = zy11.a;
                                        ju8 ju8Var2 = ju8Var;
                                        tj60 tj60Var3 = tj60Var2;
                                        ky7 ky7Var2 = ky7Var;
                                        String str3 = Y;
                                        Context context2 = activity;
                                        a49 a49Var2 = a49Var;
                                        switch (i2) {
                                            case 0:
                                                a49Var2.getClass();
                                                CashbackTimedNotificationItem cashbackTimedNotificationItem = new CashbackTimedNotificationItem(context2, str3, "cashback_payment_changed_to_wallet", null);
                                                ky7Var2.invoke(cashbackTimedNotificationItem, cashbackTimedNotificationItem.getListItemComponent());
                                                tj60Var3.e(cashbackTimedNotificationItem);
                                                cashbackTimedNotificationItem.startExpiresTimer();
                                                ju8Var2.invoke();
                                                break;
                                            default:
                                                a49Var2.getClass();
                                                CashbackTimedNotificationItem cashbackTimedNotificationItem2 = new CashbackTimedNotificationItem(context2, str3, "cashback_payment_changed_to_wallet", (Bitmap) obj);
                                                ky7Var2.invoke(cashbackTimedNotificationItem2, cashbackTimedNotificationItem2.getListItemComponent());
                                                tj60Var3.e(cashbackTimedNotificationItem2);
                                                cashbackTimedNotificationItem2.startExpiresTimer();
                                                ju8Var2.invoke();
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                };
                                final int i2 = 1;
                                a49Var.a(str2, tlsVar, new tls() { // from class: y39
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        int i22 = i2;
                                        zy11 zy11Var = zy11.a;
                                        ju8 ju8Var2 = ju8Var;
                                        tj60 tj60Var3 = tj60Var2;
                                        ky7 ky7Var2 = ky7Var;
                                        String str3 = Y;
                                        Context context2 = activity;
                                        a49 a49Var2 = a49Var;
                                        switch (i22) {
                                            case 0:
                                                a49Var2.getClass();
                                                CashbackTimedNotificationItem cashbackTimedNotificationItem = new CashbackTimedNotificationItem(context2, str3, "cashback_payment_changed_to_wallet", null);
                                                ky7Var2.invoke(cashbackTimedNotificationItem, cashbackTimedNotificationItem.getListItemComponent());
                                                tj60Var3.e(cashbackTimedNotificationItem);
                                                cashbackTimedNotificationItem.startExpiresTimer();
                                                ju8Var2.invoke();
                                                break;
                                            default:
                                                a49Var2.getClass();
                                                CashbackTimedNotificationItem cashbackTimedNotificationItem2 = new CashbackTimedNotificationItem(context2, str3, "cashback_payment_changed_to_wallet", (Bitmap) obj);
                                                ky7Var2.invoke(cashbackTimedNotificationItem2, cashbackTimedNotificationItem2.getListItemComponent());
                                                tj60Var3.e(cashbackTimedNotificationItem2);
                                                cashbackTimedNotificationItem2.startExpiresTimer();
                                                ju8Var2.invoke();
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                });
                            }
                        }
                    }
                    reuVar.A(str, z);
                    return;
                }
                z = false;
                x39 x39Var2 = r5d0Var.c;
                if (z) {
                }
                reuVar.A(str, z);
                return;
            default:
                ((WebViewClientProxyApi$WebViewClientImpl) this.c).lambda$doUpdateVisitedHistory$11((WebView) this.w, (String) this.x, this.b);
                return;
        }
    }

    public /* synthetic */ yno(Context context, boolean z, f fVar, vyc0 vyc0Var) {
        this.a = 0;
        this.c = context;
        this.b = z;
        this.w = fVar;
        this.x = vyc0Var;
    }

    public /* synthetic */ yno(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = z;
    }
}
