package K1;

import O1.q;
import android.util.Log;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0100q;
import androidx.lifecycle.InterfaceC0101s;
import androidx.navigation.fragment.FragmentNavigator;
import f0.C0141f;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj) {
        super(1);
        this.f405b = i;
        this.f406c = obj;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        switch (this.f405b) {
            case 0:
                H1.c cVar = (H1.c) obj;
                D1.i.e(cVar, "it");
                return ((String) this.f406c).subSequence(cVar.f342a, cVar.f343b + 1).toString();
            case 1:
                final C0141f c0141f = (C0141f) obj;
                D1.i.e(c0141f, "entry");
                final FragmentNavigator fragmentNavigator = (FragmentNavigator) this.f406c;
                return new InterfaceC0100q() { // from class: h0.j
                    @Override // androidx.lifecycle.InterfaceC0100q
                    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
                        FragmentNavigator fragmentNavigator2 = FragmentNavigator.this;
                        D1.i.e(fragmentNavigator2, "this$0");
                        C0141f c0141f2 = c0141f;
                        D1.i.e(c0141f2, "$entry");
                        if (enumC0096m == EnumC0096m.ON_RESUME && ((List) ((q) fragmentNavigator2.b().e.f852a).f()).contains(c0141f2)) {
                            if (FragmentNavigator.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + c0141f2 + " due to fragment " + interfaceC0101s + " view lifecycle reaching RESUMED");
                            }
                            fragmentNavigator2.b().b(c0141f2);
                        }
                        if (enumC0096m == EnumC0096m.ON_DESTROY) {
                            if (FragmentNavigator.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + c0141f2 + " due to fragment " + interfaceC0101s + " view lifecycle reaching DESTROYED");
                            }
                            fragmentNavigator2.b().b(c0141f2);
                        }
                    }
                };
            default:
                return obj == ((u1.c) this.f406c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
