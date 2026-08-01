package g8;

import f8.AbstractC4516c;
import f8.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c8.e f37717n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4516c f37718u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c8.e eVar, AbstractC4516c abstractC4516c) {
        super(0);
        this.f37717n = eVar;
        this.f37718u = abstractC4516c;
    }

    @Override // I7.a
    public final Object invoke() {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC4516c abstractC4516c = this.f37718u;
        f8.j jVar = abstractC4516c.f37539a;
        c8.e eVar = this.f37717n;
        l.g(eVar, abstractC4516c);
        int e9 = eVar.e();
        for (int i = 0; i < e9; i++) {
            List h9 = eVar.h(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : h9) {
                if (obj instanceof u) {
                    arrayList.add(obj);
                }
            }
            u uVar = (u) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (uVar != null && (names = uVar.names()) != null) {
                for (String str : names) {
                    String str2 = kotlin.jvm.internal.h.a(eVar.d(), c8.h.f5650c) ? "enum value" : "property";
                    if (linkedHashMap.containsKey(str)) {
                        String message = "The suggested name '" + str + "' for " + str2 + ' ' + eVar.f(i) + " is already one of the names for " + str2 + ' ' + eVar.f(((Number) v7.t.O(str, linkedHashMap)).intValue()) + " in " + eVar;
                        kotlin.jvm.internal.h.e(message, "message");
                        throw new j(message);
                    }
                    linkedHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap.isEmpty() ? v7.q.f41443n : linkedHashMap;
    }
}
