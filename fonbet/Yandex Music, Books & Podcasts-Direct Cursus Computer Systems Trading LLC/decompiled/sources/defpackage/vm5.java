package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class vm5 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final nn5 f;
    public final Set g;

    public vm5(String str, Set set, Set set2, int i, int i2, nn5 nn5Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = nn5Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static eg0 a(m5n m5nVar) {
        m5n[] m5nVarArr = new m5n[0];
        eg0 eg0Var = new eg0();
        eg0Var.c = null;
        HashSet hashSet = new HashSet();
        eg0Var.d = hashSet;
        eg0Var.e = new HashSet();
        eg0Var.a = 0;
        eg0Var.b = 0;
        eg0Var.g = new HashSet();
        hashSet.add(m5nVar);
        for (m5n m5nVar2 : m5nVarArr) {
            v3g.w(m5nVar2, "Null interface");
        }
        Collections.addAll((HashSet) eg0Var.d, m5nVarArr);
        return eg0Var;
    }

    public static eg0 b(Class cls) {
        return new eg0(cls, new Class[0]);
    }

    public static vm5 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(m5n.a(cls));
        for (Class cls2 : clsArr) {
            v3g.w(cls2, "Null interface");
            hashSet.add(m5n.a(cls2));
        }
        return new vm5(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new n(15, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
