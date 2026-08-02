package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.service.notification.StatusBarNotification;
import androidx.core.app.s0;
import com.yandex.messaging.internal.storage.experiments.ExperimentsDatabaseRoom;
import com.yandex.messaging.internal.storage.i;
import com.yandex.messenger.websdk.api.MessengerParams;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import yads.hm2;
import yads.w4;

/* loaded from: classes7.dex */
public final class w040 {
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public w040(Context context, ofc0 ofc0Var, tcc0 tcc0Var) {
        this.a = context;
        this.b = ofc0Var;
        this.c = tcc0Var;
        int i = 0;
        this.d = a.a(new agc0(i, this, new sfc0(14)));
        this.e = a.a(new agc0(i, this, new sfc0(15)));
        this.f = a.a(new agc0(i, this, new sfc0(16)));
        this.g = a.a(new agc0(i, this, new sfc0(17)));
        this.h = a.a(new agc0(i, this, new sfc0(18)));
    }

    public hn71 a() {
        f571 f571Var = (f571) this.f;
        d881 d881Var = (d881) this.a;
        fe81 fe81Var = (fe81) this.b;
        hn71 a = f571Var.a(fe81Var, d881Var);
        a.r(g771.a, "adapter");
        a271 a271Var = fe81Var.d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            a.r(jd81Var.a.b, "size_type");
            a.r(Integer.valueOf(jd81Var.b), "width");
            a.r(Integer.valueOf(jd81Var.c), "height");
        }
        gg81 gg81Var = (gg81) this.e;
        if (gg81Var != null) {
            a.r(gg81Var.R, "banner_size_calculation_type");
        }
        uio0 uio0Var = (uio0) this.h;
        return uio0Var != null ? fga1.a(a, uio0Var.b()) : a;
    }

    public hn71 b(a581 a581Var) {
        hn71 a = a();
        a.r(a581Var.a.b, CRLReasonCodeExtension.REASON);
        String str = a581Var.b;
        if (str != null && str.length() > 0) {
            a.r(str, "asset_name");
        }
        String str2 = a581Var.c;
        if (str2 != null && str2.length() > 0) {
            a.r(str2, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        }
        return a;
    }

    public void c(hm2 hm2Var, hn71 hn71Var) {
        zj71 zj71Var = new zj71(hm2Var, (Map) hn71Var.b, (no61) hn71Var.c);
        ((ge71) this.d).c(zj71Var);
        ((mj31) this.g).t(hm2Var, zj71Var.b, g771.a, (w4) this.c);
    }

    public LinkedHashMap d() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.g;
        Set keySet = linkedHashMap.keySet();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.e;
        keySet.removeAll(linkedHashMap2.keySet());
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.f;
        LinkedHashSet<String> U = kotlin.collections.a.U(linkedHashMap3.keySet(), linkedHashMap2.keySet());
        for (String str : U) {
            jl40.x("Cannot override flag " + str + "='" + linkedHashMap3.get(str) + "' with value '" + linkedHashMap2.get(str) + "'");
        }
        linkedHashMap2.keySet().removeAll(U);
        LinkedHashMap n = b.n(b.n(linkedHashMap, linkedHashMap2), linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry : n.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap4.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(gw00.d(linkedHashMap4.size()));
        for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
            linkedHashMap5.put(entry2.getKey(), (String) entry2.getValue());
        }
        return linkedHashMap5;
    }

    public void e() {
        ((Handler) this.a).getLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: cef0
            /* JADX WARN: Removed duplicated region for block: B:22:0x00ad A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:6:0x0038, B:8:0x0072, B:9:0x0075, B:11:0x0081, B:13:0x0086, B:15:0x008e, B:17:0x0092, B:22:0x00ad, B:26:0x009b, B:28:0x00a3, B:34:0x008c), top: B:5:0x0038 }] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[SYNTHETIC] */
            @Override // android.os.MessageQueue.IdleHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean queueIdle() {
                StatusBarNotification[] statusBarNotificationArr;
                uj60 b;
                boolean y;
                w040 w040Var = w040.this;
                z83.g(null, ((Handler) w040Var.a).getLooper(), Looper.myLooper());
                String string = ((SharedPreferences) w040Var.b).getString("logout_token", null);
                if (string != null) {
                    ((off0) ((h3y) w040Var.e).get()).a(string);
                }
                w220 w220Var = (w220) ((h3y) w040Var.g).get();
                s0 s0Var = w220Var.g;
                try {
                    w220Var.f.a();
                    w220Var.a(-1, "default_channel");
                    s0Var.b.getNotificationChannels().forEach(new qa0(12, w220Var));
                    piv0 piv0Var = (piv0) w220Var.e.get();
                    piv0Var.f.reportEvent("summary_notification_removed");
                    Handler handler = piv0Var.a;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(piv0Var.j, 200L);
                    pnt0 pnt0Var = piv0Var.k;
                    if (pnt0Var != null) {
                        pnt0Var.clear();
                    }
                    Object systemService = w220Var.a.getSystemService("notification");
                    NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                    if (notificationManager == null || (statusBarNotificationArr = notificationManager.getActiveNotifications()) == null) {
                        statusBarNotificationArr = new StatusBarNotification[0];
                    }
                    for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                        if (statusBarNotification.getId() != -1 && (b = otb1.b(statusBarNotification)) != null) {
                            y = evu0.y(b.b, "messenger-chat-v2", false);
                            if (!y) {
                                s0Var.a(statusBarNotification.getId(), statusBarNotification.getTag());
                                s0Var.c(statusBarNotification.getTag());
                            }
                        }
                        y = false;
                        if (!y) {
                        }
                    }
                } catch (Throwable th) {
                    w220Var.b.reportError("notification update error", th);
                }
                ((at2) ((h3y) w040Var.c).get()).flush();
                ((ExperimentsDatabaseRoom) ((h3y) w040Var.d).get()).flush();
                ((i) w040Var.h).d((String) w040Var.f);
                return false;
            }
        });
    }

    public b27 f() {
        return (b27) ((i3y) this.b).getValue();
    }

    public Pair g(boolean z) {
        Context context = (Context) this.a;
        return z ? new Pair(Integer.valueOf(context.getColor(yog0.video_pin_gradient_start)), Integer.valueOf(context.getColor(yog0.video_pin_gradient_end))) : new Pair(null, null);
    }

    public int h() {
        return ((Number) ((i3y) this.d).getValue()).intValue();
    }

    public int i() {
        return ((Number) ((i3y) this.h).getValue()).intValue();
    }

    public i3y j(sls slsVar) {
        return a.a(new agc0(1, this, slsVar));
    }

    public void k(ei41 ei41Var, String str) {
        String str2 = ei41Var.a;
        boolean z = ei41Var instanceof ei41;
        if (z && ei41Var.b) {
        } else if (!z || ei41Var.b) {
        }
    }

    public void l(fi41 fi41Var, String str) {
        String str2 = fi41Var.a;
        boolean z = fi41Var instanceof fi41;
        if (z && fi41Var.b) {
        } else if (!z || fi41Var.b) {
        }
    }

    public w040(Context context, d881 d881Var, fe81 fe81Var, v981 v981Var, w4 w4Var) {
        a081 a081Var;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        f571 f571Var = new f571();
        mj31 mj31Var = new mj31(context, 19);
        this.a = d881Var;
        this.b = fe81Var;
        this.c = w4Var;
        this.d = b;
        this.e = a;
        this.f = f571Var;
        this.g = mj31Var;
    }

    public w040(Context context, tcc0 tcc0Var) {
        this.a = context;
        this.b = tcc0Var;
        this.c = j(new sfc0(19));
        this.d = j(new sfc0(20));
        this.e = j(new sfc0(21));
        this.f = j(new sfc0(22));
        this.g = j(new sfc0(23));
        this.h = j(new sfc0(24));
    }

    public /* synthetic */ w040(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
    }

    public w040(Handler handler, SharedPreferences sharedPreferences, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, String str, h3y h3yVar4, i iVar) {
        this.a = handler;
        this.b = sharedPreferences;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = str;
        this.g = h3yVar4;
        this.h = iVar;
        tje.e();
    }

    public w040(qhd0 qhd0Var) {
        final int i = 0;
        this.a = a.a(new sls(this) { // from class: kqa0
            public final /* synthetic */ w040 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                w040 w040Var = this.b;
                switch (i2) {
                    case 0:
                        return new v17((zm) ((i3y) w040Var.e).getValue());
                    case 1:
                        return new iht();
                    case 2:
                        return new b27((bn) ((i3y) w040Var.f).getValue());
                    case 3:
                        ls90 ls90Var = (ls90) w040Var.d;
                        return new zm(new g191(ls90Var), new b42((oo2) w040Var.c, ls90Var, (DecimalFormat) ((i3y) w040Var.g).getValue()), new y42());
                    default:
                        ls90 ls90Var2 = (ls90) w040Var.d;
                        return new bn(new zch(ls90Var2), new b42((oo2) w040Var.c, ls90Var2, (DecimalFormat) ((i3y) w040Var.g).getValue()), new kcj());
                }
            }
        });
        final int i2 = 2;
        this.b = a.a(new sls(this) { // from class: kqa0
            public final /* synthetic */ w040 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                w040 w040Var = this.b;
                switch (i22) {
                    case 0:
                        return new v17((zm) ((i3y) w040Var.e).getValue());
                    case 1:
                        return new iht();
                    case 2:
                        return new b27((bn) ((i3y) w040Var.f).getValue());
                    case 3:
                        ls90 ls90Var = (ls90) w040Var.d;
                        return new zm(new g191(ls90Var), new b42((oo2) w040Var.c, ls90Var, (DecimalFormat) ((i3y) w040Var.g).getValue()), new y42());
                    default:
                        ls90 ls90Var2 = (ls90) w040Var.d;
                        return new bn(new zch(ls90Var2), new b42((oo2) w040Var.c, ls90Var2, (DecimalFormat) ((i3y) w040Var.g).getValue()), new kcj());
                }
            }
        });
        this.c = qhd0Var.a;
        this.d = (ls90) qhd0Var.b;
        final int i3 = 3;
        this.e = a.a(new sls(this) { // from class: kqa0
            public final /* synthetic */ w040 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                w040 w040Var = this.b;
                switch (i22) {
                    case 0:
                        return new v17((zm) ((i3y) w040Var.e).getValue());
                    case 1:
                        return new iht();
                    case 2:
                        return new b27((bn) ((i3y) w040Var.f).getValue());
                    case 3:
                        ls90 ls90Var = (ls90) w040Var.d;
                        return new zm(new g191(ls90Var), new b42((oo2) w040Var.c, ls90Var, (DecimalFormat) ((i3y) w040Var.g).getValue()), new y42());
                    default:
                        ls90 ls90Var2 = (ls90) w040Var.d;
                        return new bn(new zch(ls90Var2), new b42((oo2) w040Var.c, ls90Var2, (DecimalFormat) ((i3y) w040Var.g).getValue()), new kcj());
                }
            }
        });
        final int i4 = 4;
        this.f = a.a(new sls(this) { // from class: kqa0
            public final /* synthetic */ w040 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                w040 w040Var = this.b;
                switch (i22) {
                    case 0:
                        return new v17((zm) ((i3y) w040Var.e).getValue());
                    case 1:
                        return new iht();
                    case 2:
                        return new b27((bn) ((i3y) w040Var.f).getValue());
                    case 3:
                        ls90 ls90Var = (ls90) w040Var.d;
                        return new zm(new g191(ls90Var), new b42((oo2) w040Var.c, ls90Var, (DecimalFormat) ((i3y) w040Var.g).getValue()), new y42());
                    default:
                        ls90 ls90Var2 = (ls90) w040Var.d;
                        return new bn(new zch(ls90Var2), new b42((oo2) w040Var.c, ls90Var2, (DecimalFormat) ((i3y) w040Var.g).getValue()), new kcj());
                }
            }
        });
        this.g = a.a(new t7a0(21));
        this.h = a.a(new t7a0(this));
        final int i5 = 1;
        new sls(this) { // from class: kqa0
            public final /* synthetic */ w040 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                w040 w040Var = this.b;
                switch (i22) {
                    case 0:
                        return new v17((zm) ((i3y) w040Var.e).getValue());
                    case 1:
                        return new iht();
                    case 2:
                        return new b27((bn) ((i3y) w040Var.f).getValue());
                    case 3:
                        ls90 ls90Var = (ls90) w040Var.d;
                        return new zm(new g191(ls90Var), new b42((oo2) w040Var.c, ls90Var, (DecimalFormat) ((i3y) w040Var.g).getValue()), new y42());
                    default:
                        ls90 ls90Var2 = (ls90) w040Var.d;
                        return new bn(new zch(ls90Var2), new b42((oo2) w040Var.c, ls90Var2, (DecimalFormat) ((i3y) w040Var.g).getValue()), new kcj());
                }
            }
        };
    }

    public w040(j7g j7gVar, j7g j7gVar2, j7g j7gVar3, k7g k7gVar, k7g k7gVar2, fy30 fy30Var, xvf0 xvf0Var, k7g k7gVar3) {
        this.a = j7gVar;
        this.b = j7gVar2;
        this.c = j7gVar3;
        this.d = k7gVar;
        this.e = k7gVar2;
        this.g = fy30Var;
        this.f = xvf0Var;
        this.h = k7gVar3;
    }

    public w040(g680 g680Var, j3g j3gVar, xvf0 xvf0Var, j3g j3gVar2, j3g j3gVar3, j3g j3gVar4, j3g j3gVar5, f380 f380Var) {
        this.b = g680Var;
        this.c = j3gVar;
        this.a = xvf0Var;
        this.d = j3gVar2;
        this.e = j3gVar3;
        this.f = j3gVar4;
        this.g = j3gVar5;
        this.h = f380Var;
    }

    public w040(y101 y101Var, fg01 fg01Var, fg01 fg01Var2, fg01 fg01Var3, nbg nbgVar, y501 y501Var, ibz0 ibz0Var, nbg nbgVar2) {
        this.d = y101Var;
        this.e = fg01Var;
        this.f = fg01Var2;
        this.g = fg01Var3;
        this.a = nbgVar;
        this.b = y501Var;
        this.h = ibz0Var;
        this.c = nbgVar2;
    }

    public w040(t0g t0gVar, mw8 mw8Var, z6x0 z6x0Var, rct0 rct0Var, xvf0 xvf0Var, w0g w0gVar, a1g a1gVar, u0g u0gVar) {
        this.d = t0gVar;
        this.e = mw8Var;
        this.f = z6x0Var;
        this.g = rct0Var;
        this.a = xvf0Var;
        this.h = w0gVar;
        this.b = a1gVar;
        this.c = u0gVar;
    }

    public w040(xvf0 xvf0Var, c7g c7gVar, cta0 cta0Var, gaq0 gaq0Var, b7g b7gVar, xvf0 xvf0Var2, c7g c7gVar2, c7g c7gVar3) {
        this.a = xvf0Var;
        this.b = c7gVar;
        this.c = cta0Var;
        this.g = gaq0Var;
        this.d = b7gVar;
        this.e = xvf0Var2;
        this.f = c7gVar2;
        this.h = c7gVar3;
    }

    public w040(cys0 cys0Var, o9g o9gVar, o9g o9gVar2, o9g o9gVar3, pst0 pst0Var, xvf0 xvf0Var, o9g o9gVar4, xvf0 xvf0Var2) {
        this.c = cys0Var;
        this.d = o9gVar;
        this.e = o9gVar2;
        this.f = o9gVar3;
        this.g = pst0Var;
        this.a = xvf0Var;
        this.h = o9gVar4;
        this.b = xvf0Var2;
    }

    public w040(a441 a441Var, MessengerParams messengerParams) {
        this.h = a441Var;
        this.a = messengerParams;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
    }
}
