package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.l0;
import androidx.core.app.q;
import androidx.core.app.s0;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.p;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.experiments.StatusInfoTimerSourceSelectionExperiment;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.OrderForegroundNotificationOverrides;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;
import ru.yandex.taxi.order.l;

/* loaded from: classes9.dex */
public final class y180 {
    public final q280 a;
    public final zuj0 b;
    public final xzi0 c;
    public final l d;
    public final yhz0 e;
    public final u880 f;
    public final vze0 g;
    public final iom0 h;
    public final xdf i;
    public final ec11 j;
    public final j5z k;
    public final mzx0 l;
    public final hxo m;
    public final ixo n;
    public final mxo o;
    public final jxo p;
    public final kug q;
    public final fb7 r;

    public y180(q280 q280Var, zuj0 zuj0Var, xzi0 xzi0Var, l lVar, yhz0 yhz0Var, u880 u880Var, vze0 vze0Var, iom0 iom0Var, xdf xdfVar, ec11 ec11Var, j5z j5zVar, mzx0 mzx0Var, hxo hxoVar, ixo ixoVar, mxo mxoVar, jxo jxoVar, kug kugVar, fb7 fb7Var) {
        this.a = q280Var;
        this.b = zuj0Var;
        this.c = xzi0Var;
        this.d = lVar;
        this.e = yhz0Var;
        this.f = u880Var;
        this.g = vze0Var;
        this.h = iom0Var;
        this.i = xdfVar;
        this.j = ec11Var;
        this.k = j5zVar;
        this.l = mzx0Var;
        this.m = hxoVar;
        this.n = ixoVar;
        this.o = mxoVar;
        this.p = jxoVar;
        this.q = kugVar;
        this.r = fb7Var;
    }

    public static boolean c(TaxiOrder taxiOrder) {
        String str = taxiOrder.b.S.c;
        return (str == null || evu0.J(str) || !alb1.e(taxiOrder.V().k, taxiOrder.V().u)) ? false : true;
    }

    public static int f(String str, OrderNotification$OrderNotificationType orderNotification$OrderNotificationType) {
        return orderNotification$OrderNotificationType.getId() + str.hashCode();
    }

    public final void a(String str, OrderNotification$OrderNotificationType... orderNotification$OrderNotificationTypeArr) {
        k4o a = OrderNotification$OrderNotificationType.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = (OrderNotification$OrderNotificationType) obj;
            if (orderNotification$OrderNotificationTypeArr.length == 0 || !j73.y(orderNotification$OrderNotificationTypeArr, orderNotification$OrderNotificationType)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.a(f(str, (OrderNotification$OrderNotificationType) it.next()));
        }
    }

    public final void b(String str) {
        this.a.a(f(str, OrderNotification$OrderNotificationType.ORDER));
    }

