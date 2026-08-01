package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n;
import g1.C4523c;
import java.util.Map;
import n.C4743b;
import o.C4775c;
import o.C4776d;
import o.C4778f;

/* loaded from: classes.dex */
public class C {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f5090k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5091a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C4778f f5092b = new C4778f();

    /* renamed from: c, reason: collision with root package name */
    public int f5093c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5094d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5095e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5096f;

    /* renamed from: g, reason: collision with root package name */
    public int f5097g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5098h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final G0.c f5099j;

    public C() {
        Object obj = f5090k;
        this.f5096f = obj;
        this.f5099j = new G0.c(19, this);
        this.f5095e = obj;
        this.f5097g = -1;
    }

    public static void a(String str) {
        C4743b.T().f39446h.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(D.y.o("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b9) {
        if (b9.f5087u) {
            if (!b9.d()) {
                b9.b(false);
                return;
            }
            int i = b9.f5088v;
            int i6 = this.f5097g;
            if (i >= i6) {
                return;
            }
            b9.f5088v = i6;
            C4523c c4523c = b9.f5086n;
            Object obj = this.f5095e;
            c4523c.getClass();
            if (((InterfaceC0503v) obj) != null) {
                DialogInterfaceOnCancelListenerC0471n dialogInterfaceOnCancelListenerC0471n = (DialogInterfaceOnCancelListenerC0471n) c4523c.f37627u;
                if (dialogInterfaceOnCancelListenerC0471n.f5004E0) {
                    View z3 = dialogInterfaceOnCancelListenerC0471n.z();
                    if (z3.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0471n.f5008I0 != null) {
                        if (androidx.fragment.app.N.E(3)) {
                            Log.d("FragmentManager", "DialogFragment " + c4523c + " setting the content view on " + dialogInterfaceOnCancelListenerC0471n.f5008I0);
                        }
                        dialogInterfaceOnCancelListenerC0471n.f5008I0.setContentView(z3);
                    }
                }
            }
        }
    }

    public final void c(B b9) {
        if (this.f5098h) {
            this.i = true;
            return;
        }
        this.f5098h = true;
        do {
            this.i = false;
            if (b9 != null) {
                b(b9);
                b9 = null;
            } else {
                C4778f c4778f = this.f5092b;
                c4778f.getClass();
                C4776d c4776d = new C4776d(c4778f);
                c4778f.f39541v.put(c4776d, Boolean.FALSE);
                while (c4776d.hasNext()) {
                    b((B) ((Map.Entry) c4776d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f5098h = false;
    }

    public final void d(C4523c c4523c) {
        Object obj;
        a("observeForever");
        A a9 = new A(this, c4523c);
        C4778f c4778f = this.f5092b;
        C4775c a10 = c4778f.a(c4523c);
        if (a10 != null) {
            obj = a10.f39533u;
        } else {
            C4775c c4775c = new C4775c(c4523c, a9);
            c4778f.f39542w++;
            C4775c c4775c2 = c4778f.f39540u;
            if (c4775c2 == null) {
                c4778f.f39539n = c4775c;
                c4778f.f39540u = c4775c;
            } else {
                c4775c2.f39534v = c4775c;
                c4775c.f39535w = c4775c2;
                c4778f.f39540u = c4775c;
            }
            obj = null;
        }
        B b9 = (B) obj;
        if (b9 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b9 != null) {
            return;
        }
        a9.b(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f5097g++;
        this.f5095e = obj;
        c(null);
    }
}
