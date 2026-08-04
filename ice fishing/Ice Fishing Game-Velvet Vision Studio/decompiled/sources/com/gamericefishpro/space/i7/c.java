package com.gamericefishpro.space.i7;

import android.content.res.TypedArray;
import android.util.SparseArray;
import com.gamericefishpro.space.na.p;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public int a;
    public int b;
    public final Object c;
    public Object d;

    public c() {
        this.c = v.w(b.values());
        a[][] aVarArr = new a[7][];
        for (int i = 0; i < 7; i++) {
            a[] aVarArr2 = new a[7];
            for (int i2 = 0; i2 < 7; i2++) {
                aVarArr2[i2] = null;
            }
            aVarArr[i] = aVarArr2;
        }
        this.d = aVarArr;
        this.b = 1;
    }

    public LinkedHashSet a() {
        b bVar;
        b bVar2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                a[] aVarArr = ((a[][]) this.d)[i];
                a aVar = aVarArr[i2];
                if (aVar != null && (bVar2 = aVar.c) != null) {
                    a aVar2 = aVarArr[i2 + 1];
                    if ((aVar2 != null ? aVar2.c : null) == bVar2) {
                        a aVar3 = aVarArr[i2 + 2];
                        if ((aVar3 != null ? aVar3.c : null) == bVar2) {
                            for (int i3 = i2; i3 < 7; i3++) {
                                a aVar4 = ((a[][]) this.d)[i][i3];
                                if ((aVar4 != null ? aVar4.c : null) != bVar2) {
                                    break;
                                }
                                linkedHashSet.add(new Pair(Integer.valueOf(i), Integer.valueOf(i3)));
                            }
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < 7; i4++) {
            for (int i5 = 0; i5 < 5; i5++) {
                a[][] aVarArr2 = (a[][]) this.d;
                a aVar5 = aVarArr2[i5][i4];
                if (aVar5 != null && (bVar = aVar5.c) != null) {
                    a aVar6 = aVarArr2[i5 + 1][i4];
                    if ((aVar6 != null ? aVar6.c : null) == bVar) {
                        a aVar7 = aVarArr2[i5 + 2][i4];
                        if ((aVar7 != null ? aVar7.c : null) == bVar) {
                            for (int i6 = i5; i6 < 7; i6++) {
                                a aVar8 = ((a[][]) this.d)[i6][i4];
                                if ((aVar8 != null ? aVar8.c : null) != bVar) {
                                    break;
                                }
                                linkedHashSet.add(new Pair(Integer.valueOf(i6), Integer.valueOf(i4)));
                            }
                        }
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public boolean b() {
        for (int i = 0; i < 7; i++) {
            int i2 = 0;
            while (i2 < 7) {
                int i3 = i2 + 1;
                if (i3 < 7) {
                    g(i, i2, i, i3);
                    boolean zIsEmpty = a().isEmpty();
                    g(i, i2, i, i3);
                    if (!zIsEmpty) {
                        return true;
                    }
                }
                int i4 = i + 1;
                if (i4 < 7) {
                    g(i, i2, i4, i2);
                    boolean zIsEmpty2 = a().isEmpty();
                    g(i, i2, i4, i2);
                    if (!zIsEmpty2) {
                        return true;
                    }
                }
                i2 = i3;
            }
        }
        return false;
    }

    public void c() {
        boolean z;
        do {
            a[][] aVarArr = new a[7][];
            for (int i = 0; i < 7; i++) {
                a[] aVarArr2 = new a[7];
                for (int i2 = 0; i2 < 7; i2++) {
                    aVarArr2[i2] = new a(i, i2, f());
                }
                aVarArr[i] = aVarArr2;
            }
            this.d = aVarArr;
            for (boolean z2 = true; z2; z2 = z) {
                LinkedHashSet<Pair> linkedHashSetA = a();
                if (linkedHashSetA.isEmpty()) {
                    break;
                }
                z = false;
                for (Pair pair : linkedHashSetA) {
                    int iIntValue = ((Number) pair.d).intValue();
                    int iIntValue2 = ((Number) pair.e).intValue();
                    ((a[][]) this.d)[iIntValue][iIntValue2] = new a(iIntValue, iIntValue2, f());
                    z = true;
                }
            }
        } while (!b());
    }

    public void d() {
        for (int i = 0; i < 7; i++) {
            int i2 = 6;
            for (int i3 = 6; -1 < i3; i3--) {
                a[][] aVarArr = (a[][]) this.d;
                a aVar = aVarArr[i3][i];
                if (aVar != null) {
                    if (i2 != i3) {
                        aVarArr[i2][i] = a.a(aVar, i2, i);
                        ((a[][]) this.d)[i3][i] = null;
                    }
                    i2--;
                }
            }
            while (-1 < i2) {
                ((a[][]) this.d)[i2][i] = new a(i2, i, f());
                i2--;
            }
        }
    }

    public g0 e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return g0.d;
        }
        this.a = (linkedHashSet.size() * 10 * this.b) + this.a;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int iIntValue = ((Number) pair.d).intValue();
            ((a[][]) this.d)[iIntValue][((Number) pair.e).intValue()] = null;
        }
        return g0.d;
    }

    public b f() {
        List list = (List) this.c;
        com.gamericefishpro.space.hi.c random = com.gamericefishpro.space.hi.d.d;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        int size = list.size();
        random.getClass();
        int iB = com.gamericefishpro.space.hi.d.e.b(size);
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (b) list.get(iB);
    }

    public void g(int i, int i2, int i3, int i4) {
        a[][] aVarArr = (a[][]) this.d;
        a[] aVarArr2 = aVarArr[i];
        a aVar = aVarArr2[i2];
        a aVar2 = aVarArr[i3][i4];
        aVarArr2[i2] = aVar2 != null ? a.a(aVar2, i, i2) : null;
        ((a[][]) this.d)[i3][i4] = aVar != null ? a.a(aVar, i3, i4) : null;
    }

    public c(p pVar, com.gamericefishpro.space.a8.c cVar) {
        this.c = new SparseArray();
        this.d = pVar;
        TypedArray typedArray = (TypedArray) cVar.i;
        this.a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(53, 0);
    }
}
