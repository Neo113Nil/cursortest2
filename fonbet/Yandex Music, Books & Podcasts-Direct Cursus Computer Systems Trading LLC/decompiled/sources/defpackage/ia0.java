package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ia0 implements gu1, wi2, i6q {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public ia0() {
        this.a = new ReentrantLock();
        this.b = new nej(0);
        rjq b = hyf.b();
        this.c = b;
        this.d = hld.s(b, ca8.b);
        this.e = ydr.a(((xdr) i().z()).getValue());
        this.f = ydr.a(((xdr) i().C()).getValue());
        this.g = ydr.a(((xdr) i().G()).getValue());
        this.h = ydr.a(((xdr) i().b()).getValue());
        this.i = ydr.a(((xdr) i().f0()).getValue());
        this.j = ydr.a(((xdr) i().h()).getValue());
        this.k = ydr.a(((xdr) i().a()).getValue());
        this.l = ydr.a(((xdr) i().S()).getValue());
        this.m = ydr.a(((xdr) i().N()).getValue());
        this.n = ydr.a(((xdr) i().g0()).getValue());
    }

    @Override // defpackage.i6q
    public vdr C() {
        return (xdr) this.f;
    }

    @Override // defpackage.i6q
    public vdr G() {
        return (xdr) this.g;
    }

    @Override // defpackage.fl6
    public vdr N() {
        return (xdr) this.m;
    }

    @Override // defpackage.fl6
    public vdr S() {
        return (xdr) this.l;
    }

    @Override // defpackage.fl6
    public vdr a() {
        return (xdr) this.k;
    }

    @Override // defpackage.i6q
    public vdr b() {
        return (xdr) this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(hqi hqiVar, ea0 ea0Var, Continuation continuation) {
        s90 s90Var;
        int i;
        Throwable th;
        ia0 ia0Var;
        Object a;
        Object a2;
        if (continuation instanceof s90) {
            s90Var = (s90) continuation;
            int i2 = s90Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s90Var.m = i2 - Integer.MIN_VALUE;
                Object obj = s90Var.k;
                nm6 nm6Var = nm6.a;
                i = s90Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        zue zueVar = (zue) this.e;
                        try {
                            w90 w90Var = new w90(this, ea0Var, null, 0);
                            s90Var.j = this;
                            s90Var.m = 1;
                            try {
                                zueVar.getClass();
                                if (gld.Q(new y7b(hqiVar, zueVar, w90Var, (Continuation) null), s90Var) == nm6Var) {
                                    return nm6Var;
                                }
                                ia0Var = this;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                ia0Var = this;
                                i9h g = ia0Var.g();
                                t6k t6kVar = (t6k) ia0Var.l;
                                a = g.a(t6kVar.e());
                                if (a != null && Math.abs(t6kVar.e() - ia0Var.g().c(a)) <= 0.5f && ((Boolean) ((Function1) ia0Var.d).invoke(a)).booleanValue()) {
                                    ia0Var.l(a);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            ia0Var = this;
                            i9h g2 = ia0Var.g();
                            t6k t6kVar2 = (t6k) ia0Var.l;
                            a = g2.a(t6kVar2.e());
                            if (a != null) {
                                ia0Var.l(a);
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ia0Var = s90Var.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        i9h g22 = ia0Var.g();
                        t6k t6kVar22 = (t6k) ia0Var.l;
                        a = g22.a(t6kVar22.e());
                        if (a != null) {
                        }
                        throw th;
                    }
                }
                i9h g3 = ia0Var.g();
                t6k t6kVar3 = (t6k) ia0Var.l;
                a2 = g3.a(t6kVar3.e());
                if (a2 != null && Math.abs(t6kVar3.e() - ia0Var.g().c(a2)) <= 0.5f && ((Boolean) ((Function1) ia0Var.d).invoke(a2)).booleanValue()) {
                    ia0Var.l(a2);
                }
                return Unit.a;
            }
        }
        s90Var = new s90(this, continuation);
        Object obj2 = s90Var.k;
        nm6 nm6Var2 = nm6.a;
        i = s90Var.m;
        if (i != 0) {
        }
        i9h g32 = ia0Var.g();
        t6k t6kVar32 = (t6k) ia0Var.l;
        a2 = g32.a(t6kVar32.e());
        if (a2 != null) {
            ia0Var.l(a2);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj, hqi hqiVar, e90 e90Var, cg6 cg6Var) {
        x90 x90Var;
        int i;
        ia0 ia0Var;
        Throwable th;
        Throwable th2;
        ia0 ia0Var2;
        zue zueVar;
        Object a;
        Object a2;
        if (cg6Var instanceof x90) {
            x90Var = (x90) cg6Var;
            int i2 = x90Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x90Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = x90Var.k;
                nm6 nm6Var = nm6.a;
                i = x90Var.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (!g().a.containsKey(obj)) {
                        l(obj);
                        return Unit.a;
                    }
                    try {
                        zueVar = (zue) this.e;
                        try {
                            ia0Var = this;
                        } catch (Throwable th3) {
                            th = th3;
                            ia0Var = this;
                        }
                    } catch (Throwable th4) {
                        ia0Var = this;
                        th = th4;
                    }
                    try {
                        aa0 aa0Var = new aa0(ia0Var, obj, e90Var, continuation, 0);
                        x90Var.j = ia0Var;
                        x90Var.m = 1;
                        try {
                            zueVar.getClass();
                            if (gld.Q(new y7b(hqiVar, zueVar, aa0Var, (Continuation) null), x90Var) == nm6Var) {
                                return nm6Var;
                            }
                            ia0Var2 = ia0Var;
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            ia0Var2 = ia0Var;
                            ia0Var2.m(null);
                            t6k t6kVar = (t6k) ia0Var2.l;
                            a = ia0Var2.g().a(t6kVar.e());
                            if (a == null) {
                                throw th2;
                            }
                            if (Math.abs(t6kVar.e() - ia0Var2.g().c(a)) > 0.5f) {
                                throw th2;
                            }
                            if (!((Boolean) ((Function1) ia0Var2.d).invoke(a)).booleanValue()) {
                                throw th2;
                            }
                            ia0Var2.l(a);
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        ia0Var2 = ia0Var;
                        ia0Var2.m(null);
                        t6k t6kVar2 = (t6k) ia0Var2.l;
                        a = ia0Var2.g().a(t6kVar2.e());
                        if (a == null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ia0Var2 = x90Var.j;
                    try {
                        qgg.h0(obj2);
                    } catch (Throwable th7) {
                        th2 = th7;
                        ia0Var2.m(null);
                        t6k t6kVar22 = (t6k) ia0Var2.l;
                        a = ia0Var2.g().a(t6kVar22.e());
                        if (a == null) {
                        }
                    }
                }
                ia0Var2.m(null);
                t6k t6kVar3 = (t6k) ia0Var2.l;
                a2 = ia0Var2.g().a(t6kVar3.e());
                if (a2 != null && Math.abs(t6kVar3.e() - ia0Var2.g().c(a2)) <= 0.5f && ((Boolean) ((Function1) ia0Var2.d).invoke(a2)).booleanValue()) {
                    ia0Var2.l(a2);
                }
                return Unit.a;
            }
        }
        x90Var = new x90(this, cg6Var);
        Object obj22 = x90Var.k;
        nm6 nm6Var2 = nm6.a;
        i = x90Var.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ia0Var2.m(null);
        t6k t6kVar32 = (t6k) ia0Var2.l;
        a2 = ia0Var2.g().a(t6kVar32.e());
        if (a2 != null) {
            ia0Var2.l(a2);
        }
        return Unit.a;
    }

    public Object e(float f, float f2, Object obj) {
        zbi zbiVar = (zbi) this.a;
        i9h g = g();
        float c = g.c(obj);
        float floatValue = ((Number) ((aci) this.b).invoke()).floatValue();
        if (c != f && !Float.isNaN(c)) {
            if (c < f) {
                if (f2 >= floatValue) {
                    Object b = g.b(true, f);
                    b.getClass();
                    return b;
                }
                Object b2 = g.b(true, f);
                b2.getClass();
                if (f >= Math.abs(Math.abs(((Number) zbiVar.invoke(Float.valueOf(Math.abs(g.c(b2) - c)))).floatValue()) + c)) {
                    return b2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object b3 = g.b(false, f);
                    b3.getClass();
                    return b3;
                }
                Object b4 = g.b(false, f);
                b4.getClass();
                float abs = Math.abs(c - Math.abs(((Number) zbiVar.invoke(Float.valueOf(Math.abs(c - g.c(b4))))).floatValue()));
                if (f >= 0.0f ? f <= abs : Math.abs(f) >= abs) {
                    return b4;
                }
            }
        }
        return obj;
    }

    public float f(float f) {
        float j = j(f);
        t6k t6kVar = (t6k) this.l;
        float e = Float.isNaN(t6kVar.e()) ? 0.0f : t6kVar.e();
        t6kVar.h(j);
        return j - e;
    }

    @Override // defpackage.fl6
    public vdr f0() {
        return (xdr) this.i;
    }

    public i9h g() {
        return (i9h) ((x6k) this.i).getValue();
    }

    @Override // defpackage.fl6
    public vdr g0() {
        return (xdr) this.n;
    }

    @Override // defpackage.fl6
    public vdr h() {
        return (xdr) this.j;
    }

    public i6q i() {
        ReentrantLock reentrantLock = (ReentrantLock) this.a;
        reentrantLock.lock();
        try {
            return (i6q) this.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    public float j(float f) {
        t6k t6kVar = (t6k) this.l;
        float e = (Float.isNaN(t6kVar.e()) ? 0.0f : t6kVar.e()) + f;
        Float c0 = CollectionsKt.c0(g().a.values());
        float floatValue = c0 != null ? c0.floatValue() : Float.NaN;
        Float a0 = CollectionsKt.a0(g().a.values());
        return yhn.c(e, floatValue, a0 != null ? a0.floatValue() : Float.NaN);
    }

    public float k() {
        t6k t6kVar = (t6k) this.l;
        if (!Float.isNaN(t6kVar.e())) {
            return t6kVar.e();
        }
        xq0.q("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public void l(Object obj) {
        ((x6k) this.g).setValue(obj);
    }

    public void m(Object obj) {
        ((x6k) this.h).setValue(obj);
    }

    @Override // defpackage.gu1
    public void n(fi4 fi4Var, u2x u2xVar) {
        String str;
        dzd dzdVar = fi4Var.v;
        qdc qdcVar = (qdc) this.d;
        bi4 bi4Var = bi4.s;
        bi4 bi4Var2 = bi4.t;
        kue kueVar = (kue) this.f;
        u2xVar.getClass();
        bi4 bi4Var3 = bi4.u;
        ApplicationInfo applicationInfo = null;
        int i = 0;
        int i2 = 8;
        if (u2xVar.equals(bi4Var3) || u2xVar.equals(bi4Var2) || (u2xVar instanceof ci4)) {
            View view = (View) this.i;
            if (view == null) {
                Intrinsics.j("progressContainer");
                throw null;
            }
            view.setVisibility(0);
            View view2 = (View) this.h;
            if (view2 == null) {
                Intrinsics.j("errorContainer");
                throw null;
            }
            view2.setVisibility(8);
            ngv f = fi4Var.f();
            if (f != null) {
                f.r();
            }
            if (dzdVar != null) {
                dzdVar.c = false;
                dzdVar.h();
            }
        } else if (u2xVar.equals(bi4Var)) {
            ngv f2 = fi4Var.f();
            if (f2 != null) {
                f2.f();
            }
            if (dzdVar != null) {
                dzdVar.c = true;
                dzdVar.h();
            }
            View view3 = (View) this.i;
            if (view3 == null) {
                Intrinsics.j("progressContainer");
                throw null;
            }
            view3.setVisibility(8);
            View view4 = (View) this.h;
            if (view4 == null) {
                Intrinsics.j("errorContainer");
                throw null;
            }
            view4.setVisibility(8);
        } else {
            if (!(u2xVar instanceof ai4)) {
                b6e.s();
                return;
            }
            View view5 = (View) this.h;
            if (view5 == null) {
                Intrinsics.j("errorContainer");
                throw null;
            }
            view5.setVisibility(0);
            View view6 = (View) this.i;
            if (view6 == null) {
                Intrinsics.j("progressContainer");
                throw null;
            }
            view6.setVisibility(8);
            ngv f3 = fi4Var.f();
            if (f3 != null) {
                f3.r();
            }
            if (dzdVar != null) {
                dzdVar.c = false;
                dzdVar.h();
            }
        }
        if (u2xVar.equals(bi4Var3) || u2xVar.equals(bi4Var2) || u2xVar.equals(bi4Var)) {
            return;
        }
        if (u2xVar instanceof ci4) {
            kueVar.a("web", ((ci4) u2xVar).s, true);
            o(new q7h(this, i), R.string.bad_connection_error, R.string.try_again);
            return;
        }
        if (!(u2xVar instanceof di4)) {
            if (!(u2xVar instanceof ai4)) {
                b6e.s();
                return;
            }
            k5r.t(qdcVar, qdcVar, "wm_shown_backend_error_state");
            kueVar.a("web", ((ai4) u2xVar).s, true);
            o(new q7h(this, i), R.string.backend_error, R.string.try_again);
            return;
        }
        di4 di4Var = (di4) u2xVar;
        Context context = ((p7h) this.a).getContext();
        if (context == null) {
            return;
        }
        Throwable th = di4Var.s;
        jyr jyrVar = dwt.a;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            } else {
                try {
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.webview", 0);
        PackageInfo h = fx1.h(context);
        if (th2 instanceof UnsatisfiedLinkError) {
            o(new vw1(context, 4), R.string.webview_error_corrupted, R.string.webview_error_settings_btn);
            str = "webview broken";
        } else if (h != null) {
            o(new vw1(context, 5), R.string.webview_error_absent, R.string.webview_error_install_btn);
            str = "webview init failed";
        } else if (!context.getPackageManager().hasSystemFeature("android.software.webview")) {
            o(new vw1(context, 6), R.string.webview_error_unavailable, R.string.webview_error_settings_btn);
            str = "webview unsupported";
        } else if (applicationInfo == null) {
            o(new vw1(context, 7), R.string.webview_error_absent, R.string.webview_error_install_btn);
            str = "no webview uninstalled";
        } else if (applicationInfo.enabled) {
            o(new vw1(context, 9), R.string.webview_error_unavailable, R.string.webview_error_settings_btn);
            str = "webview unknown error";
        } else {
            o(new vw1(context, i2), R.string.webview_error_disabled, R.string.webview_error_enable_btn);
            str = "webview disabled";
        }
        Pair pair = new Pair("reason", str);
        String canonicalName = th.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        Pair pair2 = new Pair("error", canonicalName);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        Pair pair3 = new Pair("error message", message);
        String canonicalName2 = th2.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            canonicalName2 = "";
        }
        Pair pair4 = new Pair("cause", canonicalName2);
        String message2 = th2.getMessage();
        qdcVar.sendEvent("wm_shown_webview_error_state", uah.e(pair, pair2, pair3, pair4, new Pair("cause message", message2 != null ? message2 : "")));
        kueVar.getClass();
        kueVar.a("system", th2, true);
    }

    public void o(Function0 function0, int i, int i2) {
        Resources resources;
        Resources resources2;
        vbv vbvVar = (vbv) this.b;
        TextView textView = (TextView) this.j;
        if (textView == null) {
            Intrinsics.j("errorText");
            throw null;
        }
        Context context = (Context) this.n;
        if (context == null || (resources = context.getResources()) == null) {
            resources = vbvVar.a.getResources();
            resources.getClass();
        }
        textView.setText(resources.getString(i));
        TextView textView2 = (TextView) this.k;
        if (textView2 == null) {
            Intrinsics.j("errorBtn");
            throw null;
        }
        Context context2 = (Context) this.n;
        if (context2 == null || (resources2 = context2.getResources()) == null) {
            resources2 = vbvVar.a.getResources();
            resources2.getClass();
        }
        textView2.setText(resources2.getString(i2));
        TextView textView3 = (TextView) this.k;
        if (textView3 != null) {
            textView3.setOnClickListener(new hy7(4, function0));
        } else {
            Intrinsics.j("errorBtn");
            throw null;
        }
    }

    public void p(i6q i6qVar) {
        ((rjq) this.c).g();
        q(i6qVar.z(), (xdr) this.e);
        q(i6qVar.C(), (xdr) this.f);
        q(i6qVar.G(), (xdr) this.g);
        q(i6qVar.b(), (xdr) this.h);
        q(i6qVar.f0(), (xdr) this.i);
        q(i6qVar.h(), (xdr) this.j);
        q(i6qVar.a(), (xdr) this.k);
        q(i6qVar.S(), (xdr) this.l);
        q(i6qVar.N(), (xdr) this.m);
        q(i6qVar.g0(), (xdr) this.n);
    }

    public void q(vdr vdrVar, xdr xdrVar) {
        ox6.B(vdrVar, (um6) this.d, new ryp(21, xdrVar));
    }

    @Override // defpackage.i6q
    public vdr z() {
        return (xdr) this.e;
    }

    public ia0(Context context, cce cceVar, tf6 tf6Var, z66 z66Var, frt frtVar, cc7 cc7Var, oq7 oq7Var, k1l k1lVar, kll kllVar, yks yksVar, e0j e0jVar, mg5 mg5Var, jac jacVar, z2m z2mVar, rw5 rw5Var) {
        this.a = tf6Var;
        this.b = z66Var;
        this.c = frtVar;
        this.d = cc7Var;
        this.e = oq7Var;
        this.f = k1lVar;
        this.g = kllVar;
        this.h = yksVar;
        this.i = e0jVar;
        this.j = jacVar;
        this.k = z2mVar;
        this.l = rw5Var;
        this.m = btf.b(new e1v(this, 0));
        this.n = btf.b(new e1v(this, 1));
    }

    public ia0(jyr jyrVar, frt frtVar, vzo vzoVar, jyr jyrVar2, jyr jyrVar3, k6t k6tVar, f7l f7lVar, k1l k1lVar, q7l q7lVar, z6u z6uVar, g0l g0lVar, nxv nxvVar, cc7 cc7Var, fi1 fi1Var, z66 z66Var, u0w u0wVar, syv syvVar) {
        this.a = k6tVar;
        this.b = f7lVar;
        this.c = k1lVar;
        this.d = q7lVar;
        this.e = z6uVar;
        this.f = g0lVar;
        this.g = nxvVar;
        this.h = cc7Var;
        this.i = z66Var;
        this.j = btf.b(new nxv(7));
        final int i = 0;
        this.k = btf.b(new Function0(this) { // from class: h3w
            public final /* synthetic */ ia0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new t2w((d0w) ((jyr) this.b.j).getValue());
                    default:
                        return new i3w(this.b);
                }
            }
        });
        this.l = btf.b(new hav(12, vzoVar, this));
        final int i2 = 1;
        this.m = btf.b(new Function0(this) { // from class: h3w
            public final /* synthetic */ ia0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new t2w((d0w) ((jyr) this.b.j).getValue());
                    default:
                        return new i3w(this.b);
                }
            }
        });
        this.n = btf.b(new hav(13, this, frtVar));
    }

    public ia0(p7h p7hVar, vbv vbvVar, ChatRequest chatRequest, String str, String str2) {
        vbvVar.getClass();
        this.a = p7hVar;
        this.b = vbvVar;
        this.c = (kh4) vbvVar.w.getValue();
        this.d = vbvVar.r;
        this.e = vbvVar.g;
        this.f = (kue) vbvVar.z.getValue();
        this.g = btf.b(new q7h(this, 1));
        Bundle bundle = new Bundle();
        chatRequest.b(bundle);
        bundle.putString("STATE_KEY_META", str);
        p7hVar.setArguments(bundle);
        this.l = str2;
    }

    public ia0(c01 c01Var, ka1 ka1Var, t tVar, kxi kxiVar) {
        c01Var.getClass();
        this.a = c01Var;
        this.b = tVar;
        this.c = kxiVar;
        this.d = btf.b(new z3(18, this));
        this.e = btf.b(new zb0(24));
        bdt I = hag.I(cce.class);
        l18 l18Var = l18.b;
        this.f = l18Var.b(I, true);
        this.g = l18Var.b(hag.I(z66.class), true);
        this.h = l18Var.b(hag.I(lwc.class), true);
        this.i = btf.b(new hb(12, this, ka1Var));
        this.j = l18Var.b(hag.I(dy6.class), true);
        this.k = l18Var.b(hag.I(k6l.class), true);
        this.l = l18Var.b(hag.I(uwu.class), true);
        this.m = l18Var.b(hag.I(qwu.class), true);
        this.n = l18Var.b(hag.I(ab1.class), true);
    }

    public ia0(gdq gdqVar, zbi zbiVar, aci aciVar, tm0 tm0Var, Function1 function1) {
        this.a = zbiVar;
        this.b = aciVar;
        this.c = tm0Var;
        this.d = function1;
        this.e = new zue();
        this.f = new ga0(this);
        this.g = szf.g0(gdqVar);
        this.j = szf.U(new u90(this, 4));
        this.k = szf.U(new u90(this, 2));
        this.l = new t6k(Float.NaN);
        szf.T(ehv.h, new u90(this, 3));
        this.m = new t6k(0.0f);
        this.h = szf.g0(null);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.i = szf.g0(new i9h(e5bVar));
        this.n = new ba0(this);
    }
}
