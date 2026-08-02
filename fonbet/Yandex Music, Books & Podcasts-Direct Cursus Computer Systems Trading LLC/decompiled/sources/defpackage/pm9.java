package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class pm9 {
    public final long a;
    public final List b;
    public final List c;
    public final boolean d;
    public final jyr e;
    public final jyr f;

    public pm9(long j, List list, List list2, boolean z) {
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = btf.b(new om9(this, 0));
        this.f = btf.b(new om9(this, 1));
    }

    public final pm9 a(String str, cm9 cm9Var, String str2) {
        String str3;
        jc8 jc8Var;
        String id;
        List list = this.b;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        if (cm9Var == null || (str3 = cm9Var.d) == null) {
            str3 = str2;
        }
        arrayList.add(new Pair(str, str3));
        if (cm9Var != null && (jc8Var = cm9Var.c) != null && (id = jc8Var.d().getId()) != null) {
            str2 = id;
        } else if (cm9Var != null) {
            str2 = cm9Var.d;
        }
        List list2 = this.c;
        ArrayList arrayList2 = new ArrayList(list2.size() + 1);
        arrayList2.addAll(list2);
        arrayList2.add(str2);
        return new pm9(arrayList, 8, arrayList2, this.a);
    }

    public final pm9 b(String str) {
        List list = this.c;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(str);
        return new pm9(this.b, 8, arrayList, this.a);
    }

    public final String c() {
        return (String) this.e.getValue();
    }

    public final String d() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return (String) ((Pair) CollectionsKt.Y(list)).b;
    }

    public final String e() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return new pm9(list.subList(0, list.size() - 1), 8, this.c, this.a).f() + '/' + ((String) ((Pair) CollectionsKt.Y(list)).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm9)) {
            return false;
        }
        pm9 pm9Var = (pm9) obj;
        return this.a == pm9Var.a && Intrinsics.d(this.b, pm9Var.b) && Intrinsics.d(this.c, pm9Var.c) && this.d == pm9Var.d;
    }

    public final String f() {
        return (String) this.f.getValue();
    }

    public final pm9 g() {
        int i;
        int i2;
        int intValue;
        List list = this.b;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            Pair pair = (Pair) arrayList.remove(arrayList.size() - 1);
            List list2 = this.c;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.d((String) listIterator.previous(), (String) pair.a)) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else {
                ListIterator listIterator2 = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    if (StringsKt.o0((String) listIterator2.previous(), '#').equals((String) pair.a)) {
                        i2 = listIterator2.nextIndex();
                        break;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (i2 == -1) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    intValue = valueOf2.intValue();
                } else {
                    String str = (String) CollectionsKt.Q(list2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(':');
                    Integer num = StringsKt.Y(str, sb.toString()).equals((String) pair.a) ? 0 : null;
                    if (num != null) {
                        intValue = num.intValue();
                    }
                }
            }
            return new pm9(this.a, arrayList, list2.subList(0, intValue + 1), this.d);
        }
        return this;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.d(k5r.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return c();
    }

    public pm9(List list, int i, List list2, long j) {
        this(j, list, (i & 4) != 0 ? t75.c(String.valueOf(j)) : list2, false);
    }
}
