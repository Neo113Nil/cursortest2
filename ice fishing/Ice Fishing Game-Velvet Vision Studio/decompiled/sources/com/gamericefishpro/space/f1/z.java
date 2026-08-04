package com.gamericefishpro.space.f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.n.q0;
import com.gamericefishpro.space.n.w1;
import com.gamericefishpro.space.t.m0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public int a;
    public Object b;
    public Object c;

    public z(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public void a(int i, com.gamericefishpro.space.h0.s sVar) {
        if (i < 0) {
            com.gamericefishpro.space.c0.a.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        com.gamericefishpro.space.h0.j jVar = new com.gamericefishpro.space.h0.j(this.a, i, sVar);
        this.a += i;
        ((com.gamericefishpro.space.v0.e) this.b).b(jVar);
    }

    public void b() {
        w1 w1Var;
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            q0.a(drawable);
        }
        if (drawable == null || (w1Var = (w1) this.c) == null) {
            return;
        }
        com.gamericefishpro.space.n.q.d(drawable, w1Var, imageView.getDrawableState());
    }

    public com.gamericefishpro.space.ua.m c() {
        com.gamericefishpro.space.ua.e eVar = (com.gamericefishpro.space.ua.e) this.c;
        if (eVar != null) {
            throw eVar.a();
        }
        com.gamericefishpro.space.ua.m mVarA = com.gamericefishpro.space.ua.m.a(this.a, (Object[]) this.b, this);
        com.gamericefishpro.space.ua.e eVar2 = (com.gamericefishpro.space.ua.e) this.c;
        if (eVar2 == null) {
            return mVarA;
        }
        throw eVar2.a();
    }

    public com.gamericefishpro.space.h0.j d(int i) {
        if (i < 0 || i >= this.a) {
            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Index ", ", size ");
            sbK.append(this.a);
            com.gamericefishpro.space.c0.a.d(sbK.toString());
        }
        com.gamericefishpro.space.h0.j jVar = (com.gamericefishpro.space.h0.j) this.c;
        if (jVar != null) {
            int i2 = jVar.a;
            if (i < jVar.b + i2 && i2 <= i) {
                return jVar;
            }
        }
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.b;
        com.gamericefishpro.space.h0.j jVar2 = (com.gamericefishpro.space.h0.j) eVar.d[com.gamericefishpro.space.h0.n.e(i, eVar)];
        this.c = jVar2;
        return jVar2;
    }

    public int e(Object obj) {
        com.gamericefishpro.space.t.c0 c0Var = (com.gamericefishpro.space.t.c0) this.b;
        int iD = c0Var.d(obj);
        if (iD >= 0) {
            return c0Var.c[iD];
        }
        return -1;
    }

    public void f(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.b;
        int i8 = this.a;
        int i9 = i8 + 3;
        this.a = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.b = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.c, iMax);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
            this.c = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (j & com.gamericefishpro.space.p2.a.a) | (((long) Math.min((i8 - i11) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = com.gamericefishpro.space.j.a.e;
        com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) cVarT.i;
        l0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) cVarT.i, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.gamericefishpro.space.u6.f.x(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                q0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(cVarT.k(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(q0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            cVarT.u();
        }
    }

    public void i(Object obj, Object obj2) {
        int i = (this.a + 1) * 2;
        Object[] objArr = (Object[]) this.b;
        if (i > objArr.length) {
            this.b = Arrays.copyOf(objArr, com.gamericefishpro.space.d9.h.u(objArr.length, i));
        }
        com.gamericefishpro.space.a.a.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.b;
        int i2 = this.a;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.a = i2 + 1;
    }

    public void j(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.a) * 2;
            Object[] objArr = (Object[]) this.b;
            if (size > objArr.length) {
                this.b = Arrays.copyOf(objArr, com.gamericefishpro.space.d9.h.u(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i(entry.getKey(), entry.getValue());
        }
    }

    public void k(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i3 = this.a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = z ? 1L : 0L;
                jArr[i5] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j2);
                return;
            }
        }
    }

    public void l(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.b;
        long[] jArr2 = (long[]) this.c;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.a : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (com.gamericefishpro.space.p2.a.b & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void m(int i, com.gamericefishpro.space.di.d dVar) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i3 = this.a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                dVar.c(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    public z(IntRange intRange, com.gamericefishpro.space.h0.n nVar) {
        Object hVar;
        z zVarK = nVar.k();
        int i = intRange.d;
        if (i < 0) {
            com.gamericefishpro.space.c0.a.c("negative nearestRange.first");
        }
        int iMin = Math.min(intRange.e, zVarK.a - 1);
        if (iMin < i) {
            com.gamericefishpro.space.t.c0 c0Var = m0.a;
            Intrinsics.c(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.b = c0Var;
            this.c = new Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.c = new Object[i2];
        this.a = i;
        com.gamericefishpro.space.t.c0 c0Var2 = new com.gamericefishpro.space.t.c0(i2);
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) zVarK.b;
        if (i < 0 || i >= zVarK.a) {
            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Index ", ", size ");
            sbK.append(zVarK.a);
            com.gamericefishpro.space.c0.a.d(sbK.toString());
        }
        if (iMin < 0 || iMin >= zVarK.a) {
            StringBuilder sbK2 = com.gamericefishpro.space.m5.a.k(iMin, "Index ", ", size ");
            sbK2.append(zVarK.a);
            com.gamericefishpro.space.c0.a.d(sbK2.toString());
        }
        if (iMin < i) {
            com.gamericefishpro.space.c0.a.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iE = com.gamericefishpro.space.h0.n.e(i, eVar);
        int i3 = ((com.gamericefishpro.space.h0.j) eVar.d[iE]).a;
        while (i3 <= iMin) {
            com.gamericefishpro.space.h0.j jVar = (com.gamericefishpro.space.h0.j) eVar.d[iE];
            Function1 key = jVar.c.getKey();
            int i4 = jVar.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (jVar.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        hVar = key.invoke(Integer.valueOf(iMax - i4));
                        hVar = hVar == null ? new com.gamericefishpro.space.h0.h(iMax) : hVar;
                    }
                    c0Var2.g(iMax, hVar);
                    ((Object[]) this.c)[iMax - this.a] = hVar;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            Unit unit = Unit.a;
            i3 += jVar.b;
            iE++;
        }
        this.b = c0Var2;
    }

    public z() {
        this.b = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h0.j[16]);
    }

    public z(int i) {
        this.b = new Object[i * 2];
        this.a = 0;
    }
}
