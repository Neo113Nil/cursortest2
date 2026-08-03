package o6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5312i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f5313j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5314k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, Object obj, int i10) {
        super(sVar);
        this.f5312i = i10;
        this.f5313j = sVar;
        this.f5314k = obj;
    }

    @Override // o6.r
    public final void c() {
        e7.a aVar;
        Set set;
        switch (this.f5312i) {
            case 0:
                s sVar = this.f5313j;
                y yVar = sVar.f5326g;
                Context context = sVar.f5328i;
                x4.e eVar = new x4.e(sVar.f5329j);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f5314k;
                for (n6.a aVar2 : hashMap.keySet()) {
                    aVar2.getClass();
                    if (((l) hashMap.get(aVar2)).f5295c) {
                        arrayList2.add(aVar2);
                    } else {
                        arrayList.add(aVar2);
                    }
                }
                int i10 = 0;
                int i11 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i10 < size) {
                        i11 = eVar.j(context, (n6.a) arrayList2.get(i10));
                        i10++;
                        if (i11 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        i11 = eVar.j(context, (n6.a) arrayList.get(i10));
                        i10++;
                        if (i11 != 0) {
                        }
                    }
                }
                if (i11 != 0) {
                    m mVar = new m(this, sVar, new m6.b(i11, null));
                    t tVar = yVar.f5377h;
                    tVar.sendMessage(tVar.obtainMessage(1, mVar));
                    return;
                }
                if (sVar.f5338s && (aVar = sVar.f5336q) != null) {
                    aVar.x();
                }
                for (n6.a aVar3 : hashMap.keySet()) {
                    p6.b bVar = (p6.b) hashMap.get(aVar3);
                    aVar3.getClass();
                    if (eVar.j(context, aVar3) != 0) {
                        n nVar = new n(sVar, bVar);
                        t tVar2 = yVar.f5377h;
                        tVar2.sendMessage(tVar2.obtainMessage(1, nVar));
                    } else {
                        aVar3.d(bVar);
                    }
                }
                return;
            default:
                s sVar2 = this.f5313j;
                y yVar2 = sVar2.f5326g;
                v vVar = yVar2.f5385p;
                p6.d dVar = sVar2.f5343x;
                if (dVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) dVar.f5557c);
                    Map map = (Map) dVar.f5559e;
                    for (n6.c cVar : map.keySet()) {
                        if (!yVar2.f5379j.containsKey(cVar.f5072b)) {
                            map.get(cVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                vVar.f5364p = set;
                ArrayList arrayList3 = (ArrayList) this.f5314k;
                int size3 = arrayList3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((n6.a) arrayList3.get(i12)).k(sVar2.f5340u, yVar2.f5385p.f5364p);
                }
                return;
        }
    }
}
