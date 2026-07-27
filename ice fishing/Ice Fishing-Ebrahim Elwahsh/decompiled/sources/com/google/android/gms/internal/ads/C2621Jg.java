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
import q2.C4907p;
import t0.AbstractC5051n;
import t2.AbstractC5066B;

/* renamed from: com.google.android.gms.internal.ads.Jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2621Jg implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public boolean f25785n;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                u2.d dVar = C4907p.f40108g.f40109a;
                i = u2.d.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i4 = t2.C.f40822b;
                u2.i.f(q6);
            }
        }
        if (t2.C.m()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            AbstractC5051n.j(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i);
            sb.append(com.anythink.core.common.d.j.f12535z);
            t2.C.k(sb.toString());
        }
        return i;
    }

    public static void b(C3965tg c3965tg, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        AbstractC3804qg abstractC3804qg = c3965tg.f34442z;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (abstractC3804qg != null) {
                    abstractC3804qg.B(parseInt);
                }
            } catch (NumberFormatException unused) {
                String l9 = D.y.l("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = t2.C.f40822b;
                u2.i.f(l9);
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (abstractC3804qg != null) {
                abstractC3804qg.C(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (abstractC3804qg != null) {
                abstractC3804qg.a(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (abstractC3804qg != null) {
                abstractC3804qg.b(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (abstractC3804qg == null) {
                return;
            }
            abstractC3804qg.c(parseInt5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        int min;
        int min2;
        int i;
        boolean z8;
        int i4;
        C3965tg c3965tg;
        AbstractC3804qg abstractC3804qg;
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
        String str = (String) map.get(NativeAdvancedJsUtils.f18064p);
        if (str == null) {
            int i9 = t2.C.f40822b;
            u2.i.f("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer z9 = (interfaceC3858rh.X0() == null || (c3965tg = (C3965tg) interfaceC3858rh.X0().f33923y) == null || (abstractC3804qg = c3965tg.f34442z) == null) ? null : abstractC3804qg.z();
        if (valueOf != null && z9 != null && !valueOf.equals(z9) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i10 = t2.C.f40822b;
            u2.i.e("Event intended for player " + valueOf + ", but sent to player " + z9 + " - event ignored");
            return;
        }
        if (u2.i.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            u2.i.a(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get(com.anythink.expressad.foundation.h.k.f19791d);
            if (TextUtils.isEmpty(str2)) {
                u2.i.f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC3858rh.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                u2.i.f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get(com.anythink.expressad.foundation.h.k.f19791d);
            if (TextUtils.isEmpty(str3)) {
                u2.i.f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC3858rh.O(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                u2.i.f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                u2.i.f("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                interfaceC3858rh.a("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, AbstractC5066B.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            interfaceC3858rh.a("onVideoEvent", hashMap3);
            return;
        }
        r X02 = interfaceC3858rh.X0();
        if (X02 == null) {
            u2.i.f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals(com.anythink.expressad.foundation.g.g.a.b.ab);
        if (equals || equals2) {
            Context context = interfaceC3858rh.getContext();
            int a9 = a(context, map, "x", 0);
            int a10 = a(context, map, "y", 0);
            int a11 = a(context, map, com.anythink.core.common.w.f17070a, -1);
            C3151ea c3151ea = AbstractC3368ia.f31478K4;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                min = a11 == -1 ? interfaceC3858rh.m() : Math.min(a11, interfaceC3858rh.m());
            } else {
                if (t2.C.m()) {
                    int m8 = interfaceC3858rh.m();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a9).length() + AbstractC5051n.a(String.valueOf(a11).length() + 72, 4, String.valueOf(m8)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(a11);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(m8);
                    sb2.append(", x ");
                    sb2.append(a9);
                    sb2.append(com.anythink.core.common.d.j.f12535z);
                    t2.C.k(sb2.toString());
                }
                min = Math.min(a11, interfaceC3858rh.m() - a9);
            }
            int a12 = a(context, map, "h", -1);
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                min2 = a12 == -1 ? interfaceC3858rh.G() : Math.min(a12, interfaceC3858rh.G());
            } else {
                if (t2.C.m()) {
                    int G7 = interfaceC3858rh.G();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a10).length() + AbstractC5051n.a(String.valueOf(a12).length() + 75, 4, String.valueOf(G7)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(a12);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(G7);
                    sb3.append(", y ");
                    sb3.append(a10);
                    sb3.append(com.anythink.core.common.d.j.f12535z);
                    t2.C.k(sb3.toString());
                }
                min2 = Math.min(a12, interfaceC3858rh.G() - a10);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || ((C3965tg) X02.f33923y) != null) {
                O2.w.d("The underlay may only be modified from the UI thread.");
                C3965tg c3965tg2 = (C3965tg) X02.f33923y;
                if (c3965tg2 != null) {
                    c3965tg2.l(a9, a10, min, min2);
                    return;
                }
                return;
            }
            C4235yg c4235yg = new C4235yg((String) map.get("flags"));
            if (((C3965tg) X02.f33923y) == null) {
                C2486Bh c2486Bh = (C2486Bh) X02.f33920v;
                ViewTreeObserverOnGlobalLayoutListenerC2520Dh viewTreeObserverOnGlobalLayoutListenerC2520Dh = c2486Bh.f24059n;
                AbstractC2655Lg.j((C3636na) viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24499u0.f28863v, viewTreeObserverOnGlobalLayoutListenerC2520Dh.f24496s0, "vpr2");
                C3965tg c3965tg3 = new C3965tg((Context) X02.f33919u, c2486Bh, i, parseBoolean, (C3636na) c2486Bh.f24059n.f24499u0.f28863v, c4235yg, (C3165eo) X02.f33922x);
                X02.f33923y = c3965tg3;
                ((C2486Bh) X02.f33921w).addView(c3965tg3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C3965tg) X02.f33923y).l(a9, a10, min, min2);
                c2486Bh.f24059n.f24472G.f25385E = false;
            }
            C3965tg c3965tg4 = (C3965tg) X02.f33923y;
            if (c3965tg4 != null) {
                b(c3965tg4, map);
                return;
            }
            return;
        }
        BinderC2554Fh g9 = interfaceC3858rh.g();
        if (g9 != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    u2.i.f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float parseFloat = Float.parseFloat(str6);
                    synchronized (g9.f25000u) {
                        g9.f24994C = parseFloat;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    u2.i.f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (g9.f25000u) {
                    z8 = g9.f24992A;
                    i4 = g9.f25003x;
                    g9.f25003x = 3;
                }
                AbstractC3212fg.f30743f.execute(new RunnableC2537Eh(g9, i4, 3, z8, z8));
                return;
            }
        }
        C3965tg c3965tg5 = (C3965tg) X02.f33923y;
        if (c3965tg5 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            interfaceC3858rh.a("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC3858rh.getContext();
            int a13 = a(context2, map, "x", 0);
            float a14 = a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a13, a14, 0);
            AbstractC3804qg abstractC3804qg2 = c3965tg5.f34442z;
            if (abstractC3804qg2 != null) {
                abstractC3804qg2.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                u2.i.f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC3804qg abstractC3804qg3 = c3965tg5.f34442z;
                if (abstractC3804qg3 == null) {
                    return;
                }
                abstractC3804qg3.l(parseFloat2);
                return;
            } catch (NumberFormatException unused5) {
                u2.i.f("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c3965tg5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c3965tg5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            AbstractC3804qg abstractC3804qg4 = c3965tg5.f34442z;
            if (abstractC3804qg4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c3965tg5.f34432G)) {
                c3965tg5.c("no_src", new String[0]);
                return;
            } else {
                abstractC3804qg4.A(c3965tg5.f34432G, c3965tg5.f34433H, valueOf);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(c3965tg5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC3804qg abstractC3804qg5 = c3965tg5.f34442z;
                if (abstractC3804qg5 == null) {
                    return;
                }
                C2485Bg c2485Bg = abstractC3804qg5.f33738u;
                c2485Bg.f24057e = true;
                c2485Bg.a();
                abstractC3804qg5.n();
                return;
            }
            AbstractC3804qg abstractC3804qg6 = c3965tg5.f34442z;
            if (abstractC3804qg6 == null) {
                return;
            }
            C2485Bg c2485Bg2 = abstractC3804qg6.f33738u;
            c2485Bg2.f24057e = false;
            c2485Bg2.a();
            abstractC3804qg6.n();
            return;
        }
        if (str.equals(com.anythink.expressad.foundation.d.d.co)) {
            AbstractC3804qg abstractC3804qg7 = c3965tg5.f34442z;
            if (abstractC3804qg7 == null) {
                return;
            }
            abstractC3804qg7.i();
            return;
        }
        if (str.equals("play")) {
            AbstractC3804qg abstractC3804qg8 = c3965tg5.f34442z;
            if (abstractC3804qg8 == null) {
                return;
            }
            abstractC3804qg8.h();
            return;
        }
        if (str.equals("show")) {
            c3965tg5.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = interfaceC3858rh.getContext();
                float a15 = a(context3, map, "dx", 0);
                float a16 = a(context3, map, "dy", 0);
                AbstractC3804qg abstractC3804qg9 = c3965tg5.f34442z;
                if (abstractC3804qg9 != null) {
                    abstractC3804qg9.m(a15, a16);
                }
                if (this.f25785n) {
                    return;
                }
                interfaceC3858rh.k();
                this.f25785n = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    c3965tg5.a();
                    return;
                } else {
                    u2.i.f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                u2.i.f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                float parseFloat3 = Float.parseFloat(str8);
                AbstractC3804qg abstractC3804qg10 = c3965tg5.f34442z;
                if (abstractC3804qg10 == null) {
                    return;
                }
                C2485Bg c2485Bg3 = abstractC3804qg10.f33738u;
                c2485Bg3.f24058f = parseFloat3;
                c2485Bg3.a();
                abstractC3804qg10.n();
                return;
            } catch (NumberFormatException unused6) {
                u2.i.f("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.I2)).booleanValue() && TextUtils.isEmpty(str9)) {
            u2.i.f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                u2.i.f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
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
                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.I2)).booleanValue() || !TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.I2)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    u2.i.f(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                u2.i.f("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (num != null) {
            interfaceC3858rh.I0(num.intValue());
        }
        c3965tg5.f34432G = str9;
        c3965tg5.f34433H = strArr;
    }
}
