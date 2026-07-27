package O2;

import P2.InterfaceC0374d;
import android.content.Context;
import h3.C4564a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.b1;

/* renamed from: O2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366p extends AbstractRunnableC0368s {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2265v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0369t f2266w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2267x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0366p(C0369t c0369t, Object obj, int i) {
        super(c0369t);
        this.f2265v = i;
        this.f2266w = c0369t;
        this.f2267x = obj;
    }

    @Override // O2.AbstractRunnableC0368s
    public final void c() {
        C4564a c4564a;
        Set set;
        switch (this.f2265v) {
            case 0:
                C0369t c0369t = this.f2266w;
                S0.c cVar = new S0.c(c0369t.f2288w);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f2267x;
                for (N2.c cVar2 : hashMap.keySet()) {
                    cVar2.getClass();
                    if (((C0363m) hashMap.get(cVar2)).f2260c) {
                        arrayList2.add(cVar2);
                    } else {
                        arrayList.add(cVar2);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                Context context = c0369t.f2287v;
                int i = -1;
                int i6 = 0;
                if (isEmpty) {
                    int size = arrayList2.size();
                    while (i6 < size) {
                        i = cVar.r(context, (N2.c) arrayList2.get(i6));
                        i6++;
                        if (i == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i6 < size2) {
                        i = cVar.r(context, (N2.c) arrayList.get(i6));
                        i6++;
                        if (i != 0) {
                        }
                    }
                }
                z zVar = c0369t.f2285n;
                if (i != 0) {
                    C0364n c0364n = new C0364n(this, c0369t, new M2.b(i, null, null));
                    HandlerC0370u handlerC0370u = zVar.f2328x;
                    handlerC0370u.sendMessage(handlerC0370u.obtainMessage(1, c0364n));
                    return;
                }
                if (c0369t.f2277F && (c4564a = c0369t.f2275D) != null) {
                    c4564a.A();
                }
                for (N2.c cVar3 : hashMap.keySet()) {
                    InterfaceC0374d interfaceC0374d = (InterfaceC0374d) hashMap.get(cVar3);
                    cVar3.getClass();
                    if (cVar.r(context, cVar3) != 0) {
                        C0365o c0365o = new C0365o(c0369t, interfaceC0374d);
                        HandlerC0370u handlerC0370u2 = zVar.f2328x;
                        handlerC0370u2.sendMessage(handlerC0370u2.obtainMessage(1, c0365o));
                    } else {
                        cVar3.c(interfaceC0374d);
                    }
                }
                return;
            default:
                C0369t c0369t2 = this.f2266w;
                w wVar = c0369t2.f2285n.f2322F;
                z zVar2 = c0369t2.f2285n;
                b1 b1Var = c0369t2.f2281K;
                if (b1Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) b1Var.f39121n);
                    Map map = (Map) b1Var.f39123v;
                    for (N2.e eVar : map.keySet()) {
                        if (!zVar2.f2330z.containsKey(eVar.f1937b)) {
                            map.get(eVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                wVar.f2303I = set;
                ArrayList arrayList3 = (ArrayList) this.f2267x;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((N2.c) arrayList3.get(i9)).a(c0369t2.f2279H, zVar2.f2322F.f2303I);
                }
                return;
        }
    }
}
