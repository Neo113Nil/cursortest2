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
    final f[] f16683a;

    /* renamed from: b, reason: collision with root package name */
    final int[] f16684b;

    private o(f[] fVarArr, int[] iArr) {
        this.f16683a = fVarArr;
        this.f16684b = iArr;
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
        int i6 = 0;
        while (i6 < arrayList.size()) {
            f fVar = (f) arrayList.get(i6);
            int i9 = i6 + 1;
            int i10 = i9;
            while (i10 < arrayList.size()) {
                f fVar2 = (f) arrayList.get(i10);
                if (fVar2.c(fVar)) {
                    if (fVar2.j() == fVar.j()) {
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(fVar2)));
                    }
                    if (((Integer) arrayList2.get(i10)).intValue() > ((Integer) arrayList2.get(i6)).intValue()) {
                        arrayList.remove(i10);
                        arrayList2.remove(i10);
                    } else {
                        i10++;
                    }
                }
            }
            i6 = i9;
        }
        c cVar = new c();
        a(0L, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int a9 = a(cVar);
        int[] iArr = new int[a9];
        for (int i11 = 0; i11 < a9; i11++) {
            iArr[i11] = cVar.m();
        }
        if (cVar.g()) {
            return new o((f[]) fVarArr.clone(), iArr);
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f16683a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16683a.length;
    }

    private static void a(long j6, c cVar, int i, List<f> list, int i4, int i6, List<Integer> list2) {
        int i9;
        int i10;
        long j9;
        int i11;
        List<Integer> list3;
        long j10;
        int i12;
        List<f> list4 = list;
        List<Integer> list5 = list2;
        if (i4 < i6) {
            for (int i13 = i4; i13 < i6; i13++) {
                if (list4.get(i13).j() < i) {
                    throw new AssertionError();
                }
            }
            f fVar = list.get(i4);
            f fVar2 = list4.get(i6 - 1);
            if (i == fVar.j()) {
                int intValue = list5.get(i4).intValue();
                int i14 = i4 + 1;
                f fVar3 = list4.get(i14);
                i9 = i14;
                i10 = intValue;
                fVar = fVar3;
            } else {
                i9 = i4;
                i10 = -1;
            }
            long j11 = 2;
            if (fVar.b(i) != fVar2.b(i)) {
                int i15 = 1;
                for (int i16 = i9 + 1; i16 < i6; i16++) {
                    if (list4.get(i16 - 1).b(i) != list4.get(i16).b(i)) {
                        i15++;
                    }
                }
                long a9 = j6 + a(cVar) + 2 + (i15 * 2);
                cVar.i(i15);
                cVar.i(i10);
                for (int i17 = i9; i17 < i6; i17++) {
                    byte b9 = list4.get(i17).b(i);
                    if (i17 == i9 || b9 != list4.get(i17 - 1).b(i)) {
                        cVar.i(b9 & 255);
                    }
                }
                c cVar2 = new c();
                int i18 = i9;
                while (i18 < i6) {
                    byte b10 = list4.get(i18).b(i);
                    int i19 = i18 + 1;
                    int i20 = i19;
                    while (true) {
                        if (i20 >= i6) {
                            i20 = i6;
                            break;
                        } else if (b10 != list4.get(i20).b(i)) {
                            break;
                        } else {
                            i20++;
                        }
                    }
                    if (i19 == i20 && i + 1 == list4.get(i18).j()) {
                        cVar.i(list5.get(i18).intValue());
                        list3 = list5;
                        j10 = a9;
                        i12 = i20;
                    } else {
                        cVar.i((int) ((a(cVar2) + a9) * (-1)));
                        list3 = list5;
                        j10 = a9;
                        i12 = i20;
                        a(j10, cVar2, i + 1, list, i18, i12, list3);
                        list4 = list;
                    }
                    a9 = j10;
                    i18 = i12;
                    list5 = list3;
                }
                cVar.a(cVar2, cVar2.f16634c);
                return;
            }
            int min = Math.min(fVar.j(), fVar2.j());
            int i21 = 0;
            int i22 = i;
            while (true) {
                if (i22 >= min) {
                    j9 = j11;
                    break;
                }
                j9 = j11;
                if (fVar.b(i22) != fVar2.b(i22)) {
                    break;
                }
                i21++;
                i22++;
                j11 = j9;
            }
            long a10 = j6 + a(cVar) + j9 + i21 + 1;
            cVar.i(-i21);
            cVar.i(i10);
            int i23 = i;
            while (true) {
                i11 = i + i21;
                if (i23 >= i11) {
                    break;
                }
                cVar.i(fVar.b(i23) & 255);
                i23++;
            }
            if (i9 + 1 == i6) {
                if (i11 == list4.get(i9).j()) {
                    cVar.i(list5.get(i9).intValue());
                    return;
                }
                throw new AssertionError();
            }
            c cVar3 = new c();
            cVar.i((int) ((a(cVar3) + a10) * (-1)));
            a(a10, cVar3, i11, list4, i9, i6, list5);
            cVar.a(cVar3, cVar3.f16634c);
            return;
        }
        throw new AssertionError();
    }

    private f a(int i) {
        return this.f16683a[i];
    }

    private static int a(c cVar) {
        return (int) (cVar.f16634c / 4);
    }
}
