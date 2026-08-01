package M6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f1882n;

    public /* synthetic */ d(g gVar) {
        this.f1882n = gVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        g gVar = this.f1882n;
        gVar.getClass();
        final HashMap hashMap = new HashMap();
        gVar.f1891f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i = 0;
            map.forEach(new BiConsumer() { // from class: M6.e
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    switch (i) {
                        case 0:
                            hashMap.put(str, Collections.singletonList(str2));
                            break;
                        default:
                            hashMap.merge(str, Collections.singletonList(str2), new f());
                            break;
                    }
                }
            });
        }
        final int i6 = 1;
        gVar.f1890e.forEach(new BiConsumer() { // from class: M6.e
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                switch (i6) {
                    case 0:
                        hashMap.put(str, Collections.singletonList(str2));
                        break;
                    default:
                        hashMap.merge(str, Collections.singletonList(str2), new f());
                        break;
                }
            }
        });
        return hashMap;
    }
}
