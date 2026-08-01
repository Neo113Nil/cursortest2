package com.google.android.gms.internal.ads;

import C2.C0274g;
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
import p2.C4826a;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Nq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2700Nq implements InterfaceC3317hq {

    /* renamed from: a, reason: collision with root package name */
    public final C3201fi f26549a;

    /* renamed from: b, reason: collision with root package name */
    public final C3360ig f26550b;

    /* renamed from: c, reason: collision with root package name */
    public final C2570Gf f26551c;

    /* renamed from: d, reason: collision with root package name */
    public final C3589mu f26552d;

    /* renamed from: e, reason: collision with root package name */
    public final C4175xn f26553e;

    /* renamed from: f, reason: collision with root package name */
    public final C2993bo f26554f;

    /* renamed from: g, reason: collision with root package name */
    public final C5110a f26555g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f26556h;

    public C2700Nq(C3201fi c3201fi, C3360ig c3360ig, C2570Gf c2570Gf, C3589mu c3589mu, C4175xn c4175xn, C2993bo c2993bo, C5110a c5110a, Context context, C2866Yb c2866Yb) {
        this.f26555g = c5110a;
        this.f26556h = context;
        this.f26549a = c3201fi;
        this.f26550b = c3360ig;
        this.f26551c = c2570Gf;
        this.f26552d = c3589mu;
        this.f26553e = c4175xn;
        this.f26554f = c2993bo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
            C4835j.f39733C.f39745k.getClass();
            this.f26554f.c("rendering-native-ads-native-js-webview-start", System.currentTimeMillis());
        }
        N3.a b9 = this.f26552d.b();
        C2.s sVar = new C2.s(12, this, st);
        C3360ig c3360ig = this.f26550b;
        return QC.t(QC.t(b9, sVar, c3360ig), new C2625Jj(8, this, yt, st), c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        Wt wt = st.f27640s;
        return (wt == null || wt.f28428c == null) ? false : true;
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
    /* JADX WARN: Type inference failed for: r5v48, types: [N3.a, com.google.android.gms.internal.ads.kg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FD c(final Yt yt, final St st, final JSONObject jSONObject) {
        C4826a c4826a;
        C4221yf c4221yf;
        JSONObject jSONObject2;
        ?? r12;
        C3360ig c3360ig;
        C3045cn c3045cn;
        String str;
        C4826a c4826a2;
        C4221yf c4221yf2;
        Ut ut;
        C2993bo c2993bo;
        String str2;
        C3462kb c3462kb;
        N3.a aVar;
        RD rd;
        N3.a aVar2;
        N3.a aVar3;
        int i;
        C2570Gf c2570Gf;
        q2.f1 f1Var;
        JSONObject optJSONObject;
        Ut ut2;
        N3.a e9;
        JSONObject optJSONObject2;
        N3.a aVar4;
        N3.a aVar5;
        N3.a aVar6;
        N3.a aVar7;
        N3.a d2;
        C3045cn c3045cn2;
        C4826a c4826a3;
        C4221yf c4221yf3;
        C2993bo c2993bo2;
        ND nd;
        JSONArray optJSONArray;
        RD rd2;
        ND nd2;
        final C3932tD u3;
        JSONArray jSONArray;
        int i6;
        ND nd3;
        C3481ku c3481ku;
        Future future;
        final C3878sD c3878sD;
        C3878sD c3878sD2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray2;
        int i9;
        boolean z3;
        C3878sD t6;
        C4221yf c4221yf4;
        C3301ha c3301ha = AbstractC3569ma.f32073M2;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            C4835j.f39733C.f39745k.getClass();
            this.f26554f.c("rendering-webview-creation-start", System.currentTimeMillis());
        }
        final N3.a b9 = this.f26552d.b();
        C3301ha c3301ha2 = AbstractC3569ma.lf;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
        Context context = this.f26556h;
        if (booleanValue) {
            C5110a c5110a = this.f26555g;
            C4275zf c4275zf = st.f27574A;
            if (c4275zf != null) {
                Wt wt = st.f27640s;
                c4221yf4 = new C4221yf(context, c5110a, c4275zf, wt == null ? null : wt.f28427b);
            } else {
                c4221yf4 = null;
            }
            c4826a = new C4826a(context, c4221yf4);
            c4221yf = c4221yf4;
        } else {
            c4826a = new C4826a(context, null);
            c4221yf = null;
        }
        C4826a c4826a4 = c4826a;
        C2570Gf c2570Gf2 = this.f26551c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32065L2)).booleanValue()) {
            C4835j.f39733C.f39745k.getClass();
            ((C2993bo) c2570Gf2.f25045x).c("rendering-native-assets-loading-start", System.currentTimeMillis());
        }
        CallableC2861Xm callableC2861Xm = new CallableC2861Xm(c2570Gf2, yt, st, jSONObject, 0);
        C3360ig c3360ig2 = (C3360ig) c2570Gf2.f25042u;
        N3.a b10 = c3360ig2.b(callableC2861Xm);
        c2570Gf2.B(46, b10);
        C3045cn c3045cn3 = (C3045cn) c2570Gf2.f25043v;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
        C3462kb c3462kb2 = c3045cn3.f29588h;
        N3.a a9 = c3045cn3.a(optJSONArray3, c3462kb2.f31472u, c3462kb2.f31474w, 47);
        c2570Gf2.B(48, a9);
        C2570Gf c2570Gf3 = yt.f28754b;
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.ub)).booleanValue();
        Ut ut3 = (Ut) c2570Gf3.f25043v;
        RD rd3 = c3045cn3.f29587g;
        C2993bo c2993bo3 = c3045cn3.f29597r;
        if (booleanValue2) {
            JSONArray optJSONArray4 = jSONObject.optJSONArray("images");
            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                jSONObject2 = jSONObject;
                r12 = c2570Gf2;
                c3360ig = c3360ig2;
                c3045cn = c3045cn3;
                str = "images";
                c4826a2 = c4826a4;
                c4221yf2 = c4221yf;
                ut = ut3;
                c2993bo = c2993bo3;
                str2 = com.onesignal.inAppMessages.internal.d.HTML;
                c3462kb = c3462kb2;
                aVar = a9;
                rd = rd3;
                aVar2 = b10;
                aVar3 = ND.f26473u;
            } else {
                JSONObject optJSONObject4 = optJSONArray4.optJSONObject(0);
                if (optJSONObject4 == null) {
                    aVar3 = ND.f26473u;
                } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32093O4)).booleanValue() && optJSONObject4.has((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32101P4))) {
                    aVar3 = ND.f26473u;
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
                        f1Var = q2.f1.a();
                        c2570Gf = c2570Gf2;
                        if (TextUtils.isEmpty(optString2)) {
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
                                com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2993bo3, "native-assets-loading-image-composition-start");
                            }
                            ND nd4 = ND.f26473u;
                            str = "images";
                            C4221yf c4221yf5 = c4221yf;
                            c2993bo = c2993bo3;
                            c3360ig = c3360ig2;
                            C2570Gf c2570Gf4 = c2570Gf;
                            str2 = com.onesignal.inAppMessages.internal.d.HTML;
                            c3462kb = c3462kb2;
                            aVar = a9;
                            rd = rd3;
                            aVar2 = b10;
                            q2.f1 f1Var2 = f1Var;
                            jSONObject2 = jSONObject;
                            C2893Zm c2893Zm = new C2893Zm(c3045cn3, f1Var2, st, ut3, c4826a4, c4221yf5, optString, optString2, 0);
                            c3045cn = c3045cn3;
                            ut = ut3;
                            c4826a2 = c4826a4;
                            c4221yf2 = c4221yf5;
                            C3878sD t9 = QC.t(nd4, c2893Zm, AbstractC3413jg.f31273f);
                            aVar3 = QC.t(t9, new C2938an(t9, 0), AbstractC3413jg.f31275h);
                            r12 = c2570Gf4;
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32117R2)).booleanValue()) {
                                MA.f(aVar3, "NativeAssetsLoader.loadImageHtml", rd);
                                r12 = c2570Gf4;
                            }
                        } else {
                            jSONObject2 = jSONObject;
                            c3360ig = c3360ig2;
                            c3045cn = c3045cn3;
                            str = "images";
                            c4826a2 = c4826a4;
                            c4221yf2 = c4221yf;
                            c2993bo = c2993bo3;
                            ut = ut3;
                            r12 = c2570Gf;
                            str2 = com.onesignal.inAppMessages.internal.d.HTML;
                            c3462kb = c3462kb2;
                            aVar = a9;
                            rd = rd3;
                            aVar2 = b10;
                            aVar3 = ND.f26473u;
                        }
                    }
                    c2570Gf = c2570Gf2;
                    f1Var = new q2.f1(c3045cn3.f29581a, new k2.h(i, optInt2));
                    if (TextUtils.isEmpty(optString2)) {
                    }
                }
            }
            r12.B(50, aVar3);
            N3.a b11 = c3045cn.b(jSONObject2.optJSONObject("secondary_image"), c3462kb.f31472u, 51);
            r12.B(52, b11);
            N3.a b12 = c3045cn.b(jSONObject2.optJSONObject("app_icon"), c3462kb.f31472u, 53);
            r12.B(54, b12);
            optJSONObject = jSONObject2.optJSONObject("attribution");
            if (optJSONObject != null) {
                e9 = ND.f26473u;
                ut2 = ut;
            } else {
                JSONArray optJSONArray5 = optJSONObject.optJSONArray(str);
                JSONObject optJSONObject5 = optJSONObject.optJSONObject(d.c.f18635e);
                if (optJSONArray5 == null && optJSONObject5 != null) {
                    optJSONArray5 = new JSONArray();
                    optJSONArray5.put(optJSONObject5);
                }
                ut2 = ut;
                e9 = c3045cn.e("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), QC.u(c3045cn.a(optJSONArray5, false, true, 55), new C0274g(2, c3045cn, optJSONObject), rd));
            }
            N3.a aVar8 = e9;
            r12.B(56, aVar8);
            String[] strArr = {"html_containers", "instream"};
            JSONObject R8 = A8.b.R(jSONObject2, strArr);
            optJSONObject2 = R8 != null ? null : R8.optJSONObject(strArr[1]);
            if (optJSONObject2 != null) {
                JSONObject optJSONObject6 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f8444a);
                if (optJSONObject6 == null) {
                    d2 = ND.f26473u;
                } else {
                    String optString3 = optJSONObject6.optString("vast_xml");
                    boolean z6 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.tb)).booleanValue() && optJSONObject6.has(str2);
                    if (!TextUtils.isEmpty(optString3) || z6) {
                        if (z6) {
                            aVar5 = aVar8;
                            z3 = z6;
                            t6 = c3045cn.d(optJSONObject6, st, ut2, c4826a2, c4221yf2);
                            aVar4 = b11;
                            aVar7 = b12;
                            aVar6 = aVar3;
                        } else {
                            aVar5 = aVar8;
                            z3 = z6;
                            C3314hn c3314hn = c3045cn.i;
                            c3314hn.getClass();
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
                                C4835j.f39733C.f39745k.getClass();
                                aVar4 = b11;
                                aVar7 = b12;
                                aVar6 = aVar3;
                                c3314hn.f30938j.c("native-assets-loading-video-start", System.currentTimeMillis());
                            } else {
                                aVar4 = b11;
                                aVar7 = b12;
                                aVar6 = aVar3;
                            }
                            ND nd5 = ND.f26473u;
                            C2625Jj c2625Jj = new C2625Jj(1, c3314hn, c4826a2, c4221yf2);
                            Executor executor = c3314hn.f30931b;
                            t6 = QC.t(QC.t(nd5, c2625Jj, executor), new C2.s(5, c3314hn, optJSONObject6), executor);
                        }
                        d2 = c3045cn.e(true != z3 ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, QC.s(t6, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32027G4)).intValue(), TimeUnit.SECONDS, c3045cn.f29590k));
                    } else {
                        int i10 = u2.z.f41322b;
                        v2.i.f("Required field 'vast_xml' or 'html' is missing");
                        d2 = ND.f26473u;
                    }
                }
                C4826a c4826a5 = c4826a2;
                c3045cn2 = c3045cn;
                c4826a3 = c4826a5;
                c4221yf3 = c4221yf2;
                aVar4 = b11;
                aVar7 = b12;
                aVar5 = aVar8;
                aVar6 = aVar3;
                r12.B(58, d2);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Ce)).booleanValue() && jSONObject2.has(com.anythink.basead.exoplayer.k.o.f8444a)) {
                    optJSONObject3 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f8444a);
                    if (optJSONObject3.has("flags") && (optJSONArray2 = optJSONObject3.optJSONArray("flags")) != null) {
                        i9 = 0;
                        while (true) {
                            if (i9 >= optJSONArray2.length()) {
                                break;
                            }
                            JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i9);
                            if (optJSONObject7 == null || !optJSONObject7.optString("key").equals("afma_video_player_type")) {
                                i9++;
                                c2993bo = c2993bo;
                            } else {
                                try {
                                    if (Integer.parseInt(optJSONObject7.optString("value")) == 3) {
                                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
                                            c2993bo2 = c2993bo;
                                            com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2993bo2, "native-assets-loading-media-start");
                                        } else {
                                            c2993bo2 = c2993bo;
                                        }
                                        ?? c3467kg = new C3467kg();
                                        d2.a(new LD(0, d2, new Ux(c3045cn2, (C3467kg) c3467kg)), AbstractC3413jg.f31273f);
                                        r12.B(61, c3467kg);
                                        nd = c3467kg;
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
                c2993bo2 = c2993bo;
                nd = QC.c(new Bundle());
                ND nd6 = nd;
                C3481ku c3481ku2 = (C3481ku) r12.f25044w;
                optJSONArray = jSONObject2.optJSONArray("custom_assets");
                if (optJSONArray == null) {
                    u3 = QC.c(Collections.EMPTY_LIST);
                    nd2 = nd6;
                } else {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32108Q2)).booleanValue()) {
                        C4835j.f39733C.f39745k.getClass();
                        ((C2993bo) c3481ku2.f31665w).c("native-assets-loading-custom-start", System.currentTimeMillis());
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    int i11 = 0;
                    while (true) {
                        rd2 = (RD) c3481ku2.f31663u;
                        if (i11 >= length) {
                            break;
                        }
                        int i12 = length;
                        JSONObject optJSONObject8 = optJSONArray.optJSONObject(i11);
                        if (optJSONObject8 == null) {
                            future = ND.f26473u;
                            c3481ku = c3481ku2;
                            jSONArray = optJSONArray;
                        } else {
                            jSONArray = optJSONArray;
                            String optString4 = optJSONObject8.optString("name");
                            if (optString4 == null) {
                                future = ND.f26473u;
                                c3481ku = c3481ku2;
                            } else {
                                i6 = i11;
                                String optString5 = optJSONObject8.optString("type");
                                nd3 = nd6;
                                if (com.anythink.expressad.foundation.h.k.f19636g.equals(optString5)) {
                                    future = QC.c(new C3099dn(optString4, optJSONObject8.optString("string_value")));
                                    c3481ku = c3481ku2;
                                } else if (d.c.f18635e.equals(optString5)) {
                                    C3045cn c3045cn4 = (C3045cn) c3481ku2.f31664v;
                                    c3481ku = c3481ku2;
                                    future = QC.u(c3045cn4.b(optJSONObject8.optJSONObject("image_value"), c3045cn4.f29588h.f31472u, 0), new C2981bc(optString4, 2), rd2);
                                } else {
                                    c3481ku = c3481ku2;
                                    future = ND.f26473u;
                                }
                                arrayList.add(future);
                                i11 = i6 + 1;
                                length = i12;
                                optJSONArray = jSONArray;
                                nd6 = nd3;
                                c3481ku2 = c3481ku;
                            }
                        }
                        nd3 = nd6;
                        i6 = i11;
                        arrayList.add(future);
                        i11 = i6 + 1;
                        length = i12;
                        optJSONArray = jSONArray;
                        nd6 = nd3;
                        c3481ku2 = c3481ku;
                    }
                    nd2 = nd6;
                    u3 = QC.u(new CD(RB.n(arrayList), true), L2.f26028j, rd2);
                }
                r12.B(63, u3);
                if (jSONObject2.optBoolean("enable_omid")) {
                    JSONObject optJSONObject9 = jSONObject2.optJSONObject("omid_settings");
                    if (optJSONObject9 == null) {
                        c3878sD2 = ND.f26473u;
                    } else {
                        String optString6 = optJSONObject9.optString("omid_html");
                        if (!TextUtils.isEmpty(optString6)) {
                            C3301ha c3301ha3 = AbstractC3569ma.f32108Q2;
                            q2.r rVar2 = q2.r.f40207e;
                            if (((Boolean) rVar2.f40210c.a(c3301ha3)).booleanValue()) {
                                com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2993bo2, "native-assets-loading-omid-start");
                            }
                            C3878sD t10 = QC.t(ND.f26473u, new C3196fd(c3045cn2, optString6, c4221yf3, c4826a3), AbstractC3413jg.f31273f);
                            if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.f32117R2)).booleanValue()) {
                                MA.f(t10, "NativeAssetsLoader.omidWebView", rd);
                            }
                            c3878sD = t10;
                            r12.B(65, c3878sD);
                            ArrayList arrayList2 = new ArrayList();
                            final N3.a aVar9 = aVar2;
                            arrayList2.add(aVar9);
                            final N3.a aVar10 = aVar;
                            arrayList2.add(aVar10);
                            final N3.a aVar11 = aVar6;
                            arrayList2.add(aVar11);
                            final N3.a aVar12 = aVar4;
                            arrayList2.add(aVar12);
                            final N3.a aVar13 = aVar7;
                            arrayList2.add(aVar13);
                            final N3.a aVar14 = aVar5;
                            arrayList2.add(aVar14);
                            arrayList2.add(d2);
                            final ND nd7 = nd2;
                            arrayList2.add(nd7);
                            arrayList2.add(u3);
                            final C4826a c4826a6 = c4826a3;
                            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                arrayList2.add(c3878sD);
                            }
                            RB n9 = RB.n(arrayList2);
                            final JSONObject jSONObject3 = jSONObject2;
                            final C4221yf c4221yf6 = c4221yf3;
                            final N3.a aVar15 = d2;
                            final C2570Gf c2570Gf5 = r12;
                            Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Wm
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    List list;
                                    JSONObject optJSONObject10;
                                    C2570Gf c2570Gf6 = C2570Gf.this;
                                    N3.a aVar16 = aVar9;
                                    N3.a aVar17 = aVar10;
                                    N3.a aVar18 = aVar13;
                                    N3.a aVar19 = aVar12;
                                    N3.a aVar20 = aVar14;
                                    JSONObject jSONObject4 = jSONObject3;
                                    N3.a aVar21 = aVar15;
                                    N3.a aVar22 = nd7;
                                    N3.a aVar23 = aVar11;
                                    N3.a aVar24 = c3878sD;
                                    N3.a aVar25 = u3;
                                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
                                        com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, (C2993bo) c2570Gf6.f25045x, "rendering-native-assets-loading-end");
                                    }
                                    C4012um c4012um = (C4012um) aVar16.get();
                                    List list2 = (List) aVar17.get();
                                    synchronized (c4012um) {
                                        c4012um.f34568e = list2;
                                    }
                                    InterfaceC3839rb interfaceC3839rb = (InterfaceC3839rb) aVar18.get();
                                    synchronized (c4012um) {
                                        c4012um.f34581s = interfaceC3839rb;
                                    }
                                    InterfaceC3839rb interfaceC3839rb2 = (InterfaceC3839rb) aVar19.get();
                                    synchronized (c4012um) {
                                        c4012um.f34582t = interfaceC3839rb2;
                                    }
                                    InterfaceC3624nb interfaceC3624nb = (InterfaceC3624nb) aVar20.get();
                                    synchronized (c4012um) {
                                        c4012um.f34566c = interfaceC3624nb;
                                    }
                                    JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                                    if (optJSONObject11 == null) {
                                        PB pb = RB.f27177u;
                                        list = C3500lC.f31745x;
                                    } else {
                                        JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                                        if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                            PB pb2 = RB.f27177u;
                                            list = C3500lC.f31745x;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                                q2.L0 f3 = C3045cn.f(optJSONArray6.optJSONObject(i13));
                                                if (f3 != null) {
                                                    arrayList3.add(f3);
                                                }
                                            }
                                            list = RB.n(arrayList3);
                                        }
                                    }
                                    synchronized (c4012um) {
                                        c4012um.f34569f = list;
                                    }
                                    JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                                    q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3045cn.f(optJSONObject10);
                                    synchronized (c4012um) {
                                        c4012um.f34570g = f9;
                                    }
                                    InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) aVar21.get();
                                    if (interfaceC4061vh != null) {
                                        synchronized (c4012um) {
                                            c4012um.i = interfaceC4061vh;
                                        }
                                        View V8 = interfaceC4061vh.V();
                                        synchronized (c4012um) {
                                            c4012um.f34577o = V8;
                                        }
                                        BinderC2606Ih g4 = interfaceC4061vh.g();
                                        synchronized (c4012um) {
                                            c4012um.f34565b = g4;
                                        }
                                    }
                                    c4012um.d().putAll((Bundle) aVar22.get());
                                    InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) aVar23.get();
                                    if (interfaceC4061vh2 != null) {
                                        synchronized (c4012um) {
                                            c4012um.f34572j = interfaceC4061vh2;
                                        }
                                        View V9 = interfaceC4061vh2.V();
                                        synchronized (c4012um) {
                                            c4012um.f34578p = V9;
                                        }
                                    }
                                    if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                                        InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) aVar24.get();
                                        if (interfaceC4061vh3 != null) {
                                            synchronized (c4012um) {
                                                c4012um.f34573k = interfaceC4061vh3;
                                            }
                                        }
                                    } else {
                                        synchronized (c4012um) {
                                            c4012um.f34575m = aVar24;
                                        }
                                        C3467kg c3467kg2 = new C3467kg();
                                        synchronized (c4012um) {
                                            c4012um.f34576n = c3467kg2;
                                        }
                                    }
                                    for (C3099dn c3099dn : (List) aVar25.get()) {
                                        if (c3099dn.f29845a != 1) {
                                            String str3 = c3099dn.f29846b;
                                            BinderC3356ib binderC3356ib = c3099dn.f29848d;
                                            synchronized (c4012um) {
                                                if (binderC3356ib == null) {
                                                    c4012um.f34584v.remove(str3);
                                                } else {
                                                    c4012um.f34584v.put(str3, binderC3356ib);
                                                }
                                            }
                                        } else {
                                            c4012um.o(c3099dn.f29846b, c3099dn.f29847c);
                                        }
                                    }
                                    return c4012um;
                                }
                            };
                            final FD fd = new FD(n9, false, false);
                            fd.f24757I = new ED(fd, callable, c3360ig);
                            fd.w();
                            C3500lC o6 = RB.o(new N3.a[]{b9, fd});
                            Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
                                /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
                                @Override // java.util.concurrent.Callable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object call() {
                                    C2700Nq c2700Nq;
                                    final int i13;
                                    int i14 = 0;
                                    C2700Nq c2700Nq2 = C2700Nq.this;
                                    FD fd2 = fd;
                                    N3.a aVar16 = b9;
                                    Yt yt2 = yt;
                                    St st2 = st;
                                    JSONObject jSONObject4 = jSONObject;
                                    C4826a c4826a7 = c4826a6;
                                    C4221yf c4221yf7 = c4221yf6;
                                    c2700Nq2.getClass();
                                    C4012um c4012um = (C4012um) fd2.get();
                                    C3959tn c3959tn = (C3959tn) aVar16.get();
                                    C3301ha c3301ha4 = AbstractC3569ma.f32073M2;
                                    q2.r rVar3 = q2.r.f40207e;
                                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                                        com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq2.f26554f, "rendering-webview-creation-end");
                                    }
                                    C3201fi c3201fi = c2700Nq2.f26549a;
                                    C3481ku c3481ku3 = new C3481ku(yt2, st2, (String) null);
                                    C3657o7 c3657o7 = new C3657o7(19, c4012um);
                                    C2570Gf c2570Gf6 = new C2570Gf(jSONObject4, c3959tn, c4826a7, c4221yf7, 12);
                                    C3309hi c3309hi = c3201fi.f30355b;
                                    C3201fi c3201fi2 = c3201fi.f30358c;
                                    C3243gN a10 = C3243gN.a(new C2888Zh(c3309hi.f30852M0, 12));
                                    C2676Mj c2676Mj = new C2676Mj(c3481ku3, 0);
                                    C3313hm c3313hm = new C3313hm(c2570Gf6, i14);
                                    C2746Ql c2746Ql = new C2746Ql(C3243gN.a(new C2689Nf(c2676Mj, c3313hm, 13)), 11);
                                    C3243gN a11 = C3243gN.a(new C4008ui(14, c2746Ql));
                                    C2987bi c2987bi = c3309hi.i;
                                    C2812Ul c2812Ul = AbstractC2772Sd.f27493B;
                                    C3243gN a12 = C3243gN.a(new C2536Ef(c2987bi, a11, c2812Ul, 1));
                                    C3243gN a13 = C3243gN.a(new C2.G(c3309hi.f30884g, a12, 4));
                                    C3243gN a14 = C3243gN.a(new C2808Uh(a12, a10, 3));
                                    C3243gN c3243gN = c3309hi.f30876c;
                                    C3243gN c3243gN2 = c3309hi.f30882f;
                                    C3243gN a15 = C3243gN.a(new C2988bj(a10, a13, c3243gN, a14, c3243gN2, 0));
                                    C3243gN a16 = C3243gN.a(new C2808Uh(a15, a11, 5));
                                    C2812Ul c2812Ul2 = new C2812Ul(3);
                                    C2676Mj c2676Mj2 = new C2676Mj(c3481ku3, 3);
                                    C3243gN a17 = C3243gN.a(new C3096dk(c3201fi2.f30403x, c2676Mj, c2812Ul2, c2676Mj2, c3243gN2, c3309hi.f30898o, c3309hi.f30867U));
                                    C3243gN a18 = C3243gN.a(new C2794Tj(a17, 17));
                                    int i15 = C3565mN.f31944c;
                                    ArrayList arrayList3 = new ArrayList(1);
                                    ArrayList arrayList4 = new ArrayList(3);
                                    arrayList4.add(c3201fi2.f30402w0);
                                    arrayList4.add(c3201fi2.f30404x0);
                                    arrayList4.add(a16);
                                    arrayList3.add(a18);
                                    C3243gN a19 = C3243gN.a(new C3956tk(new C3565mN(arrayList3, arrayList4), 3));
                                    C3243gN a20 = C3243gN.a(AbstractC2772Sd.f27492A);
                                    C3243gN c3243gN3 = c3309hi.f30876c;
                                    C3243gN a21 = C3243gN.a(new C2808Uh(a20, c3243gN3, 11));
                                    C2676Mj c2676Mj3 = new C2676Mj(c3481ku3, 2);
                                    C2987bi c2987bi2 = c3309hi.f30884g;
                                    C3243gN a22 = C3243gN.a(new C3040ci(c2987bi2, 16));
                                    C3243gN a23 = C3243gN.a(MA.f26263z);
                                    C3243gN a24 = C3243gN.a(new C2709Oi(c2987bi2, c3309hi.J, a22, a23, c3309hi.f30846J0, c3309hi.f30878d));
                                    C3243gN a25 = C3243gN.a(new C2709Oi(c3309hi.f30861R, c3309hi.f30859Q, c2676Mj, c2676Mj3, a24, c3201fi2.f30364e));
                                    C2812Ul c2812Ul3 = new C2812Ul(5);
                                    C3243gN a26 = C3243gN.a(new C2808Uh(a20, c3243gN3, 16));
                                    C3243gN a27 = C3243gN.a(AbstractC2639Kg.f25938A);
                                    C2746Ql c2746Ql2 = new C2746Ql(a27, 14);
                                    ArrayList arrayList5 = new ArrayList(2);
                                    ArrayList arrayList6 = new ArrayList(1);
                                    arrayList6.add(c3201fi2.C0);
                                    arrayList5.add(a26);
                                    arrayList5.add(c2746Ql2);
                                    C3243gN a28 = C3243gN.a(new C2536Ef(new C3565mN(arrayList5, arrayList6), c2676Mj, c2676Mj2, 7));
                                    C3243gN a29 = C3243gN.a(new C4008ui(12, c2676Mj2));
                                    C3243gN a30 = C3243gN.a(new C2809Ui(c3309hi.f30884g, c3309hi.f30876c, c3309hi.f30878d, c2676Mj2, c2676Mj, c3201fi2.f30394s0, a25, c2812Ul3, c2812Ul2, c3309hi.f30853N, c3201fi2.f30396t0, c3201fi2.f30364e, c3201fi2.f30306B0, a28, a29, c3201fi2.f30384n0));
                                    int i16 = 2;
                                    C2794Tj c2794Tj = new C2794Tj(a30, i16);
                                    C2794Tj c2794Tj2 = new C2794Tj(C3243gN.a(new C2689Nf(c2676Mj, c3309hi.f30881e0, i16)), 23);
                                    ArrayList arrayList7 = new ArrayList(4);
                                    ArrayList arrayList8 = new ArrayList(2);
                                    arrayList7.add(c3201fi2.f30406y0);
                                    arrayList8.add(c3201fi2.f30408z0);
                                    arrayList8.add(c3201fi2.f30304A0);
                                    arrayList7.add(a21);
                                    arrayList7.add(c2794Tj);
                                    arrayList7.add(c2794Tj2);
                                    C3243gN a31 = C3243gN.a(new C3956tk(new C3565mN(arrayList7, arrayList8), 4));
                                    C3243gN a32 = C3243gN.a(new C3096dk(c3309hi.f30884g, c3309hi.f30845I0, c3309hi.f30898o, c2676Mj2, c2676Mj, c3309hi.f30857P, c2812Ul));
                                    C3243gN a33 = C3243gN.a(new C2794Tj(a32, 13));
                                    C3243gN a34 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 10));
                                    C3243gN a35 = C3243gN.a(new C2794Tj(C3243gN.a(new C2826Vj(c3309hi.f30837E0, c3201fi2.f30361d)), 11));
                                    C2794Tj c2794Tj3 = new C2794Tj(a30, 1);
                                    ArrayList arrayList9 = new ArrayList(5);
                                    ArrayList arrayList10 = new ArrayList(3);
                                    arrayList9.add(c3201fi2.f30309D0);
                                    arrayList9.add(c3201fi2.f30311E0);
                                    arrayList10.add(c3201fi2.f30313F0);
                                    arrayList10.add(c3201fi2.f30315G0);
                                    arrayList9.add(a33);
                                    arrayList9.add(a34);
                                    arrayList10.add(a35);
                                    arrayList9.add(c2794Tj3);
                                    C3243gN a36 = C3243gN.a(new C3956tk(new C3565mN(arrayList9, arrayList10), 0));
                                    C3243gN a37 = C3243gN.a(new C2808Uh(a15, a11, 4));
                                    C3243gN a38 = C3243gN.a(new C2794Tj(a32, 14));
                                    C3243gN a39 = C3243gN.a(new C2794Tj(a17, 16));
                                    C3243gN c3243gN4 = c3309hi.f30876c;
                                    C3243gN a40 = C3243gN.a(new C2808Uh(a20, c3243gN4, 13));
                                    C3243gN a41 = C3243gN.a(new C2794Tj(c3201fi2.f30391r, 15));
                                    C2888Zh c2888Zh = new C2888Zh(a28, 20);
                                    C2794Tj c2794Tj4 = new C2794Tj(a30, 4);
                                    C4008ui c4008ui = new C4008ui(16, c3657o7);
                                    C2746Ql c2746Ql3 = new C2746Ql(C3243gN.a(new C2536Ef(c4008ui, c2746Ql, c3243gN4, 9)), 13);
                                    ArrayList arrayList11 = new ArrayList(9);
                                    ArrayList arrayList12 = new ArrayList(3);
                                    arrayList11.add(c3201fi2.f30317H0);
                                    arrayList11.add(c3201fi2.f30319I0);
                                    arrayList12.add(c3201fi2.f30320J0);
                                    arrayList12.add(c3201fi2.f30322K0);
                                    arrayList12.add(a37);
                                    arrayList11.add(a38);
                                    arrayList11.add(a39);
                                    arrayList11.add(a40);
                                    arrayList11.add(a41);
                                    arrayList11.add(c2888Zh);
                                    arrayList11.add(c2794Tj4);
                                    arrayList11.add(c2746Ql3);
                                    C3243gN a42 = C3243gN.a(new C3956tk(new C3565mN(arrayList11, arrayList12), 2));
                                    C2794Tj c2794Tj5 = new C2794Tj(a30, 7);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    ArrayList arrayList14 = new ArrayList(1);
                                    arrayList14.add(c3201fi2.f30324L0);
                                    arrayList13.add(c2794Tj5);
                                    C3243gN a43 = C3243gN.a(new C3956tk(new C3565mN(arrayList13, arrayList14), 19));
                                    C2794Tj c2794Tj6 = new C2794Tj(C3243gN.a(new C2593Hl(c2676Mj, c3309hi.f30861R)), 0);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    new ArrayList(1).add(c3201fi2.f30326M0);
                                    arrayList15.add(c2794Tj6);
                                    C3243gN a44 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 17));
                                    ArrayList arrayList16 = new ArrayList(1);
                                    ArrayList arrayList17 = new ArrayList(1);
                                    arrayList17.add(c3201fi2.f30328N0);
                                    arrayList16.add(a44);
                                    C3243gN a45 = C3243gN.a(new C3956tk(new C3565mN(arrayList16, arrayList17), 20));
                                    C3243gN a46 = C3243gN.a(new C2794Tj(a17, 18));
                                    C2794Tj c2794Tj7 = new C2794Tj(a30, 5);
                                    ArrayList arrayList18 = new ArrayList(7);
                                    ArrayList arrayList19 = new ArrayList(4);
                                    arrayList18.add(c3201fi2.f30330O0);
                                    arrayList19.add(c3201fi2.f30332P0);
                                    arrayList18.add(c3201fi2.f30334Q0);
                                    arrayList18.add(c3201fi2.f30336R0);
                                    arrayList19.add(c3201fi2.f30338S0);
                                    arrayList19.add(c3201fi2.f30340T0);
                                    arrayList19.add(c3201fi2.f30342U0);
                                    arrayList18.add(c3201fi2.f30344V0);
                                    arrayList18.add(c3201fi2.f30346W0);
                                    arrayList18.add(a46);
                                    arrayList18.add(c2794Tj7);
                                    C3243gN a47 = C3243gN.a(new C3956tk(new C3565mN(arrayList18, arrayList19), 5));
                                    C2794Tj c2794Tj8 = new C2794Tj(C3243gN.a(new C2888Zh(a31, 19)), 9);
                                    C3243gN a48 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 15));
                                    ArrayList arrayList20 = new ArrayList(2);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c3201fi2.f30349Y0);
                                    arrayList20.add(c2794Tj8);
                                    arrayList20.add(a48);
                                    C3243gN a49 = C3243gN.a(new C3956tk(new C3565mN(arrayList20, arrayList21), 9));
                                    List list = Collections.EMPTY_LIST;
                                    new ArrayList(1).add(c3201fi2.f30351Z0);
                                    C3243gN a50 = C3243gN.a(new C2794Tj(a32, 12));
                                    ArrayList arrayList22 = new ArrayList(1);
                                    List list2 = Collections.EMPTY_LIST;
                                    arrayList22.add(a50);
                                    C3243gN a51 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 12));
                                    C2794Tj c2794Tj9 = new C2794Tj(a30, 3);
                                    ArrayList arrayList23 = new ArrayList(2);
                                    new ArrayList(1).add(c3201fi2.f30354a1);
                                    arrayList23.add(a51);
                                    arrayList23.add(c2794Tj9);
                                    C3243gN a52 = C3243gN.a(new C2794Tj(a32, 8));
                                    ArrayList arrayList24 = new ArrayList(1);
                                    List list3 = Collections.EMPTY_LIST;
                                    arrayList24.add(a52);
                                    C2676Mj c2676Mj4 = new C2676Mj(c3481ku3, 1);
                                    C4225yj c4225yj = new C4225yj(c2676Mj, c2676Mj4, c3201fi2.f30303A, c2676Mj3, c3201fi2.f30367f);
                                    ArrayList arrayList25 = new ArrayList(1);
                                    ArrayList arrayList26 = new ArrayList(1);
                                    arrayList26.add(c3201fi2.f30360c1);
                                    arrayList25.add(c3201fi2.f30363d1);
                                    C2727Pj c2727Pj = new C2727Pj(c2676Mj2, c2676Mj, a19, a47, c3201fi2.f30357b1, c4225yj, a20, new C3956tk(new C3565mN(arrayList25, arrayList26), 6), a43, a29, c3309hi.f30909t0);
                                    C3313hm c3313hm2 = new C3313hm(c2570Gf6, 1);
                                    C3243gN a53 = C3243gN.a(new C2594Hm(c3313hm2, c3309hi.f30882f));
                                    C3243gN a54 = C3243gN.a(new C2808Uh(a15, a11, 6));
                                    List list4 = Collections.EMPTY_LIST;
                                    ArrayList arrayList27 = new ArrayList(2);
                                    arrayList27.add(c3201fi2.f30366e1);
                                    arrayList27.add(a54);
                                    C3565mN c3565mN = new C3565mN(list4, arrayList27);
                                    C3243gN c3243gN5 = c3201fi2.f30403x;
                                    C3243gN a55 = C3243gN.a(new C2536Ef(c3243gN5, c3565mN, c2676Mj, 8));
                                    C3243gN a56 = C3243gN.a(new C3313hm(c2570Gf6, 2));
                                    C3243gN a57 = C3243gN.a(new C3313hm(c2570Gf6, 3));
                                    C3044cm c3044cm = c3201fi2.m0;
                                    C3243gN c3243gN6 = c3309hi.f30853N;
                                    C2987bi c2987bi3 = c3309hi.i;
                                    C3795qk c3795qk = c3201fi2.f30361d;
                                    C3243gN c3243gN7 = c3309hi.f30882f;
                                    C2746Ql c2746Ql4 = new C2746Ql(C3243gN.a(new C3259gm(c3243gN5, c3044cm, c3313hm, c3313hm2, c4008ui, c3243gN6, a42, a36, a45, c2676Mj, c2987bi3, c3795qk, a15, a53, c3243gN7, a55, c3309hi.f30861R, c3201fi2.f30364e, c3309hi.f30863S, a23, c3309hi.f30862R0, a28, a56, a57, a29)), 12);
                                    C3243gN a58 = C3243gN.a(new C3366im(c2987bi3, 0));
                                    C3243gN c3243gN8 = c3309hi.f30876c;
                                    C3243gN a59 = C3243gN.a(new C4270za(a58, c3243gN8, c3243gN5, c3243gN7, 1));
                                    C3243gN c3243gN9 = c3201fi2.f30398u0;
                                    C2933ai c2933ai = new C2933ai(c3243gN9, c3313hm2, a59, c2746Ql4);
                                    C2594Hm c2594Hm = new C2594Hm(c3243gN9, c3313hm2);
                                    C3243gN a60 = C3243gN.a(new C4008ui(15, new C3527lm(c4008ui, 0)));
                                    C2526Dm c2526Dm = new C2526Dm(c3309hi.J, c3795qk, c2746Ql, c4008ui, c2933ai, c2594Hm, c3243gN8, a60);
                                    Yr yr = new Yr();
                                    C3243gN a61 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 1));
                                    C3243gN a62 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 0));
                                    C3243gN a63 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2676Mj4, (InterfaceC3297hN) yr, (InterfaceC3297hN) c4008ui, c3309hi.f30898o, 8));
                                    C3243gN a64 = C3243gN.a(new C2689Nf(yr, c4008ui, 17));
                                    C2987bi c2987bi4 = c3309hi.f30884g;
                                    C3243gN a65 = C3243gN.a(new C2933ai(c2987bi4, c4008ui, c2526Dm, yr, 7));
                                    Yr.a(yr, C3243gN.a(new C3850rm(c2727Pj, c3243gN8, c4008ui, c2746Ql4, c2526Dm, c2746Ql, c3044cm, a61, a62, a63, a64, a65, new C3847rj(c2987bi4, c3795qk, 2), c3243gN6, c2987bi3, c2987bi4, a60, a27, c3309hi.f30864S0)));
                                    C3243gN c3243gN10 = c3201fi2.f30369f1;
                                    C3243gN c3243gN11 = c3201fi2.f30348X0;
                                    C3243gN a66 = C3243gN.a(new C2526Dm(a36, a31, c3243gN10, a49, c3243gN11, c2676Mj, c2676Mj3, a24, 1));
                                    C3243gN a67 = C3243gN.a(new C2988bj(c3309hi.f30876c, a59, C3243gN.a(new C2593Hl(c3201fi2.f30403x, c2676Mj, 1)), a24, a29, 1));
                                    C3243gN a68 = C3243gN.a(new C3578mj(a36, a31, c3243gN10, a49, c3243gN11, a45, c3309hi.f30898o, c3309hi.f30861R, c3309hi.f30857P, a24, 2));
                                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                                        C4835j.f39733C.f39745k.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        c2700Nq = c2700Nq2;
                                        C2993bo c2993bo4 = c2700Nq.f26554f;
                                        c2993bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                                        c2993bo4.c("rendering-configure-webview-start", currentTimeMillis);
                                    } else {
                                        c2700Nq = c2700Nq2;
                                    }
                                    C4282zm c4282zm = (C4282zm) c3201fi2.f30352a.f29323u;
                                    AbstractC3341iD.j(c4282zm);
                                    AbstractC3341iD.j(c4012um);
                                    AbstractC3341iD.j(c3959tn);
                                    C2771Sc c2771Sc = new C2771Sc(c4282zm, c4012um, c3959tn, C3243gN.b(a65));
                                    if (((InterfaceC2583Hb) c2771Sc.f27489u) != null) {
                                        ((C3959tn) c2771Sc.f27490v).b("/nativeAdCustomClick", c2771Sc);
                                    }
                                    C3851rn c3851rn = (C3851rn) a66.f();
                                    C2575Gk c2575Gk = c3851rn.f33740b;
                                    C3744pn c3744pn = c3959tn.f34386a;
                                    Objects.requireNonNull(c2575Gk);
                                    C3798qn c3798qn = new C3798qn(0, c2575Gk);
                                    C3902sk c3902sk = c3851rn.f33739a;
                                    C2694Nk c2694Nk = c3851rn.f33741c;
                                    C2762Rk c2762Rk = c3851rn.f33742d;
                                    C3365il c3365il = c3851rn.f33743e;
                                    synchronized (c3744pn) {
                                        c3744pn.f33128n = c3902sk;
                                        c3744pn.f33129u = c2694Nk;
                                        c3744pn.f33130v = c2762Rk;
                                        c3744pn.f33131w = c3365il;
                                        c3744pn.f33132x = c3798qn;
                                    }
                                    St st3 = c3851rn.f33744f;
                                    Ut ut4 = c3851rn.f33745g;
                                    C2692Ni c2692Ni = c3851rn.f33746h;
                                    synchronized (c3959tn) {
                                        C3932tD c3932tD = c3959tn.f34398n;
                                        if (c3932tD != null) {
                                            C2570Gf c2570Gf7 = new C2570Gf(c3959tn, st3, ut4, c2692Ni);
                                            c3932tD.a(new LD(0, c3932tD, c2570Gf7), c3959tn.f34390e);
                                        }
                                    }
                                    final C3260gn c3260gn = (C3260gn) a67.f();
                                    InterfaceC4061vh h9 = c4012um.h();
                                    c3260gn.getClass();
                                    if (h9 != null) {
                                        View V8 = h9.V();
                                        C2508Cl c2508Cl = c3260gn.f30652c;
                                        c2508Cl.Q1(V8);
                                        C3152en c3152en = new C3152en(h9, 1);
                                        Executor executor2 = c3260gn.f30650a;
                                        c2508Cl.H1(c3152en, executor2);
                                        c2508Cl.H1(new C3152en(h9, 0), executor2);
                                        C3095dj c3095dj = c3260gn.f30651b;
                                        c2508Cl.H1(c3095dj, executor2);
                                        c3095dj.f29823n = h9;
                                        C2657Lh g02 = h9.g0();
                                        if (!((Boolean) rVar3.f40210c.a(AbstractC3569ma.Ab)).booleanValue() || g02 == null) {
                                            i13 = 0;
                                        } else {
                                            g02.c("/click");
                                            InterfaceC2542El interfaceC2542El = g02.f26131D;
                                            C2927ac c2927ac = AbstractC3195fc.f30252a;
                                            C2692Ni c2692Ni2 = c3260gn.f30653d;
                                            i13 = 0;
                                            g02.b("/click", new C3088dc(0, interfaceC2542El, c2692Ni2));
                                            g02.y(c2692Ni2, null, null);
                                        }
                                        h9.a1("/trackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                                            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                                            public final void e(Object obj, Map map) {
                                                switch (i13) {
                                                    case 0:
                                                        C3095dj c3095dj2 = c3260gn.f30651b;
                                                        c3095dj2.f29827x = true;
                                                        c3095dj2.a();
                                                        break;
                                                    default:
                                                        c3260gn.f30651b.f29827x = false;
                                                        break;
                                                }
                                            }
                                        });
                                        final int i17 = 1;
                                        h9.a1("/untrackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                                            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                                            public final void e(Object obj, Map map) {
                                                switch (i17) {
                                                    case 0:
                                                        C3095dj c3095dj2 = c3260gn.f30651b;
                                                        c3095dj2.f29827x = true;
                                                        c3095dj2.a();
                                                        break;
                                                    default:
                                                        c3260gn.f30651b.f29827x = false;
                                                        break;
                                                }
                                            }
                                        });
                                        h9.g0().f26146T = c3260gn.f30654e;
                                    }
                                    C4121wn c4121wn = (C4121wn) a68.f();
                                    C4175xn c4175xn = c2700Nq.f26553e;
                                    InterfaceC4061vh i18 = c4012um.i();
                                    c4121wn.getClass();
                                    C4013un c4013un = c4175xn.f35050a;
                                    C2575Gk c2575Gk2 = c4121wn.f34872b;
                                    Objects.requireNonNull(c2575Gk2);
                                    C3798qn c3798qn2 = new C3798qn(1, c2575Gk2);
                                    C3902sk c3902sk2 = c4121wn.f34871a;
                                    C2694Nk c2694Nk2 = c4121wn.f34873c;
                                    C2762Rk c2762Rk2 = c4121wn.f34874d;
                                    C3365il c3365il2 = c4121wn.f34875e;
                                    C2525Dl c2525Dl = c4121wn.f34876f;
                                    synchronized (c4013un) {
                                        synchronized (c4013un) {
                                            c4013un.f33128n = c3902sk2;
                                            c4013un.f33129u = c2694Nk2;
                                            c4013un.f33130v = c2762Rk2;
                                            c4013un.f33131w = c3365il2;
                                            c4013un.f33132x = c3798qn2;
                                        }
                                        if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue() && i18 != null && i18.g0() != null) {
                                            C2657Lh g03 = i18.g0();
                                            C2692Ni c2692Ni3 = c4121wn.f34879j;
                                            C2800Tp c2800Tp = c4121wn.i;
                                            g03.x(c2692Ni3, c2800Tp, c4121wn.f34878h);
                                            g03.y(c2692Ni3, c2800Tp, c4121wn.f34877g);
                                        }
                                        if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                                            com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq.f26554f, "rendering-configure-webview-end");
                                        }
                                        return (C3797qm) yr.f();
                                    }
                                    c4013un.f34588y = c2525Dl;
                                    if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue()) {
                                        C2657Lh g032 = i18.g0();
                                        C2692Ni c2692Ni32 = c4121wn.f34879j;
                                        C2800Tp c2800Tp2 = c4121wn.i;
                                        g032.x(c2692Ni32, c2800Tp2, c4121wn.f34878h);
                                        g032.y(c2692Ni32, c2800Tp2, c4121wn.f34877g);
                                    }
                                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                                    }
                                    return (C3797qm) yr.f();
                                }
                            };
                            FD fd2 = new FD(o6, true, false);
                            fd2.f24757I = new ED(fd2, callable2, this.f26550b);
                            fd2.w();
                            return fd2;
                        }
                        c3878sD2 = ND.f26473u;
                    }
                } else {
                    c3878sD2 = ND.f26473u;
                }
                c3878sD = c3878sD2;
                r12.B(65, c3878sD);
                ArrayList arrayList22 = new ArrayList();
                final N3.a aVar92 = aVar2;
                arrayList22.add(aVar92);
                final N3.a aVar102 = aVar;
                arrayList22.add(aVar102);
                final N3.a aVar112 = aVar6;
                arrayList22.add(aVar112);
                final N3.a aVar122 = aVar4;
                arrayList22.add(aVar122);
                final N3.a aVar132 = aVar7;
                arrayList22.add(aVar132);
                final N3.a aVar142 = aVar5;
                arrayList22.add(aVar142);
                arrayList22.add(d2);
                final N3.a nd72 = nd2;
                arrayList22.add(nd72);
                arrayList22.add(u3);
                final C4826a c4826a62 = c4826a3;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue()) {
                }
                arrayList22.add(c3878sD);
                RB n92 = RB.n(arrayList22);
                final JSONObject jSONObject32 = jSONObject2;
                final C4221yf c4221yf62 = c4221yf3;
                final N3.a aVar152 = d2;
                final C2570Gf c2570Gf52 = r12;
                Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.Wm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List list;
                        JSONObject optJSONObject10;
                        C2570Gf c2570Gf6 = C2570Gf.this;
                        N3.a aVar16 = aVar92;
                        N3.a aVar17 = aVar102;
                        N3.a aVar18 = aVar132;
                        N3.a aVar19 = aVar122;
                        N3.a aVar20 = aVar142;
                        JSONObject jSONObject4 = jSONObject32;
                        N3.a aVar21 = aVar152;
                        N3.a aVar22 = nd72;
                        N3.a aVar23 = aVar112;
                        N3.a aVar24 = c3878sD;
                        N3.a aVar25 = u3;
                        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
                            com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, (C2993bo) c2570Gf6.f25045x, "rendering-native-assets-loading-end");
                        }
                        C4012um c4012um = (C4012um) aVar16.get();
                        List list2 = (List) aVar17.get();
                        synchronized (c4012um) {
                            c4012um.f34568e = list2;
                        }
                        InterfaceC3839rb interfaceC3839rb = (InterfaceC3839rb) aVar18.get();
                        synchronized (c4012um) {
                            c4012um.f34581s = interfaceC3839rb;
                        }
                        InterfaceC3839rb interfaceC3839rb2 = (InterfaceC3839rb) aVar19.get();
                        synchronized (c4012um) {
                            c4012um.f34582t = interfaceC3839rb2;
                        }
                        InterfaceC3624nb interfaceC3624nb = (InterfaceC3624nb) aVar20.get();
                        synchronized (c4012um) {
                            c4012um.f34566c = interfaceC3624nb;
                        }
                        JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                        if (optJSONObject11 == null) {
                            PB pb = RB.f27177u;
                            list = C3500lC.f31745x;
                        } else {
                            JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                            if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                PB pb2 = RB.f27177u;
                                list = C3500lC.f31745x;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                    q2.L0 f3 = C3045cn.f(optJSONArray6.optJSONObject(i13));
                                    if (f3 != null) {
                                        arrayList3.add(f3);
                                    }
                                }
                                list = RB.n(arrayList3);
                            }
                        }
                        synchronized (c4012um) {
                            c4012um.f34569f = list;
                        }
                        JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                        q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3045cn.f(optJSONObject10);
                        synchronized (c4012um) {
                            c4012um.f34570g = f9;
                        }
                        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) aVar21.get();
                        if (interfaceC4061vh != null) {
                            synchronized (c4012um) {
                                c4012um.i = interfaceC4061vh;
                            }
                            View V8 = interfaceC4061vh.V();
                            synchronized (c4012um) {
                                c4012um.f34577o = V8;
                            }
                            BinderC2606Ih g4 = interfaceC4061vh.g();
                            synchronized (c4012um) {
                                c4012um.f34565b = g4;
                            }
                        }
                        c4012um.d().putAll((Bundle) aVar22.get());
                        InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) aVar23.get();
                        if (interfaceC4061vh2 != null) {
                            synchronized (c4012um) {
                                c4012um.f34572j = interfaceC4061vh2;
                            }
                            View V9 = interfaceC4061vh2.V();
                            synchronized (c4012um) {
                                c4012um.f34578p = V9;
                            }
                        }
                        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                            InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) aVar24.get();
                            if (interfaceC4061vh3 != null) {
                                synchronized (c4012um) {
                                    c4012um.f34573k = interfaceC4061vh3;
                                }
                            }
                        } else {
                            synchronized (c4012um) {
                                c4012um.f34575m = aVar24;
                            }
                            C3467kg c3467kg2 = new C3467kg();
                            synchronized (c4012um) {
                                c4012um.f34576n = c3467kg2;
                            }
                        }
                        for (C3099dn c3099dn : (List) aVar25.get()) {
                            if (c3099dn.f29845a != 1) {
                                String str3 = c3099dn.f29846b;
                                BinderC3356ib binderC3356ib = c3099dn.f29848d;
                                synchronized (c4012um) {
                                    if (binderC3356ib == null) {
                                        c4012um.f34584v.remove(str3);
                                    } else {
                                        c4012um.f34584v.put(str3, binderC3356ib);
                                    }
                                }
                            } else {
                                c4012um.o(c3099dn.f29846b, c3099dn.f29847c);
                            }
                        }
                        return c4012um;
                    }
                };
                final FD fd3 = new FD(n92, false, false);
                fd3.f24757I = new ED(fd3, callable3, c3360ig);
                fd3.w();
                C3500lC o62 = RB.o(new N3.a[]{b9, fd3});
                Callable callable22 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        C2700Nq c2700Nq;
                        final int i13;
                        int i14 = 0;
                        C2700Nq c2700Nq2 = C2700Nq.this;
                        FD fd22 = fd3;
                        N3.a aVar16 = b9;
                        Yt yt2 = yt;
                        St st2 = st;
                        JSONObject jSONObject4 = jSONObject;
                        C4826a c4826a7 = c4826a62;
                        C4221yf c4221yf7 = c4221yf62;
                        c2700Nq2.getClass();
                        C4012um c4012um = (C4012um) fd22.get();
                        C3959tn c3959tn = (C3959tn) aVar16.get();
                        C3301ha c3301ha4 = AbstractC3569ma.f32073M2;
                        q2.r rVar3 = q2.r.f40207e;
                        if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                            com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq2.f26554f, "rendering-webview-creation-end");
                        }
                        C3201fi c3201fi = c2700Nq2.f26549a;
                        C3481ku c3481ku3 = new C3481ku(yt2, st2, (String) null);
                        C3657o7 c3657o7 = new C3657o7(19, c4012um);
                        C2570Gf c2570Gf6 = new C2570Gf(jSONObject4, c3959tn, c4826a7, c4221yf7, 12);
                        C3309hi c3309hi = c3201fi.f30355b;
                        C3201fi c3201fi2 = c3201fi.f30358c;
                        C3243gN a10 = C3243gN.a(new C2888Zh(c3309hi.f30852M0, 12));
                        C2676Mj c2676Mj = new C2676Mj(c3481ku3, 0);
                        C3313hm c3313hm = new C3313hm(c2570Gf6, i14);
                        C2746Ql c2746Ql = new C2746Ql(C3243gN.a(new C2689Nf(c2676Mj, c3313hm, 13)), 11);
                        C3243gN a11 = C3243gN.a(new C4008ui(14, c2746Ql));
                        C2987bi c2987bi = c3309hi.i;
                        C2812Ul c2812Ul = AbstractC2772Sd.f27493B;
                        C3243gN a12 = C3243gN.a(new C2536Ef(c2987bi, a11, c2812Ul, 1));
                        C3243gN a13 = C3243gN.a(new C2.G(c3309hi.f30884g, a12, 4));
                        C3243gN a14 = C3243gN.a(new C2808Uh(a12, a10, 3));
                        C3243gN c3243gN = c3309hi.f30876c;
                        C3243gN c3243gN2 = c3309hi.f30882f;
                        C3243gN a15 = C3243gN.a(new C2988bj(a10, a13, c3243gN, a14, c3243gN2, 0));
                        C3243gN a16 = C3243gN.a(new C2808Uh(a15, a11, 5));
                        C2812Ul c2812Ul2 = new C2812Ul(3);
                        C2676Mj c2676Mj2 = new C2676Mj(c3481ku3, 3);
                        C3243gN a17 = C3243gN.a(new C3096dk(c3201fi2.f30403x, c2676Mj, c2812Ul2, c2676Mj2, c3243gN2, c3309hi.f30898o, c3309hi.f30867U));
                        C3243gN a18 = C3243gN.a(new C2794Tj(a17, 17));
                        int i15 = C3565mN.f31944c;
                        ArrayList arrayList3 = new ArrayList(1);
                        ArrayList arrayList4 = new ArrayList(3);
                        arrayList4.add(c3201fi2.f30402w0);
                        arrayList4.add(c3201fi2.f30404x0);
                        arrayList4.add(a16);
                        arrayList3.add(a18);
                        C3243gN a19 = C3243gN.a(new C3956tk(new C3565mN(arrayList3, arrayList4), 3));
                        C3243gN a20 = C3243gN.a(AbstractC2772Sd.f27492A);
                        C3243gN c3243gN3 = c3309hi.f30876c;
                        C3243gN a21 = C3243gN.a(new C2808Uh(a20, c3243gN3, 11));
                        C2676Mj c2676Mj3 = new C2676Mj(c3481ku3, 2);
                        C2987bi c2987bi2 = c3309hi.f30884g;
                        C3243gN a22 = C3243gN.a(new C3040ci(c2987bi2, 16));
                        C3243gN a23 = C3243gN.a(MA.f26263z);
                        C3243gN a24 = C3243gN.a(new C2709Oi(c2987bi2, c3309hi.J, a22, a23, c3309hi.f30846J0, c3309hi.f30878d));
                        C3243gN a25 = C3243gN.a(new C2709Oi(c3309hi.f30861R, c3309hi.f30859Q, c2676Mj, c2676Mj3, a24, c3201fi2.f30364e));
                        C2812Ul c2812Ul3 = new C2812Ul(5);
                        C3243gN a26 = C3243gN.a(new C2808Uh(a20, c3243gN3, 16));
                        C3243gN a27 = C3243gN.a(AbstractC2639Kg.f25938A);
                        C2746Ql c2746Ql2 = new C2746Ql(a27, 14);
                        ArrayList arrayList5 = new ArrayList(2);
                        ArrayList arrayList6 = new ArrayList(1);
                        arrayList6.add(c3201fi2.C0);
                        arrayList5.add(a26);
                        arrayList5.add(c2746Ql2);
                        C3243gN a28 = C3243gN.a(new C2536Ef(new C3565mN(arrayList5, arrayList6), c2676Mj, c2676Mj2, 7));
                        C3243gN a29 = C3243gN.a(new C4008ui(12, c2676Mj2));
                        C3243gN a30 = C3243gN.a(new C2809Ui(c3309hi.f30884g, c3309hi.f30876c, c3309hi.f30878d, c2676Mj2, c2676Mj, c3201fi2.f30394s0, a25, c2812Ul3, c2812Ul2, c3309hi.f30853N, c3201fi2.f30396t0, c3201fi2.f30364e, c3201fi2.f30306B0, a28, a29, c3201fi2.f30384n0));
                        int i16 = 2;
                        C2794Tj c2794Tj = new C2794Tj(a30, i16);
                        C2794Tj c2794Tj2 = new C2794Tj(C3243gN.a(new C2689Nf(c2676Mj, c3309hi.f30881e0, i16)), 23);
                        ArrayList arrayList7 = new ArrayList(4);
                        ArrayList arrayList8 = new ArrayList(2);
                        arrayList7.add(c3201fi2.f30406y0);
                        arrayList8.add(c3201fi2.f30408z0);
                        arrayList8.add(c3201fi2.f30304A0);
                        arrayList7.add(a21);
                        arrayList7.add(c2794Tj);
                        arrayList7.add(c2794Tj2);
                        C3243gN a31 = C3243gN.a(new C3956tk(new C3565mN(arrayList7, arrayList8), 4));
                        C3243gN a32 = C3243gN.a(new C3096dk(c3309hi.f30884g, c3309hi.f30845I0, c3309hi.f30898o, c2676Mj2, c2676Mj, c3309hi.f30857P, c2812Ul));
                        C3243gN a33 = C3243gN.a(new C2794Tj(a32, 13));
                        C3243gN a34 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 10));
                        C3243gN a35 = C3243gN.a(new C2794Tj(C3243gN.a(new C2826Vj(c3309hi.f30837E0, c3201fi2.f30361d)), 11));
                        C2794Tj c2794Tj3 = new C2794Tj(a30, 1);
                        ArrayList arrayList9 = new ArrayList(5);
                        ArrayList arrayList10 = new ArrayList(3);
                        arrayList9.add(c3201fi2.f30309D0);
                        arrayList9.add(c3201fi2.f30311E0);
                        arrayList10.add(c3201fi2.f30313F0);
                        arrayList10.add(c3201fi2.f30315G0);
                        arrayList9.add(a33);
                        arrayList9.add(a34);
                        arrayList10.add(a35);
                        arrayList9.add(c2794Tj3);
                        C3243gN a36 = C3243gN.a(new C3956tk(new C3565mN(arrayList9, arrayList10), 0));
                        C3243gN a37 = C3243gN.a(new C2808Uh(a15, a11, 4));
                        C3243gN a38 = C3243gN.a(new C2794Tj(a32, 14));
                        C3243gN a39 = C3243gN.a(new C2794Tj(a17, 16));
                        C3243gN c3243gN4 = c3309hi.f30876c;
                        C3243gN a40 = C3243gN.a(new C2808Uh(a20, c3243gN4, 13));
                        C3243gN a41 = C3243gN.a(new C2794Tj(c3201fi2.f30391r, 15));
                        C2888Zh c2888Zh = new C2888Zh(a28, 20);
                        C2794Tj c2794Tj4 = new C2794Tj(a30, 4);
                        C4008ui c4008ui = new C4008ui(16, c3657o7);
                        C2746Ql c2746Ql3 = new C2746Ql(C3243gN.a(new C2536Ef(c4008ui, c2746Ql, c3243gN4, 9)), 13);
                        ArrayList arrayList11 = new ArrayList(9);
                        ArrayList arrayList12 = new ArrayList(3);
                        arrayList11.add(c3201fi2.f30317H0);
                        arrayList11.add(c3201fi2.f30319I0);
                        arrayList12.add(c3201fi2.f30320J0);
                        arrayList12.add(c3201fi2.f30322K0);
                        arrayList12.add(a37);
                        arrayList11.add(a38);
                        arrayList11.add(a39);
                        arrayList11.add(a40);
                        arrayList11.add(a41);
                        arrayList11.add(c2888Zh);
                        arrayList11.add(c2794Tj4);
                        arrayList11.add(c2746Ql3);
                        C3243gN a42 = C3243gN.a(new C3956tk(new C3565mN(arrayList11, arrayList12), 2));
                        C2794Tj c2794Tj5 = new C2794Tj(a30, 7);
                        ArrayList arrayList13 = new ArrayList(1);
                        ArrayList arrayList14 = new ArrayList(1);
                        arrayList14.add(c3201fi2.f30324L0);
                        arrayList13.add(c2794Tj5);
                        C3243gN a43 = C3243gN.a(new C3956tk(new C3565mN(arrayList13, arrayList14), 19));
                        C2794Tj c2794Tj6 = new C2794Tj(C3243gN.a(new C2593Hl(c2676Mj, c3309hi.f30861R)), 0);
                        ArrayList arrayList15 = new ArrayList(1);
                        new ArrayList(1).add(c3201fi2.f30326M0);
                        arrayList15.add(c2794Tj6);
                        C3243gN a44 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 17));
                        ArrayList arrayList16 = new ArrayList(1);
                        ArrayList arrayList17 = new ArrayList(1);
                        arrayList17.add(c3201fi2.f30328N0);
                        arrayList16.add(a44);
                        C3243gN a45 = C3243gN.a(new C3956tk(new C3565mN(arrayList16, arrayList17), 20));
                        C3243gN a46 = C3243gN.a(new C2794Tj(a17, 18));
                        C2794Tj c2794Tj7 = new C2794Tj(a30, 5);
                        ArrayList arrayList18 = new ArrayList(7);
                        ArrayList arrayList19 = new ArrayList(4);
                        arrayList18.add(c3201fi2.f30330O0);
                        arrayList19.add(c3201fi2.f30332P0);
                        arrayList18.add(c3201fi2.f30334Q0);
                        arrayList18.add(c3201fi2.f30336R0);
                        arrayList19.add(c3201fi2.f30338S0);
                        arrayList19.add(c3201fi2.f30340T0);
                        arrayList19.add(c3201fi2.f30342U0);
                        arrayList18.add(c3201fi2.f30344V0);
                        arrayList18.add(c3201fi2.f30346W0);
                        arrayList18.add(a46);
                        arrayList18.add(c2794Tj7);
                        C3243gN a47 = C3243gN.a(new C3956tk(new C3565mN(arrayList18, arrayList19), 5));
                        C2794Tj c2794Tj8 = new C2794Tj(C3243gN.a(new C2888Zh(a31, 19)), 9);
                        C3243gN a48 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 15));
                        ArrayList arrayList20 = new ArrayList(2);
                        ArrayList arrayList21 = new ArrayList(1);
                        arrayList21.add(c3201fi2.f30349Y0);
                        arrayList20.add(c2794Tj8);
                        arrayList20.add(a48);
                        C3243gN a49 = C3243gN.a(new C3956tk(new C3565mN(arrayList20, arrayList21), 9));
                        List list = Collections.EMPTY_LIST;
                        new ArrayList(1).add(c3201fi2.f30351Z0);
                        C3243gN a50 = C3243gN.a(new C2794Tj(a32, 12));
                        ArrayList arrayList222 = new ArrayList(1);
                        List list2 = Collections.EMPTY_LIST;
                        arrayList222.add(a50);
                        C3243gN a51 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 12));
                        C2794Tj c2794Tj9 = new C2794Tj(a30, 3);
                        ArrayList arrayList23 = new ArrayList(2);
                        new ArrayList(1).add(c3201fi2.f30354a1);
                        arrayList23.add(a51);
                        arrayList23.add(c2794Tj9);
                        C3243gN a52 = C3243gN.a(new C2794Tj(a32, 8));
                        ArrayList arrayList24 = new ArrayList(1);
                        List list3 = Collections.EMPTY_LIST;
                        arrayList24.add(a52);
                        C2676Mj c2676Mj4 = new C2676Mj(c3481ku3, 1);
                        C4225yj c4225yj = new C4225yj(c2676Mj, c2676Mj4, c3201fi2.f30303A, c2676Mj3, c3201fi2.f30367f);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList26.add(c3201fi2.f30360c1);
                        arrayList25.add(c3201fi2.f30363d1);
                        C2727Pj c2727Pj = new C2727Pj(c2676Mj2, c2676Mj, a19, a47, c3201fi2.f30357b1, c4225yj, a20, new C3956tk(new C3565mN(arrayList25, arrayList26), 6), a43, a29, c3309hi.f30909t0);
                        C3313hm c3313hm2 = new C3313hm(c2570Gf6, 1);
                        C3243gN a53 = C3243gN.a(new C2594Hm(c3313hm2, c3309hi.f30882f));
                        C3243gN a54 = C3243gN.a(new C2808Uh(a15, a11, 6));
                        List list4 = Collections.EMPTY_LIST;
                        ArrayList arrayList27 = new ArrayList(2);
                        arrayList27.add(c3201fi2.f30366e1);
                        arrayList27.add(a54);
                        C3565mN c3565mN = new C3565mN(list4, arrayList27);
                        C3243gN c3243gN5 = c3201fi2.f30403x;
                        C3243gN a55 = C3243gN.a(new C2536Ef(c3243gN5, c3565mN, c2676Mj, 8));
                        C3243gN a56 = C3243gN.a(new C3313hm(c2570Gf6, 2));
                        C3243gN a57 = C3243gN.a(new C3313hm(c2570Gf6, 3));
                        C3044cm c3044cm = c3201fi2.m0;
                        C3243gN c3243gN6 = c3309hi.f30853N;
                        C2987bi c2987bi3 = c3309hi.i;
                        C3795qk c3795qk = c3201fi2.f30361d;
                        C3243gN c3243gN7 = c3309hi.f30882f;
                        C2746Ql c2746Ql4 = new C2746Ql(C3243gN.a(new C3259gm(c3243gN5, c3044cm, c3313hm, c3313hm2, c4008ui, c3243gN6, a42, a36, a45, c2676Mj, c2987bi3, c3795qk, a15, a53, c3243gN7, a55, c3309hi.f30861R, c3201fi2.f30364e, c3309hi.f30863S, a23, c3309hi.f30862R0, a28, a56, a57, a29)), 12);
                        C3243gN a58 = C3243gN.a(new C3366im(c2987bi3, 0));
                        C3243gN c3243gN8 = c3309hi.f30876c;
                        C3243gN a59 = C3243gN.a(new C4270za(a58, c3243gN8, c3243gN5, c3243gN7, 1));
                        C3243gN c3243gN9 = c3201fi2.f30398u0;
                        C2933ai c2933ai = new C2933ai(c3243gN9, c3313hm2, a59, c2746Ql4);
                        C2594Hm c2594Hm = new C2594Hm(c3243gN9, c3313hm2);
                        C3243gN a60 = C3243gN.a(new C4008ui(15, new C3527lm(c4008ui, 0)));
                        C2526Dm c2526Dm = new C2526Dm(c3309hi.J, c3795qk, c2746Ql, c4008ui, c2933ai, c2594Hm, c3243gN8, a60);
                        Yr yr = new Yr();
                        C3243gN a61 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 1));
                        C3243gN a62 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 0));
                        C3243gN a63 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2676Mj4, (InterfaceC3297hN) yr, (InterfaceC3297hN) c4008ui, c3309hi.f30898o, 8));
                        C3243gN a64 = C3243gN.a(new C2689Nf(yr, c4008ui, 17));
                        C2987bi c2987bi4 = c3309hi.f30884g;
                        C3243gN a65 = C3243gN.a(new C2933ai(c2987bi4, c4008ui, c2526Dm, yr, 7));
                        Yr.a(yr, C3243gN.a(new C3850rm(c2727Pj, c3243gN8, c4008ui, c2746Ql4, c2526Dm, c2746Ql, c3044cm, a61, a62, a63, a64, a65, new C3847rj(c2987bi4, c3795qk, 2), c3243gN6, c2987bi3, c2987bi4, a60, a27, c3309hi.f30864S0)));
                        C3243gN c3243gN10 = c3201fi2.f30369f1;
                        C3243gN c3243gN11 = c3201fi2.f30348X0;
                        C3243gN a66 = C3243gN.a(new C2526Dm(a36, a31, c3243gN10, a49, c3243gN11, c2676Mj, c2676Mj3, a24, 1));
                        C3243gN a67 = C3243gN.a(new C2988bj(c3309hi.f30876c, a59, C3243gN.a(new C2593Hl(c3201fi2.f30403x, c2676Mj, 1)), a24, a29, 1));
                        C3243gN a68 = C3243gN.a(new C3578mj(a36, a31, c3243gN10, a49, c3243gN11, a45, c3309hi.f30898o, c3309hi.f30861R, c3309hi.f30857P, a24, 2));
                        if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                            C4835j.f39733C.f39745k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            c2700Nq = c2700Nq2;
                            C2993bo c2993bo4 = c2700Nq.f26554f;
                            c2993bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                            c2993bo4.c("rendering-configure-webview-start", currentTimeMillis);
                        } else {
                            c2700Nq = c2700Nq2;
                        }
                        C4282zm c4282zm = (C4282zm) c3201fi2.f30352a.f29323u;
                        AbstractC3341iD.j(c4282zm);
                        AbstractC3341iD.j(c4012um);
                        AbstractC3341iD.j(c3959tn);
                        C2771Sc c2771Sc = new C2771Sc(c4282zm, c4012um, c3959tn, C3243gN.b(a65));
                        if (((InterfaceC2583Hb) c2771Sc.f27489u) != null) {
                            ((C3959tn) c2771Sc.f27490v).b("/nativeAdCustomClick", c2771Sc);
                        }
                        C3851rn c3851rn = (C3851rn) a66.f();
                        C2575Gk c2575Gk = c3851rn.f33740b;
                        C3744pn c3744pn = c3959tn.f34386a;
                        Objects.requireNonNull(c2575Gk);
                        C3798qn c3798qn = new C3798qn(0, c2575Gk);
                        C3902sk c3902sk = c3851rn.f33739a;
                        C2694Nk c2694Nk = c3851rn.f33741c;
                        C2762Rk c2762Rk = c3851rn.f33742d;
                        C3365il c3365il = c3851rn.f33743e;
                        synchronized (c3744pn) {
                            c3744pn.f33128n = c3902sk;
                            c3744pn.f33129u = c2694Nk;
                            c3744pn.f33130v = c2762Rk;
                            c3744pn.f33131w = c3365il;
                            c3744pn.f33132x = c3798qn;
                        }
                        St st3 = c3851rn.f33744f;
                        Ut ut4 = c3851rn.f33745g;
                        C2692Ni c2692Ni = c3851rn.f33746h;
                        synchronized (c3959tn) {
                            C3932tD c3932tD = c3959tn.f34398n;
                            if (c3932tD != null) {
                                C2570Gf c2570Gf7 = new C2570Gf(c3959tn, st3, ut4, c2692Ni);
                                c3932tD.a(new LD(0, c3932tD, c2570Gf7), c3959tn.f34390e);
                            }
                        }
                        final C3260gn c3260gn = (C3260gn) a67.f();
                        InterfaceC4061vh h9 = c4012um.h();
                        c3260gn.getClass();
                        if (h9 != null) {
                            View V8 = h9.V();
                            C2508Cl c2508Cl = c3260gn.f30652c;
                            c2508Cl.Q1(V8);
                            C3152en c3152en = new C3152en(h9, 1);
                            Executor executor2 = c3260gn.f30650a;
                            c2508Cl.H1(c3152en, executor2);
                            c2508Cl.H1(new C3152en(h9, 0), executor2);
                            C3095dj c3095dj = c3260gn.f30651b;
                            c2508Cl.H1(c3095dj, executor2);
                            c3095dj.f29823n = h9;
                            C2657Lh g02 = h9.g0();
                            if (!((Boolean) rVar3.f40210c.a(AbstractC3569ma.Ab)).booleanValue() || g02 == null) {
                                i13 = 0;
                            } else {
                                g02.c("/click");
                                InterfaceC2542El interfaceC2542El = g02.f26131D;
                                C2927ac c2927ac = AbstractC3195fc.f30252a;
                                C2692Ni c2692Ni2 = c3260gn.f30653d;
                                i13 = 0;
                                g02.b("/click", new C3088dc(0, interfaceC2542El, c2692Ni2));
                                g02.y(c2692Ni2, null, null);
                            }
                            h9.a1("/trackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                                @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                                public final void e(Object obj, Map map) {
                                    switch (i13) {
                                        case 0:
                                            C3095dj c3095dj2 = c3260gn.f30651b;
                                            c3095dj2.f29827x = true;
                                            c3095dj2.a();
                                            break;
                                        default:
                                            c3260gn.f30651b.f29827x = false;
                                            break;
                                    }
                                }
                            });
                            final int i17 = 1;
                            h9.a1("/untrackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                                @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                                public final void e(Object obj, Map map) {
                                    switch (i17) {
                                        case 0:
                                            C3095dj c3095dj2 = c3260gn.f30651b;
                                            c3095dj2.f29827x = true;
                                            c3095dj2.a();
                                            break;
                                        default:
                                            c3260gn.f30651b.f29827x = false;
                                            break;
                                    }
                                }
                            });
                            h9.g0().f26146T = c3260gn.f30654e;
                        }
                        C4121wn c4121wn = (C4121wn) a68.f();
                        C4175xn c4175xn = c2700Nq.f26553e;
                        InterfaceC4061vh i18 = c4012um.i();
                        c4121wn.getClass();
                        C4013un c4013un = c4175xn.f35050a;
                        C2575Gk c2575Gk2 = c4121wn.f34872b;
                        Objects.requireNonNull(c2575Gk2);
                        C3798qn c3798qn2 = new C3798qn(1, c2575Gk2);
                        C3902sk c3902sk2 = c4121wn.f34871a;
                        C2694Nk c2694Nk2 = c4121wn.f34873c;
                        C2762Rk c2762Rk2 = c4121wn.f34874d;
                        C3365il c3365il2 = c4121wn.f34875e;
                        C2525Dl c2525Dl = c4121wn.f34876f;
                        synchronized (c4013un) {
                            synchronized (c4013un) {
                                c4013un.f33128n = c3902sk2;
                                c4013un.f33129u = c2694Nk2;
                                c4013un.f33130v = c2762Rk2;
                                c4013un.f33131w = c3365il2;
                                c4013un.f33132x = c3798qn2;
                            }
                            if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue() && i18 != null && i18.g0() != null) {
                                C2657Lh g032 = i18.g0();
                                C2692Ni c2692Ni32 = c4121wn.f34879j;
                                C2800Tp c2800Tp2 = c4121wn.i;
                                g032.x(c2692Ni32, c2800Tp2, c4121wn.f34878h);
                                g032.y(c2692Ni32, c2800Tp2, c4121wn.f34877g);
                            }
                            if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                                com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq.f26554f, "rendering-configure-webview-end");
                            }
                            return (C3797qm) yr.f();
                        }
                        c4013un.f34588y = c2525Dl;
                        if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue()) {
                            C2657Lh g0322 = i18.g0();
                            C2692Ni c2692Ni322 = c4121wn.f34879j;
                            C2800Tp c2800Tp22 = c4121wn.i;
                            g0322.x(c2692Ni322, c2800Tp22, c4121wn.f34878h);
                            g0322.y(c2692Ni322, c2800Tp22, c4121wn.f34877g);
                        }
                        if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                        }
                        return (C3797qm) yr.f();
                    }
                };
                FD fd22 = new FD(o62, true, false);
                fd22.f24757I = new ED(fd22, callable22, this.f26550b);
                fd22.w();
                return fd22;
            }
            aVar4 = b11;
            aVar5 = aVar8;
            aVar6 = aVar3;
            Ut ut4 = ut2;
            aVar7 = b12;
            d2 = c3045cn.d(optJSONObject2, st, ut4, c4826a2, c4221yf2);
            C4826a c4826a7 = c4826a2;
            c3045cn2 = c3045cn;
            c4826a3 = c4826a7;
            c4221yf3 = c4221yf2;
            r12.B(58, d2);
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Ce)).booleanValue()) {
                optJSONObject3 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f8444a);
                if (optJSONObject3.has("flags")) {
                    i9 = 0;
                    while (true) {
                        if (i9 >= optJSONArray2.length()) {
                        }
                        i9++;
                        c2993bo = c2993bo;
                    }
                }
            }
            c2993bo2 = c2993bo;
            nd = QC.c(new Bundle());
            ND nd62 = nd;
            C3481ku c3481ku22 = (C3481ku) r12.f25044w;
            optJSONArray = jSONObject2.optJSONArray("custom_assets");
            if (optJSONArray == null) {
            }
            r12.B(63, u3);
            if (jSONObject2.optBoolean("enable_omid")) {
            }
            c3878sD = c3878sD2;
            r12.B(65, c3878sD);
            ArrayList arrayList222 = new ArrayList();
            final N3.a aVar922 = aVar2;
            arrayList222.add(aVar922);
            final N3.a aVar1022 = aVar;
            arrayList222.add(aVar1022);
            final N3.a aVar1122 = aVar6;
            arrayList222.add(aVar1122);
            final N3.a aVar1222 = aVar4;
            arrayList222.add(aVar1222);
            final N3.a aVar1322 = aVar7;
            arrayList222.add(aVar1322);
            final N3.a aVar1422 = aVar5;
            arrayList222.add(aVar1422);
            arrayList222.add(d2);
            final N3.a nd722 = nd2;
            arrayList222.add(nd722);
            arrayList222.add(u3);
            final C4826a c4826a622 = c4826a3;
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue()) {
            }
            arrayList222.add(c3878sD);
            RB n922 = RB.n(arrayList222);
            final JSONObject jSONObject322 = jSONObject2;
            final C4221yf c4221yf622 = c4221yf3;
            final N3.a aVar1522 = d2;
            final C2570Gf c2570Gf522 = r12;
            Callable callable32 = new Callable() { // from class: com.google.android.gms.internal.ads.Wm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List list;
                    JSONObject optJSONObject10;
                    C2570Gf c2570Gf6 = C2570Gf.this;
                    N3.a aVar16 = aVar922;
                    N3.a aVar17 = aVar1022;
                    N3.a aVar18 = aVar1322;
                    N3.a aVar19 = aVar1222;
                    N3.a aVar20 = aVar1422;
                    JSONObject jSONObject4 = jSONObject322;
                    N3.a aVar21 = aVar1522;
                    N3.a aVar22 = nd722;
                    N3.a aVar23 = aVar1122;
                    N3.a aVar24 = c3878sD;
                    N3.a aVar25 = u3;
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
                        com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, (C2993bo) c2570Gf6.f25045x, "rendering-native-assets-loading-end");
                    }
                    C4012um c4012um = (C4012um) aVar16.get();
                    List list2 = (List) aVar17.get();
                    synchronized (c4012um) {
                        c4012um.f34568e = list2;
                    }
                    InterfaceC3839rb interfaceC3839rb = (InterfaceC3839rb) aVar18.get();
                    synchronized (c4012um) {
                        c4012um.f34581s = interfaceC3839rb;
                    }
                    InterfaceC3839rb interfaceC3839rb2 = (InterfaceC3839rb) aVar19.get();
                    synchronized (c4012um) {
                        c4012um.f34582t = interfaceC3839rb2;
                    }
                    InterfaceC3624nb interfaceC3624nb = (InterfaceC3624nb) aVar20.get();
                    synchronized (c4012um) {
                        c4012um.f34566c = interfaceC3624nb;
                    }
                    JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                    if (optJSONObject11 == null) {
                        PB pb = RB.f27177u;
                        list = C3500lC.f31745x;
                    } else {
                        JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                        if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                            PB pb2 = RB.f27177u;
                            list = C3500lC.f31745x;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                q2.L0 f3 = C3045cn.f(optJSONArray6.optJSONObject(i13));
                                if (f3 != null) {
                                    arrayList3.add(f3);
                                }
                            }
                            list = RB.n(arrayList3);
                        }
                    }
                    synchronized (c4012um) {
                        c4012um.f34569f = list;
                    }
                    JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                    q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3045cn.f(optJSONObject10);
                    synchronized (c4012um) {
                        c4012um.f34570g = f9;
                    }
                    InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) aVar21.get();
                    if (interfaceC4061vh != null) {
                        synchronized (c4012um) {
                            c4012um.i = interfaceC4061vh;
                        }
                        View V8 = interfaceC4061vh.V();
                        synchronized (c4012um) {
                            c4012um.f34577o = V8;
                        }
                        BinderC2606Ih g4 = interfaceC4061vh.g();
                        synchronized (c4012um) {
                            c4012um.f34565b = g4;
                        }
                    }
                    c4012um.d().putAll((Bundle) aVar22.get());
                    InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) aVar23.get();
                    if (interfaceC4061vh2 != null) {
                        synchronized (c4012um) {
                            c4012um.f34572j = interfaceC4061vh2;
                        }
                        View V9 = interfaceC4061vh2.V();
                        synchronized (c4012um) {
                            c4012um.f34578p = V9;
                        }
                    }
                    if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                        InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) aVar24.get();
                        if (interfaceC4061vh3 != null) {
                            synchronized (c4012um) {
                                c4012um.f34573k = interfaceC4061vh3;
                            }
                        }
                    } else {
                        synchronized (c4012um) {
                            c4012um.f34575m = aVar24;
                        }
                        C3467kg c3467kg2 = new C3467kg();
                        synchronized (c4012um) {
                            c4012um.f34576n = c3467kg2;
                        }
                    }
                    for (C3099dn c3099dn : (List) aVar25.get()) {
                        if (c3099dn.f29845a != 1) {
                            String str3 = c3099dn.f29846b;
                            BinderC3356ib binderC3356ib = c3099dn.f29848d;
                            synchronized (c4012um) {
                                if (binderC3356ib == null) {
                                    c4012um.f34584v.remove(str3);
                                } else {
                                    c4012um.f34584v.put(str3, binderC3356ib);
                                }
                            }
                        } else {
                            c4012um.o(c3099dn.f29846b, c3099dn.f29847c);
                        }
                    }
                    return c4012um;
                }
            };
            final FD fd32 = new FD(n922, false, false);
            fd32.f24757I = new ED(fd32, callable32, c3360ig);
            fd32.w();
            C3500lC o622 = RB.o(new N3.a[]{b9, fd32});
            Callable callable222 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
                /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    C2700Nq c2700Nq;
                    final int i13;
                    int i14 = 0;
                    C2700Nq c2700Nq2 = C2700Nq.this;
                    FD fd222 = fd32;
                    N3.a aVar16 = b9;
                    Yt yt2 = yt;
                    St st2 = st;
                    JSONObject jSONObject4 = jSONObject;
                    C4826a c4826a72 = c4826a622;
                    C4221yf c4221yf7 = c4221yf622;
                    c2700Nq2.getClass();
                    C4012um c4012um = (C4012um) fd222.get();
                    C3959tn c3959tn = (C3959tn) aVar16.get();
                    C3301ha c3301ha4 = AbstractC3569ma.f32073M2;
                    q2.r rVar3 = q2.r.f40207e;
                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                        com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq2.f26554f, "rendering-webview-creation-end");
                    }
                    C3201fi c3201fi = c2700Nq2.f26549a;
                    C3481ku c3481ku3 = new C3481ku(yt2, st2, (String) null);
                    C3657o7 c3657o7 = new C3657o7(19, c4012um);
                    C2570Gf c2570Gf6 = new C2570Gf(jSONObject4, c3959tn, c4826a72, c4221yf7, 12);
                    C3309hi c3309hi = c3201fi.f30355b;
                    C3201fi c3201fi2 = c3201fi.f30358c;
                    C3243gN a10 = C3243gN.a(new C2888Zh(c3309hi.f30852M0, 12));
                    C2676Mj c2676Mj = new C2676Mj(c3481ku3, 0);
                    C3313hm c3313hm = new C3313hm(c2570Gf6, i14);
                    C2746Ql c2746Ql = new C2746Ql(C3243gN.a(new C2689Nf(c2676Mj, c3313hm, 13)), 11);
                    C3243gN a11 = C3243gN.a(new C4008ui(14, c2746Ql));
                    C2987bi c2987bi = c3309hi.i;
                    C2812Ul c2812Ul = AbstractC2772Sd.f27493B;
                    C3243gN a12 = C3243gN.a(new C2536Ef(c2987bi, a11, c2812Ul, 1));
                    C3243gN a13 = C3243gN.a(new C2.G(c3309hi.f30884g, a12, 4));
                    C3243gN a14 = C3243gN.a(new C2808Uh(a12, a10, 3));
                    C3243gN c3243gN = c3309hi.f30876c;
                    C3243gN c3243gN2 = c3309hi.f30882f;
                    C3243gN a15 = C3243gN.a(new C2988bj(a10, a13, c3243gN, a14, c3243gN2, 0));
                    C3243gN a16 = C3243gN.a(new C2808Uh(a15, a11, 5));
                    C2812Ul c2812Ul2 = new C2812Ul(3);
                    C2676Mj c2676Mj2 = new C2676Mj(c3481ku3, 3);
                    C3243gN a17 = C3243gN.a(new C3096dk(c3201fi2.f30403x, c2676Mj, c2812Ul2, c2676Mj2, c3243gN2, c3309hi.f30898o, c3309hi.f30867U));
                    C3243gN a18 = C3243gN.a(new C2794Tj(a17, 17));
                    int i15 = C3565mN.f31944c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(c3201fi2.f30402w0);
                    arrayList4.add(c3201fi2.f30404x0);
                    arrayList4.add(a16);
                    arrayList3.add(a18);
                    C3243gN a19 = C3243gN.a(new C3956tk(new C3565mN(arrayList3, arrayList4), 3));
                    C3243gN a20 = C3243gN.a(AbstractC2772Sd.f27492A);
                    C3243gN c3243gN3 = c3309hi.f30876c;
                    C3243gN a21 = C3243gN.a(new C2808Uh(a20, c3243gN3, 11));
                    C2676Mj c2676Mj3 = new C2676Mj(c3481ku3, 2);
                    C2987bi c2987bi2 = c3309hi.f30884g;
                    C3243gN a22 = C3243gN.a(new C3040ci(c2987bi2, 16));
                    C3243gN a23 = C3243gN.a(MA.f26263z);
                    C3243gN a24 = C3243gN.a(new C2709Oi(c2987bi2, c3309hi.J, a22, a23, c3309hi.f30846J0, c3309hi.f30878d));
                    C3243gN a25 = C3243gN.a(new C2709Oi(c3309hi.f30861R, c3309hi.f30859Q, c2676Mj, c2676Mj3, a24, c3201fi2.f30364e));
                    C2812Ul c2812Ul3 = new C2812Ul(5);
                    C3243gN a26 = C3243gN.a(new C2808Uh(a20, c3243gN3, 16));
                    C3243gN a27 = C3243gN.a(AbstractC2639Kg.f25938A);
                    C2746Ql c2746Ql2 = new C2746Ql(a27, 14);
                    ArrayList arrayList5 = new ArrayList(2);
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(c3201fi2.C0);
                    arrayList5.add(a26);
                    arrayList5.add(c2746Ql2);
                    C3243gN a28 = C3243gN.a(new C2536Ef(new C3565mN(arrayList5, arrayList6), c2676Mj, c2676Mj2, 7));
                    C3243gN a29 = C3243gN.a(new C4008ui(12, c2676Mj2));
                    C3243gN a30 = C3243gN.a(new C2809Ui(c3309hi.f30884g, c3309hi.f30876c, c3309hi.f30878d, c2676Mj2, c2676Mj, c3201fi2.f30394s0, a25, c2812Ul3, c2812Ul2, c3309hi.f30853N, c3201fi2.f30396t0, c3201fi2.f30364e, c3201fi2.f30306B0, a28, a29, c3201fi2.f30384n0));
                    int i16 = 2;
                    C2794Tj c2794Tj = new C2794Tj(a30, i16);
                    C2794Tj c2794Tj2 = new C2794Tj(C3243gN.a(new C2689Nf(c2676Mj, c3309hi.f30881e0, i16)), 23);
                    ArrayList arrayList7 = new ArrayList(4);
                    ArrayList arrayList8 = new ArrayList(2);
                    arrayList7.add(c3201fi2.f30406y0);
                    arrayList8.add(c3201fi2.f30408z0);
                    arrayList8.add(c3201fi2.f30304A0);
                    arrayList7.add(a21);
                    arrayList7.add(c2794Tj);
                    arrayList7.add(c2794Tj2);
                    C3243gN a31 = C3243gN.a(new C3956tk(new C3565mN(arrayList7, arrayList8), 4));
                    C3243gN a32 = C3243gN.a(new C3096dk(c3309hi.f30884g, c3309hi.f30845I0, c3309hi.f30898o, c2676Mj2, c2676Mj, c3309hi.f30857P, c2812Ul));
                    C3243gN a33 = C3243gN.a(new C2794Tj(a32, 13));
                    C3243gN a34 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 10));
                    C3243gN a35 = C3243gN.a(new C2794Tj(C3243gN.a(new C2826Vj(c3309hi.f30837E0, c3201fi2.f30361d)), 11));
                    C2794Tj c2794Tj3 = new C2794Tj(a30, 1);
                    ArrayList arrayList9 = new ArrayList(5);
                    ArrayList arrayList10 = new ArrayList(3);
                    arrayList9.add(c3201fi2.f30309D0);
                    arrayList9.add(c3201fi2.f30311E0);
                    arrayList10.add(c3201fi2.f30313F0);
                    arrayList10.add(c3201fi2.f30315G0);
                    arrayList9.add(a33);
                    arrayList9.add(a34);
                    arrayList10.add(a35);
                    arrayList9.add(c2794Tj3);
                    C3243gN a36 = C3243gN.a(new C3956tk(new C3565mN(arrayList9, arrayList10), 0));
                    C3243gN a37 = C3243gN.a(new C2808Uh(a15, a11, 4));
                    C3243gN a38 = C3243gN.a(new C2794Tj(a32, 14));
                    C3243gN a39 = C3243gN.a(new C2794Tj(a17, 16));
                    C3243gN c3243gN4 = c3309hi.f30876c;
                    C3243gN a40 = C3243gN.a(new C2808Uh(a20, c3243gN4, 13));
                    C3243gN a41 = C3243gN.a(new C2794Tj(c3201fi2.f30391r, 15));
                    C2888Zh c2888Zh = new C2888Zh(a28, 20);
                    C2794Tj c2794Tj4 = new C2794Tj(a30, 4);
                    C4008ui c4008ui = new C4008ui(16, c3657o7);
                    C2746Ql c2746Ql3 = new C2746Ql(C3243gN.a(new C2536Ef(c4008ui, c2746Ql, c3243gN4, 9)), 13);
                    ArrayList arrayList11 = new ArrayList(9);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(c3201fi2.f30317H0);
                    arrayList11.add(c3201fi2.f30319I0);
                    arrayList12.add(c3201fi2.f30320J0);
                    arrayList12.add(c3201fi2.f30322K0);
                    arrayList12.add(a37);
                    arrayList11.add(a38);
                    arrayList11.add(a39);
                    arrayList11.add(a40);
                    arrayList11.add(a41);
                    arrayList11.add(c2888Zh);
                    arrayList11.add(c2794Tj4);
                    arrayList11.add(c2746Ql3);
                    C3243gN a42 = C3243gN.a(new C3956tk(new C3565mN(arrayList11, arrayList12), 2));
                    C2794Tj c2794Tj5 = new C2794Tj(a30, 7);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(c3201fi2.f30324L0);
                    arrayList13.add(c2794Tj5);
                    C3243gN a43 = C3243gN.a(new C3956tk(new C3565mN(arrayList13, arrayList14), 19));
                    C2794Tj c2794Tj6 = new C2794Tj(C3243gN.a(new C2593Hl(c2676Mj, c3309hi.f30861R)), 0);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(c3201fi2.f30326M0);
                    arrayList15.add(c2794Tj6);
                    C3243gN a44 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 17));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(c3201fi2.f30328N0);
                    arrayList16.add(a44);
                    C3243gN a45 = C3243gN.a(new C3956tk(new C3565mN(arrayList16, arrayList17), 20));
                    C3243gN a46 = C3243gN.a(new C2794Tj(a17, 18));
                    C2794Tj c2794Tj7 = new C2794Tj(a30, 5);
                    ArrayList arrayList18 = new ArrayList(7);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(c3201fi2.f30330O0);
                    arrayList19.add(c3201fi2.f30332P0);
                    arrayList18.add(c3201fi2.f30334Q0);
                    arrayList18.add(c3201fi2.f30336R0);
                    arrayList19.add(c3201fi2.f30338S0);
                    arrayList19.add(c3201fi2.f30340T0);
                    arrayList19.add(c3201fi2.f30342U0);
                    arrayList18.add(c3201fi2.f30344V0);
                    arrayList18.add(c3201fi2.f30346W0);
                    arrayList18.add(a46);
                    arrayList18.add(c2794Tj7);
                    C3243gN a47 = C3243gN.a(new C3956tk(new C3565mN(arrayList18, arrayList19), 5));
                    C2794Tj c2794Tj8 = new C2794Tj(C3243gN.a(new C2888Zh(a31, 19)), 9);
                    C3243gN a48 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 15));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(c3201fi2.f30349Y0);
                    arrayList20.add(c2794Tj8);
                    arrayList20.add(a48);
                    C3243gN a49 = C3243gN.a(new C3956tk(new C3565mN(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(c3201fi2.f30351Z0);
                    C3243gN a50 = C3243gN.a(new C2794Tj(a32, 12));
                    ArrayList arrayList2222 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList2222.add(a50);
                    C3243gN a51 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 12));
                    C2794Tj c2794Tj9 = new C2794Tj(a30, 3);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(c3201fi2.f30354a1);
                    arrayList23.add(a51);
                    arrayList23.add(c2794Tj9);
                    C3243gN a52 = C3243gN.a(new C2794Tj(a32, 8));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(a52);
                    C2676Mj c2676Mj4 = new C2676Mj(c3481ku3, 1);
                    C4225yj c4225yj = new C4225yj(c2676Mj, c2676Mj4, c3201fi2.f30303A, c2676Mj3, c3201fi2.f30367f);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(c3201fi2.f30360c1);
                    arrayList25.add(c3201fi2.f30363d1);
                    C2727Pj c2727Pj = new C2727Pj(c2676Mj2, c2676Mj, a19, a47, c3201fi2.f30357b1, c4225yj, a20, new C3956tk(new C3565mN(arrayList25, arrayList26), 6), a43, a29, c3309hi.f30909t0);
                    C3313hm c3313hm2 = new C3313hm(c2570Gf6, 1);
                    C3243gN a53 = C3243gN.a(new C2594Hm(c3313hm2, c3309hi.f30882f));
                    C3243gN a54 = C3243gN.a(new C2808Uh(a15, a11, 6));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(c3201fi2.f30366e1);
                    arrayList27.add(a54);
                    C3565mN c3565mN = new C3565mN(list4, arrayList27);
                    C3243gN c3243gN5 = c3201fi2.f30403x;
                    C3243gN a55 = C3243gN.a(new C2536Ef(c3243gN5, c3565mN, c2676Mj, 8));
                    C3243gN a56 = C3243gN.a(new C3313hm(c2570Gf6, 2));
                    C3243gN a57 = C3243gN.a(new C3313hm(c2570Gf6, 3));
                    C3044cm c3044cm = c3201fi2.m0;
                    C3243gN c3243gN6 = c3309hi.f30853N;
                    C2987bi c2987bi3 = c3309hi.i;
                    C3795qk c3795qk = c3201fi2.f30361d;
                    C3243gN c3243gN7 = c3309hi.f30882f;
                    C2746Ql c2746Ql4 = new C2746Ql(C3243gN.a(new C3259gm(c3243gN5, c3044cm, c3313hm, c3313hm2, c4008ui, c3243gN6, a42, a36, a45, c2676Mj, c2987bi3, c3795qk, a15, a53, c3243gN7, a55, c3309hi.f30861R, c3201fi2.f30364e, c3309hi.f30863S, a23, c3309hi.f30862R0, a28, a56, a57, a29)), 12);
                    C3243gN a58 = C3243gN.a(new C3366im(c2987bi3, 0));
                    C3243gN c3243gN8 = c3309hi.f30876c;
                    C3243gN a59 = C3243gN.a(new C4270za(a58, c3243gN8, c3243gN5, c3243gN7, 1));
                    C3243gN c3243gN9 = c3201fi2.f30398u0;
                    C2933ai c2933ai = new C2933ai(c3243gN9, c3313hm2, a59, c2746Ql4);
                    C2594Hm c2594Hm = new C2594Hm(c3243gN9, c3313hm2);
                    C3243gN a60 = C3243gN.a(new C4008ui(15, new C3527lm(c4008ui, 0)));
                    C2526Dm c2526Dm = new C2526Dm(c3309hi.J, c3795qk, c2746Ql, c4008ui, c2933ai, c2594Hm, c3243gN8, a60);
                    Yr yr = new Yr();
                    C3243gN a61 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 1));
                    C3243gN a62 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 0));
                    C3243gN a63 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2676Mj4, (InterfaceC3297hN) yr, (InterfaceC3297hN) c4008ui, c3309hi.f30898o, 8));
                    C3243gN a64 = C3243gN.a(new C2689Nf(yr, c4008ui, 17));
                    C2987bi c2987bi4 = c3309hi.f30884g;
                    C3243gN a65 = C3243gN.a(new C2933ai(c2987bi4, c4008ui, c2526Dm, yr, 7));
                    Yr.a(yr, C3243gN.a(new C3850rm(c2727Pj, c3243gN8, c4008ui, c2746Ql4, c2526Dm, c2746Ql, c3044cm, a61, a62, a63, a64, a65, new C3847rj(c2987bi4, c3795qk, 2), c3243gN6, c2987bi3, c2987bi4, a60, a27, c3309hi.f30864S0)));
                    C3243gN c3243gN10 = c3201fi2.f30369f1;
                    C3243gN c3243gN11 = c3201fi2.f30348X0;
                    C3243gN a66 = C3243gN.a(new C2526Dm(a36, a31, c3243gN10, a49, c3243gN11, c2676Mj, c2676Mj3, a24, 1));
                    C3243gN a67 = C3243gN.a(new C2988bj(c3309hi.f30876c, a59, C3243gN.a(new C2593Hl(c3201fi2.f30403x, c2676Mj, 1)), a24, a29, 1));
                    C3243gN a68 = C3243gN.a(new C3578mj(a36, a31, c3243gN10, a49, c3243gN11, a45, c3309hi.f30898o, c3309hi.f30861R, c3309hi.f30857P, a24, 2));
                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                        C4835j.f39733C.f39745k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        c2700Nq = c2700Nq2;
                        C2993bo c2993bo4 = c2700Nq.f26554f;
                        c2993bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                        c2993bo4.c("rendering-configure-webview-start", currentTimeMillis);
                    } else {
                        c2700Nq = c2700Nq2;
                    }
                    C4282zm c4282zm = (C4282zm) c3201fi2.f30352a.f29323u;
                    AbstractC3341iD.j(c4282zm);
                    AbstractC3341iD.j(c4012um);
                    AbstractC3341iD.j(c3959tn);
                    C2771Sc c2771Sc = new C2771Sc(c4282zm, c4012um, c3959tn, C3243gN.b(a65));
                    if (((InterfaceC2583Hb) c2771Sc.f27489u) != null) {
                        ((C3959tn) c2771Sc.f27490v).b("/nativeAdCustomClick", c2771Sc);
                    }
                    C3851rn c3851rn = (C3851rn) a66.f();
                    C2575Gk c2575Gk = c3851rn.f33740b;
                    C3744pn c3744pn = c3959tn.f34386a;
                    Objects.requireNonNull(c2575Gk);
                    C3798qn c3798qn = new C3798qn(0, c2575Gk);
                    C3902sk c3902sk = c3851rn.f33739a;
                    C2694Nk c2694Nk = c3851rn.f33741c;
                    C2762Rk c2762Rk = c3851rn.f33742d;
                    C3365il c3365il = c3851rn.f33743e;
                    synchronized (c3744pn) {
                        c3744pn.f33128n = c3902sk;
                        c3744pn.f33129u = c2694Nk;
                        c3744pn.f33130v = c2762Rk;
                        c3744pn.f33131w = c3365il;
                        c3744pn.f33132x = c3798qn;
                    }
                    St st3 = c3851rn.f33744f;
                    Ut ut42 = c3851rn.f33745g;
                    C2692Ni c2692Ni = c3851rn.f33746h;
                    synchronized (c3959tn) {
                        C3932tD c3932tD = c3959tn.f34398n;
                        if (c3932tD != null) {
                            C2570Gf c2570Gf7 = new C2570Gf(c3959tn, st3, ut42, c2692Ni);
                            c3932tD.a(new LD(0, c3932tD, c2570Gf7), c3959tn.f34390e);
                        }
                    }
                    final C3260gn c3260gn = (C3260gn) a67.f();
                    InterfaceC4061vh h9 = c4012um.h();
                    c3260gn.getClass();
                    if (h9 != null) {
                        View V8 = h9.V();
                        C2508Cl c2508Cl = c3260gn.f30652c;
                        c2508Cl.Q1(V8);
                        C3152en c3152en = new C3152en(h9, 1);
                        Executor executor2 = c3260gn.f30650a;
                        c2508Cl.H1(c3152en, executor2);
                        c2508Cl.H1(new C3152en(h9, 0), executor2);
                        C3095dj c3095dj = c3260gn.f30651b;
                        c2508Cl.H1(c3095dj, executor2);
                        c3095dj.f29823n = h9;
                        C2657Lh g02 = h9.g0();
                        if (!((Boolean) rVar3.f40210c.a(AbstractC3569ma.Ab)).booleanValue() || g02 == null) {
                            i13 = 0;
                        } else {
                            g02.c("/click");
                            InterfaceC2542El interfaceC2542El = g02.f26131D;
                            C2927ac c2927ac = AbstractC3195fc.f30252a;
                            C2692Ni c2692Ni2 = c3260gn.f30653d;
                            i13 = 0;
                            g02.b("/click", new C3088dc(0, interfaceC2542El, c2692Ni2));
                            g02.y(c2692Ni2, null, null);
                        }
                        h9.a1("/trackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                            public final void e(Object obj, Map map) {
                                switch (i13) {
                                    case 0:
                                        C3095dj c3095dj2 = c3260gn.f30651b;
                                        c3095dj2.f29827x = true;
                                        c3095dj2.a();
                                        break;
                                    default:
                                        c3260gn.f30651b.f29827x = false;
                                        break;
                                }
                            }
                        });
                        final int i17 = 1;
                        h9.a1("/untrackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                            @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                            public final void e(Object obj, Map map) {
                                switch (i17) {
                                    case 0:
                                        C3095dj c3095dj2 = c3260gn.f30651b;
                                        c3095dj2.f29827x = true;
                                        c3095dj2.a();
                                        break;
                                    default:
                                        c3260gn.f30651b.f29827x = false;
                                        break;
                                }
                            }
                        });
                        h9.g0().f26146T = c3260gn.f30654e;
                    }
                    C4121wn c4121wn = (C4121wn) a68.f();
                    C4175xn c4175xn = c2700Nq.f26553e;
                    InterfaceC4061vh i18 = c4012um.i();
                    c4121wn.getClass();
                    C4013un c4013un = c4175xn.f35050a;
                    C2575Gk c2575Gk2 = c4121wn.f34872b;
                    Objects.requireNonNull(c2575Gk2);
                    C3798qn c3798qn2 = new C3798qn(1, c2575Gk2);
                    C3902sk c3902sk2 = c4121wn.f34871a;
                    C2694Nk c2694Nk2 = c4121wn.f34873c;
                    C2762Rk c2762Rk2 = c4121wn.f34874d;
                    C3365il c3365il2 = c4121wn.f34875e;
                    C2525Dl c2525Dl = c4121wn.f34876f;
                    synchronized (c4013un) {
                        synchronized (c4013un) {
                            c4013un.f33128n = c3902sk2;
                            c4013un.f33129u = c2694Nk2;
                            c4013un.f33130v = c2762Rk2;
                            c4013un.f33131w = c3365il2;
                            c4013un.f33132x = c3798qn2;
                        }
                        if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue() && i18 != null && i18.g0() != null) {
                            C2657Lh g0322 = i18.g0();
                            C2692Ni c2692Ni322 = c4121wn.f34879j;
                            C2800Tp c2800Tp22 = c4121wn.i;
                            g0322.x(c2692Ni322, c2800Tp22, c4121wn.f34878h);
                            g0322.y(c2692Ni322, c2800Tp22, c4121wn.f34877g);
                        }
                        if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                            com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq.f26554f, "rendering-configure-webview-end");
                        }
                        return (C3797qm) yr.f();
                    }
                    c4013un.f34588y = c2525Dl;
                    if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue()) {
                        C2657Lh g03222 = i18.g0();
                        C2692Ni c2692Ni3222 = c4121wn.f34879j;
                        C2800Tp c2800Tp222 = c4121wn.i;
                        g03222.x(c2692Ni3222, c2800Tp222, c4121wn.f34878h);
                        g03222.y(c2692Ni3222, c2800Tp222, c4121wn.f34877g);
                    }
                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                    }
                    return (C3797qm) yr.f();
                }
            };
            FD fd222 = new FD(o622, true, false);
            fd222.f24757I = new ED(fd222, callable222, this.f26550b);
            fd222.w();
            return fd222;
        }
        aVar3 = ND.f26473u;
        jSONObject2 = jSONObject;
        r12 = c2570Gf2;
        c3360ig = c3360ig2;
        c3045cn = c3045cn3;
        str = "images";
        c4826a2 = c4826a4;
        c4221yf2 = c4221yf;
        ut = ut3;
        c2993bo = c2993bo3;
        str2 = com.onesignal.inAppMessages.internal.d.HTML;
        c3462kb = c3462kb2;
        aVar = a9;
        rd = rd3;
        aVar2 = b10;
        r12.B(50, aVar3);
        N3.a b112 = c3045cn.b(jSONObject2.optJSONObject("secondary_image"), c3462kb.f31472u, 51);
        r12.B(52, b112);
        N3.a b122 = c3045cn.b(jSONObject2.optJSONObject("app_icon"), c3462kb.f31472u, 53);
        r12.B(54, b122);
        optJSONObject = jSONObject2.optJSONObject("attribution");
        if (optJSONObject != null) {
        }
        N3.a aVar82 = e9;
        r12.B(56, aVar82);
        String[] strArr2 = {"html_containers", "instream"};
        JSONObject R82 = A8.b.R(jSONObject2, strArr2);
        if (R82 != null) {
        }
        if (optJSONObject2 != null) {
        }
        C4826a c4826a72 = c4826a2;
        c3045cn2 = c3045cn;
        c4826a3 = c4826a72;
        c4221yf3 = c4221yf2;
        r12.B(58, d2);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Ce)).booleanValue()) {
        }
        c2993bo2 = c2993bo;
        nd = QC.c(new Bundle());
        ND nd622 = nd;
        C3481ku c3481ku222 = (C3481ku) r12.f25044w;
        optJSONArray = jSONObject2.optJSONArray("custom_assets");
        if (optJSONArray == null) {
        }
        r12.B(63, u3);
        if (jSONObject2.optBoolean("enable_omid")) {
        }
        c3878sD = c3878sD2;
        r12.B(65, c3878sD);
        ArrayList arrayList2222 = new ArrayList();
        final N3.a aVar9222 = aVar2;
        arrayList2222.add(aVar9222);
        final N3.a aVar10222 = aVar;
        arrayList2222.add(aVar10222);
        final N3.a aVar11222 = aVar6;
        arrayList2222.add(aVar11222);
        final N3.a aVar12222 = aVar4;
        arrayList2222.add(aVar12222);
        final N3.a aVar13222 = aVar7;
        arrayList2222.add(aVar13222);
        final N3.a aVar14222 = aVar5;
        arrayList2222.add(aVar14222);
        arrayList2222.add(d2);
        final N3.a nd7222 = nd2;
        arrayList2222.add(nd7222);
        arrayList2222.add(u3);
        final C4826a c4826a6222 = c4826a3;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue()) {
        }
        arrayList2222.add(c3878sD);
        RB n9222 = RB.n(arrayList2222);
        final JSONObject jSONObject3222 = jSONObject2;
        final C4221yf c4221yf6222 = c4221yf3;
        final N3.a aVar15222 = d2;
        final C2570Gf c2570Gf5222 = r12;
        Callable callable322 = new Callable() { // from class: com.google.android.gms.internal.ads.Wm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                JSONObject optJSONObject10;
                C2570Gf c2570Gf6 = C2570Gf.this;
                N3.a aVar16 = aVar9222;
                N3.a aVar17 = aVar10222;
                N3.a aVar18 = aVar13222;
                N3.a aVar19 = aVar12222;
                N3.a aVar20 = aVar14222;
                JSONObject jSONObject4 = jSONObject3222;
                N3.a aVar21 = aVar15222;
                N3.a aVar22 = nd7222;
                N3.a aVar23 = aVar11222;
                N3.a aVar24 = c3878sD;
                N3.a aVar25 = u3;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, (C2993bo) c2570Gf6.f25045x, "rendering-native-assets-loading-end");
                }
                C4012um c4012um = (C4012um) aVar16.get();
                List list2 = (List) aVar17.get();
                synchronized (c4012um) {
                    c4012um.f34568e = list2;
                }
                InterfaceC3839rb interfaceC3839rb = (InterfaceC3839rb) aVar18.get();
                synchronized (c4012um) {
                    c4012um.f34581s = interfaceC3839rb;
                }
                InterfaceC3839rb interfaceC3839rb2 = (InterfaceC3839rb) aVar19.get();
                synchronized (c4012um) {
                    c4012um.f34582t = interfaceC3839rb2;
                }
                InterfaceC3624nb interfaceC3624nb = (InterfaceC3624nb) aVar20.get();
                synchronized (c4012um) {
                    c4012um.f34566c = interfaceC3624nb;
                }
                JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                if (optJSONObject11 == null) {
                    PB pb = RB.f27177u;
                    list = C3500lC.f31745x;
                } else {
                    JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                    if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                        PB pb2 = RB.f27177u;
                        list = C3500lC.f31745x;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                            q2.L0 f3 = C3045cn.f(optJSONArray6.optJSONObject(i13));
                            if (f3 != null) {
                                arrayList3.add(f3);
                            }
                        }
                        list = RB.n(arrayList3);
                    }
                }
                synchronized (c4012um) {
                    c4012um.f34569f = list;
                }
                JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C3045cn.f(optJSONObject10);
                synchronized (c4012um) {
                    c4012um.f34570g = f9;
                }
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) aVar21.get();
                if (interfaceC4061vh != null) {
                    synchronized (c4012um) {
                        c4012um.i = interfaceC4061vh;
                    }
                    View V8 = interfaceC4061vh.V();
                    synchronized (c4012um) {
                        c4012um.f34577o = V8;
                    }
                    BinderC2606Ih g4 = interfaceC4061vh.g();
                    synchronized (c4012um) {
                        c4012um.f34565b = g4;
                    }
                }
                c4012um.d().putAll((Bundle) aVar22.get());
                InterfaceC4061vh interfaceC4061vh2 = (InterfaceC4061vh) aVar23.get();
                if (interfaceC4061vh2 != null) {
                    synchronized (c4012um) {
                        c4012um.f34572j = interfaceC4061vh2;
                    }
                    View V9 = interfaceC4061vh2.V();
                    synchronized (c4012um) {
                        c4012um.f34578p = V9;
                    }
                }
                if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                    InterfaceC4061vh interfaceC4061vh3 = (InterfaceC4061vh) aVar24.get();
                    if (interfaceC4061vh3 != null) {
                        synchronized (c4012um) {
                            c4012um.f34573k = interfaceC4061vh3;
                        }
                    }
                } else {
                    synchronized (c4012um) {
                        c4012um.f34575m = aVar24;
                    }
                    C3467kg c3467kg2 = new C3467kg();
                    synchronized (c4012um) {
                        c4012um.f34576n = c3467kg2;
                    }
                }
                for (C3099dn c3099dn : (List) aVar25.get()) {
                    if (c3099dn.f29845a != 1) {
                        String str3 = c3099dn.f29846b;
                        BinderC3356ib binderC3356ib = c3099dn.f29848d;
                        synchronized (c4012um) {
                            if (binderC3356ib == null) {
                                c4012um.f34584v.remove(str3);
                            } else {
                                c4012um.f34584v.put(str3, binderC3356ib);
                            }
                        }
                    } else {
                        c4012um.o(c3099dn.f29846b, c3099dn.f29847c);
                    }
                }
                return c4012um;
            }
        };
        final FD fd322 = new FD(n9222, false, false);
        fd322.f24757I = new ED(fd322, callable322, c3360ig);
        fd322.w();
        C3500lC o6222 = RB.o(new N3.a[]{b9, fd322});
        Callable callable2222 = new Callable() { // from class: com.google.android.gms.internal.ads.Mq
            /* JADX WARN: Removed duplicated region for block: B:46:0x0963  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                C2700Nq c2700Nq;
                final int i13;
                int i14 = 0;
                C2700Nq c2700Nq2 = C2700Nq.this;
                FD fd2222 = fd322;
                N3.a aVar16 = b9;
                Yt yt2 = yt;
                St st2 = st;
                JSONObject jSONObject4 = jSONObject;
                C4826a c4826a722 = c4826a6222;
                C4221yf c4221yf7 = c4221yf6222;
                c2700Nq2.getClass();
                C4012um c4012um = (C4012um) fd2222.get();
                C3959tn c3959tn = (C3959tn) aVar16.get();
                C3301ha c3301ha4 = AbstractC3569ma.f32073M2;
                q2.r rVar3 = q2.r.f40207e;
                if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq2.f26554f, "rendering-webview-creation-end");
                }
                C3201fi c3201fi = c2700Nq2.f26549a;
                C3481ku c3481ku3 = new C3481ku(yt2, st2, (String) null);
                C3657o7 c3657o7 = new C3657o7(19, c4012um);
                C2570Gf c2570Gf6 = new C2570Gf(jSONObject4, c3959tn, c4826a722, c4221yf7, 12);
                C3309hi c3309hi = c3201fi.f30355b;
                C3201fi c3201fi2 = c3201fi.f30358c;
                C3243gN a10 = C3243gN.a(new C2888Zh(c3309hi.f30852M0, 12));
                C2676Mj c2676Mj = new C2676Mj(c3481ku3, 0);
                C3313hm c3313hm = new C3313hm(c2570Gf6, i14);
                C2746Ql c2746Ql = new C2746Ql(C3243gN.a(new C2689Nf(c2676Mj, c3313hm, 13)), 11);
                C3243gN a11 = C3243gN.a(new C4008ui(14, c2746Ql));
                C2987bi c2987bi = c3309hi.i;
                C2812Ul c2812Ul = AbstractC2772Sd.f27493B;
                C3243gN a12 = C3243gN.a(new C2536Ef(c2987bi, a11, c2812Ul, 1));
                C3243gN a13 = C3243gN.a(new C2.G(c3309hi.f30884g, a12, 4));
                C3243gN a14 = C3243gN.a(new C2808Uh(a12, a10, 3));
                C3243gN c3243gN = c3309hi.f30876c;
                C3243gN c3243gN2 = c3309hi.f30882f;
                C3243gN a15 = C3243gN.a(new C2988bj(a10, a13, c3243gN, a14, c3243gN2, 0));
                C3243gN a16 = C3243gN.a(new C2808Uh(a15, a11, 5));
                C2812Ul c2812Ul2 = new C2812Ul(3);
                C2676Mj c2676Mj2 = new C2676Mj(c3481ku3, 3);
                C3243gN a17 = C3243gN.a(new C3096dk(c3201fi2.f30403x, c2676Mj, c2812Ul2, c2676Mj2, c3243gN2, c3309hi.f30898o, c3309hi.f30867U));
                C3243gN a18 = C3243gN.a(new C2794Tj(a17, 17));
                int i15 = C3565mN.f31944c;
                ArrayList arrayList3 = new ArrayList(1);
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(c3201fi2.f30402w0);
                arrayList4.add(c3201fi2.f30404x0);
                arrayList4.add(a16);
                arrayList3.add(a18);
                C3243gN a19 = C3243gN.a(new C3956tk(new C3565mN(arrayList3, arrayList4), 3));
                C3243gN a20 = C3243gN.a(AbstractC2772Sd.f27492A);
                C3243gN c3243gN3 = c3309hi.f30876c;
                C3243gN a21 = C3243gN.a(new C2808Uh(a20, c3243gN3, 11));
                C2676Mj c2676Mj3 = new C2676Mj(c3481ku3, 2);
                C2987bi c2987bi2 = c3309hi.f30884g;
                C3243gN a22 = C3243gN.a(new C3040ci(c2987bi2, 16));
                C3243gN a23 = C3243gN.a(MA.f26263z);
                C3243gN a24 = C3243gN.a(new C2709Oi(c2987bi2, c3309hi.J, a22, a23, c3309hi.f30846J0, c3309hi.f30878d));
                C3243gN a25 = C3243gN.a(new C2709Oi(c3309hi.f30861R, c3309hi.f30859Q, c2676Mj, c2676Mj3, a24, c3201fi2.f30364e));
                C2812Ul c2812Ul3 = new C2812Ul(5);
                C3243gN a26 = C3243gN.a(new C2808Uh(a20, c3243gN3, 16));
                C3243gN a27 = C3243gN.a(AbstractC2639Kg.f25938A);
                C2746Ql c2746Ql2 = new C2746Ql(a27, 14);
                ArrayList arrayList5 = new ArrayList(2);
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(c3201fi2.C0);
                arrayList5.add(a26);
                arrayList5.add(c2746Ql2);
                C3243gN a28 = C3243gN.a(new C2536Ef(new C3565mN(arrayList5, arrayList6), c2676Mj, c2676Mj2, 7));
                C3243gN a29 = C3243gN.a(new C4008ui(12, c2676Mj2));
                C3243gN a30 = C3243gN.a(new C2809Ui(c3309hi.f30884g, c3309hi.f30876c, c3309hi.f30878d, c2676Mj2, c2676Mj, c3201fi2.f30394s0, a25, c2812Ul3, c2812Ul2, c3309hi.f30853N, c3201fi2.f30396t0, c3201fi2.f30364e, c3201fi2.f30306B0, a28, a29, c3201fi2.f30384n0));
                int i16 = 2;
                C2794Tj c2794Tj = new C2794Tj(a30, i16);
                C2794Tj c2794Tj2 = new C2794Tj(C3243gN.a(new C2689Nf(c2676Mj, c3309hi.f30881e0, i16)), 23);
                ArrayList arrayList7 = new ArrayList(4);
                ArrayList arrayList8 = new ArrayList(2);
                arrayList7.add(c3201fi2.f30406y0);
                arrayList8.add(c3201fi2.f30408z0);
                arrayList8.add(c3201fi2.f30304A0);
                arrayList7.add(a21);
                arrayList7.add(c2794Tj);
                arrayList7.add(c2794Tj2);
                C3243gN a31 = C3243gN.a(new C3956tk(new C3565mN(arrayList7, arrayList8), 4));
                C3243gN a32 = C3243gN.a(new C3096dk(c3309hi.f30884g, c3309hi.f30845I0, c3309hi.f30898o, c2676Mj2, c2676Mj, c3309hi.f30857P, c2812Ul));
                C3243gN a33 = C3243gN.a(new C2794Tj(a32, 13));
                C3243gN a34 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 10));
                C3243gN a35 = C3243gN.a(new C2794Tj(C3243gN.a(new C2826Vj(c3309hi.f30837E0, c3201fi2.f30361d)), 11));
                C2794Tj c2794Tj3 = new C2794Tj(a30, 1);
                ArrayList arrayList9 = new ArrayList(5);
                ArrayList arrayList10 = new ArrayList(3);
                arrayList9.add(c3201fi2.f30309D0);
                arrayList9.add(c3201fi2.f30311E0);
                arrayList10.add(c3201fi2.f30313F0);
                arrayList10.add(c3201fi2.f30315G0);
                arrayList9.add(a33);
                arrayList9.add(a34);
                arrayList10.add(a35);
                arrayList9.add(c2794Tj3);
                C3243gN a36 = C3243gN.a(new C3956tk(new C3565mN(arrayList9, arrayList10), 0));
                C3243gN a37 = C3243gN.a(new C2808Uh(a15, a11, 4));
                C3243gN a38 = C3243gN.a(new C2794Tj(a32, 14));
                C3243gN a39 = C3243gN.a(new C2794Tj(a17, 16));
                C3243gN c3243gN4 = c3309hi.f30876c;
                C3243gN a40 = C3243gN.a(new C2808Uh(a20, c3243gN4, 13));
                C3243gN a41 = C3243gN.a(new C2794Tj(c3201fi2.f30391r, 15));
                C2888Zh c2888Zh = new C2888Zh(a28, 20);
                C2794Tj c2794Tj4 = new C2794Tj(a30, 4);
                C4008ui c4008ui = new C4008ui(16, c3657o7);
                C2746Ql c2746Ql3 = new C2746Ql(C3243gN.a(new C2536Ef(c4008ui, c2746Ql, c3243gN4, 9)), 13);
                ArrayList arrayList11 = new ArrayList(9);
                ArrayList arrayList12 = new ArrayList(3);
                arrayList11.add(c3201fi2.f30317H0);
                arrayList11.add(c3201fi2.f30319I0);
                arrayList12.add(c3201fi2.f30320J0);
                arrayList12.add(c3201fi2.f30322K0);
                arrayList12.add(a37);
                arrayList11.add(a38);
                arrayList11.add(a39);
                arrayList11.add(a40);
                arrayList11.add(a41);
                arrayList11.add(c2888Zh);
                arrayList11.add(c2794Tj4);
                arrayList11.add(c2746Ql3);
                C3243gN a42 = C3243gN.a(new C3956tk(new C3565mN(arrayList11, arrayList12), 2));
                C2794Tj c2794Tj5 = new C2794Tj(a30, 7);
                ArrayList arrayList13 = new ArrayList(1);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add(c3201fi2.f30324L0);
                arrayList13.add(c2794Tj5);
                C3243gN a43 = C3243gN.a(new C3956tk(new C3565mN(arrayList13, arrayList14), 19));
                C2794Tj c2794Tj6 = new C2794Tj(C3243gN.a(new C2593Hl(c2676Mj, c3309hi.f30861R)), 0);
                ArrayList arrayList15 = new ArrayList(1);
                new ArrayList(1).add(c3201fi2.f30326M0);
                arrayList15.add(c2794Tj6);
                C3243gN a44 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 17));
                ArrayList arrayList16 = new ArrayList(1);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add(c3201fi2.f30328N0);
                arrayList16.add(a44);
                C3243gN a45 = C3243gN.a(new C3956tk(new C3565mN(arrayList16, arrayList17), 20));
                C3243gN a46 = C3243gN.a(new C2794Tj(a17, 18));
                C2794Tj c2794Tj7 = new C2794Tj(a30, 5);
                ArrayList arrayList18 = new ArrayList(7);
                ArrayList arrayList19 = new ArrayList(4);
                arrayList18.add(c3201fi2.f30330O0);
                arrayList19.add(c3201fi2.f30332P0);
                arrayList18.add(c3201fi2.f30334Q0);
                arrayList18.add(c3201fi2.f30336R0);
                arrayList19.add(c3201fi2.f30338S0);
                arrayList19.add(c3201fi2.f30340T0);
                arrayList19.add(c3201fi2.f30342U0);
                arrayList18.add(c3201fi2.f30344V0);
                arrayList18.add(c3201fi2.f30346W0);
                arrayList18.add(a46);
                arrayList18.add(c2794Tj7);
                C3243gN a47 = C3243gN.a(new C3956tk(new C3565mN(arrayList18, arrayList19), 5));
                C2794Tj c2794Tj8 = new C2794Tj(C3243gN.a(new C2888Zh(a31, 19)), 9);
                C3243gN a48 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 15));
                ArrayList arrayList20 = new ArrayList(2);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c3201fi2.f30349Y0);
                arrayList20.add(c2794Tj8);
                arrayList20.add(a48);
                C3243gN a49 = C3243gN.a(new C3956tk(new C3565mN(arrayList20, arrayList21), 9));
                List list = Collections.EMPTY_LIST;
                new ArrayList(1).add(c3201fi2.f30351Z0);
                C3243gN a50 = C3243gN.a(new C2794Tj(a32, 12));
                ArrayList arrayList22222 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList22222.add(a50);
                C3243gN a51 = C3243gN.a(new C2808Uh(a20, c3309hi.f30876c, 12));
                C2794Tj c2794Tj9 = new C2794Tj(a30, 3);
                ArrayList arrayList23 = new ArrayList(2);
                new ArrayList(1).add(c3201fi2.f30354a1);
                arrayList23.add(a51);
                arrayList23.add(c2794Tj9);
                C3243gN a52 = C3243gN.a(new C2794Tj(a32, 8));
                ArrayList arrayList24 = new ArrayList(1);
                List list3 = Collections.EMPTY_LIST;
                arrayList24.add(a52);
                C2676Mj c2676Mj4 = new C2676Mj(c3481ku3, 1);
                C4225yj c4225yj = new C4225yj(c2676Mj, c2676Mj4, c3201fi2.f30303A, c2676Mj3, c3201fi2.f30367f);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add(c3201fi2.f30360c1);
                arrayList25.add(c3201fi2.f30363d1);
                C2727Pj c2727Pj = new C2727Pj(c2676Mj2, c2676Mj, a19, a47, c3201fi2.f30357b1, c4225yj, a20, new C3956tk(new C3565mN(arrayList25, arrayList26), 6), a43, a29, c3309hi.f30909t0);
                C3313hm c3313hm2 = new C3313hm(c2570Gf6, 1);
                C3243gN a53 = C3243gN.a(new C2594Hm(c3313hm2, c3309hi.f30882f));
                C3243gN a54 = C3243gN.a(new C2808Uh(a15, a11, 6));
                List list4 = Collections.EMPTY_LIST;
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add(c3201fi2.f30366e1);
                arrayList27.add(a54);
                C3565mN c3565mN = new C3565mN(list4, arrayList27);
                C3243gN c3243gN5 = c3201fi2.f30403x;
                C3243gN a55 = C3243gN.a(new C2536Ef(c3243gN5, c3565mN, c2676Mj, 8));
                C3243gN a56 = C3243gN.a(new C3313hm(c2570Gf6, 2));
                C3243gN a57 = C3243gN.a(new C3313hm(c2570Gf6, 3));
                C3044cm c3044cm = c3201fi2.m0;
                C3243gN c3243gN6 = c3309hi.f30853N;
                C2987bi c2987bi3 = c3309hi.i;
                C3795qk c3795qk = c3201fi2.f30361d;
                C3243gN c3243gN7 = c3309hi.f30882f;
                C2746Ql c2746Ql4 = new C2746Ql(C3243gN.a(new C3259gm(c3243gN5, c3044cm, c3313hm, c3313hm2, c4008ui, c3243gN6, a42, a36, a45, c2676Mj, c2987bi3, c3795qk, a15, a53, c3243gN7, a55, c3309hi.f30861R, c3201fi2.f30364e, c3309hi.f30863S, a23, c3309hi.f30862R0, a28, a56, a57, a29)), 12);
                C3243gN a58 = C3243gN.a(new C3366im(c2987bi3, 0));
                C3243gN c3243gN8 = c3309hi.f30876c;
                C3243gN a59 = C3243gN.a(new C4270za(a58, c3243gN8, c3243gN5, c3243gN7, 1));
                C3243gN c3243gN9 = c3201fi2.f30398u0;
                C2933ai c2933ai = new C2933ai(c3243gN9, c3313hm2, a59, c2746Ql4);
                C2594Hm c2594Hm = new C2594Hm(c3243gN9, c3313hm2);
                C3243gN a60 = C3243gN.a(new C4008ui(15, new C3527lm(c4008ui, 0)));
                C2526Dm c2526Dm = new C2526Dm(c3309hi.J, c3795qk, c2746Ql, c4008ui, c2933ai, c2594Hm, c3243gN8, a60);
                Yr yr = new Yr();
                C3243gN a61 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 1));
                C3243gN a62 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 0));
                C3243gN a63 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2676Mj4, (InterfaceC3297hN) yr, (InterfaceC3297hN) c4008ui, c3309hi.f30898o, 8));
                C3243gN a64 = C3243gN.a(new C2689Nf(yr, c4008ui, 17));
                C2987bi c2987bi4 = c3309hi.f30884g;
                C3243gN a65 = C3243gN.a(new C2933ai(c2987bi4, c4008ui, c2526Dm, yr, 7));
                Yr.a(yr, C3243gN.a(new C3850rm(c2727Pj, c3243gN8, c4008ui, c2746Ql4, c2526Dm, c2746Ql, c3044cm, a61, a62, a63, a64, a65, new C3847rj(c2987bi4, c3795qk, 2), c3243gN6, c2987bi3, c2987bi4, a60, a27, c3309hi.f30864S0)));
                C3243gN c3243gN10 = c3201fi2.f30369f1;
                C3243gN c3243gN11 = c3201fi2.f30348X0;
                C3243gN a66 = C3243gN.a(new C2526Dm(a36, a31, c3243gN10, a49, c3243gN11, c2676Mj, c2676Mj3, a24, 1));
                C3243gN a67 = C3243gN.a(new C2988bj(c3309hi.f30876c, a59, C3243gN.a(new C2593Hl(c3201fi2.f30403x, c2676Mj, 1)), a24, a29, 1));
                C3243gN a68 = C3243gN.a(new C3578mj(a36, a31, c3243gN10, a49, c3243gN11, a45, c3309hi.f30898o, c3309hi.f30861R, c3309hi.f30857P, a24, 2));
                if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                    C4835j.f39733C.f39745k.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    c2700Nq = c2700Nq2;
                    C2993bo c2993bo4 = c2700Nq.f26554f;
                    c2993bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                    c2993bo4.c("rendering-configure-webview-start", currentTimeMillis);
                } else {
                    c2700Nq = c2700Nq2;
                }
                C4282zm c4282zm = (C4282zm) c3201fi2.f30352a.f29323u;
                AbstractC3341iD.j(c4282zm);
                AbstractC3341iD.j(c4012um);
                AbstractC3341iD.j(c3959tn);
                C2771Sc c2771Sc = new C2771Sc(c4282zm, c4012um, c3959tn, C3243gN.b(a65));
                if (((InterfaceC2583Hb) c2771Sc.f27489u) != null) {
                    ((C3959tn) c2771Sc.f27490v).b("/nativeAdCustomClick", c2771Sc);
                }
                C3851rn c3851rn = (C3851rn) a66.f();
                C2575Gk c2575Gk = c3851rn.f33740b;
                C3744pn c3744pn = c3959tn.f34386a;
                Objects.requireNonNull(c2575Gk);
                C3798qn c3798qn = new C3798qn(0, c2575Gk);
                C3902sk c3902sk = c3851rn.f33739a;
                C2694Nk c2694Nk = c3851rn.f33741c;
                C2762Rk c2762Rk = c3851rn.f33742d;
                C3365il c3365il = c3851rn.f33743e;
                synchronized (c3744pn) {
                    c3744pn.f33128n = c3902sk;
                    c3744pn.f33129u = c2694Nk;
                    c3744pn.f33130v = c2762Rk;
                    c3744pn.f33131w = c3365il;
                    c3744pn.f33132x = c3798qn;
                }
                St st3 = c3851rn.f33744f;
                Ut ut42 = c3851rn.f33745g;
                C2692Ni c2692Ni = c3851rn.f33746h;
                synchronized (c3959tn) {
                    C3932tD c3932tD = c3959tn.f34398n;
                    if (c3932tD != null) {
                        C2570Gf c2570Gf7 = new C2570Gf(c3959tn, st3, ut42, c2692Ni);
                        c3932tD.a(new LD(0, c3932tD, c2570Gf7), c3959tn.f34390e);
                    }
                }
                final C3260gn c3260gn = (C3260gn) a67.f();
                InterfaceC4061vh h9 = c4012um.h();
                c3260gn.getClass();
                if (h9 != null) {
                    View V8 = h9.V();
                    C2508Cl c2508Cl = c3260gn.f30652c;
                    c2508Cl.Q1(V8);
                    C3152en c3152en = new C3152en(h9, 1);
                    Executor executor2 = c3260gn.f30650a;
                    c2508Cl.H1(c3152en, executor2);
                    c2508Cl.H1(new C3152en(h9, 0), executor2);
                    C3095dj c3095dj = c3260gn.f30651b;
                    c2508Cl.H1(c3095dj, executor2);
                    c3095dj.f29823n = h9;
                    C2657Lh g02 = h9.g0();
                    if (!((Boolean) rVar3.f40210c.a(AbstractC3569ma.Ab)).booleanValue() || g02 == null) {
                        i13 = 0;
                    } else {
                        g02.c("/click");
                        InterfaceC2542El interfaceC2542El = g02.f26131D;
                        C2927ac c2927ac = AbstractC3195fc.f30252a;
                        C2692Ni c2692Ni2 = c3260gn.f30653d;
                        i13 = 0;
                        g02.b("/click", new C3088dc(0, interfaceC2542El, c2692Ni2));
                        g02.y(c2692Ni2, null, null);
                    }
                    h9.a1("/trackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                        @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                        public final void e(Object obj, Map map) {
                            switch (i13) {
                                case 0:
                                    C3095dj c3095dj2 = c3260gn.f30651b;
                                    c3095dj2.f29827x = true;
                                    c3095dj2.a();
                                    break;
                                default:
                                    c3260gn.f30651b.f29827x = false;
                                    break;
                            }
                        }
                    });
                    final int i17 = 1;
                    h9.a1("/untrackActiveViewUnit", new InterfaceC3249gc() { // from class: com.google.android.gms.internal.ads.fn
                        @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
                        public final void e(Object obj, Map map) {
                            switch (i17) {
                                case 0:
                                    C3095dj c3095dj2 = c3260gn.f30651b;
                                    c3095dj2.f29827x = true;
                                    c3095dj2.a();
                                    break;
                                default:
                                    c3260gn.f30651b.f29827x = false;
                                    break;
                            }
                        }
                    });
                    h9.g0().f26146T = c3260gn.f30654e;
                }
                C4121wn c4121wn = (C4121wn) a68.f();
                C4175xn c4175xn = c2700Nq.f26553e;
                InterfaceC4061vh i18 = c4012um.i();
                c4121wn.getClass();
                C4013un c4013un = c4175xn.f35050a;
                C2575Gk c2575Gk2 = c4121wn.f34872b;
                Objects.requireNonNull(c2575Gk2);
                C3798qn c3798qn2 = new C3798qn(1, c2575Gk2);
                C3902sk c3902sk2 = c4121wn.f34871a;
                C2694Nk c2694Nk2 = c4121wn.f34873c;
                C2762Rk c2762Rk2 = c4121wn.f34874d;
                C3365il c3365il2 = c4121wn.f34875e;
                C2525Dl c2525Dl = c4121wn.f34876f;
                synchronized (c4013un) {
                    synchronized (c4013un) {
                        c4013un.f33128n = c3902sk2;
                        c4013un.f33129u = c2694Nk2;
                        c4013un.f33130v = c2762Rk2;
                        c4013un.f33131w = c3365il2;
                        c4013un.f33132x = c3798qn2;
                    }
                    if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue() && i18 != null && i18.g0() != null) {
                        C2657Lh g03222 = i18.g0();
                        C2692Ni c2692Ni3222 = c4121wn.f34879j;
                        C2800Tp c2800Tp222 = c4121wn.i;
                        g03222.x(c2692Ni3222, c2800Tp222, c4121wn.f34878h);
                        g03222.y(c2692Ni3222, c2800Tp222, c4121wn.f34877g);
                    }
                    if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                        com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c2700Nq.f26554f, "rendering-configure-webview-end");
                    }
                    return (C3797qm) yr.f();
                }
                c4013un.f34588y = c2525Dl;
                if (((Boolean) rVar3.f40210c.a(AbstractC3569ma.Bb)).booleanValue()) {
                    C2657Lh g032222 = i18.g0();
                    C2692Ni c2692Ni32222 = c4121wn.f34879j;
                    C2800Tp c2800Tp2222 = c4121wn.i;
                    g032222.x(c2692Ni32222, c2800Tp2222, c4121wn.f34878h);
                    g032222.y(c2692Ni32222, c2800Tp2222, c4121wn.f34877g);
                }
                if (((Boolean) rVar3.f40210c.a(c3301ha4)).booleanValue()) {
                }
                return (C3797qm) yr.f();
            }
        };
        FD fd2222 = new FD(o6222, true, false);
        fd2222.f24757I = new ED(fd2222, callable2222, this.f26550b);
        fd2222.w();
        return fd2222;
    }
}
