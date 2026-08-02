package E2;

import N3.BinderC0325c;
import O.j0;
import O.n0;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.anythink.core.api.ATSDK;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import com.google.android.gms.internal.ads.Y;
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.gms.internal.consent_sdk.C4327c;
import com.google.android.gms.internal.consent_sdk.C4335e;
import com.google.android.gms.internal.consent_sdk.C4339f;
import com.google.android.gms.internal.consent_sdk.C4359k;
import com.google.android.gms.internal.consent_sdk.C4367m;
import com.google.android.gms.internal.consent_sdk.C4371n;
import com.google.android.gms.internal.consent_sdk.C4375o;
import com.google.android.gms.internal.consent_sdk.C4409w2;
import com.google.android.gms.internal.consent_sdk.RunnableC4347h;
import com.google.android.gms.internal.consent_sdk.RunnableC4363l;
import com.google.android.gms.internal.consent_sdk.Z2;
import f3.AbstractC4518a;
import i1.C4586c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import m.c1;
import o1.C4800d;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4900e;
import r2.C4906k;
import s2.C4945n;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f883n;

    /* renamed from: u, reason: collision with root package name */
    public Object f884u;

    /* renamed from: v, reason: collision with root package name */
    public Object f885v;

    /* renamed from: w, reason: collision with root package name */
    public Object f886w;

    public /* synthetic */ x(int i) {
        this.f883n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        l3.m d9;
        JSONObject jSONObject;
        I0.j jVar;
        l4.q qVar;
        int i4 = 2;
        Object obj = null;
        int i6 = 0;
        int i9 = 0;
        r3 = false;
        boolean z6 = false;
        boolean z9 = true;
        switch (this.f883n) {
            case 0:
                C0304a c0304a = (C0304a) this.f884u;
                C4906k.f40186C.f40194f.getClass();
                CookieManager q8 = O2.i.q();
                r3 = q8 != null ? q8.acceptThirdPartyCookies(c0304a.f767b) : false;
                Bundle bundle = (Bundle) this.f885v;
                bundle.putBoolean("accept_3p_cookie", r3);
                H2.a.a(c0304a.f766a, m2.b.BANNER, new m2.g((m2.f) new m2.f(3).e(bundle)), (u) this.f886w);
                return;
            case 1:
                C c9 = (C) this.f884u;
                c9.getClass();
                Object obj2 = this.f885v;
                if (obj2 instanceof WebView) {
                    C4906k.f40186C.f40194f.getClass();
                    CookieManager q9 = O2.i.q();
                    if (q9 != null) {
                        z6 = q9.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap hashMap = c9.f718a;
                Boolean valueOf = Boolean.valueOf(z6);
                E e9 = (E) hashMap.get(valueOf);
                Pair pair = (Pair) this.f886w;
                if (e9 != null) {
                    C4906k.f40186C.f40198k.getClass();
                    if (e9.f731c > System.currentTimeMillis()) {
                        c9.e(e9, pair, true);
                        return;
                    }
                }
                HashMap hashMap2 = c9.f719b;
                List list = (List) hashMap2.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(valueOf, list);
                }
                list.add(pair);
                return;
            case 2:
                C3391io c3391io = (C3391io) this.f884u;
                c3391io.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3391io.f31897a);
                String str = (String) this.f885v;
                if (!TextUtils.isEmpty(NativeAdvancedJsUtils.f18693p) && !TextUtils.isEmpty(str)) {
                    concurrentHashMap.put(NativeAdvancedJsUtils.f18693p, str);
                }
                while (true) {
                    Pair[] pairArr = (Pair[]) this.f886w;
                    if (i9 >= pairArr.length) {
                        c3391io.b(concurrentHashMap);
                        return;
                    }
                    Pair pair2 = pairArr[i9];
                    String str2 = (String) pair2.first;
                    String str3 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                    i9++;
                }
                break;
            case 3:
                try {
                    z9 = ((Boolean) ((U0.k) this.f886w).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((K0.f) this.f884u).b((S0.j) this.f885v, z9);
                return;
            case 4:
                try {
                    obj = ((L.d) this.f884u).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.f886w).post(new LD(11, (L.e) this.f885v, obj));
                return;
            case 5:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f886w;
                Context context = (Context) this.f885v;
                Intent intent = (Intent) this.f884u;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    J0.r.d().a(ConstraintProxyUpdateReceiver.f5347a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    T0.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    T0.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    T0.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    T0.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 6:
                N2.a aVar = (N2.a) this.f885v;
                Intent intent2 = aVar.f1909n;
                String stringExtra = intent2.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    d9 = com.bumptech.glide.d.r(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent3 = aVar.f1909n;
                    String stringExtra2 = intent3.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent3.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent4 = aVar.f1909n;
                    Integer valueOf2 = intent4.hasExtra("google.product_id") ? Integer.valueOf(intent4.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf2 != null) {
                        bundle2.putInt("google.product_id", valueOf2.intValue());
                    }
                    bundle2.putBoolean("supports_message_handled", true);
                    N2.o c10 = N2.o.c((Context) this.f884u);
                    synchronized (c10) {
                        i = c10.f1949a;
                        c10.f1949a = 1 + i;
                    }
                    d9 = c10.d(new N2.m(i, 2, bundle2, 0));
                }
                d9.a(N2.h.f1926u, new N2.i((CountDownLatch) this.f886w));
                return;
            case 7:
                Bundle bundle3 = (Bundle) this.f885v;
                N3.A a9 = (N3.A) this.f884u;
                N3.z zVar = (N3.z) this.f886w;
                try {
                    N3.v vVar = a9.f1956a;
                    if (vVar == null) {
                        throw null;
                    }
                    M3.d dVar = (M3.d) vVar.f2023k;
                    if (dVar == null) {
                        return;
                    }
                    M3.b bVar = (M3.b) dVar;
                    Parcel t02 = bVar.t0();
                    int i10 = AbstractC4518a.f37439a;
                    t02.writeInt(1);
                    bundle3.writeToParcel(t02, 0);
                    t02.writeStrongBinder(zVar);
                    bVar.D0(t02, 1);
                    return;
                } catch (RemoteException e10) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.startSession", e10);
                    return;
                }
            case 8:
                ArrayList arrayList = (ArrayList) this.f885v;
                C4900e c4900e = (C4900e) this.f886w;
                N3.g gVar = (N3.g) this.f884u;
                try {
                    M3.g gVar2 = (M3.g) gVar.f1972b.f2023k;
                    if (gVar2 == null) {
                        return;
                    }
                    String packageName = gVar.f1971a.getPackageName();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        N3.w wVar = (N3.w) it.next();
                        String str4 = wVar.f2024a;
                        arrayList2.add(new M3.a(str4, Q3.b.y(str4, wVar.f2025b, wVar.f2026c).toString(), wVar.f2027d));
                    }
                    BinderC0325c binderC0325c = new BinderC0325c(gVar, c4900e);
                    M3.e eVar = (M3.e) gVar2;
                    Parcel t03 = eVar.t0();
                    t03.writeString(packageName);
                    t03.writeTypedList(arrayList2);
                    int i11 = AbstractC4518a.f37439a;
                    t03.writeStrongBinder(binderC0325c);
                    eVar.D0(t03, 1);
                    return;
                } catch (DeadObjectException e11) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e11);
                    return;
                } catch (RemoteException e12) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.prewarm", e12);
                    return;
                }
            case 9:
                j0.h((View) this.f884u, (S0.c) this.f885v);
                ((ValueAnimator) this.f886w).start();
                return;
            case 10:
                ((K0.p) this.f884u).f1646f.h((K0.j) this.f885v, (b3.e) this.f886w);
                return;
            case 11:
                String str5 = (String) this.f884u;
                if (TextUtils.isEmpty(str5)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String lowerCase = str5.toLowerCase();
                String str6 = (String) this.f885v;
                if (TextUtils.isEmpty(str6)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str6);
                    } catch (JSONException unused3) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str6);
                        return;
                    }
                }
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                while (true) {
                    com.google.android.gms.internal.consent_sdk.D[] dArr = (com.google.android.gms.internal.consent_sdk.D[]) this.f886w;
                    if (i6 >= dArr.length) {
                        return;
                    }
                    com.google.android.gms.internal.consent_sdk.D d10 = dArr[i6];
                    FutureTask futureTask = new FutureTask(new CallableC0308e(4, d10, lowerCase, jSONObject));
                    d10.mo4c().execute(futureTask);
                    try {
                    } catch (InterruptedException e13) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e13);
                    } catch (ExecutionException e14) {
                        Log.d("UserMessagingPlatform", D.x.l("Failed to run Action[", lowerCase, "]: "), e14.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    } else {
                        i6++;
                    }
                }
            case 12:
                RunnableC4347h runnableC4347h = new RunnableC4347h(i4, (O3.d) this.f885v);
                C4323b c4323b = (C4323b) this.f884u;
                ((Handler) c4323b.f36418b).post(runnableC4347h);
                if (((N2.p) this.f886w).f1954b != 2) {
                    C4371n c4371n = (C4371n) c4323b.f36421e;
                    C4375o c4375o = (C4375o) c4371n.f36493b.get();
                    if (c4375o == null) {
                        Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                        return;
                    }
                    C4327c c4327c = (C4327c) c4371n.f36492a.f();
                    c4327c.getClass();
                    C4323b c4323b2 = c4327c.f36425a;
                    Z2 a10 = Z2.a(new C4335e((C4409w2) c4323b2.f36418b, i4));
                    C4409w2 c4409w2 = new C4409w2(8, c4375o);
                    C4409w2 c4409w22 = new C4409w2(7);
                    C4409w2 c4409w23 = (C4409w2) c4323b2.f36418b;
                    Z2 z22 = (Z2) c4323b2.f36422f;
                    C4339f c4339f = (C4339f) c4323b2.i;
                    Z2 z23 = (Z2) c4323b2.f36419c;
                    Z2 a11 = Z2.a(new c1(c4409w23, (Z2) c4323b2.f36420d, a10, z23, c4409w2, new C4367m(a10, new C4945n(c4409w23, a10, z22, c4339f, c4409w22, z23, 3)), (Z2) c4323b2.f36423g));
                    if (((Z2) c4409w22.f36550u) != null) {
                        throw new IllegalStateException();
                    }
                    c4409w22.f36550u = a11;
                    C4359k c4359k = (C4359k) c4409w22.f();
                    c4359k.f36475m = true;
                    com.google.android.gms.internal.consent_sdk.C.f36261a.post(new RunnableC4363l(r3 ? 1 : 0, c4371n, c4359k));
                    return;
                }
                return;
            case 13:
                synchronized (((C4800d) this.f884u).f39740w) {
                }
                com.bumptech.glide.manager.n nVar = (com.bumptech.glide.manager.n) this.f885v;
                if (((n1.g) nVar.f24251w) == null) {
                    C4800d c4800d = (C4800d) this.f884u;
                    String str7 = (String) nVar.f24249u;
                    c4800d.getClass();
                    synchronized (c4800d.f39735F) {
                        qVar = c4800d.f39736G;
                    }
                    if (qVar != null) {
                        try {
                            SharedPreferences.Editor edit = Y0.p.f3875d.edit();
                            edit.putString("response", new JSONObject(str7).toString());
                            edit.apply();
                            edit.commit();
                        } catch (JSONException e15) {
                            e15.printStackTrace();
                            ((C4586c) qVar.f38945n).s();
                        }
                        Y0.p e16 = Y0.p.e((SplashActivity) qVar.f38946u);
                        n4.c cVar = new n4.c(16, qVar);
                        SharedPreferences.Editor editor = e16.f3897a;
                        String string = Y0.p.f3875d.getString("response", "");
                        if (!string.isEmpty()) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(string);
                                Y0.p.f3877f = jSONObject2.getInt("splash_inter");
                                Y0.p.i = jSONObject2.getInt("link_redirect");
                                Y0.p.f3878g = jSONObject2.getInt("splash_redirect");
                                Y0.p.f3893w = jSONObject2.getString("link1");
                                Y0.p.f3894x = jSONObject2.getString("link2");
                                Y0.p.f3895y = jSONObject2.getString("link3");
                                jSONObject2.getString("livetv");
                                Y0.p.f3887q = jSONObject2.getString("topon_appid");
                                Y0.p.f3888r = jSONObject2.getString("topon_appkey");
                                Y0.p.f3889s = jSONObject2.getString("topon_banner");
                                Y0.p.f3890t = jSONObject2.getString("topon_inter1");
                                jSONObject2.getString("topon_inter2");
                                Y0.p.f3891u = jSONObject2.getString("topon_native");
                                Y0.p.f3859E = jSONObject2.getInt("topon_showStatus");
                                Y0.p.f3880j = jSONObject2.getInt("admob_showAdStatus");
                                jSONObject2.getString("AppID");
                                Y0.p.f3881k = jSONObject2.getString("Admob_Banner");
                                Y0.p.f3882l = jSONObject2.getString("Admob_Interstitial");
                                Y0.p.f3883m = jSONObject2.getString("Admob_Native");
                                Y0.p.f3879h = jSONObject2.getInt("adposition");
                                Y0.p.f3862H = jSONObject2.getString("FB_banner");
                                Y0.p.f3865L = jSONObject2.getString("FB_nativebanner");
                                Y0.p.f3863I = jSONObject2.getString("FB_inter1");
                                Y0.p.J = jSONObject2.getString("FB_inter2");
                                Y0.p.f3864K = jSONObject2.getString("FB_native");
                                Y0.p.f3860F = jSONObject2.getInt("FB_showAdStatus");
                                Y0.p.f3861G = jSONObject2.getInt("FB_bannernative");
                                editor.putInt("adposition", Y0.p.f3879h);
                                editor.commit();
                                ATSDK.init(Y0.p.f3876e, Y0.p.f3887q, Y0.p.f3888r);
                                AudienceNetworkAds.initialize(Y0.p.f3876e);
                                cVar.B();
                                Y0.o oVar = Y0.p.f3855A;
                                if (oVar != null) {
                                    oVar.OnCall();
                                    Y0.p.f3855A = null;
                                }
                            } catch (JSONException e17) {
                                e17.printStackTrace();
                            }
                        }
                    }
                } else {
                    C4800d c4800d2 = (C4800d) this.f884u;
                    synchronized (c4800d2.f39740w) {
                        jVar = c4800d2.f39741x;
                    }
                    if (jVar != null) {
                        ((C4586c) jVar.f1291u).s();
                    }
                }
                if (((com.bumptech.glide.manager.n) this.f885v).f24248n) {
                    ((C4800d) this.f884u).a("intermediate-response");
                } else {
                    ((C4800d) this.f884u).b("done");
                }
                RunnableC3214fP runnableC3214fP = (RunnableC3214fP) this.f886w;
                if (runnableC3214fP != null) {
                    runnableC3214fP.run();
                    return;
                }
                return;
            default:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) ((Y) this.f884u).f29401d;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.d((String) this.f885v, (HashMap) this.f886w);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ x(int i, Object obj, Object obj2, Object obj3) {
        this.f883n = i;
        this.f884u = obj;
        this.f885v = obj2;
        this.f886w = obj3;
    }

    public x(View view, n0 n0Var, S0.c cVar, ValueAnimator valueAnimator) {
        this.f883n = 9;
        this.f884u = view;
        this.f885v = cVar;
        this.f886w = valueAnimator;
    }
}
