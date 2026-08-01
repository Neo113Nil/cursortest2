package p2;

import D.y;
import P2.w;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC2514Da;
import com.google.android.gms.internal.ads.C2869Ye;
import com.google.android.gms.internal.ads.C3753pw;
import com.google.android.gms.internal.ads.C3892sa;
import com.google.android.gms.internal.ads.P8;
import java.util.Iterator;
import java.util.TreeMap;
import q2.A0;
import q2.C4896n;
import q2.InterfaceC4868A;
import q2.InterfaceC4871a0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4909u;
import q2.InterfaceC4914w0;
import q2.InterfaceC4915x;
import q2.J;
import q2.V;
import q2.X0;
import q2.Y;
import q2.Z0;
import q2.c1;
import q2.f1;
import q2.i1;
import v2.C5110a;

/* renamed from: p2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4834i extends J {

    /* renamed from: n, reason: collision with root package name */
    public final C5110a f39726n;

    /* renamed from: u, reason: collision with root package name */
    public final f1 f39727u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f39728v;

    /* renamed from: w, reason: collision with root package name */
    public final C4896n f39729w;

    /* renamed from: x, reason: collision with root package name */
    public WebView f39730x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4915x f39731y;

    /* renamed from: z, reason: collision with root package name */
    public AsyncTask f39732z;

    public BinderC4834i(Context context, f1 f1Var, String str, C5110a c5110a) {
        this.f39728v = context;
        this.f39726n = c5110a;
        this.f39727u = f1Var;
        this.f39730x = new WebView(context);
        this.f39729w = new C4896n(context, str);
        U3(0);
        this.f39730x.setVerticalScrollBarEnabled(false);
        this.f39730x.getSettings().setJavaScriptEnabled(true);
        this.f39730x.setWebViewClient(new C3753pw(this));
        this.f39730x.setOnTouchListener(new G3.b(1));
    }

    @Override // q2.K
    public final void A() {
        w.d("destroy must be called on the main UI thread.");
        this.f39732z.cancel(true);
        this.f39730x.destroy();
        this.f39730x = null;
    }

    @Override // q2.K
    public final InterfaceC4915x B() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // q2.K
    public final void B3(InterfaceC4909u interfaceC4909u) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final InterfaceC4914w0 C() {
        return null;
    }

    @Override // q2.K
    public final void E0(C2869Ye c2869Ye) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void K() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final boolean M() {
        return false;
    }

    @Override // q2.K
    public final String N() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // q2.K
    public final void O2(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void P3(P8 p82) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void U0(Z0 z02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void U1(f1 f1Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void U3(int i) {
        if (this.f39730x == null) {
            return;
        }
        this.f39730x.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // q2.K
    public final A0 V() {
        return null;
    }

    public final String V3() {
        String str = (String) this.f39729w.f40196y;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) AbstractC2514Da.f24446d.r();
        return y.s(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // q2.K
    public final void Y2(i1 i1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void Z2(InterfaceC4915x interfaceC4915x) {
        this.f39731y = interfaceC4915x;
    }

    @Override // q2.K
    public final W2.a c() {
        w.d("getAdFrame must be called on the main UI thread.");
        return new W2.b(this.f39730x);
    }

    @Override // q2.K
    public final void d() {
        w.d("pause must be called on the main UI thread.");
    }

    @Override // q2.K
    public final boolean d3(c1 c1Var) {
        TreeMap treeMap;
        w.i(this.f39730x, "This Search Ad has already been torn down");
        C4896n c4896n = this.f39729w;
        c4896n.getClass();
        X0 x02 = c1Var.f40099C;
        if (x02 != null) {
            c4896n.f40195x = x02.f40084n;
        }
        Bundle bundle = c1Var.f40102F;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) AbstractC2514Da.f24445c.r();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                treeMap = (TreeMap) c4896n.f40194w;
                if (!hasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    c4896n.f40196y = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f39726n.f41391n);
            if (((Boolean) AbstractC2514Da.f24443a.r()).booleanValue()) {
                Bundle M8 = t8.g.M((Context) c4896n.f40192u, (String) AbstractC2514Da.f24444b.r());
                for (String str2 : M8.keySet()) {
                    treeMap.put(str2, M8.get(str2).toString());
                }
            }
        }
        this.f39732z = new AsyncTaskC4833h(this).execute(new Void[0]);
        return true;
    }

    @Override // q2.K
    public final void e() {
        w.d("resume must be called on the main UI thread.");
    }

    @Override // q2.K
    public final void e1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final long f0() {
        return 0L;
    }

    @Override // q2.K
    public final boolean i() {
        return false;
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
    public final void k2() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void l() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final String m() {
        return null;
    }

    @Override // q2.K
    public final void o0(boolean z3) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final f1 q() {
        return this.f39727u;
    }

    @Override // q2.K
    public final void r() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void r2(C3892sa c3892sa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void r3(Y y7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final void s() {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final boolean u() {
        return false;
    }

    @Override // q2.K
    public final String w() {
        return null;
    }

    @Override // q2.K
    public final void x1(V v9) {
        throw new IllegalStateException("Unused method");
    }

    @Override // q2.K
    public final V y() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // q2.K
    public final void A0(long j6) {
    }

    @Override // q2.K
    public final void C1(W2.a aVar) {
    }

    @Override // q2.K
    public final void X0(InterfaceC4871a0 interfaceC4871a0) {
    }

    @Override // q2.K
    public final void f2(boolean z3) {
    }

    @Override // q2.K
    public final void s0(InterfaceC4904r0 interfaceC4904r0) {
    }

    @Override // q2.K
    public final void m2(c1 c1Var, InterfaceC4868A interfaceC4868A) {
    }
}
