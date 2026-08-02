package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n;
import java.util.Map;
import n.C4757b;
import o.C4791c;
import o.C4792d;
import o.C4794f;

/* loaded from: classes.dex */
public class C {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f5057k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5058a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C4794f f5059b = new C4794f();

    /* renamed from: c, reason: collision with root package name */
    public int f5060c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5061d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5062e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5063f;

    /* renamed from: g, reason: collision with root package name */
    public int f5064g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5065h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final G0.c f5066j;

    public C() {
        Object obj = f5057k;
        this.f5063f = obj;
        this.f5066j = new G0.c(18, this);
        this.f5062e = obj;
        this.f5064g = -1;
    }

    public static void a(String str) {
        C4757b.z().f39604b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(D.x.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b9) {
        if (b9.f5054u) {
            if (!b9.d()) {
                b9.b(false);
                return;
            }
            int i = b9.f5055v;
            int i4 = this.f5064g;
            if (i >= i4) {
                return;
            }
            b9.f5055v = i4;
            n4.c cVar = b9.f5053n;
            Object obj = this.f5062e;
            cVar.getClass();
            if (((InterfaceC0507v) obj) != null) {
                DialogInterfaceOnCancelListenerC0475n dialogInterfaceOnCancelListenerC0475n = (DialogInterfaceOnCancelListenerC0475n) cVar.f39658u;
                if (dialogInterfaceOnCancelListenerC0475n.f4981z0) {
                    View z6 = dialogInterfaceOnCancelListenerC0475n.z();
                    if (z6.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0475n.f4971D0 != null) {
                        if (androidx.fragment.app.N.E(3)) {
                            Log.d("FragmentManager", "DialogFragment " + cVar + " setting the content view on " + dialogInterfaceOnCancelListenerC0475n.f4971D0);
                        }
                        dialogInterfaceOnCancelListenerC0475n.f4971D0.setContentView(z6);
                    }
                }
            }
        }
    }

    public final void c(B b9) {
        if (this.f5065h) {
            this.i = true;
            return;
        }
        this.f5065h = true;
        do {
            this.i = false;
            if (b9 != null) {
                b(b9);
                b9 = null;
            } else {
                C4794f c4794f = this.f5059b;
                c4794f.getClass();
                C4792d c4792d = new C4792d(c4794f);
                c4794f.f39708v.put(c4792d, Boolean.FALSE);
                while (c4792d.hasNext()) {
                    b((B) ((Map.Entry) c4792d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f5065h = false;
    }

    public final void d(n4.c cVar) {
        Object obj;
        a("observeForever");
        A a9 = new A(this, cVar);
        C4794f c4794f = this.f5059b;
        C4791c a10 = c4794f.a(cVar);
        if (a10 != null) {
            obj = a10.f39700u;
        } else {
            C4791c c4791c = new C4791c(cVar, a9);
            c4794f.f39709w++;
            C4791c c4791c2 = c4794f.f39707u;
            if (c4791c2 == null) {
                c4794f.f39706n = c4791c;
                c4794f.f39707u = c4791c;
            } else {
                c4791c2.f39701v = c4791c;
                c4791c.f39702w = c4791c2;
                c4794f.f39707u = c4791c;
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
        this.f5064g++;
        this.f5062e = obj;
        c(null);
    }
}
