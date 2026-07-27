package com.anythink.core.common.n.c;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o extends AbstractList<f> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    final f[] f16054a;

    /* renamed from: b, reason: collision with root package name */
    final int[] f16055b;

    private o(f[] fVarArr, int[] iArr) {
        this.f16054a = fVarArr;
        this.f16055b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o a(f... fVarArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(fVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList2.set(Collections.binarySearch(arrayList, fVarArr[i4]), Integer.valueOf(i4));
        }
        if (((f) arrayList.get(0)).j() == 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            f fVar = (f) arrayList.get(i9);
            int i10 = i9 + 1;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                f fVar2 = (f) arrayList.get(i11);
                if (fVar2.c(fVar)) {
                    if (fVar2.j() == fVar.j()) {
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(fVar2)));
                    }
                    if (((Integer) arrayList2.get(i11)).intValue() > ((Integer) arrayList2.get(i9)).intValue()) {
                        arrayList.remove(i11);
                        arrayList2.remove(i11);
                    } else {
                        i11++;
                    }
                }
            }
            i9 = i10;
        }
        c cVar = new c();
        a(0L, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int a9 = a(cVar);
        int[] iArr = new int[a9];
        for (int i12 = 0; i12 < a9; i12++) {
            iArr[i12] = cVar.m();
        }
        if (cVar.g()) {
            return new o((f[]) fVarArr.clone(), iArr);
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f16054a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16054a.length;
    }

    private static void a(long j9, c cVar, int i, List<f> list, int i4, int i9, List<Integer> list2) {
        int i10;
        int i11;
        long j10;
        int i12;
        List<Integer> list3;
        long j11;
        int i13;
        List<f> list4 = list;
        List<Integer> list5 = list2;
        if (i4 < i9) {
            for (int i14 = i4; i14 < i9; i14++) {
                if (list4.get(i14).j() < i) {
                    throw new AssertionError();
                }
            }
            f fVar = list.get(i4);
            f fVar2 = list4.get(i9 - 1);
            if (i == fVar.j()) {
                int intValue = list5.get(i4).intValue();
                int i15 = i4 + 1;
                f fVar3 = list4.get(i15);
                i10 = i15;
                i11 = intValue;
                fVar = fVar3;
            } else {
                i10 = i4;
                i11 = -1;
            }
            long j12 = 2;
            if (fVar.b(i) != fVar2.b(i)) {
                int i16 = 1;
                for (int i17 = i10 + 1; i17 < i9; i17++) {
                    if (list4.get(i17 - 1).b(i) != list4.get(i17).b(i)) {
                        i16++;
                    }
                }
                long a9 = j9 + a(cVar) + 2 + (i16 * 2);
                cVar.i(i16);
                cVar.i(i11);
                for (int i18 = i10; i18 < i9; i18++) {
                    byte b9 = list4.get(i18).b(i);
                    if (i18 == i10 || b9 != list4.get(i18 - 1).b(i)) {
                        cVar.i(b9 & 255);
                    }
                }
                c cVar2 = new c();
                int i19 = i10;
                while (i19 < i9) {
                    byte b10 = list4.get(i19).b(i);
                    int i20 = i19 + 1;
                    int i21 = i20;
                    while (true) {
                        if (i21 >= i9) {
                            i21 = i9;
                            break;
                        } else if (b10 != list4.get(i21).b(i)) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                    if (i20 == i21 && i + 1 == list4.get(i19).j()) {
                        cVar.i(list5.get(i19).intValue());
                        list3 = list5;
                        j11 = a9;
                        i13 = i21;
                    } else {
                        cVar.i((int) ((a(cVar2) + a9) * (-1)));
                        list3 = list5;
                        j11 = a9;
                        i13 = i21;
                        a(j11, cVar2, i + 1, list, i19, i13, list3);
                        list4 = list;
                    }
                    a9 = j11;
                    i19 = i13;
                    list5 = list3;
                }
                cVar.a(cVar2, cVar2.f16005c);
                return;
            }
            int min = Math.min(fVar.j(), fVar2.j());
            int i22 = 0;
            int i23 = i;
            while (true) {
                if (i23 >= min) {
                    j10 = j12;
                    break;
                }
                j10 = j12;
                if (fVar.b(i23) != fVar2.b(i23)) {
                    break;
                }
                i22++;
                i23++;
                j12 = j10;
            }
            long a10 = j9 + a(cVar) + j10 + i22 + 1;
            cVar.i(-i22);
            cVar.i(i11);
            int i24 = i;
            while (true) {
                i12 = i + i22;
                if (i24 >= i12) {
                    break;
                }
                cVar.i(fVar.b(i24) & 255);
                i24++;
            }
            if (i10 + 1 == i9) {
                if (i12 == list4.get(i10).j()) {
                    cVar.i(list5.get(i10).intValue());
                    return;
                }
                throw new AssertionError();
            }
            c cVar3 = new c();
            cVar.i((int) ((a(cVar3) + a10) * (-1)));
            a(a10, cVar3, i12, list4, i10, i9, list5);
            cVar.a(cVar3, cVar3.f16005c);
            return;
        }
        throw new AssertionError();
    }

    private f a(int i) {
        return this.f16054a[i];
    }

    private static int a(c cVar) {
        return (int) (cVar.f16005c / 4);
    }
}
