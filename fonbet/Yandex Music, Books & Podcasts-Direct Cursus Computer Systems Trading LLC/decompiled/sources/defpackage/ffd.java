package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ffd implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jfd b;

    public /* synthetic */ ffd(jfd jfdVar, int i) {
        this.a = i;
        this.b = jfdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        ?? r3;
        switch (this.a) {
            case 0:
                Pair pair = (Pair) obj;
                phd phdVar = (phd) pair.a;
                List list = (List) pair.b;
                jfd jfdVar = this.b;
                if (list != null) {
                    xdr xdrVar = jfdVar.j;
                    pzq pzqVar = new pzq(list);
                    xdrVar.getClass();
                    xdrVar.m(null, pzqVar);
                }
                if (list != null) {
                    List list2 = list;
                    r3 = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r3.add(((fgd) it.next()).b);
                    }
                } else {
                    r3 = c5b.a;
                }
                if (phdVar != null) {
                    List list3 = phdVar.b;
                    xdr xdrVar2 = jfdVar.h;
                    List list4 = list3;
                    ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((egd) it2.next()).b);
                    }
                    xdrVar2.getClass();
                    xdrVar2.m(null, arrayList);
                    ked kedVar = jfdVar.a;
                    List list5 = phdVar.a;
                    list5.getClass();
                    if (!kedVar.h) {
                        x97.y(kedVar.b, null, null, new d57(kedVar, new zya(8, list5, kedVar), (Continuation) null, 15), 3);
                    }
                    xdr xdrVar3 = jfdVar.i;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list4) {
                        String deviceId = ((egd) obj2).b.getDeviceId();
                        deviceId.getClass();
                        if (r3.contains(deviceId)) {
                            arrayList2.add(obj2);
                        }
                    }
                    xdrVar3.getClass();
                    xdrVar3.m(null, arrayList2);
                }
                break;
            default:
                this.b.g.a(yed.a);
                break;
        }
        return Unit.a;
    }
}
