package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class vy40 implements List, zfx {
    public final /* synthetic */ int a;
    public final List b;
    public final int c;
    public int w;

    public /* synthetic */ vy40(int i, int i2, int i3, List list) {
        this.a = i3;
        this.b = list;
        this.c = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        int i3 = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.w++;
                break;
            default:
                list.add(i + i3, obj);
                this.w++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        int i3 = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                list.addAll(i + i3, collection);
                this.w = collection.size() + this.w;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.w += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.a;
        List list = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.w - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.w = i2;
                break;
            default:
                int i4 = this.w - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.w = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        List list = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.w;
                while (i2 < i3) {
                    if (jl40.l(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.w;
                while (i2 < i4) {
                    if (jl40.l(list.get(i2), obj)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        int i3 = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                np60.a(i, this);
                break;
            default:
                xz40.a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        List list = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.w;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (jl40.l(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.w;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (jl40.l(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (this.w == this.c) {
                }
                break;
            default:
                if (this.w == this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ry40(this, 0);
            default:
                return new vz40(this, 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.a;
        List list = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.w - 1;
                if (i2 <= i3) {
                    while (!jl40.l(list.get(i3), obj)) {
                        if (i3 == i2) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                    break;
                }
                break;
            default:
                int i4 = this.w - 1;
                if (i2 <= i4) {
                    while (!jl40.l(list.get(i4), obj)) {
                        if (i4 == i2) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    break;
                }
                break;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new ry40(this, 0);
            default:
                return new vz40(this, 0);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        int i2 = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                int i3 = this.w;
                while (i2 < i3) {
                    if (jl40.l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.w--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            default:
                int i4 = this.w;
                while (i2 < i4) {
                    if (jl40.l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.w--;
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                int i = this.w;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.w) {
                    break;
                }
                break;
            default:
                int i2 = this.w;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.w) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        int i2 = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                int i3 = this.w;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.w--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.w) {
                    break;
                }
                break;
            default:
                int i5 = this.w;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.w--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.w) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.a;
        int i3 = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                np60.a(i, this);
                break;
            default:
                xz40.a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                i = this.w;
                i2 = this.c;
                break;
            default:
                i = this.w;
                i2 = this.c;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                np60.b(i, i2, this);
                return new vy40(i, i2, 0, this);
            default:
                xz40.b(i, i2, this);
                return new vy40(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return vng.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
        }
        return vng.K(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new ry40(this, i);
            default:
                return new vz40(this, i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                int i2 = this.w;
                this.w = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.w;
                this.w = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                list.addAll(this.w, collection);
                this.w = collection.size() + this.w;
                if (collection.size() > 0) {
                    break;
                }
                break;
            default:
                list.addAll(this.w, collection);
                int size = collection.size();
                this.w += size;
                if (size > 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        int i3 = this.c;
        List list = this.b;
        switch (i2) {
            case 0:
                np60.a(i, this);
                this.w--;
                return list.remove(i + i3);
            default:
                xz40.a(i, this);
                this.w--;
                return list.remove(i + i3);
        }
    }
}
