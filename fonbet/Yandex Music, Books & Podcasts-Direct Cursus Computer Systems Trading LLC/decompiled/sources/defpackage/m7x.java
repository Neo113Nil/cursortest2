package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class m7x extends n7x implements Serializable {
    public static final m7x b = new m7x(0);
    public static final m7x c = new m7x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ m7x(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                o7x o7xVar = (o7x) obj;
                o7x o7xVar2 = (o7x) obj2;
                return n5x.a.b(o7xVar.a, o7xVar2.a).b(o7xVar.b, o7xVar2.b).a();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
