package defpackage;

import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class wei implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ wei(LinkedHashMap linkedHashMap, int i) {
        this.a = i;
        this.b = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (i) {
            case 0:
                return uvc.b((Integer) linkedHashMap.get(((ObjectOverMap) obj).a), (Integer) linkedHashMap.get(((ObjectOverMap) obj2).a));
            default:
                return uvc.b((Integer) linkedHashMap.get(((kq30) obj).a), (Integer) linkedHashMap.get(((kq30) obj2).a));
        }
    }
}
