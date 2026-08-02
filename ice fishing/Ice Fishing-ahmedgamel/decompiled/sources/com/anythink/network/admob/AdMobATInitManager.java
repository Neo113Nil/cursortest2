package com.anythink.network.admob;

import H2.a;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.core.common.u.g;
import com.google.android.gms.ads.MobileAds;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import m2.b;
import m2.f;
import m2.h;
import m2.i;
import m2.r;
import n2.C4766a;
import o2.AbstractC4801a;
import o2.AbstractC4802b;
import org.json.JSONArray;
import s2.E0;
import s2.J0;

/* loaded from: classes.dex */
public class AdMobATInitManager extends ATInitMediation {

    /* renamed from: h, reason: collision with root package name */
    private static final String f23532h = "AdMobATInitManager";

    /* renamed from: j, reason: collision with root package name */
    private static volatile AdMobATInitManager f23533j;

    /* renamed from: a, reason: collision with root package name */
    Context f23534a;

    /* renamed from: b, reason: collision with root package name */
    long f23535b;

    /* renamed from: c, reason: collision with root package name */
    long f23536c;

    /* renamed from: d, reason: collision with root package name */
    long f23537d;

    /* renamed from: e, reason: collision with root package name */
    long f23538e;

    /* renamed from: f, reason: collision with root package name */
    String f23539f;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23541k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23542l;

    /* renamed from: m, reason: collision with root package name */
    private int f23543m = 0;

    /* renamed from: n, reason: collision with root package name */
    private Map<String, Object> f23544n = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    volatile int f23540g = 0;
    private boolean i = false;

    private AdMobATInitManager() {
    }

