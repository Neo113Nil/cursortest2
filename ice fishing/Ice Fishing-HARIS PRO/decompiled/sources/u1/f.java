package u1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends h0.f {
    public static void E(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        D1.i.e(iArr, "<this>");
        D1.i.e(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void F(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        D1.i.e(objArr, "<this>");
        D1.i.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void G(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        F(objArr, objArr2, 0, i, i2);
    }

    public static List H(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new d(objArr, false)) : h0.f.s(objArr[0]) : o.f4473a;
    }

    public static ArrayList I(int[] iArr) {
        D1.i.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
