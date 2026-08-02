package defpackage;

import androidx.camera.core.impl.StreamUseCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ymw0 {
    public final ArrayList a;

    public ymw0(anw0... anw0VarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Collections.addAll(arrayList, anw0VarArr);
    }

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(anw0 anw0Var) {
        this.a.add(anw0Var);
    }

    public final List c(List list) {
        StreamUseCase streamUseCase;
        StreamUseCase streamUseCase2;
        StreamUseCase streamUseCase3;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        b(arrayList2, size2, new int[size2], 0);
        anw0[] anw0VarArr = new anw0[list.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            boolean z = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    anw0 anw0Var = (anw0) arrayList.get(i);
                    anw0 anw0Var2 = (anw0) list.get(iArr[i]);
                    anw0Var.getClass();
                    z &= anw0Var2.b.getId() <= anw0Var.b.getId() && anw0Var2.a == anw0Var.a && ((streamUseCase = anw0Var.c) == (streamUseCase2 = StreamUseCase.DEFAULT) || (streamUseCase3 = anw0Var2.c) == streamUseCase2 || streamUseCase3 == streamUseCase);
                    if (!z) {
                        break;
                    }
                    anw0VarArr[iArr[i]] = (anw0) arrayList.get(i);
                }
            }
            if (z) {
                return Arrays.asList(anw0VarArr);
            }
        }
        return null;
    }

    public ymw0() {
        this.a = new ArrayList();
    }
}