    public final boolean d(TaxiOrder taxiOrder) {
        ReorderInfo reorderInfo = taxiOrder.V().b;
        if (reorderInfo == null) {
            return false;
        }
        List e = reorderInfo.getE();
        ArrayList arrayList = new ArrayList(tcc.n(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReorderInfo.ReorderOption) it.next()).getA());
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        String str = taxiOrder.a;
        xzi0 xzi0Var = this.c;
        xzi0Var.getClass();
        Set n = xzi0Var.a.n("ru.yandex.taxi.order.HANDLED_REORDERS_" + str);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (a.G(n, (String) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final String e(TaxiOrder taxiOrder, boolean z) {
        Driver driver;
        int i = x180.a[taxiOrder.h.getB().ordinal()];
        if (i == 4) {
            Driver driver2 = taxiOrder.V().g;
            String c = alb1.c(driver2.getC(), driver2.getB(), z ? null : driver2.getD());
            return c(taxiOrder) ? ((avj0) this.b).i(kyh0.taxiotw_scheduled_timeleft_waiting_body, ((wze0) this.g).b(taxiOrder).a(), c) : c;
        }
        if (i == 6 && (driver = taxiOrder.V().g) != null) {
            return z ? a.X(j73.A(new String[]{driver.getB(), driver.getC()}), Extension.FIX_SPACE, null, null, null, 62) : a.X(scc.g(driver.getB(), driver.getC(), t7s.a(driver.getD())), Extension.FIX_SPACE, null, null, null, 62);
        }
        return null;
    }

    public final String g(TaxiOrder taxiOrder) {
        RouteInfo routeInfo;
        xh60 w;
        u880 u880Var = this.f;
        u880Var.getClass();
        OrderStatusInfo V = taxiOrder.V();
        V.getClass();
        String str = "";
        if (V.f(SimpleBooleanExperiment.ORDER_STATUS_NOTIFICATION) && (w = taxiOrder.l.w()) != null) {
            ief iefVar = taxiOrder.V().K;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            String c = ((OrderStatusWindowNotification) w.a()).getC();
            str = (c == null || c.length() == 0) ? u880Var.b.a(h, ((OrderStatusWindowNotification) w.a()).getB(), false, true) : u880Var.b.a(h, c, false, true);
        }
        if (str != null && !evu0.J(str)) {
            return str;
        }
        DriveState b = taxiOrder.h.getB();
        DriveState driveState = DriveState.DRIVING;
        u880 u880Var2 = this.f;
        if (b == driveState && (routeInfo = taxiOrder.V().r) != null) {
            if (!c(taxiOrder)) {
                return u880Var2.a(routeInfo);
            }
            u880Var2.getClass();
            return ((avj0) u880Var2.a).i(kyh0.taxiotw_scheduled_timeleft_waiting_title, String.valueOf((int) (routeInfo.getB() / 60.0d)));
        }
        return u880Var2.b(taxiOrder);
    }

    public final void h(TaxiOrder taxiOrder) {
        String b;
        String str = taxiOrder.a;
        a(str, new OrderNotification$OrderNotificationType[0]);
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.ORDER;
        int f = f(str, orderNotification$OrderNotificationType);
        String p = taxiOrder.p();
        String f2 = taxiOrder.f();
        if (f2 == null) {
            f2 = "";
        }
        n280 n280Var = new n280(f, str, p, f2, taxiOrder.e(), this.d.f, orderNotification$OrderNotificationType, 0L, false, 896);
        if (evu0.J(n280Var.k()) && ((b = n280Var.b()) == null || evu0.J(b))) {
            ief iefVar = taxiOrder.V().K;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            xdf xdfVar = this.i;
            String g = taxiOrder.g();
            n280Var = n280.a(n280Var, ((avj0) this.b).h(kyh0.notification_cancelled_with_paid_title), ((avj0) this.b).i(kyh0.notification_cancelled_with_paid_body, xdfVar.a(h, g != null ? g : "", true, true)), null, 999);
        }
        q280 q280Var = this.a;
        q280Var.getClass();
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.g("local:taxi_order:cancelled:" + n280Var.h());
        builder.f(b.h(new Pair(FinishFlowStatus.ORDER_ID_FIELD_NAME, n280Var.j())));
        builder.e(n280Var.h());
        String j = n280Var.j();
        v i = q280Var.c.i(q280Var.e.b(n280Var.k(), n280Var.j()), n280Var.b(), null, "order", q280Var.c(new Intent(q280Var.a, (Class<?>) q280Var.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).setData(((xq70) q280Var.g).c("open_order", j)).setAction("cancelled_by_paid_action_" + j).putExtra("ru.yandex.taxi.activity.MainActivity.CANCELLED_BY_PAID_ORDER", j).putExtra("notification_share_data_extra", builder.a()).addFlags(SelfTester_JCP.IMITA), false, null), n280Var.c());
        xk60 xk60Var = q280Var.c;
        boolean g2 = n280Var.g();
        xk60Var.getClass();
        if (g2) {
            i.m = 1;
        }
        xk60Var.m(builder, i, n280Var.e(), "order");
    }

    public final void i(TaxiOrder taxiOrder, long j) {
        v i;
        Bundle bundle;
        String b;
        String str = taxiOrder.a;
        a(str, new OrderNotification$OrderNotificationType[0]);
        boolean booleanValue = ((Boolean) ((t1b0) this.r.a.getValue()).c()).booleanValue();
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.ORDER;
        int f = f(str, orderNotification$OrderNotificationType);
        String p = taxiOrder.p();
        String f2 = taxiOrder.f();
        n280 n280Var = new n280(f, str, p, f2 == null ? "" : f2, taxiOrder.e(), this.d.f, orderNotification$OrderNotificationType, j, booleanValue, 256);
        if (evu0.J(n280Var.k()) && ((b = n280Var.b()) == null || evu0.J(b))) {
            ief iefVar = taxiOrder.V().K;
            fef h = iefVar != null ? gwk0.h(iefVar) : null;
            xdf xdfVar = this.i;
            String g = taxiOrder.g();
            String a = xdfVar.a(h, g != null ? g : "", true, true);
            boolean J = evu0.J(a);
            zuj0 zuj0Var = this.b;
            n280Var = !J ? n280.a(n280Var, ((avj0) zuj0Var).i(kyh0.notification_ask_feedback_title, a), ((avj0) this.b).h(kyh0.notification_ask_feedback_body), null, 999) : n280.a(n280Var, ((avj0) zuj0Var).h(kyh0.notification_ask_feedback), null, null, 999);
        }
        q280 q280Var = this.a;
        a980 a980Var = q280Var.e;
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.g("local:taxi_order:feedback:" + n280Var.h());
        builder.f(b.h(new Pair(FinishFlowStatus.ORDER_ID_FIELD_NAME, n280Var.j())));
        builder.e(n280Var.h());
        xk60 xk60Var = q280Var.c;
        Notification j2 = xk60Var.j(n280Var.h());
        long c = (j2 == null || (bundle = j2.extras) == null) ? n280Var.c() : bundle.getLong("expiration_interval");
        PendingIntent c2 = q280Var.c(new Intent(q280Var.a, (Class<?>) q280Var.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).setData(((xq70) q280Var.g).b(n280Var.j())).setAction("android.intent.action.VIEW").putExtra("notification_share_data_extra", builder.a()).addFlags(SelfTester_JCP.IMITA), true, null);
        boolean f3 = n280Var.f();
        xk60 xk60Var2 = q280Var.c;
        if (f3) {
            String b2 = n280Var.b();
            String b3 = a980Var.b(n280Var.k(), n280Var.j());
            String j3 = n280Var.j();
            xk60Var2.getClass();
            Application application = xk60Var2.a;
            RemoteViews remoteViews = new RemoteViews(application.getPackageName(), xqh0.layout_notification_feedback_expanded);
            kuq kuqVar = xk60Var2.k;
            Bitmap bitmap = (Bitmap) kuqVar.a.get(j3);
            kuqVar.a.remove(j3);
            kuqVar.b.remove(j3);
            kuqVar.c.remove(j3);
            remoteViews.setTextViewText(ueh0.notification_title, b3);
            remoteViews.setTextViewText(ueh0.notification_content, b2);
            int[] iArr = {ueh0.star1, ueh0.star2, ueh0.star3, ueh0.star4, ueh0.star5};
            Uri.Builder builder2 = new Uri.Builder();
            ((pux0) xk60Var2.l).getClass();
            Uri build = builder2.scheme(pux0.c).authority("taxi_order_details").appendQueryParameter("order_id", j3).appendQueryParameter("action", "feedback").build();
            int i2 = 0;
            while (i2 < 5) {
                if (bitmap != null) {
                    remoteViews.setImageViewBitmap(iArr[i2], bitmap);
                }
                int i3 = i2 + 1;
                Intent intent = new Intent("android.intent.action.VIEW", build.buildUpon().appendQueryParameter("value", String.valueOf(i3)).build());
                intent.addFlags(805306368);
                remoteViews.setOnClickPendingIntent(iArr[i2], PendingIntent.getActivity(application, i2, intent, 201326592));
                i2 = i3;
                b2 = b2;
            }
            String str2 = b2;
            i = xk60Var2.i(str2, b3, null, "order", c2, c);
            i.e = v.d(b3);
            i.f = v.d(str2);
            i.E = remoteViews;
            i.D = remoteViews;
            i.l(new t.d());
        } else {
            i = xk60Var2.i(n280Var.b(), a980Var.b(n280Var.k(), n280Var.j()), null, "order", c2, c);
        }
        if (n280Var.g()) {
            i.m = 1;
        }
        xk60Var.l(builder, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if (defpackage.evu0.y(r3, r8, false) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w180 j(OrderNotification$OrderNotificationType orderNotification$OrderNotificationType, TaxiOrder taxiOrder, boolean z, boolean z2, OrderForegroundNotificationOverrides orderForegroundNotificationOverrides) {
        TaxiOrder taxiOrder2;
        String f;
        String e;
        String str;
        n280 a;
        int i;
        List j;
        Notification h;
        l280 l280Var;
        Float f2;
        String str2;
        Object failure;
        String str3;
        String b;
        String str4 = taxiOrder.a;
        int f3 = f(str4, orderNotification$OrderNotificationType);
        if (d(taxiOrder)) {
            h = l(f3, taxiOrder, z, z2, orderNotification$OrderNotificationType);
            taxiOrder2 = taxiOrder;
            i = f3;
            str = str4;
        } else {
            taxiOrder2 = taxiOrder;
            if (orderForegroundNotificationOverrides == null || (f = orderForegroundNotificationOverrides.getA()) == null) {
                f = taxiOrder2.f();
            }
            if (f == null || evu0.J(f) || f.equals("null")) {
                f = null;
            }
            if (f == null) {
                f = "";
            }
            String str5 = f;
            if (orderForegroundNotificationOverrides == null || (e = orderForegroundNotificationOverrides.getB()) == null) {
                e = taxiOrder2.e();
            }
            if (e == null || e.equals("null")) {
                e = null;
            }
            if (e == null) {
                e = "";
            }
            str = str4;
            n280 n280Var = new n280(f3, str, taxiOrder2.p(), str5, e, z, orderNotification$OrderNotificationType, 0L, false, 896);
            String k = n280Var.k();
            String b2 = n280Var.b();
            ief iefVar = taxiOrder2.V().K;
            if (iefVar != null) {
                k = this.i.a(gwk0.h(iefVar), k, true, true);
            }
            boolean z3 = b2 == null || evu0.J(b2);
            if (!evu0.J(k)) {
                OrderStatusInfo V = taxiOrder2.V();
                if (!((StatusInfoTimerSourceSelectionExperiment) V.d(StatusInfoTimerSourceSelectionExperiment.d)).b) {
                    qn11 qn11Var = PaidWaitingTimerInCardExperiment.f;
                    qn11 b3 = V.b(PaidWaitingTimerInCardExperiment.class);
                    if (b3 != null) {
                        qn11Var = b3;
                    }
                    PaidWaitingTimerInCardExperiment.FreeWaitingInTitle freeWaitingInTitle = ((PaidWaitingTimerInCardExperiment) qn11Var).e;
                    if (freeWaitingInTitle != null) {
                        b = freeWaitingInTitle.getB();
                        if (b != null || evu0.J(b)) {
                            b = "$time$";
                        }
                    }
                }
                b = null;
                if (b != null) {
                }
                b = "$time$";
            }
            k = g(taxiOrder2);
            if (b2 == null || evu0.J(b2)) {
                b2 = e(taxiOrder2, false);
            }
            int i2 = 2;
            if (this.m.f(taxiOrder2.h.getB())) {
                mxo mxoVar = this.o;
                synchronized (mxoVar) {
                    mxoVar.b.compute(taxiOrder2.a, new pw7(i2, new a6n(6, taxiOrder2, mxoVar)));
                }
                this.p.a.g(taxiOrder2);
                if (z3) {
                    b2 = e(taxiOrder2, true);
                }
                ixo ixoVar = this.n;
                ixoVar.getClass();
                String d = taxiOrder2.V().g.getD();
                if (d != null) {
                    String b4 = t7s.b(d);
                    String h0 = evu0.h0((char) 8201, b4, b4);
                    String e0 = evu0.z(b4, (char) 8201) ? evu0.e0((char) 8201, b4, b4) : null;
                    String a2 = t7s.a(d);
                    if (a2 != null) {
                        b4 = a2;
                    }
                    l280Var = new l280(h0, e0, b4);
                } else {
                    l280Var = null;
                }
                fxo d2 = ixoVar.c.d();
                hxo hxoVar = ixoVar.c;
                fxo fxoVar = (!hxoVar.b().c.a || (str3 = hxoVar.b().c.c) == null) ? null : new fxo(str3, hxoVar.b().c.d, hxoVar.b().c.e, hxoVar.b().c.f);
                if (ixoVar.c.b().c.b && taxiOrder2.h.getB() == DriveState.DRIVING) {
                    if (taxiOrder2.V().p0 == null) {
                        failure = new Result.Failure(new NullPointerException("orderStartDate is null"));
                    } else {
                        Date c = ixoVar.a.c();
                        RouteInfo routeInfo = taxiOrder2.V().r;
                        if (routeInfo != null) {
                            float b5 = (float) routeInfo.getB();
                            float time = ((c.getTime() - r7.getTime()) / 1000) + b5;
                            failure = time == 0.0f ? new Result.Failure(new ArithmeticException("division by zero")) : Float.valueOf(1.0f - (b5 / time));
                        } else {
                            failure = new Result.Failure(new NullPointerException("timeLeft is null"));
                        }
                    }
                    Throwable a3 = Result.a(failure);
                    if (a3 != null) {
                        ixoVar.d.getClass();
                        xby.l(jst.e, "ExtendedNotification.Error", null, a3, "progress calculation error", 2);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    f2 = (Float) failure;
                } else {
                    f2 = null;
                }
                String a4 = taxiOrder2.V().g.getA();
                RouteInfo routeInfo2 = taxiOrder2.V().r;
                if (routeInfo2 == null) {
                    str2 = null;
                } else {
                    str2 = ((int) (routeInfo2.getB() / 60.0d)) + " " + ((avj0) ixoVar.b).h(kyh0.date_format_min);
                }
                a = n280.a(n280Var, k, b2, m280.a(new m280(l280Var, d2, fxoVar, f2, a4, str2), null, taxiOrder2.h.getB() == DriveState.WAITING ? this.a.b(taxiOrder2.a).g : null, 223), 743);
            } else {
                a = n280.a(n280Var, k, b2, null, 999);
            }
            q280 q280Var = this.a;
            OrderNotification$OrderNotificationType i3 = n280Var.i();
            q280 q280Var2 = this.a;
            if (i3 != OrderNotification$OrderNotificationType.ORDER_WAITING) {
                j = EmptyList.a;
                i = f3;
            } else {
                String str6 = taxiOrder2.a;
                ListBuilder a5 = rcc.a();
                if (taxiOrder2.V().S) {
                    String g = taxiOrder2.V().g.getG();
                    q280Var2.getClass();
                    Intent intent = new Intent(q280Var2.a, (Class<?>) q280Var2.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
                    intent.setAction("android.intent.action.VIEW");
                    xq70 xq70Var = (xq70) q280Var2.g;
                    i = f3;
                    xzx0 xzx0Var = new xzx0(str6, xq70Var.d(), false);
                    ((pux0) xq70Var.a).getClass();
                    intent.setData(xq70.a(xzx0Var, pux0.c));
                    Bundle bundle = new Bundle(2);
                    bundle.putString("ru.yandex.taxi.broadcast.NotificationAction.PHONE_NUMBER", g);
                    bundle.putString("ru.yandex.taxi.broadcast.NotificationAction.ORDER_ID", str6);
                    bundle.putString("ru.yandex.taxi.notifications.REPORT_EVENT", "Notification.ActionCall");
                    intent.putExtras(bundle);
                    a5.add(new q(h0h0.ic_notification_call, ((avj0) q280Var2.b).h(kyh0.taxiotw_call), q280Var2.c(intent, true, null)));
                } else {
                    i = f3;
                }
                if (taxiOrder2.V().R) {
                    q280Var2.getClass();
                    Intent intent2 = new Intent(q280Var2.a, (Class<?>) q280Var2.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
                    intent2.setAction("android.intent.action.VIEW");
                    xq70 xq70Var2 = (xq70) q280Var2.g;
                    e0y0 e0y0Var = new e0y0(str6, xq70Var2.d(), false);
                    ((pux0) xq70Var2.a).getClass();
                    intent2.setData(xq70.a(e0y0Var, pux0.c));
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("ru.yandex.taxi.broadcast.NotificationAction.ORDER_ID", str6);
                    bundle2.putString("ru.yandex.taxi.notifications.REPORT_EVENT", "Notification.OpenChat");
                    intent2.putExtras(bundle2);
                    a5.add(new q(h0h0.ic_notification_chat, ((avj0) q280Var2.b).h(kyh0.taxiotw_chat), q280Var2.c(intent2, true, null)));
                }
                if (!taxiOrder2.H()) {
                    a5.add(q280Var2.b(str6));
                }
                j = a5.j();
            }
            h = q280Var.h(a, j, z2, taxiOrder2);
        }
        return h != null ? new v180(i, h, str, taxiOrder2.h.getB(), orderNotification$OrderNotificationType) : u180.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w180 k(TaxiOrder taxiOrder, boolean z, long j) {
        boolean z2;
        long j2;
        int i;
        long j3;
        String str;
        NotificationShareData.a aVar;
        String str2;
        v vVar;
        Notification l;
        boolean z3;
        String h;
        Calendar calendar;
        u180 u180Var = u180.b;
        String str3 = taxiOrder.a;
        DriveState b = taxiOrder.h.getB();
        OrderForegroundNotificationOverrides orderForegroundNotificationOverrides = (OrderForegroundNotificationOverrides) taxiOrder.l.getN().get(b.toString());
        boolean z4 = false;
        if (jx81.f()) {
            OrderStatusInfo V = taxiOrder.V();
            t280.Companion.getClass();
            qn11 qn11Var = t280.c;
            V.getClass();
            qn11 b2 = V.b(t280.class);
            if (b2 != null) {
                qn11Var = b2;
            }
            if (((t280) qn11Var).b) {
                z2 = false;
                if (j != 0) {
                    Long valueOf = ((Integer) ((s1g0) this.q.c()).c.get(b.toString())) != null ? Long.valueOf(r11.intValue() * 1000) : null;
                    j2 = valueOf != null ? valueOf.longValue() : 0L;
                } else {
                    j2 = j;
                }
                switch (x180.a[b.ordinal()]) {
                    case 1:
                        long j4 = j2;
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.ORDER_SEARCH;
                        a(str3, orderNotification$OrderNotificationType, OrderNotification$OrderNotificationType.ORDER_INFORMATION);
                        String str4 = taxiOrder.a;
                        int f = f(str4, orderNotification$OrderNotificationType);
                        if (d(taxiOrder)) {
                            l = l(f, taxiOrder, z, z2, orderNotification$OrderNotificationType);
                            i = f;
                            str = str4;
                        } else {
                            q280 q280Var = this.a;
                            fvp0 fvp0Var = q280Var.j;
                            zuj0 zuj0Var = q280Var.b;
                            NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
                            builder.e(f);
                            PendingIntent f2 = q280Var.f(taxiOrder.a, false, builder, f);
                            String f3 = taxiOrder.f();
                            if (f3 == null) {
                                f3 = "";
                            }
                            String e = taxiOrder.e();
                            String str5 = e != null ? e : "";
                            if (evu0.J(f3) && evu0.J(str5)) {
                                Calendar g = taxiOrder.b.g();
                                if (g != null) {
                                    String h2 = ((avj0) zuj0Var).h(kyh0.taxischeduled_title);
                                    str5 = q280Var.f.a(g, taxiOrder.N());
                                    f3 = h2;
                                } else {
                                    if (orderForegroundNotificationOverrides == null || (h = orderForegroundNotificationOverrides.getA()) == null) {
                                        h = ((avj0) zuj0Var).h(kyh0.notification_search);
                                    }
                                    f3 = h;
                                    str5 = orderForegroundNotificationOverrides != null ? orderForegroundNotificationOverrides.getB() : null;
                                }
                            }
                            String str6 = str5;
                            fvp0Var.getClass();
                            if (smw0.a() >= 3600001) {
                                fvp0Var.c.getClass();
                                boolean a = i280.a(taxiOrder);
                                s0 s0Var = (s0) fvp0Var.d.getValue();
                                i = f;
                                if (Build.VERSION.SDK_INT >= 36) {
                                    z3 = l0.a(s0Var.b);
                                } else {
                                    s0Var.getClass();
                                    z3 = false;
                                }
                                if (a && z2 && z3) {
                                    str = str4;
                                    j3 = j4;
                                    aVar = builder;
                                    str2 = f3;
                                    vVar = fvp0Var.b.i(str6, str2, null, "order_progress_updates", f2, j3);
                                    vVar.h(2, true);
                                    vVar.c().putBoolean("android.requestPromotedOngoing", true);
                                    Context context = fvp0Var.a;
                                    vVar.M = IconCompat.a(context, Icon.createWithResource(context, h0h0.ic_order_search_notification)).i(vVar.a);
                                    if (vVar == null) {
                                        vVar = fvp0Var.b.i(str6, str2, null, "order_low", f2, j3);
                                        vVar.h(2, z2);
                                    }
                                    vVar.h(8, true);
                                    vVar.h(16, false);
                                    vVar.n = false;
                                    vVar.x = Constants.KEY_SERVICE;
                                    vVar.m = -1;
                                    vVar.A = 1;
                                    vVar.g(0);
                                    l = q280Var.c.l(aVar, vVar);
                                }
                            } else {
                                i = f;
                            }
                            j3 = j4;
                            str = str4;
                            aVar = builder;
                            str2 = f3;
                            vVar = null;
                            if (vVar == null) {
                            }
                            vVar.h(8, true);
                            vVar.h(16, false);
                            vVar.n = false;
                            vVar.x = Constants.KEY_SERVICE;
                            vVar.m = -1;
                            vVar.A = 1;
                            vVar.g(0);
                            l = q280Var.c.l(aVar, vVar);
                        }
                        Notification notification = l;
                        if (notification != null) {
                            return new v180(i, notification, str, taxiOrder.h.getB(), orderNotification$OrderNotificationType);
                        }
                        return u180Var;
                    case 2:
                    case 3:
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType2 = OrderNotification$OrderNotificationType.ORDER;
                        a(str3, orderNotification$OrderNotificationType2, OrderNotification$OrderNotificationType.ORDER_INFORMATION);
                        int f4 = f(str3, orderNotification$OrderNotificationType2);
                        String p = taxiOrder.p();
                        String h3 = ((avj0) this.b).h(kyh0.taxischeduled_title);
                        RouteInfo routeInfo = taxiOrder.V().r;
                        if (routeInfo == null) {
                            calendar = taxiOrder.n();
                        } else {
                            int b3 = (int) routeInfo.getB();
                            Calendar a2 = wf7.a(Calendar.getInstance());
                            a2.add(13, b3);
                            a2.getTimeInMillis();
                            calendar = a2;
                        }
                        return new v180(f4, this.a.g(new n280(f4, str3, p, h3, calendar != null ? this.h.a(calendar, taxiOrder.N()) : null, z, orderNotification$OrderNotificationType2, 0L, false, 896)), str3, taxiOrder.h.getB(), orderNotification$OrderNotificationType2);
                    case 4:
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType3 = OrderNotification$OrderNotificationType.ORDER_DRIVING;
                        a(str3, orderNotification$OrderNotificationType3, OrderNotification$OrderNotificationType.TAXI_ARRIVING, OrderNotification$OrderNotificationType.UPDATE_REQUIREMENTS, OrderNotification$OrderNotificationType.ORDER_INFORMATION, OrderNotification$OrderNotificationType.ORDER_ALTERNATIVE_POINT_A_FOUND);
                        return j(orderNotification$OrderNotificationType3, taxiOrder, z, z2, orderForegroundNotificationOverrides);
                    case 5:
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType4 = OrderNotification$OrderNotificationType.ORDER_CHECK_IN;
                        a(str3, orderNotification$OrderNotificationType4, OrderNotification$OrderNotificationType.ORDER_INFORMATION);
                        return j(orderNotification$OrderNotificationType4, taxiOrder, z, z2, orderForegroundNotificationOverrides);
                    case 6:
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType5 = OrderNotification$OrderNotificationType.ORDER_WAITING;
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType6 = OrderNotification$OrderNotificationType.UPDATE_REQUIREMENTS;
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType7 = OrderNotification$OrderNotificationType.ORDER_INFORMATION;
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType8 = OrderNotification$OrderNotificationType.ORDER_WAITING_LIVE_UPDATES;
                        a(str3, orderNotification$OrderNotificationType5, orderNotification$OrderNotificationType6, orderNotification$OrderNotificationType7, orderNotification$OrderNotificationType8);
                        w180 j5 = j(orderNotification$OrderNotificationType5, taxiOrder, z, z2, orderForegroundNotificationOverrides);
                        v180 v180Var = j5 instanceof v180 ? (v180) j5 : null;
                        if (v180Var != null && ptb1.c(v180Var.c())) {
                            return j5;
                        }
                        j(orderNotification$OrderNotificationType8, taxiOrder, z, z2, orderForegroundNotificationOverrides);
                        return j5;
                    case 7:
                        return u180Var;
                    case 8:
                        i(taxiOrder, j2);
                        return u180Var;
                    case 9:
                    case 10:
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType9 = OrderNotification$OrderNotificationType.ORDER;
                        a(str3, orderNotification$OrderNotificationType9);
                        String str7 = taxiOrder.a;
                        String p2 = taxiOrder.p();
                        xh60 a3 = taxiOrder.V().P.a();
                        if (a3 != null) {
                            p pVar = (p) a3.a();
                            if (pVar instanceof DetailedCancelNotification) {
                                DetailedCancelNotification detailedCancelNotification = (DetailedCancelNotification) pVar;
                                if (detailedCancelNotification.a()) {
                                    z4 = detailedCancelNotification.getF();
                                }
                            }
                        }
                        if (!z4 && ((lzx0) ((qqo) this.l.a.getValue()).b()).b && !taxiOrder.l.getF()) {
                            int f5 = f(str7, orderNotification$OrderNotificationType9);
                            return new v180(f5, this.a.g(new n280(f5, str7, p2, g(taxiOrder), (String) null, this.d.f, orderNotification$OrderNotificationType9, j2, false, 768)), str7, taxiOrder.h.getB(), orderNotification$OrderNotificationType9);
                        }
                        return u180Var;
                    case 11:
                        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType10 = OrderNotification$OrderNotificationType.ORDER;
                        a(str3, orderNotification$OrderNotificationType10);
                        if (!taxiOrder.l.getF()) {
                            String str8 = taxiOrder.a;
                            String p3 = taxiOrder.p();
                            int f6 = f(str8, orderNotification$OrderNotificationType10);
                            return new v180(f6, this.a.g(new n280(f6, str8, p3, g(taxiOrder), (String) null, this.d.f, orderNotification$OrderNotificationType10, 0L, false, 896)), str8, taxiOrder.h.getB(), orderNotification$OrderNotificationType10);
                        }
                        return u180Var;
                    default:
                        unr0.D(new Object[]{b}, 1, "Unexpected order state [%s] for notification", jst.e, new IllegalStateException("Unexpected order state for notification"));
                        return u180Var;
                }
            }
        }
        z2 = true;
        if (j != 0) {
        }
        switch (x180.a[b.ordinal()]) {
        }
    }

    public final Notification l(int i, TaxiOrder taxiOrder, boolean z, boolean z2, OrderNotification$OrderNotificationType orderNotification$OrderNotificationType) {
        String a;
        String str = taxiOrder.a;
        String p = taxiOrder.p();
        ReorderInfo reorderInfo = taxiOrder.V().b;
        if (reorderInfo == null) {
            a = "";
        } else {
            ief iefVar = taxiOrder.V().K;
            a = this.i.a(iefVar != null ? gwk0.h(iefVar) : null, reorderInfo.getA(), true, true);
        }
        return this.a.h(new n280(i, str, p, a, (String) null, z, orderNotification$OrderNotificationType, 0L, false, 896), EmptyList.a, z2, taxiOrder);
    }

    public final void m(String str, String str2, String str3, String str4, String str5) {
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType;
        boolean equalsIgnoreCase = "prepaid_time_ends_now".equalsIgnoreCase(str3);
        q280 q280Var = this.a;
        if (equalsIgnoreCase) {
            q280Var.a(f(str, OrderNotification$OrderNotificationType.PREPAID_TIME_ENDS_SOON));
        }
        if (jl40.l(str3, "prepaid_time_ends_now")) {
            orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.PREPAID_TIME_ENDS_NOW;
        } else {
            if (!jl40.l(str3, "prepaid_time_ends_soon")) {
                jst.e.w(new IllegalArgumentException("Wrong notification type"));
                return;
            }
            orderNotification$OrderNotificationType = OrderNotification$OrderNotificationType.PREPAID_TIME_ENDS_SOON;
        }
        OrderNotification$OrderNotificationType orderNotification$OrderNotificationType2 = orderNotification$OrderNotificationType;
        q280Var.g(new n280(f(str, orderNotification$OrderNotificationType2), str, str2, str4, str5, true, orderNotification$OrderNotificationType2, 0L, false, 896));
    }
}
