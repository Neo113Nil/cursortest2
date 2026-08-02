package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.u;
import defpackage.awf;
import defpackage.dlt;
import defpackage.e7o;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class w extends c<String> implements awf, RandomAccess {
    public final ArrayList b;

    static {
        new w(10).a = false;
    }

    public w(int i) {
        this(new ArrayList(i));
    }

    @Override // defpackage.awf
    public final void J(g gVar) {
        a();
        this.b.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof awf) {
            collection = ((awf) collection).e();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.u.a
    public final u.a b(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            e7o.e();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new w(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.awf
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
        if (!(obj instanceof g)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, u.a);
            if (c1.a.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        g gVar = (g) obj;
        Charset charset = u.a;
        if (gVar.size() == 0) {
            str = "";
        } else {
            g.e eVar = (g.e) gVar;
            str = new String(eVar.d, eVar.o(), eVar.size(), charset);
        }
        g.e eVar2 = (g.e) gVar;
        int o = eVar2.o();
        if (c1.a.c(eVar2.d, o, eVar2.size() + o) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.awf
    public final awf j() {
        return this.a ? new dlt(this) : this;
    }

    @Override // defpackage.awf
    public final Object k(int i) {
        return this.b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.u.a
    public final boolean p() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof g)) {
            return new String((byte[]) remove, u.a);
        }
        g gVar = (g) remove;
        Charset charset = u.a;
        if (gVar.size() == 0) {
            return "";
        }
        g.e eVar = (g.e) gVar;
        return new String(eVar.d, eVar.o(), eVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g)) {
            return new String((byte[]) obj2, u.a);
        }
        g gVar = (g) obj2;
        Charset charset = u.a;
        if (gVar.size() == 0) {
            return "";
        }
        g.e eVar = (g.e) gVar;
        return new String(eVar.d, eVar.o(), eVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public w(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
