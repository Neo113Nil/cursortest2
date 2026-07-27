package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2927ac implements InterfaceC3249gc {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2927ac f29059u = new C2927ac(20);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2927ac f29060v = new C2927ac(21);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2927ac f29061w = new C2927ac(22);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2927ac f29062x = new C2927ac(23);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2927ac f29063y = new C2927ac(24);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2927ac f29064z = new C2927ac(27);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29065n;

    public /* synthetic */ C2927ac(int i) {
        this.f29065n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(Object obj, Map map) {
        AbstractC2839Wg abstractC2839Wg;
        C2707Og c2707Og;
        AbstractC2839Wg abstractC2839Wg2;
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
        if (v2.i.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            v2.i.a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C2724Pg c2724Pg = C4835j.f39730C.f39731A;
        if (map.containsKey("abort")) {
            if (c2724Pg.a(interfaceC4061vh)) {
                return;
            }
            v2.i.f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b9 = b("periodicReportIntervalMs", map);
        b("exoPlayerRenderingIntervalMs", map);
        b("exoPlayerIdleIntervalMs", map);
        C2486Bg c2486Bg = new C2486Bg((String) map.get("flags"));
        C2707Og c2707Og2 = null;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    v2.i.f("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (c2486Bg.f23928k) {
                Iterator it = c2724Pg.f26840n.iterator();
                while (it.hasNext()) {
                    c2707Og = (C2707Og) it.next();
                    if (c2707Og.f26628v == interfaceC4061vh && str.equals(c2707Og.f26630x)) {
                        break;
                    }
                }
                c2707Og = null;
                if (c2707Og == null) {
                    v2.i.f("Precache task is already running.");
                    return;
                }
                if (interfaceC4061vh.k() == null) {
                    v2.i.f("Precache requires a dependency provider.");
                    return;
                }
                Integer b10 = b("player", map);
                if (b10 == null) {
                    b10 = 0;
                }
                if (b9 != null) {
                    interfaceC4061vh.J0(b9.intValue());
                }
                int intValue = b10.intValue();
                Object obj2 = interfaceC4061vh.k().f38707u;
                if (intValue > 0) {
                    int i6 = C3414jh.f31277O.get();
                    if (i6 < c2486Bg.f23925g) {
                        C2986bh c2986bh = new C2986bh(interfaceC4061vh);
                        C3414jh c3414jh = new C3414jh(interfaceC4061vh.getContext(), c2486Bg, (InterfaceC4061vh) c2986bh.f28369v.get(), null);
                        int i9 = u2.z.f41319b;
                        v2.i.e("ExoPlayerAdapter initialized.");
                        c2986bh.f29305w = c3414jh;
                        c3414jh.f31280C = c2986bh;
                        abstractC2839Wg2 = c2986bh;
                    } else {
                        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32360s)).booleanValue()) {
                            i6 = C2887Zg.f28922H.get();
                        }
                        abstractC2839Wg2 = i6 < c2486Bg.f23920b ? new C2887Zg(interfaceC4061vh, c2486Bg) : new C2871Yg(interfaceC4061vh);
                    }
                } else {
                    C2855Xg c2855Xg = new C2855Xg(interfaceC4061vh);
                    File cacheDir = c2855Xg.f28367n.getCacheDir();
                    if (cacheDir == null) {
                        int i10 = u2.z.f41319b;
                        v2.i.f("Context.getCacheDir() returned null");
                    } else {
                        File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                        c2855Xg.f28548w = file;
                        if (!file.isDirectory() && !file.mkdirs()) {
                            String valueOf = String.valueOf(file.getAbsolutePath());
                            int i11 = u2.z.f41319b;
                            v2.i.f("Could not create preload cache directory at ".concat(valueOf));
                            c2855Xg.f28548w = null;
                        } else if (!file.setReadable(true, false) || !file.setExecutable(true, false)) {
                            String valueOf2 = String.valueOf(file.getAbsolutePath());
                            int i12 = u2.z.f41319b;
                            v2.i.f("Could not set cache file permissions at ".concat(valueOf2));
                            c2855Xg.f28548w = null;
                        }
                    }
                    abstractC2839Wg2 = c2855Xg;
                }
                new C2707Og(interfaceC4061vh, abstractC2839Wg2, str, strArr).l();
                abstractC2839Wg = abstractC2839Wg2;
            } else {
                Iterator it2 = c2724Pg.f26840n.iterator();
                while (it2.hasNext()) {
                    c2707Og = (C2707Og) it2.next();
                    if (c2707Og.f26628v == interfaceC4061vh) {
                        break;
                    }
                }
                c2707Og = null;
                if (c2707Og == null) {
                }
            }
        } else {
            Iterator it3 = c2724Pg.f26840n.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C2707Og c2707Og3 = (C2707Og) it3.next();
                if (c2707Og3.f26628v == interfaceC4061vh) {
                    c2707Og2 = c2707Og3;
                    break;
                }
            }
            if (c2707Og2 == null) {
                v2.i.f("Precache must specify a source.");
                return;
            }
            abstractC2839Wg = c2707Og2.f26629w;
        }
        Integer b11 = b("minBufferMs", map);
        if (b11 != null) {
            abstractC2839Wg.h(b11.intValue());
        }
        Integer b12 = b("maxBufferMs", map);
        if (b12 != null) {
            abstractC2839Wg.g(b12.intValue());
        }
        Integer b13 = b("bufferForPlaybackMs", map);
        if (b13 != null) {
            abstractC2839Wg.i(b13.intValue());
        }
        Integer b14 = b("bufferForPlaybackAfterRebufferMs", map);
        if (b14 != null) {
            abstractC2839Wg.j(b14.intValue());
        }
    }

    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            String o6 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i = u2.z.f41319b;
            v2.i.f(o6);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:89|90|91|(12:130|131|132|(10:96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108|(2:110|(1:112)))|113|114|115|(1:117)(1:126)|118|119|121|122)(1:93)|94|(0)|113|114|115|(0)(0)|118|119|121|122|87) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0352, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0353, code lost:
    
        r1 = u2.z.f41319b;
        v2.i.d("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        p2.C4835j.f39730C.f39740h.d(r1.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e9  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        JSONObject i;
        JSONObject o6;
        C4019ut c4019ut;
        C4019ut c4019ut2;
        C4019ut c4019ut3;
        String str;
        String str2;
        C2598Hq c2598Hq;
        char c9;
        int i6;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        BinderC2606Ih binderC2606Ih;
        char c10 = 0;
        int i9 = 0;
        int i10 = 1;
        switch (this.f29065n) {
            case 0:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                WindowManager windowManager = (WindowManager) interfaceC4061vh.getContext().getSystemService("window");
                u2.D d2 = C4835j.f39730C.f39735c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i11 = displayMetrics.widthPixels;
                int i12 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                HashMap hashMap = new HashMap();
                ((View) interfaceC4061vh).getLocationInWindow(iArr);
                hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
                com.anythink.basead.exoplayer.f.f.y(iArr[1], hashMap, "yInPixels", i11, "windowWidthInPixels");
                hashMap.put("windowHeightInPixels", Integer.valueOf(i12));
                interfaceC4061vh.d("locationReady", hashMap);
                int i13 = u2.z.f41319b;
                v2.i.f("GET LOCATION COMPILED");
                return;
            case 1:
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) obj;
                InterfaceC3408jb c12 = interfaceC4061vh2.c1();
                if (c12 == null || (i = c12.i()) == null) {
                    interfaceC4061vh2.e("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    interfaceC4061vh2.e("nativeAdViewSignalsReady", i);
                    return;
                }
            case 2:
                InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) obj;
                InterfaceC3408jb c13 = interfaceC4061vh3.c1();
                if (c13 == null || (o6 = c13.o()) == null) {
                    interfaceC4061vh3.e("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    interfaceC4061vh3.e("nativeClickMetaReady", o6);
                    return;
                }
            case 3:
                InterfaceC4061vh interfaceC4061vh4 = (InterfaceC4061vh) obj;
                Y y7 = C4835j.f39730C.f39750s;
                Context context = interfaceC4061vh4.getContext();
                synchronized (y7) {
                    y7.f28624d = interfaceC4061vh4;
                    if (!y7.a(context)) {
                        y7.c("Unable to bind", "on_play_store_bind");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(NativeAdvancedJsUtils.f17906p, "fetch_completed");
                    y7.d(hashMap2, "on_play_store_bind");
                    return;
                }
            case 4:
                InterfaceC4061vh interfaceC4061vh5 = (InterfaceC4061vh) obj;
                if (TextUtils.isEmpty((CharSequence) map.get(com.anythink.expressad.videocommon.e.b.f22407u))) {
                    u2.z.k("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                AA aa = new AA();
                aa.f23642c = 8388691;
                byte b9 = (byte) (aa.f23646g | 1);
                aa.f23643d = -1.0f;
                aa.f23646g = (byte) (((byte) (((byte) (((byte) (b9 | 2)) | 4)) | 8)) | 16);
                aa.f23641b = (String) map.get(com.anythink.expressad.videocommon.e.b.f22407u);
                aa.f23644e = interfaceC4061vh5.getWidth();
                aa.f23646g = (byte) (aa.f23646g | 32);
                IBinder windowToken = interfaceC4061vh5.V().getWindowToken();
                if (windowToken == null) {
                    throw new NullPointerException("Null windowToken");
                }
                aa.f23640a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    aa.f23642c = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
                    aa.f23646g = (byte) (aa.f23646g | 1);
                } else {
                    aa.f23642c = 81;
                    aa.f23646g = (byte) (aa.f23646g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    aa.f23643d = Float.parseFloat((String) map.get("verticalMargin"));
                    aa.f23646g = (byte) (aa.f23646g | 2);
                } else {
                    aa.f23643d = 0.02f;
                    aa.f23646g = (byte) (aa.f23646g | 2);
                }
                if (map.containsKey("enifd")) {
                    aa.f23645f = (String) map.get("enifd");
                }
                try {
                    C4835j.f39730C.f39750s.b(interfaceC4061vh5, aa.a());
                    return;
                } catch (NullPointerException e9) {
                    C4835j.f39730C.f39740h.d("DefaultGmsgHandlers.ShowLMDOverlay", e9);
                    u2.z.k("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 5:
                Y y9 = C4835j.f39730C.f39750s;
                if (!y9.f28621a || (c4019ut = (C4019ut) y9.f28625e) == null) {
                    u2.z.k("LastMileDelivery not connected");
                    return;
                } else {
                    ((FA) c4019ut.f34603u).a(y9.e(), (t2.n) y9.f28626f, 1);
                    y9.d(new HashMap(), "onLMDOverlayExpand");
                    return;
                }
            case 6:
                Y y10 = C4835j.f39730C.f39750s;
                if (!y10.f28621a || (c4019ut2 = (C4019ut) y10.f28625e) == null) {
                    u2.z.k("LastMileDelivery not connected");
                    return;
                } else {
                    ((FA) c4019ut2.f34603u).a(y10.e(), (t2.n) y10.f28626f, 2);
                    y10.d(new HashMap(), "onLMDOverlayCollapse");
                    return;
                }
            case 7:
                Y y11 = C4835j.f39730C.f39750s;
                if (!y11.f28621a || (c4019ut3 = (C4019ut) y11.f28625e) == null) {
                    u2.z.k("LastMileDelivery not connected");
                    return;
                }
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Vc)).booleanValue() || TextUtils.isEmpty((String) y11.f28623c)) {
                    String str3 = (String) y11.f28622b;
                    if (str3 != null) {
                        str2 = str3;
                        str = null;
                        C4253zA c4253zA = new C4253zA(str2, str);
                        t2.n nVar = (t2.n) y11.f28626f;
                        FA fa = (FA) c4019ut3.f34603u;
                        c2598Hq = fa.f24752a;
                        if (c2598Hq != null) {
                            FA.f24750c.c("error: %s", "Play Store not found.");
                            return;
                        } else {
                            if (FA.c(nVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
                                c2598Hq.a(new IA(c2598Hq, new RunnableC3865s0(11, fa, c4253zA, nVar), 0));
                                return;
                            }
                            return;
                        }
                    }
                    y11.c("Missing session token and/or appId", "onLMDupdate");
                    str = null;
                } else {
                    str = (String) y11.f28623c;
                }
                str2 = null;
                C4253zA c4253zA2 = new C4253zA(str2, str);
                t2.n nVar2 = (t2.n) y11.f28626f;
                FA fa2 = (FA) c4019ut3.f34603u;
                c2598Hq = fa2.f24752a;
                if (c2598Hq != null) {
                }
                break;
            case 8:
                InterfaceC4061vh interfaceC4061vh6 = (InterfaceC4061vh) obj;
                try {
                    Sx f3 = Sx.f(interfaceC4061vh6.getContext());
                    f3.getClass();
                    synchronized (Sx.class) {
                        f3.c(false);
                    }
                    Tx.f(interfaceC4061vh6.getContext()).g();
                    Ux.e(interfaceC4061vh6.getContext()).q();
                    return;
                } catch (IOException e10) {
                    C4835j.f39730C.f39740h.d("DefaultGmsgHandlers.ResetPaid", e10);
                    return;
                }
            case 9:
                InterfaceC4061vh interfaceC4061vh7 = (InterfaceC4061vh) obj;
                try {
                    String str4 = (String) map.get("enabled");
                    C2927ac c2927ac = AbstractC3195fc.f30252a;
                    if (!AbstractC3043cl.D("true", str4) && !AbstractC3043cl.D("false", str4)) {
                        return;
                    }
                    Qx f9 = Qx.f(interfaceC4061vh7.getContext());
                    boolean parseBoolean = Boolean.parseBoolean(str4);
                    f9.getClass();
                    synchronized (Qx.class) {
                        ((S0.e) f9.f27139u).t(Boolean.valueOf(parseBoolean), "paidv2_user_option");
                    }
                    return;
                } catch (IOException e11) {
                    C4835j.f39730C.f39740h.d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e11);
                    return;
                }
            case 10:
                InterfaceC4061vh interfaceC4061vh8 = (InterfaceC4061vh) obj;
                try {
                    JSONObject jSONObject = new JSONObject((String) map.get("args"));
                    Iterator<String> keys = jSONObject.keys();
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(interfaceC4061vh8.getContext()).edit();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof Integer) {
                            edit.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Long) {
                            edit.putLong(next, ((Long) obj2).longValue());
                        } else if (obj2 instanceof Double) {
                            edit.putFloat(next, ((Double) obj2).floatValue());
                        } else if (obj2 instanceof Float) {
                            edit.putFloat(next, ((Float) obj2).floatValue());
                        } else if (obj2 instanceof Boolean) {
                            edit.putBoolean(next, ((Boolean) obj2).booleanValue());
                        } else if (obj2 instanceof String) {
                            edit.putString(next, (String) obj2);
                        }
                    }
                    edit.apply();
                    return;
                } catch (JSONException e12) {
                    C4835j.f39730C.f39740h.d("GMSG write local storage KV pairs handler", e12);
                    return;
                }
            case 11:
                InterfaceC4061vh interfaceC4061vh9 = (InterfaceC4061vh) obj;
                try {
                    JSONArray jSONArray = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(interfaceC4061vh9.getContext()).edit();
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        edit2.remove(jSONArray.getString(i14));
                    }
                    edit2.apply();
                    return;
                } catch (JSONException e13) {
                    C4835j.f39730C.f39740h.d("GMSG clear local storage keys handler", e13);
                    return;
                }
            case 12:
                InterfaceC4061vh interfaceC4061vh10 = (InterfaceC4061vh) obj;
                if (interfaceC4061vh10.q0() != null) {
                    ((BinderC3642nt) interfaceC4061vh10.q0()).U3(3);
                }
                BinderC5036d z02 = interfaceC4061vh10.z0();
                if (z02 != null) {
                    z02.t();
                    return;
                }
                BinderC5036d F02 = interfaceC4061vh10.F0();
                if (F02 != null) {
                    F02.t();
                    return;
                } else {
                    int i15 = u2.z.f41319b;
                    v2.i.f("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 13:
                ((InterfaceC4061vh) obj).x0("1".equals(map.get("custom_close")));
                return;
            case 14:
                String valueOf = String.valueOf((String) map.get(com.anythink.expressad.foundation.h.k.f19636g));
                int i16 = u2.z.f41319b;
                v2.i.e("Received log message: ".concat(valueOf));
                return;
            case 15:
                InterfaceC3408jb c14 = ((InterfaceC4061vh) obj).c1();
                if (c14 != null) {
                    c14.mo0c();
                    return;
                }
                return;
            case 16:
                ((InterfaceC4061vh) obj).l1(!Boolean.parseBoolean((String) map.get("disabled")));
                return;
            case 17:
                InterfaceC4061vh interfaceC4061vh11 = (InterfaceC4061vh) obj;
                String str5 = (String) map.get(NativeAdvancedJsUtils.f17906p);
                if (com.anythink.expressad.foundation.d.d.co.equals(str5)) {
                    interfaceC4061vh11.z();
                    return;
                } else {
                    if (com.anythink.expressad.foundation.d.d.cp.equals(str5)) {
                        interfaceC4061vh11.v();
                        return;
                    }
                    return;
                }
            case 18:
                InterfaceC4061vh interfaceC4061vh12 = (InterfaceC4061vh) obj;
                if (map.containsKey(com.anythink.expressad.foundation.d.d.cg)) {
                    C2657Lh g02 = interfaceC4061vh12.g0();
                    synchronized (g02.f26156w) {
                    }
                    g02.f26149W++;
                    g02.B();
                    return;
                }
                if (map.containsKey("stop")) {
                    r0.f26149W--;
                    interfaceC4061vh12.g0().B();
                    return;
                }
                if (map.containsKey(com.anythink.expressad.f.a.b.dP)) {
                    C2657Lh g03 = interfaceC4061vh12.g0();
                    C3068d9 c3068d9 = g03.f26154u;
                    if (c3068d9 != null) {
                        c3068d9.b(10005);
                    }
                    g03.f26148V = true;
                    g03.f26134G = 10004;
                    g03.f26135H = "Page loaded delay cancel.";
                    g03.B();
                    g03.f26152n.destroy();
                    return;
                }
                return;
            case 19:
                InterfaceC4061vh interfaceC4061vh13 = (InterfaceC4061vh) obj;
                if (map.containsKey(com.anythink.expressad.foundation.d.d.cg)) {
                    interfaceC4061vh13.K0(true);
                }
                if (map.containsKey("stop")) {
                    interfaceC4061vh13.K0(false);
                    return;
                }
                return;
            case 20:
                InterfaceC4061vh interfaceC4061vh14 = (InterfaceC4061vh) obj;
                C2927ac c2927ac2 = AbstractC3195fc.f30252a;
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.t9)).booleanValue()) {
                    int i17 = u2.z.f41319b;
                    v2.i.f("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str6 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str6)) {
                    int i18 = u2.z.f41319b;
                    v2.i.f("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap hashMap3 = new HashMap();
                Boolean valueOf2 = Boolean.valueOf(interfaceC4061vh14.getContext().getPackageManager().getLaunchIntentForPackage(str6) != null);
                hashMap3.put(str6, valueOf2);
                StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 13 + valueOf2.toString().length());
                sb.append("/canOpenApp;");
                sb.append(str6);
                sb.append(";");
                sb.append(valueOf2);
                u2.z.k(sb.toString());
                interfaceC4061vh14.d("openableApp", hashMap3);
                return;
            case 21:
                InterfaceC4061vh interfaceC4061vh15 = (InterfaceC4061vh) obj;
                C2927ac c2927ac3 = AbstractC3195fc.f30252a;
                PackageManager packageManager = interfaceC4061vh15.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray2 = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject2 = new JSONObject();
                        int i19 = 0;
                        while (i19 < jSONArray2.length()) {
                            try {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                                optString = jSONObject3.optString("id");
                                optString2 = jSONObject3.optString("u");
                                optString3 = jSONObject3.optString("i");
                                optString4 = jSONObject3.optString(com.anythink.expressad.f.a.b.dI);
                                optString5 = jSONObject3.optString("p");
                                optString6 = jSONObject3.optString("c");
                                optString7 = jSONObject3.optString("intent_url");
                            } catch (JSONException e14) {
                                c9 = c10;
                                i6 = i9;
                                int i20 = u2.z.f41319b;
                                v2.i.d("Error parsing the intent data.", e14);
                            }
                            if (TextUtils.isEmpty(optString7)) {
                                i6 = i9;
                            } else {
                                try {
                                    parseUri = Intent.parseUri(optString7, i9);
                                    i6 = i9;
                                } catch (URISyntaxException e15) {
                                    String valueOf3 = String.valueOf(optString7);
                                    int i21 = u2.z.f41319b;
                                    i6 = i9;
                                    v2.i.d("Error parsing the url: ".concat(valueOf3), e15);
                                }
                                if (parseUri == null) {
                                    parseUri = new Intent();
                                    if (!TextUtils.isEmpty(optString2)) {
                                        parseUri.setData(Uri.parse(optString2));
                                    }
                                    if (!TextUtils.isEmpty(optString3)) {
                                        parseUri.setAction(optString3);
                                    }
                                    if (!TextUtils.isEmpty(optString4)) {
                                        parseUri.setType(optString4);
                                    }
                                    if (!TextUtils.isEmpty(optString5)) {
                                        parseUri.setPackage(optString5);
                                    }
                                    if (!TextUtils.isEmpty(optString6)) {
                                        String[] split = optString6.split("/", 2);
                                        if (split.length == 2) {
                                            parseUri.setComponent(new ComponentName(split[i6], split[1]));
                                        }
                                    }
                                }
                                Intent intent = parseUri;
                                c9 = 0;
                                ResolveInfo resolveInfo = packageManager.resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
                                jSONObject2.put(optString, resolveInfo == null ? 1 : i6);
                                i19++;
                                c10 = c9;
                                i9 = i6;
                            }
                            parseUri = null;
                            if (parseUri == null) {
                            }
                            Intent intent2 = parseUri;
                            c9 = 0;
                            ResolveInfo resolveInfo2 = packageManager.resolveActivity(intent2, com.anythink.basead.exoplayer.b.aX);
                            jSONObject2.put(optString, resolveInfo2 == null ? 1 : i6);
                            i19++;
                            c10 = c9;
                            i9 = i6;
                        }
                        interfaceC4061vh15.e("openableIntents", jSONObject2);
                        return;
                    } catch (JSONException unused) {
                        interfaceC4061vh15.e("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused2) {
                    interfaceC4061vh15.e("openableIntents", new JSONObject());
                    return;
                }
            case 22:
                InterfaceC4061vh interfaceC4061vh16 = (InterfaceC4061vh) obj;
                C2927ac c2927ac4 = AbstractC3195fc.f30252a;
                String str7 = (String) map.get("u");
                if (str7 == null) {
                    int i22 = u2.z.f41319b;
                    v2.i.f("URL missing from httpTrack GMSG.");
                    return;
                } else if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32250g)).booleanValue() || !str7.isEmpty()) {
                    new u2.u(interfaceC4061vh16.getContext(), interfaceC4061vh16.C().f41388n, str7, interfaceC4061vh16.K() != null ? interfaceC4061vh16.K().f27651x0 : null).l();
                    return;
                } else {
                    int i23 = u2.z.f41319b;
                    v2.i.f("URL is empty from httpTrack GMSG.");
                    return;
                }
            case 23:
                InterfaceC4061vh interfaceC4061vh17 = (InterfaceC4061vh) obj;
                C2927ac c2927ac5 = AbstractC3195fc.f30252a;
                String str8 = (String) map.get("tx");
                String str9 = (String) map.get("ty");
                String str10 = (String) map.get("td");
                try {
                    int parseInt = Integer.parseInt(str8);
                    int parseInt2 = Integer.parseInt(str9);
                    int parseInt3 = Integer.parseInt(str10);
                    C3441k7 R02 = interfaceC4061vh17.R0();
                    if (R02 != null) {
                        R02.f31381b.a(parseInt, parseInt2, parseInt3);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    int i24 = u2.z.f41319b;
                    v2.i.f("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 24:
                InterfaceC4061vh interfaceC4061vh18 = (InterfaceC4061vh) obj;
                C2927ac c2927ac6 = AbstractC3195fc.f30252a;
                String str11 = (String) map.get("urls");
                if (TextUtils.isEmpty(str11)) {
                    int i25 = u2.z.f41319b;
                    v2.i.f("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] split2 = str11.split(",");
                HashMap hashMap4 = new HashMap();
                PackageManager packageManager2 = interfaceC4061vh18.getContext().getPackageManager();
                int length = split2.length;
                int i26 = 0;
                while (i26 < length) {
                    String str12 = split2[i26];
                    String[] split3 = str12.split(";", 2);
                    Boolean valueOf4 = Boolean.valueOf(packageManager2.resolveActivity(new Intent(split3.length > i10 ? split3[i10].trim() : "android.intent.action.VIEW", Uri.parse(split3[0].trim())), com.anythink.basead.exoplayer.b.aX) != null ? i10 : 0);
                    hashMap4.put(str12, valueOf4);
                    int i27 = i10;
                    StringBuilder sb2 = new StringBuilder(str12.length() + 14 + valueOf4.toString().length());
                    sb2.append("/canOpenURLs;");
                    sb2.append(str12);
                    sb2.append(";");
                    sb2.append(valueOf4);
                    u2.z.k(sb2.toString());
                    i26++;
                    i10 = i27;
                }
                interfaceC4061vh18.d("openableURLs", hashMap4);
                return;
            case 25:
                InterfaceC4061vh interfaceC4061vh19 = (InterfaceC4061vh) obj;
                BinderC2606Ih g4 = interfaceC4061vh19.g();
                if (g4 == null) {
                    try {
                        BinderC2606Ih binderC2606Ih2 = new BinderC2606Ih(interfaceC4061vh19, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        interfaceC4061vh19.S0(binderC2606Ih2);
                        binderC2606Ih = binderC2606Ih2;
                    } catch (NullPointerException e16) {
                        e = e16;
                        int i28 = u2.z.f41319b;
                        v2.i.d("Unable to parse videoMeta message.", e);
                        C4835j.f39730C.f39740h.d("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    } catch (NumberFormatException e17) {
                        e = e17;
                        int i282 = u2.z.f41319b;
                        v2.i.d("Unable to parse videoMeta message.", e);
                        C4835j.f39730C.f39740h.d("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    }
                } else {
                    binderC2606Ih = g4;
                }
                float parseFloat = Float.parseFloat((String) map.get("duration"));
                boolean equals = "1".equals(map.get("muted"));
                float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
                int parseInt4 = Integer.parseInt((String) map.get("playbackState"));
                if (parseInt4 >= 0 && parseInt4 <= 3) {
                    i9 = parseInt4;
                }
                String str13 = (String) map.get("aspectRatio");
                float parseFloat3 = TextUtils.isEmpty(str13) ? 0.0f : Float.parseFloat(str13);
                if (v2.i.j(3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(i9).length() + 17 + String.valueOf(str13).length());
                    sb3.append("Video Meta GMSG: currentTime : ");
                    sb3.append(parseFloat2);
                    sb3.append(" , duration : ");
                    sb3.append(parseFloat);
                    sb3.append(" , isMuted : ");
                    sb3.append(equals);
                    sb3.append(" , playbackState : ");
                    sb3.append(i9);
                    sb3.append(" , aspectRatio : ");
                    sb3.append(str13);
                    v2.i.a(sb3.toString());
                }
                binderC2606Ih.W3(parseFloat2, parseFloat, i9, equals, parseFloat3);
                return;
            case 26:
                a(obj, map);
                return;
            default:
                int i29 = u2.z.f41319b;
                v2.i.a("Show native ad policy validator overlay.");
                ((InterfaceC4061vh) obj).V().setVisibility(0);
                return;
        }
    }
}
