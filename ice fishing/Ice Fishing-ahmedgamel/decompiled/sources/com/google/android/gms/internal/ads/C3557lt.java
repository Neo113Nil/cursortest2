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
public final class C3557lt implements Ir, InterfaceC4312zt, InterfaceC3765pl, l3.c, KD, InterfaceC3146eB, InterfaceC3254gB, InterfaceC3606mo, NP {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32642n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32643u;

    public /* synthetic */ C3557lt(int i, Object obj) {
        this.f32642n = i;
        this.f32643u = obj;
    }

    public void A(String str, String str2, long j6, int i, int i4, String str3, Lv lv, String str4) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M(str2, Long.toString(j6));
        if (lv != null) {
            a9.M("ad_unit_id", lv.f26983a);
            a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
            a9.M(com.anythink.expressad.f.a.b.aB, lv.f26985c);
        }
        a9.M(NativeAdvancedJsUtils.f18693p, str);
        if (str3 != null) {
            a9.M("gqi", str3);
        }
        if (i >= 0) {
            a9.M("max_ads", Integer.toString(i));
        }
        if (i4 >= 0) {
            a9.M("cache_size", Integer.toString(i4));
        }
        a9.M("pv", str4);
        a9.N();
    }

    public void B(String str, long j6, String str2, String str3, m2.b bVar, int i, int i4, int i6, int i9, int i10) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, str);
        a9.M("pat", Long.toString(j6));
        a9.M(com.anythink.expressad.f.a.b.aB, str2);
        a9.M("ad_unit_id", str3);
        a9.M("max_ads", Integer.toString(i));
        a9.M("cache_size", Integer.toString(i4));
        a9.M("tpcnt", Integer.toString(i9));
        a9.M("mpl", Integer.toString(i10));
        if (bVar != null) {
            a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, bVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i6 > 0) {
            a9.M("nptr", Integer.toString(i6));
        }
        a9.N();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        switch (this.f32642n) {
            case 3:
                Iu iu = (Iu) this.f32643u;
                ((Mu) obj).w((Ju) iu.f26366n, iu.f26367u);
                break;
            default:
                ((InterfaceC4236yO) obj).n((IOException) this.f32643u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.NP
    public void b(int i, C3857rN c3857rN, long j6, int i4) {
        ((MediaCodec) this.f32643u).queueSecureInputBuffer(i, 0, c3857rN.i, j6, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3254gB
    /* renamed from: c */
    public /* synthetic */ Object mo14c() {
        int i = EN.f25344A;
        return (C3672o) this.f32643u;
    }

    @Override // com.google.android.gms.internal.ads.NP
    public void f(Bundle bundle) {
        ((MediaCodec) this.f32643u).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.NP
    public void g(int i, int i4, int i6, long j6) {
        ((MediaCodec) this.f32643u).queueInputBuffer(i, 0, i4, j6, i6);
    }

    public JSONObject i(View view) {
        int currentModeType;
        JSONObject a9 = AbstractC3937sw.a(0, 0, 0, 0);
        UiModeManager uiModeManager = AbstractC3066cl.f30356P;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : AbstractC2991bG.f30058T;
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            a9.put("noOutputDevice", i4 == 0);
            return a9;
        } catch (JSONException e9) {
            MA.j("Error with setting output device status", e9);
            return a9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3146eB
    public /* synthetic */ Iterator j(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        return new C2986bB(oVar, charSequence, (PA) this.f32643u, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4312zt
    public /* synthetic */ C3438ji k(InterfaceC4258yt interfaceC4258yt) {
        return ((Mt) this.f32643u).b(interfaceC4258yt);
    }

    public void l(int i, long j6, Lv lv, String str) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, "start_preload");
        a9.M("sp_ts", Long.toString(j6));
        a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
        a9.M("ad_unit_id", lv.f26983a);
        a9.M(com.anythink.expressad.f.a.b.aB, lv.f26985c);
        a9.M("max_ads", Integer.toString(i));
        a9.M("pv", str);
        a9.N();
    }

    public void m(Exception exc) {
        AbstractC2991bG.J("MediaCodecAudioRenderer", "Audio sink error", exc);
        S0.l lVar = ((C3967tP) this.f32643u).f35065g1;
        Handler handler = (Handler) lVar.f2926u;
        if (handler != null) {
            handler.post(new WO(lVar, exc, 5));
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        Ly ly = (Ly) obj;
        Gy gy = (Gy) ((Py) this.f32643u).f27679c;
        synchronized (gy.f25958m) {
            C3409j6 c3409j6 = gy.f25961p;
            String c9 = ly.c();
            c3409j6.h();
            ((C3463k6) c3409j6.f28504u).K(c9);
        }
    }

    public void o(String str, InterfaceC3534lN interfaceC3534lN) {
        AbstractC3364iD.f(interfaceC3534lN, "provider");
        ((LinkedHashMap) this.f32643u).put(str, interfaceC3534lN);
    }

    public void q(String str, InterfaceC3534lN interfaceC3534lN) {
        o(str, interfaceC3534lN);
    }

    @Override // l3.c
    public void r(l3.m mVar) {
        Wx wx = (Wx) this.f32643u;
        if (mVar.f38884d) {
            wx.cancel(false);
            return;
        }
        if (mVar.i()) {
            wx.d(mVar.g());
            return;
        }
        Exception f2 = mVar.f();
        if (f2 == null) {
            throw new IllegalStateException();
        }
        wx.e(f2);
    }

    @Override // com.google.android.gms.internal.ads.Ir
    public void s(AbstractC2577Fj abstractC2577Fj) {
        C3279gj c3279gj = (C3279gj) abstractC2577Fj;
        BinderC3665nt binderC3665nt = (BinderC3665nt) this.f32643u;
        synchronized (binderC3665nt) {
            try {
                C3279gj c3279gj2 = binderC3665nt.f33583D;
                if (c3279gj2 != null) {
                    c3279gj2.d();
                }
                binderC3665nt.f33583D = c3279gj;
                InterfaceC4084vh interfaceC4084vh = c3279gj.f31373l;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.q0(binderC3665nt);
                }
                binderC3665nt.f33589y.a(new BinderC3333hj(c3279gj, binderC3665nt, binderC3665nt.f33589y, binderC3665nt.f33580A));
                c3279gj.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(EnumMap enumMap, long j6) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, "start_preload");
        a9.M("sp_ts", Long.toString(j6));
        a9.M("pv", "1");
        for (m2.b bVar : enumMap.keySet()) {
            String valueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            a9.M(valueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(bVar)).intValue()));
        }
        a9.N();
    }

    public C3426jN u() {
        return new C3426jN((LinkedHashMap) this.f32643u);
    }

    public void v(int i, int i4, long j6, Long l9, String str, Lv lv, String str2) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M("plaac_ts", Long.toString(j6));
        a9.M("max_ads", Integer.toString(i));
        a9.M("cache_size", Integer.toString(i4));
        a9.M(NativeAdvancedJsUtils.f18693p, "is_ad_available");
        if (lv != null) {
            a9.M("ad_unit_id", lv.f26983a);
            a9.M(com.anythink.expressad.f.a.b.aB, lv.f26985c);
            a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
        }
        if (l9 != null) {
            a9.M("plaay_ts", Long.toString(l9.longValue()));
        }
        if (str != null) {
            a9.M("gqi", str);
        }
        a9.M("pv", str2);
        a9.N();
    }

    public void x(long j6, int i, int i4, String str, Lv lv, String str2) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M("ppla_ts", Long.toString(j6));
        a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, lv.a());
        a9.M("ad_unit_id", lv.f26983a);
        a9.M(com.anythink.expressad.f.a.b.aB, lv.f26985c);
        a9.M("max_ads", Integer.toString(i));
        a9.M("cache_size", Integer.toString(i4));
        a9.M(NativeAdvancedJsUtils.f18693p, "poll_ad");
        if (str != null) {
            a9.M("gqi", str);
        }
        a9.M("pv", str2);
        a9.N();
    }

    public void y(long j6, long j9, long j10, long j11, long j12) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, "iic");
        a9.M("pat", Long.toString(j6));
        a9.M("bot", Long.toString(j9));
        a9.M("cim", Long.toString(j10));
        a9.M("mbot", Long.toString(j11));
        a9.M("mim", Long.toString(j12));
        a9.N();
    }

    public void z(String str, long j6, String str2, String str3, m2.b bVar, int i, int i4, int i6) {
        S0.e a9 = ((C3230fo) this.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, str);
        a9.M("pat", Long.toString(j6));
        a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, bVar.name().toLowerCase(Locale.ENGLISH));
        a9.M("max_ads", Integer.toString(i));
        a9.M("cache_size", Integer.toString(i4));
        a9.M("pas", Integer.toString(i6));
        a9.M("pv", "2");
        a9.M("ad_unit_id", str3);
        a9.M(com.anythink.expressad.f.a.b.aB, str2);
        a9.N();
    }

    public /* synthetic */ C3557lt(C4182xO c4182xO, C3429jQ c3429jQ, C3699oQ c3699oQ, IOException iOException, boolean z6) {
        this.f32642n = 14;
        this.f32643u = iOException;
    }

    @Override // com.google.android.gms.internal.ads.Ir, com.google.android.gms.internal.ads.NP
    /* renamed from: c, reason: collision with other method in class */
    public void mo11c() {
        switch (this.f32642n) {
            case 0:
                BinderC3665nt binderC3665nt = (BinderC3665nt) this.f32643u;
                synchronized (binderC3665nt) {
                    binderC3665nt.f33583D = null;
                }
                return;
            default:
                return;
        }
    }

    public C3557lt(byte b9, int i) {
        this.f32642n = i;
        switch (i) {
            case 15:
                break;
            default:
                this.f32643u = XB.o(new Object[]{1, 5}, 2);
                break;
        }
    }

    public C3557lt(int i) {
        this.f32642n = 10;
        this.f32643u = WC.h(i);
    }

    public C3557lt(BinderC3665nt binderC3665nt) {
        this.f32642n = 0;
        Objects.requireNonNull(binderC3665nt);
        this.f32643u = binderC3665nt;
    }

    public C3557lt(Py py) {
        this.f32642n = 7;
        Objects.requireNonNull(py);
        this.f32643u = py;
    }

    public /* synthetic */ C3557lt(C3967tP c3967tP) {
        this.f32642n = 16;
        Objects.requireNonNull(c3967tP);
        this.f32643u = c3967tP;
    }

    private final void p() {
    }

    @Override // com.google.android.gms.internal.ads.NP
    public void d() {
    }

    @Override // com.google.android.gms.internal.ads.NP
    public void e() {
    }

    @Override // com.google.android.gms.internal.ads.NP
    public void h() {
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
    }
}
