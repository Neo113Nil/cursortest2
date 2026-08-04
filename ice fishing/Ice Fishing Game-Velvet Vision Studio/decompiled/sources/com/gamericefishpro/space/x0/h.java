package com.gamericefishpro.space.x0;

import com.gamericefishpro.space.f1.r;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.ph.v;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {
    public static final h i = new h(new Object[0]);
    public final Object[] e;

    public h(Object[] objArr) {
        this.e = objArr;
        int length = objArr.length;
    }

    @Override // java.util.List, com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b add(int i2, Object obj) {
        Object[] objArr = this.e;
        com.gamericefishpro.space.b9.a.i(i2, objArr.length);
        if (i2 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            u.g(0, i2, 6, objArr, objArr2);
            u.d(i2 + 1, i2, objArr.length, objArr, objArr2);
            objArr2[i2] = obj;
            return new h(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        u.d(i2 + 1, i2, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i2] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new d(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // com.gamericefishpro.space.x0.b, java.util.Collection, java.util.List, com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b addAll(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length > 32) {
            e eVarBuilder = builder();
            eVarBuilder.addAll(collection);
            return eVarBuilder.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new h(objArrCopyOf);
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.e.length;
    }

    @Override // com.gamericefishpro.space.w0.b
    public final e builder() {
        return new e(this, null, this.e, 0);
    }

    @Override // com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b e(r rVar) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            if (((Boolean) rVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    z = true;
                    length = i2;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? i : new h(u.h(objArrCopyOf, 0, length));
    }

    @Override // com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b g(int i2) {
        Object[] objArr = this.e;
        com.gamericefishpro.space.b9.a.h(i2, objArr.length);
        if (objArr.length == 1) {
            return i;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        u.d(i2, i2 + 1, objArr.length, objArr, objArrCopyOf);
        return new h(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        com.gamericefishpro.space.b9.a.h(i2, b());
        return this.e[i2];
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final int indexOf(Object obj) {
        return v.u(this.e, obj);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i2 >= 0) {
                        length = i2;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
        }
        return -1;
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final ListIterator listIterator(int i2) {
        Object[] objArr = this.e;
        com.gamericefishpro.space.b9.a.i(i2, objArr.length);
        return new c(objArr, i2, objArr.length);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final com.gamericefishpro.space.w0.b set(int i2, Object obj) {
        com.gamericefishpro.space.b9.a.h(i2, b());
        Object[] objArr = this.e;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = obj;
        return new h(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, com.gamericefishpro.space.w0.b
    public final com.gamericefishpro.space.w0.b add(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[objArr.length] = obj;
            return new h(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new d(objArr, objArr2, objArr.length + 1, 0);
    }
}
