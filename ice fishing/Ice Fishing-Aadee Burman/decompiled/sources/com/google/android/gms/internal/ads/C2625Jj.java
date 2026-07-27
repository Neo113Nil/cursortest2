package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C4826a;
import p2.C4835j;
import u2.C5076g;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Jj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2625Jj implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25734d;

    public /* synthetic */ C2625Jj(int i, Object obj, Object obj2, Object obj3) {
        this.f25731a = i;
        this.f25732b = obj;
        this.f25733c = obj2;
        this.f25734d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        switch (this.f25731a) {
            case 0:
                AbstractC2557Fj abstractC2557Fj = (AbstractC2557Fj) obj;
                C2659Lj c2659Lj = (C2659Lj) this.f25732b;
                c2659Lj.getClass();
                if (abstractC2557Fj != null) {
                    ((C3864s) this.f25733c).mo11n(abstractC2557Fj);
                }
                return QC.s((N3.a) this.f25734d, ((Long) AbstractC2980bb.f29295a.r()).longValue(), TimeUnit.MILLISECONDS, c2659Lj.f26164b);
            case 1:
                q2.f1 a9 = q2.f1.a();
                C3314hn c3314hn = (C3314hn) this.f25732b;
                InterfaceC4061vh a10 = c3314hn.f30932c.a(a9, null, null);
                Z8 z82 = new Z8(a10);
                c3314hn.a(a10, (C4826a) this.f25733c, (C4221yf) this.f25734d);
                a10.g0().f26128A = new Qx(23, z82);
                a10.loadUrl((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32018F4));
                return z82;
            case 2:
                String str = (String) this.f25733c;
                JSONObject jSONObject = (JSONObject) this.f25734d;
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                C3088dc c3088dc = ((C3959tn) this.f25732b).f34393h;
                c3088dc.getClass();
                C3467kg c3467kg = new C3467kg();
                u2.D d2 = C4835j.f39730C.f39735c;
                String uuid = UUID.randomUUID().toString();
                c3088dc.a(uuid, new C3679oc(c3088dc, c3467kg));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", uuid);
                    jSONObject2.put("args", jSONObject);
                    interfaceC4061vh.a(str, jSONObject2);
                } catch (Exception e9) {
                    c3467kg.c(e9);
                }
                return c3467kg;
            case 3:
                C3747pq c3747pq = (C3747pq) this.f25732b;
                c3747pq.getClass();
                C3301ha c3301ha = AbstractC3569ma.f32073M2;
                q2.r rVar = q2.r.f40204e;
                boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
                C2993bo c2993bo = c3747pq.i;
                if (booleanValue) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo, "rendering-webview-creation-start");
                }
                Yt yt = (Yt) this.f25734d;
                C2570Gf c2570Gf = yt.f28754b;
                C3052cu c3052cu = c3747pq.f33140c;
                St st = (St) this.f25733c;
                final InterfaceC4061vh a11 = c3747pq.f33139b.a(c3052cu.f29625f, st, (Ut) c2570Gf.f25043v);
                a11.Y0(st.f27603W);
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo, "rendering-webview-creation-end");
                }
                C3467kg c3467kg2 = new C3467kg();
                C3481ku c3481ku = new C3481ku(yt, st, (String) null);
                C5110a c5110a = c3747pq.f33142e;
                C3357ic c3357ic = c3747pq.f33143f;
                boolean z3 = c3747pq.f33144g;
                C3357ic c3357ic2 = c3357ic;
                S0.s sVar = new S0.s(14, new C3854rq(c5110a, c3467kg2, st, a11, c3052cu, z3, c3357ic, c3747pq.f33145h, c3747pq.f33146j), a11);
                N6.i iVar = new N6.i(st.f27607a0, 3);
                C3469ki c3469ki = c3747pq.f33138a;
                C3362ii c3362ii = new C3362ii(c3469ki.f31535c, c3469ki.f31538d, c3481ku, sVar, iVar);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo, "rendering-ad-component-creation-end");
                }
                C3243gN c3243gN = c3362ii.f31095U0;
                C2595Hn c2595Hn = (C2595Hn) c3243gN.f();
                if (true != z3) {
                    c3357ic2 = null;
                }
                c2595Hn.a(a11, false, c3357ic2, c2993bo);
                c3467kg2.b(c3362ii);
                final int i = 0;
                ((C2507Ck) c3362ii.f31079F0.f()).H1(new InterfaceC2524Dk() { // from class: com.google.android.gms.internal.ads.oq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
                    public final /* synthetic */ void w() {
                        switch (i) {
                            case 0:
                                InterfaceC4061vh interfaceC4061vh2 = a11;
                                if (interfaceC4061vh2.g0() != null) {
                                    interfaceC4061vh2.g0().A();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC4061vh interfaceC4061vh3 = a11;
                                if (interfaceC4061vh3.g0() != null) {
                                    interfaceC4061vh3.g0().A();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC4061vh interfaceC4061vh4 = a11;
                                if (interfaceC4061vh4.g0() != null) {
                                    interfaceC4061vh4.g0().A();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC4061vh interfaceC4061vh5 = a11;
                                if (interfaceC4061vh5.g0() != null) {
                                    interfaceC4061vh5.g0().A();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC3413jg.f31275h);
                Wt wt = st.f27640s;
                String str2 = wt.f28426a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32293k6)).booleanValue() && ((C3155eq) c3362ii.f31077D0.f()).a()) {
                    str2 = AbstractC2691Nh.a(str2, AbstractC2691Nh.b(st));
                }
                return QC.u(C2595Hn.b(a11, wt.f28427b, str2, c2993bo, (Vu) c3469ki.f31544f.f()), new C3203fk(1, a11, st, c3362ii), c3747pq.f33141d);
            case 4:
                C4124wq c4124wq = (C4124wq) this.f25732b;
                c4124wq.getClass();
                C3301ha c3301ha2 = AbstractC3569ma.f32073M2;
                q2.r rVar2 = q2.r.f40204e;
                boolean booleanValue2 = ((Boolean) rVar2.f40207c.a(c3301ha2)).booleanValue();
                C2993bo c2993bo2 = c4124wq.f34890g;
                if (booleanValue2) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo2, "rendering-webview-creation-start");
                }
                St st2 = (St) this.f25734d;
                Context context = c4124wq.f34885b;
                q2.f1 k9 = AbstractC3043cl.k(context, st2.f27644u);
                Yt yt2 = (Yt) this.f25733c;
                final InterfaceC4061vh a12 = c4124wq.f34886c.a(k9, st2, (Ut) yt2.f28754b.f25043v);
                a12.Y0(st2.f27603W);
                C3301ha c3301ha3 = AbstractC3569ma.W8;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar2.f40207c;
                View a13 = (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(c3301ha3)).booleanValue() && st2.f27619g0) ? ViewTreeObserverOnScrollChangedListenerC4117wj.a(context, a12.V(), st2) : new C2646Kn(context, a12.V(), (C5076g) c4124wq.f34889f.apply(st2));
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(c3301ha2)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo2, "rendering-webview-creation-end");
                }
                C3481ku c3481ku2 = new C3481ku(yt2, st2, (String) null);
                C2570Gf c2570Gf2 = new C2570Gf(a13, a12, new C4070vq(a12), k9.f40131B ? new Tt(-3, 0, true) : new Tt(k9.f40143x, k9.f40140u, false));
                C3577mi c3577mi = c4124wq.f34884a;
                C3523li c3523li = new C3523li(c3577mi.f32498d, c3577mi.f32501e, c3481ku2, c2570Gf2);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(c3301ha2)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo2, "rendering-ad-component-creation-end");
                }
                C3243gN c3243gN2 = c3523li.f31807S0;
                ((C2595Hn) c3243gN2.f()).a(a12, false, null, c2993bo2);
                C2507Ck c2507Ck = (C2507Ck) c3523li.f31795G0.f();
                final int i6 = 1;
                InterfaceC2524Dk interfaceC2524Dk = new InterfaceC2524Dk() { // from class: com.google.android.gms.internal.ads.oq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
                    public final /* synthetic */ void w() {
                        switch (i6) {
                            case 0:
                                InterfaceC4061vh interfaceC4061vh2 = a12;
                                if (interfaceC4061vh2.g0() != null) {
                                    interfaceC4061vh2.g0().A();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC4061vh interfaceC4061vh3 = a12;
                                if (interfaceC4061vh3.g0() != null) {
                                    interfaceC4061vh3.g0().A();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC4061vh interfaceC4061vh4 = a12;
                                if (interfaceC4061vh4.g0() != null) {
                                    interfaceC4061vh4.g0().A();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC4061vh interfaceC4061vh5 = a12;
                                if (interfaceC4061vh5.g0() != null) {
                                    interfaceC4061vh5.g0().A();
                                    break;
                                }
                                break;
                        }
                    }
                };
                C3360ig c3360ig = AbstractC3413jg.f31275h;
                c2507Ck.H1(interfaceC2524Dk, c3360ig);
                Wt wt2 = st2.f27640s;
                String str3 = wt2.f28426a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.f32293k6)).booleanValue() && ((C3155eq) c3523li.f31793E0.f()).a()) {
                    str3 = AbstractC2691Nh.a(str3, AbstractC2691Nh.b(st2));
                }
                C3467kg b9 = C2595Hn.b(a12, wt2.f28427b, str3, c2993bo2, (Vu) c3577mi.f32546u0.f());
                XD xd = b9.f31479n;
                boolean z6 = st2.f27593M;
                Executor executor = c4124wq.f34888e;
                if (z6) {
                    xd.a(new RunnableC4009uj(a12, 5), executor);
                }
                xd.a(new RunnableC3048cq(2, c4124wq, a12), executor);
                return QC.u(b9, new C2722Pe(2, c3523li), c3360ig);
            case 5:
                return QC.c(ViewTreeObserverOnScrollChangedListenerC4117wj.a(((C3908sq) this.f25732b).f34153b, (View) this.f25733c, (St) this.f25734d));
            case 6:
                return QC.c(ViewTreeObserverOnScrollChangedListenerC4117wj.a(((C2479Aq) this.f25732b).f23752b, (View) this.f25733c, (St) this.f25734d));
            case 7:
                C2615Iq c2615Iq = (C2615Iq) this.f25732b;
                c2615Iq.getClass();
                C3301ha c3301ha4 = AbstractC3569ma.f32073M2;
                q2.r rVar3 = q2.r.f40204e;
                boolean booleanValue3 = ((Boolean) rVar3.f40207c.a(c3301ha4)).booleanValue();
                C2993bo c2993bo3 = c2615Iq.f25604j;
                if (booleanValue3) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo3, "rendering-webview-creation-start");
                }
                Yt yt3 = (Yt) this.f25734d;
                C2570Gf c2570Gf3 = yt3.f28754b;
                C3052cu c3052cu2 = c2615Iq.f25599d;
                St st3 = (St) this.f25733c;
                final InterfaceC4061vh a14 = c2615Iq.f25598c.a(c3052cu2.f29625f, st3, (Ut) c2570Gf3.f25043v);
                a14.Y0(st3.f27603W);
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3 = rVar3.f40207c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(c3301ha4)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo3, "rendering-webview-creation-end");
                }
                C3467kg c3467kg3 = new C3467kg();
                C3481ku c3481ku3 = new C3481ku(yt3, st3, (String) null);
                C5110a c5110a2 = c2615Iq.f25601f;
                C3357ic c3357ic3 = c2615Iq.f25602g;
                Context context2 = c2615Iq.f25597b;
                boolean z9 = c2615Iq.f25603h;
                S0.s sVar2 = new S0.s(14, new C2598Hq(context2, c5110a2, c3467kg3, st3, a14, c3052cu2, z9, c3357ic3, c2615Iq.i, c2615Iq.f25605k), a14);
                C3793qi c3793qi = (C3793qi) c2615Iq.f25606l;
                C3739pi c3739pi = new C3739pi(c3793qi.f33311b, c3793qi.f33314c, c3481ku3, sVar2);
                c3467kg3.b(c3739pi);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(c3301ha4)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo3, "rendering-ad-component-creation-end");
                }
                final int i9 = 2;
                ((C2507Ck) c3739pi.f33081E0.f()).H1(new InterfaceC2524Dk() { // from class: com.google.android.gms.internal.ads.oq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
                    public final /* synthetic */ void w() {
                        switch (i9) {
                            case 0:
                                InterfaceC4061vh interfaceC4061vh2 = a14;
                                if (interfaceC4061vh2.g0() != null) {
                                    interfaceC4061vh2.g0().A();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC4061vh interfaceC4061vh3 = a14;
                                if (interfaceC4061vh3.g0() != null) {
                                    interfaceC4061vh3.g0().A();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC4061vh interfaceC4061vh4 = a14;
                                if (interfaceC4061vh4.g0() != null) {
                                    interfaceC4061vh4.g0().A();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC4061vh interfaceC4061vh5 = a14;
                                if (interfaceC4061vh5.g0() != null) {
                                    interfaceC4061vh5.g0().A();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC3413jg.f31275h);
                Wt wt3 = st3.f27640s;
                String str4 = wt3.f28426a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka3.a(AbstractC3569ma.f32293k6)).booleanValue() && ((C3155eq) c3739pi.C0.f()).a()) {
                    str4 = AbstractC2691Nh.a(str4, AbstractC2691Nh.b(st3));
                }
                C3243gN c3243gN3 = c3739pi.f33102W0;
                C2595Hn c2595Hn2 = (C2595Hn) c3243gN3.f();
                if (true != z9) {
                    c3357ic3 = null;
                }
                c2595Hn2.a(a14, true, c3357ic3, c2993bo3);
                return QC.u(C2595Hn.b(a14, wt3.f28427b, str4, c2993bo3, (Vu) c3793qi.f33348o0.f()), new C3203fk(2, a14, st3, c3739pi), c2615Iq.f25600e);
            case 8:
                JSONArray jSONArray = (JSONArray) obj;
                C2700Nq c2700Nq = (C2700Nq) this.f25732b;
                c2700Nq.getClass();
                if (jSONArray.length() == 0) {
                    return QC.k(new C3208fp(3));
                }
                Yt yt4 = (Yt) this.f25733c;
                C3052cu c3052cu3 = (C3052cu) yt4.f28753a.f31863u;
                St st4 = (St) this.f25734d;
                int i10 = c3052cu3.f29630l;
                if (i10 <= 1) {
                    return QC.u(c2700Nq.c(yt4, st4, jSONArray.getJSONObject(0)), L2.f26029k, c2700Nq.f26550b);
                }
                int length = jSONArray.length();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32082N2)).booleanValue()) {
                    c2700Nq.f26554f.b("nsl", String.valueOf(length));
                }
                c2700Nq.f26552d.a(Math.min(length, i10));
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 < length) {
                        arrayList.add(c2700Nq.c(yt4, st4, jSONArray.getJSONObject(i11)));
                    } else {
                        arrayList.add(QC.k(new C3208fp(3)));
                    }
                }
                return QC.c(arrayList);
            default:
                C2615Iq c2615Iq2 = (C2615Iq) this.f25732b;
                c2615Iq2.getClass();
                C3301ha c3301ha5 = AbstractC3569ma.f32073M2;
                q2.r rVar4 = q2.r.f40204e;
                boolean booleanValue4 = ((Boolean) rVar4.f40207c.a(c3301ha5)).booleanValue();
                C2993bo c2993bo4 = c2615Iq2.f25604j;
                if (booleanValue4) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo4, "rendering-webview-creation-start");
                }
                Yt yt5 = (Yt) this.f25734d;
                C2570Gf c2570Gf4 = yt5.f28754b;
                C3052cu c3052cu4 = c2615Iq2.f25599d;
                St st5 = (St) this.f25733c;
                C2612In c2612In = c2615Iq2.f25598c;
                final InterfaceC4061vh a15 = c2612In.a(c3052cu4.f29625f, st5, (Ut) c2570Gf4.f25043v);
                a15.Y0(st5.f27603W);
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4 = rVar4.f40207c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4.a(c3301ha5)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo4, "rendering-webview-creation-end");
                }
                C3467kg c3467kg4 = new C3467kg();
                C3481ku c3481ku4 = new C3481ku(yt5, st5, (String) null);
                C5110a c5110a3 = c2615Iq2.f25601f;
                C3357ic c3357ic4 = c2615Iq2.f25602g;
                Context context3 = c2615Iq2.f25597b;
                boolean z10 = c2615Iq2.f25603h;
                BinderC2880Yp binderC2880Yp = c2615Iq2.i;
                C2993bo c2993bo5 = c2615Iq2.f25604j;
                C2493Bn c2493Bn = new C2493Bn(new E3.m(context3, c2612In, c3052cu4, c5110a3, st5, c3467kg4, a15, c3357ic4, z10, binderC2880Yp, c2993bo5, c2615Iq2.f25605k), a15, 0);
                C3900si c3900si = (C3900si) c2615Iq2.f25606l;
                C3846ri c3846ri = new C3846ri(c3900si.f34061c, c3900si.f34064d, c3481ku4, c2493Bn);
                c3467kg4.b(c3846ri);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4.a(c3301ha5)).booleanValue()) {
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39730C.f39742k, c2993bo5, "rendering-ad-component-creation-end");
                }
                a15.a1("/reward", new C2818Vb(5, (C2610Il) c3846ri.f33672V0.f()));
                final int i12 = 3;
                ((C2507Ck) c3846ri.f33653E0.f()).H1(new InterfaceC2524Dk() { // from class: com.google.android.gms.internal.ads.oq
                    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
                    public final /* synthetic */ void w() {
                        switch (i12) {
                            case 0:
                                InterfaceC4061vh interfaceC4061vh2 = a15;
                                if (interfaceC4061vh2.g0() != null) {
                                    interfaceC4061vh2.g0().A();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC4061vh interfaceC4061vh3 = a15;
                                if (interfaceC4061vh3.g0() != null) {
                                    interfaceC4061vh3.g0().A();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC4061vh interfaceC4061vh4 = a15;
                                if (interfaceC4061vh4.g0() != null) {
                                    interfaceC4061vh4.g0().A();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC4061vh interfaceC4061vh5 = a15;
                                if (interfaceC4061vh5.g0() != null) {
                                    interfaceC4061vh5.g0().A();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC3413jg.f31275h);
                C3243gN c3243gN4 = c3846ri.f33674W0;
                ((C2595Hn) c3243gN4.f()).a(a15, true, true != z10 ? null : c3357ic4, c2993bo5);
                Wt wt4 = st5.f27640s;
                String str5 = wt4.f28426a;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka4.a(AbstractC3569ma.f32293k6)).booleanValue() && ((C3155eq) c3846ri.C0.f()).a()) {
                    str5 = AbstractC2691Nh.a(str5, AbstractC2691Nh.b(st5));
                }
                return QC.u(C2595Hn.b(a15, wt4.f28427b, str5, c2993bo5, (Vu) c3900si.f34073g.f()), new C3203fk(3, a15, st5, c3846ri), c2615Iq2.f25600e);
        }
    }

    public /* synthetic */ C2625Jj(InterfaceC3317hq interfaceC3317hq, St st, Yt yt, C3472kl c3472kl, int i) {
        this.f25731a = i;
        this.f25732b = interfaceC3317hq;
        this.f25733c = st;
        this.f25734d = yt;
    }
}
