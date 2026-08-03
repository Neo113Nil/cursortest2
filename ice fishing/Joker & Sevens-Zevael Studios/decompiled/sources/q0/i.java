package q0;

import bc.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final i f5720h = new i(new Object[0]);

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f5721g;

    public i(Object[] objArr) {
        this.f5721g = objArr;
    }

    @Override // bc.a
    public final int a() {
        return this.f5721g.length;
    }

    @Override // q0.c
    public final c b(int i10, Object obj) {
        Object[] objArr = this.f5721g;
        a.a.n(i10, objArr.length);
        if (i10 == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.T(objArr, objArr2, 0, i10, 6);
            l.R(objArr, objArr2, i10 + 1, i10, objArr.length);
            objArr2[i10] = obj;
            return new i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        pc.j.d(copyOf, "copyOf(...)");
        l.R(objArr, copyOf, i10 + 1, i10, objArr.length - 1);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // q0.c
    public final c d(Object obj) {
        Object[] objArr = this.f5721g;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        pc.j.d(copyOf, "copyOf(...)");
        copyOf[objArr.length] = obj;
        return new i(copyOf);
    }

    @Override // q0.c
    public final c e(Collection collection) {
        Object[] objArr = this.f5721g;
        if (collection.size() + objArr.length > 32) {
            f f10 = f();
            f10.addAll(collection);
            return f10.d();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        pc.j.d(copyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new i(copyOf);
    }

    @Override // q0.c
    public final f f() {
        return new f(this, null, this.f5721g, 0);
    }

    @Override // q0.c
    public final c g(b bVar) {
        Object[] objArr = this.f5721g;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    pc.j.d(objArr2, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f5720h : new i(l.U(objArr2, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a.a.l(i10, a());
        return this.f5721g[i10];
    }

    @Override // q0.c
    public final c h(int i10) {
        Object[] objArr = this.f5721g;
        a.a.l(i10, objArr.length);
        if (objArr.length == 1) {
            return f5720h;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        pc.j.d(copyOf, "copyOf(...)");
        l.R(objArr, copyOf, i10, i10 + 1, objArr.length);
        return new i(copyOf);
    }

    @Override // q0.c
    public final c i(int i10, Object obj) {
        Object[] objArr = this.f5721g;
        a.a.l(i10, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        pc.j.d(copyOf, "copyOf(...)");
        copyOf[i10] = obj;
        return new i(copyOf);
    }

    @Override // bc.e, java.util.List
    public final int indexOf(Object obj) {
        return l.Z(this.f5721g, obj);
    }

    @Override // bc.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f5721g;
        pc.j.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // bc.e, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f5721g;
        a.a.n(i10, objArr.length);
        return new d(objArr, i10, objArr.length);
    }
}
