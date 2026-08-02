package O;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractC0460h;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;

/* renamed from: O.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0342l implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2189n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2190u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2191v;

    public /* synthetic */ C0342l(int i, Object obj, Object obj2) {
        this.f2189n = i;
        this.f2190u = obj;
        this.f2191v = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        switch (this.f2189n) {
            case 0:
                EnumC0500n enumC0500n2 = EnumC0500n.ON_DESTROY;
                C0344n c0344n = (C0344n) this.f2190u;
                if (enumC0500n != enumC0500n2) {
                    c0344n.getClass();
                    break;
                } else {
                    c0344n.b((InterfaceC0346p) this.f2191v);
                    break;
                }
            default:
                if (enumC0500n == EnumC0500n.ON_CREATE) {
                    OnBackInvokedDispatcher a9 = AbstractC0460h.a((androidx.activity.p) this.f2191v);
                    androidx.activity.G g9 = (androidx.activity.G) this.f2190u;
                    g9.f4395e = a9;
                    g9.d(g9.f4397g);
                    break;
                }
                break;
        }
    }
}
