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
import n2.C4766a;
import n2.C4767b;
import n2.C4768c;
import o2.AbstractC4802b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import y2.AbstractC5205a;

/* renamed from: com.google.android.gms.internal.ads.Vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2841Vb implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29003n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29004u;

    public /* synthetic */ C2841Vb(int i, Object obj) {
        this.f29003n = i;
        this.f29004u = obj;
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
                C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e9);
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
            C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e9);
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, Map map) {
        m2.h hVar;
        C2.c cVar;
        m2.w wVar;
        boolean z6;
        m2.g gVar;
        m2.h hVar2;
        Bundle bundle = null;
        bundle = null;
        r2 = null;
        C3114df c3114df = null;
        r2 = null;
        Activity activity = null;
        switch (this.f29003n) {
            case 0:
                InterfaceC2857Wb interfaceC2857Wb = (InterfaceC2857Wb) this.f29004u;
                if (interfaceC2857Wb == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    int i = w2.z.f41712b;
                    x2.i.e("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                if (map.containsKey("info")) {
                    try {
                        bundle = d6.c.w(new JSONObject((String) map.get("info")));
                    } catch (JSONException e9) {
                        int i4 = w2.z.f41712b;
                        x2.i.d("Failed to convert ad metadata to JSON.", e9);
                    }
                }
                if (bundle != null) {
                    interfaceC2857Wb.o(str2, bundle);
                    return;
                } else {
                    int i6 = w2.z.f41712b;
                    x2.i.c("Failed to convert ad metadata to Bundle.");
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 != null) {
                    ((InterfaceC2873Xb) this.f29004u).N(str3, (String) map.get("info"));
                    return;
                } else {
                    int i9 = w2.z.f41712b;
                    x2.i.f("App event with no name parameter.");
                    return;
                }
            case 2:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                boolean equals = "1".equals(map.get("transparentBackground"));
                boolean equals2 = "1".equals(map.get("blur"));
                float f2 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f2 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e10) {
                    int i10 = w2.z.f41712b;
                    x2.i.d("Fail to parse float", e10);
                }
                C3380ic c3380ic = (C3380ic) this.f29004u;
                synchronized (c3380ic) {
                    c3380ic.f31824a = equals;
                    c3380ic.f31827d.set(true);
                }
                synchronized (c3380ic) {
                    c3380ic.f31825b = equals2;
                    c3380ic.f31826c = f2;
                }
                interfaceC4084vh.x0((int) f2, equals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(a.C0077a.f13690b) || TextUtils.isEmpty((CharSequence) map.get(a.C0077a.f13690b))) {
                    w2.z.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long parseLong = Long.parseLong((String) map.get("id"));
                    int parseInt = Integer.parseInt((String) map.get(a.C0077a.f13690b));
                    C4906k.f40186C.f40198k.getClass();
                    ((C3768po) this.f29004u).a(parseInt, parseLong, System.currentTimeMillis());
                    return;
                } catch (NumberFormatException e11) {
                    w2.z.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e11);
                    return;
                }
            case 4:
                C3324ha c3324ha = AbstractC3592ma.Ia;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    m2.h hVar3 = m2.h.i;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("request_origin", "inspector_ooct");
                    m2.g gVar2 = new m2.g((m2.f) new m2.f(3).e(bundle2));
                    String str4 = (String) map.get("adUnitId");
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    String str5 = (String) map.get("format");
                    String str6 = TextUtils.isEmpty(str5) ? "" : str5;
                    char c9 = 0;
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ka)).booleanValue()) {
                        boolean z9 = map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1");
                        if (z9) {
                            C4766a c4766a = new C4766a(3);
                            if (map.containsKey("keywords")) {
                                Iterator it = b((String) map.get("keywords"), "keywords").iterator();
                                while (it.hasNext()) {
                                    ((s2.E0) c4766a.f67u).f40310a.add((String) it.next());
                                }
                            }
                            c4766a.e(a(map));
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> keys = jSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        c4766a.d(next, jSONObject.getString(next));
                                    }
                                } catch (JSONException e12) {
                                    C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e12);
                                }
                            }
                            if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                                c4766a.h((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                c4766a.i(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((s2.E0) c4766a.f67u).f40318j = (String) map.get("requestAgent");
                            }
                            if (map.containsKey("publisherProvidedId")) {
                                ((s2.E0) c4766a.f67u).i = (String) map.get("publisherProvidedId");
                            }
                            if (map.containsKey("categoryExclusions")) {
                                Iterator it2 = b((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                                while (it2.hasNext()) {
                                    ((s2.E0) c4766a.f67u).f40315f.add((String) it2.next());
                                }
                            }
                            gVar = new C4767b(c4766a);
                        } else {
                            m2.f fVar = new m2.f(3);
                            if (map.containsKey("keywords")) {
                                Iterator it3 = b((String) map.get("keywords"), "keywords").iterator();
                                while (it3.hasNext()) {
                                    ((s2.E0) fVar.f67u).f40310a.add((String) it3.next());
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
                                    C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e13);
                                }
                            }
                            if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                                fVar.h((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                fVar.i(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((s2.E0) fVar.f67u).f40318j = (String) map.get("requestAgent");
                            }
                            gVar = new m2.g(fVar);
                        }
                        gVar2 = gVar;
                        String str7 = (String) map.get("width");
                        String str8 = (String) map.get("height");
                        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)) {
                            hVar2 = m2.h.i;
                        } else {
                            try {
                                hVar = new m2.h(Integer.parseInt(str7), Integer.parseInt(str8));
                            } catch (NumberFormatException e14) {
                                C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.generateAdSize", e14);
                                hVar2 = m2.h.i;
                            }
                            if (!map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                                I2 i22 = new I2();
                                if (map.containsKey("startMuted")) {
                                    i22.f26176a = ((String) map.get("startMuted")).equals("1");
                                }
                                if (map.containsKey("customControlsRequested")) {
                                    i22.f26177b = ((String) map.get("customControlsRequested")).equals("1");
                                }
                                if (map.containsKey("clickToExpandRequested")) {
                                    i22.f26178c = ((String) map.get("clickToExpandRequested")).equals("1");
                                }
                                wVar = new m2.w(i22);
                            } else {
                                wVar = null;
                            }
                            if (!map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (wVar != null && str6.equals("NATIVE"))) {
                                C2.c cVar2 = new C2.c();
                                if (map.containsKey("disableImageLoading")) {
                                    cVar2.f318a = ((String) map.get("disableImageLoading")).equals("1");
                                }
                                if (map.containsKey("mediaAspectRatio")) {
                                    String str9 = (String) map.get("mediaAspectRatio");
                                    if (!TextUtils.isEmpty(str9)) {
                                        try {
                                            cVar2.f319b = Integer.parseInt(str9);
                                        } catch (NumberFormatException e15) {
                                            C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e15);
                                        }
                                    }
                                }
                                if (map.containsKey("shouldRequestMultipleImages")) {
                                    cVar2.f320c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                                }
                                if (map.containsKey("preferredAdChoicesPosition")) {
                                    String str10 = (String) map.get("preferredAdChoicesPosition");
                                    if (!TextUtils.isEmpty(str10)) {
                                        try {
                                            cVar2.f321d = Integer.parseInt(str10);
                                        } catch (NumberFormatException e16) {
                                            C4906k.f40186C.f40196h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e16);
                                        }
                                    }
                                }
                                if (map.containsKey("customMuteThisAdRequested")) {
                                    cVar2.f323f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                                }
                                if (wVar != null) {
                                    cVar2.f322e = wVar;
                                }
                                cVar = new C2.c(cVar2);
                                z6 = z9;
                            } else {
                                cVar = null;
                                z6 = z9;
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
                        wVar = new m2.w(i222);
                        if (map.containsKey("customMuteThisAdRequested")) {
                        }
                        C2.c cVar22 = new C2.c();
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
                        cVar = new C2.c(cVar22);
                        z6 = z9;
                    } else {
                        hVar = hVar3;
                        cVar = null;
                        wVar = null;
                        z6 = false;
                    }
                    String str11 = (String) map.get(NativeAdvancedJsUtils.f18693p);
                    if (TextUtils.isEmpty(str11) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    if (!str11.equals("load") || TextUtils.isEmpty(str6)) {
                        if (str11.equals("show")) {
                            BinderC2918Zo binderC2918Zo = (BinderC2918Zo) this.f29004u;
                            synchronized (binderC2918Zo) {
                                try {
                                    C2820To c2820To = binderC2918Zo.f29736w;
                                    InterfaceC4084vh interfaceC4084vh2 = c2820To.f28589w;
                                    if (interfaceC4084vh2 != null && !interfaceC4084vh2.n0()) {
                                        activity = c2820To.f28589w.j();
                                        break;
                                    }
                                    HashMap hashMap = binderC2918Zo.f29733n;
                                    Object obj2 = hashMap.get(str4);
                                    if (obj2 != null) {
                                        C3324ha c3324ha2 = AbstractC3592ma.Ja;
                                        s2.r rVar2 = s2.r.f40506e;
                                        if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                                            if (!(obj2 instanceof AbstractC4802b)) {
                                                if (!(obj2 instanceof AbstractC5205a)) {
                                                    if (!(obj2 instanceof I2.c)) {
                                                        if (obj2 instanceof J2.a) {
                                                        }
                                                        binderC2918Zo.W3(BinderC2918Zo.Y3(obj2));
                                                        if (!(obj2 instanceof AbstractC4802b)) {
                                                            ((AbstractC4802b) obj2).c(activity);
                                                            return;
                                                        }
                                                        if (obj2 instanceof AbstractC5205a) {
                                                            ((AbstractC5205a) obj2).d(activity);
                                                            return;
                                                        }
                                                        if (obj2 instanceof I2.c) {
                                                            ((I2.c) obj2).d(activity, C3495kl.f32392O);
                                                            return;
                                                        }
                                                        if (obj2 instanceof J2.a) {
                                                            ((J2.a) obj2).b(activity, C3495kl.f32391N);
                                                            return;
                                                        }
                                                        if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue() && ((obj2 instanceof m2.j) || (obj2 instanceof NativeAd))) {
                                                            Intent intent = new Intent();
                                                            Context X32 = binderC2918Zo.X3();
                                                            intent.setClassName(X32, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                                            intent.putExtra("adUnit", str4);
                                                            w2.D d9 = C4906k.f40186C.f40191c;
                                                            w2.D.s(X32, intent);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        hashMap.remove(str4);
                                        binderC2918Zo.W3(BinderC2918Zo.Y3(obj2));
                                        if (!(obj2 instanceof AbstractC4802b)) {
                                        }
                                    }
                                    return;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    BinderC2918Zo binderC2918Zo2 = (BinderC2918Zo) this.f29004u;
                    synchronized (binderC2918Zo2) {
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
                                AbstractC4802b.b(binderC2918Zo2.X3(), str4, gVar2, new C2837Uo(binderC2918Zo2, str4));
                                return;
                            }
                            if (c9 == 1) {
                                C3324ha c3324ha3 = AbstractC3592ma.Ka;
                                s2.r rVar3 = s2.r.f40506e;
                                m2.l c4768c = (((Boolean) rVar3.f40509c.a(c3324ha3)).booleanValue() && z6) ? new C4768c(binderC2918Zo2.X3()) : new m2.j(binderC2918Zo2.X3());
                                c4768c.setAdSize(hVar);
                                c4768c.setAdUnitId(str4);
                                c4768c.setAdListener(new Y0.m(binderC2918Zo2, str4, c4768c));
                                if (((Boolean) rVar3.f40509c.a(c3324ha3)).booleanValue() && z6 && wVar != null) {
                                    ((C4768c) c4768c).setVideoOptions(wVar);
                                }
                                c4768c.b(gVar2);
                                return;
                            }
                            if (c9 == 2) {
                                AbstractC5205a.b(binderC2918Zo2.X3(), str4, gVar2, new C2854Vo(binderC2918Zo2, str4));
                            } else {
                                if (c9 == 3) {
                                    m2.d dVar = new m2.d(binderC2918Zo2.X3(), str4);
                                    dVar.b(new S0.l(16, binderC2918Zo2, str4));
                                    dVar.c(new C2902Yo(binderC2918Zo2));
                                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ka)).booleanValue() && cVar != null) {
                                        dVar.d(cVar);
                                    }
                                    dVar.a().a(gVar2.f39373a);
                                    return;
                                }
                                if (c9 == 4) {
                                    I2.c.b(binderC2918Zo2.X3(), str4, gVar2, new C2870Wo(binderC2918Zo2, str4));
                                    return;
                                } else if (c9 == 5) {
                                    J2.a.a(binderC2918Zo2.X3(), str4, gVar2, new C2886Xo(binderC2918Zo2, str4));
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
                String str12 = (String) map.get(NativeAdvancedJsUtils.f18693p);
                boolean equals3 = "grant".equals(str12);
                C2647Jl c2647Jl = (C2647Jl) this.f29004u;
                if (!equals3) {
                    if ("video_start".equals(str12)) {
                        c2647Jl.t();
                        return;
                    } else {
                        if ("video_complete".equals(str12)) {
                            c2647Jl.F();
                            return;
                        }
                        return;
                    }
                }
                try {
                    int parseInt2 = Integer.parseInt((String) map.get("amount"));
                    String str13 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str13)) {
                        c3114df = new C3114df(str13, parseInt2);
                    }
                } catch (NumberFormatException e17) {
                    int i11 = w2.z.f41712b;
                    x2.i.g("Unable to parse reward amount.", e17);
                }
                c2647Jl.B(c3114df);
                return;
            case 6:
                if (!map.containsKey(com.anythink.basead.exoplayer.k.o.f9232c) || TextUtils.isEmpty((CharSequence) map.get(com.anythink.basead.exoplayer.k.o.f9232c))) {
                    return;
                }
                w2.z.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get(com.anythink.basead.exoplayer.k.o.f9232c))));
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) map.get(com.anythink.basead.exoplayer.k.o.f9232c));
                if (map.containsKey("title")) {
                    intent2.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    w2.D d10 = C4906k.f40186C.f40191c;
                    w2.D.s((Context) this.f29004u, intent2);
                    return;
                } catch (RuntimeException e18) {
                    x2.i.g("Failed to open Share Sheet", e18);
                    C4906k.f40186C.f40196h.d("ShareSheetGmsgHandler.onGmsg", e18);
                    return;
                }
            case 7:
                String str14 = (String) map.get(NativeAdvancedJsUtils.f18693p);
                if (str14 == null) {
                    int i12 = w2.z.f41712b;
                    x2.i.f("Action missing from video GMSG.");
                    return;
                }
                if (str14.equals("src")) {
                    String str15 = (String) map.get("src");
                    if (str15 == null) {
                        int i13 = w2.z.f41712b;
                        x2.i.f("src missing from video GMSG.");
                        return;
                    }
                    Qx qx = (Qx) this.f29004u;
                    qx.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("mediaUrl", str15);
                    ((C3490kg) qx.f27895u).b(bundle3);
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
                        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = (ViewTreeObserverOnGlobalLayoutListenerC2592Gh) this.f29004u;
                        synchronized (viewTreeObserverOnGlobalLayoutListenerC2592Gh) {
                            try {
                                if (viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25865l0 != parseInt3) {
                                    viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25865l0 = parseInt3;
                                    viewTreeObserverOnGlobalLayoutListenerC2592Gh.requestLayout();
                                }
                            } finally {
                            }
                        }
                        return;
                    } catch (Exception e19) {
                        int i14 = w2.z.f41712b;
                        x2.i.g("Exception occurred while getting webview content height", e19);
                        return;
                    }
                }
                return;
            default:
                ((C2733Om) this.f29004u).f27437b.d(map);
                return;
        }
    }
}
