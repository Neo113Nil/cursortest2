package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class p0b {
    public final k0b a;
    public final oq7 b;
    public Object c = c5b.a;
    public boolean d;

    public p0b(k0b k0bVar, oq7 oq7Var) {
        this.a = k0bVar;
        this.b = oq7Var;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q0b) obj).b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
