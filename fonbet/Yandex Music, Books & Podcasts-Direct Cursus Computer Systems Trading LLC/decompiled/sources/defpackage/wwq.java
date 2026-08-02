package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class wwq implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((xwq) obj).a - ((xwq) obj2).a;
            case 1:
                return Float.compare(((xwq) obj).c, ((xwq) obj2).c);
            case 2:
                h4r h4rVar = (h4r) obj;
                h4r h4rVar2 = (h4r) obj2;
                int compare = Integer.compare(h4rVar2.b, h4rVar.b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = h4rVar.c.compareTo(h4rVar2.c);
                return compareTo != 0 ? compareTo : h4rVar.d.compareTo(h4rVar2.d);
            case 3:
                h4r h4rVar3 = (h4r) obj;
                h4r h4rVar4 = (h4r) obj2;
                int compare2 = Integer.compare(h4rVar4.a, h4rVar3.a);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo2 = h4rVar4.c.compareTo(h4rVar3.c);
                return compareTo2 != 0 ? compareTo2 : h4rVar4.d.compareTo(h4rVar3.d);
            case 4:
                lyd lydVar = (lyd) obj;
                lyd lydVar2 = (lyd) obj2;
                lydVar.getClass();
                lydVar2.getClass();
                return lydVar.a.compareTo(lydVar2.a);
            case 5:
                return Integer.compare(((vgv) obj).a.b, ((vgv) obj2).a.b);
            default:
                return Long.compare(((ugv) obj).b, ((ugv) obj2).b);
        }
    }
}
