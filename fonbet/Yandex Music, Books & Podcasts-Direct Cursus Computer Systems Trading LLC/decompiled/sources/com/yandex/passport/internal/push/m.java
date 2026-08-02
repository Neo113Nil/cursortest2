package com.yandex.passport.internal.push;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.passport.R;
import com.yandex.passport.data.network.k7;
import com.yandex.passport.internal.report.ce;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ia;
import com.yandex.passport.internal.report.ja;
import com.yandex.passport.internal.report.ka;
import com.yandex.passport.internal.report.ta;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.ya;
import com.yandex.passport.internal.report.za;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.gld;
import defpackage.nm6;
import defpackage.odq;
import defpackage.oh3;
import defpackage.qdq;
import defpackage.qgg;
import defpackage.r1w;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.uah;
import defpackage.wzv;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {
    public final Context a;
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.report.reporters.w0 c;
    public final com.yandex.passport.internal.report.reporters.z0 d;
    public final com.yandex.passport.common.analytics.f e;
    public final com.yandex.passport.common.common.a f;
    public final s0 g;
    public final k7 h;
    public final d0 i;
    public final com.yandex.passport.common.coroutine.a j;
    public final com.yandex.passport.internal.flags.i k;
    public final com.yandex.passport.internal.network.mappers.b l;
    public final i0 m;
    public final l0 n;
    public final f0 o;
    public final p p;
    public final com.yandex.passport.internal.usecase.e0 q;
    public final com.yandex.passport.internal.report.reporters.v0 r;
    public final androidx.core.app.u0 s;
    public final Object t;

    public m(Context context, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.report.reporters.w0 w0Var, com.yandex.passport.internal.report.reporters.z0 z0Var, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.common.common.a aVar, s0 s0Var, k7 k7Var, d0 d0Var, com.yandex.passport.common.coroutine.a aVar2, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.network.mappers.b bVar, i0 i0Var, l0 l0Var, f0 f0Var, p pVar, com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.internal.report.reporters.v0 v0Var) {
        context.getClass();
        eVar.getClass();
        w0Var.getClass();
        z0Var.getClass();
        fVar.getClass();
        aVar.getClass();
        s0Var.getClass();
        k7Var.getClass();
        d0Var.getClass();
        aVar2.getClass();
        iVar.getClass();
        bVar.getClass();
        i0Var.getClass();
        l0Var.getClass();
        f0Var.getClass();
        pVar.getClass();
        e0Var.getClass();
        v0Var.getClass();
        this.a = context;
        this.b = eVar;
        this.c = w0Var;
        this.d = z0Var;
        this.e = fVar;
        this.f = aVar;
        this.g = s0Var;
        this.h = k7Var;
        this.i = d0Var;
        this.j = aVar2;
        this.k = iVar;
        this.l = bVar;
        this.m = i0Var;
        this.n = l0Var;
        this.o = f0Var;
        this.p = pVar;
        this.q = e0Var;
        this.r = v0Var;
        this.s = new androidx.core.app.u0(context);
        this.t = uah.e(new Pair("sign_in_notification_channel_id", context.getString(R.string.passport_am_name_notification_channel_sign_in)), new Pair("account_security_notification_channel_id", context.getString(R.string.passport_am_name_notification_channel_account_security)), new Pair("com.yandex.passport", context.getString(R.string.passport_am_name_notification_channel_family)), new Pair("miscellaneous_notification_channel_id", context.getString(R.string.passport_am_name_notification_channel_miscellaneous)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (r5.b == 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, h0 h0Var, cg6 cg6Var) {
        j jVar;
        int i;
        androidx.core.app.w wVar;
        mVar.getClass();
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.j;
                Object obj2 = nm6.a;
                i = jVar2.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return null;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return null;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.passport.internal.l k = mVar.k(m0.f(h0Var), h0Var.f);
                if (k != null) {
                    Boolean bool = h0Var.t;
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.d(bool, bool2)) {
                        jVar2.l = 1;
                        if (mVar.j(k, h0Var, jVar2) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (!Intrinsics.d(h0Var.q, bool2) || h0Var.p == null) {
                            mVar.i(k, h0Var, null);
                            return null;
                        }
                        if (((Boolean) mVar.k.b(com.yandex.passport.internal.flags.o.j0)).booleanValue()) {
                            if (!Intrinsics.d(h0Var.l, bool2)) {
                                d0 d0Var = mVar.i;
                                d0Var.getClass();
                                androidx.core.app.u0 u0Var = d0Var.a;
                                if (u0Var.b.areNotificationsEnabled()) {
                                    androidx.core.app.y a = q.a(u0Var);
                                    if (a != null && a.c) {
                                        return h0Var;
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        NotificationChannel b = u0Var.b("sign_in_notification_channel_id");
                                        if (b != null) {
                                            wVar = new androidx.core.app.w(b);
                                            if (wVar != null) {
                                            }
                                        }
                                    } else {
                                        u0Var.getClass();
                                    }
                                    wVar = null;
                                    if (wVar != null) {
                                    }
                                }
                            }
                            return h0Var;
                        }
                        String str = h0Var.p;
                        jVar2.l = 2;
                        Object Q = gld.Q(new oh3(mVar, k, str, h0Var, (Continuation) null, 9), jVar2);
                        if (Q != obj2) {
                            Q = Unit.a;
                        }
                        if (Q == obj2) {
                        }
                    }
                }
                return null;
            }
        }
        jVar = new j(mVar, cg6Var);
        j jVar22 = jVar;
        Object obj3 = jVar22.j;
        Object obj22 = nm6.a;
        i = jVar22.l;
        if (i == 0) {
        }
    }

    public static final void b(m mVar, h0 h0Var, com.yandex.passport.internal.l lVar) {
        StatusBarNotification[] activeNotifications = mVar.s.b.getActiveNotifications();
        Iterable arrayList = activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        arrayList.getClass();
        Iterable iterable = arrayList;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((StatusBarNotification) it.next()).getId() == ((int) (h0Var.e / 1000))) {
                    return;
                }
            }
        }
        com.yandex.passport.internal.report.reporters.w0 w0Var = mVar.c;
        com.yandex.passport.common.core.f fVar = lVar.b;
        String h = mVar.h();
        if (h == null) {
            h = null;
        }
        if (h == null) {
            h = "";
        }
        String a = ((com.yandex.passport.internal.common.d) mVar.f).a();
        String str = h0Var.g;
        String str2 = h0Var.p;
        String str3 = h0Var.a;
        w0Var.getClass();
        fVar.getClass();
        a.getClass();
        w0Var.n(ta.d, new ff(fVar), new com.yandex.passport.internal.report.a(h, 22), new com.yandex.passport.internal.report.a(a, 1), new ve(str, 11), new ff(str2, 14), new ve(str3, 13));
        mVar.i(lVar, h0Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(m mVar, c0 c0Var, cg6 cg6Var) {
        l lVar;
        int i;
        com.yandex.passport.internal.l k;
        androidx.core.app.f0 f0Var;
        c0 c0Var2 = c0Var;
        mVar.getClass();
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.n = i2 - Integer.MIN_VALUE;
                l lVar2 = lVar;
                Object obj = lVar2.l;
                nm6 nm6Var = nm6.a;
                i = lVar2.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    k = mVar.k(m0.e(c0Var2), c0Var2.a);
                    if (k == null) {
                        return Boolean.FALSE;
                    }
                    wzv wzvVar = new wzv(mVar, c0Var2, k, continuation, 29);
                    lVar2.j = c0Var2;
                    lVar2.k = k;
                    lVar2.n = 1;
                    obj = tyf.L(com.yandex.passport.common.time.a.a(0, 2, 0), wzvVar, lVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.internal.l lVar3 = lVar2.k;
                    c0 c0Var3 = lVar2.j;
                    qgg.h0(obj);
                    k = lVar3;
                    c0Var2 = c0Var3;
                }
                f0Var = (androidx.core.app.f0) obj;
                if (f0Var != null) {
                    return Boolean.FALSE;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    String g = g(c0Var2.f);
                    mVar.f(g);
                    f0Var.E = g;
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "show push with id " + c0Var2.r, 8);
                }
                mVar.s.d(com.yandex.passport.internal.ui.a.a, c0Var2.r, f0Var.b());
                com.yandex.passport.internal.report.reporters.w0 w0Var = mVar.c;
                com.yandex.passport.common.core.f fVar = k.b;
                String str = c0Var2.d;
                String str2 = c0Var2.f;
                String str3 = c0Var2.e;
                String h = mVar.h();
                if (h == null) {
                    h = "";
                }
                w0Var.v(fVar, str, str2, str3, h, ((com.yandex.passport.internal.common.d) mVar.f).a(), c0Var2.g, c0Var2.c, c0Var2.b, c0Var2.d);
                return Boolean.TRUE;
            }
        }
        lVar = new l(mVar, cg6Var);
        l lVar22 = lVar;
        Object obj2 = lVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = lVar22.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        f0Var = (androidx.core.app.f0) obj2;
        if (f0Var != null) {
        }
    }

    public static String g(String str) {
        if (str == null) {
            return "miscellaneous_notification_channel_id";
        }
        switch (str.hashCode()) {
            case -1316330898:
                return !str.equals("account_modification") ? "miscellaneous_notification_channel_id" : "account_security_notification_channel_id";
            case -1281860764:
                return !str.equals("family") ? "miscellaneous_notification_channel_id" : "com.yandex.passport";
            case 51309:
                return !str.equals("2fa") ? "miscellaneous_notification_channel_id" : "sign_in_notification_channel_id";
            case 799074637:
                return !str.equals("family_pay") ? "miscellaneous_notification_channel_id" : "com.yandex.passport";
            case 927471105:
                return !str.equals("login_notification") ? "miscellaneous_notification_channel_id" : "account_security_notification_channel_id";
            case 1287505377:
                return !str.equals("suggest_by_phone") ? "miscellaneous_notification_channel_id" : "sign_in_notification_channel_id";
            default:
                return "miscellaneous_notification_channel_id";
        }
    }

    public final void d(int i) {
        try {
            r7o r7oVar = z7o.b;
            this.s.b.cancel(com.yandex.passport.internal.ui.a.a, i);
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "push with id " + i + " canceled", 8);
            }
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public final void e() {
        Object t7oVar;
        Context context;
        androidx.core.app.u0 u0Var;
        try {
            r7o r7oVar = z7o.b;
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = this.t.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    context = this.a;
                    u0Var = this.s;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    String str2 = (String) value;
                    NotificationChannel b = u0Var.b(str);
                    if (b == null) {
                        f(str);
                    } else if (!Intrinsics.d(b.getName(), str2)) {
                        b.setName(str2);
                        b.setDescription(str2);
                        u0Var.a(b);
                        if (Intrinsics.d(str, "com.yandex.passport") && b.getGroup() == null) {
                            if (q.a(u0Var) == null) {
                                i.b();
                                NotificationChannelGroup a = i.a(context.getString(R.string.passport_am_name_notification_channel_group_yandex_id));
                                if (Build.VERSION.SDK_INT >= 26) {
                                    androidx.core.app.u.e(u0Var.b, a);
                                }
                            }
                            if (b.getImportance() > 3) {
                                b.setImportance(3);
                            }
                            b.setGroup("passport_channel_group_id");
                            u0Var.a(b);
                        }
                    }
                }
                androidx.core.app.y a2 = q.a(u0Var);
                if (a2 != null) {
                    String string = context.getString(R.string.passport_am_name_notification_channel_group_yandex_id);
                    string.getClass();
                    if (!Intrinsics.d(a2.b, string)) {
                        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup("passport_channel_group_id", string);
                        if (Build.VERSION.SDK_INT >= 26) {
                            androidx.core.app.u.e(u0Var.b, notificationChannelGroup);
                        }
                    }
                }
            }
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a3 = z7o.a(t7oVar);
        if (a3 != null) {
            com.yandex.passport.internal.report.reporters.w0 w0Var = this.c;
            w0Var.getClass();
            w0Var.n(ia.d, new ff(a3), new ue(a3));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final boolean f(String str) {
        int i;
        androidx.core.app.u0 u0Var = this.s;
        str.getClass();
        try {
            String str2 = (String) this.t.get(str);
            if (u0Var.b(str) == null) {
                if (q.a(u0Var) == null) {
                    i.b();
                    NotificationChannelGroup a = i.a(this.a.getString(R.string.passport_am_name_notification_channel_group_yandex_id));
                    if (Build.VERSION.SDK_INT >= 26) {
                        androidx.core.app.u.e(u0Var.b, a);
                    }
                }
                if (!str.equals("com.yandex.passport") && !str.equals("miscellaneous_notification_channel_id")) {
                    i = 4;
                    NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
                    notificationChannel.setDescription(str2);
                    notificationChannel.enableLights(true);
                    notificationChannel.setLightColor(-65536);
                    notificationChannel.setGroup("passport_channel_group_id");
                    notificationChannel.setLockscreenVisibility(!str.equals("sign_in_notification_channel_id") ? 1 : 0);
                    u0Var.a(notificationChannel);
                }
                i = 3;
                NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, i);
                notificationChannel2.setDescription(str2);
                notificationChannel2.enableLights(true);
                notificationChannel2.setLightColor(-65536);
                notificationChannel2.setGroup("passport_channel_group_id");
                notificationChannel2.setLockscreenVisibility(!str.equals("sign_in_notification_channel_id") ? 1 : 0);
                u0Var.a(notificationChannel2);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String h() {
        Object B = com.yandex.passport.internal.ui.a.B(new r1w(this, null, 15));
        r7o r7oVar = z7o.b;
        if (B instanceof t7o) {
            B = null;
        }
        com.yandex.passport.common.value.a aVar = (com.yandex.passport.common.value.a) B;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033a  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(com.yandex.passport.internal.l lVar, h0 h0Var, String str) {
        long j;
        Pair pair;
        String str2;
        com.yandex.passport.common.common.a aVar;
        String str3;
        int i;
        com.yandex.passport.internal.flags.a aVar2;
        com.yandex.passport.internal.flags.i iVar;
        boolean z;
        String str4;
        long j2 = h0Var.e;
        long j3 = 1000;
        int i2 = (int) (j2 / j3);
        String str5 = h0Var.p;
        String str6 = h0Var.h;
        String str7 = h0Var.g;
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        String str8 = h0Var.o;
        String str9 = h0Var.i;
        if (str8 == null || str == null) {
            j = j3;
            pair = new Pair(str9, str9);
        } else {
            j = j3;
            try {
                pair = new Pair(String.format(str8, Arrays.copyOf(new Object[]{str}, 1)), str8);
            } catch (Exception unused) {
                pair = new Pair(str9, str9);
            }
        }
        String str10 = (String) pair.a;
        String str11 = (String) pair.b;
        Context context = this.a;
        androidx.core.app.f0 f0Var = new androidx.core.app.f0(context, context.getPackageName());
        m(f0Var);
        f0Var.e = androidx.core.app.f0.c(str6);
        f0Var.g(16, true);
        f0Var.j(defaultUri);
        com.yandex.passport.common.core.f fVar = lVar.b;
        f0 f0Var2 = this.o;
        f0Var2.getClass();
        fVar.getClass();
        f0Var.g = f0Var2.a(((int) (j2 / j)) * 2, f0Var2.d(f0Var2.e(fVar, h0Var.m, h0Var.s)));
        f0Var.k = 1;
        PendingIntent c = this.o.c(this.a, i2, str11, lVar.b, h0Var.g, h0Var.p, h0Var.a);
        Notification notification = f0Var.K;
        notification.deleteIntent = c;
        notification.when = j2;
        f0Var.g(8, true);
        l(f0Var);
        if (Intrinsics.d(h0Var.q, Boolean.TRUE) && str != null) {
            int i3 = R.drawable.passport_ic_copy;
            String string = context.getString(R.string.passport_copy_to_clipboard_description);
            Intent putExtra = new Intent(context, (Class<?>) NotificationCodeCopyReceiver.class).setAction("com.yandex.passport.NOTIFICATION_CODE_COPY").putExtra("code", str);
            putExtra.getClass();
            f0Var.a(i3, string, PendingIntent.getBroadcast(context, i2, putExtra, 67108864));
        }
        int i4 = Build.VERSION.SDK_INT;
        androidx.core.app.u0 u0Var = this.s;
        com.yandex.passport.common.common.a aVar3 = this.f;
        if (i4 >= 26) {
            String g = g(h0Var.c);
            if (!f(g)) {
                Iterator it = this.t.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str4 = null;
                        break;
                    } else {
                        str4 = (String) it.next();
                        if (u0Var.b(str4) != null) {
                            break;
                        }
                    }
                }
                i = 0;
                com.yandex.passport.internal.report.reporters.w0 w0Var = this.c;
                if (str4 != null) {
                    String h = h();
                    if (h == null) {
                        h = null;
                    }
                    String str12 = h == null ? "" : h;
                    String a = ((com.yandex.passport.internal.common.d) aVar3).a();
                    w0Var.getClass();
                    fVar.getClass();
                    a.getClass();
                    aVar = aVar3;
                    str3 = "";
                    w0Var.n(ka.d, new com.yandex.passport.internal.report.c("fallback_channel", str4), new ff(fVar), new com.yandex.passport.internal.report.a(str12, 22), new com.yandex.passport.internal.report.a(a, 1), new ve(str7, 11), new ff(str5, 14));
                    f0Var.E = str4;
                    str2 = str7;
                } else {
                    aVar = aVar3;
                    str3 = "";
                    String h2 = h();
                    if (h2 == null) {
                        h2 = null;
                    }
                    if (h2 == null) {
                        h2 = str3;
                    }
                    String a2 = ((com.yandex.passport.internal.common.d) aVar).a();
                    w0Var.getClass();
                    fVar.getClass();
                    a2.getClass();
                    str2 = str7;
                    w0Var.n(ja.d, new ff(fVar), new com.yandex.passport.internal.report.a(h2, 22), new com.yandex.passport.internal.report.a(a2, 1), new ve(str7, 11), new ff(str5, 14));
                }
                f0Var.f = androidx.core.app.f0.c(str9);
                androidx.core.app.d0 d0Var = new androidx.core.app.d0();
                d0Var.b = androidx.core.app.f0.c(str9);
                f0Var.k(d0Var);
                Notification b = f0Var.b();
                b.getClass();
                f0Var.f = androidx.core.app.f0.c(str10);
                androidx.core.app.d0 d0Var2 = new androidx.core.app.d0();
                d0Var2.b = androidx.core.app.f0.c(str10);
                f0Var.k(d0Var2);
                f0Var.B = i;
                f0Var.C = b;
                aVar2 = com.yandex.passport.internal.flags.o.m0;
                iVar = this.k;
                if (((Boolean) iVar.b(aVar2)).booleanValue()) {
                    IconCompat b2 = IconCompat.b(context, R.drawable.passport_big_id_notification);
                    androidx.core.app.z0 z0Var = new androidx.core.app.z0();
                    String str13 = str6;
                    z0Var.a = str13;
                    z0Var.b = b2;
                    String str14 = str2 == null ? str3 : str2;
                    if (str13 == null) {
                        str13 = str3;
                    }
                    int i5 = R.drawable.passport_big_id_notification;
                    Intent intent = new Intent(context, (Class<?>) WebCardSlothActivity.class);
                    intent.setAction("WEB_CARD_SHORTCUT");
                    odq odqVar = new odq();
                    odqVar.a = context;
                    odqVar.b = str14;
                    odqVar.c = new Intent[]{intent};
                    odqVar.d = str13;
                    odqVar.f = new androidx.core.app.z0[]{z0Var};
                    odqVar.e = IconCompat.b(context, i5);
                    if (TextUtils.isEmpty(odqVar.d)) {
                        xq0.x("Shortcut must have a non-empty label");
                        return;
                    }
                    Intent[] intentArr = odqVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        xq0.x("Shortcut must have an intent");
                        return;
                    }
                    qdq.E(context, odqVar);
                    androidx.core.app.m0 m0Var = new androidx.core.app.m0(z0Var);
                    androidx.core.app.l0 l0Var = new androidx.core.app.l0(str9, System.currentTimeMillis(), z0Var);
                    ArrayList arrayList = m0Var.b;
                    arrayList.add(l0Var);
                    if (arrayList.size() > 25) {
                        z = false;
                        arrayList.remove(0);
                    } else {
                        z = false;
                    }
                    f0Var.k(m0Var);
                    f0Var.F = str2 == null ? str3 : str2;
                    notification.icon = R.drawable.passport_lock_notification;
                    f0Var.w = z;
                    f0Var.x = true;
                    f0Var.A = context.getColor(android.R.color.darker_gray);
                }
                Notification b3 = f0Var.b();
                b3.getClass();
                u0Var.d(com.yandex.passport.internal.ui.a.a, i2, b3);
                if (((Boolean) iVar.b(aVar2)).booleanValue()) {
                    qdq.I(context, t75.c(str2 == null ? str3 : str2));
                }
                com.yandex.passport.common.core.f fVar2 = lVar.b;
                String str15 = h0Var.a;
                String str16 = h0Var.c;
                String str17 = h0Var.d;
                String h3 = h();
                this.c.v(fVar2, str15, str16, str17, h3 != null ? str3 : h3, ((com.yandex.passport.internal.common.d) aVar).a(), str11, h0Var.g, h0Var.p, h0Var.a);
            }
            f0Var.E = g;
        }
        str2 = str7;
        aVar = aVar3;
        str3 = "";
        i = 0;
        f0Var.f = androidx.core.app.f0.c(str9);
        androidx.core.app.d0 d0Var3 = new androidx.core.app.d0();
        d0Var3.b = androidx.core.app.f0.c(str9);
        f0Var.k(d0Var3);
        Notification b4 = f0Var.b();
        b4.getClass();
        f0Var.f = androidx.core.app.f0.c(str10);
        androidx.core.app.d0 d0Var22 = new androidx.core.app.d0();
        d0Var22.b = androidx.core.app.f0.c(str10);
        f0Var.k(d0Var22);
        f0Var.B = i;
        f0Var.C = b4;
        aVar2 = com.yandex.passport.internal.flags.o.m0;
        iVar = this.k;
        if (((Boolean) iVar.b(aVar2)).booleanValue()) {
        }
        Notification b32 = f0Var.b();
        b32.getClass();
        u0Var.d(com.yandex.passport.internal.ui.a.a, i2, b32);
        if (((Boolean) iVar.b(aVar2)).booleanValue()) {
        }
        com.yandex.passport.common.core.f fVar22 = lVar.b;
        String str152 = h0Var.a;
        String str162 = h0Var.c;
        String str172 = h0Var.d;
        String h32 = h();
        this.c.v(fVar22, str152, str162, str172, h32 != null ? str3 : h32, ((com.yandex.passport.internal.common.d) aVar).a(), str11, h0Var.g, h0Var.p, h0Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(com.yandex.passport.internal.l lVar, h0 h0Var, cg6 cg6Var) {
        k kVar;
        int i;
        String str;
        int i2;
        Throwable a;
        com.yandex.passport.internal.l lVar2 = lVar;
        h0 h0Var2 = h0Var;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i3 = kVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.n = i3 - Integer.MIN_VALUE;
                Object obj = kVar.l;
                nm6 nm6Var = nm6.a;
                i = kVar.n;
                com.yandex.passport.internal.report.reporters.v0 v0Var = this.r;
                if (i != 0) {
                    qgg.h0(obj);
                    Boolean bool = h0Var2.u;
                    str = h0Var2.m;
                    if (Intrinsics.d(bool, Boolean.TRUE)) {
                        com.yandex.passport.internal.usecase.a0 a0Var = new com.yandex.passport.internal.usecase.a0(lVar2);
                        str.getClass();
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0((com.yandex.passport.internal.ui.a) a0Var, (Locale) null, str, (String) null, false, (Map) e5bVar, com.yandex.passport.common.core.c.a);
                        kVar.j = lVar2;
                        kVar.k = h0Var2;
                        kVar.n = 1;
                        obj = this.q.g(c0Var, kVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    int i4 = (int) (h0Var2.e / 1000);
                    String str2 = h0Var2.i;
                    Uri defaultUri = RingtoneManager.getDefaultUri(2);
                    Context context = this.a;
                    androidx.core.app.f0 f0Var = new androidx.core.app.f0(context, context.getPackageName());
                    m(f0Var);
                    f0Var.e = androidx.core.app.f0.c(h0Var2.h);
                    f0Var.f = androidx.core.app.f0.c(str2);
                    androidx.core.app.d0 d0Var = new androidx.core.app.d0();
                    d0Var.b = androidx.core.app.f0.c(str2);
                    f0Var.k(d0Var);
                    f0Var.g(16, true);
                    f0Var.j(defaultUri);
                    f0 f0Var2 = this.o;
                    f0Var2.getClass();
                    str.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        intent.addFlags(268437504);
                    }
                    PendingIntent activity = PendingIntent.getActivity(f0Var2.a, i4, intent, 1140850688);
                    activity.getClass();
                    f0Var.g = activity;
                    f0Var.k = 1;
                    PendingIntent c = this.o.c(this.a, i4, h0Var2.i, lVar2.b, h0Var2.g, h0Var2.p, h0Var2.a);
                    Notification notification = f0Var.K;
                    notification.deleteIntent = c;
                    notification.when = h0Var2.e;
                    f0Var.g(8, true);
                    l(f0Var);
                    f0Var.B = 1;
                    if (i2 >= 26) {
                        String g = g(h0Var2.c);
                        f(g);
                        f0Var.E = g;
                    }
                    this.s.d(com.yandex.passport.internal.ui.a.a, i4, f0Var.b());
                    com.yandex.passport.common.core.f fVar = lVar2.b;
                    v0Var.getClass();
                    fVar.getClass();
                    v0Var.o(za.d, fVar);
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h0 h0Var3 = kVar.k;
                com.yandex.passport.internal.l lVar3 = kVar.j;
                qgg.h0(obj);
                h0Var2 = h0Var3;
                lVar2 = lVar3;
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a == null) {
                    com.yandex.passport.common.core.f fVar2 = lVar2.b;
                    v0Var.getClass();
                    fVar2.getClass();
                    v0Var.n(ya.d, new ff(fVar2), new ue(a));
                    return Unit.a;
                }
                str = ((com.yandex.passport.common.url.b) obj2).a;
                int i42 = (int) (h0Var2.e / 1000);
                String str22 = h0Var2.i;
                Uri defaultUri2 = RingtoneManager.getDefaultUri(2);
                Context context2 = this.a;
                androidx.core.app.f0 f0Var3 = new androidx.core.app.f0(context2, context2.getPackageName());
                m(f0Var3);
                f0Var3.e = androidx.core.app.f0.c(h0Var2.h);
                f0Var3.f = androidx.core.app.f0.c(str22);
                androidx.core.app.d0 d0Var2 = new androidx.core.app.d0();
                d0Var2.b = androidx.core.app.f0.c(str22);
                f0Var3.k(d0Var2);
                f0Var3.g(16, true);
                f0Var3.j(defaultUri2);
                f0 f0Var22 = this.o;
                f0Var22.getClass();
                str.getClass();
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                }
                PendingIntent activity2 = PendingIntent.getActivity(f0Var22.a, i42, intent2, 1140850688);
                activity2.getClass();
                f0Var3.g = activity2;
                f0Var3.k = 1;
                PendingIntent c2 = this.o.c(this.a, i42, h0Var2.i, lVar2.b, h0Var2.g, h0Var2.p, h0Var2.a);
                Notification notification2 = f0Var3.K;
                notification2.deleteIntent = c2;
                notification2.when = h0Var2.e;
                f0Var3.g(8, true);
                l(f0Var3);
                f0Var3.B = 1;
                if (i2 >= 26) {
                }
                this.s.d(com.yandex.passport.internal.ui.a.a, i42, f0Var3.b());
                com.yandex.passport.common.core.f fVar3 = lVar2.b;
                v0Var.getClass();
                fVar3.getClass();
                v0Var.o(za.d, fVar3);
                return Unit.a;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj3 = kVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kVar.n;
        com.yandex.passport.internal.report.reporters.v0 v0Var2 = this.r;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a == null) {
        }
    }

    public final com.yandex.passport.internal.l k(List list, long j) {
        com.yandex.passport.internal.l d = this.b.a().d(j);
        com.yandex.passport.internal.report.reporters.w0 w0Var = this.c;
        if (d == null) {
            w0Var.getClass();
            list.getClass();
            w0Var.m(ce.d, CollectionsKt.h0(list, new ve("account_not_found", 17)));
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, dfi.e(j, "Account with uid ", " is not found"), 8);
                return null;
            }
        } else if (d.d.f()) {
            w0Var.getClass();
            list.getClass();
            w0Var.m(ce.d, CollectionsKt.h0(list, new ve("master_token_is_dropped", 17)));
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, dfi.d(j, "Master token is dropped for uid "), 8);
                return null;
            }
        } else {
            if (this.g.c(d.b)) {
                return d;
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, dfi.e(j, "Account with uid ", " was logout and can't show notification."), 8);
            }
        }
        return null;
    }

    public final void l(androidx.core.app.f0 f0Var) {
        int ordinal = ((e0) this.k.b(com.yandex.passport.internal.flags.o.u)).ordinal();
        Context context = this.a;
        if (ordinal == 1) {
            int i = R.color.passport_logout_brand_background;
            f0Var.w = true;
            f0Var.x = true;
            f0Var.A = context.getColor(i);
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            int i2 = R.color.passport_notification_lock;
            f0Var.w = true;
            f0Var.x = true;
            f0Var.A = context.getColor(i2);
        }
    }

    public final void m(androidx.core.app.f0 f0Var) {
        int i;
        int ordinal = ((e0) this.k.b(com.yandex.passport.internal.flags.o.u)).ordinal();
        if (ordinal == 0) {
            i = R.mipmap.passport_ic_suspicious_enter;
        } else if (ordinal == 1 || ordinal == 2) {
            i = R.drawable.passport_id_notification;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            i = R.drawable.passport_lock_notification;
        }
        f0Var.K.icon = i;
    }
}
