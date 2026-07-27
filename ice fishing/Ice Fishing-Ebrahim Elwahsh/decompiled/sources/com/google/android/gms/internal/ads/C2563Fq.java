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

/* renamed from: com.google.android.gms.internal.ads.Fq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2563Fq implements InterfaceC3436jq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25027a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25028b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25029c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25030d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f25031e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25032f;

    public C2563Fq(Context context, C3482ki c3482ki, Ou ou, SD sd, C3744pa c3744pa) {
        this.f25028b = context;
        this.f25029c = c3482ki;
        this.f25032f = ou;
        this.f25031e = sd;
        this.f25030d = c3744pa;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        String str;
        switch (this.f25027a) {
            case 0:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Be)).booleanValue()) {
                    C2593Hm a9 = ((C3165eo) this.f25032f).a();
                    a9.r(NativeAdvancedJsUtils.f18064p, "cstm_tbs_rndr");
                    a9.s();
                }
                try {
                    str = ut.f28179v.getString("tab_url");
                } catch (Exception unused) {
                    str = null;
                }
                return C3686oN.y(OD.f26665u, new C2546Eq(this, str != null ? Uri.parse(str) : null, c2953au, ut, (Wt) c2953au.f29349b.f24454v, 0), (Executor) this.f25030d);
            default:
                C3707or c3707or = new C3707or(new View(this.f25028b), null, C3431jl.f32183R, (Vt) ut.f28177u.get(0));
                C3602mu c3602mu = new C3602mu(c2953au, ut, (String) null);
                C3482ki c3482ki = (C3482ki) this.f25029c;
                C3428ji c3428ji = new C3428ji(c3482ki.f32375d, c3482ki.f32378e, c3602mu, c3707or);
                C3808qk c3808qk = (C3808qk) c3428ji.f32122B0.d();
                C2489Bk c2489Bk = (C2489Bk) c3428ji.f32124E0.d();
                C2541El c2541El = (C2541El) c3428ji.f32126G0.d();
                C2490Bl c2490Bl = (C2490Bl) c3428ji.f32135P0.d();
                C2895Zi c2895Zi = (C2895Zi) c3428ji.f32143Z.d();
                Q8 q82 = new Q8();
                q82.f27124y = new AtomicBoolean(false);
                q82.f27119n = c3808qk;
                q82.f27120u = c2489Bk;
                q82.f27121v = c2541El;
                q82.f27122w = c2490Bl;
                q82.f27123x = c2895Zi;
                Yt yt = ut.f28173s;
                BinderC3690oa binderC3690oa = new BinderC3690oa(q82, yt.f28907b, yt.f28906a);
                Lu lu = Lu.CUSTOM_RENDER_SYN;
                Ou ou = (Ou) this.f25032f;
                Objects.requireNonNull(ou);
                Q8 q83 = new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, ((C3157eg) ((SD) this.f25031e)).b(new Vs(3, new C2593Hm(12, this, binderC3690oa))));
                Q8 a10 = ((Ou) q83.f27124y).a(q83.r(), Lu.CUSTOM_RENDER_ACK);
                return new Q8((Ou) a10.f27124y, a10.f27121v, (String) a10.f27119n, (J3.a) a10.f27120u, (List) a10.f27122w, C3686oN.y((J3.a) a10.f27123x, new C3154ed(2, C3686oN.c(c3428ji.M())), AbstractC3212fg.f30745h)).r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        String str;
        Yt yt;
        switch (this.f25027a) {
            case 0:
                Context context = this.f25028b;
                if ((context instanceof Activity) && C3905sa.a(context)) {
                    try {
                        str = ut.f28179v.getString("tab_url");
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                }
                break;
            default:
                if (((C3744pa) this.f25030d) == null || (yt = ut.f28173s) == null || yt.f28906a == null) {
                }
                break;
        }
        return false;
    }

    public C2563Fq(Context context, Executor executor, C3644ni c3644ni, Tt tt, C3165eo c3165eo) {
        this.f25028b = context;
        this.f25029c = c3644ni;
        this.f25030d = executor;
        this.f25031e = tt;
        this.f25032f = c3165eo;
    }
}
