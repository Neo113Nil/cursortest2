package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class tlk implements ulk {
    public final int a;
    public final ulk[] b;
    public final int c;

    public tlk(int i, ulk[] ulkVarArr, int i2) {
        this.a = i;
        this.b = ulkVarArr;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tlk c(slk slkVar, int i, ulk ulkVar, int i2, int i3) {
        int i4 = (i >>> i3) & 31;
        int i5 = 1 << i4;
        int i6 = (i2 >>> i3) & 31;
        int i7 = 1 << i6;
        slk slkVar2 = ulkVar;
        if (i5 == i7) {
            tlk c = c(slkVar, i, ulkVar, i2, i3 + 5);
            return new tlk(i5, new ulk[]{c}, c.c);
        }
        if (i4 > i6) {
            slkVar2 = slkVar;
            slkVar = ulkVar;
        }
        return new tlk(i5 | i7, new ulk[]{slkVar, slkVar2}, slkVar2.size() + slkVar.size());
    }

    @Override // defpackage.ulk
    public final ulk a(int i, Object obj, Object obj2, int i2) {
        int i3 = 1 << ((i >>> i2) & 31);
        int i4 = this.a;
        int bitCount = Integer.bitCount((i3 - 1) & i4);
        int i5 = i4 & i3;
        int i6 = this.c;
        ulk[] ulkVarArr = this.b;
        if (i5 != 0) {
            ulk[] ulkVarArr2 = (ulk[]) Arrays.copyOf(ulkVarArr, ulkVarArr.length);
            ulk a = ulkVarArr[bitCount].a(i, obj, obj2, i2 + 5);
            ulkVarArr2[bitCount] = a;
            return new tlk(i4, ulkVarArr2, (a.size() + i6) - ulkVarArr[bitCount].size());
        }
        int i7 = i4 | i3;
        ulk[] ulkVarArr3 = new ulk[ulkVarArr.length + 1];
        System.arraycopy(ulkVarArr, 0, ulkVarArr3, 0, bitCount);
        ulkVarArr3[bitCount] = new slk(1, obj, obj2);
        System.arraycopy(ulkVarArr, bitCount, ulkVarArr3, bitCount + 1, ulkVarArr.length - bitCount);
        return new tlk(i7, ulkVarArr3, i6 + 1);
    }

    @Override // defpackage.ulk
    public final Object b(int i, int i2, Object obj) {
        int i3 = 1 << ((i >>> i2) & 31);
        int i4 = this.a;
        if ((i4 & i3) == 0) {
            return null;
        }
        return this.b[Integer.bitCount((i3 - 1) & i4)].b(i, i2 + 5, obj);
    }

    @Override // defpackage.ulk
    public final int size() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append("bitmap=" + Integer.toBinaryString(this.a) + StringUtil.SPACE);
        for (ulk ulkVar : this.b) {
            sb.append(ulkVar);
            sb.append(StringUtil.SPACE);
        }
        sb.append(")");
        return sb.toString();
    }
}
