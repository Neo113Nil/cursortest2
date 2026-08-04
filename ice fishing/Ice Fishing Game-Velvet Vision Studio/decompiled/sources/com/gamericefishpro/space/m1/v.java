package com.gamericefishpro.space.m1;

import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.i9.a4;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparator {
    public static final v a = new v();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        u uVar = (u) obj;
        u uVar2 = (u) obj2;
        int i = 0;
        if (a4.E(uVar) && a4.E(uVar2)) {
            f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
            f0 f0VarS2 = com.gamericefishpro.space.h2.k.s(uVar2);
            if (!Intrinsics.a(f0VarS, f0VarS2)) {
                Object[] objArr = new f0[16];
                int i2 = 0;
                while (f0VarS != null) {
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i2 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i2 + 0);
                    }
                    objArr[0] = f0VarS;
                    i2++;
                    f0VarS = f0VarS.v();
                }
                Object[] objArr3 = new f0[16];
                int i4 = 0;
                while (f0VarS2 != null) {
                    int i5 = i4 + 1;
                    if (objArr3.length < i5) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i4 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i4 + 0);
                    }
                    objArr3[0] = f0VarS2;
                    i4++;
                    f0VarS2 = f0VarS2.v();
                }
                int iMin = Math.min(i2 - 1, i4 - 1);
                if (iMin >= 0) {
                    while (Intrinsics.a(objArr[i], objArr3[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return Intrinsics.d(((f0) objArr[i]).w(), ((f0) objArr3[i]).w());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (a4.E(uVar)) {
                return -1;
            }
            if (a4.E(uVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
