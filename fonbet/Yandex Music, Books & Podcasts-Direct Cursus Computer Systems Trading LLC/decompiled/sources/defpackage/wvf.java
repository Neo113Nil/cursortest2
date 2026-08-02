package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class wvf extends t8 implements yvf, RandomAccess {
    public final ArrayList b;

    static {
        new wvf(10).a = false;
    }

    public wvf(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.yvf
    public final void C(jn3 jn3Var) {
        a();
        this.b.add(jn3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.t8, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof yvf) {
            collection = ((yvf) collection).e();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.qse
    public final qse b(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            e7o.e();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new wvf(arrayList2);
    }

    @Override // defpackage.t8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.yvf
    public final List e() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof mn3)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, tse.a);
            if (mut.a.W(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        mn3 mn3Var = (mn3) obj;
        Charset charset = tse.a;
        if (mn3Var.size() == 0) {
            str = "";
        } else {
            jn3 jn3Var = (jn3) mn3Var;
            str = new String(jn3Var.d, jn3Var.s(), jn3Var.size(), charset);
        }
        jn3 jn3Var2 = (jn3) mn3Var;
        int s = jn3Var2.s();
        if (mut.a.W(jn3Var2.d, s, jn3Var2.size() + s)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.yvf
    public final yvf j() {
        return this.a ? new clt(this) : this;
    }

    @Override // defpackage.yvf
    public final Object k(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof mn3)) {
            return new String((byte[]) remove, tse.a);
        }
        mn3 mn3Var = (mn3) remove;
        Charset charset = tse.a;
        if (mn3Var.size() == 0) {
            return "";
        }
        jn3 jn3Var = (jn3) mn3Var;
        return new String(jn3Var.d, jn3Var.s(), jn3Var.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof mn3)) {
            return new String((byte[]) obj2, tse.a);
        }
        mn3 mn3Var = (mn3) obj2;
        Charset charset = tse.a;
        if (mn3Var.size() == 0) {
            return "";
        }
        jn3 jn3Var = (jn3) mn3Var;
        return new String(jn3Var.d, jn3Var.s(), jn3Var.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public wvf(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.t8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
