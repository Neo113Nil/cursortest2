package g8;

import f8.AbstractC4526c;
import f8.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c8.e f37742n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4526c f37743u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c8.e eVar, AbstractC4526c abstractC4526c) {
        super(0);
        this.f37742n = eVar;
        this.f37743u = abstractC4526c;
    }

    @Override // I7.a
    public final Object invoke() {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC4526c abstractC4526c = this.f37743u;
        f8.j jVar = abstractC4526c.f37501a;
        c8.e eVar = this.f37742n;
        l.g(eVar, abstractC4526c);
        int e9 = eVar.e();
        for (int i = 0; i < e9; i++) {
            List h3 = eVar.h(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : h3) {
                if (obj instanceof u) {
                    arrayList.add(obj);
                }
            }
            u uVar = (u) (arrayList.size() == 1 ? arrayList.get(0) : null);
            if (uVar != null && (names = uVar.names()) != null) {
                for (String str : names) {
                    String str2 = kotlin.jvm.internal.h.a(eVar.d(), c8.h.f5826c) ? "enum value" : "property";
                    if (linkedHashMap.containsKey(str)) {
                        String message = "The suggested name '" + str + "' for " + str2 + ' ' + eVar.f(i) + " is already one of the names for " + str2 + ' ' + eVar.f(((Number) v7.t.s(str, linkedHashMap)).intValue()) + " in " + eVar;
                        kotlin.jvm.internal.h.e(message, "message");
                        throw new j(message);
                    }
                    linkedHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap.isEmpty() ? v7.q.f41222n : linkedHashMap;
    }
}
