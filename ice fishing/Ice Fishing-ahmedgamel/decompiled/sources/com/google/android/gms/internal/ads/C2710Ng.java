package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4949p;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2710Ng implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public boolean f27291n;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                x2.d dVar = C4949p.f40498g.f40499a;
                i = x2.d.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i4 = w2.z.f41712b;
                x2.i.f(r9);
            }
        }
        if (w2.z.m()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            AbstractC5128c.h(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i);
            sb.append(com.anythink.core.common.d.j.f13164z);
            w2.z.k(sb.toString());
        }
        return i;
    }

    public static void b(C4137wg c4137wg, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        AbstractC3975tg abstractC3975tg = c4137wg.f35640z;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (abstractC3975tg != null) {
                    abstractC3975tg.B(parseInt);
                }
            } catch (NumberFormatException unused) {
                String m9 = D.x.m("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = w2.z.f41712b;
                x2.i.f(m9);
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (abstractC3975tg != null) {
                abstractC3975tg.C(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (abstractC3975tg != null) {
                abstractC3975tg.a(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (abstractC3975tg != null) {
                abstractC3975tg.b(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (abstractC3975tg == null) {
                return;
            }
            abstractC3975tg.c(parseInt5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        int min;
        int min2;
        int i;
        boolean z6;
        int i4;
        C4137wg c4137wg;
        AbstractC3975tg abstractC3975tg;
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
        String str = (String) map.get(NativeAdvancedJsUtils.f18693p);
        if (str == null) {
            int i6 = w2.z.f41712b;
            x2.i.f("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer z9 = (interfaceC4084vh.W0() == null || (c4137wg = (C4137wg) interfaceC4084vh.W0().f34558y) == null || (abstractC3975tg = c4137wg.f35640z) == null) ? null : abstractC3975tg.z();
        if (valueOf != null && z9 != null && !valueOf.equals(z9) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i9 = w2.z.f41712b;
            x2.i.e("Event intended for player " + valueOf + ", but sent to player " + z9 + " - event ignored");
            return;
        }
        if (x2.i.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            x2.i.a(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get(com.anythink.expressad.foundation.h.k.f20420d);
            if (TextUtils.isEmpty(str2)) {
                x2.i.f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC4084vh.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                x2.i.f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get(com.anythink.expressad.foundation.h.k.f20420d);
            if (TextUtils.isEmpty(str3)) {
                x2.i.f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC4084vh.Q(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                x2.i.f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                x2.i.f("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                interfaceC4084vh.d("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, w2.y.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            interfaceC4084vh.d("onVideoEvent", hashMap3);
            return;
        }
        C3887s W02 = interfaceC4084vh.W0();
        if (W02 == null) {
            x2.i.f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals(com.anythink.expressad.foundation.g.g.a.b.ab);
        if (equals || equals2) {
            Context context = interfaceC4084vh.getContext();
            int a9 = a(context, map, "x", 0);
            int a10 = a(context, map, "y", 0);
            int a11 = a(context, map, com.anythink.core.common.w.f17699a, -1);
            C3324ha c3324ha = AbstractC3592ma.f32839K4;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                min = a11 == -1 ? interfaceC4084vh.o0() : Math.min(a11, interfaceC4084vh.o0());
            } else {
                if (w2.z.m()) {
                    int o02 = interfaceC4084vh.o0();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a9).length() + AbstractC5128c.j(String.valueOf(a11).length() + 72, 4, String.valueOf(o02)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(a11);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(o02);
                    sb2.append(", x ");
                    sb2.append(a9);
                    sb2.append(com.anythink.core.common.d.j.f13164z);
                    w2.z.k(sb2.toString());
                }
                min = Math.min(a11, interfaceC4084vh.o0() - a9);
            }
            int a12 = a(context, map, "h", -1);
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                min2 = a12 == -1 ? interfaceC4084vh.H() : Math.min(a12, interfaceC4084vh.H());
            } else {
                if (w2.z.m()) {
                    int H8 = interfaceC4084vh.H();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a10).length() + AbstractC5128c.j(String.valueOf(a12).length() + 75, 4, String.valueOf(H8)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(a12);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(H8);
                    sb3.append(", y ");
                    sb3.append(a10);
                    sb3.append(com.anythink.core.common.d.j.f13164z);
                    w2.z.k(sb3.toString());
                }
                min2 = Math.min(a12, interfaceC4084vh.H() - a10);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || ((C4137wg) W02.f34558y) != null) {
                R2.w.d("The underlay may only be modified from the UI thread.");
                C4137wg c4137wg2 = (C4137wg) W02.f34558y;
                if (c4137wg2 != null) {
                    c4137wg2.l(a9, a10, min, min2);
                    return;
                }
                return;
            }
            C2506Bg c2506Bg = new C2506Bg((String) map.get("flags"));
            if (((C4137wg) W02.f34558y) == null) {
                C2575Fh c2575Fh = (C2575Fh) W02.f34555v;
                ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = c2575Fh.f25606n;
                AbstractC2991bG.j((C3808qa) viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25869p0.f2927v, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25867n0, "vpr2");
                C4137wg c4137wg3 = new C4137wg((Context) W02.f34554u, c2575Fh, i, parseBoolean, (C3808qa) c2575Fh.f25606n.f25869p0.f2927v, c2506Bg, (C3230fo) W02.f34557x);
                W02.f34558y = c4137wg3;
                ((C2575Fh) W02.f34556w).addView(c4137wg3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C4137wg) W02.f34558y).l(a9, a10, min, min2);
                c2575Fh.f25606n.f25846G.f26929E = false;
            }
            C4137wg c4137wg4 = (C4137wg) W02.f34558y;
            if (c4137wg4 != null) {
                b(c4137wg4, map);
                return;
            }
            return;
        }
        BinderC2626Ih g9 = interfaceC4084vh.g();
        if (g9 != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    x2.i.f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float parseFloat = Float.parseFloat(str6);
                    synchronized (g9.f26301u) {
                        g9.f26295C = parseFloat;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    x2.i.f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (g9.f26301u) {
                    z6 = g9.f26293A;
                    i4 = g9.f26304x;
                    g9.f26304x = 3;
                }
                AbstractC3436jg.f32060f.execute(new RunnableC2609Hh(g9, i4, 3, z6, z6));
                return;
            }
        }
        C4137wg c4137wg5 = (C4137wg) W02.f34558y;
        if (c4137wg5 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            interfaceC4084vh.d("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC4084vh.getContext();
            int a13 = a(context2, map, "x", 0);
            float a14 = a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a13, a14, 0);
            AbstractC3975tg abstractC3975tg2 = c4137wg5.f35640z;
            if (abstractC3975tg2 != null) {
                abstractC3975tg2.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                x2.i.f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC3975tg abstractC3975tg3 = c4137wg5.f35640z;
                if (abstractC3975tg3 == null) {
                    return;
                }
                abstractC3975tg3.l(parseFloat2);
                return;
            } catch (NumberFormatException unused5) {
                x2.i.f("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c4137wg5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c4137wg5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            AbstractC3975tg abstractC3975tg4 = c4137wg5.f35640z;
            if (abstractC3975tg4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c4137wg5.f35630G)) {
                c4137wg5.c("no_src", new String[0]);
                return;
            } else {
                abstractC3975tg4.A(c4137wg5.f35630G, c4137wg5.f35631H, valueOf);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(c4137wg5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC3975tg abstractC3975tg5 = c4137wg5.f35640z;
                if (abstractC3975tg5 == null) {
                    return;
                }
                C2557Eg c2557Eg = abstractC3975tg5.f35108u;
                c2557Eg.f25394e = true;
                c2557Eg.a();
                abstractC3975tg5.m();
                return;
            }
            AbstractC3975tg abstractC3975tg6 = c4137wg5.f35640z;
            if (abstractC3975tg6 == null) {
                return;
            }
            C2557Eg c2557Eg2 = abstractC3975tg6.f35108u;
            c2557Eg2.f25394e = false;
            c2557Eg2.a();
            abstractC3975tg6.m();
            return;
        }
        if (str.equals(com.anythink.expressad.foundation.d.d.co)) {
            AbstractC3975tg abstractC3975tg7 = c4137wg5.f35640z;
            if (abstractC3975tg7 == null) {
                return;
            }
            abstractC3975tg7.i();
            return;
        }
        if (str.equals("play")) {
            AbstractC3975tg abstractC3975tg8 = c4137wg5.f35640z;
            if (abstractC3975tg8 == null) {
                return;
            }
            abstractC3975tg8.h();
            return;
        }
        if (str.equals("show")) {
            c4137wg5.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = interfaceC4084vh.getContext();
                float a15 = a(context3, map, "dx", 0);
                float a16 = a(context3, map, "dy", 0);
                AbstractC3975tg abstractC3975tg9 = c4137wg5.f35640z;
                if (abstractC3975tg9 != null) {
                    abstractC3975tg9.n(a15, a16);
                }
                if (this.f27291n) {
                    return;
                }
                interfaceC4084vh.l();
                this.f27291n = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    c4137wg5.a();
                    return;
                } else {
                    x2.i.f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                x2.i.f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                float parseFloat3 = Float.parseFloat(str8);
                AbstractC3975tg abstractC3975tg10 = c4137wg5.f35640z;
                if (abstractC3975tg10 == null) {
                    return;
                }
                C2557Eg c2557Eg3 = abstractC3975tg10.f35108u;
                c2557Eg3.f25395f = parseFloat3;
                c2557Eg3.a();
                abstractC3975tg10.m();
                return;
            } catch (NumberFormatException unused6) {
                x2.i.f("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32821I2)).booleanValue() && TextUtils.isEmpty(str9)) {
            x2.i.f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                x2.i.f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        }
        String[] strArr = {str9};
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String string = jSONArray.getString(i10);
                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32821I2)).booleanValue() || !TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32821I2)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    x2.i.f(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                x2.i.f("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (num != null) {
            interfaceC4084vh.I0(num.intValue());
        }
        c4137wg5.f35630G = str9;
        c4137wg5.f35631H = strArr;
    }
}
