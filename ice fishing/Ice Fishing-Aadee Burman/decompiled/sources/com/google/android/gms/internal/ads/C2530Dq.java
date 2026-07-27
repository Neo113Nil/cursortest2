package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Dq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2530Dq implements InterfaceC3317hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24466a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24467b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24468c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24469d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f24470e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f24471f;

    public C2530Dq(Context context, C3577mi c3577mi, Lu lu, RD rd, C3892sa c3892sa) {
        this.f24467b = context;
        this.f24468c = c3577mi;
        this.f24471f = lu;
        this.f24470e = rd;
        this.f24469d = c3892sa;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        String str;
        switch (this.f24466a) {
            case 0:
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.He)).booleanValue()) {
                    S0.e a9 = ((C3153eo) this.f24471f).a();
                    a9.v(NativeAdvancedJsUtils.f17906p, "cstm_tbs_rndr");
                    a9.y();
                }
                try {
                    str = st.f27646v.getString("tab_url");
                } catch (Exception unused) {
                    str = null;
                }
                return QC.t(ND.f26473u, new C2513Cq(this, str != null ? Uri.parse(str) : null, yt, st, (Ut) yt.f28754b.f25043v, 0), (Executor) this.f24469d);
            default:
                C3532lr c3532lr = new C3532lr(new View(this.f24467b), null, C3586mr.f32612u, (Tt) st.f27644u.get(0));
                C3481ku c3481ku = new C3481ku(yt, st, (String) null);
                C3577mi c3577mi = (C3577mi) this.f24468c;
                C3523li c3523li = new C3523li(c3577mi.f32498d, c3577mi.f32501e, c3481ku, c3532lr);
                C3902sk c3902sk = (C3902sk) c3523li.f31792D0.f();
                C2507Ck c2507Ck = (C2507Ck) c3523li.f31795G0.f();
                C2559Fl c2559Fl = (C2559Fl) c3523li.f31797I0.f();
                C2508Cl c2508Cl = (C2508Cl) c3523li.f31806R0.f();
                C2934aj c2934aj = (C2934aj) c3523li.f31816q0.f();
                T8 t82 = new T8();
                t82.f27700y = new AtomicBoolean(false);
                t82.f27695n = c3902sk;
                t82.f27696u = c2507Ck;
                t82.f27697v = c2559Fl;
                t82.f27698w = c2508Cl;
                t82.f27699x = c2934aj;
                Wt wt = st.f27640s;
                BinderC3838ra binderC3838ra = new BinderC3838ra(t82, wt.f28427b, wt.f28426a);
                Ju ju = Ju.CUSTOM_RENDER_SYN;
                Lu lu = (Lu) this.f24471f;
                Objects.requireNonNull(lu);
                T8 t83 = new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, ((C3360ig) ((RD) this.f24470e)).b(new Ts(3, new S0.s(18, this, binderC3838ra))));
                T8 a10 = ((Lu) t83.f27700y).a(t83.s(), Ju.CUSTOM_RENDER_ACK);
                return new T8((Lu) a10.f27700y, a10.f27697v, (String) a10.f27695n, (N3.a) a10.f27696u, (List) a10.f27698w, QC.t((N3.a) a10.f27699x, new C3304hd(2, QC.c(c3523li.U())), AbstractC3413jg.f31275h)).s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        String str;
        Wt wt;
        switch (this.f24466a) {
            case 0:
                Context context = this.f24467b;
                if ((context instanceof Activity) && C4108wa.a(context)) {
                    try {
                        str = st.f27646v.getString("tab_url");
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                }
                break;
            default:
                if (((C3892sa) this.f24469d) == null || (wt = st.f27640s) == null || wt.f28426a == null) {
                }
                break;
        }
        return false;
    }

    public C2530Dq(Context context, Executor executor, C3793qi c3793qi, Rt rt, C3153eo c3153eo) {
        this.f24467b = context;
        this.f24468c = c3793qi;
        this.f24469d = executor;
        this.f24470e = rt;
        this.f24471f = c3153eo;
    }
}