    private void a(MediationInitCallback mediationInitCallback, Map<String, Object> map, Context context) {
        try {
            synchronized (this) {
                try {
                    if (this.i) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    try {
                        Object obj = map.get(j.w.f13412n);
                        if (obj != null && !((Boolean) obj).booleanValue()) {
                            if (ATSDK.isNetworkLogDebug()) {
                                Log.i(f23532h, "disableMediationAdapterInitialization");
                            }
                            MobileAds.a(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        this.f23540g = PreferenceManager.getDefaultSharedPreferences(context).getInt("gad_rdp", 0);
                    } catch (Throwable unused2) {
                    }
                    J0.c().d(context, null);
                    int i = this.f23543m;
                    if (i != 0) {
                        MobileAds.c(i == 1);
                    }
                    if (this.f23536c == 0) {
                        this.f23536c = System.currentTimeMillis();
                        HashMap hashMap = new HashMap();
                        hashMap.put("init_st", Long.valueOf(this.f23535b));
                        hashMap.put("init_et", Long.valueOf(this.f23536c));
                        hashMap.put("token_st", Long.valueOf(this.f23537d));
                        hashMap.put("token_et", Long.valueOf(this.f23538e));
                        hashMap.put(j.w.f13396G, Integer.valueOf(ATInitMediation.getIntFromMap(map, j.w.f13396G, 1)));
                        hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, ATInitMediation.getStringFromMap(map, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "-1"));
                        hashMap.put("admob_init_adsource_id", ATInitMediation.getStringFromMap(map, j.w.f13397H, ""));
                        hashMap.put("admob_token_adsource_id", this.f23539f);
                        sendNetworkEvent(2, g.f17337a, hashMap);
                    }
                    this.i = true;
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            this.i = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bundle b(Context context, Map<String, Object> map, Map<String, Object> map2, b bVar, boolean z6) {
        b bVar2;
        String stringFromMap;
        h a9;
        Context context2;
        Context context3;
        Bundle bundle = new Bundle();
        try {
            if (map.containsKey(j.w.f13405f)) {
                if (((Boolean) map.get(j.w.f13405f)).booleanValue()) {
                    bundle.putString("npa", "0");
                } else {
                    bundle.putString("npa", "1");
                }
            }
        } catch (Throwable unused) {
        }
        if (!this.f23541k) {
            if (this.f23540g == 1 && (context2 = this.f23534a) != null) {
                PreferenceManager.getDefaultSharedPreferences(context2).edit().remove("gad_rdp").apply();
                this.f23540g = 0;
            }
            bVar2 = b.BANNER;
            if (z6) {
            }
            int intFromMap = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
            if (bVar == bVar2) {
            }
            if (map.containsKey(j.w.f13418t)) {
            }
            stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f13417s, "");
            if (!TextUtils.isEmpty(stringFromMap)) {
            }
            return bundle;
        }
        bundle.putString("rdp", "1");
        if (this.f23540g != 1 && (context3 = this.f23534a) != null) {
            PreferenceManager.getDefaultSharedPreferences(context3).edit().putInt("gad_rdp", 1).apply();
            this.f23540g = 1;
        }
        bVar2 = b.BANNER;
        if (z6) {
            bundle.putString("query_info_type", "requester_type_2");
            if (bVar == bVar2 && (a9 = AdmobATConst.a(context, map2, map)) != null) {
                bundle.putInt("adaptive_banner_w", a9.f39380a);
                bundle.putInt("adaptive_banner_h", a9.f39381b);
            }
        }
        int intFromMap2 = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
        if (bVar == bVar2) {
            if (intFromMap2 == 2) {
                bundle.putString("collapsible", "bottom");
            } else if (intFromMap2 == 3) {
                bundle.putString("collapsible", "top");
            }
        }
        if (map.containsKey(j.w.f13418t)) {
            bundle.putBoolean("is_hybrid_setup", ATInitMediation.getBooleanFromMap(map, j.w.f13418t, false));
        }
        stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f13417s, "");
        if (!TextUtils.isEmpty(stringFromMap)) {
            bundle.putString("placement_req_id", stringFromMap);
        }
        return bundle;
        bVar2 = b.BANNER;
        if (z6) {
        }
        int intFromMap22 = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
        if (bVar == bVar2) {
        }
        if (map.containsKey(j.w.f13418t)) {
        }
        stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f13417s, "");
        if (!TextUtils.isEmpty(stringFromMap)) {
        }
        return bundle;
    }

    public static AdMobATInitManager getInstance() {
        if (f23533j == null) {
            synchronized (AdMobATInitManager.class) {
                try {
                    if (f23533j == null) {
                        f23533j = new AdMobATInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23533j;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.13";
    }

    public Method getAppOpenLoadMethod() {
        if (!isLowestFor2400()) {
            return null;
        }
        try {
            return AbstractC4802b.class.getDeclaredMethod("load", Context.class, String.class, m2.g.class, Integer.TYPE, AbstractC4801a.class);
        } catch (Throwable th) {
            Log.e(f23532h, "startLoadSplashAd() >>> network version: +" + getNetworkVersion() + ", reflect method error: " + th.getMessage());
            return null;
        }
    }

    public String getGoogleAdManagerName() {
        return "Google Ad Manager";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public List getMetaValutStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.gms.ads.APPLICATION_ID");
        return arrayList;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Admob";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.google.android.gms.ads.MobileAdsInitProvider";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return AdmobATConst.getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        hashMap.put("play-services-ads-*.aar", bool);
        hashMap.put("play-services-ads-base-*.aar", bool);
        hashMap.put("play-services-ads-lite-*.aar", bool);
        hashMap.put("play-services-ads-identifier-*.aar", bool);
        hashMap.put("play-services-basement-*.aar", bool);
        hashMap.put("play-services-measurement-sdk-api-*.aar", bool);
        hashMap.put("play-services-tasks-*.aar", bool);
        try {
            hashMap.put("play-services-tasks-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-base-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-lite-*.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            hashMap.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            hashMap.put("play-services-measurement-sdk-api-*.aar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return hashMap;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public void initSDK(Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        if (this.f23535b == 0) {
            this.f23535b = System.currentTimeMillis();
        }
        if (this.i) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
                return;
            }
            return;
        }
        this.f23541k = ATInitMediation.getBooleanFromMap(map, j.w.f13403d);
        try {
            this.f23542l = ATInitMediation.getBooleanFromMap(map, j.w.f13404e);
            r rVar = J0.c().f40361j;
            if (rVar == null) {
                rVar = new r(new ArrayList(), -1, 1);
            }
            if (this.f23542l) {
                N6.h hVar = new N6.h();
                ArrayList arrayList = hVar.f2059b;
                hVar.b(rVar.f39396a);
                arrayList.clear();
                ArrayList arrayList2 = rVar.f39397b;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                hVar.f2060c = rVar.f39398c;
                hVar.b(1);
                MobileAds.d(new r(arrayList, hVar.f2058a, hVar.f2060c));
            }
        } catch (Throwable unused) {
        }
        this.f23534a = context.getApplicationContext();
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.admob.AdMobATInitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                AdMobATInitManager adMobATInitManager = AdMobATInitManager.this;
                AdMobATInitManager.a(adMobATInitManager, mediationInitCallback, map, adMobATInitManager.f23534a);
            }
        });
    }

    public boolean isLowestFor2400() {
        try {
            return Integer.parseInt(getNetworkVersion().replace(j.f13164z, "")) < 2400;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setAdmobAppMuted(boolean z6) {
        if (this.i) {
            MobileAds.c(z6);
        } else {
            this.f23543m = z6 ? 1 : 2;
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return false;
    }

    public final void a(String str, Object obj) {
        this.f23544n.put(str, new WeakReference(obj));
    }

    public final void a(String str) {
        this.f23544n.remove(str);
    }

    public static void a(Map<String, Object> map, i iVar) {
        if (iVar == null || map == null) {
            return;
        }
        map.put("value_micros", Long.valueOf(iVar.f39390c));
        map.put("currency_code", iVar.f39389b);
        map.put("precision_type", Integer.valueOf(iVar.f39388a));
    }

    private static void a(Map<String, Object> map, Map<String, Object> map2, f fVar) {
        try {
            List<String> b9 = b(map2);
            if (b9 == null || b9.size() == 0) {
                b9 = a(map);
            }
            if (b9 != null && b9.size() > 0) {
                if (ATSDK.isNetworkLogDebug()) {
                    b9.size();
                    for (int i = 0; i < b9.size(); i++) {
                        b9.get(i);
                    }
                }
                if (b9.size() == 1) {
                    fVar.h(b9.get(0));
                } else {
                    fVar.i(b9);
                }
            }
            Object obj = map2.get(AdmobATConst.CONTENT_KEYWORDS);
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                for (Object obj2 : list) {
                    if (ATSDK.isNetworkLogDebug()) {
                        Objects.toString(obj2);
                    }
                    if (obj2 instanceof String) {
                        ((E0) fVar.f67u).f40310a.add((String) obj2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static List<String> b(Map<String, Object> map) {
        if (!map.containsKey(AdmobATConst.CONTENT_URLS)) {
            return null;
        }
        try {
            Object obj = map.get(AdmobATConst.CONTENT_URLS);
            if (!(obj instanceof List)) {
                return null;
            }
            Iterator it = ((List) obj).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static List<String> a(Map<String, Object> map) {
        if (!map.containsKey("web_content_urls")) {
            return null;
        }
        try {
            Object obj = map.get("web_content_urls");
            if (!(obj instanceof JSONArray)) {
                return null;
            }
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final f a(Context context, Map<String, Object> map, Map<String, Object> map2, b bVar, boolean z6) {
        f fVar = new f(3);
        a(map, map2, fVar);
        try {
            String stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f13416r, "");
            if (!TextUtils.isEmpty(stringFromMap)) {
                ((E0) fVar.f67u).f40318j = stringFromMap;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        fVar.e(b(context, map, map2, bVar, z6));
        return fVar;
    }

    public final C4766a a(Context context, Map<String, Object> map, Map<String, Object> map2, b bVar) {
        C4766a c4766a = new C4766a(3);
        c4766a.e(b(context, map, map2, bVar, false));
        return c4766a;
    }

    public final void a(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final b bVar, final ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (this.f23537d == 0) {
            this.f23537d = System.currentTimeMillis();
            this.f23539f = ATInitMediation.getStringFromMap(map, j.w.f13397H, "");
        }
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.admob.AdMobATInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    f a9 = AdMobATInitManager.this.a(context, map, map2, bVar, true);
                    Context context2 = context;
                    b bVar2 = bVar;
                    a9.getClass();
                    a.a(context2, bVar2, new m2.g(a9), new H2.b() { // from class: com.anythink.network.admob.AdMobATInitManager.2.1
                        @Override // H2.b
                        public final void onFailure(String str) {
                            ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                            if (aTBidRequestInfoListener2 != null) {
                                aTBidRequestInfoListener2.onFailed(str);
                            }
                        }

                        @Override // H2.b
                        public final void onSuccess(a aVar) {
                            String str = aVar != null ? aVar.f1236a.f2011n : "";
                            if (TextUtils.isEmpty(str)) {
                                ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                                if (aTBidRequestInfoListener2 != null) {
                                    aTBidRequestInfoListener2.onFailed("Admob QueryInfo is empty.");
                                    return;
                                }
                                return;
                            }
                            AdMobATInitManager adMobATInitManager = AdMobATInitManager.this;
                            if (adMobATInitManager.f23538e == 0) {
                                adMobATInitManager.f23538e = System.currentTimeMillis();
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            AdmobBidRequestInfo admobBidRequestInfo = new AdmobBidRequestInfo(context, str, map, map2, bVar);
                            ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                            if (aTBidRequestInfoListener3 != null) {
                                aTBidRequestInfoListener3.onSuccess(admobBidRequestInfo);
                            }
                            if (ATInitMediation.getIntFromMap(map, j.w.f13396G, 1) == 2) {
                                AdMobATInitManager adMobATInitManager2 = AdMobATInitManager.getInstance();
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                adMobATInitManager2.initSDK(context, map, null);
                            }
                        }
                    });
                } catch (Throwable th) {
                    ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                    if (aTBidRequestInfoListener2 != null) {
                        aTBidRequestInfoListener2.onFailed("Admob QueryInfo.generate() error: " + th.getMessage());
                    }
                }
            }
        });
    }

    public static void a(AdMobATInitManager adMobATInitManager, MediationInitCallback mediationInitCallback, Map map, Context context) {
        try {
            synchronized (adMobATInitManager) {
                try {
                    if (adMobATInitManager.i) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    try {
                        Object obj = map.get(j.w.f13412n);
                        if (obj != null && !((Boolean) obj).booleanValue()) {
                            if (ATSDK.isNetworkLogDebug()) {
                                Log.i(f23532h, "disableMediationAdapterInitialization");
                            }
                            MobileAds.a(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        adMobATInitManager.f23540g = PreferenceManager.getDefaultSharedPreferences(context).getInt("gad_rdp", 0);
                    } catch (Throwable unused2) {
                    }
                    J0.c().d(context, null);
                    int i = adMobATInitManager.f23543m;
                    if (i != 0) {
                        MobileAds.c(i == 1);
                    }
                    if (adMobATInitManager.f23536c == 0) {
                        adMobATInitManager.f23536c = System.currentTimeMillis();
                        HashMap hashMap = new HashMap();
                        hashMap.put("init_st", Long.valueOf(adMobATInitManager.f23535b));
                        hashMap.put("init_et", Long.valueOf(adMobATInitManager.f23536c));
                        hashMap.put("token_st", Long.valueOf(adMobATInitManager.f23537d));
                        hashMap.put("token_et", Long.valueOf(adMobATInitManager.f23538e));
                        hashMap.put(j.w.f13396G, Integer.valueOf(ATInitMediation.getIntFromMap(map, j.w.f13396G, 1)));
                        hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, ATInitMediation.getStringFromMap(map, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "-1"));
                        hashMap.put("admob_init_adsource_id", ATInitMediation.getStringFromMap(map, j.w.f13397H, ""));
                        hashMap.put("admob_token_adsource_id", adMobATInitManager.f23539f);
                        adMobATInitManager.sendNetworkEvent(2, g.f17337a, hashMap);
                    }
                    adMobATInitManager.i = true;
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            adMobATInitManager.i = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th.getMessage());
            }
        }
    }
}
