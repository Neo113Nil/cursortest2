package O;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractC0456h;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;

/* renamed from: O.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0337l implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2101n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2102u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2103v;

    public /* synthetic */ C0337l(int i, Object obj, Object obj2) {
        this.f2101n = i;
        this.f2102u = obj;
        this.f2103v = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        switch (this.f2101n) {
            case 0:
                EnumC0496n enumC0496n2 = EnumC0496n.ON_DESTROY;
                C0339n c0339n = (C0339n) this.f2102u;
                if (enumC0496n != enumC0496n2) {
                    c0339n.getClass();
                    break;
                } else {
                    c0339n.b((InterfaceC0341p) this.f2103v);
                    break;
                }
            default:
                if (enumC0496n == EnumC0496n.ON_CREATE) {
                    OnBackInvokedDispatcher a9 = AbstractC0456h.a((androidx.activity.p) this.f2103v);
                    androidx.activity.G g4 = (androidx.activity.G) this.f2102u;
                    g4.f4427e = a9;
                    g4.d(g4.f4429g);
                    break;
                }
                break;
        }
    }
}
