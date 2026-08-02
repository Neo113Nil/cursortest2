package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class fb9 extends a {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ fb9(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof k79) {
                    return super.contains((k79) obj);
                }
                return false;
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // defpackage.w5
    public final int f() {
        switch (this.b) {
            case 0:
                hb9 hb9Var = (hb9) this.c;
                return hb9Var.u().size() + (hb9Var.t ? 4 : 0);
            case 1:
                return ((jch) this.c).a.groupCount() + 1;
            default:
                return ((List) this.c).size();
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.b) {
            case 0:
                hb9 hb9Var = (hb9) this.c;
                return !hb9Var.t ? (k79) hb9Var.u().get(i) : (k79) hb9Var.u().get(hb9Var.C(i));
            case 1:
                String group = ((jch) this.c).a.group(i);
                return group == null ? "" : group;
            default:
                List list = (List) this.c;
                if (i >= 0 && i <= size() - 1) {
                    return list.get((size() - 1) - i);
                }
                StringBuilder q = k5r.q(i, "Element index ", " must be in range [");
                q.append(new IntRange(0, size() - 1, 1));
                q.append("].");
                throw new IndexOutOfBoundsException(q.toString());
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof k79) {
                    return super.indexOf((k79) obj);
                }
                return -1;
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.b) {
            case 2:
                return new jdo(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof k79) {
                    return super.lastIndexOf((k79) obj);
                }
                return -1;
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator() {
        switch (this.b) {
            case 2:
                return new jdo(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.b) {
            case 2:
                return new jdo(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
