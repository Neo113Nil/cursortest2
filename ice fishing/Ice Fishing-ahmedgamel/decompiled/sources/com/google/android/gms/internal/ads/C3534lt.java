package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3534lt implements Ir, InterfaceC4289zt, InterfaceC3742pl, j3.c, KD, InterfaceC3123eB, InterfaceC3231gB, InterfaceC3529lo, MP {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31862n;

    /* renamed from: u, reason: collision with root package name */
    public Object f31863u;

    public /* synthetic */ C3534lt(int i, Object obj) {
        this.f31862n = i;
        this.f31863u = obj;
    }

    public void A(String str, String str2, long j6, int i, int i6, String str3, Lv lv, String str4) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v(str2, Long.toString(j6));
        if (lv != null) {
            a9.v("ad_unit_id", lv.f26192a);
            a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
            a9.v(com.anythink.expressad.f.a.b.aB, lv.f26194c);
        }
        a9.v(NativeAdvancedJsUtils.f17906p, str);
        if (str3 != null) {
            a9.v("gqi", str3);
        }
        if (i >= 0) {
            a9.v("max_ads", Integer.toString(i));
        }
        if (i6 >= 0) {
            a9.v("cache_size", Integer.toString(i6));
        }
        a9.v("pv", str4);
        a9.y();
    }

    public void B(String str, long j6, String str2, String str3, k2.b bVar, int i, int i6, int i9, int i10, int i11) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, str);
        a9.v("pat", Long.toString(j6));
        a9.v(com.anythink.expressad.f.a.b.aB, str2);
        a9.v("ad_unit_id", str3);
        a9.v("max_ads", Integer.toString(i));
        a9.v("cache_size", Integer.toString(i6));
        a9.v("tpcnt", Integer.toString(i10));
        a9.v("mpl", Integer.toString(i11));
        if (bVar != null) {
            a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, bVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i9 > 0) {
            a9.v("nptr", Integer.toString(i9));
        }
        a9.y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        switch (this.f31862n) {
            case 3:
                Iu iu = (Iu) this.f31863u;
                ((Mu) obj).x((Ju) iu.f25613n, iu.f25614u);
                break;
            default:
                ((InterfaceC4213yO) obj).n((IOException) this.f31863u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void b(int i, C3834rN c3834rN, long j6, int i6) {
        ((MediaCodec) this.f31863u).queueSecureInputBuffer(i, 0, c3834rN.i, j6, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3231gB
    /* renamed from: c */
    public /* synthetic */ Object mo15c() {
        int i = EN.f24583A;
        return (C3649o) this.f31863u;
    }

    @Override // j3.c
    public void f(j3.m mVar) {
        Wx wx = (Wx) this.f31863u;
        if (mVar.f38372d) {
            wx.cancel(false);
            return;
        }
        if (mVar.i()) {
            wx.d(mVar.g());
            return;
        }
        Exception f3 = mVar.f();
        if (f3 == null) {
            throw new IllegalStateException();
        }
        wx.e(f3);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void g(Bundle bundle) {
        ((MediaCodec) this.f31863u).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void i(int i, int i6, int i9, long j6) {
        ((MediaCodec) this.f31863u).queueInputBuffer(i, 0, i6, j6, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3123eB
    public /* synthetic */ Iterator j(com.bumptech.glide.manager.p pVar, CharSequence charSequence) {
        return new C2963bB(pVar, charSequence, (PA) this.f31863u, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4289zt
    public /* synthetic */ C3415ji k(InterfaceC4235yt interfaceC4235yt) {
        return ((Mt) this.f31863u).b(interfaceC4235yt);
    }

    public JSONObject l(View view) {
        int currentModeType;
        JSONObject a9 = AbstractC3914sw.a(0, 0, 0, 0);
        UiModeManager uiModeManager = AbstractC3043cl.f29571P;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : AbstractC2968bG.f29270T;
        int i6 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            a9.put("noOutputDevice", i6 == 0);
            return a9;
        } catch (JSONException e9) {
            MA.j("Error with setting output device status", e9);
            return a9;
        }
    }

    public void m(int i, long j6, Lv lv, String str) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, "start_preload");
        a9.v("sp_ts", Long.toString(j6));
        a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
        a9.v("ad_unit_id", lv.f26192a);
        a9.v(com.anythink.expressad.f.a.b.aB, lv.f26194c);
        a9.v("max_ads", Integer.toString(i));
        a9.v("pv", str);
        a9.y();
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        Ly ly = (Ly) obj;
        Gy gy = (Gy) ((Py) this.f31863u).f26892c;
        synchronized (gy.f25186m) {
            C3386j6 c3386j6 = gy.f25189p;
            String c9 = ly.c();
            c3386j6.h();
            ((C3440k6) c3386j6.f27721u).K(c9);
        }
    }

    public void o(Exception exc) {
        AbstractC2968bG.J("MediaCodecAudioRenderer", "Audio sink error", exc);
        S0.l lVar = ((C3944tP) this.f31863u).f34279l1;
        Handler handler = (Handler) lVar.f2797u;
        if (handler != null) {
            handler.post(new WO(lVar, exc, 5));
        }
    }

    public void p(String str, InterfaceC3511lN interfaceC3511lN) {
        AbstractC3341iD.f(interfaceC3511lN, "provider");
        ((LinkedHashMap) this.f31863u).put(str, interfaceC3511lN);
    }

    public void r(String str, InterfaceC3511lN interfaceC3511lN) {
        p(str, interfaceC3511lN);
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2557Fj abstractC2557Fj) {
        C3256gj c3256gj = (C3256gj) abstractC2557Fj;
        BinderC3642nt binderC3642nt = (BinderC3642nt) this.f31863u;
        synchronized (binderC3642nt) {
            try {
                C3256gj c3256gj2 = binderC3642nt.f32796D;
                if (c3256gj2 != null) {
                    c3256gj2.d();
                }
                binderC3642nt.f32796D = c3256gj;
                InterfaceC4061vh interfaceC4061vh = c3256gj.f30606l;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.r0(binderC3642nt);
                }
                binderC3642nt.f32802y.c(new BinderC3310hj(c3256gj, binderC3642nt, binderC3642nt.f32802y, binderC3642nt.f32793A));
                c3256gj.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(EnumMap enumMap, long j6) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, "start_preload");
        a9.v("sp_ts", Long.toString(j6));
        a9.v("pv", "1");
        for (k2.b bVar : enumMap.keySet()) {
            String valueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            a9.v(valueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(bVar)).intValue()));
        }
        a9.y();
    }

    public C3403jN u() {
        return new C3403jN((LinkedHashMap) this.f31863u);
    }

    public void v(int i, int i6, long j6, Long l9, String str, Lv lv, String str2) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v("plaac_ts", Long.toString(j6));
        a9.v("max_ads", Integer.toString(i));
        a9.v("cache_size", Integer.toString(i6));
        a9.v(NativeAdvancedJsUtils.f17906p, "is_ad_available");
        if (lv != null) {
            a9.v("ad_unit_id", lv.f26192a);
            a9.v(com.anythink.expressad.f.a.b.aB, lv.f26194c);
            a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
        }
        if (l9 != null) {
            a9.v("plaay_ts", Long.toString(l9.longValue()));
        }
        if (str != null) {
            a9.v("gqi", str);
        }
        a9.v("pv", str2);
        a9.y();
    }

    public void x(long j6, int i, int i6, String str, Lv lv, String str2) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v("ppla_ts", Long.toString(j6));
        a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
        a9.v("ad_unit_id", lv.f26192a);
        a9.v(com.anythink.expressad.f.a.b.aB, lv.f26194c);
        a9.v("max_ads", Integer.toString(i));
        a9.v("cache_size", Integer.toString(i6));
        a9.v(NativeAdvancedJsUtils.f17906p, "poll_ad");
        if (str != null) {
            a9.v("gqi", str);
        }
        a9.v("pv", str2);
        a9.y();
    }

    public void y(long j6, long j9, long j10, long j11, long j12) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, "iic");
        a9.v("pat", Long.toString(j6));
        a9.v("bot", Long.toString(j9));
        a9.v("cim", Long.toString(j10));
        a9.v("mbot", Long.toString(j11));
        a9.v("mim", Long.toString(j12));
        a9.y();
    }

    public void z(String str, long j6, String str2, String str3, k2.b bVar, int i, int i6, int i9) {
        S0.e a9 = ((C3153eo) this.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, str);
        a9.v("pat", Long.toString(j6));
        a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, bVar.name().toLowerCase(Locale.ENGLISH));
        a9.v("max_ads", Integer.toString(i));
        a9.v("cache_size", Integer.toString(i6));
        a9.v("pas", Integer.toString(i9));
        a9.v("pv", "2");
        a9.v("ad_unit_id", str3);
        a9.v(com.anythink.expressad.f.a.b.aB, str2);
        a9.y();
    }

    public /* synthetic */ C3534lt(C4159xO c4159xO, C3246gQ c3246gQ, C3514lQ c3514lQ, IOException iOException, boolean z3) {
        this.f31862n = 14;
        this.f31863u = iOException;
    }

    @Override // com.google.android.gms.internal.ads.Ir, com.google.android.gms.internal.ads.MP
    /* renamed from: c, reason: collision with other method in class */
    public void mo12c() {
        switch (this.f31862n) {
            case 0:
                BinderC3642nt binderC3642nt = (BinderC3642nt) this.f31863u;
                synchronized (binderC3642nt) {
                    binderC3642nt.f32796D = null;
                }
                return;
            default:
                return;
        }
    }

    public C3534lt(byte b9, int i) {
        this.f31862n = i;
        switch (i) {
            case 15:
                break;
            default:
                this.f31863u = XB.o(new Object[]{1, 5}, 2);
                break;
        }
    }

    public C3534lt(int i) {
        this.f31862n = 10;
        this.f31863u = WC.h(i);
    }

    public C3534lt(BinderC3642nt binderC3642nt) {
        this.f31862n = 0;
        Objects.requireNonNull(binderC3642nt);
        this.f31863u = binderC3642nt;
    }

    public C3534lt(Py py) {
        this.f31862n = 7;
        Objects.requireNonNull(py);
        this.f31863u = py;
    }

    public /* synthetic */ C3534lt(C3944tP c3944tP) {
        this.f31862n = 16;
        Objects.requireNonNull(c3944tP);
        this.f31863u = c3944tP;
    }

    private final void q() {
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void d() {
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void e() {
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void h() {
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
    }
}
