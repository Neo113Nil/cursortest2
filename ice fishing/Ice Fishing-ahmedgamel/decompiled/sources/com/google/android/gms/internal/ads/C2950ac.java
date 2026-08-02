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
import l.C4659e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import v2.BinderC5100d;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2950ac implements InterfaceC3272gc {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2950ac f29834u = new C2950ac(20);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2950ac f29835v = new C2950ac(21);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2950ac f29836w = new C2950ac(22);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2950ac f29837x = new C2950ac(23);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2950ac f29838y = new C2950ac(24);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2950ac f29839z = new C2950ac(27);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29840n;

    public /* synthetic */ C2950ac(int i) {
        this.f29840n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(Object obj, Map map) {
        AbstractC2862Wg abstractC2862Wg;
        C2727Og c2727Og;
        AbstractC2862Wg abstractC2862Wg2;
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
        if (x2.i.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            x2.i.a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        C2744Pg c2744Pg = C4906k.f40186C.f40187A;
        if (map.containsKey("abort")) {
            if (c2744Pg.a(interfaceC4084vh)) {
                return;
            }
            x2.i.f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer b9 = b("periodicReportIntervalMs", map);
        b("exoPlayerRenderingIntervalMs", map);
        b("exoPlayerIdleIntervalMs", map);
        C2506Bg c2506Bg = new C2506Bg((String) map.get("flags"));
        C2727Og c2727Og2 = null;
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
                    x2.i.f("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (c2506Bg.f24701k) {
                Iterator it = c2744Pg.f27628n.iterator();
                while (it.hasNext()) {
                    c2727Og = (C2727Og) it.next();
                    if (c2727Og.f27404v == interfaceC4084vh && str.equals(c2727Og.f27406x)) {
                        break;
                    }
                }
                c2727Og = null;
                if (c2727Og == null) {
                    x2.i.f("Precache task is already running.");
                    return;
                }
                if (interfaceC4084vh.k() == null) {
                    x2.i.f("Precache requires a dependency provider.");
                    return;
                }
                Integer b10 = b("player", map);
                if (b10 == null) {
                    b10 = 0;
                }
                if (b9 != null) {
                    interfaceC4084vh.I0(b9.intValue());
                }
                int intValue = b10.intValue();
                Object obj2 = interfaceC4084vh.k().f39716c;
                if (intValue > 0) {
                    int i4 = C3437jh.f32064O.get();
                    if (i4 < c2506Bg.f24698g) {
                        C3009bh c3009bh = new C3009bh(interfaceC4084vh);
                        C3437jh c3437jh = new C3437jh(interfaceC4084vh.getContext(), c2506Bg, (InterfaceC4084vh) c3009bh.f29168v.get(), null);
                        int i6 = w2.z.f41712b;
                        x2.i.e("ExoPlayerAdapter initialized.");
                        c3009bh.f30094w = c3437jh;
                        c3437jh.f32067C = c3009bh;
                        abstractC2862Wg2 = c3009bh;
                    } else {
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33139s)).booleanValue()) {
                            i4 = C2910Zg.f29699H.get();
                        }
                        abstractC2862Wg2 = i4 < c2506Bg.f24693b ? new C2910Zg(interfaceC4084vh, c2506Bg) : new C2894Yg(interfaceC4084vh);
                    }
                } else {
                    C2878Xg c2878Xg = new C2878Xg(interfaceC4084vh);
                    File cacheDir = c2878Xg.f29166n.getCacheDir();
                    if (cacheDir == null) {
                        int i9 = w2.z.f41712b;
                        x2.i.f("Context.getCacheDir() returned null");
                    } else {
                        File file = new File(new File(cacheDir, "admobVideoStreams").getPath());
                        c2878Xg.f29320w = file;
                        if (!file.isDirectory() && !file.mkdirs()) {
                            String valueOf = String.valueOf(file.getAbsolutePath());
                            int i10 = w2.z.f41712b;
                            x2.i.f("Could not create preload cache directory at ".concat(valueOf));
                            c2878Xg.f29320w = null;
                        } else if (!file.setReadable(true, false) || !file.setExecutable(true, false)) {
                            String valueOf2 = String.valueOf(file.getAbsolutePath());
                            int i11 = w2.z.f41712b;
                            x2.i.f("Could not set cache file permissions at ".concat(valueOf2));
                            c2878Xg.f29320w = null;
                        }
                    }
                    abstractC2862Wg2 = c2878Xg;
                }
                new C2727Og(interfaceC4084vh, abstractC2862Wg2, str, strArr).l();
                abstractC2862Wg = abstractC2862Wg2;
            } else {
                Iterator it2 = c2744Pg.f27628n.iterator();
                while (it2.hasNext()) {
                    c2727Og = (C2727Og) it2.next();
                    if (c2727Og.f27404v == interfaceC4084vh) {
                        break;
                    }
                }
                c2727Og = null;
                if (c2727Og == null) {
                }
            }
        } else {
            Iterator it3 = c2744Pg.f27628n.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C2727Og c2727Og3 = (C2727Og) it3.next();
                if (c2727Og3.f27404v == interfaceC4084vh) {
                    c2727Og2 = c2727Og3;
                    break;
                }
            }
            if (c2727Og2 == null) {
                x2.i.f("Precache must specify a source.");
                return;
            }
            abstractC2862Wg = c2727Og2.f27405w;
        }
        Integer b11 = b("minBufferMs", map);
        if (b11 != null) {
            abstractC2862Wg.h(b11.intValue());
        }
        Integer b12 = b("maxBufferMs", map);
        if (b12 != null) {
            abstractC2862Wg.g(b12.intValue());
        }
        Integer b13 = b("bufferForPlaybackMs", map);
        if (b13 != null) {
            abstractC2862Wg.i(b13.intValue());
        }
        Integer b14 = b("bufferForPlaybackAfterRebufferMs", map);
        if (b14 != null) {
            abstractC2862Wg.j(b14.intValue());
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
            String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str.length() + 39 + String.valueOf(str2).length()), "Precache invalid numeric parameter '", str, "': ", str2);
            int i = w2.z.f41712b;
            x2.i.f(r9);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:89|90|91|(12:130|131|132|(10:96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108|(2:110|(1:112)))|113|114|115|(1:117)(1:126)|118|119|121|122)(1:93)|94|(0)|113|114|115|(0)(0)|118|119|121|122|87) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0352, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0353, code lost:
    
        r1 = w2.z.f41712b;
        x2.i.d("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x033a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        r2.C4906k.f40186C.f40196h.d(r1.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e9  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        JSONObject i;
        JSONObject o4;
        C4042ut c4042ut;
        C4042ut c4042ut2;
        C4042ut c4042ut3;
        String str;
        String str2;
        C2618Hq c2618Hq;
        char c9;
        int i4;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        Intent parseUri;
        BinderC2626Ih binderC2626Ih;
        char c10 = 0;
        int i6 = 0;
        int i9 = 1;
        switch (this.f29840n) {
            case 0:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                WindowManager windowManager = (WindowManager) interfaceC4084vh.getContext().getSystemService("window");
                w2.D d9 = C4906k.f40186C.f40191c;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                HashMap hashMap = new HashMap();
                ((View) interfaceC4084vh).getLocationInWindow(iArr);
                hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
                com.IceFishing.LiveIceFishing.k.A(iArr[1], hashMap, "yInPixels", i10, "windowWidthInPixels");
                hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
                interfaceC4084vh.d("locationReady", hashMap);
                int i12 = w2.z.f41712b;
                x2.i.f("GET LOCATION COMPILED");
                return;
            case 1:
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) obj;
                InterfaceC3431jb b12 = interfaceC4084vh2.b1();
                if (b12 == null || (i = b12.i()) == null) {
                    interfaceC4084vh2.e("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    interfaceC4084vh2.e("nativeAdViewSignalsReady", i);
                    return;
                }
            case 2:
                InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) obj;
                InterfaceC3431jb b13 = interfaceC4084vh3.b1();
                if (b13 == null || (o4 = b13.o()) == null) {
                    interfaceC4084vh3.e("nativeClickMetaReady", new JSONObject());
                    return;
                } else {
                    interfaceC4084vh3.e("nativeClickMetaReady", o4);
                    return;
                }
            case 3:
                InterfaceC4084vh interfaceC4084vh4 = (InterfaceC4084vh) obj;
                Y y7 = C4906k.f40186C.f40206s;
                Context context = interfaceC4084vh4.getContext();
                synchronized (y7) {
                    y7.f29401d = interfaceC4084vh4;
                    if (!y7.a(context)) {
                        y7.c("Unable to bind", "on_play_store_bind");
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(NativeAdvancedJsUtils.f18693p, "fetch_completed");
                    y7.d(hashMap2, "on_play_store_bind");
                    return;
                }
            case 4:
                InterfaceC4084vh interfaceC4084vh5 = (InterfaceC4084vh) obj;
                if (TextUtils.isEmpty((CharSequence) map.get(com.anythink.expressad.videocommon.e.b.f23194u))) {
                    w2.z.k("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                AA aa = new AA();
                aa.f24422c = 8388691;
                byte b9 = (byte) (aa.f24426g | 1);
                aa.f24423d = -1.0f;
                aa.f24426g = (byte) (((byte) (((byte) (((byte) (b9 | 2)) | 4)) | 8)) | 16);
                aa.f24421b = (String) map.get(com.anythink.expressad.videocommon.e.b.f23194u);
                aa.f24424e = interfaceC4084vh5.getWidth();
                aa.f24426g = (byte) (aa.f24426g | 32);
                IBinder windowToken = interfaceC4084vh5.V().getWindowToken();
                if (windowToken == null) {
                    throw new NullPointerException("Null windowToken");
                }
                aa.f24420a = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    aa.f24422c = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
                    aa.f24426g = (byte) (aa.f24426g | 1);
                } else {
                    aa.f24422c = 81;
                    aa.f24426g = (byte) (aa.f24426g | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    aa.f24423d = Float.parseFloat((String) map.get("verticalMargin"));
                    aa.f24426g = (byte) (aa.f24426g | 2);
                } else {
                    aa.f24423d = 0.02f;
                    aa.f24426g = (byte) (aa.f24426g | 2);
                }
                if (map.containsKey("enifd")) {
                    aa.f24425f = (String) map.get("enifd");
                }
                try {
                    C4906k.f40186C.f40206s.b(interfaceC4084vh5, aa.a());
                    return;
                } catch (NullPointerException e9) {
                    C4906k.f40186C.f40196h.d("DefaultGmsgHandlers.ShowLMDOverlay", e9);
                    w2.z.k("Missing parameters for LMD Overlay show request");
                    return;
                }
            case 5:
                Y y9 = C4906k.f40186C.f40206s;
                if (!y9.f29398a || (c4042ut = (C4042ut) y9.f29402e) == null) {
                    w2.z.k("LastMileDelivery not connected");
                    return;
                } else {
                    ((FA) c4042ut.f35366u).a(y9.e(), (C4659e) y9.f29403f, 1);
                    y9.d(new HashMap(), "onLMDOverlayExpand");
                    return;
                }
            case 6:
                Y y10 = C4906k.f40186C.f40206s;
                if (!y10.f29398a || (c4042ut2 = (C4042ut) y10.f29402e) == null) {
                    w2.z.k("LastMileDelivery not connected");
                    return;
                } else {
                    ((FA) c4042ut2.f35366u).a(y10.e(), (C4659e) y10.f29403f, 2);
                    y10.d(new HashMap(), "onLMDOverlayCollapse");
                    return;
                }
            case 7:
                Y y11 = C4906k.f40186C.f40206s;
                if (!y11.f29398a || (c4042ut3 = (C4042ut) y11.f29402e) == null) {
                    w2.z.k("LastMileDelivery not connected");
                    return;
                }
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Vc)).booleanValue() || TextUtils.isEmpty((String) y11.f29400c)) {
                    String str3 = (String) y11.f29399b;
                    if (str3 != null) {
                        str2 = str3;
                        str = null;
                        C4276zA c4276zA = new C4276zA(str2, str);
                        C4659e c4659e = (C4659e) y11.f29403f;
                        FA fa = (FA) c4042ut3.f35366u;
                        c2618Hq = fa.f25508a;
                        if (c2618Hq != null) {
                            FA.f25506c.c("error: %s", "Play Store not found.");
                            return;
                        } else {
                            if (FA.c(c4659e, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(str2, str))) {
                                c2618Hq.a(new IA(c2618Hq, new RunnableC3888s0(11, fa, c4276zA, c4659e), 0));
                                return;
                            }
                            return;
                        }
                    }
                    y11.c("Missing session token and/or appId", "onLMDupdate");
                    str = null;
                } else {
                    str = (String) y11.f29400c;
                }
                str2 = null;
                C4276zA c4276zA2 = new C4276zA(str2, str);
                C4659e c4659e2 = (C4659e) y11.f29403f;
                FA fa2 = (FA) c4042ut3.f35366u;
                c2618Hq = fa2.f25508a;
                if (c2618Hq != null) {
                }
                break;
            case 8:
                InterfaceC4084vh interfaceC4084vh6 = (InterfaceC4084vh) obj;
                try {
                    Sx f2 = Sx.f(interfaceC4084vh6.getContext());
                    f2.getClass();
                    synchronized (Sx.class) {
                        f2.c(false);
                    }
                    Tx.f(interfaceC4084vh6.getContext()).g();
                    Ux.f(interfaceC4084vh6.getContext()).r();
                    return;
                } catch (IOException e10) {
                    C4906k.f40186C.f40196h.d("DefaultGmsgHandlers.ResetPaid", e10);
                    return;
                }
            case 9:
                InterfaceC4084vh interfaceC4084vh7 = (InterfaceC4084vh) obj;
                try {
                    String str4 = (String) map.get("enabled");
                    C2950ac c2950ac = AbstractC3218fc.f31040a;
                    if (!AbstractC3066cl.D("true", str4) && !AbstractC3066cl.D("false", str4)) {
                        return;
                    }
                    Qx f9 = Qx.f(interfaceC4084vh7.getContext());
                    boolean parseBoolean = Boolean.parseBoolean(str4);
                    f9.getClass();
                    synchronized (Qx.class) {
                        ((S0.e) f9.f27895u).J(Boolean.valueOf(parseBoolean), "paidv2_user_option");
                    }
                    return;
                } catch (IOException e11) {
                    C4906k.f40186C.f40196h.d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e11);
                    return;
                }
            case 10:
                InterfaceC4084vh interfaceC4084vh8 = (InterfaceC4084vh) obj;
                try {
                    JSONObject jSONObject = new JSONObject((String) map.get("args"));
                    Iterator<String> keys = jSONObject.keys();
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(interfaceC4084vh8.getContext()).edit();
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
                    C4906k.f40186C.f40196h.d("GMSG write local storage KV pairs handler", e12);
                    return;
                }
            case 11:
                InterfaceC4084vh interfaceC4084vh9 = (InterfaceC4084vh) obj;
                try {
                    JSONArray jSONArray = new JSONArray((String) map.get("args"));
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(interfaceC4084vh9.getContext()).edit();
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        edit2.remove(jSONArray.getString(i13));
                    }
                    edit2.apply();
                    return;
                } catch (JSONException e13) {
                    C4906k.f40186C.f40196h.d("GMSG clear local storage keys handler", e13);
                    return;
                }
            case 12:
                InterfaceC4084vh interfaceC4084vh10 = (InterfaceC4084vh) obj;
                if (interfaceC4084vh10.p0() != null) {
                    ((BinderC3665nt) interfaceC4084vh10.p0()).U3(3);
                }
                BinderC5100d y02 = interfaceC4084vh10.y0();
                if (y02 != null) {
                    y02.t();
                    return;
                }
                BinderC5100d E02 = interfaceC4084vh10.E0();
                if (E02 != null) {
                    E02.t();
                    return;
                } else {
                    int i14 = w2.z.f41712b;
                    x2.i.f("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
            case 13:
                ((InterfaceC4084vh) obj).w0("1".equals(map.get("custom_close")));
                return;
            case 14:
                String valueOf = String.valueOf((String) map.get(com.anythink.expressad.foundation.h.k.f20423g));
                int i15 = w2.z.f41712b;
                x2.i.e("Received log message: ".concat(valueOf));
                return;
            case 15:
                InterfaceC3431jb b14 = ((InterfaceC4084vh) obj).b1();
                if (b14 != null) {
                    b14.mo0c();
                    return;
                }
                return;
            case 16:
                ((InterfaceC4084vh) obj).l1(!Boolean.parseBoolean((String) map.get("disabled")));
                return;
            case 17:
                InterfaceC4084vh interfaceC4084vh11 = (InterfaceC4084vh) obj;
                String str5 = (String) map.get(NativeAdvancedJsUtils.f18693p);
                if (com.anythink.expressad.foundation.d.d.co.equals(str5)) {
                    interfaceC4084vh11.z();
                    return;
                } else {
                    if (com.anythink.expressad.foundation.d.d.cp.equals(str5)) {
                        interfaceC4084vh11.v();
                        return;
                    }
                    return;
                }
            case 18:
                InterfaceC4084vh interfaceC4084vh12 = (InterfaceC4084vh) obj;
                if (map.containsKey(com.anythink.expressad.foundation.d.d.cg)) {
                    C2677Lh h02 = interfaceC4084vh12.h0();
                    synchronized (h02.f26953w) {
                    }
                    h02.f26946W++;
                    h02.B();
                    return;
                }
                if (map.containsKey("stop")) {
                    r0.f26946W--;
                    interfaceC4084vh12.h0().B();
                    return;
                }
                if (map.containsKey(com.anythink.expressad.f.a.b.dP)) {
                    C2677Lh h03 = interfaceC4084vh12.h0();
                    C3091d9 c3091d9 = h03.f26951u;
                    if (c3091d9 != null) {
                        c3091d9.b(10005);
                    }
                    h03.f26945V = true;
                    h03.f26931G = 10004;
                    h03.f26932H = "Page loaded delay cancel.";
                    h03.B();
                    h03.f26950n.destroy();
                    return;
                }
                return;
            case 19:
                InterfaceC4084vh interfaceC4084vh13 = (InterfaceC4084vh) obj;
                if (map.containsKey(com.anythink.expressad.foundation.d.d.cg)) {
                    interfaceC4084vh13.J0(true);
                }
                if (map.containsKey("stop")) {
                    interfaceC4084vh13.J0(false);
                    return;
                }
                return;
            case 20:
                InterfaceC4084vh interfaceC4084vh14 = (InterfaceC4084vh) obj;
                C2950ac c2950ac2 = AbstractC3218fc.f31040a;
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.t9)).booleanValue()) {
                    int i16 = w2.z.f41712b;
                    x2.i.f("canOpenAppGmsgHandler disabled.");
                    return;
                }
                String str6 = (String) map.get("package_name");
                if (TextUtils.isEmpty(str6)) {
                    int i17 = w2.z.f41712b;
                    x2.i.f("Package name missing in canOpenApp GMSG.");
                    return;
                }
                HashMap hashMap3 = new HashMap();
                Boolean valueOf2 = Boolean.valueOf(interfaceC4084vh14.getContext().getPackageManager().getLaunchIntentForPackage(str6) != null);
                hashMap3.put(str6, valueOf2);
                StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 13 + valueOf2.toString().length());
                sb.append("/canOpenApp;");
                sb.append(str6);
                sb.append(";");
                sb.append(valueOf2);
                w2.z.k(sb.toString());
                interfaceC4084vh14.d("openableApp", hashMap3);
                return;
            case 21:
                InterfaceC4084vh interfaceC4084vh15 = (InterfaceC4084vh) obj;
                C2950ac c2950ac3 = AbstractC3218fc.f31040a;
                PackageManager packageManager = interfaceC4084vh15.getContext().getPackageManager();
                try {
                    try {
                        JSONArray jSONArray2 = new JSONObject((String) map.get("data")).getJSONArray("intents");
                        JSONObject jSONObject2 = new JSONObject();
                        int i18 = 0;
                        while (i18 < jSONArray2.length()) {
                            try {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i18);
                                optString = jSONObject3.optString("id");
                                optString2 = jSONObject3.optString("u");
                                optString3 = jSONObject3.optString("i");
                                optString4 = jSONObject3.optString(com.anythink.expressad.f.a.b.dI);
                                optString5 = jSONObject3.optString("p");
                                optString6 = jSONObject3.optString("c");
                                optString7 = jSONObject3.optString("intent_url");
                            } catch (JSONException e14) {
                                c9 = c10;
                                i4 = i6;
                                int i19 = w2.z.f41712b;
                                x2.i.d("Error parsing the intent data.", e14);
                            }
                            if (TextUtils.isEmpty(optString7)) {
                                i4 = i6;
                            } else {
                                try {
                                    parseUri = Intent.parseUri(optString7, i6);
                                    i4 = i6;
                                } catch (URISyntaxException e15) {
                                    String valueOf3 = String.valueOf(optString7);
                                    int i20 = w2.z.f41712b;
                                    i4 = i6;
                                    x2.i.d("Error parsing the url: ".concat(valueOf3), e15);
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
                                            parseUri.setComponent(new ComponentName(split[i4], split[1]));
                                        }
                                    }
                                }
                                Intent intent = parseUri;
                                c9 = 0;
                                ResolveInfo resolveInfo = packageManager.resolveActivity(intent, com.anythink.basead.exoplayer.b.aX);
                                jSONObject2.put(optString, resolveInfo == null ? 1 : i4);
                                i18++;
                                c10 = c9;
                                i6 = i4;
                            }
                            parseUri = null;
                            if (parseUri == null) {
                            }
                            Intent intent2 = parseUri;
                            c9 = 0;
                            ResolveInfo resolveInfo2 = packageManager.resolveActivity(intent2, com.anythink.basead.exoplayer.b.aX);
                            jSONObject2.put(optString, resolveInfo2 == null ? 1 : i4);
                            i18++;
                            c10 = c9;
                            i6 = i4;
                        }
                        interfaceC4084vh15.e("openableIntents", jSONObject2);
                        return;
                    } catch (JSONException unused) {
                        interfaceC4084vh15.e("openableIntents", new JSONObject());
                        return;
                    }
                } catch (JSONException unused2) {
                    interfaceC4084vh15.e("openableIntents", new JSONObject());
                    return;
                }
            case 22:
                InterfaceC4084vh interfaceC4084vh16 = (InterfaceC4084vh) obj;
                C2950ac c2950ac4 = AbstractC3218fc.f31040a;
                String str7 = (String) map.get("u");
                if (str7 == null) {
                    int i21 = w2.z.f41712b;
                    x2.i.f("URL missing from httpTrack GMSG.");
                    return;
                } else if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33030g)).booleanValue() || !str7.isEmpty()) {
                    new w2.u(interfaceC4084vh16.getContext(), interfaceC4084vh16.C().f41845n, str7, interfaceC4084vh16.J() != null ? interfaceC4084vh16.J().f28434x0 : null).l();
                    return;
                } else {
                    int i22 = w2.z.f41712b;
                    x2.i.f("URL is empty from httpTrack GMSG.");
                    return;
                }
            case 23:
                InterfaceC4084vh interfaceC4084vh17 = (InterfaceC4084vh) obj;
                C2950ac c2950ac5 = AbstractC3218fc.f31040a;
                String str8 = (String) map.get("tx");
                String str9 = (String) map.get("ty");
                String str10 = (String) map.get("td");
                try {
                    int parseInt = Integer.parseInt(str8);
                    int parseInt2 = Integer.parseInt(str9);
                    int parseInt3 = Integer.parseInt(str10);
                    C3464k7 Q02 = interfaceC4084vh17.Q0();
                    if (Q02 != null) {
                        Q02.f32160b.a(parseInt, parseInt2, parseInt3);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused3) {
                    int i23 = w2.z.f41712b;
                    x2.i.f("Could not parse touch parameters from gmsg.");
                    return;
                }
            case 24:
                InterfaceC4084vh interfaceC4084vh18 = (InterfaceC4084vh) obj;
                C2950ac c2950ac6 = AbstractC3218fc.f31040a;
                String str11 = (String) map.get("urls");
                if (TextUtils.isEmpty(str11)) {
                    int i24 = w2.z.f41712b;
                    x2.i.f("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] split2 = str11.split(",");
                HashMap hashMap4 = new HashMap();
                PackageManager packageManager2 = interfaceC4084vh18.getContext().getPackageManager();
                int length = split2.length;
                int i25 = 0;
                while (i25 < length) {
                    String str12 = split2[i25];
                    String[] split3 = str12.split(";", 2);
                    Boolean valueOf4 = Boolean.valueOf(packageManager2.resolveActivity(new Intent(split3.length > i9 ? split3[i9].trim() : "android.intent.action.VIEW", Uri.parse(split3[0].trim())), com.anythink.basead.exoplayer.b.aX) != null ? i9 : 0);
                    hashMap4.put(str12, valueOf4);
                    int i26 = i9;
                    StringBuilder sb2 = new StringBuilder(str12.length() + 14 + valueOf4.toString().length());
                    sb2.append("/canOpenURLs;");
                    sb2.append(str12);
                    sb2.append(";");
                    sb2.append(valueOf4);
                    w2.z.k(sb2.toString());
                    i25++;
                    i9 = i26;
                }
                interfaceC4084vh18.d("openableURLs", hashMap4);
                return;
            case 25:
                InterfaceC4084vh interfaceC4084vh19 = (InterfaceC4084vh) obj;
                BinderC2626Ih g9 = interfaceC4084vh19.g();
                if (g9 == null) {
                    try {
                        BinderC2626Ih binderC2626Ih2 = new BinderC2626Ih(interfaceC4084vh19, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                        interfaceC4084vh19.R0(binderC2626Ih2);
                        binderC2626Ih = binderC2626Ih2;
                    } catch (NullPointerException e16) {
                        e = e16;
                        int i27 = w2.z.f41712b;
                        x2.i.d("Unable to parse videoMeta message.", e);
                        C4906k.f40186C.f40196h.d("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    } catch (NumberFormatException e17) {
                        e = e17;
                        int i272 = w2.z.f41712b;
                        x2.i.d("Unable to parse videoMeta message.", e);
                        C4906k.f40186C.f40196h.d("VideoMetaGmsgHandler.onGmsg", e);
                        return;
                    }
                } else {
                    binderC2626Ih = g9;
                }
                float parseFloat = Float.parseFloat((String) map.get("duration"));
                boolean equals = "1".equals(map.get("muted"));
                float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
                int parseInt4 = Integer.parseInt((String) map.get("playbackState"));
                if (parseInt4 >= 0 && parseInt4 <= 3) {
                    i6 = parseInt4;
                }
                String str13 = (String) map.get("aspectRatio");
                float parseFloat3 = TextUtils.isEmpty(str13) ? 0.0f : Float.parseFloat(str13);
                if (x2.i.j(3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(i6).length() + 17 + String.valueOf(str13).length());
                    sb3.append("Video Meta GMSG: currentTime : ");
                    sb3.append(parseFloat2);
                    sb3.append(" , duration : ");
                    sb3.append(parseFloat);
                    sb3.append(" , isMuted : ");
                    sb3.append(equals);
                    sb3.append(" , playbackState : ");
                    sb3.append(i6);
                    sb3.append(" , aspectRatio : ");
                    sb3.append(str13);
                    x2.i.a(sb3.toString());
                }
                binderC2626Ih.W3(parseFloat2, parseFloat, i6, equals, parseFloat3);
                return;
            case 26:
                a(obj, map);
                return;
            default:
                int i28 = w2.z.f41712b;
                x2.i.a("Show native ad policy validator overlay.");
                ((InterfaceC4084vh) obj).V().setVisibility(0);
                return;
        }
    }
}
