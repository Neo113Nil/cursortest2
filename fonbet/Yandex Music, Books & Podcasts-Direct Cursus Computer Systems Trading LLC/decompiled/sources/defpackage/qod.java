package defpackage;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class qod extends AbstractList {
    public static final AtomicInteger e = new AtomicInteger();
    public Handler a;
    public final ArrayList c;
    public final String b = String.valueOf(e.incrementAndGet());
    public final ArrayList d = new ArrayList();

    public qod(ood... oodVarArr) {
        List asList = Arrays.asList(oodVarArr);
        asList.getClass();
        this.c = new ArrayList(asList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ood oodVar = (ood) obj;
        oodVar.getClass();
        return this.c.add(oodVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof ood : true) {
            return super.contains((ood) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (ood) this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof ood : true) {
            return super.indexOf((ood) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof ood : true) {
            return super.lastIndexOf((ood) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof ood : true) {
            return super.remove((ood) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ood oodVar = (ood) obj;
        oodVar.getClass();
        return (ood) this.c.set(i, oodVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ood oodVar = (ood) obj;
        oodVar.getClass();
        this.c.add(i, oodVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (ood) this.c.remove(i);
    }

    public qod(Collection collection) {
        this.c = new ArrayList(collection);
    }
}
