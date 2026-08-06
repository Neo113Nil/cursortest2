package J1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f893a;

    public l(int i2) {
        switch (i2) {
            case 1:
                this.f893a = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            default:
                this.f893a = new ArrayList(20);
                break;
        }
    }

    public void a(String name, String value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        ArrayList arrayList = this.f893a;
        arrayList.add(name);
        arrayList.add(z1.g.k0(value).toString());
    }

    public m b() {
        Object[] array = this.f893a.toArray(new String[0]);
        if (array != null) {
            return new m((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public List c() {
        ArrayList arrayList;
        if (this.f893a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f893a) {
            arrayList = new ArrayList(this.f893a);
        }
        return arrayList;
    }

    public void d(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f893a;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                arrayList.remove(i2);
                arrayList.remove(i2);
                i2 -= 2;
            }
            i2 += 2;
        }
    }
}
