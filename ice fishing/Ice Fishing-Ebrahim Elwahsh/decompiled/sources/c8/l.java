package c8;

import b8.AbstractC0534c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.i implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y7.e f5774n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0534c f5775u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y7.e eVar, AbstractC0534c abstractC0534c) {
        super(0);
        this.f5774n = eVar;
        this.f5775u = abstractC0534c;
    }

    @Override // E7.a
    public final Object invoke() {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC0534c abstractC0534c = this.f5775u;
        b8.j jVar = abstractC0534c.f5583a;
        Y7.e eVar = this.f5774n;
        m.g(eVar, abstractC0534c);
        int e6 = eVar.e();
        for (int i = 0; i < e6; i++) {
            List h9 = eVar.h(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : h9) {
                if (obj instanceof b8.u) {
                    arrayList.add(obj);
                }
            }
            b8.u uVar = (b8.u) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (uVar != null && (names = uVar.names()) != null) {
                for (String str : names) {
                    String str2 = kotlin.jvm.internal.h.a(eVar.d(), Y7.h.f4055h) ? "enum value" : "property";
                    if (linkedHashMap.containsKey(str)) {
                        String message = "The suggested name '" + str + "' for " + str2 + ' ' + eVar.f(i) + " is already one of the names for " + str2 + ' ' + eVar.f(((Number) r7.t.y(str, linkedHashMap)).intValue()) + " in " + eVar;
                        kotlin.jvm.internal.h.e(message, "message");
                        throw new k(message);
                    }
                    linkedHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap.isEmpty() ? r7.q.f40359n : linkedHashMap;
    }
}
