package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class qvt {
    static {
        Logger.getLogger(qvt.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            vtd vtdVar = (vtd) it.next();
            int i2 = i + 1;
            bArr[i] = vtdVar.a.t();
            i += 2;
            bArr[i2] = vtdVar.b.t();
        }
        byte[] bArr2 = q9t.b;
        int i3 = 0;
        while (i3 < size) {
            byte[] bArr3 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr4 = bArr[i4];
            if (q9t.a(bArr3, bArr2)) {
                for (byte b : bArr4) {
                    if (b == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList2.add(bArr[i5]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (q9t.a(bArr5, bArr2)) {
                                int i6 = 0;
                                for (int i7 = 0; i7 <= bArr6.length; i7++) {
                                    if (i7 == bArr6.length || bArr6[i7] == 44) {
                                        byte[] a = ar2.c.a(new String(bArr6, i6, i7 - i6, pe4.a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(a);
                                        i6 = i7 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i4] = ar2.c.a(new String(bArr4, pe4.a));
            }
            i3 += 2;
        }
        return bArr;
    }
}
