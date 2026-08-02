package r2;

import D.x;
import R2.w;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.IceFishing.LiveIceFishing.t;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC2534Da;
import com.google.android.gms.internal.ads.C2892Ye;
import com.google.android.gms.internal.ads.C3915sa;
import com.google.android.gms.internal.ads.P8;
import java.util.Iterator;
import java.util.TreeMap;
import s2.A0;
import s2.C4945n;
import s2.InterfaceC4917A;
import s2.InterfaceC4920a0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4958u;
import s2.InterfaceC4963w0;
import s2.InterfaceC4964x;
import s2.J;
import s2.V;
import s2.X0;
import s2.Y;
import s2.Z0;
import s2.c1;
import s2.f1;
import s2.i1;
import x2.C5189a;

/* renamed from: r2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4905j extends J {

    /* renamed from: n, reason: collision with root package name */
    public final C5189a f40179n;

    /* renamed from: u, reason: collision with root package name */
    public final f1 f40180u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f40181v;

    /* renamed from: w, reason: collision with root package name */
    public final C4945n f40182w;

    /* renamed from: x, reason: collision with root package name */
    public WebView f40183x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4964x f40184y;

    /* renamed from: z, reason: collision with root package name */
    public AsyncTask f40185z;

    public BinderC4905j(Context context, f1 f1Var, String str, C5189a c5189a) {
        this.f40181v = context;
        this.f40179n = c5189a;
        this.f40180u = f1Var;
        this.f40183x = new WebView(context);
        this.f40182w = new C4945n(context, str);
        U3(0);
        this.f40183x.setVerticalScrollBarEnabled(false);
        this.f40183x.getSettings().setJavaScriptEnabled(true);
        this.f40183x.setWebViewClient(new t(this));
        this.f40183x.setOnTouchListener(new I3.b(1));
    }

    @Override // s2.K
    public final void A() {
        w.d("destroy must be called on the main UI thread.");
        this.f40185z.cancel(true);
        this.f40183x.destroy();
        this.f40183x = null;
    }

    @Override // s2.K
    public final InterfaceC4964x B() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // s2.K
    public final void B0(Y y7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final InterfaceC4963w0 C() {
        return null;
    }

    @Override // s2.K
    public final void C0(C2892Ye c2892Ye) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final boolean D3(c1 c1Var) {
        TreeMap treeMap;
        w.i(this.f40183x, "This Search Ad has already been torn down");
        C4945n c4945n = this.f40182w;
        c4945n.getClass();
        X0 x02 = c1Var.f40398C;
        if (x02 != null) {
            c4945n.f40494x = x02.f40383n;
        }
        Bundle bundle = c1Var.f40401F;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) AbstractC2534Da.f25192c.r();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                treeMap = (TreeMap) c4945n.f40493w;
                if (!hasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    c4945n.f40495y = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f40179n.f41845n);
            if (((Boolean) AbstractC2534Da.f25190a.r()).booleanValue()) {
                Bundle m9 = com.bumptech.glide.h.m((Context) c4945n.f40491u, (String) AbstractC2534Da.f25191b.r());
                for (String str2 : m9.keySet()) {
                    treeMap.put(str2, m9.get(str2).toString());
                }
            }
        }
        this.f40185z = new AsyncTaskC4904i(this).execute(new Void[0]);
        return true;
    }

    @Override // s2.K
    public final void F2(f1 f1Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // s2.K
    public final void F3(i1 i1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void H1(InterfaceC4964x interfaceC4964x) {
        this.f40184y = interfaceC4964x;
    }

    @Override // s2.K
    public final void J() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final boolean L() {
        return false;
    }

    @Override // s2.K
    public final void M2(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final String N() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // s2.K
    public final void P3(P8 p82) {
        throw new IllegalStateException("Unused method");
    }

    public final void U3(int i) {
        if (this.f40183x == null) {
            return;
        }
        this.f40183x.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // s2.K
    public final A0 V() {
        return null;
    }

    public final String V3() {
        String str = (String) this.f40182w.f40495y;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) AbstractC2534Da.f25193d.r();
        return x.p(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length()), "https://", str, str2);
    }

    @Override // s2.K
    public final Y2.a c() {
        w.d("getAdFrame must be called on the main UI thread.");
        return new Y2.b(this.f40183x);
    }

    @Override // s2.K
    public final void c1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void d() {
        w.d("pause must be called on the main UI thread.");
    }

    @Override // s2.K
    public final void d2() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void e() {
        w.d("resume must be called on the main UI thread.");
    }

    @Override // s2.K
    public final long g0() {
        return 0L;
    }

    @Override // s2.K
    public final boolean i() {
        return false;
    }

    @Override // s2.K
    public final Bundle j() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void l() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final String m() {
        return null;
    }

    @Override // s2.K
    public final void m2(C3915sa c3915sa) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void n0(boolean z6) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void o0(V v9) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void o2(Z0 z02) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void p3(InterfaceC4958u interfaceC4958u) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final f1 q() {
        return this.f40180u;
    }

    @Override // s2.K
    public final void r() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final void s() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.K
    public final boolean u() {
        return false;
    }

    @Override // s2.K
    public final String w() {
        return null;
    }

    @Override // s2.K
    public final V y() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // s2.K
    public final void E3(InterfaceC4920a0 interfaceC4920a0) {
    }

    @Override // s2.K
    public final void M3(InterfaceC4953r0 interfaceC4953r0) {
    }

    @Override // s2.K
    public final void c2(boolean z6) {
    }

    @Override // s2.K
    public final void w0(long j6) {
    }

    @Override // s2.K
    public final void x0(Y2.a aVar) {
    }

    @Override // s2.K
    public final void I3(c1 c1Var, InterfaceC4917A interfaceC4917A) {
    }
}
