package Q1;

import L1.AbstractC0018t;
import L1.C0011l;
import Z.AbstractComponentCallbacksC0070s;
import Z.V;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.InterfaceC0101s;
import androidx.navigation.fragment.FragmentNavigator;
import f0.C0141f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f967d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f965b = i;
        this.f966c = obj;
        this.f967d = obj2;
        this.e = obj3;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        switch (this.f965b) {
            case 0:
                C0011l a2 = a.a((C1.l) this.f966c, this.f967d, null);
                if (a2 != null) {
                    AbstractC0018t.b(a2, (v1.i) this.e);
                }
                return t1.i.f4388c;
            default:
                InterfaceC0101s interfaceC0101s = (InterfaceC0101s) obj;
                FragmentNavigator fragmentNavigator = (FragmentNavigator) this.f966c;
                ArrayList arrayList = fragmentNavigator.f2079g;
                boolean z2 = false;
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) this.f967d;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (D1.i.a(((t1.d) it.next()).f4378a, abstractComponentCallbacksC0070s.f1620y)) {
                                z2 = true;
                            }
                        }
                    }
                }
                if (interfaceC0101s != null && !z2) {
                    V v2 = abstractComponentCallbacksC0070s.f1593P;
                    if (v2 == null) {
                        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + abstractComponentCallbacksC0070s + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
                    }
                    v2.f();
                    C0103u c0103u = v2.f1497d;
                    if (c0103u.f2048c.compareTo(EnumC0097n.f2040c) >= 0) {
                        c0103u.a((androidx.lifecycle.r) fragmentNavigator.i.g((C0141f) this.e));
                    }
                }
                return t1.i.f4388c;
        }
    }
}
