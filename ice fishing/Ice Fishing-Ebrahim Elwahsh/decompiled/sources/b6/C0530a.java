package b6;

import g6.AbstractC4533c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0530a extends AbstractC4533c implements c {

    /* renamed from: v, reason: collision with root package name */
    public static final Comparator f5556v = Comparator.comparing(new G6.b(18));

    /* renamed from: w, reason: collision with root package name */
    public static final C0530a f5557w;

    static {
        C0530a c0530a;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                g6.e eVar = (g6.e) array[i];
                if (eVar != null && eVar.f37932b.isEmpty()) {
                    array[i] = null;
                }
            }
            c0530a = new C0530a(array, f5556v);
        } else {
            c0530a = new C0530a(arrayList.toArray());
        }
        f5557w = c0530a;
    }

    public final I1.f d() {
        return new I1.f(new ArrayList(Arrays.asList(this.f37928n)));
    }
}
