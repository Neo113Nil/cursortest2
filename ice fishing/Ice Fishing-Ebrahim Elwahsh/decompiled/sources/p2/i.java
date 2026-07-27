package p2;

import D.y;
import O2.w;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC4283za;
import com.google.android.gms.internal.ads.C2823Ve;
import com.google.android.gms.internal.ads.C3744pa;
import com.google.android.gms.internal.ads.C3820qw;
import com.google.android.gms.internal.ads.M8;
import java.util.Iterator;
import java.util.TreeMap;
import q2.A0;
import q2.C4903n;
import q2.InterfaceC4873A;
import q2.InterfaceC4878a0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4916u;
import q2.InterfaceC4921w0;
import q2.InterfaceC4922x;
import q2.J;
import q2.V;
import q2.Y;
import q2.Y0;
import q2.a1;
import q2.d1;
import q2.g1;
import q2.j1;
import u2.C5107a;

/* loaded from: classes.dex */
public final class i extends J {

    /* renamed from: n, reason: collision with root package name */
    public final C5107a f39791n;

    /* renamed from: u, reason: collision with root package name */
    public final g1 f39792u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f39793v;

    /* renamed from: w, reason: collision with root package name */
    public final C4903n f39794w;

    /* renamed from: x, reason: collision with root package name */
    public WebView f39795x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4922x f39796y;

    /* renamed from: z, reason: collision with root package name */
    public AsyncTask f39797z;

    public i(Context context, g1 g1Var, String str, C5107a c5107a) {
        this.f39793v = context;
        this.f39791n = c5107a;
        this.f39792u = g1Var;
        this.f39795x = new WebView(context);
        this.f39794w = new C4903n(context, str);
        G3(0);
        this.f39795x.setVerticalScrollBarEnabled(false);
        this.f39795x.getSettings().setJavaScriptEnabled(true);
        this.f39795x.setWebViewClient(new C3820qw(this));
        this.f39795x.setOnTouchListener(new E3.b(1));
    }

    @Override // q2.K
    public final A0 B() {
        return null;
    }

    @Override // q2.K
    public final void D1(g1 g1Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // q2.K
    public final void D2(Y y6) {
        throw new IllegalStateException("Unused method");
    }

    public final void G3(int i) {
        if (this.f39795x == null) {
            return;
        }
        this.f39795x.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // q2.K
    public final boolean H() {
        return false;
    }

    public final String H3() {
        String str = (String) this.f39794w.f40105y;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) AbstractC4283za.f35553d.r();
        return y.o(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // q2.K
    public final void I1(C3744pa c3744pa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void I2(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void K() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final boolean L() {
        return false;
    }

    @Override // q2.K
    public final InterfaceC4921w0 M() {
        return null;
    }

    @Override // q2.K
    public final void Q0(boolean z8) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void W1(M8 m8) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final InterfaceC4922x X() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // q2.K
    public final void X2(InterfaceC4916u interfaceC4916u) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final long Z() {
        return 0L;
    }

    @Override // q2.K
    public final void b0() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final V2.a d() {
        w.d("getAdFrame must be called on the main UI thread.");
        return new V2.b(this.f39795x);
    }

    @Override // q2.K
    public final void e() {
        w.d("resume must be called on the main UI thread.");
    }

    @Override // q2.K
    public final void f() {
        w.d("pause must be called on the main UI thread.");
    }

    @Override // q2.K
    public final boolean f0(d1 d1Var) {
        TreeMap treeMap;
        w.i(this.f39795x, "This Search Ad has already been torn down");
        C4903n c4903n = this.f39794w;
        c4903n.getClass();
        Y0 y02 = d1Var.f40010C;
        if (y02 != null) {
            c4903n.f40104x = y02.f39993n;
        }
        Bundle bundle = d1Var.f40013F;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) AbstractC4283za.f35552c.r();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                treeMap = (TreeMap) c4903n.f40103w;
                if (!hasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    c4903n.f40105y = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f39791n.f41217n);
            if (((Boolean) AbstractC4283za.f35550a.r()).booleanValue()) {
                Bundle F8 = com.bumptech.glide.h.F((Context) c4903n.f40101u, (String) AbstractC4283za.f35551b.r());
                for (String str2 : F8.keySet()) {
                    treeMap.put(str2, F8.get(str2).toString());
                }
            }
        }
        this.f39797z = new h(this).execute(new Void[0]);
        return true;
    }

    @Override // q2.K
    public final Bundle j() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void m() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final boolean o() {
        return false;
    }

    @Override // q2.K
    public final g1 p() {
        return this.f39792u;
    }

    @Override // q2.K
    public final void r() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void r0(InterfaceC4922x interfaceC4922x) {
        this.f39796y = interfaceC4922x;
    }

    @Override // q2.K
    public final void s1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final String t() {
        return null;
    }

    @Override // q2.K
    public final void t2(j1 j1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final String u() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // q2.K
    public final V v() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // q2.K
    public final String w() {
        return null;
    }

    @Override // q2.K
    public final void w1(V v6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void x() {
        w.d("destroy must be called on the main UI thread.");
        this.f39797z.cancel(true);
        this.f39795x.destroy();
        this.f39795x = null;
    }

    @Override // q2.K
    public final void x0(a1 a1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void x1(C2823Ve c2823Ve) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void B0(InterfaceC4878a0 interfaceC4878a0) {
    }

    @Override // q2.K
    public final void P0(long j9) {
    }

    @Override // q2.K
    public final void T2(V2.a aVar) {
    }

    @Override // q2.K
    public final void p3(InterfaceC4911r0 interfaceC4911r0) {
    }

    @Override // q2.K
    public final void u2(boolean z8) {
    }

    @Override // q2.K
    public final void C2(d1 d1Var, InterfaceC4873A interfaceC4873A) {
    }
}
