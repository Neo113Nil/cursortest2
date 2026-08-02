package Q2;

import R2.InterfaceC0378d;
import android.content.Context;
import j3.C4612a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.c1;

/* renamed from: Q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370o extends r {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2581v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0373s f2582w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2583x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0370o(C0373s c0373s, Object obj, int i) {
        super(c0373s);
        this.f2581v = i;
        this.f2582w = c0373s;
        this.f2583x = obj;
    }

    @Override // Q2.r
    public final void c() {
        C4612a c4612a;
        Set set;
        switch (this.f2581v) {
            case 0:
                C0373s c0373s = this.f2582w;
                S0.e eVar = new S0.e(c0373s.f2604w);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f2583x;
                for (P2.c cVar : hashMap.keySet()) {
                    cVar.getClass();
                    if (((C0367l) hashMap.get(cVar)).f2576c) {
                        arrayList2.add(cVar);
                    } else {
                        arrayList.add(cVar);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                Context context = c0373s.f2603v;
                int i = -1;
                int i4 = 0;
                if (isEmpty) {
                    int size = arrayList2.size();
                    while (i4 < size) {
                        i = eVar.D(context, (P2.c) arrayList2.get(i4));
                        i4++;
                        if (i == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i4 < size2) {
                        i = eVar.D(context, (P2.c) arrayList.get(i4));
                        i4++;
                        if (i != 0) {
                        }
                    }
                }
                y yVar = c0373s.f2601n;
                if (i != 0) {
                    C0368m c0368m = new C0368m(this, c0373s, new O2.b(i, null, null));
                    HandlerC0374t handlerC0374t = yVar.f2644x;
                    handlerC0374t.sendMessage(handlerC0374t.obtainMessage(1, c0368m));
                    return;
                }
                if (c0373s.f2593F && (c4612a = c0373s.f2591D) != null) {
                    c4612a.A();
                }
                for (P2.c cVar2 : hashMap.keySet()) {
                    InterfaceC0378d interfaceC0378d = (InterfaceC0378d) hashMap.get(cVar2);
                    cVar2.getClass();
                    if (eVar.D(context, cVar2) != 0) {
                        C0369n c0369n = new C0369n(c0373s, interfaceC0378d);
                        HandlerC0374t handlerC0374t2 = yVar.f2644x;
                        handlerC0374t2.sendMessage(handlerC0374t2.obtainMessage(1, c0369n));
                    } else {
                        cVar2.l(interfaceC0378d);
                    }
                }
                return;
            default:
                C0373s c0373s2 = this.f2582w;
                v vVar = c0373s2.f2601n.f2638F;
                y yVar2 = c0373s2.f2601n;
                c1 c1Var = c0373s2.f2597K;
                if (c1Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) c1Var.f39192n);
                    Map map = (Map) c1Var.f39194v;
                    for (P2.e eVar2 : map.keySet()) {
                        if (!yVar2.f2646z.containsKey(eVar2.f2381b)) {
                            map.get(eVar2).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                vVar.f2619I = set;
                ArrayList arrayList3 = (ArrayList) this.f2583x;
                int size3 = arrayList3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((P2.c) arrayList3.get(i6)).c(c0373s2.f2595H, yVar2.f2638F.f2619I);
                }
                return;
        }
    }
}
