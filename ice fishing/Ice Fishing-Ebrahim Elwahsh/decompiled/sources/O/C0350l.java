package O;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractC0466h;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;

/* renamed from: O.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0350l implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2287n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2288u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2289v;

    public /* synthetic */ C0350l(int i, Object obj, Object obj2) {
        this.f2287n = i;
        this.f2288u = obj;
        this.f2289v = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        switch (this.f2287n) {
            case 0:
                EnumC0506n enumC0506n2 = EnumC0506n.ON_DESTROY;
                C0352n c0352n = (C0352n) this.f2288u;
                if (enumC0506n != enumC0506n2) {
                    c0352n.getClass();
                    break;
                } else {
                    c0352n.b((InterfaceC0354p) this.f2289v);
                    break;
                }
            default:
                if (enumC0506n == EnumC0506n.ON_CREATE) {
                    OnBackInvokedDispatcher a9 = AbstractC0466h.a((androidx.activity.p) this.f2289v);
                    androidx.activity.G g9 = (androidx.activity.G) this.f2288u;
                    g9.f4542e = a9;
                    g9.d(g9.f4544g);
                    break;
                }
                break;
        }
    }
}
