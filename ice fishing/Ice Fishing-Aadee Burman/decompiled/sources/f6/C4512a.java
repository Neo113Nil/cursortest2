package f6;

import d1.C4445c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import k6.AbstractC4638c;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4512a extends AbstractC4638c implements c {

    /* renamed from: v, reason: collision with root package name */
    public static final Comparator f37512v = Comparator.comparing(new K6.b(18));

    /* renamed from: w, reason: collision with root package name */
    public static final C4512a f37513w;

    static {
        C4512a c4512a;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                k6.e eVar = (k6.e) array[i];
                if (eVar != null && eVar.f38686b.isEmpty()) {
                    array[i] = null;
                }
            }
            c4512a = new C4512a(array, f37512v);
        } else {
            c4512a = new C4512a(arrayList.toArray());
        }
        f37513w = c4512a;
    }

    public final C4445c d() {
        return new C4445c(new ArrayList(Arrays.asList(this.f38682n)));
    }
}
