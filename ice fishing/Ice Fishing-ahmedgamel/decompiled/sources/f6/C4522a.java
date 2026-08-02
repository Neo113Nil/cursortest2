package f6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import k6.AbstractC4649c;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4522a extends AbstractC4649c implements c {

    /* renamed from: v, reason: collision with root package name */
    public static final Comparator f37474v = Comparator.comparing(new K6.b(18));

    /* renamed from: w, reason: collision with root package name */
    public static final C4522a f37475w;

    static {
        C4522a c4522a;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                k6.e eVar = (k6.e) array[i];
                if (eVar != null && eVar.f38613b.isEmpty()) {
                    array[i] = null;
                }
            }
            c4522a = new C4522a(array, f37474v);
        } else {
            c4522a = new C4522a(arrayList.toArray());
        }
        f37475w = c4522a;
    }

    public final K1.c d() {
        return new K1.c(new ArrayList(Arrays.asList(this.f38609n)));
    }
}
