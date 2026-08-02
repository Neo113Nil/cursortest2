package defpackage;

import android.content.Context;
import android.os.Handler;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes7.dex */
public final class qv71 {
    public static final /* synthetic */ kgx[] j = {new MutablePropertyReference1Impl("adParameterManager", 0, "getAdParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$ResponseReportParameterManager;", qv71.class), oyr.B(qoi0.a, qv71.class, "requestParameterManager", "getRequestParameterManager()Lcom/monetization/ads/video/render/report/VideoAdRenderingResultReporter$RequestReportParameterManager;", 0)};
    public static final long k = 10000;
    public final e971 a;
    public final hv81 b;
    public final gm71 c;
    public final fp71 d;
    public final hn71 e;
    public final h0j f;
    public final h0j g;
    public boolean h;
    public final oji i;

    public qv71(Context context, v981 v981Var, d881 d881Var, i581 i581Var, e971 e971Var, js81 js81Var, i971 i971Var, ji41 ji41Var, hv81 hv81Var) {
        gm71 a = rc71.a(false);
        fp71 fp71Var = new fp71(context, v981Var, d881Var, e971Var);
        hn71 hn71Var = new hn71(12, i581Var, i971Var);
        this.a = e971Var;
        this.b = hv81Var;
        this.c = a;
        this.d = fp71Var;
        this.e = hn71Var;
        this.f = new h0j(js81Var, this);
        this.g = new h0j(ji41Var, this);
        this.i = new oji(7, this);
    }

    public final void a() {
        h0j h0jVar = this.g;
        ((Handler) h0jVar.e).removeCallbacksAndMessages(null);
        h0jVar.b = false;
        h0j h0jVar2 = this.f;
        ((Handler) h0jVar2.e).removeCallbacksAndMessages(null);
        h0jVar2.b = false;
        this.c.a();
    }
}
