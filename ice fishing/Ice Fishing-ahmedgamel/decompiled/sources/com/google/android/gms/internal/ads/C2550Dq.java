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
public final class C2550Dq implements InterfaceC3340hq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25227a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25228b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25229c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25230d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f25231e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25232f;

    public C2550Dq(Context context, C3600mi c3600mi, Lu lu, RD rd, C3915sa c3915sa) {
        this.f25228b = context;
        this.f25229c = c3600mi;
        this.f25232f = lu;
        this.f25231e = rd;
        this.f25230d = c3915sa;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        String str;
        switch (this.f25227a) {
            case 0:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.He)).booleanValue()) {
                    S0.e a9 = ((C3230fo) this.f25232f).a();
                    a9.M(NativeAdvancedJsUtils.f18693p, "cstm_tbs_rndr");
                    a9.N();
                }
                try {
                    str = st.f28429v.getString("tab_url");
                } catch (Exception unused) {
                    str = null;
                }
                return QC.t(ND.f27257u, new C2533Cq(this, str != null ? Uri.parse(str) : null, yt, st, (Ut) yt.f29533b.f25831v, 0), (Executor) this.f25230d);
            default:
                C3555lr c3555lr = new C3555lr(new View(this.f25228b), null, C3609mr.f33390u, (Tt) st.f28427u.get(0));
                C3504ku c3504ku = new C3504ku(yt, st, (String) null);
                C3600mi c3600mi = (C3600mi) this.f25229c;
                C3546li c3546li = new C3546li(c3600mi.f33278d, c3600mi.f33281e, c3504ku, c3555lr);
                C3925sk c3925sk = (C3925sk) c3546li.f32602y0.f();
                C2527Ck c2527Ck = (C2527Ck) c3546li.f32570B0.f();
                C2596Gl c2596Gl = (C2596Gl) c3546li.f32571D0.f();
                C2545Dl c2545Dl = (C2545Dl) c3546li.f32580M0.f();
                C2957aj c2957aj = (C2957aj) c3546li.f32590l0.f();
                T8 t82 = new T8();
                t82.f28483y = new AtomicBoolean(false);
                t82.f28478n = c3925sk;
                t82.f28479u = c2527Ck;
                t82.f28480v = c2596Gl;
                t82.f28481w = c2545Dl;
                t82.f28482x = c2957aj;
                Wt wt = st.f28423s;
                BinderC3861ra binderC3861ra = new BinderC3861ra(t82, wt.f29209b, wt.f29208a);
                Ju ju = Ju.CUSTOM_RENDER_SYN;
                Lu lu = (Lu) this.f25232f;
                Objects.requireNonNull(lu);
                T8 t83 = new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, ((C3383ig) ((RD) this.f25231e)).b(new Ts(3, new S0.s(20, this, binderC3861ra))));
                T8 a10 = ((Lu) t83.f28483y).a(t83.s(), Ju.CUSTOM_RENDER_ACK);
                return new T8((Lu) a10.f28483y, a10.f28480v, (String) a10.f28478n, (P3.a) a10.f28479u, (List) a10.f28481w, QC.t((P3.a) a10.f28482x, new C3327hd(2, QC.c(c3546li.U())), AbstractC3436jg.f32062h)).s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        String str;
        Wt wt;
        switch (this.f25227a) {
            case 0:
                Context context = this.f25228b;
                if ((context instanceof Activity) && C4131wa.a(context)) {
                    try {
                        str = st.f28429v.getString("tab_url");
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                }
                break;
            default:
                if (((C3915sa) this.f25230d) == null || (wt = st.f28423s) == null || wt.f29208a == null) {
                }
                break;
        }
        return false;
    }

    public C2550Dq(Context context, Executor executor, C3816qi c3816qi, Rt rt, C3230fo c3230fo) {
        this.f25228b = context;
        this.f25229c = c3816qi;
        this.f25230d = executor;
        this.f25231e = rt;
        this.f25232f = c3230fo;
    }
}
