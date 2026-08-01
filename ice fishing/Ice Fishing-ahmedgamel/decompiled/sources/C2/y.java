package C2;

import L3.BinderC0317c;
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
import com.anythink.core.api.ATSDK;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import com.google.android.gms.internal.ads.Y;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.gms.internal.consent_sdk.C4304c;
import com.google.android.gms.internal.consent_sdk.C4312e;
import com.google.android.gms.internal.consent_sdk.C4316f;
import com.google.android.gms.internal.consent_sdk.C4336k;
import com.google.android.gms.internal.consent_sdk.C4344m;
import com.google.android.gms.internal.consent_sdk.C4348n;
import com.google.android.gms.internal.consent_sdk.C4352o;
import com.google.android.gms.internal.consent_sdk.C4386w2;
import com.google.android.gms.internal.consent_sdk.RunnableC4324h;
import com.google.android.gms.internal.consent_sdk.RunnableC4340l;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.icefishing.icefishingbigwin.SplashActivity;
import d3.AbstractC4446a;
import g1.C4522b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import l.C4648e;
import m.b1;
import m1.C4729d;
import o4.InterfaceC4799l;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4896n;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f424n;

    /* renamed from: u, reason: collision with root package name */
    public Object f425u;

    /* renamed from: v, reason: collision with root package name */
    public Object f426v;

    /* renamed from: w, reason: collision with root package name */
    public Object f427w;

    public /* synthetic */ y(int i) {
        this.f424n = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        j3.m d2;
        JSONObject jSONObject;
        com.icefishing.icefishingbigwin.F f3;
        j4.q qVar;
        int i6 = 7;
        Object obj = null;
        int i9 = 2;
        int i10 = 0;
        int i11 = 0;
        r4 = false;
        boolean z3 = false;
        boolean z6 = true;
        switch (this.f424n) {
            case 0:
                C0268a c0268a = (C0268a) this.f425u;
                C4835j.f39733C.f39741f.getClass();
                CookieManager l9 = a4.e.l();
                r4 = l9 != null ? l9.acceptThirdPartyCookies(c0268a.f307b) : false;
                Bundle bundle = (Bundle) this.f426v;
                bundle.putBoolean("accept_3p_cookie", r4);
                F2.a.a(c0268a.f306a, k2.b.BANNER, new k2.g((k2.f) new k2.f(2).e(bundle)), (v) this.f427w);
                return;
            case 1:
                D d9 = (D) this.f425u;
                d9.getClass();
                Object obj2 = this.f426v;
                if (obj2 instanceof WebView) {
                    C4835j.f39733C.f39741f.getClass();
                    CookieManager l10 = a4.e.l();
                    if (l10 != null) {
                        z3 = l10.acceptThirdPartyCookies((WebView) obj2);
                    }
                }
                HashMap hashMap = d9.f258a;
                Boolean valueOf = Boolean.valueOf(z3);
                F f9 = (F) hashMap.get(valueOf);
                Pair pair = (Pair) this.f427w;
                if (f9 != null) {
                    C4835j.f39733C.f39745k.getClass();
                    if (f9.f271c > System.currentTimeMillis()) {
                        d9.e(f9, pair, true);
                        return;
                    }
                }
                HashMap hashMap2 = d9.f259b;
                List list = (List) hashMap2.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(valueOf, list);
                }
                list.add(pair);
                return;
            case 2:
                C3315ho c3315ho = (C3315ho) this.f425u;
                c3315ho.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3315ho.f30940a);
                String str = (String) this.f426v;
                if (!TextUtils.isEmpty(NativeAdvancedJsUtils.f17906p) && !TextUtils.isEmpty(str)) {
                    concurrentHashMap.put(NativeAdvancedJsUtils.f17906p, str);
                }
                while (true) {
                    Pair[] pairArr = (Pair[]) this.f427w;
                    if (i11 >= pairArr.length) {
                        c3315ho.b(concurrentHashMap);
                        return;
                    }
                    Pair pair2 = pairArr[i11];
                    String str2 = (String) pair2.first;
                    String str3 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                    i11++;
                }
                break;
            case 3:
                try {
                    z6 = ((Boolean) ((U0.k) this.f427w).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((K0.f) this.f425u).b((S0.j) this.f426v, z6);
                return;
            case 4:
                try {
                    obj = ((L.d) this.f425u).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.f427w).post(new LD(11, (L.e) this.f426v, obj));
                return;
            case 5:
                L2.a aVar = (L2.a) this.f426v;
                Intent intent = aVar.f1620n;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    d2 = S0.f.i(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = aVar.f1620n;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f1620n;
                    Integer valueOf2 = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf2 != null) {
                        bundle2.putInt("google.product_id", valueOf2.intValue());
                    }
                    bundle2.putBoolean("supports_message_handled", true);
                    L2.n c9 = L2.n.c((Context) this.f425u);
                    synchronized (c9) {
                        i = c9.f1659a;
                        c9.f1659a = 1 + i;
                    }
                    d2 = c9.d(new L2.l(i, 2, bundle2, 0));
                }
                d2.a(L2.h.f1637u, new I0.j(i6, (CountDownLatch) this.f427w));
                return;
            case 6:
                Bundle bundle3 = (Bundle) this.f426v;
                L3.D d10 = (L3.D) this.f425u;
                L3.C c10 = (L3.C) this.f427w;
                try {
                    L3.y yVar = d10.f1677a;
                    if (yVar == null) {
                        throw null;
                    }
                    K3.d dVar = (K3.d) yVar.f1751k;
                    if (dVar == null) {
                        return;
                    }
                    K3.b bVar = (K3.b) dVar;
                    Parcel w02 = bVar.w0();
                    int i12 = AbstractC4446a.f37037a;
                    w02.writeInt(1);
                    bundle3.writeToParcel(w02, 0);
                    w02.writeStrongBinder(c10);
                    bVar.F0(w02, 1);
                    return;
                } catch (RemoteException e9) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.startSession", e9);
                    return;
                }
            case 7:
                ArrayList arrayList = (ArrayList) this.f426v;
                C4648e c4648e = (C4648e) this.f427w;
                L3.g gVar = (L3.g) this.f425u;
                try {
                    K3.g gVar2 = (K3.g) gVar.f1693b.f1751k;
                    if (gVar2 == null) {
                        return;
                    }
                    String packageName = gVar.f1692a.getPackageName();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        L3.z zVar = (L3.z) it.next();
                        String str4 = zVar.f1752a;
                        arrayList2.add(new K3.a(str4, t8.g.N(str4, zVar.f1753b, zVar.f1754c).toString(), zVar.f1755d));
                    }
                    BinderC0317c binderC0317c = new BinderC0317c(gVar, c4648e);
                    K3.e eVar = (K3.e) gVar2;
                    Parcel w03 = eVar.w0();
                    w03.writeString(packageName);
                    w03.writeTypedList(arrayList2);
                    int i13 = AbstractC4446a.f37037a;
                    w03.writeStrongBinder(binderC0317c);
                    eVar.F0(w03, 1);
                    return;
                } catch (DeadObjectException e10) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e10);
                    return;
                } catch (RemoteException e11) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.prewarm", e11);
                    return;
                }
            case 8:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f427w;
                Context context = (Context) this.f426v;
                Intent intent4 = (Intent) this.f425u;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    J0.s.d().a(ConstraintProxyUpdateReceiver.f5382a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    T0.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    T0.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    T0.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    T0.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 9:
                j0.h((View) this.f425u, (C2991bm) this.f426v);
                ((ValueAnimator) this.f427w).start();
                return;
            case 10:
                ((K0.p) this.f425u).f1537f.h((K0.j) this.f426v, (Z2.e) this.f427w);
                return;
            case 11:
                String str5 = (String) this.f425u;
                if (TextUtils.isEmpty(str5)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String lowerCase = str5.toLowerCase();
                String str6 = (String) this.f426v;
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
                    com.google.android.gms.internal.consent_sdk.D[] dArr = (com.google.android.gms.internal.consent_sdk.D[]) this.f427w;
                    if (i10 >= dArr.length) {
                        return;
                    }
                    com.google.android.gms.internal.consent_sdk.D d11 = dArr[i10];
                    FutureTask futureTask = new FutureTask(new CallableC0272e(4, d11, lowerCase, jSONObject));
                    d11.mo6c().execute(futureTask);
                    try {
                    } catch (InterruptedException e12) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e12);
                    } catch (ExecutionException e13) {
                        Log.d("UserMessagingPlatform", D.y.o("Failed to run Action[", lowerCase, "]: "), e13.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    } else {
                        i10++;
                    }
                }
            case 12:
                RunnableC4324h runnableC4324h = new RunnableC4324h(i9, (M3.d) this.f426v);
                C4300b c4300b = (C4300b) this.f425u;
                ((Handler) c4300b.f35649b).post(runnableC4324h);
                if (((L2.o) this.f427w).f1664b != 2) {
                    C4348n c4348n = (C4348n) c4300b.f35652e;
                    C4352o c4352o = (C4352o) c4348n.f35724b.get();
                    if (c4352o == null) {
                        Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                        return;
                    }
                    C4304c c4304c = (C4304c) c4348n.f35723a.f();
                    c4304c.getClass();
                    C4300b c4300b2 = c4304c.f35656a;
                    Z2 a9 = Z2.a(new C4312e((C4386w2) c4300b2.f35649b, i9));
                    C4386w2 c4386w2 = new C4386w2(8, c4352o);
                    C4386w2 c4386w22 = new C4386w2(7);
                    C4386w2 c4386w23 = (C4386w2) c4300b2.f35649b;
                    Z2 z22 = (Z2) c4300b2.f35653f;
                    C4316f c4316f = (C4316f) c4300b2.i;
                    Z2 z23 = (Z2) c4300b2.f35650c;
                    Z2 a10 = Z2.a(new b1(c4386w23, (Z2) c4300b2.f35651d, a9, z23, c4386w2, new C4344m(a9, new C4896n(c4386w23, a9, z22, c4316f, c4386w22, z23, 3)), (Z2) c4300b2.f35654g));
                    if (((Z2) c4386w22.f35781u) != null) {
                        throw new IllegalStateException();
                    }
                    c4386w22.f35781u = a10;
                    C4336k c4336k = (C4336k) c4386w22.f();
                    c4336k.f35706m = true;
                    com.google.android.gms.internal.consent_sdk.C.f35492a.post(new RunnableC4340l(r4 ? 1 : 0, c4348n, c4336k));
                    return;
                }
                return;
            case 13:
                synchronized (((C4729d) this.f425u).f39297w) {
                }
                com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) this.f426v;
                if (((l1.g) oVar.f23466w) == null) {
                    C4729d c4729d = (C4729d) this.f425u;
                    String str7 = (String) oVar.f23464u;
                    c4729d.getClass();
                    synchronized (c4729d.f39292F) {
                        qVar = c4729d.f39293G;
                    }
                    if (qVar != null) {
                        try {
                            SharedPreferences.Editor edit = o4.m.f39612d.edit();
                            edit.putString("response", new JSONObject(str7).toString());
                            edit.apply();
                            edit.commit();
                        } catch (JSONException e14) {
                            e14.printStackTrace();
                            ((F1.a) qVar.f38433n).r();
                        }
                        o4.m e15 = o4.m.e((SplashActivity) qVar.f38434u);
                        C4522b c4522b = new C4522b(26, qVar);
                        SharedPreferences.Editor editor = e15.f39634a;
                        String string = o4.m.f39612d.getString("response", "");
                        if (!string.isEmpty()) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(string);
                                o4.m.f39614f = jSONObject2.getInt("splash_inter");
                                o4.m.i = jSONObject2.getInt("link_redirect");
                                o4.m.f39615g = jSONObject2.getInt("splash_redirect");
                                o4.m.f39630w = jSONObject2.getString("link1");
                                o4.m.f39631x = jSONObject2.getString("link2");
                                o4.m.f39632y = jSONObject2.getString("link3");
                                jSONObject2.getString("livetv");
                                o4.m.f39624q = jSONObject2.getString("topon_appid");
                                o4.m.f39625r = jSONObject2.getString("topon_appkey");
                                o4.m.f39626s = jSONObject2.getString("topon_banner");
                                o4.m.f39627t = jSONObject2.getString("topon_inter1");
                                jSONObject2.getString("topon_inter2");
                                o4.m.f39628u = jSONObject2.getString("topon_native");
                                o4.m.f39596E = jSONObject2.getInt("topon_showStatus");
                                o4.m.f39617j = jSONObject2.getInt("admob_showAdStatus");
                                jSONObject2.getString("AppID");
                                o4.m.f39618k = jSONObject2.getString("Admob_Banner");
                                o4.m.f39619l = jSONObject2.getString("Admob_Interstitial");
                                o4.m.f39620m = jSONObject2.getString("Admob_Native");
                                o4.m.f39616h = jSONObject2.getInt("adposition");
                                o4.m.f39599H = jSONObject2.getString("FB_banner");
                                o4.m.f39602L = jSONObject2.getString("FB_nativebanner");
                                o4.m.f39600I = jSONObject2.getString("FB_inter1");
                                o4.m.J = jSONObject2.getString("FB_inter2");
                                o4.m.f39601K = jSONObject2.getString("FB_native");
                                o4.m.f39597F = jSONObject2.getInt("FB_showAdStatus");
                                o4.m.f39598G = jSONObject2.getInt("FB_bannernative");
                                editor.putInt("adposition", o4.m.f39616h);
                                editor.commit();
                                ATSDK.init(o4.m.f39613e, o4.m.f39624q, o4.m.f39625r);
                                AudienceNetworkAds.initialize(o4.m.f39613e);
                                c4522b.Q();
                                InterfaceC4799l interfaceC4799l = o4.m.f39592A;
                                if (interfaceC4799l != null) {
                                    interfaceC4799l.OnCall();
                                    o4.m.f39592A = null;
                                }
                            } catch (JSONException e16) {
                                e16.printStackTrace();
                            }
                        }
                    }
                } else {
                    C4729d c4729d2 = (C4729d) this.f425u;
                    synchronized (c4729d2.f39297w) {
                        f3 = c4729d2.f39298x;
                    }
                    if (f3 != null) {
                        f3.f36390n.r();
                    }
                }
                if (((com.bumptech.glide.manager.o) this.f426v).f23463n) {
                    ((C4729d) this.f425u).a("intermediate-response");
                } else {
                    ((C4729d) this.f425u).b("done");
                }
                RunnableC3191fP runnableC3191fP = (RunnableC3191fP) this.f427w;
                if (runnableC3191fP != null) {
                    runnableC3191fP.run();
                    return;
                }
                return;
            default:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) ((Y) this.f425u).f28624d;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.d((String) this.f426v, (HashMap) this.f427w);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ y(int i, Object obj, Object obj2, Object obj3) {
        this.f424n = i;
        this.f425u = obj;
        this.f426v = obj2;
        this.f427w = obj3;
    }

    public y(View view, n0 n0Var, C2991bm c2991bm, ValueAnimator valueAnimator) {
        this.f424n = 9;
        this.f425u = view;
        this.f426v = c2991bm;
        this.f427w = valueAnimator;
    }
}
