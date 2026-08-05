package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class uc {
    public final int[] MdtA4re8;
    public final int[] NCTxEWno;
    public final int P7K7Inc8;
    public final int VgvYg0wo;
    public final boolean b2ZJblxo;
    public final ArrayList qoPGr6Ce;
    public final tg0 wxUZMvaN;

    public uc(tg0 tg0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        tc tcVar;
        int i2;
        this.qoPGr6Ce = arrayList;
        this.NCTxEWno = iArr;
        this.MdtA4re8 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.wxUZMvaN = tg0Var;
        c1 c1Var = (c1) tg0Var.MdtA4re8;
        int size = c1Var.NCTxEWno.size();
        this.VgvYg0wo = size;
        int size2 = c1Var.MdtA4re8.size();
        this.P7K7Inc8 = size2;
        this.b2ZJblxo = true;
        tc tcVar2 = arrayList.isEmpty() ? null : (tc) arrayList.get(0);
        if (tcVar2 == null || tcVar2.qoPGr6Ce != 0 || tcVar2.NCTxEWno != 0) {
            arrayList.add(0, new tc(0, 0, 0));
        }
        arrayList.add(new tc(size, size2, 0));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj = arrayList.get(i3);
            i3++;
            tc tcVar3 = (tc) obj;
            for (int i4 = 0; i4 < tcVar3.MdtA4re8; i4++) {
                int i5 = tcVar3.qoPGr6Ce + i4;
                int i6 = tcVar3.NCTxEWno + i4;
                int i7 = tg0Var.RXQxj5Oe(i5, i6) ? 1 : 2;
                iArr[i5] = (i6 << 4) | i7;
                iArr2[i6] = (i5 << 4) | i7;
            }
        }
        if (this.b2ZJblxo) {
            int size4 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size4) {
                Object obj2 = arrayList.get(i9);
                i9++;
                tc tcVar4 = (tc) obj2;
                while (true) {
                    i = tcVar4.qoPGr6Ce;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size5 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size5) {
                                    tcVar = (tc) arrayList.get(i10);
                                    while (true) {
                                        i2 = tcVar.NCTxEWno;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && tg0Var.FySoLYna(i8, i11)) {
                                                int i12 = tg0Var.RXQxj5Oe(i8, i11) ? 8 : 4;
                                                iArr[i8] = (i11 << 4) | i12;
                                                iArr2[i11] = i12 | (i8 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = tcVar.MdtA4re8 + i2;
                                i10++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = tcVar4.MdtA4re8 + i;
            }
        }
    }

    public static vc qoPGr6Ce(ArrayDeque arrayDeque, int i, boolean z) {
        vc vcVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                vcVar = null;
                break;
            }
            vcVar = (vc) it.next();
            if (vcVar.qoPGr6Ce == i && vcVar.MdtA4re8 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            vc vcVar2 = (vc) it.next();
            if (z) {
                vcVar2.NCTxEWno--;
            } else {
                vcVar2.NCTxEWno++;
            }
        }
        return vcVar;
    }
}
