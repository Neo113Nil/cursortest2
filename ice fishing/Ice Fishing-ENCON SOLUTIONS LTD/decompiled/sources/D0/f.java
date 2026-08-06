package D0;

import A1.AbstractC0022x;
import Q1.A;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.tasks.Task;
import h.C0210f;
import h.C0213i;
import h.C0222s;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j0.C0966a;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.UUID;
import n0.InterfaceC0989c;
import o0.n;
import o0.u;
import p0.AbstractBinderC1004a;
import p0.AbstractC1021r;
import p0.C1003C;
import p0.C1017n;
import p0.InterfaceC1008e;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213a;

    /* renamed from: b, reason: collision with root package name */
    public Object f214b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f215c;

    public /* synthetic */ f(int i2, Object obj, Object obj2) {
        this.f213a = i2;
        this.f215c = obj;
        this.f214b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F1.i iVar;
        Z0.i iVar2;
        InterfaceC1008e interfaceC1008e;
        Set set;
        InterfaceC1008e interfaceC1008e2 = null;
        switch (this.f213a) {
            case 0:
                g gVar = (g) this.f215c;
                try {
                    Task w2 = ((Z0.i) gVar.f218c).w((Task) this.f214b);
                    if (w2 == null) {
                        ((m) gVar.f219d).e(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    k kVar = e.f212b;
                    w2.a(kVar, gVar);
                    m mVar = (m) w2;
                    h hVar = new h(kVar, gVar, 1);
                    j jVar = mVar.f230b;
                    jVar.c(hVar);
                    mVar.h();
                    jVar.c(new h(kVar, gVar, 0));
                    mVar.h();
                    return;
                } catch (c e2) {
                    if (e2.getCause() instanceof Exception) {
                        ((m) gVar.f219d).e((Exception) e2.getCause());
                        return;
                    } else {
                        ((m) gVar.f219d).e(e2);
                        return;
                    }
                } catch (Exception e3) {
                    ((m) gVar.f219d).e(e3);
                    return;
                }
            case 1:
                synchronized (((g) this.f215c).f218c) {
                    try {
                        a aVar = (a) ((g) this.f215c).f219d;
                        if (aVar != null) {
                            aVar.onComplete((Task) this.f214b);
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                synchronized (((g) this.f215c).f218c) {
                    try {
                        b bVar = (b) ((g) this.f215c).f219d;
                        if (bVar != null) {
                            bVar.onSuccess(((Task) this.f214b).c());
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                break;
            case 4:
                C0213i c0213i = (C0213i) this.f215c;
                g.j jVar2 = c0213i.f3254c;
                if (jVar2 != null && (iVar2 = jVar2.f3055e) != null) {
                    ((ActionMenuView) iVar2.f1992b).getClass();
                }
                ActionMenuView actionMenuView = c0213i.f3258g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0210f c0210f = (C0210f) this.f214b;
                    if (!c0210f.b()) {
                        if (c0210f.f3103e != null) {
                            c0210f.d(0, 0, false, false);
                        }
                    }
                    c0213i.f3269r = c0210f;
                }
                c0213i.t = null;
                return;
            case 5:
                C0222s c0222s = (C0222s) ((WeakReference) this.f214b).get();
                if (c0222s != null && c0222s.f3350m) {
                    TextView textView = c0222s.f3338a;
                    Typeface typeface = (Typeface) this.f215c;
                    textView.setTypeface(typeface);
                    c0222s.f3349l = typeface;
                    return;
                }
                return;
            case 6:
                n nVar = (n) this.f215c;
                o0.l lVar = (o0.l) nVar.f8294f.f8266j.get(nVar.f8290b);
                if (lVar == null) {
                    return;
                }
                m0.b bVar2 = (m0.b) this.f214b;
                if ((bVar2.f8163b == 0 ? 1 : 0) == 0) {
                    lVar.o(bVar2, null);
                    return;
                }
                nVar.f8293e = true;
                InterfaceC0989c interfaceC0989c = nVar.f8289a;
                if (interfaceC0989c.j()) {
                    if (!nVar.f8293e || (interfaceC1008e = nVar.f8291c) == null) {
                        return;
                    }
                    interfaceC0989c.l(interfaceC1008e, nVar.f8292d);
                    return;
                }
                try {
                    interfaceC0989c.l(null, interfaceC0989c.g());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    interfaceC0989c.i("Failed to get service from broker.");
                    lVar.o(new m0.b(10), null);
                    return;
                }
            case 7:
                C0.f fVar = (C0.f) this.f214b;
                m0.b bVar3 = fVar.f145b;
                boolean z2 = bVar3.f8163b == 0;
                u uVar = (u) this.f215c;
                if (z2) {
                    C1017n c1017n = fVar.f146c;
                    AbstractC1021r.c(c1017n);
                    m0.b bVar4 = c1017n.f8396c;
                    if (bVar4.f8163b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        uVar.f8317h.b(bVar4);
                        uVar.f8316g.h();
                        return;
                    }
                    n nVar2 = uVar.f8317h;
                    IBinder iBinder = c1017n.f8395b;
                    if (iBinder != null) {
                        int i2 = AbstractBinderC1004a.f8342b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC1008e2 = queryLocalInterface instanceof InterfaceC1008e ? (InterfaceC1008e) queryLocalInterface : new C1003C(iBinder);
                    }
                    nVar2.getClass();
                    if (interfaceC1008e2 == null || (set = uVar.f8314e) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        nVar2.b(new m0.b(4));
                    } else {
                        nVar2.f8291c = interfaceC1008e2;
                        nVar2.f8292d = set;
                        if (nVar2.f8293e) {
                            nVar2.f8289a.l(interfaceC1008e2, set);
                        }
                    }
                } else {
                    uVar.f8317h.b(bVar3);
                }
                uVar.f8316g.h();
                return;
            case 8:
                A a2 = (A) ((Z0.i) this.f214b).f1992b;
                if (a2 != null) {
                    a2.b((Typeface) this.f215c);
                    return;
                }
                return;
            case 9:
                ((v.d) this.f214b).accept(this.f215c);
                return;
            default:
                x0.e eVar = (x0.e) this.f214b;
                Context context = (Context) eVar.f8530b;
                String string = x0.e.t(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = x0.e.t((Context) eVar.f8530b).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? 33696000000L + j2 : -1L;
                m mVar2 = ((d) this.f215c).f210a;
                if (string == null || System.currentTimeMillis() > j3) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new x0.d("Failed to store the app set ID.");
                        }
                        x0.e.u(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new x0.d("Failed to store the app set ID creation time.");
                        }
                    } catch (x0.d e5) {
                        mVar2.e(e5);
                        return;
                    }
                } else {
                    try {
                        x0.e.u(context);
                    } catch (x0.d e6) {
                        mVar2.e(e6);
                        return;
                    }
                }
                mVar2.f(new C0966a(string, 1));
                return;
        }
        do {
            try {
                ((Runnable) this.f214b).run();
            } catch (Throwable th) {
                AbstractC0022x.d(th, l1.j.f8138a);
            }
            iVar = (F1.i) this.f215c;
            Runnable o2 = iVar.o();
            if (o2 == null) {
                return;
            }
            this.f214b = o2;
            r2++;
        } while (r2 < 16);
        H1.l lVar2 = iVar.f608c;
        lVar2.getClass();
        lVar2.j(iVar, this);
    }

    public /* synthetic */ f(Object obj, Object obj2, int i2, boolean z2) {
        this.f213a = i2;
        this.f214b = obj;
        this.f215c = obj2;
    }
}
