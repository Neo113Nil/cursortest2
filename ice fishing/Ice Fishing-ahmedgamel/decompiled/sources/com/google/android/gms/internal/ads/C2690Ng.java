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
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2690Ng implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public boolean f26508n;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                v2.d dVar = C4900p.f40199g.f40200a;
                i = v2.d.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String o6 = com.anythink.basead.exoplayer.f.f.o(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i6 = u2.z.f41322b;
                v2.i.f(o6);
            }
        }
        if (u2.z.m()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            u1.h.i(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i);
            sb.append(com.anythink.core.common.d.j.f12378z);
            u2.z.k(sb.toString());
        }
        return i;
    }

    public static void b(C4114wg c4114wg, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        AbstractC3952tg abstractC3952tg = c4114wg.f34863z;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (abstractC3952tg != null) {
                    abstractC3952tg.B(parseInt);
                }
            } catch (NumberFormatException unused) {
                String p9 = D.y.p("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = u2.z.f41322b;
                v2.i.f(p9);
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (abstractC3952tg != null) {
                abstractC3952tg.C(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (abstractC3952tg != null) {
                abstractC3952tg.a(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (abstractC3952tg != null) {
                abstractC3952tg.b(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (abstractC3952tg == null) {
                return;
            }
            abstractC3952tg.c(parseInt5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        int min;
        int min2;
        int i;
        boolean z3;
        int i6;
        C4114wg c4114wg;
        AbstractC3952tg abstractC3952tg;
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
        String str = (String) map.get(NativeAdvancedJsUtils.f17906p);
        if (str == null) {
            int i9 = u2.z.f41322b;
            v2.i.f("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer z6 = (interfaceC4061vh.X0() == null || (c4114wg = (C4114wg) interfaceC4061vh.X0().f33790y) == null || (abstractC3952tg = c4114wg.f34863z) == null) ? null : abstractC3952tg.z();
        if (valueOf != null && z6 != null && !valueOf.equals(z6) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i10 = u2.z.f41322b;
            v2.i.e("Event intended for player " + valueOf + ", but sent to player " + z6 + " - event ignored");
            return;
        }
        if (v2.i.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            v2.i.a(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get(com.anythink.expressad.foundation.h.k.f19633d);
            if (TextUtils.isEmpty(str2)) {
                v2.i.f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC4061vh.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                v2.i.f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get(com.anythink.expressad.foundation.h.k.f19633d);
            if (TextUtils.isEmpty(str3)) {
                v2.i.f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC4061vh.Q(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                v2.i.f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                v2.i.f("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                interfaceC4061vh.d("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, u2.y.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            interfaceC4061vh.d("onVideoEvent", hashMap3);
            return;
        }
        C3864s X02 = interfaceC4061vh.X0();
        if (X02 == null) {
            v2.i.f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals(com.anythink.expressad.foundation.g.g.a.b.ab);
        if (equals || equals2) {
            Context context = interfaceC4061vh.getContext();
            int a9 = a(context, map, "x", 0);
            int a10 = a(context, map, "y", 0);
            int a11 = a(context, map, com.anythink.core.common.w.f16912a, -1);
            C3301ha c3301ha = AbstractC3569ma.f32059K4;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                min = a11 == -1 ? interfaceC4061vh.p0() : Math.min(a11, interfaceC4061vh.p0());
            } else {
                if (u2.z.m()) {
                    int p02 = interfaceC4061vh.p0();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a9).length() + u1.h.a(String.valueOf(a11).length() + 72, 4, String.valueOf(p02)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(a11);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(p02);
                    sb2.append(", x ");
                    sb2.append(a9);
                    sb2.append(com.anythink.core.common.d.j.f12378z);
                    u2.z.k(sb2.toString());
                }
                min = Math.min(a11, interfaceC4061vh.p0() - a9);
            }
            int a12 = a(context, map, "h", -1);
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                min2 = a12 == -1 ? interfaceC4061vh.I() : Math.min(a12, interfaceC4061vh.I());
            } else {
                if (u2.z.m()) {
                    int I8 = interfaceC4061vh.I();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a10).length() + u1.h.a(String.valueOf(a12).length() + 75, 4, String.valueOf(I8)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(a12);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(I8);
                    sb3.append(", y ");
                    sb3.append(a10);
                    sb3.append(com.anythink.core.common.d.j.f12378z);
                    u2.z.k(sb3.toString());
                }
                min2 = Math.min(a12, interfaceC4061vh.I() - a10);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || ((C4114wg) X02.f33790y) != null) {
                P2.w.d("The underlay may only be modified from the UI thread.");
                C4114wg c4114wg2 = (C4114wg) X02.f33790y;
                if (c4114wg2 != null) {
                    c4114wg2.l(a9, a10, min, min2);
                    return;
                }
                return;
            }
            C2486Bg c2486Bg = new C2486Bg((String) map.get("flags"));
            if (((C4114wg) X02.f33790y) == null) {
                C2555Fh c2555Fh = (C2555Fh) X02.f33787v;
                ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = c2555Fh.f24817n;
                AbstractC2968bG.j((C3785qa) viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25088u0.f2798v, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25085s0, "vpr2");
                C4114wg c4114wg3 = new C4114wg((Context) X02.f33786u, c2555Fh, i, parseBoolean, (C3785qa) c2555Fh.f24817n.f25088u0.f2798v, c2486Bg, (C3153eo) X02.f33789x);
                X02.f33790y = c4114wg3;
                ((C2555Fh) X02.f33788w).addView(c4114wg3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C4114wg) X02.f33790y).l(a9, a10, min, min2);
                c2555Fh.f24817n.f25061G.f26132E = false;
            }
            C4114wg c4114wg4 = (C4114wg) X02.f33790y;
            if (c4114wg4 != null) {
                b(c4114wg4, map);
                return;
            }
            return;
        }
        BinderC2606Ih g4 = interfaceC4061vh.g();
        if (g4 != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    v2.i.f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float parseFloat = Float.parseFloat(str6);
                    synchronized (g4.f25552u) {
                        g4.f25546C = parseFloat;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    v2.i.f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (g4.f25552u) {
                    z3 = g4.f25544A;
                    i6 = g4.f25555x;
                    g4.f25555x = 3;
                }
                AbstractC3413jg.f31273f.execute(new RunnableC2589Hh(g4, i6, 3, z3, z3));
                return;
            }
        }
        C4114wg c4114wg5 = (C4114wg) X02.f33790y;
        if (c4114wg5 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            interfaceC4061vh.d("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC4061vh.getContext();
            int a13 = a(context2, map, "x", 0);
            float a14 = a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a13, a14, 0);
            AbstractC3952tg abstractC3952tg2 = c4114wg5.f34863z;
            if (abstractC3952tg2 != null) {
                abstractC3952tg2.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                v2.i.f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC3952tg abstractC3952tg3 = c4114wg5.f34863z;
                if (abstractC3952tg3 == null) {
                    return;
                }
                abstractC3952tg3.l(parseFloat2);
                return;
            } catch (NumberFormatException unused5) {
                v2.i.f("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c4114wg5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c4114wg5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            AbstractC3952tg abstractC3952tg4 = c4114wg5.f34863z;
            if (abstractC3952tg4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c4114wg5.f34853G)) {
                c4114wg5.c("no_src", new String[0]);
                return;
            } else {
                abstractC3952tg4.A(c4114wg5.f34853G, c4114wg5.f34854H, valueOf);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(c4114wg5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC3952tg abstractC3952tg5 = c4114wg5.f34863z;
                if (abstractC3952tg5 == null) {
                    return;
                }
                C2537Eg c2537Eg = abstractC3952tg5.f34329u;
                c2537Eg.f24641e = true;
                c2537Eg.a();
                abstractC3952tg5.m();
                return;
            }
            AbstractC3952tg abstractC3952tg6 = c4114wg5.f34863z;
            if (abstractC3952tg6 == null) {
                return;
            }
            C2537Eg c2537Eg2 = abstractC3952tg6.f34329u;
            c2537Eg2.f24641e = false;
            c2537Eg2.a();
            abstractC3952tg6.m();
            return;
        }
        if (str.equals(com.anythink.expressad.foundation.d.d.co)) {
            AbstractC3952tg abstractC3952tg7 = c4114wg5.f34863z;
            if (abstractC3952tg7 == null) {
                return;
            }
            abstractC3952tg7.i();
            return;
        }
        if (str.equals("play")) {
            AbstractC3952tg abstractC3952tg8 = c4114wg5.f34863z;
            if (abstractC3952tg8 == null) {
                return;
            }
            abstractC3952tg8.h();
            return;
        }
        if (str.equals("show")) {
            c4114wg5.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = interfaceC4061vh.getContext();
                float a15 = a(context3, map, "dx", 0);
                float a16 = a(context3, map, "dy", 0);
                AbstractC3952tg abstractC3952tg9 = c4114wg5.f34863z;
                if (abstractC3952tg9 != null) {
                    abstractC3952tg9.n(a15, a16);
                }
                if (this.f26508n) {
                    return;
                }
                interfaceC4061vh.l();
                this.f26508n = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    c4114wg5.a();
                    return;
                } else {
                    v2.i.f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                v2.i.f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                float parseFloat3 = Float.parseFloat(str8);
                AbstractC3952tg abstractC3952tg10 = c4114wg5.f34863z;
                if (abstractC3952tg10 == null) {
                    return;
                }
                C2537Eg c2537Eg3 = abstractC3952tg10.f34329u;
                c2537Eg3.f24642f = parseFloat3;
                c2537Eg3.a();
                abstractC3952tg10.m();
                return;
            } catch (NumberFormatException unused6) {
                v2.i.f("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32041I2)).booleanValue() && TextUtils.isEmpty(str9)) {
            v2.i.f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                v2.i.f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        }
        String[] strArr = {str9};
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32041I2)).booleanValue() || !TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32041I2)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    v2.i.f(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                v2.i.f("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (num != null) {
            interfaceC4061vh.J0(num.intValue());
        }
        c4114wg5.f34853G = str9;
        c4114wg5.f34854H = strArr;
    }
}
