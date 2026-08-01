package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.common.e.a;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l2.C4657a;
import l2.C4658b;
import l2.C4659c;
import m2.AbstractC4731b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import w2.AbstractC5148a;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2818Vb implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28206n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28207u;

    public /* synthetic */ C2818Vb(int i, Object obj) {
        this.f28206n = i;
        this.f28207u = obj;
    }

    public static final Bundle a(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e9) {
                C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e9);
            }
        }
        return bundle;
    }

    public static final ArrayList b(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e9) {
            C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e9);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06ef A[Catch: all -> 0x06dd, TRY_LEAVE, TryCatch #15 {all -> 0x06dd, blocks: (B:245:0x069b, B:247:0x06a1, B:250:0x06a8, B:255:0x06b2, B:257:0x06ba, B:259:0x06cc, B:261:0x06d0, B:263:0x06d4, B:265:0x06d8, B:268:0x06e4, B:270:0x06ef, B:273:0x06f6, B:275:0x06fa, B:278:0x0701, B:280:0x0705, B:283:0x070e, B:285:0x0712, B:288:0x071b, B:290:0x0729, B:292:0x072d, B:294:0x0731, B:297:0x06e1), top: B:244:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06f6 A[Catch: all -> 0x06dd, TRY_ENTER, TryCatch #15 {all -> 0x06dd, blocks: (B:245:0x069b, B:247:0x06a1, B:250:0x06a8, B:255:0x06b2, B:257:0x06ba, B:259:0x06cc, B:261:0x06d0, B:263:0x06d4, B:265:0x06d8, B:268:0x06e4, B:270:0x06ef, B:273:0x06f6, B:275:0x06fa, B:278:0x0701, B:280:0x0705, B:283:0x070e, B:285:0x0712, B:288:0x071b, B:290:0x0729, B:292:0x072d, B:294:0x0731, B:297:0x06e1), top: B:244:0x069b }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x044b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        k2.h hVar;
        A2.c cVar;
        k2.w wVar;
        boolean z3;
        k2.g gVar;
        k2.h hVar2;
        Bundle bundle = null;
        bundle = null;
        r2 = null;
        C3091df c3091df = null;
        r2 = null;
        Activity activity = null;
        switch (this.f28206n) {
            case 0:
                InterfaceC2834Wb interfaceC2834Wb = (InterfaceC2834Wb) this.f28207u;
                if (interfaceC2834Wb == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    int i = u2.z.f41322b;
                    v2.i.e("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                if (map.containsKey("info")) {
                    try {
                        bundle = A8.b.O(new JSONObject((String) map.get("info")));
                    } catch (JSONException e9) {
                        int i6 = u2.z.f41322b;
                        v2.i.d("Failed to convert ad metadata to JSON.", e9);
                    }
                }
                if (bundle != null) {
                    interfaceC2834Wb.o(str2, bundle);
                    return;
                } else {
                    int i9 = u2.z.f41322b;
                    v2.i.c("Failed to convert ad metadata to Bundle.");
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 != null) {
                    ((InterfaceC2850Xb) this.f28207u).N(str3, (String) map.get("info"));
                    return;
                } else {
                    int i10 = u2.z.f41322b;
                    v2.i.f("App event with no name parameter.");
                    return;
                }
            case 2:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                boolean equals = "1".equals(map.get("transparentBackground"));
                boolean equals2 = "1".equals(map.get("blur"));
                float f3 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f3 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e10) {
                    int i11 = u2.z.f41322b;
                    v2.i.d("Fail to parse float", e10);
                }
                C3357ic c3357ic = (C3357ic) this.f28207u;
                synchronized (c3357ic) {
                    c3357ic.f31053a = equals;
                    c3357ic.f31056d.set(true);
                }
                synchronized (c3357ic) {
                    c3357ic.f31054b = equals2;
                    c3357ic.f31055c = f3;
                }
                interfaceC4061vh.y0((int) f3, equals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(a.C0077a.f12904b) || TextUtils.isEmpty((CharSequence) map.get(a.C0077a.f12904b))) {
                    u2.z.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long parseLong = Long.parseLong((String) map.get("id"));
                    int parseInt = Integer.parseInt((String) map.get(a.C0077a.f12904b));
                    C4835j.f39733C.f39745k.getClass();
                    ((C3691oo) this.f28207u).a(parseInt, parseLong, System.currentTimeMillis());
                    return;
                } catch (NumberFormatException e11) {
                    u2.z.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e11);
                    return;
                }
            case 4:
                C3301ha c3301ha = AbstractC3569ma.Ia;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    k2.h hVar3 = k2.h.i;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("request_origin", "inspector_ooct");
                    k2.g gVar2 = new k2.g((k2.f) new k2.f(2).e(bundle2));
                    String str4 = (String) map.get("adUnitId");
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    String str5 = (String) map.get("format");
                    String str6 = TextUtils.isEmpty(str5) ? "" : str5;
                    char c9 = 0;
                    if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Ka)).booleanValue()) {
                        boolean z6 = map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1");
                        if (z6) {
                            C4657a c4657a = new C4657a(2);
                            if (map.containsKey("keywords")) {
                                Iterator it = b((String) map.get("keywords"), "keywords").iterator();
                                while (it.hasNext()) {
                                    ((q2.E0) c4657a.f1720u).f40011a.add((String) it.next());
                                }
                            }
                            c4657a.e(a(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> keys = jSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        c4657a.d(next, jSONObject.getString(next));
                                    }
                                } catch (JSONException e12) {
                                    C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e12);
                                }
                            }
                            if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                                c4657a.h((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                c4657a.j(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((q2.E0) c4657a.f1720u).f40019j = (String) map.get("requestAgent");
                            }
                            if (map.containsKey("publisherProvidedId")) {
                                ((q2.E0) c4657a.f1720u).i = (String) map.get("publisherProvidedId");
                            }
                            if (map.containsKey("categoryExclusions")) {
                                Iterator it2 = b((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                                while (it2.hasNext()) {
                                    ((q2.E0) c4657a.f1720u).f40016f.add((String) it2.next());
                                }
                            }
                            gVar = new C4658b(c4657a);
                        } else {
                            k2.f fVar = new k2.f(2);
                            if (map.containsKey("keywords")) {
                                Iterator it3 = b((String) map.get("keywords"), "keywords").iterator();
                                while (it3.hasNext()) {
                                    ((q2.E0) fVar.f1720u).f40011a.add((String) it3.next());
                                }
                            }
                            fVar.e(a(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> keys2 = jSONObject2.keys();
                                    while (keys2.hasNext()) {
                                        String next2 = keys2.next();
                                        fVar.d(next2, jSONObject2.getString(next2));
                                    }
                                } catch (JSONException e13) {
                                    C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e13);
                                }
                            }
                            if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                                fVar.h((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                fVar.j(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((q2.E0) fVar.f1720u).f40019j = (String) map.get("requestAgent");
                            }
                            gVar = new k2.g(fVar);
                        }
                        gVar2 = gVar;
                        String str7 = (String) map.get("width");
                        String str8 = (String) map.get("height");
                        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)) {
                            hVar2 = k2.h.i;
                        } else {
                            try {
                                hVar = new k2.h(Integer.parseInt(str7), Integer.parseInt(str8));
                            } catch (NumberFormatException e14) {
                                C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.generateAdSize", e14);
                                hVar2 = k2.h.i;
                            }
                            if (!map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                                I2 i22 = new I2();
                                if (map.containsKey("startMuted")) {
                                    i22.f25433a = ((String) map.get("startMuted")).equals("1");
                                }
                                if (map.containsKey("customControlsRequested")) {
                                    i22.f25434b = ((String) map.get("customControlsRequested")).equals("1");
                                }
                                if (map.containsKey("clickToExpandRequested")) {
                                    i22.f25435c = ((String) map.get("clickToExpandRequested")).equals("1");
                                }
                                wVar = new k2.w(i22);
                            } else {
                                wVar = null;
                            }
                            if (!map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (wVar != null && str6.equals("NATIVE"))) {
                                A2.c cVar2 = new A2.c();
                                if (map.containsKey("disableImageLoading")) {
                                    cVar2.f19a = ((String) map.get("disableImageLoading")).equals("1");
                                }
                                if (map.containsKey("mediaAspectRatio")) {
                                    String str9 = (String) map.get("mediaAspectRatio");
                                    if (!TextUtils.isEmpty(str9)) {
                                        try {
                                            cVar2.f20b = Integer.parseInt(str9);
                                        } catch (NumberFormatException e15) {
                                            C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e15);
                                        }
                                    }
                                }
                                if (map.containsKey("shouldRequestMultipleImages")) {
                                    cVar2.f21c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                                }
                                if (map.containsKey("preferredAdChoicesPosition")) {
                                    String str10 = (String) map.get("preferredAdChoicesPosition");
                                    if (!TextUtils.isEmpty(str10)) {
                                        try {
                                            cVar2.f22d = Integer.parseInt(str10);
                                        } catch (NumberFormatException e16) {
                                            C4835j.f39733C.f39743h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e16);
                                        }
                                    }
                                }
                                if (map.containsKey("customMuteThisAdRequested")) {
                                    cVar2.f24f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                                }
                                if (wVar != null) {
                                    cVar2.f23e = wVar;
                                }
                                cVar = new A2.c(cVar2);
                                z3 = z6;
                            } else {
                                cVar = null;
                                z3 = z6;
                            }
                        }
                        hVar = hVar2;
                        if (map.containsKey("clickToExpandRequested")) {
                        }
                        I2 i222 = new I2();
                        if (map.containsKey("startMuted")) {
                        }
                        if (map.containsKey("customControlsRequested")) {
                        }
                        if (map.containsKey("clickToExpandRequested")) {
                        }
                        wVar = new k2.w(i222);
                        if (map.containsKey("customMuteThisAdRequested")) {
                        }
                        A2.c cVar22 = new A2.c();
                        if (map.containsKey("disableImageLoading")) {
                        }
                        if (map.containsKey("mediaAspectRatio")) {
                        }
                        if (map.containsKey("shouldRequestMultipleImages")) {
                        }
                        if (map.containsKey("preferredAdChoicesPosition")) {
                        }
                        if (map.containsKey("customMuteThisAdRequested")) {
                        }
                        if (wVar != null) {
                        }
                        cVar = new A2.c(cVar22);
                        z3 = z6;
                    } else {
                        hVar = hVar3;
                        cVar = null;
                        wVar = null;
                        z3 = false;
                    }
                    String str11 = (String) map.get(NativeAdvancedJsUtils.f17906p);
                    if (TextUtils.isEmpty(str11) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    if (!str11.equals("load") || TextUtils.isEmpty(str6)) {
                        if (str11.equals("show")) {
                            BinderC2895Zo binderC2895Zo = (BinderC2895Zo) this.f28207u;
                            synchronized (binderC2895Zo) {
                                try {
                                    C2783So c2783So = binderC2895Zo.f28966w;
                                    InterfaceC4061vh interfaceC4061vh2 = c2783So.f27560w;
                                    if (interfaceC4061vh2 != null && !interfaceC4061vh2.n0()) {
                                        activity = c2783So.f27560w.j();
                                        break;
                                    }
                                    HashMap hashMap = binderC2895Zo.f28963n;
                                    Object obj2 = hashMap.get(str4);
                                    if (obj2 != null) {
                                        C3301ha c3301ha2 = AbstractC3569ma.Ja;
                                        q2.r rVar2 = q2.r.f40207e;
                                        if (((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue()) {
                                            if (!(obj2 instanceof AbstractC4731b)) {
                                                if (!(obj2 instanceof AbstractC5148a)) {
                                                    if (!(obj2 instanceof G2.c)) {
                                                        if (obj2 instanceof H2.a) {
                                                        }
                                                        binderC2895Zo.W3(BinderC2895Zo.Y3(obj2));
                                                        if (!(obj2 instanceof AbstractC4731b)) {
                                                            ((AbstractC4731b) obj2).c(activity);
                                                            return;
                                                        }
                                                        if (obj2 instanceof AbstractC5148a) {
                                                            ((AbstractC5148a) obj2).d(activity);
                                                            return;
                                                        }
                                                        if (obj2 instanceof G2.c) {
                                                            ((G2.c) obj2).d(activity, C3472kl.f31615O);
                                                            return;
                                                        }
                                                        if (obj2 instanceof H2.a) {
                                                            ((H2.a) obj2).b(activity, C3472kl.f31614N);
                                                            return;
                                                        }
                                                        if (((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue() && ((obj2 instanceof k2.j) || (obj2 instanceof NativeAd))) {
                                                            Intent intent = new Intent();
                                                            Context X32 = binderC2895Zo.X3();
                                                            intent.setClassName(X32, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                                            intent.putExtra("adUnit", str4);
                                                            u2.D d2 = C4835j.f39733C.f39738c;
                                                            u2.D.s(X32, intent);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.remove(str4);
                                        binderC2895Zo.W3(BinderC2895Zo.Y3(obj2));
                                        if (!(obj2 instanceof AbstractC4731b)) {
                                        }
                                    }
                                    return;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    BinderC2895Zo binderC2895Zo2 = (BinderC2895Zo) this.f28207u;
                    synchronized (binderC2895Zo2) {
                        try {
                            switch (str6.hashCode()) {
                                case -1999289321:
                                    if (str6.equals("NATIVE")) {
                                        c9 = 3;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1372958932:
                                    if (str6.equals("INTERSTITIAL")) {
                                        c9 = 2;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -428325382:
                                    if (str6.equals("APP_OPEN_AD")) {
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 543046670:
                                    if (str6.equals("REWARDED")) {
                                        c9 = 4;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 1854800829:
                                    if (str6.equals("REWARDED_INTERSTITIAL")) {
                                        c9 = 5;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case 1951953708:
                                    if (str6.equals("BANNER")) {
                                        c9 = 1;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                default:
                                    c9 = 65535;
                                    break;
                            }
                            if (c9 == 0) {
                                AbstractC4731b.b(binderC2895Zo2.X3(), str4, gVar2, new C2799To(binderC2895Zo2, str4));
                                return;
                            }
                            if (c9 == 1) {
                                C3301ha c3301ha3 = AbstractC3569ma.Ka;
                                q2.r rVar3 = q2.r.f40207e;
                                k2.l c4659c = (((Boolean) rVar3.f40210c.a(c3301ha3)).booleanValue() && z3) ? new C4659c(binderC2895Zo2.X3()) : new k2.j(binderC2895Zo2.X3());
                                c4659c.setAdSize(hVar);
                                c4659c.setAdUnitId(str4);
                                c4659c.setAdListener(new C2815Uo(binderC2895Zo2, str4, c4659c));
                                if (((Boolean) rVar3.f40210c.a(c3301ha3)).booleanValue() && z3 && wVar != null) {
                                    ((C4659c) c4659c).setVideoOptions(wVar);
                                }
                                c4659c.b(gVar2);
                                return;
                            }
                            if (c9 == 2) {
                                AbstractC5148a.b(binderC2895Zo2.X3(), str4, gVar2, new C2831Vo(binderC2895Zo2, str4));
                            } else {
                                if (c9 == 3) {
                                    k2.d dVar = new k2.d(binderC2895Zo2.X3(), str4);
                                    dVar.b(new S0.l(13, binderC2895Zo2, str4));
                                    dVar.c(new C2879Yo(binderC2895Zo2));
                                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ka)).booleanValue() && cVar != null) {
                                        dVar.d(cVar);
                                    }
                                    dVar.a().a(gVar2.f38584a);
                                    return;
                                }
                                if (c9 == 4) {
                                    G2.c.b(binderC2895Zo2.X3(), str4, gVar2, new C2847Wo(binderC2895Zo2, str4));
                                    return;
                                } else if (c9 == 5) {
                                    H2.a.a(binderC2895Zo2.X3(), str4, gVar2, new C2863Xo(binderC2895Zo2, str4));
                                    return;
                                }
                            }
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 5:
                String str12 = (String) map.get(NativeAdvancedJsUtils.f17906p);
                boolean equals3 = "grant".equals(str12);
                C2610Il c2610Il = (C2610Il) this.f28207u;
                if (!equals3) {
                    if ("video_start".equals(str12)) {
                        c2610Il.t();
                        return;
                    } else {
                        if ("video_complete".equals(str12)) {
                            c2610Il.F();
                            return;
                        }
                        return;
                    }
                }
                try {
                    int parseInt2 = Integer.parseInt((String) map.get("amount"));
                    String str13 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str13)) {
                        c3091df = new C3091df(str13, parseInt2);
                    }
                } catch (NumberFormatException e17) {
                    int i12 = u2.z.f41322b;
                    v2.i.g("Unable to parse reward amount.", e17);
                }
                c2610Il.D(c3091df);
                return;
            case 6:
                if (!map.containsKey(com.anythink.basead.exoplayer.k.o.f8446c) || TextUtils.isEmpty((CharSequence) map.get(com.anythink.basead.exoplayer.k.o.f8446c))) {
                    return;
                }
                u2.z.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(com.anythink.basead.exoplayer.k.o.f8446c))));
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) map.get(com.anythink.basead.exoplayer.k.o.f8446c));
                if (map.containsKey("title")) {
                    intent2.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    u2.D d9 = C4835j.f39733C.f39738c;
                    u2.D.s((Context) this.f28207u, intent2);
                    return;
                } catch (RuntimeException e18) {
                    v2.i.g("Failed to open Share Sheet", e18);
                    C4835j.f39733C.f39743h.d("ShareSheetGmsgHandler.onGmsg", e18);
                    return;
                }
            case 7:
                String str14 = (String) map.get(NativeAdvancedJsUtils.f17906p);
                if (str14 == null) {
                    int i13 = u2.z.f41322b;
                    v2.i.f("Action missing from video GMSG.");
                    return;
                }
                if (str14.equals("src")) {
                    String str15 = (String) map.get("src");
                    if (str15 == null) {
                        int i14 = u2.z.f41322b;
                        v2.i.f("src missing from video GMSG.");
                        return;
                    }
                    Qx qx = (Qx) this.f28207u;
                    qx.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("mediaUrl", str15);
                    ((C3467kg) qx.f27139u).b(bundle3);
                    return;
                }
                return;
            case 8:
                if (map != null) {
                    String str16 = (String) map.get("height");
                    if (TextUtils.isEmpty(str16)) {
                        return;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(str16);
                        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = (ViewTreeObserverOnGlobalLayoutListenerC2572Gh) this.f28207u;
                        synchronized (viewTreeObserverOnGlobalLayoutListenerC2572Gh) {
                            try {
                                if (viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25083q0 != parseInt3) {
                                    viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25083q0 = parseInt3;
                                    viewTreeObserverOnGlobalLayoutListenerC2572Gh.requestLayout();
                                }
                            } finally {
                            }
                        }
                        return;
                    } catch (Exception e19) {
                        int i15 = u2.z.f41322b;
                        v2.i.g("Exception occurred while getting webview content height", e19);
                        return;
                    }
                }
                return;
            default:
                ((C2696Nm) this.f28207u).f26533b.d(map);
                return;
        }
    }
}
