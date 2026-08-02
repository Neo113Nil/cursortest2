package defpackage;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class vd11 {
    public final Object a;
    public final ArrayList b;

    public vd11(ArrayList arrayList, Object obj) {
        this.a = obj;
        this.b = arrayList;
    }

    public final Object a(int i) {
        Object obj = ((vd11) this.b.get(i)).a;
        if (obj != null) {
            return obj;
        }
        ny61.g("Child value is null");
        return null;
    }

    public final vd11 b(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i <= arrayList.size() - 1) {
                return (vd11) arrayList.get(i);
            }
        }
        return new ud11().b();
    }
}
