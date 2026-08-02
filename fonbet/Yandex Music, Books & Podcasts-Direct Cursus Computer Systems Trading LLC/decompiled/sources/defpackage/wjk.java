package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wjk {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final soi e;
    public final jyr f;

    public wjk(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            llm.a("Invalid start index");
        }
        this.d = new ArrayList();
        soi soiVar = new soi();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            vaf vafVar = (vaf) this.a.get(i3);
            int i4 = vafVar.c;
            int i5 = vafVar.d;
            soiVar.h(i4, new oqd(i3, i2, i5));
            i2 += i5;
        }
        this.e = soiVar;
        this.f = btf.b(new kgk(1, this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        soi soiVar = this.e;
        oqd oqdVar = (oqd) soiVar.b(i);
        if (oqdVar == null) {
            return false;
        }
        int i4 = oqdVar.b;
        int i5 = i2 - oqdVar.c;
        oqdVar.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = soiVar.c;
        long[] jArr = soiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        oqd oqdVar2 = (oqd) objArr[(i6 << 3) + i8];
                        if (oqdVar2.b >= i4 && !oqdVar2.equals(oqdVar) && (i3 = oqdVar2.b + i5) >= 0) {
                            oqdVar2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
