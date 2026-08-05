package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ List MdtA4re8;
    public final /* synthetic */ List NCTxEWno;
    public final /* synthetic */ e1 VgvYg0wo;
    public final /* synthetic */ int wxUZMvaN;

    public c1(e1 e1Var, List list, List list2, int i) {
        this.VgvYg0wo = e1Var;
        this.NCTxEWno = list;
        this.MdtA4re8 = list2;
        this.wxUZMvaN = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r6[(r3 + 1) + r8] > r6[(r3 - 1) + r8]) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        xc xcVar;
        int i2;
        wc wcVar;
        int i3;
        int i4;
        xc xcVar2;
        xc xcVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        tg0 tg0Var = new tg0(7, this);
        int size = this.NCTxEWno.size();
        int size2 = this.MdtA4re8.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        wc wcVar2 = new wc();
        int i20 = 0;
        wcVar2.qoPGr6Ce = 0;
        wcVar2.NCTxEWno = size;
        wcVar2.MdtA4re8 = 0;
        wcVar2.wxUZMvaN = size2;
        arrayList2.add(wcVar2);
        int i21 = size + size2;
        int i22 = 1;
        int i23 = (((i21 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i23];
        int i24 = i23 / 2;
        int[] iArr2 = new int[i23];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            wc wcVar3 = (wc) arrayList2.remove(arrayList2.size() - i22);
            if (wcVar3.NCTxEWno() >= i22 && wcVar3.qoPGr6Ce() >= i22) {
                int qoPGr6Ce = ((wcVar3.qoPGr6Ce() + wcVar3.NCTxEWno()) + i22) / 2;
                int i25 = i22 + i24;
                iArr[i25] = wcVar3.qoPGr6Ce;
                iArr2[i25] = wcVar3.NCTxEWno;
                int i26 = i20;
                while (i26 < qoPGr6Ce) {
                    int i27 = Math.abs(wcVar3.NCTxEWno() - wcVar3.qoPGr6Ce()) % 2 == i22 ? i22 : i20;
                    int NCTxEWno = wcVar3.NCTxEWno() - wcVar3.qoPGr6Ce();
                    int i28 = -i26;
                    int i29 = i28;
                    while (true) {
                        if (i29 > i26) {
                            i3 = i20;
                            i = i24;
                            i4 = qoPGr6Ce;
                            xcVar2 = null;
                            break;
                        }
                        if (i29 != i28) {
                            if (i29 != i26) {
                                i10 = i29;
                            } else {
                                i10 = i29;
                            }
                            i11 = iArr[(i10 - 1) + i24];
                            i12 = i11 + 1;
                            i = i24;
                            i13 = ((i12 - wcVar3.qoPGr6Ce) + wcVar3.MdtA4re8) - i10;
                            if (i26 == 0 && i12 == i11) {
                                i14 = i12;
                                i15 = i13 - 1;
                            } else {
                                i14 = i12;
                                i15 = i13;
                            }
                            int i30 = qoPGr6Ce;
                            i16 = i13;
                            i17 = i14;
                            i4 = i30;
                            i18 = i27;
                            while (i17 < wcVar3.NCTxEWno && i16 < wcVar3.wxUZMvaN && tg0Var.FySoLYna(i17, i16)) {
                                i17++;
                                i16++;
                            }
                            iArr[i10 + i] = i17;
                            if (i18 == 0) {
                                int i31 = NCTxEWno - i10;
                                i19 = NCTxEWno;
                                if (i31 >= i28 + 1 && i31 <= i26 - 1 && iArr2[i31 + i] <= i17) {
                                    xcVar2 = new xc();
                                    xcVar2.qoPGr6Ce = i11;
                                    xcVar2.NCTxEWno = i15;
                                    xcVar2.MdtA4re8 = i17;
                                    xcVar2.wxUZMvaN = i16;
                                    i3 = 0;
                                    xcVar2.VgvYg0wo = false;
                                    break;
                                }
                            } else {
                                i19 = NCTxEWno;
                            }
                            i20 = 0;
                            i29 = i10 + 2;
                            i24 = i;
                            qoPGr6Ce = i4;
                            i27 = i18;
                            NCTxEWno = i19;
                        } else {
                            i10 = i29;
                        }
                        i11 = iArr[i10 + 1 + i24];
                        i12 = i11;
                        i = i24;
                        i13 = ((i12 - wcVar3.qoPGr6Ce) + wcVar3.MdtA4re8) - i10;
                        if (i26 == 0) {
                        }
                        i14 = i12;
                        i15 = i13;
                        int i302 = qoPGr6Ce;
                        i16 = i13;
                        i17 = i14;
                        i4 = i302;
                        i18 = i27;
                        while (i17 < wcVar3.NCTxEWno) {
                            i17++;
                            i16++;
                        }
                        iArr[i10 + i] = i17;
                        if (i18 == 0) {
                        }
                        i20 = 0;
                        i29 = i10 + 2;
                        i24 = i;
                        qoPGr6Ce = i4;
                        i27 = i18;
                        NCTxEWno = i19;
                    }
                    if (xcVar2 != null) {
                        xcVar = xcVar2;
                        break;
                    }
                    int i32 = (wcVar3.NCTxEWno() - wcVar3.qoPGr6Ce()) % 2 == 0 ? 1 : i3;
                    int NCTxEWno2 = wcVar3.NCTxEWno() - wcVar3.qoPGr6Ce();
                    int i33 = i28;
                    while (true) {
                        if (i33 > i26) {
                            xcVar3 = null;
                            break;
                        }
                        if (i33 == i28 || (i33 != i26 && iArr2[i33 + 1 + i] < iArr2[(i33 - 1) + i])) {
                            i5 = iArr2[i33 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i33 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i34 = wcVar3.wxUZMvaN - ((wcVar3.NCTxEWno - i6) - i33);
                        if (i26 == 0 || i6 != i5) {
                            i7 = i34;
                        } else {
                            i7 = i34;
                            i34++;
                        }
                        int i35 = i7;
                        int i36 = i32;
                        int i37 = i6;
                        int i38 = i35;
                        int i39 = NCTxEWno2;
                        while (i37 > wcVar3.qoPGr6Ce && i38 > wcVar3.MdtA4re8) {
                            i8 = i33;
                            if (!tg0Var.FySoLYna(i37 - 1, i38 - 1)) {
                                break;
                            }
                            i37--;
                            i38--;
                            i33 = i8;
                        }
                        i8 = i33;
                        iArr2[i8 + i] = i37;
                        if (i36 != 0 && (i9 = i39 - i8) >= i28 && i9 <= i26 && iArr[i9 + i] >= i37) {
                            xcVar3 = new xc();
                            xcVar3.qoPGr6Ce = i37;
                            xcVar3.NCTxEWno = i38;
                            xcVar3.MdtA4re8 = i5;
                            xcVar3.wxUZMvaN = i34;
                            xcVar3.VgvYg0wo = true;
                            break;
                        }
                        i33 = i8 + 2;
                        i32 = i36;
                        NCTxEWno2 = i39;
                    }
                    if (xcVar3 != null) {
                        xcVar = xcVar3;
                        break;
                    }
                    i26++;
                    i24 = i;
                    qoPGr6Ce = i4;
                    i22 = 1;
                    i20 = 0;
                }
            }
            i = i24;
            xcVar = null;
            if (xcVar != null) {
                if (xcVar.qoPGr6Ce() > 0) {
                    int i40 = xcVar.wxUZMvaN;
                    int i41 = xcVar.NCTxEWno;
                    int i42 = i40 - i41;
                    int i43 = xcVar.MdtA4re8;
                    int i44 = xcVar.qoPGr6Ce;
                    int i45 = i43 - i44;
                    arrayList.add(i42 != i45 ? xcVar.VgvYg0wo ? new tc(i44, i41, xcVar.qoPGr6Ce()) : i42 > i45 ? new tc(i44, i41 + 1, xcVar.qoPGr6Ce()) : new tc(i44 + 1, i41, xcVar.qoPGr6Ce()) : new tc(i44, i41, i45));
                }
                if (arrayList3.isEmpty()) {
                    wcVar = new wc();
                    i2 = 1;
                } else {
                    i2 = 1;
                    wcVar = (wc) arrayList3.remove(arrayList3.size() - 1);
                }
                wcVar.qoPGr6Ce = wcVar3.qoPGr6Ce;
                wcVar.MdtA4re8 = wcVar3.MdtA4re8;
                wcVar.NCTxEWno = xcVar.qoPGr6Ce;
                wcVar.wxUZMvaN = xcVar.NCTxEWno;
                arrayList2.add(wcVar);
                wcVar3.NCTxEWno = wcVar3.NCTxEWno;
                wcVar3.wxUZMvaN = wcVar3.wxUZMvaN;
                wcVar3.qoPGr6Ce = xcVar.MdtA4re8;
                wcVar3.MdtA4re8 = xcVar.wxUZMvaN;
                arrayList2.add(wcVar3);
            } else {
                i2 = 1;
                arrayList3.add(wcVar3);
            }
            i22 = i2;
            i24 = i;
            i20 = 0;
        }
        Collections.sort(arrayList, ej0.VgvYg0wo);
        this.VgvYg0wo.MdtA4re8.execute(new XrPeKzBk(this, 4, new uc(tg0Var, arrayList, iArr, iArr2)));
    }
}
