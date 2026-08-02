package com.google.android.gms.internal.ads;

import E2.C0310g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.C4896a;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Nq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2720Nq implements InterfaceC3340hq {

    /* renamed from: a, reason: collision with root package name */
    public final C3224fi f27331a;

    /* renamed from: b, reason: collision with root package name */
    public final C3383ig f27332b;

    /* renamed from: c, reason: collision with root package name */
    public final C2590Gf f27333c;

    /* renamed from: d, reason: collision with root package name */
    public final C3612mu f27334d;

    /* renamed from: e, reason: collision with root package name */
    public final C4252yn f27335e;

    /* renamed from: f, reason: collision with root package name */
    public final C3069co f27336f;

    /* renamed from: g, reason: collision with root package name */
    public final C5189a f27337g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f27338h;

    public C2720Nq(C3224fi c3224fi, C3383ig c3383ig, C2590Gf c2590Gf, C3612mu c3612mu, C4252yn c4252yn, C3069co c3069co, C5189a c5189a, Context context, C2889Yb c2889Yb) {
        this.f27337g = c5189a;
        this.f27338h = context;
        this.f27331a = c3224fi;
        this.f27332b = c3383ig;
        this.f27333c = c2590Gf;
        this.f27334d = c3612mu;
        this.f27335e = c4252yn;
        this.f27336f = c3069co;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
            C4906k.f40186C.f40198k.getClass();
            this.f27336f.c("rendering-native-ads-native-js-webview-start", System.currentTimeMillis());
        }
        P3.a b9 = this.f27334d.b();
        E2.r rVar = new E2.r(12, this, st);
        C3383ig c3383ig = this.f27332b;
        return QC.t(QC.t(b9, rVar, c3383ig), new C2645Jj(8, this, yt, st), c3383ig);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        Wt wt = st.f28423s;
        return (wt == null || wt.f29210c == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ae A[EDGE_INSN: B:118:0x03ae->B:119:0x03ae BREAK  A[LOOP:0: B:43:0x03b3->B:116:0x0415], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0440  */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.gms.internal.ads.ND] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.ND] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.ND] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.android.gms.internal.ads.Gf] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.google.android.gms.internal.ads.ND] */
    /* JADX WARN: Type inference failed for: r5v48, types: [P3.a, com.google.android.gms.internal.ads.kg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FD c(final Yt yt, final St st, final JSONObject jSONObject) {
        C4896a c4896a;
        C4244yf c4244yf;
        JSONObject jSONObject2;
        ?? r12;
        C3383ig c3383ig;
        C3122dn c3122dn;
        String str;
        C4896a c4896a2;
        C4244yf c4244yf2;
        Ut ut;
        C3069co c3069co;
        String str2;
        C3485kb c3485kb;
        P3.a aVar;
        RD rd;
        P3.a aVar2;
        P3.a aVar3;
        int i;
        C2590Gf c2590Gf;
        s2.f1 f1Var;
        JSONObject optJSONObject;
        Ut ut2;
        P3.a e9;
        JSONObject optJSONObject2;
        P3.a aVar4;
        P3.a aVar5;
        P3.a aVar6;
        P3.a aVar7;
        P3.a d9;
        C3122dn c3122dn2;
        C4896a c4896a3;
        C4244yf c4244yf3;
        C3069co c3069co2;
        ND nd;
        JSONArray optJSONArray;
        RD rd2;
        ND nd2;
        final C3955tD u6;
        JSONArray jSONArray;
        int i4;
        ND nd3;
        C3504ku c3504ku;
        Future future;
        final C3901sD c3901sD;
        C3901sD c3901sD2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray2;
        int i6;
        boolean z6;
        C3901sD t6;
        C4244yf c4244yf4;
        C3324ha c3324ha = AbstractC3592ma.f32852M2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C4906k.f40186C.f40198k.getClass();
            this.f27336f.c("rendering-webview-creation-start", System.currentTimeMillis());
        }
        final P3.a b9 = this.f27334d.b();
        C3324ha c3324ha2 = AbstractC3592ma.lf;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
        Context context = this.f27338h;
        if (booleanValue) {
            C5189a c5189a = this.f27337g;
            C4298zf c4298zf = st.f28357A;
            if (c4298zf != null) {
                Wt wt = st.f28423s;
                c4244yf4 = new C4244yf(context, c5189a, c4298zf, wt == null ? null : wt.f29209b);
            } else {
                c4244yf4 = null;
            }
            c4896a = new C4896a(context, c4244yf4);
            c4244yf = c4244yf4;
        } else {
            c4896a = new C4896a(context, null);
            c4244yf = null;
        }
        C4896a c4896a4 = c4896a;
        C2590Gf c2590Gf2 = this.f27333c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.L2)).booleanValue()) {
            C4906k.f40186C.f40198k.getClass();
            ((C3069co) c2590Gf2.f25833x).c("rendering-native-assets-loading-start", System.currentTimeMillis());
        }
        CallableC2900Ym callableC2900Ym = new CallableC2900Ym(c2590Gf2, yt, st, jSONObject, 0);
        C3383ig c3383ig2 = (C3383ig) c2590Gf2.f25830u;
        P3.a b10 = c3383ig2.b(callableC2900Ym);
        c2590Gf2.B(46, b10);
        C3122dn c3122dn3 = (C3122dn) c2590Gf2.f25831v;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
        C3485kb c3485kb2 = c3122dn3.f30625h;
        P3.a a9 = c3122dn3.a(optJSONArray3, c3485kb2.f32249u, c3485kb2.f32251w, 47);
        c2590Gf2.B(48, a9);
        C2590Gf c2590Gf3 = yt.f29533b;
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.ub)).booleanValue();
        Ut ut3 = (Ut) c2590Gf3.f25831v;
        RD rd3 = c3122dn3.f30624g;
        C3069co c3069co3 = c3122dn3.f30634r;
        if (booleanValue2) {
            JSONArray optJSONArray4 = jSONObject.optJSONArray("images");
            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                jSONObject2 = jSONObject;
                r12 = c2590Gf2;
                c3383ig = c3383ig2;
                c3122dn = c3122dn3;
                str = "images";
                c4896a2 = c4896a4;
                c4244yf2 = c4244yf;
                ut = ut3;
                c3069co = c3069co3;
                str2 = com.onesignal.inAppMessages.internal.d.HTML;
                c3485kb = c3485kb2;
                aVar = a9;
                rd = rd3;
                aVar2 = b10;
                aVar3 = ND.f27257u;
            } else {
                JSONObject optJSONObject4 = optJSONArray4.optJSONObject(0);
                if (optJSONObject4 == null) {
                    aVar3 = ND.f27257u;
                } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32872O4)).booleanValue() && optJSONObject4.has((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32881P4))) {
                    aVar3 = ND.f27257u;
                } else {
                    String optString = optJSONObject4.optString("base_url");
                    String optString2 = optJSONObject4.optString(com.onesignal.inAppMessages.internal.d.HTML);
                    int optInt = optJSONObject4.optInt("width", 0);
                    int optInt2 = optJSONObject4.optInt("height", 0);
                    if (optInt != 0) {
                        i = optInt;
                    } else if (optInt2 != 0) {
                        i = 0;
                    } else {
                        f1Var = s2.f1.a();
                        c2590Gf = c2590Gf2;
                        if (TextUtils.isEmpty(optString2)) {
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
                                com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3069co3, "native-assets-loading-image-composition-start");
                            }
                            ND nd4 = ND.f27257u;
                            str = "images";
                            C4244yf c4244yf5 = c4244yf;
                            c3069co = c3069co3;
                            c3383ig = c3383ig2;
                            C2590Gf c2590Gf4 = c2590Gf;
                            str2 = com.onesignal.inAppMessages.internal.d.HTML;
                            c3485kb = c3485kb2;
                            aVar = a9;
                            rd = rd3;
                            aVar2 = b10;
                            s2.f1 f1Var2 = f1Var;
                            jSONObject2 = jSONObject;
                            C2961an c2961an = new C2961an(c3122dn3, f1Var2, st, ut3, c4896a4, c4244yf5, optString, optString2, 0);
                            c3122dn = c3122dn3;
                            ut = ut3;
                            c4896a2 = c4896a4;
                            c4244yf2 = c4244yf5;
                            C3901sD t9 = QC.t(nd4, c2961an, AbstractC3436jg.f32060f);
                            aVar3 = QC.t(t9, new C3015bn(t9, 0), AbstractC3436jg.f32062h);
                            r12 = c2590Gf4;
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32896R2)).booleanValue()) {
                                MA.f(aVar3, "NativeAssetsLoader.loadImageHtml", rd);
                                r12 = c2590Gf4;
                            }
                        } else {
                            jSONObject2 = jSONObject;
                            c3383ig = c3383ig2;
                            c3122dn = c3122dn3;
                            str = "images";
                            c4896a2 = c4896a4;
                            c4244yf2 = c4244yf;
                            c3069co = c3069co3;
                            ut = ut3;
                            r12 = c2590Gf;
                            str2 = com.onesignal.inAppMessages.internal.d.HTML;
                            c3485kb = c3485kb2;
                            aVar = a9;
                            rd = rd3;
                            aVar2 = b10;
                            aVar3 = ND.f27257u;
                        }
                    }
                    c2590Gf = c2590Gf2;
                    f1Var = new s2.f1(c3122dn3.f30618a, new m2.h(i, optInt2));
                    if (TextUtils.isEmpty(optString2)) {
                    }
                }
            }
            r12.B(50, aVar3);
            P3.a b11 = c3122dn.b(jSONObject2.optJSONObject("secondary_image"), c3485kb.f32249u, 51);
            r12.B(52, b11);
            P3.a b12 = c3122dn.b(jSONObject2.optJSONObject("app_icon"), c3485kb.f32249u, 53);
            r12.B(54, b12);
            optJSONObject = jSONObject2.optJSONObject("attribution");
            if (optJSONObject != null) {
                e9 = ND.f27257u;
                ut2 = ut;
            } else {
                JSONArray optJSONArray5 = optJSONObject.optJSONArray(str);
                JSONObject optJSONObject5 = optJSONObject.optJSONObject(d.c.f19422e);
                if (optJSONArray5 == null && optJSONObject5 != null) {
                    optJSONArray5 = new JSONArray();
                    optJSONArray5.put(optJSONObject5);
                }
                ut2 = ut;
                e9 = c3122dn.e("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), QC.u(c3122dn.a(optJSONArray5, false, true, 55), new C0310g(2, c3122dn, optJSONObject), rd));
            }
            P3.a aVar8 = e9;
            r12.B(56, aVar8);
            String[] strArr = {"html_containers", "instream"};
            JSONObject z9 = d6.c.z(jSONObject2, strArr);
            optJSONObject2 = z9 != null ? null : z9.optJSONObject(strArr[1]);
            if (optJSONObject2 != null) {
                JSONObject optJSONObject6 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f9230a);
                if (optJSONObject6 == null) {
                    d9 = ND.f27257u;
                } else {
                    String optString3 = optJSONObject6.optString("vast_xml");
                    boolean z10 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.tb)).booleanValue() && optJSONObject6.has(str2);
                    if (!TextUtils.isEmpty(optString3) || z10) {
                        if (z10) {
                            aVar5 = aVar8;
                            z6 = z10;
                            t6 = c3122dn.d(optJSONObject6, st, ut2, c4896a2, c4244yf2);
                            aVar4 = b11;
                            aVar7 = b12;
                            aVar6 = aVar3;
                        } else {
                            aVar5 = aVar8;
                            z6 = z10;
                            C3390in c3390in = c3122dn.i;
                            c3390in.getClass();
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
                                C4906k.f40186C.f40198k.getClass();
                                aVar4 = b11;
                                aVar7 = b12;
                                aVar6 = aVar3;
                                c3390in.f31895j.c("native-assets-loading-video-start", System.currentTimeMillis());
                            } else {
                                aVar4 = b11;
                                aVar7 = b12;
                                aVar6 = aVar3;
                            }
                            ND nd5 = ND.f27257u;
                            C2645Jj c2645Jj = new C2645Jj(1, c3390in, c4896a2, c4244yf2);
                            Executor executor = c3390in.f31888b;
                            t6 = QC.t(QC.t(nd5, c2645Jj, executor), new E2.r(5, c3390in, optJSONObject6), executor);
                        }
                        d9 = c3122dn.e(true != z6 ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, QC.s(t6, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32806G4)).intValue(), TimeUnit.SECONDS, c3122dn.f30627k));
                    } else {
                        int i9 = w2.z.f41712b;
                        x2.i.f("Required field 'vast_xml' or 'html' is missing");
                        d9 = ND.f27257u;
                    }
                }
                C4896a c4896a5 = c4896a2;
                c3122dn2 = c3122dn;
                c4896a3 = c4896a5;
                c4244yf3 = c4244yf2;
                aVar4 = b11;
                aVar7 = b12;
                aVar5 = aVar8;
                aVar6 = aVar3;
                r12.B(58, d9);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Ce)).booleanValue() && jSONObject2.has(com.anythink.basead.exoplayer.k.o.f9230a)) {
                    optJSONObject3 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f9230a);
                    if (optJSONObject3.has("flags") && (optJSONArray2 = optJSONObject3.optJSONArray("flags")) != null) {
                        i6 = 0;
                        while (true) {
                            if (i6 >= optJSONArray2.length()) {
                                break;
                            }
                            JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i6);
                            if (optJSONObject7 == null || !optJSONObject7.optString("key").equals("afma_video_player_type")) {
                                i6++;
                                c3069co = c3069co;
                            } else {
                                try {
                                    if (Integer.parseInt(optJSONObject7.optString("value")) == 3) {
                                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
                                            c3069co2 = c3069co;
                                            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3069co2, "native-assets-loading-media-start");
                                        } else {
                                            c3069co2 = c3069co;
                                        }
                                        ?? c3490kg = new C3490kg();
                                        d9.a(new LD(0, d9, new Ux(c3122dn2, (C3490kg) c3490kg)), AbstractC3436jg.f32060f);
                                        r12.B(61, c3490kg);
                                        nd = c3490kg;
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
                c3069co2 = c3069co;
                nd = QC.c(new Bundle());
                ND nd6 = nd;
                C3504ku c3504ku2 = (C3504ku) r12.f25832w;
                optJSONArray = jSONObject2.optJSONArray("custom_assets");
                if (optJSONArray == null) {
                    u6 = QC.c(Collections.EMPTY_LIST);
                    nd2 = nd6;
                } else {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32888Q2)).booleanValue()) {
                        C4906k.f40186C.f40198k.getClass();
                        ((C3069co) c3504ku2.f32447w).c("native-assets-loading-custom-start", System.currentTimeMillis());
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    int i10 = 0;
                    while (true) {
                        rd2 = (RD) c3504ku2.f32445u;
                        if (i10 >= length) {
                            break;
                        }
                        int i11 = length;
                        JSONObject optJSONObject8 = optJSONArray.optJSONObject(i10);
                        if (optJSONObject8 == null) {
                            future = ND.f27257u;
                            c3504ku = c3504ku2;
                            jSONArray = optJSONArray;
                        } else {
                            jSONArray = optJSONArray;
                            String optString4 = optJSONObject8.optString("name");
                            if (optString4 == null) {
                                future = ND.f27257u;
                                c3504ku = c3504ku2;
                            } else {
                                i4 = i10;
                                String optString5 = optJSONObject8.optString("type");
                                nd3 = nd6;
                                if (com.anythink.expressad.foundation.h.k.f20423g.equals(optString5)) {
                                    future = QC.c(new C3175en(optString4, optJSONObject8.optString("string_value")));
                                    c3504ku = c3504ku2;
                                } else if (d.c.f19422e.equals(optString5)) {
                                    C3122dn c3122dn4 = (C3122dn) c3504ku2.f32446v;
                                    c3504ku = c3504ku2;
                                    future = QC.u(c3122dn4.b(optJSONObject8.optJSONObject("image_value"), c3122dn4.f30625h.f32249u, 0), new C3004bc(optString4, 2), rd2);
                                } else {
                                    c3504ku = c3504ku2;
                                    future = ND.f27257u;
                                }
                                arrayList.add(future);
                                i10 = i4 + 1;
                                length = i11;
                                optJSONArray = jSONArray;
                                nd6 = nd3;
                                c3504ku2 = c3504ku;
                            }
                        }
                        nd3 = nd6;
                        i4 = i10;
                        arrayList.add(future);
                        i10 = i4 + 1;
                        length = i11;
                        optJSONArray = jSONArray;
                        nd6 = nd3;
                        c3504ku2 = c3504ku;
                    }
                    nd2 = nd6;
                    u6 = QC.u(new CD(RB.n(arrayList), true), L2.f26828j, rd2);
                }
                r12.B(63, u6);
                if (jSONObject2.optBoolean("enable_omid")) {
                    JSONObject optJSONObject9 = jSONObject2.optJSONObject("omid_settings");
                    if (optJSONObject9 == null) {
                        c3901sD2 = ND.f27257u;
                    } else {
                        String optString6 = optJSONObject9.optString("omid_html");
                        if (!TextUtils.isEmpty(optString6)) {
                            C3324ha c3324ha3 = AbstractC3592ma.f32888Q2;
                            s2.r rVar2 = s2.r.f40506e;
                            if (((Boolean) rVar2.f40509c.a(c3324ha3)).booleanValue()) {
                                com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3069co2, "native-assets-loading-omid-start");
                            }
                            C3901sD t10 = QC.t(ND.f27257u, new C3219fd(c3122dn2, optString6, c4244yf3, c4896a3), AbstractC3436jg.f32060f);
                            if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.f32896R2)).booleanValue()) {
                                MA.f(t10, "NativeAssetsLoader.omidWebView", rd);
                            }
                            c3901sD = t10;
                            r12.B(65, c3901sD);
                            ArrayList arrayList2 = new ArrayList();
                            final P3.a aVar9 = aVar2;
                            arrayList2.add(aVar9);
                            final P3.a aVar10 = aVar;
                            arrayList2.add(aVar10);
                            final P3.a aVar11 = aVar6;
                            arrayList2.add(aVar11);
                            final P3.a aVar12 = aVar4;
                            arrayList2.add(aVar12);
                            final P3.a aVar13 = aVar7;
                            arrayList2.add(aVar13);
                            final P3.a aVar14 = aVar5;
                            arrayList2.add(aVar14);
                            arrayList2.add(d9);
                            final ND nd7 = nd2;
                            arrayList2.add(nd7);
                            arrayList2.add(u6);
                            final C4896a c4896a6 = c4896a3;
                            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                arrayList2.add(c3901sD);
                            }
                            RB n9 = RB.n(arrayList2);
                            final JSONObject jSONObject3 = jSONObject2;
                            final C4244yf c4244yf6 = c4244yf3;
                            final P3.a aVar15 = d9;
                            final C2590Gf c2590Gf5 = r12;
                            Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Xm
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    List list;
                                    JSONObject optJSONObject10;
                                    C2590Gf c2590Gf6 = C2590Gf.this;
                                    P3.a aVar16 = aVar9;
                                    P3.a aVar17 = aVar10;
                                    P3.a aVar18 = aVar13;
                                    P3.a aVar19 = aVar12;
                                    P3.a aVar20 = aVar14;
                                    JSONObject jSONObject4 = jSONObject3;
                                    P3.a aVar21 = aVar15;
                                    P3.a aVar22 = nd7;
                                    P3.a aVar23 = aVar11;
                                    P3.a aVar24 = c3901sD;
                                    P3.a aVar25 = u6;
                                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
                                        com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, (C3069co) c2590Gf6.f25833x, "rendering-native-assets-loading-end");
                                    }
                                    C4089vm c4089vm = (C4089vm) aVar16.get();
                                    List list2 = (List) aVar17.get();
                                    synchronized (c4089vm) {
                                        c4089vm.f35489e = list2;
                                    }
                                    InterfaceC3862rb interfaceC3862rb = (InterfaceC3862rb) aVar18.get();
                                    synchronized (c4089vm) {
                                        c4089vm.f35502s = interfaceC3862rb;
                                    }
                                    InterfaceC3862rb interfaceC3862rb2 = (InterfaceC3862rb) aVar19.get();
                                    synchronized (c4089vm) {
                                        c4089vm.f35503t = interfaceC3862rb2;
                                    }
                                    InterfaceC3647nb interfaceC3647nb = (InterfaceC3647nb) aVar20.get();
                                    synchronized (c4089vm) {
                                        c4089vm.f35487c = interfaceC3647nb;
                                    }
                                    JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                                    if (optJSONObject11 == null) {
                                        PB pb = RB.f27933u;
                                        list = C3523lC.f32525x;
                                    } else {
                                        JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                                        if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                            PB pb2 = RB.f27933u;
                                            list = C3523lC.f32525x;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (int i12 = 0; i12 < optJSONArray6.length(); i12++) {
                                                s2.L0 f2 = C3122dn.f(optJSONArray6.optJSONObject(i12));
                                                if (f2 != null) {
                                                    arrayList3.add(f2);
                                                }
                                            }
                                            list = RB.n(arrayList3);
                                        }
                                    }
                                    synchronized (c4089vm) {
                                        c4089vm.f35490f = list;
                                    }
                                    JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                                    s2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3122dn.f(optJSONObject10);
                                    synchronized (c4089vm) {
                                        c4089vm.f35491g = f9;
                                    }
                                    InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) aVar21.get();
                                    if (interfaceC4084vh != null) {
                                        synchronized (c4089vm) {
                                            c4089vm.i = interfaceC4084vh;
                                        }
                                        View V8 = interfaceC4084vh.V();
                                        synchronized (c4089vm) {
                                            c4089vm.f35498o = V8;
                                        }
                                        BinderC2626Ih g9 = interfaceC4084vh.g();
                                        synchronized (c4089vm) {
                                            c4089vm.f35486b = g9;
                                        }
                                    }
                                    c4089vm.d().putAll((Bundle) aVar22.get());
                                    InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) aVar23.get();
                                    if (interfaceC4084vh2 != null) {
                                        synchronized (c4089vm) {
                                            c4089vm.f35493j = interfaceC4084vh2;
                                        }
                                        View V9 = interfaceC4084vh2.V();
                                        synchronized (c4089vm) {
                                            c4089vm.f35499p = V9;
                                        }
                                    }
                                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                                        InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) aVar24.get();
                                        if (interfaceC4084vh3 != null) {
                                            synchronized (c4089vm) {
                                                c4089vm.f35494k = interfaceC4084vh3;
                                            }
                                        }
                                    } else {
                                        synchronized (c4089vm) {
                                            c4089vm.f35496m = aVar24;
                                        }
                                        C3490kg c3490kg2 = new C3490kg();
                                        synchronized (c4089vm) {
                                            c4089vm.f35497n = c3490kg2;
                                        }
                                    }
                                    for (C3175en c3175en : (List) aVar25.get()) {
                                        if (c3175en.f30761a != 1) {
                                            String str3 = c3175en.f30762b;
                                            BinderC3379ib binderC3379ib = c3175en.f30764d;
                                            synchronized (c4089vm) {
                                                if (binderC3379ib == null) {
                                                    c4089vm.f35505v.remove(str3);
                                                } else {
                                                    c4089vm.f35505v.put(str3, binderC3379ib);
                                                }
                                            }
                                        } else {
                                            c4089vm.o(c3175en.f30762b, c3175en.f30763c);
                                        }
                                    }
                                    return c4089vm;
                                }
                            };
                            final FD fd = new FD(n9, false, false);
                            fd.f25513I = new ED(fd, callable, c3383ig);
                            fd.w();
                            C3523lC o4 = RB.o(new P3.a[]{b9, fd});
                            Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
                                /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
                                @Override // java.util.concurrent.Callable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object call() {
                                    C2720Nq c2720Nq;
                                    final int i12;
                                    int i13 = 0;
                                    C2720Nq c2720Nq2 = C2720Nq.this;
                                    FD fd2 = fd;
                                    P3.a aVar16 = b9;
                                    Yt yt2 = yt;
                                    St st2 = st;
                                    JSONObject jSONObject4 = jSONObject;
                                    C4896a c4896a7 = c4896a6;
                                    C4244yf c4244yf7 = c4244yf6;
                                    c2720Nq2.getClass();
                                    C4089vm c4089vm = (C4089vm) fd2.get();
                                    C4036un c4036un = (C4036un) aVar16.get();
                                    C3324ha c3324ha4 = AbstractC3592ma.f32852M2;
                                    s2.r rVar3 = s2.r.f40506e;
                                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                                        com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq2.f27336f, "rendering-webview-creation-end");
                                    }
                                    C3224fi c3224fi = c2720Nq2.f27331a;
                                    C3504ku c3504ku3 = new C3504ku(yt2, st2, (String) null);
                                    C3680o7 c3680o7 = new C3680o7(19, c4089vm);
                                    C2590Gf c2590Gf6 = new C2590Gf(jSONObject4, c4036un, c4896a7, c4244yf7, 12);
                                    C3332hi c3332hi = c3224fi.f31143b;
                                    C3224fi c3224fi2 = c3224fi.f31146c;
                                    C3266gN a10 = C3266gN.a(new C2911Zh(c3332hi.f31613M0, 12));
                                    C2696Mj c2696Mj = new C2696Mj(c3504ku3, 0);
                                    C3389im c3389im = new C3389im(c2590Gf6, i13);
                                    C2783Rl c2783Rl = new C2783Rl(C3266gN.a(new C2709Nf(c2696Mj, c3389im, 13)), 11);
                                    C3266gN a11 = C3266gN.a(new C4031ui(14, c2783Rl));
                                    C3010bi c3010bi = c3332hi.i;
                                    C2851Vl c2851Vl = AbstractC2792Sd.f28285B;
                                    C3266gN a12 = C3266gN.a(new C2556Ef(c3010bi, a11, c2851Vl, 1));
                                    C3266gN a13 = C3266gN.a(new E2.F(c3332hi.f31645g, a12, 4));
                                    C3266gN a14 = C3266gN.a(new C2830Uh(a12, a10, 3));
                                    C3266gN c3266gN = c3332hi.f31637c;
                                    C3266gN c3266gN2 = c3332hi.f31643f;
                                    C3266gN a15 = C3266gN.a(new C3011bj(a10, a13, c3266gN, a14, c3266gN2, 0));
                                    C3266gN a16 = C3266gN.a(new C2830Uh(a15, a11, 5));
                                    C2851Vl c2851Vl2 = new C2851Vl(3);
                                    C2696Mj c2696Mj2 = new C2696Mj(c3504ku3, 3);
                                    C3266gN a17 = C3266gN.a(new C3119dk(c3224fi2.f31191x, c2696Mj, c2851Vl2, c2696Mj2, c3266gN2, c3332hi.f31659o, c3332hi.f31628U));
                                    C3266gN a18 = C3266gN.a(new C2815Tj(a17, 17));
                                    int i14 = C3588mN.f32724c;
                                    ArrayList arrayList3 = new ArrayList(1);
                                    ArrayList arrayList4 = new ArrayList(3);
                                    arrayList4.add(c3224fi2.f31190w0);
                                    arrayList4.add(c3224fi2.f31192x0);
                                    arrayList4.add(a16);
                                    arrayList3.add(a18);
                                    C3266gN a19 = C3266gN.a(new C3979tk(new C3588mN(arrayList3, arrayList4), 3));
                                    C3266gN a20 = C3266gN.a(AbstractC2792Sd.f28284A);
                                    C3266gN c3266gN3 = c3332hi.f31637c;
                                    C3266gN a21 = C3266gN.a(new C2830Uh(a20, c3266gN3, 11));
                                    C2696Mj c2696Mj3 = new C2696Mj(c3504ku3, 2);
                                    C3010bi c3010bi2 = c3332hi.f31645g;
                                    C3266gN a22 = C3266gN.a(new C3063ci(c3010bi2, 16));
                                    C3266gN a23 = C3266gN.a(MA.f27054z);
                                    C3266gN a24 = C3266gN.a(new C2729Oi(c3010bi2, c3332hi.J, a22, a23, c3332hi.f31607J0, c3332hi.f31639d));
                                    C3266gN a25 = C3266gN.a(new C2729Oi(c3332hi.f31622R, c3332hi.f31620Q, c2696Mj, c2696Mj3, a24, c3224fi2.f31152e));
                                    C2851Vl c2851Vl3 = new C2851Vl(5);
                                    C3266gN a26 = C3266gN.a(new C2830Uh(a20, c3266gN3, 16));
                                    C3266gN a27 = C3266gN.a(AbstractC2659Kg.f26716A);
                                    C2783Rl c2783Rl2 = new C2783Rl(a27, 14);
                                    ArrayList arrayList5 = new ArrayList(2);
                                    ArrayList arrayList6 = new ArrayList(1);
                                    arrayList6.add(c3224fi2.C0);
                                    arrayList5.add(a26);
                                    arrayList5.add(c2783Rl2);
                                    C3266gN a28 = C3266gN.a(new C2556Ef(new C3588mN(arrayList5, arrayList6), c2696Mj, c2696Mj2, 7));
                                    C3266gN a29 = C3266gN.a(new C4031ui(12, c2696Mj2));
                                    C3266gN a30 = C3266gN.a(new C2831Ui(c3332hi.f31645g, c3332hi.f31637c, c3332hi.f31639d, c2696Mj2, c2696Mj, c3224fi2.f31182s0, a25, c2851Vl3, c2851Vl2, c3332hi.f31614N, c3224fi2.f31184t0, c3224fi2.f31152e, c3224fi2.f31094B0, a28, a29, c3224fi2.f31172n0));
                                    int i15 = 2;
                                    C2815Tj c2815Tj = new C2815Tj(a30, i15);
                                    C2815Tj c2815Tj2 = new C2815Tj(C3266gN.a(new C2709Nf(c2696Mj, c3332hi.f31642e0, i15)), 23);
                                    ArrayList arrayList7 = new ArrayList(4);
                                    ArrayList arrayList8 = new ArrayList(2);
                                    arrayList7.add(c3224fi2.f31194y0);
                                    arrayList8.add(c3224fi2.f31196z0);
                                    arrayList8.add(c3224fi2.f31092A0);
                                    arrayList7.add(a21);
                                    arrayList7.add(c2815Tj);
                                    arrayList7.add(c2815Tj2);
                                    C3266gN a31 = C3266gN.a(new C3979tk(new C3588mN(arrayList7, arrayList8), 4));
                                    C3266gN a32 = C3266gN.a(new C3119dk(c3332hi.f31645g, c3332hi.f31606I0, c3332hi.f31659o, c2696Mj2, c2696Mj, c3332hi.f31618P, c2851Vl));
                                    C3266gN a33 = C3266gN.a(new C2815Tj(a32, 13));
                                    C3266gN a34 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 10));
                                    C3266gN a35 = C3266gN.a(new C2815Tj(C3266gN.a(new C2849Vj(c3332hi.f31598E0, c3224fi2.f31149d)), 11));
                                    C2815Tj c2815Tj3 = new C2815Tj(a30, 1);
                                    ArrayList arrayList9 = new ArrayList(5);
                                    ArrayList arrayList10 = new ArrayList(3);
                                    arrayList9.add(c3224fi2.f31097D0);
                                    arrayList9.add(c3224fi2.f31099E0);
                                    arrayList10.add(c3224fi2.f31101F0);
                                    arrayList10.add(c3224fi2.f31103G0);
                                    arrayList9.add(a33);
                                    arrayList9.add(a34);
                                    arrayList10.add(a35);
                                    arrayList9.add(c2815Tj3);
                                    C3266gN a36 = C3266gN.a(new C3979tk(new C3588mN(arrayList9, arrayList10), 0));
                                    C3266gN a37 = C3266gN.a(new C2830Uh(a15, a11, 4));
                                    C3266gN a38 = C3266gN.a(new C2815Tj(a32, 14));
                                    C3266gN a39 = C3266gN.a(new C2815Tj(a17, 16));
                                    C3266gN c3266gN4 = c3332hi.f31637c;
                                    C3266gN a40 = C3266gN.a(new C2830Uh(a20, c3266gN4, 13));
                                    C3266gN a41 = C3266gN.a(new C2815Tj(c3224fi2.f31179r, 15));
                                    C2911Zh c2911Zh = new C2911Zh(a28, 20);
                                    C2815Tj c2815Tj4 = new C2815Tj(a30, 4);
                                    C4031ui c4031ui = new C4031ui(16, c3680o7);
                                    C2783Rl c2783Rl3 = new C2783Rl(C3266gN.a(new C2556Ef(c4031ui, c2783Rl, c3266gN4, 9)), 13);
                                    ArrayList arrayList11 = new ArrayList(9);
                                    ArrayList arrayList12 = new ArrayList(3);
                                    arrayList11.add(c3224fi2.f31105H0);
                                    arrayList11.add(c3224fi2.f31107I0);
                                    arrayList12.add(c3224fi2.f31108J0);
                                    arrayList12.add(c3224fi2.f31110K0);
                                    arrayList12.add(a37);
                                    arrayList11.add(a38);
                                    arrayList11.add(a39);
                                    arrayList11.add(a40);
                                    arrayList11.add(a41);
                                    arrayList11.add(c2911Zh);
                                    arrayList11.add(c2815Tj4);
                                    arrayList11.add(c2783Rl3);
                                    C3266gN a42 = C3266gN.a(new C3979tk(new C3588mN(arrayList11, arrayList12), 2));
                                    C2815Tj c2815Tj5 = new C2815Tj(a30, 7);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    ArrayList arrayList14 = new ArrayList(1);
                                    arrayList14.add(c3224fi2.f31112L0);
                                    arrayList13.add(c2815Tj5);
                                    C3266gN a43 = C3266gN.a(new C3979tk(new C3588mN(arrayList13, arrayList14), 19));
                                    C2815Tj c2815Tj6 = new C2815Tj(C3266gN.a(new C2630Il(c2696Mj, c3332hi.f31622R)), 0);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    new ArrayList(1).add(c3224fi2.f31114M0);
                                    arrayList15.add(c2815Tj6);
                                    C3266gN a44 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 17));
                                    ArrayList arrayList16 = new ArrayList(1);
                                    ArrayList arrayList17 = new ArrayList(1);
                                    arrayList17.add(c3224fi2.f31116N0);
                                    arrayList16.add(a44);
                                    C3266gN a45 = C3266gN.a(new C3979tk(new C3588mN(arrayList16, arrayList17), 20));
                                    C3266gN a46 = C3266gN.a(new C2815Tj(a17, 18));
                                    C2815Tj c2815Tj7 = new C2815Tj(a30, 5);
                                    ArrayList arrayList18 = new ArrayList(7);
                                    ArrayList arrayList19 = new ArrayList(4);
                                    arrayList18.add(c3224fi2.f31118O0);
                                    arrayList19.add(c3224fi2.f31120P0);
                                    arrayList18.add(c3224fi2.f31122Q0);
                                    arrayList18.add(c3224fi2.f31124R0);
                                    arrayList19.add(c3224fi2.f31126S0);
                                    arrayList19.add(c3224fi2.f31128T0);
                                    arrayList19.add(c3224fi2.f31130U0);
                                    arrayList18.add(c3224fi2.f31132V0);
                                    arrayList18.add(c3224fi2.f31134W0);
                                    arrayList18.add(a46);
                                    arrayList18.add(c2815Tj7);
                                    C3266gN a47 = C3266gN.a(new C3979tk(new C3588mN(arrayList18, arrayList19), 5));
                                    C2815Tj c2815Tj8 = new C2815Tj(C3266gN.a(new C2911Zh(a31, 19)), 9);
                                    C3266gN a48 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 15));
                                    ArrayList arrayList20 = new ArrayList(2);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c3224fi2.f31137Y0);
                                    arrayList20.add(c2815Tj8);
                                    arrayList20.add(a48);
                                    C3266gN a49 = C3266gN.a(new C3979tk(new C3588mN(arrayList20, arrayList21), 9));
                                    List list = Collections.EMPTY_LIST;
                                    new ArrayList(1).add(c3224fi2.f31139Z0);
                                    C3266gN a50 = C3266gN.a(new C2815Tj(a32, 12));
                                    ArrayList arrayList22 = new ArrayList(1);
                                    List list2 = Collections.EMPTY_LIST;
                                    arrayList22.add(a50);
                                    C3266gN a51 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 12));
                                    C2815Tj c2815Tj9 = new C2815Tj(a30, 3);
                                    ArrayList arrayList23 = new ArrayList(2);
                                    new ArrayList(1).add(c3224fi2.f31142a1);
                                    arrayList23.add(a51);
                                    arrayList23.add(c2815Tj9);
                                    C3266gN a52 = C3266gN.a(new C2815Tj(a32, 8));
                                    ArrayList arrayList24 = new ArrayList(1);
                                    List list3 = Collections.EMPTY_LIST;
                                    arrayList24.add(a52);
                                    C2696Mj c2696Mj4 = new C2696Mj(c3504ku3, 1);
                                    C4248yj c4248yj = new C4248yj(c2696Mj, c2696Mj4, c3224fi2.f31091A, c2696Mj3, c3224fi2.f31155f);
                                    ArrayList arrayList25 = new ArrayList(1);
                                    ArrayList arrayList26 = new ArrayList(1);
                                    arrayList26.add(c3224fi2.f31148c1);
                                    arrayList25.add(c3224fi2.f31151d1);
                                    C2747Pj c2747Pj = new C2747Pj(c2696Mj2, c2696Mj, a19, a47, c3224fi2.f31145b1, c4248yj, a20, new C3979tk(new C3588mN(arrayList25, arrayList26), 6), a43, a29, c3332hi.f31670t0);
                                    C3389im c3389im2 = new C3389im(c2590Gf6, 1);
                                    C3266gN a53 = C3266gN.a(new C2631Im(c3389im2, c3332hi.f31643f));
                                    C3266gN a54 = C3266gN.a(new C2830Uh(a15, a11, 6));
                                    List list4 = Collections.EMPTY_LIST;
                                    ArrayList arrayList27 = new ArrayList(2);
                                    arrayList27.add(c3224fi2.f31154e1);
                                    arrayList27.add(a54);
                                    C3588mN c3588mN = new C3588mN(list4, arrayList27);
                                    C3266gN c3266gN5 = c3224fi2.f31191x;
                                    C3266gN a55 = C3266gN.a(new C2556Ef(c3266gN5, c3588mN, c2696Mj, 8));
                                    C3266gN a56 = C3266gN.a(new C3389im(c2590Gf6, 2));
                                    C3266gN a57 = C3266gN.a(new C3389im(c2590Gf6, 3));
                                    C3121dm c3121dm = c3224fi2.m0;
                                    C3266gN c3266gN6 = c3332hi.f31614N;
                                    C3010bi c3010bi3 = c3332hi.i;
                                    C3818qk c3818qk = c3224fi2.f31149d;
                                    C3266gN c3266gN7 = c3332hi.f31643f;
                                    C2783Rl c2783Rl4 = new C2783Rl(C3266gN.a(new C3336hm(c3266gN5, c3121dm, c3389im, c3389im2, c4031ui, c3266gN6, a42, a36, a45, c2696Mj, c3010bi3, c3818qk, a15, a53, c3266gN7, a55, c3332hi.f31622R, c3224fi2.f31152e, c3332hi.f31624S, a23, c3332hi.f31623R0, a28, a56, a57, a29)), 12);
                                    C3266gN a58 = C3266gN.a(new C3442jm(c3010bi3, 0));
                                    C3266gN c3266gN8 = c3332hi.f31637c;
                                    C3266gN a59 = C3266gN.a(new C4293za(a58, c3266gN8, c3266gN5, c3266gN7, 1));
                                    C3266gN c3266gN9 = c3224fi2.f31186u0;
                                    C2956ai c2956ai = new C2956ai(c3266gN9, c3389im2, a59, c2783Rl4);
                                    C2631Im c2631Im = new C2631Im(c3266gN9, c3389im2);
                                    C3266gN a60 = C3266gN.a(new C4031ui(15, new C3604mm(c4031ui, 0)));
                                    C2563Em c2563Em = new C2563Em(c3332hi.J, c3818qk, c2783Rl, c4031ui, c2956ai, c2631Im, c3266gN8, a60);
                                    Yr yr = new Yr();
                                    C3266gN a61 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 1));
                                    C3266gN a62 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 0));
                                    C3266gN a63 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2696Mj4, (InterfaceC3320hN) yr, (InterfaceC3320hN) c4031ui, c3332hi.f31659o, 8));
                                    C3266gN a64 = C3266gN.a(new C2709Nf(yr, c4031ui, 17));
                                    C3010bi c3010bi4 = c3332hi.f31645g;
                                    C3266gN a65 = C3266gN.a(new C2956ai(c3010bi4, c4031ui, c2563Em, yr, 7));
                                    Yr.a(yr, C3266gN.a(new C3927sm(c2747Pj, c3266gN8, c4031ui, c2783Rl4, c2563Em, c2783Rl, c3121dm, a61, a62, a63, a64, a65, new C3870rj(c3010bi4, c3818qk, 2), c3266gN6, c3010bi3, c3010bi4, a60, a27, c3332hi.f31625S0)));
                                    C3266gN c3266gN10 = c3224fi2.f31157f1;
                                    C3266gN c3266gN11 = c3224fi2.f31136X0;
                                    C3266gN a66 = C3266gN.a(new C2563Em(a36, a31, c3266gN10, a49, c3266gN11, c2696Mj, c2696Mj3, a24, 1));
                                    C3266gN a67 = C3266gN.a(new C3011bj(c3332hi.f31637c, a59, C3266gN.a(new C2630Il(c3224fi2.f31191x, c2696Mj, 1)), a24, a29, 1));
                                    C3266gN a68 = C3266gN.a(new C3601mj(a36, a31, c3266gN10, a49, c3266gN11, a45, c3332hi.f31659o, c3332hi.f31622R, c3332hi.f31618P, a24, 2));
                                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                                        C4906k.f40186C.f40198k.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        c2720Nq = c2720Nq2;
                                        C3069co c3069co4 = c2720Nq.f27336f;
                                        c3069co4.c("rendering-ad-component-creation-end", currentTimeMillis);
                                        c3069co4.c("rendering-configure-webview-start", currentTimeMillis);
                                    } else {
                                        c2720Nq = c2720Nq2;
                                    }
                                    C2495Am c2495Am = (C2495Am) c3224fi2.f31140a.f30365u;
                                    AbstractC3364iD.j(c2495Am);
                                    AbstractC3364iD.j(c4089vm);
                                    AbstractC3364iD.j(c4036un);
                                    C2791Sc c2791Sc = new C2791Sc(c2495Am, c4089vm, c4036un, C3266gN.b(a65));
                                    if (((InterfaceC2603Hb) c2791Sc.f28281u) != null) {
                                        ((C4036un) c2791Sc.f28282v).b("/nativeAdCustomClick", c2791Sc);
                                    }
                                    C3928sn c3928sn = (C3928sn) a66.f();
                                    C2595Gk c2595Gk = c3928sn.f34922b;
                                    C3821qn c3821qn = c4036un.f35339a;
                                    Objects.requireNonNull(c2595Gk);
                                    C3874rn c3874rn = new C3874rn(0, c2595Gk);
                                    C3925sk c3925sk = c3928sn.f34921a;
                                    C2714Nk c2714Nk = c3928sn.f34923c;
                                    C2782Rk c2782Rk = c3928sn.f34924d;
                                    C3388il c3388il = c3928sn.f34925e;
                                    synchronized (c3821qn) {
                                        c3821qn.f34178n = c3925sk;
                                        c3821qn.f34179u = c2714Nk;
                                        c3821qn.f34180v = c2782Rk;
                                        c3821qn.f34181w = c3388il;
                                        c3821qn.f34182x = c3874rn;
                                    }
                                    St st3 = c3928sn.f34926f;
                                    Ut ut4 = c3928sn.f34927g;
                                    C2712Ni c2712Ni = c3928sn.f34928h;
                                    synchronized (c4036un) {
                                        C3955tD c3955tD = c4036un.f35351n;
                                        if (c3955tD != null) {
                                            C2590Gf c2590Gf7 = new C2590Gf(c4036un, st3, ut4, c2712Ni);
                                            c3955tD.a(new LD(0, c3955tD, c2590Gf7), c4036un.f35343e);
                                        }
                                    }
                                    final C3337hn c3337hn = (C3337hn) a67.f();
                                    InterfaceC4084vh h3 = c4089vm.h();
                                    c3337hn.getClass();
                                    if (h3 != null) {
                                        View V8 = h3.V();
                                        C2545Dl c2545Dl = c3337hn.f31715c;
                                        c2545Dl.R1(V8);
                                        C3229fn c3229fn = new C3229fn(h3, 1);
                                        Executor executor2 = c3337hn.f31713a;
                                        c2545Dl.I1(c3229fn, executor2);
                                        c2545Dl.I1(new C3229fn(h3, 0), executor2);
                                        C3118dj c3118dj = c3337hn.f31714b;
                                        c2545Dl.I1(c3118dj, executor2);
                                        c3118dj.f30596n = h3;
                                        C2677Lh h02 = h3.h0();
                                        if (!((Boolean) rVar3.f40509c.a(AbstractC3592ma.Ab)).booleanValue() || h02 == null) {
                                            i12 = 0;
                                        } else {
                                            h02.c("/click");
                                            InterfaceC2579Fl interfaceC2579Fl = h02.f26928D;
                                            C2950ac c2950ac = AbstractC3218fc.f31040a;
                                            C2712Ni c2712Ni2 = c3337hn.f31716d;
                                            i12 = 0;
                                            h02.b("/click", new C3111dc(0, interfaceC2579Fl, c2712Ni2));
                                            h02.y(c2712Ni2, null, null);
                                        }
                                        h3.Z0("/trackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                                            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                                            public final void e(Object obj, Map map) {
                                                switch (i12) {
                                                    case 0:
                                                        C3118dj c3118dj2 = c3337hn.f31714b;
                                                        c3118dj2.f30600x = true;
                                                        c3118dj2.a();
                                                        break;
                                                    default:
                                                        c3337hn.f31714b.f30600x = false;
                                                        break;
                                                }
                                            }
                                        });
                                        final int i16 = 1;
                                        h3.Z0("/untrackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                                            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                                            public final void e(Object obj, Map map) {
                                                switch (i16) {
                                                    case 0:
                                                        C3118dj c3118dj2 = c3337hn.f31714b;
                                                        c3118dj2.f30600x = true;
                                                        c3118dj2.a();
                                                        break;
                                                    default:
                                                        c3337hn.f31714b.f30600x = false;
                                                        break;
                                                }
                                            }
                                        });
                                        h3.h0().f26943T = c3337hn.f31717e;
                                    }
                                    C4198xn c4198xn = (C4198xn) a68.f();
                                    C4252yn c4252yn = c2720Nq.f27335e;
                                    InterfaceC4084vh i17 = c4089vm.i();
                                    c4198xn.getClass();
                                    C4090vn c4090vn = c4252yn.f36008a;
                                    C2595Gk c2595Gk2 = c4198xn.f35831b;
                                    Objects.requireNonNull(c2595Gk2);
                                    C3874rn c3874rn2 = new C3874rn(1, c2595Gk2);
                                    C3925sk c3925sk2 = c4198xn.f35830a;
                                    C2714Nk c2714Nk2 = c4198xn.f35832c;
                                    C2782Rk c2782Rk2 = c4198xn.f35833d;
                                    C3388il c3388il2 = c4198xn.f35834e;
                                    C2562El c2562El = c4198xn.f35835f;
                                    synchronized (c4090vn) {
                                        synchronized (c4090vn) {
                                            c4090vn.f34178n = c3925sk2;
                                            c4090vn.f34179u = c2714Nk2;
                                            c4090vn.f34180v = c2782Rk2;
                                            c4090vn.f34181w = c3388il2;
                                            c4090vn.f34182x = c3874rn2;
                                        }
                                        if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue() && i17 != null && i17.h0() != null) {
                                            C2677Lh h03 = i17.h0();
                                            C2712Ni c2712Ni3 = c4198xn.f35838j;
                                            C2821Tp c2821Tp = c4198xn.i;
                                            h03.x(c2712Ni3, c2821Tp, c4198xn.f35837h);
                                            h03.y(c2712Ni3, c2821Tp, c4198xn.f35836g);
                                        }
                                        if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                                            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq.f27336f, "rendering-configure-webview-end");
                                        }
                                        return (C3873rm) yr.f();
                                    }
                                    c4090vn.f35509y = c2562El;
                                    if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue()) {
                                        C2677Lh h032 = i17.h0();
                                        C2712Ni c2712Ni32 = c4198xn.f35838j;
                                        C2821Tp c2821Tp2 = c4198xn.i;
                                        h032.x(c2712Ni32, c2821Tp2, c4198xn.f35837h);
                                        h032.y(c2712Ni32, c2821Tp2, c4198xn.f35836g);
                                    }
                                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                                    }
                                    return (C3873rm) yr.f();
                                }
                            };
                            FD fd2 = new FD(o4, true, false);
                            fd2.f25513I = new ED(fd2, callable2, this.f27332b);
                            fd2.w();
                            return fd2;
                        }
                        c3901sD2 = ND.f27257u;
                    }
                } else {
                    c3901sD2 = ND.f27257u;
                }
                c3901sD = c3901sD2;
                r12.B(65, c3901sD);
                ArrayList arrayList22 = new ArrayList();
                final P3.a aVar92 = aVar2;
                arrayList22.add(aVar92);
                final P3.a aVar102 = aVar;
                arrayList22.add(aVar102);
                final P3.a aVar112 = aVar6;
                arrayList22.add(aVar112);
                final P3.a aVar122 = aVar4;
                arrayList22.add(aVar122);
                final P3.a aVar132 = aVar7;
                arrayList22.add(aVar132);
                final P3.a aVar142 = aVar5;
                arrayList22.add(aVar142);
                arrayList22.add(d9);
                final P3.a nd72 = nd2;
                arrayList22.add(nd72);
                arrayList22.add(u6);
                final C4896a c4896a62 = c4896a3;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue()) {
                }
                arrayList22.add(c3901sD);
                RB n92 = RB.n(arrayList22);
                final JSONObject jSONObject32 = jSONObject2;
                final C4244yf c4244yf62 = c4244yf3;
                final P3.a aVar152 = d9;
                final C2590Gf c2590Gf52 = r12;
                Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.Xm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List list;
                        JSONObject optJSONObject10;
                        C2590Gf c2590Gf6 = C2590Gf.this;
                        P3.a aVar16 = aVar92;
                        P3.a aVar17 = aVar102;
                        P3.a aVar18 = aVar132;
                        P3.a aVar19 = aVar122;
                        P3.a aVar20 = aVar142;
                        JSONObject jSONObject4 = jSONObject32;
                        P3.a aVar21 = aVar152;
                        P3.a aVar22 = nd72;
                        P3.a aVar23 = aVar112;
                        P3.a aVar24 = c3901sD;
                        P3.a aVar25 = u6;
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
                            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, (C3069co) c2590Gf6.f25833x, "rendering-native-assets-loading-end");
                        }
                        C4089vm c4089vm = (C4089vm) aVar16.get();
                        List list2 = (List) aVar17.get();
                        synchronized (c4089vm) {
                            c4089vm.f35489e = list2;
                        }
                        InterfaceC3862rb interfaceC3862rb = (InterfaceC3862rb) aVar18.get();
                        synchronized (c4089vm) {
                            c4089vm.f35502s = interfaceC3862rb;
                        }
                        InterfaceC3862rb interfaceC3862rb2 = (InterfaceC3862rb) aVar19.get();
                        synchronized (c4089vm) {
                            c4089vm.f35503t = interfaceC3862rb2;
                        }
                        InterfaceC3647nb interfaceC3647nb = (InterfaceC3647nb) aVar20.get();
                        synchronized (c4089vm) {
                            c4089vm.f35487c = interfaceC3647nb;
                        }
                        JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                        if (optJSONObject11 == null) {
                            PB pb = RB.f27933u;
                            list = C3523lC.f32525x;
                        } else {
                            JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                            if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                PB pb2 = RB.f27933u;
                                list = C3523lC.f32525x;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i12 = 0; i12 < optJSONArray6.length(); i12++) {
                                    s2.L0 f2 = C3122dn.f(optJSONArray6.optJSONObject(i12));
                                    if (f2 != null) {
                                        arrayList3.add(f2);
                                    }
                                }
                                list = RB.n(arrayList3);
                            }
                        }
                        synchronized (c4089vm) {
                            c4089vm.f35490f = list;
                        }
                        JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                        s2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3122dn.f(optJSONObject10);
                        synchronized (c4089vm) {
                            c4089vm.f35491g = f9;
                        }
                        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) aVar21.get();
                        if (interfaceC4084vh != null) {
                            synchronized (c4089vm) {
                                c4089vm.i = interfaceC4084vh;
                            }
                            View V8 = interfaceC4084vh.V();
                            synchronized (c4089vm) {
                                c4089vm.f35498o = V8;
                            }
                            BinderC2626Ih g9 = interfaceC4084vh.g();
                            synchronized (c4089vm) {
                                c4089vm.f35486b = g9;
                            }
                        }
                        c4089vm.d().putAll((Bundle) aVar22.get());
                        InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) aVar23.get();
                        if (interfaceC4084vh2 != null) {
                            synchronized (c4089vm) {
                                c4089vm.f35493j = interfaceC4084vh2;
                            }
                            View V9 = interfaceC4084vh2.V();
                            synchronized (c4089vm) {
                                c4089vm.f35499p = V9;
                            }
                        }
                        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                            InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) aVar24.get();
                            if (interfaceC4084vh3 != null) {
                                synchronized (c4089vm) {
                                    c4089vm.f35494k = interfaceC4084vh3;
                                }
                            }
                        } else {
                            synchronized (c4089vm) {
                                c4089vm.f35496m = aVar24;
                            }
                            C3490kg c3490kg2 = new C3490kg();
                            synchronized (c4089vm) {
                                c4089vm.f35497n = c3490kg2;
                            }
                        }
                        for (C3175en c3175en : (List) aVar25.get()) {
                            if (c3175en.f30761a != 1) {
                                String str3 = c3175en.f30762b;
                                BinderC3379ib binderC3379ib = c3175en.f30764d;
                                synchronized (c4089vm) {
                                    if (binderC3379ib == null) {
                                        c4089vm.f35505v.remove(str3);
                                    } else {
                                        c4089vm.f35505v.put(str3, binderC3379ib);
                                    }
                                }
                            } else {
                                c4089vm.o(c3175en.f30762b, c3175en.f30763c);
                            }
                        }
                        return c4089vm;
                    }
                };
                final FD fd3 = new FD(n92, false, false);
                fd3.f25513I = new ED(fd3, callable3, c3383ig);
                fd3.w();
                C3523lC o42 = RB.o(new P3.a[]{b9, fd3});
                Callable callable22 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        C2720Nq c2720Nq;
                        final int i12;
                        int i13 = 0;
                        C2720Nq c2720Nq2 = C2720Nq.this;
                        FD fd22 = fd3;
                        P3.a aVar16 = b9;
                        Yt yt2 = yt;
                        St st2 = st;
                        JSONObject jSONObject4 = jSONObject;
                        C4896a c4896a7 = c4896a62;
                        C4244yf c4244yf7 = c4244yf62;
                        c2720Nq2.getClass();
                        C4089vm c4089vm = (C4089vm) fd22.get();
                        C4036un c4036un = (C4036un) aVar16.get();
                        C3324ha c3324ha4 = AbstractC3592ma.f32852M2;
                        s2.r rVar3 = s2.r.f40506e;
                        if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq2.f27336f, "rendering-webview-creation-end");
                        }
                        C3224fi c3224fi = c2720Nq2.f27331a;
                        C3504ku c3504ku3 = new C3504ku(yt2, st2, (String) null);
                        C3680o7 c3680o7 = new C3680o7(19, c4089vm);
                        C2590Gf c2590Gf6 = new C2590Gf(jSONObject4, c4036un, c4896a7, c4244yf7, 12);
                        C3332hi c3332hi = c3224fi.f31143b;
                        C3224fi c3224fi2 = c3224fi.f31146c;
                        C3266gN a10 = C3266gN.a(new C2911Zh(c3332hi.f31613M0, 12));
                        C2696Mj c2696Mj = new C2696Mj(c3504ku3, 0);
                        C3389im c3389im = new C3389im(c2590Gf6, i13);
                        C2783Rl c2783Rl = new C2783Rl(C3266gN.a(new C2709Nf(c2696Mj, c3389im, 13)), 11);
                        C3266gN a11 = C3266gN.a(new C4031ui(14, c2783Rl));
                        C3010bi c3010bi = c3332hi.i;
                        C2851Vl c2851Vl = AbstractC2792Sd.f28285B;
                        C3266gN a12 = C3266gN.a(new C2556Ef(c3010bi, a11, c2851Vl, 1));
                        C3266gN a13 = C3266gN.a(new E2.F(c3332hi.f31645g, a12, 4));
                        C3266gN a14 = C3266gN.a(new C2830Uh(a12, a10, 3));
                        C3266gN c3266gN = c3332hi.f31637c;
                        C3266gN c3266gN2 = c3332hi.f31643f;
                        C3266gN a15 = C3266gN.a(new C3011bj(a10, a13, c3266gN, a14, c3266gN2, 0));
                        C3266gN a16 = C3266gN.a(new C2830Uh(a15, a11, 5));
                        C2851Vl c2851Vl2 = new C2851Vl(3);
                        C2696Mj c2696Mj2 = new C2696Mj(c3504ku3, 3);
                        C3266gN a17 = C3266gN.a(new C3119dk(c3224fi2.f31191x, c2696Mj, c2851Vl2, c2696Mj2, c3266gN2, c3332hi.f31659o, c3332hi.f31628U));
                        C3266gN a18 = C3266gN.a(new C2815Tj(a17, 17));
                        int i14 = C3588mN.f32724c;
                        ArrayList arrayList3 = new ArrayList(1);
                        ArrayList arrayList4 = new ArrayList(3);
                        arrayList4.add(c3224fi2.f31190w0);
                        arrayList4.add(c3224fi2.f31192x0);
                        arrayList4.add(a16);
                        arrayList3.add(a18);
                        C3266gN a19 = C3266gN.a(new C3979tk(new C3588mN(arrayList3, arrayList4), 3));
                        C3266gN a20 = C3266gN.a(AbstractC2792Sd.f28284A);
                        C3266gN c3266gN3 = c3332hi.f31637c;
                        C3266gN a21 = C3266gN.a(new C2830Uh(a20, c3266gN3, 11));
                        C2696Mj c2696Mj3 = new C2696Mj(c3504ku3, 2);
                        C3010bi c3010bi2 = c3332hi.f31645g;
                        C3266gN a22 = C3266gN.a(new C3063ci(c3010bi2, 16));
                        C3266gN a23 = C3266gN.a(MA.f27054z);
                        C3266gN a24 = C3266gN.a(new C2729Oi(c3010bi2, c3332hi.J, a22, a23, c3332hi.f31607J0, c3332hi.f31639d));
                        C3266gN a25 = C3266gN.a(new C2729Oi(c3332hi.f31622R, c3332hi.f31620Q, c2696Mj, c2696Mj3, a24, c3224fi2.f31152e));
                        C2851Vl c2851Vl3 = new C2851Vl(5);
                        C3266gN a26 = C3266gN.a(new C2830Uh(a20, c3266gN3, 16));
                        C3266gN a27 = C3266gN.a(AbstractC2659Kg.f26716A);
                        C2783Rl c2783Rl2 = new C2783Rl(a27, 14);
                        ArrayList arrayList5 = new ArrayList(2);
                        ArrayList arrayList6 = new ArrayList(1);
                        arrayList6.add(c3224fi2.C0);
                        arrayList5.add(a26);
                        arrayList5.add(c2783Rl2);
                        C3266gN a28 = C3266gN.a(new C2556Ef(new C3588mN(arrayList5, arrayList6), c2696Mj, c2696Mj2, 7));
                        C3266gN a29 = C3266gN.a(new C4031ui(12, c2696Mj2));
                        C3266gN a30 = C3266gN.a(new C2831Ui(c3332hi.f31645g, c3332hi.f31637c, c3332hi.f31639d, c2696Mj2, c2696Mj, c3224fi2.f31182s0, a25, c2851Vl3, c2851Vl2, c3332hi.f31614N, c3224fi2.f31184t0, c3224fi2.f31152e, c3224fi2.f31094B0, a28, a29, c3224fi2.f31172n0));
                        int i15 = 2;
                        C2815Tj c2815Tj = new C2815Tj(a30, i15);
                        C2815Tj c2815Tj2 = new C2815Tj(C3266gN.a(new C2709Nf(c2696Mj, c3332hi.f31642e0, i15)), 23);
                        ArrayList arrayList7 = new ArrayList(4);
                        ArrayList arrayList8 = new ArrayList(2);
                        arrayList7.add(c3224fi2.f31194y0);
                        arrayList8.add(c3224fi2.f31196z0);
                        arrayList8.add(c3224fi2.f31092A0);
                        arrayList7.add(a21);
                        arrayList7.add(c2815Tj);
                        arrayList7.add(c2815Tj2);
                        C3266gN a31 = C3266gN.a(new C3979tk(new C3588mN(arrayList7, arrayList8), 4));
                        C3266gN a32 = C3266gN.a(new C3119dk(c3332hi.f31645g, c3332hi.f31606I0, c3332hi.f31659o, c2696Mj2, c2696Mj, c3332hi.f31618P, c2851Vl));
                        C3266gN a33 = C3266gN.a(new C2815Tj(a32, 13));
                        C3266gN a34 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 10));
                        C3266gN a35 = C3266gN.a(new C2815Tj(C3266gN.a(new C2849Vj(c3332hi.f31598E0, c3224fi2.f31149d)), 11));
                        C2815Tj c2815Tj3 = new C2815Tj(a30, 1);
                        ArrayList arrayList9 = new ArrayList(5);
                        ArrayList arrayList10 = new ArrayList(3);
                        arrayList9.add(c3224fi2.f31097D0);
                        arrayList9.add(c3224fi2.f31099E0);
                        arrayList10.add(c3224fi2.f31101F0);
                        arrayList10.add(c3224fi2.f31103G0);
                        arrayList9.add(a33);
                        arrayList9.add(a34);
                        arrayList10.add(a35);
                        arrayList9.add(c2815Tj3);
                        C3266gN a36 = C3266gN.a(new C3979tk(new C3588mN(arrayList9, arrayList10), 0));
                        C3266gN a37 = C3266gN.a(new C2830Uh(a15, a11, 4));
                        C3266gN a38 = C3266gN.a(new C2815Tj(a32, 14));
                        C3266gN a39 = C3266gN.a(new C2815Tj(a17, 16));
                        C3266gN c3266gN4 = c3332hi.f31637c;
                        C3266gN a40 = C3266gN.a(new C2830Uh(a20, c3266gN4, 13));
                        C3266gN a41 = C3266gN.a(new C2815Tj(c3224fi2.f31179r, 15));
                        C2911Zh c2911Zh = new C2911Zh(a28, 20);
                        C2815Tj c2815Tj4 = new C2815Tj(a30, 4);
                        C4031ui c4031ui = new C4031ui(16, c3680o7);
                        C2783Rl c2783Rl3 = new C2783Rl(C3266gN.a(new C2556Ef(c4031ui, c2783Rl, c3266gN4, 9)), 13);
                        ArrayList arrayList11 = new ArrayList(9);
                        ArrayList arrayList12 = new ArrayList(3);
                        arrayList11.add(c3224fi2.f31105H0);
                        arrayList11.add(c3224fi2.f31107I0);
                        arrayList12.add(c3224fi2.f31108J0);
                        arrayList12.add(c3224fi2.f31110K0);
                        arrayList12.add(a37);
                        arrayList11.add(a38);
                        arrayList11.add(a39);
                        arrayList11.add(a40);
                        arrayList11.add(a41);
                        arrayList11.add(c2911Zh);
                        arrayList11.add(c2815Tj4);
                        arrayList11.add(c2783Rl3);
                        C3266gN a42 = C3266gN.a(new C3979tk(new C3588mN(arrayList11, arrayList12), 2));
                        C2815Tj c2815Tj5 = new C2815Tj(a30, 7);
                        ArrayList arrayList13 = new ArrayList(1);
                        ArrayList arrayList14 = new ArrayList(1);
                        arrayList14.add(c3224fi2.f31112L0);
                        arrayList13.add(c2815Tj5);
                        C3266gN a43 = C3266gN.a(new C3979tk(new C3588mN(arrayList13, arrayList14), 19));
                        C2815Tj c2815Tj6 = new C2815Tj(C3266gN.a(new C2630Il(c2696Mj, c3332hi.f31622R)), 0);
                        ArrayList arrayList15 = new ArrayList(1);
                        new ArrayList(1).add(c3224fi2.f31114M0);
                        arrayList15.add(c2815Tj6);
                        C3266gN a44 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 17));
                        ArrayList arrayList16 = new ArrayList(1);
                        ArrayList arrayList17 = new ArrayList(1);
                        arrayList17.add(c3224fi2.f31116N0);
                        arrayList16.add(a44);
                        C3266gN a45 = C3266gN.a(new C3979tk(new C3588mN(arrayList16, arrayList17), 20));
                        C3266gN a46 = C3266gN.a(new C2815Tj(a17, 18));
                        C2815Tj c2815Tj7 = new C2815Tj(a30, 5);
                        ArrayList arrayList18 = new ArrayList(7);
                        ArrayList arrayList19 = new ArrayList(4);
                        arrayList18.add(c3224fi2.f31118O0);
                        arrayList19.add(c3224fi2.f31120P0);
                        arrayList18.add(c3224fi2.f31122Q0);
                        arrayList18.add(c3224fi2.f31124R0);
                        arrayList19.add(c3224fi2.f31126S0);
                        arrayList19.add(c3224fi2.f31128T0);
                        arrayList19.add(c3224fi2.f31130U0);
                        arrayList18.add(c3224fi2.f31132V0);
                        arrayList18.add(c3224fi2.f31134W0);
                        arrayList18.add(a46);
                        arrayList18.add(c2815Tj7);
                        C3266gN a47 = C3266gN.a(new C3979tk(new C3588mN(arrayList18, arrayList19), 5));
                        C2815Tj c2815Tj8 = new C2815Tj(C3266gN.a(new C2911Zh(a31, 19)), 9);
                        C3266gN a48 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 15));
                        ArrayList arrayList20 = new ArrayList(2);
                        ArrayList arrayList21 = new ArrayList(1);
                        arrayList21.add(c3224fi2.f31137Y0);
                        arrayList20.add(c2815Tj8);
                        arrayList20.add(a48);
                        C3266gN a49 = C3266gN.a(new C3979tk(new C3588mN(arrayList20, arrayList21), 9));
                        List list = Collections.EMPTY_LIST;
                        new ArrayList(1).add(c3224fi2.f31139Z0);
                        C3266gN a50 = C3266gN.a(new C2815Tj(a32, 12));
                        ArrayList arrayList222 = new ArrayList(1);
                        List list2 = Collections.EMPTY_LIST;
                        arrayList222.add(a50);
                        C3266gN a51 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 12));
                        C2815Tj c2815Tj9 = new C2815Tj(a30, 3);
                        ArrayList arrayList23 = new ArrayList(2);
                        new ArrayList(1).add(c3224fi2.f31142a1);
                        arrayList23.add(a51);
                        arrayList23.add(c2815Tj9);
                        C3266gN a52 = C3266gN.a(new C2815Tj(a32, 8));
                        ArrayList arrayList24 = new ArrayList(1);
                        List list3 = Collections.EMPTY_LIST;
                        arrayList24.add(a52);
                        C2696Mj c2696Mj4 = new C2696Mj(c3504ku3, 1);
                        C4248yj c4248yj = new C4248yj(c2696Mj, c2696Mj4, c3224fi2.f31091A, c2696Mj3, c3224fi2.f31155f);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList26.add(c3224fi2.f31148c1);
                        arrayList25.add(c3224fi2.f31151d1);
                        C2747Pj c2747Pj = new C2747Pj(c2696Mj2, c2696Mj, a19, a47, c3224fi2.f31145b1, c4248yj, a20, new C3979tk(new C3588mN(arrayList25, arrayList26), 6), a43, a29, c3332hi.f31670t0);
                        C3389im c3389im2 = new C3389im(c2590Gf6, 1);
                        C3266gN a53 = C3266gN.a(new C2631Im(c3389im2, c3332hi.f31643f));
                        C3266gN a54 = C3266gN.a(new C2830Uh(a15, a11, 6));
                        List list4 = Collections.EMPTY_LIST;
                        ArrayList arrayList27 = new ArrayList(2);
                        arrayList27.add(c3224fi2.f31154e1);
                        arrayList27.add(a54);
                        C3588mN c3588mN = new C3588mN(list4, arrayList27);
                        C3266gN c3266gN5 = c3224fi2.f31191x;
                        C3266gN a55 = C3266gN.a(new C2556Ef(c3266gN5, c3588mN, c2696Mj, 8));
                        C3266gN a56 = C3266gN.a(new C3389im(c2590Gf6, 2));
                        C3266gN a57 = C3266gN.a(new C3389im(c2590Gf6, 3));
                        C3121dm c3121dm = c3224fi2.m0;
                        C3266gN c3266gN6 = c3332hi.f31614N;
                        C3010bi c3010bi3 = c3332hi.i;
                        C3818qk c3818qk = c3224fi2.f31149d;
                        C3266gN c3266gN7 = c3332hi.f31643f;
                        C2783Rl c2783Rl4 = new C2783Rl(C3266gN.a(new C3336hm(c3266gN5, c3121dm, c3389im, c3389im2, c4031ui, c3266gN6, a42, a36, a45, c2696Mj, c3010bi3, c3818qk, a15, a53, c3266gN7, a55, c3332hi.f31622R, c3224fi2.f31152e, c3332hi.f31624S, a23, c3332hi.f31623R0, a28, a56, a57, a29)), 12);
                        C3266gN a58 = C3266gN.a(new C3442jm(c3010bi3, 0));
                        C3266gN c3266gN8 = c3332hi.f31637c;
                        C3266gN a59 = C3266gN.a(new C4293za(a58, c3266gN8, c3266gN5, c3266gN7, 1));
                        C3266gN c3266gN9 = c3224fi2.f31186u0;
                        C2956ai c2956ai = new C2956ai(c3266gN9, c3389im2, a59, c2783Rl4);
                        C2631Im c2631Im = new C2631Im(c3266gN9, c3389im2);
                        C3266gN a60 = C3266gN.a(new C4031ui(15, new C3604mm(c4031ui, 0)));
                        C2563Em c2563Em = new C2563Em(c3332hi.J, c3818qk, c2783Rl, c4031ui, c2956ai, c2631Im, c3266gN8, a60);
                        Yr yr = new Yr();
                        C3266gN a61 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 1));
                        C3266gN a62 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 0));
                        C3266gN a63 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2696Mj4, (InterfaceC3320hN) yr, (InterfaceC3320hN) c4031ui, c3332hi.f31659o, 8));
                        C3266gN a64 = C3266gN.a(new C2709Nf(yr, c4031ui, 17));
                        C3010bi c3010bi4 = c3332hi.f31645g;
                        C3266gN a65 = C3266gN.a(new C2956ai(c3010bi4, c4031ui, c2563Em, yr, 7));
                        Yr.a(yr, C3266gN.a(new C3927sm(c2747Pj, c3266gN8, c4031ui, c2783Rl4, c2563Em, c2783Rl, c3121dm, a61, a62, a63, a64, a65, new C3870rj(c3010bi4, c3818qk, 2), c3266gN6, c3010bi3, c3010bi4, a60, a27, c3332hi.f31625S0)));
                        C3266gN c3266gN10 = c3224fi2.f31157f1;
                        C3266gN c3266gN11 = c3224fi2.f31136X0;
                        C3266gN a66 = C3266gN.a(new C2563Em(a36, a31, c3266gN10, a49, c3266gN11, c2696Mj, c2696Mj3, a24, 1));
                        C3266gN a67 = C3266gN.a(new C3011bj(c3332hi.f31637c, a59, C3266gN.a(new C2630Il(c3224fi2.f31191x, c2696Mj, 1)), a24, a29, 1));
                        C3266gN a68 = C3266gN.a(new C3601mj(a36, a31, c3266gN10, a49, c3266gN11, a45, c3332hi.f31659o, c3332hi.f31622R, c3332hi.f31618P, a24, 2));
                        if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                            C4906k.f40186C.f40198k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            c2720Nq = c2720Nq2;
                            C3069co c3069co4 = c2720Nq.f27336f;
                            c3069co4.c("rendering-ad-component-creation-end", currentTimeMillis);
                            c3069co4.c("rendering-configure-webview-start", currentTimeMillis);
                        } else {
                            c2720Nq = c2720Nq2;
                        }
                        C2495Am c2495Am = (C2495Am) c3224fi2.f31140a.f30365u;
                        AbstractC3364iD.j(c2495Am);
                        AbstractC3364iD.j(c4089vm);
                        AbstractC3364iD.j(c4036un);
                        C2791Sc c2791Sc = new C2791Sc(c2495Am, c4089vm, c4036un, C3266gN.b(a65));
                        if (((InterfaceC2603Hb) c2791Sc.f28281u) != null) {
                            ((C4036un) c2791Sc.f28282v).b("/nativeAdCustomClick", c2791Sc);
                        }
                        C3928sn c3928sn = (C3928sn) a66.f();
                        C2595Gk c2595Gk = c3928sn.f34922b;
                        C3821qn c3821qn = c4036un.f35339a;
                        Objects.requireNonNull(c2595Gk);
                        C3874rn c3874rn = new C3874rn(0, c2595Gk);
                        C3925sk c3925sk = c3928sn.f34921a;
                        C2714Nk c2714Nk = c3928sn.f34923c;
                        C2782Rk c2782Rk = c3928sn.f34924d;
                        C3388il c3388il = c3928sn.f34925e;
                        synchronized (c3821qn) {
                            c3821qn.f34178n = c3925sk;
                            c3821qn.f34179u = c2714Nk;
                            c3821qn.f34180v = c2782Rk;
                            c3821qn.f34181w = c3388il;
                            c3821qn.f34182x = c3874rn;
                        }
                        St st3 = c3928sn.f34926f;
                        Ut ut4 = c3928sn.f34927g;
                        C2712Ni c2712Ni = c3928sn.f34928h;
                        synchronized (c4036un) {
                            C3955tD c3955tD = c4036un.f35351n;
                            if (c3955tD != null) {
                                C2590Gf c2590Gf7 = new C2590Gf(c4036un, st3, ut4, c2712Ni);
                                c3955tD.a(new LD(0, c3955tD, c2590Gf7), c4036un.f35343e);
                            }
                        }
                        final C3337hn c3337hn = (C3337hn) a67.f();
                        InterfaceC4084vh h3 = c4089vm.h();
                        c3337hn.getClass();
                        if (h3 != null) {
                            View V8 = h3.V();
                            C2545Dl c2545Dl = c3337hn.f31715c;
                            c2545Dl.R1(V8);
                            C3229fn c3229fn = new C3229fn(h3, 1);
                            Executor executor2 = c3337hn.f31713a;
                            c2545Dl.I1(c3229fn, executor2);
                            c2545Dl.I1(new C3229fn(h3, 0), executor2);
                            C3118dj c3118dj = c3337hn.f31714b;
                            c2545Dl.I1(c3118dj, executor2);
                            c3118dj.f30596n = h3;
                            C2677Lh h02 = h3.h0();
                            if (!((Boolean) rVar3.f40509c.a(AbstractC3592ma.Ab)).booleanValue() || h02 == null) {
                                i12 = 0;
                            } else {
                                h02.c("/click");
                                InterfaceC2579Fl interfaceC2579Fl = h02.f26928D;
                                C2950ac c2950ac = AbstractC3218fc.f31040a;
                                C2712Ni c2712Ni2 = c3337hn.f31716d;
                                i12 = 0;
                                h02.b("/click", new C3111dc(0, interfaceC2579Fl, c2712Ni2));
                                h02.y(c2712Ni2, null, null);
                            }
                            h3.Z0("/trackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                                @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                                public final void e(Object obj, Map map) {
                                    switch (i12) {
                                        case 0:
                                            C3118dj c3118dj2 = c3337hn.f31714b;
                                            c3118dj2.f30600x = true;
                                            c3118dj2.a();
                                            break;
                                        default:
                                            c3337hn.f31714b.f30600x = false;
                                            break;
                                    }
                                }
                            });
                            final int i16 = 1;
                            h3.Z0("/untrackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                                @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                                public final void e(Object obj, Map map) {
                                    switch (i16) {
                                        case 0:
                                            C3118dj c3118dj2 = c3337hn.f31714b;
                                            c3118dj2.f30600x = true;
                                            c3118dj2.a();
                                            break;
                                        default:
                                            c3337hn.f31714b.f30600x = false;
                                            break;
                                    }
                                }
                            });
                            h3.h0().f26943T = c3337hn.f31717e;
                        }
                        C4198xn c4198xn = (C4198xn) a68.f();
                        C4252yn c4252yn = c2720Nq.f27335e;
                        InterfaceC4084vh i17 = c4089vm.i();
                        c4198xn.getClass();
                        C4090vn c4090vn = c4252yn.f36008a;
                        C2595Gk c2595Gk2 = c4198xn.f35831b;
                        Objects.requireNonNull(c2595Gk2);
                        C3874rn c3874rn2 = new C3874rn(1, c2595Gk2);
                        C3925sk c3925sk2 = c4198xn.f35830a;
                        C2714Nk c2714Nk2 = c4198xn.f35832c;
                        C2782Rk c2782Rk2 = c4198xn.f35833d;
                        C3388il c3388il2 = c4198xn.f35834e;
                        C2562El c2562El = c4198xn.f35835f;
                        synchronized (c4090vn) {
                            synchronized (c4090vn) {
                                c4090vn.f34178n = c3925sk2;
                                c4090vn.f34179u = c2714Nk2;
                                c4090vn.f34180v = c2782Rk2;
                                c4090vn.f34181w = c3388il2;
                                c4090vn.f34182x = c3874rn2;
                            }
                            if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue() && i17 != null && i17.h0() != null) {
                                C2677Lh h032 = i17.h0();
                                C2712Ni c2712Ni32 = c4198xn.f35838j;
                                C2821Tp c2821Tp2 = c4198xn.i;
                                h032.x(c2712Ni32, c2821Tp2, c4198xn.f35837h);
                                h032.y(c2712Ni32, c2821Tp2, c4198xn.f35836g);
                            }
                            if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                                com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq.f27336f, "rendering-configure-webview-end");
                            }
                            return (C3873rm) yr.f();
                        }
                        c4090vn.f35509y = c2562El;
                        if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue()) {
                            C2677Lh h0322 = i17.h0();
                            C2712Ni c2712Ni322 = c4198xn.f35838j;
                            C2821Tp c2821Tp22 = c4198xn.i;
                            h0322.x(c2712Ni322, c2821Tp22, c4198xn.f35837h);
                            h0322.y(c2712Ni322, c2821Tp22, c4198xn.f35836g);
                        }
                        if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                        }
                        return (C3873rm) yr.f();
                    }
                };
                FD fd22 = new FD(o42, true, false);
                fd22.f25513I = new ED(fd22, callable22, this.f27332b);
                fd22.w();
                return fd22;
            }
            aVar4 = b11;
            aVar5 = aVar8;
            aVar6 = aVar3;
            Ut ut4 = ut2;
            aVar7 = b12;
            d9 = c3122dn.d(optJSONObject2, st, ut4, c4896a2, c4244yf2);
            C4896a c4896a7 = c4896a2;
            c3122dn2 = c3122dn;
            c4896a3 = c4896a7;
            c4244yf3 = c4244yf2;
            r12.B(58, d9);
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Ce)).booleanValue()) {
                optJSONObject3 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f9230a);
                if (optJSONObject3.has("flags")) {
                    i6 = 0;
                    while (true) {
                        if (i6 >= optJSONArray2.length()) {
                        }
                        i6++;
                        c3069co = c3069co;
                    }
                }
            }
            c3069co2 = c3069co;
            nd = QC.c(new Bundle());
            ND nd62 = nd;
            C3504ku c3504ku22 = (C3504ku) r12.f25832w;
            optJSONArray = jSONObject2.optJSONArray("custom_assets");
            if (optJSONArray == null) {
            }
            r12.B(63, u6);
            if (jSONObject2.optBoolean("enable_omid")) {
            }
            c3901sD = c3901sD2;
            r12.B(65, c3901sD);
            ArrayList arrayList222 = new ArrayList();
            final P3.a aVar922 = aVar2;
            arrayList222.add(aVar922);
            final P3.a aVar1022 = aVar;
            arrayList222.add(aVar1022);
            final P3.a aVar1122 = aVar6;
            arrayList222.add(aVar1122);
            final P3.a aVar1222 = aVar4;
            arrayList222.add(aVar1222);
            final P3.a aVar1322 = aVar7;
            arrayList222.add(aVar1322);
            final P3.a aVar1422 = aVar5;
            arrayList222.add(aVar1422);
            arrayList222.add(d9);
            final P3.a nd722 = nd2;
            arrayList222.add(nd722);
            arrayList222.add(u6);
            final C4896a c4896a622 = c4896a3;
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue()) {
            }
            arrayList222.add(c3901sD);
            RB n922 = RB.n(arrayList222);
            final JSONObject jSONObject322 = jSONObject2;
            final C4244yf c4244yf622 = c4244yf3;
            final P3.a aVar1522 = d9;
            final C2590Gf c2590Gf522 = r12;
            Callable callable32 = new Callable() { // from class: com.google.android.gms.internal.ads.Xm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List list;
                    JSONObject optJSONObject10;
                    C2590Gf c2590Gf6 = C2590Gf.this;
                    P3.a aVar16 = aVar922;
                    P3.a aVar17 = aVar1022;
                    P3.a aVar18 = aVar1322;
                    P3.a aVar19 = aVar1222;
                    P3.a aVar20 = aVar1422;
                    JSONObject jSONObject4 = jSONObject322;
                    P3.a aVar21 = aVar1522;
                    P3.a aVar22 = nd722;
                    P3.a aVar23 = aVar1122;
                    P3.a aVar24 = c3901sD;
                    P3.a aVar25 = u6;
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
                        com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, (C3069co) c2590Gf6.f25833x, "rendering-native-assets-loading-end");
                    }
                    C4089vm c4089vm = (C4089vm) aVar16.get();
                    List list2 = (List) aVar17.get();
                    synchronized (c4089vm) {
                        c4089vm.f35489e = list2;
                    }
                    InterfaceC3862rb interfaceC3862rb = (InterfaceC3862rb) aVar18.get();
                    synchronized (c4089vm) {
                        c4089vm.f35502s = interfaceC3862rb;
                    }
                    InterfaceC3862rb interfaceC3862rb2 = (InterfaceC3862rb) aVar19.get();
                    synchronized (c4089vm) {
                        c4089vm.f35503t = interfaceC3862rb2;
                    }
                    InterfaceC3647nb interfaceC3647nb = (InterfaceC3647nb) aVar20.get();
                    synchronized (c4089vm) {
                        c4089vm.f35487c = interfaceC3647nb;
                    }
                    JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                    if (optJSONObject11 == null) {
                        PB pb = RB.f27933u;
                        list = C3523lC.f32525x;
                    } else {
                        JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                        if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                            PB pb2 = RB.f27933u;
                            list = C3523lC.f32525x;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i12 = 0; i12 < optJSONArray6.length(); i12++) {
                                s2.L0 f2 = C3122dn.f(optJSONArray6.optJSONObject(i12));
                                if (f2 != null) {
                                    arrayList3.add(f2);
                                }
                            }
                            list = RB.n(arrayList3);
                        }
                    }
                    synchronized (c4089vm) {
                        c4089vm.f35490f = list;
                    }
                    JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                    s2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3122dn.f(optJSONObject10);
                    synchronized (c4089vm) {
                        c4089vm.f35491g = f9;
                    }
                    InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) aVar21.get();
                    if (interfaceC4084vh != null) {
                        synchronized (c4089vm) {
                            c4089vm.i = interfaceC4084vh;
                        }
                        View V8 = interfaceC4084vh.V();
                        synchronized (c4089vm) {
                            c4089vm.f35498o = V8;
                        }
                        BinderC2626Ih g9 = interfaceC4084vh.g();
                        synchronized (c4089vm) {
                            c4089vm.f35486b = g9;
                        }
                    }
                    c4089vm.d().putAll((Bundle) aVar22.get());
                    InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) aVar23.get();
                    if (interfaceC4084vh2 != null) {
                        synchronized (c4089vm) {
                            c4089vm.f35493j = interfaceC4084vh2;
                        }
                        View V9 = interfaceC4084vh2.V();
                        synchronized (c4089vm) {
                            c4089vm.f35499p = V9;
                        }
                    }
                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                        InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) aVar24.get();
                        if (interfaceC4084vh3 != null) {
                            synchronized (c4089vm) {
                                c4089vm.f35494k = interfaceC4084vh3;
                            }
                        }
                    } else {
                        synchronized (c4089vm) {
                            c4089vm.f35496m = aVar24;
                        }
                        C3490kg c3490kg2 = new C3490kg();
                        synchronized (c4089vm) {
                            c4089vm.f35497n = c3490kg2;
                        }
                    }
                    for (C3175en c3175en : (List) aVar25.get()) {
                        if (c3175en.f30761a != 1) {
                            String str3 = c3175en.f30762b;
                            BinderC3379ib binderC3379ib = c3175en.f30764d;
                            synchronized (c4089vm) {
                                if (binderC3379ib == null) {
                                    c4089vm.f35505v.remove(str3);
                                } else {
                                    c4089vm.f35505v.put(str3, binderC3379ib);
                                }
                            }
                        } else {
                            c4089vm.o(c3175en.f30762b, c3175en.f30763c);
                        }
                    }
                    return c4089vm;
                }
            };
            final FD fd32 = new FD(n922, false, false);
            fd32.f25513I = new ED(fd32, callable32, c3383ig);
            fd32.w();
            C3523lC o422 = RB.o(new P3.a[]{b9, fd32});
            Callable callable222 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
                /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    C2720Nq c2720Nq;
                    final int i12;
                    int i13 = 0;
                    C2720Nq c2720Nq2 = C2720Nq.this;
                    FD fd222 = fd32;
                    P3.a aVar16 = b9;
                    Yt yt2 = yt;
                    St st2 = st;
                    JSONObject jSONObject4 = jSONObject;
                    C4896a c4896a72 = c4896a622;
                    C4244yf c4244yf7 = c4244yf622;
                    c2720Nq2.getClass();
                    C4089vm c4089vm = (C4089vm) fd222.get();
                    C4036un c4036un = (C4036un) aVar16.get();
                    C3324ha c3324ha4 = AbstractC3592ma.f32852M2;
                    s2.r rVar3 = s2.r.f40506e;
                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                        com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq2.f27336f, "rendering-webview-creation-end");
                    }
                    C3224fi c3224fi = c2720Nq2.f27331a;
                    C3504ku c3504ku3 = new C3504ku(yt2, st2, (String) null);
                    C3680o7 c3680o7 = new C3680o7(19, c4089vm);
                    C2590Gf c2590Gf6 = new C2590Gf(jSONObject4, c4036un, c4896a72, c4244yf7, 12);
                    C3332hi c3332hi = c3224fi.f31143b;
                    C3224fi c3224fi2 = c3224fi.f31146c;
                    C3266gN a10 = C3266gN.a(new C2911Zh(c3332hi.f31613M0, 12));
                    C2696Mj c2696Mj = new C2696Mj(c3504ku3, 0);
                    C3389im c3389im = new C3389im(c2590Gf6, i13);
                    C2783Rl c2783Rl = new C2783Rl(C3266gN.a(new C2709Nf(c2696Mj, c3389im, 13)), 11);
                    C3266gN a11 = C3266gN.a(new C4031ui(14, c2783Rl));
                    C3010bi c3010bi = c3332hi.i;
                    C2851Vl c2851Vl = AbstractC2792Sd.f28285B;
                    C3266gN a12 = C3266gN.a(new C2556Ef(c3010bi, a11, c2851Vl, 1));
                    C3266gN a13 = C3266gN.a(new E2.F(c3332hi.f31645g, a12, 4));
                    C3266gN a14 = C3266gN.a(new C2830Uh(a12, a10, 3));
                    C3266gN c3266gN = c3332hi.f31637c;
                    C3266gN c3266gN2 = c3332hi.f31643f;
                    C3266gN a15 = C3266gN.a(new C3011bj(a10, a13, c3266gN, a14, c3266gN2, 0));
                    C3266gN a16 = C3266gN.a(new C2830Uh(a15, a11, 5));
                    C2851Vl c2851Vl2 = new C2851Vl(3);
                    C2696Mj c2696Mj2 = new C2696Mj(c3504ku3, 3);
                    C3266gN a17 = C3266gN.a(new C3119dk(c3224fi2.f31191x, c2696Mj, c2851Vl2, c2696Mj2, c3266gN2, c3332hi.f31659o, c3332hi.f31628U));
                    C3266gN a18 = C3266gN.a(new C2815Tj(a17, 17));
                    int i14 = C3588mN.f32724c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(c3224fi2.f31190w0);
                    arrayList4.add(c3224fi2.f31192x0);
                    arrayList4.add(a16);
                    arrayList3.add(a18);
                    C3266gN a19 = C3266gN.a(new C3979tk(new C3588mN(arrayList3, arrayList4), 3));
                    C3266gN a20 = C3266gN.a(AbstractC2792Sd.f28284A);
                    C3266gN c3266gN3 = c3332hi.f31637c;
                    C3266gN a21 = C3266gN.a(new C2830Uh(a20, c3266gN3, 11));
                    C2696Mj c2696Mj3 = new C2696Mj(c3504ku3, 2);
                    C3010bi c3010bi2 = c3332hi.f31645g;
                    C3266gN a22 = C3266gN.a(new C3063ci(c3010bi2, 16));
                    C3266gN a23 = C3266gN.a(MA.f27054z);
                    C3266gN a24 = C3266gN.a(new C2729Oi(c3010bi2, c3332hi.J, a22, a23, c3332hi.f31607J0, c3332hi.f31639d));
                    C3266gN a25 = C3266gN.a(new C2729Oi(c3332hi.f31622R, c3332hi.f31620Q, c2696Mj, c2696Mj3, a24, c3224fi2.f31152e));
                    C2851Vl c2851Vl3 = new C2851Vl(5);
                    C3266gN a26 = C3266gN.a(new C2830Uh(a20, c3266gN3, 16));
                    C3266gN a27 = C3266gN.a(AbstractC2659Kg.f26716A);
                    C2783Rl c2783Rl2 = new C2783Rl(a27, 14);
                    ArrayList arrayList5 = new ArrayList(2);
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(c3224fi2.C0);
                    arrayList5.add(a26);
                    arrayList5.add(c2783Rl2);
                    C3266gN a28 = C3266gN.a(new C2556Ef(new C3588mN(arrayList5, arrayList6), c2696Mj, c2696Mj2, 7));
                    C3266gN a29 = C3266gN.a(new C4031ui(12, c2696Mj2));
                    C3266gN a30 = C3266gN.a(new C2831Ui(c3332hi.f31645g, c3332hi.f31637c, c3332hi.f31639d, c2696Mj2, c2696Mj, c3224fi2.f31182s0, a25, c2851Vl3, c2851Vl2, c3332hi.f31614N, c3224fi2.f31184t0, c3224fi2.f31152e, c3224fi2.f31094B0, a28, a29, c3224fi2.f31172n0));
                    int i15 = 2;
                    C2815Tj c2815Tj = new C2815Tj(a30, i15);
                    C2815Tj c2815Tj2 = new C2815Tj(C3266gN.a(new C2709Nf(c2696Mj, c3332hi.f31642e0, i15)), 23);
                    ArrayList arrayList7 = new ArrayList(4);
                    ArrayList arrayList8 = new ArrayList(2);
                    arrayList7.add(c3224fi2.f31194y0);
                    arrayList8.add(c3224fi2.f31196z0);
                    arrayList8.add(c3224fi2.f31092A0);
                    arrayList7.add(a21);
                    arrayList7.add(c2815Tj);
                    arrayList7.add(c2815Tj2);
                    C3266gN a31 = C3266gN.a(new C3979tk(new C3588mN(arrayList7, arrayList8), 4));
                    C3266gN a32 = C3266gN.a(new C3119dk(c3332hi.f31645g, c3332hi.f31606I0, c3332hi.f31659o, c2696Mj2, c2696Mj, c3332hi.f31618P, c2851Vl));
                    C3266gN a33 = C3266gN.a(new C2815Tj(a32, 13));
                    C3266gN a34 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 10));
                    C3266gN a35 = C3266gN.a(new C2815Tj(C3266gN.a(new C2849Vj(c3332hi.f31598E0, c3224fi2.f31149d)), 11));
                    C2815Tj c2815Tj3 = new C2815Tj(a30, 1);
                    ArrayList arrayList9 = new ArrayList(5);
                    ArrayList arrayList10 = new ArrayList(3);
                    arrayList9.add(c3224fi2.f31097D0);
                    arrayList9.add(c3224fi2.f31099E0);
                    arrayList10.add(c3224fi2.f31101F0);
                    arrayList10.add(c3224fi2.f31103G0);
                    arrayList9.add(a33);
                    arrayList9.add(a34);
                    arrayList10.add(a35);
                    arrayList9.add(c2815Tj3);
                    C3266gN a36 = C3266gN.a(new C3979tk(new C3588mN(arrayList9, arrayList10), 0));
                    C3266gN a37 = C3266gN.a(new C2830Uh(a15, a11, 4));
                    C3266gN a38 = C3266gN.a(new C2815Tj(a32, 14));
                    C3266gN a39 = C3266gN.a(new C2815Tj(a17, 16));
                    C3266gN c3266gN4 = c3332hi.f31637c;
                    C3266gN a40 = C3266gN.a(new C2830Uh(a20, c3266gN4, 13));
                    C3266gN a41 = C3266gN.a(new C2815Tj(c3224fi2.f31179r, 15));
                    C2911Zh c2911Zh = new C2911Zh(a28, 20);
                    C2815Tj c2815Tj4 = new C2815Tj(a30, 4);
                    C4031ui c4031ui = new C4031ui(16, c3680o7);
                    C2783Rl c2783Rl3 = new C2783Rl(C3266gN.a(new C2556Ef(c4031ui, c2783Rl, c3266gN4, 9)), 13);
                    ArrayList arrayList11 = new ArrayList(9);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(c3224fi2.f31105H0);
                    arrayList11.add(c3224fi2.f31107I0);
                    arrayList12.add(c3224fi2.f31108J0);
                    arrayList12.add(c3224fi2.f31110K0);
                    arrayList12.add(a37);
                    arrayList11.add(a38);
                    arrayList11.add(a39);
                    arrayList11.add(a40);
                    arrayList11.add(a41);
                    arrayList11.add(c2911Zh);
                    arrayList11.add(c2815Tj4);
                    arrayList11.add(c2783Rl3);
                    C3266gN a42 = C3266gN.a(new C3979tk(new C3588mN(arrayList11, arrayList12), 2));
                    C2815Tj c2815Tj5 = new C2815Tj(a30, 7);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(c3224fi2.f31112L0);
                    arrayList13.add(c2815Tj5);
                    C3266gN a43 = C3266gN.a(new C3979tk(new C3588mN(arrayList13, arrayList14), 19));
                    C2815Tj c2815Tj6 = new C2815Tj(C3266gN.a(new C2630Il(c2696Mj, c3332hi.f31622R)), 0);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(c3224fi2.f31114M0);
                    arrayList15.add(c2815Tj6);
                    C3266gN a44 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 17));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(c3224fi2.f31116N0);
                    arrayList16.add(a44);
                    C3266gN a45 = C3266gN.a(new C3979tk(new C3588mN(arrayList16, arrayList17), 20));
                    C3266gN a46 = C3266gN.a(new C2815Tj(a17, 18));
                    C2815Tj c2815Tj7 = new C2815Tj(a30, 5);
                    ArrayList arrayList18 = new ArrayList(7);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(c3224fi2.f31118O0);
                    arrayList19.add(c3224fi2.f31120P0);
                    arrayList18.add(c3224fi2.f31122Q0);
                    arrayList18.add(c3224fi2.f31124R0);
                    arrayList19.add(c3224fi2.f31126S0);
                    arrayList19.add(c3224fi2.f31128T0);
                    arrayList19.add(c3224fi2.f31130U0);
                    arrayList18.add(c3224fi2.f31132V0);
                    arrayList18.add(c3224fi2.f31134W0);
                    arrayList18.add(a46);
                    arrayList18.add(c2815Tj7);
                    C3266gN a47 = C3266gN.a(new C3979tk(new C3588mN(arrayList18, arrayList19), 5));
                    C2815Tj c2815Tj8 = new C2815Tj(C3266gN.a(new C2911Zh(a31, 19)), 9);
                    C3266gN a48 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 15));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(c3224fi2.f31137Y0);
                    arrayList20.add(c2815Tj8);
                    arrayList20.add(a48);
                    C3266gN a49 = C3266gN.a(new C3979tk(new C3588mN(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(c3224fi2.f31139Z0);
                    C3266gN a50 = C3266gN.a(new C2815Tj(a32, 12));
                    ArrayList arrayList2222 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList2222.add(a50);
                    C3266gN a51 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 12));
                    C2815Tj c2815Tj9 = new C2815Tj(a30, 3);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(c3224fi2.f31142a1);
                    arrayList23.add(a51);
                    arrayList23.add(c2815Tj9);
                    C3266gN a52 = C3266gN.a(new C2815Tj(a32, 8));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(a52);
                    C2696Mj c2696Mj4 = new C2696Mj(c3504ku3, 1);
                    C4248yj c4248yj = new C4248yj(c2696Mj, c2696Mj4, c3224fi2.f31091A, c2696Mj3, c3224fi2.f31155f);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(c3224fi2.f31148c1);
                    arrayList25.add(c3224fi2.f31151d1);
                    C2747Pj c2747Pj = new C2747Pj(c2696Mj2, c2696Mj, a19, a47, c3224fi2.f31145b1, c4248yj, a20, new C3979tk(new C3588mN(arrayList25, arrayList26), 6), a43, a29, c3332hi.f31670t0);
                    C3389im c3389im2 = new C3389im(c2590Gf6, 1);
                    C3266gN a53 = C3266gN.a(new C2631Im(c3389im2, c3332hi.f31643f));
                    C3266gN a54 = C3266gN.a(new C2830Uh(a15, a11, 6));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(c3224fi2.f31154e1);
                    arrayList27.add(a54);
                    C3588mN c3588mN = new C3588mN(list4, arrayList27);
                    C3266gN c3266gN5 = c3224fi2.f31191x;
                    C3266gN a55 = C3266gN.a(new C2556Ef(c3266gN5, c3588mN, c2696Mj, 8));
                    C3266gN a56 = C3266gN.a(new C3389im(c2590Gf6, 2));
                    C3266gN a57 = C3266gN.a(new C3389im(c2590Gf6, 3));
                    C3121dm c3121dm = c3224fi2.m0;
                    C3266gN c3266gN6 = c3332hi.f31614N;
                    C3010bi c3010bi3 = c3332hi.i;
                    C3818qk c3818qk = c3224fi2.f31149d;
                    C3266gN c3266gN7 = c3332hi.f31643f;
                    C2783Rl c2783Rl4 = new C2783Rl(C3266gN.a(new C3336hm(c3266gN5, c3121dm, c3389im, c3389im2, c4031ui, c3266gN6, a42, a36, a45, c2696Mj, c3010bi3, c3818qk, a15, a53, c3266gN7, a55, c3332hi.f31622R, c3224fi2.f31152e, c3332hi.f31624S, a23, c3332hi.f31623R0, a28, a56, a57, a29)), 12);
                    C3266gN a58 = C3266gN.a(new C3442jm(c3010bi3, 0));
                    C3266gN c3266gN8 = c3332hi.f31637c;
                    C3266gN a59 = C3266gN.a(new C4293za(a58, c3266gN8, c3266gN5, c3266gN7, 1));
                    C3266gN c3266gN9 = c3224fi2.f31186u0;
                    C2956ai c2956ai = new C2956ai(c3266gN9, c3389im2, a59, c2783Rl4);
                    C2631Im c2631Im = new C2631Im(c3266gN9, c3389im2);
                    C3266gN a60 = C3266gN.a(new C4031ui(15, new C3604mm(c4031ui, 0)));
                    C2563Em c2563Em = new C2563Em(c3332hi.J, c3818qk, c2783Rl, c4031ui, c2956ai, c2631Im, c3266gN8, a60);
                    Yr yr = new Yr();
                    C3266gN a61 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 1));
                    C3266gN a62 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 0));
                    C3266gN a63 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2696Mj4, (InterfaceC3320hN) yr, (InterfaceC3320hN) c4031ui, c3332hi.f31659o, 8));
                    C3266gN a64 = C3266gN.a(new C2709Nf(yr, c4031ui, 17));
                    C3010bi c3010bi4 = c3332hi.f31645g;
                    C3266gN a65 = C3266gN.a(new C2956ai(c3010bi4, c4031ui, c2563Em, yr, 7));
                    Yr.a(yr, C3266gN.a(new C3927sm(c2747Pj, c3266gN8, c4031ui, c2783Rl4, c2563Em, c2783Rl, c3121dm, a61, a62, a63, a64, a65, new C3870rj(c3010bi4, c3818qk, 2), c3266gN6, c3010bi3, c3010bi4, a60, a27, c3332hi.f31625S0)));
                    C3266gN c3266gN10 = c3224fi2.f31157f1;
                    C3266gN c3266gN11 = c3224fi2.f31136X0;
                    C3266gN a66 = C3266gN.a(new C2563Em(a36, a31, c3266gN10, a49, c3266gN11, c2696Mj, c2696Mj3, a24, 1));
                    C3266gN a67 = C3266gN.a(new C3011bj(c3332hi.f31637c, a59, C3266gN.a(new C2630Il(c3224fi2.f31191x, c2696Mj, 1)), a24, a29, 1));
                    C3266gN a68 = C3266gN.a(new C3601mj(a36, a31, c3266gN10, a49, c3266gN11, a45, c3332hi.f31659o, c3332hi.f31622R, c3332hi.f31618P, a24, 2));
                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                        C4906k.f40186C.f40198k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        c2720Nq = c2720Nq2;
                        C3069co c3069co4 = c2720Nq.f27336f;
                        c3069co4.c("rendering-ad-component-creation-end", currentTimeMillis);
                        c3069co4.c("rendering-configure-webview-start", currentTimeMillis);
                    } else {
                        c2720Nq = c2720Nq2;
                    }
                    C2495Am c2495Am = (C2495Am) c3224fi2.f31140a.f30365u;
                    AbstractC3364iD.j(c2495Am);
                    AbstractC3364iD.j(c4089vm);
                    AbstractC3364iD.j(c4036un);
                    C2791Sc c2791Sc = new C2791Sc(c2495Am, c4089vm, c4036un, C3266gN.b(a65));
                    if (((InterfaceC2603Hb) c2791Sc.f28281u) != null) {
                        ((C4036un) c2791Sc.f28282v).b("/nativeAdCustomClick", c2791Sc);
                    }
                    C3928sn c3928sn = (C3928sn) a66.f();
                    C2595Gk c2595Gk = c3928sn.f34922b;
                    C3821qn c3821qn = c4036un.f35339a;
                    Objects.requireNonNull(c2595Gk);
                    C3874rn c3874rn = new C3874rn(0, c2595Gk);
                    C3925sk c3925sk = c3928sn.f34921a;
                    C2714Nk c2714Nk = c3928sn.f34923c;
                    C2782Rk c2782Rk = c3928sn.f34924d;
                    C3388il c3388il = c3928sn.f34925e;
                    synchronized (c3821qn) {
                        c3821qn.f34178n = c3925sk;
                        c3821qn.f34179u = c2714Nk;
                        c3821qn.f34180v = c2782Rk;
                        c3821qn.f34181w = c3388il;
                        c3821qn.f34182x = c3874rn;
                    }
                    St st3 = c3928sn.f34926f;
                    Ut ut42 = c3928sn.f34927g;
                    C2712Ni c2712Ni = c3928sn.f34928h;
                    synchronized (c4036un) {
                        C3955tD c3955tD = c4036un.f35351n;
                        if (c3955tD != null) {
                            C2590Gf c2590Gf7 = new C2590Gf(c4036un, st3, ut42, c2712Ni);
                            c3955tD.a(new LD(0, c3955tD, c2590Gf7), c4036un.f35343e);
                        }
                    }
                    final C3337hn c3337hn = (C3337hn) a67.f();
                    InterfaceC4084vh h3 = c4089vm.h();
                    c3337hn.getClass();
                    if (h3 != null) {
                        View V8 = h3.V();
                        C2545Dl c2545Dl = c3337hn.f31715c;
                        c2545Dl.R1(V8);
                        C3229fn c3229fn = new C3229fn(h3, 1);
                        Executor executor2 = c3337hn.f31713a;
                        c2545Dl.I1(c3229fn, executor2);
                        c2545Dl.I1(new C3229fn(h3, 0), executor2);
                        C3118dj c3118dj = c3337hn.f31714b;
                        c2545Dl.I1(c3118dj, executor2);
                        c3118dj.f30596n = h3;
                        C2677Lh h02 = h3.h0();
                        if (!((Boolean) rVar3.f40509c.a(AbstractC3592ma.Ab)).booleanValue() || h02 == null) {
                            i12 = 0;
                        } else {
                            h02.c("/click");
                            InterfaceC2579Fl interfaceC2579Fl = h02.f26928D;
                            C2950ac c2950ac = AbstractC3218fc.f31040a;
                            C2712Ni c2712Ni2 = c3337hn.f31716d;
                            i12 = 0;
                            h02.b("/click", new C3111dc(0, interfaceC2579Fl, c2712Ni2));
                            h02.y(c2712Ni2, null, null);
                        }
                        h3.Z0("/trackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                            public final void e(Object obj, Map map) {
                                switch (i12) {
                                    case 0:
                                        C3118dj c3118dj2 = c3337hn.f31714b;
                                        c3118dj2.f30600x = true;
                                        c3118dj2.a();
                                        break;
                                    default:
                                        c3337hn.f31714b.f30600x = false;
                                        break;
                                }
                            }
                        });
                        final int i16 = 1;
                        h3.Z0("/untrackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                            @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                            public final void e(Object obj, Map map) {
                                switch (i16) {
                                    case 0:
                                        C3118dj c3118dj2 = c3337hn.f31714b;
                                        c3118dj2.f30600x = true;
                                        c3118dj2.a();
                                        break;
                                    default:
                                        c3337hn.f31714b.f30600x = false;
                                        break;
                                }
                            }
                        });
                        h3.h0().f26943T = c3337hn.f31717e;
                    }
                    C4198xn c4198xn = (C4198xn) a68.f();
                    C4252yn c4252yn = c2720Nq.f27335e;
                    InterfaceC4084vh i17 = c4089vm.i();
                    c4198xn.getClass();
                    C4090vn c4090vn = c4252yn.f36008a;
                    C2595Gk c2595Gk2 = c4198xn.f35831b;
                    Objects.requireNonNull(c2595Gk2);
                    C3874rn c3874rn2 = new C3874rn(1, c2595Gk2);
                    C3925sk c3925sk2 = c4198xn.f35830a;
                    C2714Nk c2714Nk2 = c4198xn.f35832c;
                    C2782Rk c2782Rk2 = c4198xn.f35833d;
                    C3388il c3388il2 = c4198xn.f35834e;
                    C2562El c2562El = c4198xn.f35835f;
                    synchronized (c4090vn) {
                        synchronized (c4090vn) {
                            c4090vn.f34178n = c3925sk2;
                            c4090vn.f34179u = c2714Nk2;
                            c4090vn.f34180v = c2782Rk2;
                            c4090vn.f34181w = c3388il2;
                            c4090vn.f34182x = c3874rn2;
                        }
                        if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue() && i17 != null && i17.h0() != null) {
                            C2677Lh h0322 = i17.h0();
                            C2712Ni c2712Ni322 = c4198xn.f35838j;
                            C2821Tp c2821Tp22 = c4198xn.i;
                            h0322.x(c2712Ni322, c2821Tp22, c4198xn.f35837h);
                            h0322.y(c2712Ni322, c2821Tp22, c4198xn.f35836g);
                        }
                        if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                            com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq.f27336f, "rendering-configure-webview-end");
                        }
                        return (C3873rm) yr.f();
                    }
                    c4090vn.f35509y = c2562El;
                    if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue()) {
                        C2677Lh h03222 = i17.h0();
                        C2712Ni c2712Ni3222 = c4198xn.f35838j;
                        C2821Tp c2821Tp222 = c4198xn.i;
                        h03222.x(c2712Ni3222, c2821Tp222, c4198xn.f35837h);
                        h03222.y(c2712Ni3222, c2821Tp222, c4198xn.f35836g);
                    }
                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                    }
                    return (C3873rm) yr.f();
                }
            };
            FD fd222 = new FD(o422, true, false);
            fd222.f25513I = new ED(fd222, callable222, this.f27332b);
            fd222.w();
            return fd222;
        }
        aVar3 = ND.f27257u;
        jSONObject2 = jSONObject;
        r12 = c2590Gf2;
        c3383ig = c3383ig2;
        c3122dn = c3122dn3;
        str = "images";
        c4896a2 = c4896a4;
        c4244yf2 = c4244yf;
        ut = ut3;
        c3069co = c3069co3;
        str2 = com.onesignal.inAppMessages.internal.d.HTML;
        c3485kb = c3485kb2;
        aVar = a9;
        rd = rd3;
        aVar2 = b10;
        r12.B(50, aVar3);
        P3.a b112 = c3122dn.b(jSONObject2.optJSONObject("secondary_image"), c3485kb.f32249u, 51);
        r12.B(52, b112);
        P3.a b122 = c3122dn.b(jSONObject2.optJSONObject("app_icon"), c3485kb.f32249u, 53);
        r12.B(54, b122);
        optJSONObject = jSONObject2.optJSONObject("attribution");
        if (optJSONObject != null) {
        }
        P3.a aVar82 = e9;
        r12.B(56, aVar82);
        String[] strArr2 = {"html_containers", "instream"};
        JSONObject z92 = d6.c.z(jSONObject2, strArr2);
        if (z92 != null) {
        }
        if (optJSONObject2 != null) {
        }
        C4896a c4896a72 = c4896a2;
        c3122dn2 = c3122dn;
        c4896a3 = c4896a72;
        c4244yf3 = c4244yf2;
        r12.B(58, d9);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Ce)).booleanValue()) {
        }
        c3069co2 = c3069co;
        nd = QC.c(new Bundle());
        ND nd622 = nd;
        C3504ku c3504ku222 = (C3504ku) r12.f25832w;
        optJSONArray = jSONObject2.optJSONArray("custom_assets");
        if (optJSONArray == null) {
        }
        r12.B(63, u6);
        if (jSONObject2.optBoolean("enable_omid")) {
        }
        c3901sD = c3901sD2;
        r12.B(65, c3901sD);
        ArrayList arrayList2222 = new ArrayList();
        final P3.a aVar9222 = aVar2;
        arrayList2222.add(aVar9222);
        final P3.a aVar10222 = aVar;
        arrayList2222.add(aVar10222);
        final P3.a aVar11222 = aVar6;
        arrayList2222.add(aVar11222);
        final P3.a aVar12222 = aVar4;
        arrayList2222.add(aVar12222);
        final P3.a aVar13222 = aVar7;
        arrayList2222.add(aVar13222);
        final P3.a aVar14222 = aVar5;
        arrayList2222.add(aVar14222);
        arrayList2222.add(d9);
        final P3.a nd7222 = nd2;
        arrayList2222.add(nd7222);
        arrayList2222.add(u6);
        final C4896a c4896a6222 = c4896a3;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue()) {
        }
        arrayList2222.add(c3901sD);
        RB n9222 = RB.n(arrayList2222);
        final JSONObject jSONObject3222 = jSONObject2;
        final C4244yf c4244yf6222 = c4244yf3;
        final P3.a aVar15222 = d9;
        final C2590Gf c2590Gf5222 = r12;
        Callable callable322 = new Callable() { // from class: com.google.android.gms.internal.ads.Xm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                JSONObject optJSONObject10;
                C2590Gf c2590Gf6 = C2590Gf.this;
                P3.a aVar16 = aVar9222;
                P3.a aVar17 = aVar10222;
                P3.a aVar18 = aVar13222;
                P3.a aVar19 = aVar12222;
                P3.a aVar20 = aVar14222;
                JSONObject jSONObject4 = jSONObject3222;
                P3.a aVar21 = aVar15222;
                P3.a aVar22 = nd7222;
                P3.a aVar23 = aVar11222;
                P3.a aVar24 = c3901sD;
                P3.a aVar25 = u6;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
                    com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, (C3069co) c2590Gf6.f25833x, "rendering-native-assets-loading-end");
                }
                C4089vm c4089vm = (C4089vm) aVar16.get();
                List list2 = (List) aVar17.get();
                synchronized (c4089vm) {
                    c4089vm.f35489e = list2;
                }
                InterfaceC3862rb interfaceC3862rb = (InterfaceC3862rb) aVar18.get();
                synchronized (c4089vm) {
                    c4089vm.f35502s = interfaceC3862rb;
                }
                InterfaceC3862rb interfaceC3862rb2 = (InterfaceC3862rb) aVar19.get();
                synchronized (c4089vm) {
                    c4089vm.f35503t = interfaceC3862rb2;
                }
                InterfaceC3647nb interfaceC3647nb = (InterfaceC3647nb) aVar20.get();
                synchronized (c4089vm) {
                    c4089vm.f35487c = interfaceC3647nb;
                }
                JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                if (optJSONObject11 == null) {
                    PB pb = RB.f27933u;
                    list = C3523lC.f32525x;
                } else {
                    JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                    if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                        PB pb2 = RB.f27933u;
                        list = C3523lC.f32525x;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i12 = 0; i12 < optJSONArray6.length(); i12++) {
                            s2.L0 f2 = C3122dn.f(optJSONArray6.optJSONObject(i12));
                            if (f2 != null) {
                                arrayList3.add(f2);
                            }
                        }
                        list = RB.n(arrayList3);
                    }
                }
                synchronized (c4089vm) {
                    c4089vm.f35490f = list;
                }
                JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                s2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3122dn.f(optJSONObject10);
                synchronized (c4089vm) {
                    c4089vm.f35491g = f9;
                }
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) aVar21.get();
                if (interfaceC4084vh != null) {
                    synchronized (c4089vm) {
                        c4089vm.i = interfaceC4084vh;
                    }
                    View V8 = interfaceC4084vh.V();
                    synchronized (c4089vm) {
                        c4089vm.f35498o = V8;
                    }
                    BinderC2626Ih g9 = interfaceC4084vh.g();
                    synchronized (c4089vm) {
                        c4089vm.f35486b = g9;
                    }
                }
                c4089vm.d().putAll((Bundle) aVar22.get());
                InterfaceC4084vh interfaceC4084vh2 = (InterfaceC4084vh) aVar23.get();
                if (interfaceC4084vh2 != null) {
                    synchronized (c4089vm) {
                        c4089vm.f35493j = interfaceC4084vh2;
                    }
                    View V9 = interfaceC4084vh2.V();
                    synchronized (c4089vm) {
                        c4089vm.f35499p = V9;
                    }
                }
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                    InterfaceC4084vh interfaceC4084vh3 = (InterfaceC4084vh) aVar24.get();
                    if (interfaceC4084vh3 != null) {
                        synchronized (c4089vm) {
                            c4089vm.f35494k = interfaceC4084vh3;
                        }
                    }
                } else {
                    synchronized (c4089vm) {
                        c4089vm.f35496m = aVar24;
                    }
                    C3490kg c3490kg2 = new C3490kg();
                    synchronized (c4089vm) {
                        c4089vm.f35497n = c3490kg2;
                    }
                }
                for (C3175en c3175en : (List) aVar25.get()) {
                    if (c3175en.f30761a != 1) {
                        String str3 = c3175en.f30762b;
                        BinderC3379ib binderC3379ib = c3175en.f30764d;
                        synchronized (c4089vm) {
                            if (binderC3379ib == null) {
                                c4089vm.f35505v.remove(str3);
                            } else {
                                c4089vm.f35505v.put(str3, binderC3379ib);
                            }
                        }
                    } else {
                        c4089vm.o(c3175en.f30762b, c3175en.f30763c);
                    }
                }
                return c4089vm;
            }
        };
        final FD fd322 = new FD(n9222, false, false);
        fd322.f25513I = new ED(fd322, callable322, c3383ig);
        fd322.w();
        C3523lC o4222 = RB.o(new P3.a[]{b9, fd322});
        Callable callable2222 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
            /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                C2720Nq c2720Nq;
                final int i12;
                int i13 = 0;
                C2720Nq c2720Nq2 = C2720Nq.this;
                FD fd2222 = fd322;
                P3.a aVar16 = b9;
                Yt yt2 = yt;
                St st2 = st;
                JSONObject jSONObject4 = jSONObject;
                C4896a c4896a722 = c4896a6222;
                C4244yf c4244yf7 = c4244yf6222;
                c2720Nq2.getClass();
                C4089vm c4089vm = (C4089vm) fd2222.get();
                C4036un c4036un = (C4036un) aVar16.get();
                C3324ha c3324ha4 = AbstractC3592ma.f32852M2;
                s2.r rVar3 = s2.r.f40506e;
                if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                    com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq2.f27336f, "rendering-webview-creation-end");
                }
                C3224fi c3224fi = c2720Nq2.f27331a;
                C3504ku c3504ku3 = new C3504ku(yt2, st2, (String) null);
                C3680o7 c3680o7 = new C3680o7(19, c4089vm);
                C2590Gf c2590Gf6 = new C2590Gf(jSONObject4, c4036un, c4896a722, c4244yf7, 12);
                C3332hi c3332hi = c3224fi.f31143b;
                C3224fi c3224fi2 = c3224fi.f31146c;
                C3266gN a10 = C3266gN.a(new C2911Zh(c3332hi.f31613M0, 12));
                C2696Mj c2696Mj = new C2696Mj(c3504ku3, 0);
                C3389im c3389im = new C3389im(c2590Gf6, i13);
                C2783Rl c2783Rl = new C2783Rl(C3266gN.a(new C2709Nf(c2696Mj, c3389im, 13)), 11);
                C3266gN a11 = C3266gN.a(new C4031ui(14, c2783Rl));
                C3010bi c3010bi = c3332hi.i;
                C2851Vl c2851Vl = AbstractC2792Sd.f28285B;
                C3266gN a12 = C3266gN.a(new C2556Ef(c3010bi, a11, c2851Vl, 1));
                C3266gN a13 = C3266gN.a(new E2.F(c3332hi.f31645g, a12, 4));
                C3266gN a14 = C3266gN.a(new C2830Uh(a12, a10, 3));
                C3266gN c3266gN = c3332hi.f31637c;
                C3266gN c3266gN2 = c3332hi.f31643f;
                C3266gN a15 = C3266gN.a(new C3011bj(a10, a13, c3266gN, a14, c3266gN2, 0));
                C3266gN a16 = C3266gN.a(new C2830Uh(a15, a11, 5));
                C2851Vl c2851Vl2 = new C2851Vl(3);
                C2696Mj c2696Mj2 = new C2696Mj(c3504ku3, 3);
                C3266gN a17 = C3266gN.a(new C3119dk(c3224fi2.f31191x, c2696Mj, c2851Vl2, c2696Mj2, c3266gN2, c3332hi.f31659o, c3332hi.f31628U));
                C3266gN a18 = C3266gN.a(new C2815Tj(a17, 17));
                int i14 = C3588mN.f32724c;
                ArrayList arrayList3 = new ArrayList(1);
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(c3224fi2.f31190w0);
                arrayList4.add(c3224fi2.f31192x0);
                arrayList4.add(a16);
                arrayList3.add(a18);
                C3266gN a19 = C3266gN.a(new C3979tk(new C3588mN(arrayList3, arrayList4), 3));
                C3266gN a20 = C3266gN.a(AbstractC2792Sd.f28284A);
                C3266gN c3266gN3 = c3332hi.f31637c;
                C3266gN a21 = C3266gN.a(new C2830Uh(a20, c3266gN3, 11));
                C2696Mj c2696Mj3 = new C2696Mj(c3504ku3, 2);
                C3010bi c3010bi2 = c3332hi.f31645g;
                C3266gN a22 = C3266gN.a(new C3063ci(c3010bi2, 16));
                C3266gN a23 = C3266gN.a(MA.f27054z);
                C3266gN a24 = C3266gN.a(new C2729Oi(c3010bi2, c3332hi.J, a22, a23, c3332hi.f31607J0, c3332hi.f31639d));
                C3266gN a25 = C3266gN.a(new C2729Oi(c3332hi.f31622R, c3332hi.f31620Q, c2696Mj, c2696Mj3, a24, c3224fi2.f31152e));
                C2851Vl c2851Vl3 = new C2851Vl(5);
                C3266gN a26 = C3266gN.a(new C2830Uh(a20, c3266gN3, 16));
                C3266gN a27 = C3266gN.a(AbstractC2659Kg.f26716A);
                C2783Rl c2783Rl2 = new C2783Rl(a27, 14);
                ArrayList arrayList5 = new ArrayList(2);
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(c3224fi2.C0);
                arrayList5.add(a26);
                arrayList5.add(c2783Rl2);
                C3266gN a28 = C3266gN.a(new C2556Ef(new C3588mN(arrayList5, arrayList6), c2696Mj, c2696Mj2, 7));
                C3266gN a29 = C3266gN.a(new C4031ui(12, c2696Mj2));
                C3266gN a30 = C3266gN.a(new C2831Ui(c3332hi.f31645g, c3332hi.f31637c, c3332hi.f31639d, c2696Mj2, c2696Mj, c3224fi2.f31182s0, a25, c2851Vl3, c2851Vl2, c3332hi.f31614N, c3224fi2.f31184t0, c3224fi2.f31152e, c3224fi2.f31094B0, a28, a29, c3224fi2.f31172n0));
                int i15 = 2;
                C2815Tj c2815Tj = new C2815Tj(a30, i15);
                C2815Tj c2815Tj2 = new C2815Tj(C3266gN.a(new C2709Nf(c2696Mj, c3332hi.f31642e0, i15)), 23);
                ArrayList arrayList7 = new ArrayList(4);
                ArrayList arrayList8 = new ArrayList(2);
                arrayList7.add(c3224fi2.f31194y0);
                arrayList8.add(c3224fi2.f31196z0);
                arrayList8.add(c3224fi2.f31092A0);
                arrayList7.add(a21);
                arrayList7.add(c2815Tj);
                arrayList7.add(c2815Tj2);
                C3266gN a31 = C3266gN.a(new C3979tk(new C3588mN(arrayList7, arrayList8), 4));
                C3266gN a32 = C3266gN.a(new C3119dk(c3332hi.f31645g, c3332hi.f31606I0, c3332hi.f31659o, c2696Mj2, c2696Mj, c3332hi.f31618P, c2851Vl));
                C3266gN a33 = C3266gN.a(new C2815Tj(a32, 13));
                C3266gN a34 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 10));
                C3266gN a35 = C3266gN.a(new C2815Tj(C3266gN.a(new C2849Vj(c3332hi.f31598E0, c3224fi2.f31149d)), 11));
                C2815Tj c2815Tj3 = new C2815Tj(a30, 1);
                ArrayList arrayList9 = new ArrayList(5);
                ArrayList arrayList10 = new ArrayList(3);
                arrayList9.add(c3224fi2.f31097D0);
                arrayList9.add(c3224fi2.f31099E0);
                arrayList10.add(c3224fi2.f31101F0);
                arrayList10.add(c3224fi2.f31103G0);
                arrayList9.add(a33);
                arrayList9.add(a34);
                arrayList10.add(a35);
                arrayList9.add(c2815Tj3);
                C3266gN a36 = C3266gN.a(new C3979tk(new C3588mN(arrayList9, arrayList10), 0));
                C3266gN a37 = C3266gN.a(new C2830Uh(a15, a11, 4));
                C3266gN a38 = C3266gN.a(new C2815Tj(a32, 14));
                C3266gN a39 = C3266gN.a(new C2815Tj(a17, 16));
                C3266gN c3266gN4 = c3332hi.f31637c;
                C3266gN a40 = C3266gN.a(new C2830Uh(a20, c3266gN4, 13));
                C3266gN a41 = C3266gN.a(new C2815Tj(c3224fi2.f31179r, 15));
                C2911Zh c2911Zh = new C2911Zh(a28, 20);
                C2815Tj c2815Tj4 = new C2815Tj(a30, 4);
                C4031ui c4031ui = new C4031ui(16, c3680o7);
                C2783Rl c2783Rl3 = new C2783Rl(C3266gN.a(new C2556Ef(c4031ui, c2783Rl, c3266gN4, 9)), 13);
                ArrayList arrayList11 = new ArrayList(9);
                ArrayList arrayList12 = new ArrayList(3);
                arrayList11.add(c3224fi2.f31105H0);
                arrayList11.add(c3224fi2.f31107I0);
                arrayList12.add(c3224fi2.f31108J0);
                arrayList12.add(c3224fi2.f31110K0);
                arrayList12.add(a37);
                arrayList11.add(a38);
                arrayList11.add(a39);
                arrayList11.add(a40);
                arrayList11.add(a41);
                arrayList11.add(c2911Zh);
                arrayList11.add(c2815Tj4);
                arrayList11.add(c2783Rl3);
                C3266gN a42 = C3266gN.a(new C3979tk(new C3588mN(arrayList11, arrayList12), 2));
                C2815Tj c2815Tj5 = new C2815Tj(a30, 7);
                ArrayList arrayList13 = new ArrayList(1);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add(c3224fi2.f31112L0);
                arrayList13.add(c2815Tj5);
                C3266gN a43 = C3266gN.a(new C3979tk(new C3588mN(arrayList13, arrayList14), 19));
                C2815Tj c2815Tj6 = new C2815Tj(C3266gN.a(new C2630Il(c2696Mj, c3332hi.f31622R)), 0);
                ArrayList arrayList15 = new ArrayList(1);
                new ArrayList(1).add(c3224fi2.f31114M0);
                arrayList15.add(c2815Tj6);
                C3266gN a44 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 17));
                ArrayList arrayList16 = new ArrayList(1);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add(c3224fi2.f31116N0);
                arrayList16.add(a44);
                C3266gN a45 = C3266gN.a(new C3979tk(new C3588mN(arrayList16, arrayList17), 20));
                C3266gN a46 = C3266gN.a(new C2815Tj(a17, 18));
                C2815Tj c2815Tj7 = new C2815Tj(a30, 5);
                ArrayList arrayList18 = new ArrayList(7);
                ArrayList arrayList19 = new ArrayList(4);
                arrayList18.add(c3224fi2.f31118O0);
                arrayList19.add(c3224fi2.f31120P0);
                arrayList18.add(c3224fi2.f31122Q0);
                arrayList18.add(c3224fi2.f31124R0);
                arrayList19.add(c3224fi2.f31126S0);
                arrayList19.add(c3224fi2.f31128T0);
                arrayList19.add(c3224fi2.f31130U0);
                arrayList18.add(c3224fi2.f31132V0);
                arrayList18.add(c3224fi2.f31134W0);
                arrayList18.add(a46);
                arrayList18.add(c2815Tj7);
                C3266gN a47 = C3266gN.a(new C3979tk(new C3588mN(arrayList18, arrayList19), 5));
                C2815Tj c2815Tj8 = new C2815Tj(C3266gN.a(new C2911Zh(a31, 19)), 9);
                C3266gN a48 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 15));
                ArrayList arrayList20 = new ArrayList(2);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c3224fi2.f31137Y0);
                arrayList20.add(c2815Tj8);
                arrayList20.add(a48);
                C3266gN a49 = C3266gN.a(new C3979tk(new C3588mN(arrayList20, arrayList21), 9));
                List list = Collections.EMPTY_LIST;
                new ArrayList(1).add(c3224fi2.f31139Z0);
                C3266gN a50 = C3266gN.a(new C2815Tj(a32, 12));
                ArrayList arrayList22222 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList22222.add(a50);
                C3266gN a51 = C3266gN.a(new C2830Uh(a20, c3332hi.f31637c, 12));
                C2815Tj c2815Tj9 = new C2815Tj(a30, 3);
                ArrayList arrayList23 = new ArrayList(2);
                new ArrayList(1).add(c3224fi2.f31142a1);
                arrayList23.add(a51);
                arrayList23.add(c2815Tj9);
                C3266gN a52 = C3266gN.a(new C2815Tj(a32, 8));
                ArrayList arrayList24 = new ArrayList(1);
                List list3 = Collections.EMPTY_LIST;
                arrayList24.add(a52);
                C2696Mj c2696Mj4 = new C2696Mj(c3504ku3, 1);
                C4248yj c4248yj = new C4248yj(c2696Mj, c2696Mj4, c3224fi2.f31091A, c2696Mj3, c3224fi2.f31155f);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add(c3224fi2.f31148c1);
                arrayList25.add(c3224fi2.f31151d1);
                C2747Pj c2747Pj = new C2747Pj(c2696Mj2, c2696Mj, a19, a47, c3224fi2.f31145b1, c4248yj, a20, new C3979tk(new C3588mN(arrayList25, arrayList26), 6), a43, a29, c3332hi.f31670t0);
                C3389im c3389im2 = new C3389im(c2590Gf6, 1);
                C3266gN a53 = C3266gN.a(new C2631Im(c3389im2, c3332hi.f31643f));
                C3266gN a54 = C3266gN.a(new C2830Uh(a15, a11, 6));
                List list4 = Collections.EMPTY_LIST;
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add(c3224fi2.f31154e1);
                arrayList27.add(a54);
                C3588mN c3588mN = new C3588mN(list4, arrayList27);
                C3266gN c3266gN5 = c3224fi2.f31191x;
                C3266gN a55 = C3266gN.a(new C2556Ef(c3266gN5, c3588mN, c2696Mj, 8));
                C3266gN a56 = C3266gN.a(new C3389im(c2590Gf6, 2));
                C3266gN a57 = C3266gN.a(new C3389im(c2590Gf6, 3));
                C3121dm c3121dm = c3224fi2.m0;
                C3266gN c3266gN6 = c3332hi.f31614N;
                C3010bi c3010bi3 = c3332hi.i;
                C3818qk c3818qk = c3224fi2.f31149d;
                C3266gN c3266gN7 = c3332hi.f31643f;
                C2783Rl c2783Rl4 = new C2783Rl(C3266gN.a(new C3336hm(c3266gN5, c3121dm, c3389im, c3389im2, c4031ui, c3266gN6, a42, a36, a45, c2696Mj, c3010bi3, c3818qk, a15, a53, c3266gN7, a55, c3332hi.f31622R, c3224fi2.f31152e, c3332hi.f31624S, a23, c3332hi.f31623R0, a28, a56, a57, a29)), 12);
                C3266gN a58 = C3266gN.a(new C3442jm(c3010bi3, 0));
                C3266gN c3266gN8 = c3332hi.f31637c;
                C3266gN a59 = C3266gN.a(new C4293za(a58, c3266gN8, c3266gN5, c3266gN7, 1));
                C3266gN c3266gN9 = c3224fi2.f31186u0;
                C2956ai c2956ai = new C2956ai(c3266gN9, c3389im2, a59, c2783Rl4);
                C2631Im c2631Im = new C2631Im(c3266gN9, c3389im2);
                C3266gN a60 = C3266gN.a(new C4031ui(15, new C3604mm(c4031ui, 0)));
                C2563Em c2563Em = new C2563Em(c3332hi.J, c3818qk, c2783Rl, c4031ui, c2956ai, c2631Im, c3266gN8, a60);
                Yr yr = new Yr();
                C3266gN a61 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 1));
                C3266gN a62 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 0));
                C3266gN a63 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2696Mj4, (InterfaceC3320hN) yr, (InterfaceC3320hN) c4031ui, c3332hi.f31659o, 8));
                C3266gN a64 = C3266gN.a(new C2709Nf(yr, c4031ui, 17));
                C3010bi c3010bi4 = c3332hi.f31645g;
                C3266gN a65 = C3266gN.a(new C2956ai(c3010bi4, c4031ui, c2563Em, yr, 7));
                Yr.a(yr, C3266gN.a(new C3927sm(c2747Pj, c3266gN8, c4031ui, c2783Rl4, c2563Em, c2783Rl, c3121dm, a61, a62, a63, a64, a65, new C3870rj(c3010bi4, c3818qk, 2), c3266gN6, c3010bi3, c3010bi4, a60, a27, c3332hi.f31625S0)));
                C3266gN c3266gN10 = c3224fi2.f31157f1;
                C3266gN c3266gN11 = c3224fi2.f31136X0;
                C3266gN a66 = C3266gN.a(new C2563Em(a36, a31, c3266gN10, a49, c3266gN11, c2696Mj, c2696Mj3, a24, 1));
                C3266gN a67 = C3266gN.a(new C3011bj(c3332hi.f31637c, a59, C3266gN.a(new C2630Il(c3224fi2.f31191x, c2696Mj, 1)), a24, a29, 1));
                C3266gN a68 = C3266gN.a(new C3601mj(a36, a31, c3266gN10, a49, c3266gN11, a45, c3332hi.f31659o, c3332hi.f31622R, c3332hi.f31618P, a24, 2));
                if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                    C4906k.f40186C.f40198k.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    c2720Nq = c2720Nq2;
                    C3069co c3069co4 = c2720Nq.f27336f;
                    c3069co4.c("rendering-ad-component-creation-end", currentTimeMillis);
                    c3069co4.c("rendering-configure-webview-start", currentTimeMillis);
                } else {
                    c2720Nq = c2720Nq2;
                }
                C2495Am c2495Am = (C2495Am) c3224fi2.f31140a.f30365u;
                AbstractC3364iD.j(c2495Am);
                AbstractC3364iD.j(c4089vm);
                AbstractC3364iD.j(c4036un);
                C2791Sc c2791Sc = new C2791Sc(c2495Am, c4089vm, c4036un, C3266gN.b(a65));
                if (((InterfaceC2603Hb) c2791Sc.f28281u) != null) {
                    ((C4036un) c2791Sc.f28282v).b("/nativeAdCustomClick", c2791Sc);
                }
                C3928sn c3928sn = (C3928sn) a66.f();
                C2595Gk c2595Gk = c3928sn.f34922b;
                C3821qn c3821qn = c4036un.f35339a;
                Objects.requireNonNull(c2595Gk);
                C3874rn c3874rn = new C3874rn(0, c2595Gk);
                C3925sk c3925sk = c3928sn.f34921a;
                C2714Nk c2714Nk = c3928sn.f34923c;
                C2782Rk c2782Rk = c3928sn.f34924d;
                C3388il c3388il = c3928sn.f34925e;
                synchronized (c3821qn) {
                    c3821qn.f34178n = c3925sk;
                    c3821qn.f34179u = c2714Nk;
                    c3821qn.f34180v = c2782Rk;
                    c3821qn.f34181w = c3388il;
                    c3821qn.f34182x = c3874rn;
                }
                St st3 = c3928sn.f34926f;
                Ut ut42 = c3928sn.f34927g;
                C2712Ni c2712Ni = c3928sn.f34928h;
                synchronized (c4036un) {
                    C3955tD c3955tD = c4036un.f35351n;
                    if (c3955tD != null) {
                        C2590Gf c2590Gf7 = new C2590Gf(c4036un, st3, ut42, c2712Ni);
                        c3955tD.a(new LD(0, c3955tD, c2590Gf7), c4036un.f35343e);
                    }
                }
                final C3337hn c3337hn = (C3337hn) a67.f();
                InterfaceC4084vh h3 = c4089vm.h();
                c3337hn.getClass();
                if (h3 != null) {
                    View V8 = h3.V();
                    C2545Dl c2545Dl = c3337hn.f31715c;
                    c2545Dl.R1(V8);
                    C3229fn c3229fn = new C3229fn(h3, 1);
                    Executor executor2 = c3337hn.f31713a;
                    c2545Dl.I1(c3229fn, executor2);
                    c2545Dl.I1(new C3229fn(h3, 0), executor2);
                    C3118dj c3118dj = c3337hn.f31714b;
                    c2545Dl.I1(c3118dj, executor2);
                    c3118dj.f30596n = h3;
                    C2677Lh h02 = h3.h0();
                    if (!((Boolean) rVar3.f40509c.a(AbstractC3592ma.Ab)).booleanValue() || h02 == null) {
                        i12 = 0;
                    } else {
                        h02.c("/click");
                        InterfaceC2579Fl interfaceC2579Fl = h02.f26928D;
                        C2950ac c2950ac = AbstractC3218fc.f31040a;
                        C2712Ni c2712Ni2 = c3337hn.f31716d;
                        i12 = 0;
                        h02.b("/click", new C3111dc(0, interfaceC2579Fl, c2712Ni2));
                        h02.y(c2712Ni2, null, null);
                    }
                    h3.Z0("/trackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                        @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                        public final void e(Object obj, Map map) {
                            switch (i12) {
                                case 0:
                                    C3118dj c3118dj2 = c3337hn.f31714b;
                                    c3118dj2.f30600x = true;
                                    c3118dj2.a();
                                    break;
                                default:
                                    c3337hn.f31714b.f30600x = false;
                                    break;
                            }
                        }
                    });
                    final int i16 = 1;
                    h3.Z0("/untrackActiveViewUnit", new InterfaceC3272gc() { // from class: com.google.android.gms.internal.ads.gn
                        @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
                        public final void e(Object obj, Map map) {
                            switch (i16) {
                                case 0:
                                    C3118dj c3118dj2 = c3337hn.f31714b;
                                    c3118dj2.f30600x = true;
                                    c3118dj2.a();
                                    break;
                                default:
                                    c3337hn.f31714b.f30600x = false;
                                    break;
                            }
                        }
                    });
                    h3.h0().f26943T = c3337hn.f31717e;
                }
                C4198xn c4198xn = (C4198xn) a68.f();
                C4252yn c4252yn = c2720Nq.f27335e;
                InterfaceC4084vh i17 = c4089vm.i();
                c4198xn.getClass();
                C4090vn c4090vn = c4252yn.f36008a;
                C2595Gk c2595Gk2 = c4198xn.f35831b;
                Objects.requireNonNull(c2595Gk2);
                C3874rn c3874rn2 = new C3874rn(1, c2595Gk2);
                C3925sk c3925sk2 = c4198xn.f35830a;
                C2714Nk c2714Nk2 = c4198xn.f35832c;
                C2782Rk c2782Rk2 = c4198xn.f35833d;
                C3388il c3388il2 = c4198xn.f35834e;
                C2562El c2562El = c4198xn.f35835f;
                synchronized (c4090vn) {
                    synchronized (c4090vn) {
                        c4090vn.f34178n = c3925sk2;
                        c4090vn.f34179u = c2714Nk2;
                        c4090vn.f34180v = c2782Rk2;
                        c4090vn.f34181w = c3388il2;
                        c4090vn.f34182x = c3874rn2;
                    }
                    if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue() && i17 != null && i17.h0() != null) {
                        C2677Lh h03222 = i17.h0();
                        C2712Ni c2712Ni3222 = c4198xn.f35838j;
                        C2821Tp c2821Tp222 = c4198xn.i;
                        h03222.x(c2712Ni3222, c2821Tp222, c4198xn.f35837h);
                        h03222.y(c2712Ni3222, c2821Tp222, c4198xn.f35836g);
                    }
                    if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                        com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c2720Nq.f27336f, "rendering-configure-webview-end");
                    }
                    return (C3873rm) yr.f();
                }
                c4090vn.f35509y = c2562El;
                if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.Bb)).booleanValue()) {
                    C2677Lh h032222 = i17.h0();
                    C2712Ni c2712Ni32222 = c4198xn.f35838j;
                    C2821Tp c2821Tp2222 = c4198xn.i;
                    h032222.x(c2712Ni32222, c2821Tp2222, c4198xn.f35837h);
                    h032222.y(c2712Ni32222, c2821Tp2222, c4198xn.f35836g);
                }
                if (((Boolean) rVar3.f40509c.a(c3324ha4)).booleanValue()) {
                }
                return (C3873rm) yr.f();
            }
        };
        FD fd2222 = new FD(o4222, true, false);
        fd2222.f25513I = new ED(fd2222, callable2222, this.f27332b);
        fd2222.w();
        return fd2222;
    }
}
