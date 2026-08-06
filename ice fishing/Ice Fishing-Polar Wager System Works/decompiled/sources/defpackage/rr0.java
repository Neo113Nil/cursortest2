package defpackage;

/* loaded from: classes.dex */
public final class rr0 extends defpackage.gs0 {
    public static final defpackage.rr0 r1MBDhnF = new defpackage.rr0(1, 0, 2);

    @Override // defpackage.gs0
    public final void IHQe1A4L2xu(defpackage.pd pdVar, defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        int[] iArr;
        defpackage.o10 o10Var;
        int r1MBDhnF2;
        int oh6vYeIP = pdVar.oh6vYeIP(0);
        if (ia1Var.SyNS6RMn != 0) {
            defpackage.dh.IHQe1A4L2xu("Cannot move a group while inserting");
        }
        if (oh6vYeIP < 0) {
            defpackage.dh.IHQe1A4L2xu("Parameter offset is out of bounds");
        }
        if (oh6vYeIP == 0) {
            return;
        }
        int i = ia1Var.fnWB2E7cs;
        int i2 = ia1Var.V7bD7b8KA;
        int i3 = ia1Var.kNAkVymC;
        int i4 = i;
        while (true) {
            iArr = ia1Var.oh6vYeIP;
            if (oh6vYeIP <= 0) {
                break;
            }
            i4 += iArr[(ia1Var.kd6TUFXn(i4) * 5) + 3];
            if (i4 > i3) {
                defpackage.dh.IHQe1A4L2xu("Parameter offset is out of bounds");
            }
            oh6vYeIP--;
        }
        int i5 = iArr[(ia1Var.kd6TUFXn(i4) * 5) + 3];
        int AARZUJiTa = ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(ia1Var.fnWB2E7cs));
        int AARZUJiTa2 = ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(i4));
        int i6 = i4 + i5;
        int AARZUJiTa3 = ia1Var.AARZUJiTa(ia1Var.oh6vYeIP, ia1Var.kd6TUFXn(i6));
        int i7 = AARZUJiTa3 - AARZUJiTa2;
        ia1Var.abhbClRa(i7, java.lang.Math.max(ia1Var.fnWB2E7cs - 1, 0));
        ia1Var.PAEGRtP0bX(i5);
        int[] iArr2 = ia1Var.oh6vYeIP;
        int kd6TUFXn = ia1Var.kd6TUFXn(i6) * 5;
        defpackage.t6.Ye0N2xE9Hc(iArr2, iArr2, ia1Var.kd6TUFXn(i) * 5, kd6TUFXn, (i5 * 5) + kd6TUFXn);
        if (i7 > 0) {
            java.lang.Object[] objArr = ia1Var.r1MBDhnF;
            int EXtogiMhuM = ia1Var.EXtogiMhuM(AARZUJiTa2 + i7);
            java.lang.System.arraycopy(objArr, EXtogiMhuM, objArr, AARZUJiTa, ia1Var.EXtogiMhuM(AARZUJiTa3 + i7) - EXtogiMhuM);
        }
        int i8 = AARZUJiTa2 + i7;
        int i9 = i8 - AARZUJiTa;
        int i10 = ia1Var.ez2rX8ReCYw;
        int i11 = ia1Var.JlrlGoKF;
        int length = ia1Var.r1MBDhnF.length;
        int i12 = ia1Var.DFo87pBq1E5;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int kd6TUFXn2 = ia1Var.kd6TUFXn(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(kd6TUFXn2 * 5) + 4] = defpackage.ia1.riuEU0zW4(defpackage.ia1.riuEU0zW4(ia1Var.AARZUJiTa(iArr2, kd6TUFXn2) - i15, i12 < kd6TUFXn2 ? 0 : i10, i11, length), ia1Var.ez2rX8ReCYw, ia1Var.JlrlGoKF, ia1Var.r1MBDhnF.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int QoRHpC4k = ia1Var.QoRHpC4k();
        int IHQe1A4L2xu = defpackage.ha1.IHQe1A4L2xu(ia1Var.F7NU4MC0GW, i6, QoRHpC4k);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (IHQe1A4L2xu >= 0) {
            while (IHQe1A4L2xu < ia1Var.F7NU4MC0GW.size() && (r1MBDhnF2 = ia1Var.r1MBDhnF((o10Var = (defpackage.o10) ia1Var.F7NU4MC0GW.get(IHQe1A4L2xu)))) >= i6 && r1MBDhnF2 < i16) {
                arrayList.add(o10Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            defpackage.o10 o10Var2 = (defpackage.o10) arrayList.get(i18);
            int r1MBDhnF3 = ia1Var.r1MBDhnF(o10Var2) + i17;
            if (r1MBDhnF3 >= ia1Var.AARZUJiTa) {
                o10Var2.IHQe1A4L2xu = -(QoRHpC4k - r1MBDhnF3);
            } else {
                o10Var2.IHQe1A4L2xu = r1MBDhnF3;
            }
            ia1Var.F7NU4MC0GW.add(defpackage.ha1.IHQe1A4L2xu(ia1Var.F7NU4MC0GW, r1MBDhnF3, QoRHpC4k), o10Var2);
        }
        if (ia1Var.yIx6ChFVk(i6, i5)) {
            defpackage.dh.IHQe1A4L2xu("Unexpectedly removed anchors");
        }
        ia1Var.DFo87pBq1E5(i2, ia1Var.kNAkVymC, i);
        if (i7 > 0) {
            ia1Var.wll2JLbTBC2(i8, i7, i6 - 1);
        }
    }
}
