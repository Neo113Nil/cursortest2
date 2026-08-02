package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.android.play.core.install.zza;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.push.u0;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.ui.domik.common.e;
import com.yandex.payment.sdk.ui.SplashActivity;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.bind.BindGooglePayActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class l83 extends BroadcastReceiver {
    public static l83 c;
    public final /* synthetic */ int a;
    public Object b;

    public l83(Context context) {
        this.a = 0;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    public static final l83 a() {
        if (bp6.a.contains(l83.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            bp6.a(l83.class, th);
            return null;
        }
    }

    public void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((w6e) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                Set set = bp6.a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                phg a = phg.a((Context) this.b);
                                a.getClass();
                                a.d(this);
                                break;
                            } catch (Throwable th) {
                                bp6.a(this, th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        bp6.a(this, th2);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        int i = 0;
        int i2 = 3;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    pt0 pt0Var = new pt0(context, (String) null);
                    StringBuilder sb = new StringBuilder("bf_");
                    sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                    String sb2 = sb.toString();
                    Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                    Bundle bundle = new Bundle();
                    Set<String> keySet = bundleExtra != null ? bundleExtra.keySet() : null;
                    if (keySet != null) {
                        for (String str : keySet) {
                            str.getClass();
                            bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), ""), ""), (String) bundleExtra.get(str));
                        }
                    }
                    HashSet hashSet = j3c.a;
                    if (gtt.c()) {
                        pt0Var.w(bundle, sb2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    bp6.a(this, th);
                    return;
                }
            case 1:
                ((b6) this.b).A();
                return;
            case 2:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                bw1 bw1Var = (bw1) this.b;
                bw1Var.r(yv1.c(context, intent, (dv1) bw1Var.k, (qxp) bw1Var.j));
                return;
            case 3:
                intent.getClass();
                BindCardActivity bindCardActivity = (BindCardActivity) this.b;
                int i3 = BindCardActivity.u;
                bindCardActivity.O();
                return;
            case 4:
                ((BindGooglePayActivity) this.b).k();
                return;
            case 5:
                intent.getClass();
                BindSbpActivity bindSbpActivity = (BindSbpActivity) this.b;
                int i4 = BindSbpActivity.s;
                ((tdk) bindSbpActivity.l().f()).h.c();
                bindSbpActivity.k();
                return;
            case 6:
                context.getClass();
                intent.getClass();
                cw2 cw2Var = (cw2) this.b;
                int i5 = cw2Var.g;
                intent.getClass();
                switch (i5) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        jsg.j().e(dw2.a, "Received ".concat(action));
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    cw2Var.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    cw2Var.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    cw2Var.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    cw2Var.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        jsg.j().e(ew2.a, "Received " + intent.getAction());
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int hashCode = action2.hashCode();
                            if (hashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    cw2Var.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    cw2Var.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        jsg.j().e(shr.a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int hashCode2 = action3.hashCode();
                            if (hashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    cw2Var.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    cw2Var.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            case 7:
                context.getClass();
                intent.getClass();
                ((CustomTabActivity) this.b).finish();
                return;
            case 8:
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.b;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i6 = CustomTabMainActivity.c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                return;
            case 9:
                if (intent != null) {
                    xdr xdrVar = (xdr) ((nsh) this.b).b;
                    if (Intrinsics.d(intent.getAction(), "updateListSdkDebugViewVisibilityFlag")) {
                        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("listSdkDebugViewVisibilityFlag", ((Boolean) xdrVar.getValue()).booleanValue()));
                        xdrVar.getClass();
                        xdrVar.m(null, valueOf);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                context.getClass();
                intent.getClass();
                if (intent.getAction() != null) {
                    ktm ktmVar = (ktm) ((ltm) this.b);
                    ktmVar.getClass();
                    etn.k0(ktmVar, intent);
                    return;
                }
                return;
            case 11:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((oph) this.b).dismiss();
                    return;
                }
                return;
            case 12:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((okh) ((iwe) ((sth) this.b).l.c).b).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 13:
                context.getClass();
                intent.getClass();
                m0j m0jVar = (m0j) this.b;
                dwt.a(m0jVar.e, new dmg(28, m0jVar));
                return;
            case 14:
                ((Executor) ((j2j) this.b).c).execute(new zvh(i2, this, context));
                return;
            case 15:
                context.getClass();
                intent.getClass();
                if (!isInitialStickyBroadcast() || ((l2j) this.b).c == null) {
                    l2j l2jVar = (l2j) this.b;
                    x97.y(l2jVar.b, null, null, new k2j(l2jVar, context, objArr == true ? 1 : 0, i), 3);
                    return;
                }
                return;
            case 16:
                intent.getClass();
                PaymentActivity paymentActivity = (PaymentActivity) this.b;
                int i7 = PaymentActivity.x;
                jek a = ((q77) paymentActivity.r.getValue()).a();
                if (a.h) {
                    mgk mgkVar = a.f;
                    if (mgkVar == null) {
                        Intrinsics.j("payment");
                        throw null;
                    }
                    mgkVar.a.a();
                    mgkVar.h.invoke();
                }
                paymentActivity.k();
                return;
            case 17:
                ((PreselectActivity) this.b).k();
                return;
            case 18:
                ((d18) this.b).g();
                return;
            case 19:
                intent.getClass();
                SplashActivity splashActivity = (SplashActivity) this.b;
                ((tdk) splashActivity.l().f()).h.c();
                splashActivity.k();
                return;
            case 20:
                w6e w6eVar = (w6e) this.b;
                if (w6eVar != null && w6eVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    w6e w6eVar2 = (w6e) this.b;
                    ((FirebaseMessaging) w6eVar2.d).getClass();
                    FirebaseMessaging.b(w6eVar2, 0L);
                    ((FirebaseMessaging) ((w6e) this.b).d).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
            case 21:
                ((ozr) this.b).e = r0.a.getStreamVolume(3) / r0.a.getStreamMaxVolume(3);
                return;
            case 22:
                zju zjuVar = (zju) this.b;
                xdr xdrVar2 = zjuVar.b;
                context.getClass();
                intent.getClass();
                String action4 = intent.getAction();
                if (action4 != null) {
                    int hashCode3 = action4.hashCode();
                    if (hashCode3 == 583004161) {
                        if (action4.equals("ru.yandex.music.VPN_CHALLENGE_OFFLINE_MODE")) {
                            ((z66) zjuVar.a.a.getValue()).i(u0j.a);
                            return;
                        }
                        return;
                    } else {
                        if (hashCode3 == 681689228) {
                            if (action4.equals("ru.yandex.music.VPN_CHALLENGE_HIDDEN")) {
                                Boolean bool = Boolean.FALSE;
                                xdrVar2.getClass();
                                xdrVar2.m(null, bool);
                                return;
                            }
                            return;
                        }
                        if (hashCode3 == 1556150735 && action4.equals("ru.yandex.music.VPN_CHALLENGE_SHOWN")) {
                            Boolean bool2 = Boolean.TRUE;
                            xdrVar2.getClass();
                            xdrVar2.m(null, bool2);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 23:
                u0 u0Var = (u0) this.b;
                if (intent == null) {
                    return;
                }
                if (Intrinsics.d(intent.getAction(), "android.app.action.APP_BLOCK_STATE_CHANGED")) {
                    boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
                    if (a.a.isEnabled()) {
                        b bVar = b.c;
                        StringBuilder sb3 = new StringBuilder("Notification state global: ");
                        sb3.append(!booleanExtra);
                        a.c(bVar, null, sb3.toString(), 8);
                    }
                    u0Var.b(null);
                    return;
                }
                if (!Intrinsics.d(intent.getAction(), "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                    if (Intrinsics.d(intent.getAction(), "android.app.action.INTERRUPTION_FILTER_CHANGED") || Intrinsics.d(intent.getAction(), "android.app.action.NOTIFICATION_POLICY_CHANGED")) {
                        if (a.a.isEnabled()) {
                            a.c(b.c, null, "Notification dnd mode changed", 8);
                        }
                        u0Var.b(null);
                        return;
                    }
                    return;
                }
                String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
                if (Intrinsics.d(stringExtra, "passport_channel_group_id")) {
                    boolean booleanExtra2 = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
                    if (a.a.isEnabled()) {
                        b bVar2 = b.c;
                        StringBuilder u = ouj.u("Notification state group \"", stringExtra, "\": ");
                        u.append(!booleanExtra2);
                        a.c(bVar2, null, u.toString(), 8);
                    }
                    u0Var.b(null);
                    return;
                }
                return;
            case 24:
                context.getClass();
                intent.getClass();
                ((hav) this.b).invoke();
                return;
            case 25:
                com.yandex.passport.legacy.a.e(3, "Internal broadcast about SMS received", null);
                e eVar = (e) this.b;
                n0 n0Var = eVar.q;
                n0Var.getClass();
                m0 m0Var = m0.SMS_CODE_ENTRY;
                l0 l0Var = l0.SMS_RETRIEVER_TRIGGERED;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                n0Var.c(m0Var, l0Var, e5bVar);
                m mVar = eVar.v.b;
                String str2 = (String) mVar.f.getValue(mVar, m.m[4]);
                if (str2 != null) {
                    eVar.t.setCode(str2);
                    return;
                } else {
                    com.yandex.passport.legacy.a.e(6, "We received SMS meant for us, but there was no code in it", null);
                    return;
                }
            default:
                e5x e5xVar = (e5x) ((vfx) this.b);
                boolean equals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                yee yeeVar = e5xVar.a;
                if (!equals) {
                    yeeVar.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                yeeVar.b("List of extras in received intent:", new Object[0]);
                for (String str3 : intent.getExtras().keySet()) {
                    e5xVar.a.b("Key: %s; value: %s", str3, intent.getExtras().get(str3));
                }
                yee yeeVar2 = e5xVar.a;
                yeeVar2.b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                yeeVar2.b("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                yeeVar2.b("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                e5xVar.a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (e5xVar) {
                    Iterator it = new HashSet(e5xVar.d).iterator();
                    while (it.hasNext()) {
                        ((oge) it.next()).a(zzaVar);
                    }
                }
                return;
        }
    }

    public /* synthetic */ l83(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public l83(u0 u0Var) {
        this.a = 23;
        u0Var.getClass();
        this.b = u0Var;
    }

    public l83(hav havVar) {
        this.a = 24;
        this.b = havVar;
    }
}
