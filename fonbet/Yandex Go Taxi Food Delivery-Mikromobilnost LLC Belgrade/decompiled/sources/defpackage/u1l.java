package defpackage;

import com.yandex.div.core.view2.divs.pager.a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class u1l extends k8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u1l(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof cxk) {
                    return super.contains((cxk) obj);
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

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                a aVar = (a) obj;
                return !aVar.J ? (cxk) aVar.g().get(i) : (cxk) aVar.g().get(aVar.p(i));
            case 1:
                String group = ((w610) obj).a.group(i);
                return group == null ? "" : group;
            default:
                return ((List) obj).get(zcc.B(i, this));
        }
    }

    @Override // defpackage.z6
    public final int getSize() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                return aVar.g().size() + (aVar.J ? 4 : 0);
            case 1:
                return ((w610) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.k8, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof cxk) {
                    return super.indexOf((cxk) obj);
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

    @Override // defpackage.k8, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.a) {
            case 2:
                return new t2k0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.k8, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof cxk) {
                    return super.lastIndexOf((cxk) obj);
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

    @Override // defpackage.k8, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 2:
                return new t2k0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // defpackage.k8, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 2:
                return new t2k0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
