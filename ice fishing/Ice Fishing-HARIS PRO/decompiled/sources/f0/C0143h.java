package f0;

import Z.AbstractComponentCallbacksC0070s;
import android.util.Log;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.InterfaceC0100q;
import androidx.lifecycle.InterfaceC0101s;
import androidx.navigation.fragment.FragmentNavigator;
import java.util.Iterator;
import l0.C0233d;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0143h implements InterfaceC0100q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2932b;

    public /* synthetic */ C0143h(int i, Object obj) {
        this.f2931a = i;
        this.f2932b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        switch (this.f2931a) {
            case 0:
                z zVar = (z) this.f2932b;
                D1.i.e(zVar, "this$0");
                zVar.f3018q = enumC0096m.a();
                if (zVar.f3007c != null) {
                    Iterator it = u1.g.Z(zVar.f3010g).iterator();
                    while (it.hasNext()) {
                        C0141f c0141f = (C0141f) it.next();
                        c0141f.getClass();
                        c0141f.f2922d = enumC0096m.a();
                        c0141f.g();
                    }
                    break;
                }
                break;
            case 1:
                FragmentNavigator fragmentNavigator = (FragmentNavigator) this.f2932b;
                D1.i.e(fragmentNavigator, "this$0");
                if (enumC0096m == EnumC0096m.ON_DESTROY) {
                    AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) interfaceC0101s;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((O1.q) fragmentNavigator.b().f2937f.f852a).f()) {
                        if (D1.i.a(((C0141f) obj2).f2923f, abstractComponentCallbacksC0070s.f1620y)) {
                            obj = obj2;
                        }
                    }
                    C0141f c0141f2 = (C0141f) obj;
                    if (c0141f2 != null) {
                        if (FragmentNavigator.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + c0141f2 + " due to fragment " + interfaceC0101s + " lifecycle reaching DESTROYED");
                        }
                        fragmentNavigator.b().b(c0141f2);
                        break;
                    }
                }
                break;
            default:
                C0233d c0233d = (C0233d) this.f2932b;
                D1.i.e(c0233d, "this$0");
                if (enumC0096m == EnumC0096m.ON_START) {
                    c0233d.f3783c = true;
                    break;
                } else if (enumC0096m == EnumC0096m.ON_STOP) {
                    c0233d.f3783c = false;
                    break;
                }
                break;
        }
    }
}
