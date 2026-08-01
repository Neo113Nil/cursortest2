package f6;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public interface c {
    static C4512a a(k6.e eVar, Object obj) {
        return (eVar == null || eVar.f38686b.isEmpty() || obj == null) ? C4512a.f37513w : new C4512a(new Object[]{eVar, obj});
    }

    static C4512a b(k6.e eVar, String str, k6.e eVar2, Boolean bool) {
        if (eVar != null) {
            String str2 = eVar.f38686b;
            if (!str2.isEmpty() && str != null) {
                if (eVar2 != null) {
                    String str3 = eVar2.f38686b;
                    if (!str3.isEmpty()) {
                        return str2.equals(str3) ? a(eVar2, bool) : str2.compareTo(str3) > 0 ? new C4512a(new Object[]{eVar2, bool, eVar, str}) : new C4512a(new Object[]{eVar, str, eVar2, bool});
                    }
                }
                return a(eVar, str);
            }
        }
        return a(eVar2, bool);
    }

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();

    int size();
}
