package h;

import N3.InterfaceC0323a;
import O.X;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d2.InterfaceC4460b;
import i1.C4585b;
import java.io.IOException;
import java.util.WeakHashMap;
import m.InterfaceC4714n;
import m.V0;
import m.c1;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4543G implements V0, InterfaceC4460b, InterfaceC4714n, m8.i, P.u, InterfaceC0323a, Q1.a {

    /* renamed from: n, reason: collision with root package name */
    public Object f37843n;

    public /* synthetic */ C4543G(Object obj) {
        this.f37843n = obj;
    }

    @Override // N3.InterfaceC0323a
    public void K(Bundle bundle) {
        t2.g gVar = (t2.g) this.f37843n;
        if (gVar != null) {
            try {
                gVar.K(bundle);
            } catch (RemoteException e9) {
                x2.i.d("RemoteException in onError", e9);
            }
        }
    }

    @Override // N3.InterfaceC0323a
    public void O(Bundle bundle) {
        t2.g gVar = (t2.g) this.f37843n;
        if (gVar != null) {
            try {
                gVar.O(bundle);
            } catch (RemoteException e9) {
                x2.i.d("RemoteException in onShown", e9);
            }
        }
    }

    @Override // N3.InterfaceC0323a
    public void W(Bundle bundle) {
        t2.g gVar = (t2.g) this.f37843n;
        if (gVar != null) {
            try {
                gVar.W(bundle);
            } catch (RemoteException e9) {
                x2.i.d("RemoteException in onDismissed", e9);
            }
        }
    }

    @Override // m8.i
    public m8.q a() {
        m8.v q8;
        IOException iOException = null;
        while (true) {
            m8.s sVar = (m8.s) this.f37843n;
            if (!sVar.f39577D.k()) {
                try {
                    q8 = sVar.q();
                } catch (IOException e9) {
                    if (iOException == null) {
                        iOException = e9;
                    } else {
                        A8.b.a(iOException, e9);
                    }
                    if (!sVar.k(null)) {
                        throw iOException;
                    }
                }
                if (q8.isReady()) {
                    break;
                }
                m8.u c9 = q8.c();
                if (c9.f39591b == null && c9.f39592c == null) {
                    c9 = q8.e();
                }
                m8.e eVar = c9.f39591b;
                Throwable th = c9.f39592c;
                if (th != null) {
                    throw th;
                }
                if (eVar == null) {
                    break;
                }
                sVar.f39581H.addFirst(eVar);
            } else {
                throw new IOException("Canceled");
            }
        }
        return q8.b();
    }

    @Override // m8.i
    public m8.w b() {
        return (m8.s) this.f37843n;
    }

    @Override // Q1.a
    public Object e() {
        c1 c1Var = (c1) this.f37843n;
        return new w1.o((z1.d) c1Var.f39192n, (z1.d) c1Var.f39193u, (z1.d) c1Var.f39194v, (z1.d) c1Var.f39195w, (w1.k) c1Var.f39196x, (w1.k) c1Var.f39197y, (b3.e) c1Var.f39198z);
    }

    @Override // P.u
    public boolean f(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f37843n;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = X.f2142a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f36594d;
        view.offsetLeftAndRight((!(i == 0 && z6) && (i != 1 || z6)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // t7.InterfaceC5045a
    public Object get() {
        String packageName = ((Context) ((C4585b) this.f37843n).f38152u).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
