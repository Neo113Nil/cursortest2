package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zy0 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ int xiZrDbcSW0;

    public /* synthetic */ zy0(int i, int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i2;
        this.AARZUJiTa = obj;
        this.xiZrDbcSW0 = i;
        this.EXtogiMhuM = obj2;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.eh ehVar;
        defpackage.eh ehVar2;
        int i;
        boolean z;
        int i2 = this.adDC3e2L;
        int i3 = 0;
        java.lang.Object obj2 = this.EXtogiMhuM;
        int i4 = this.xiZrDbcSW0;
        java.lang.Object obj3 = this.AARZUJiTa;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i2) {
            case 0:
                defpackage.az0 az0Var = (defpackage.az0) obj3;
                defpackage.fl0 fl0Var = (defpackage.fl0) obj2;
                defpackage.eh ehVar3 = (defpackage.eh) obj;
                if (az0Var.adDC3e2L == i4 && defpackage.x70.QoRHpC4k(fl0Var, az0Var.xiZrDbcSW0) && (ehVar3 instanceof defpackage.kh)) {
                    long[] jArr = fl0Var.IHQe1A4L2xu;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        java.lang.Object obj4 = fl0Var.oh6vYeIP[i9];
                                        boolean z2 = fl0Var.r1MBDhnF[i9] != i4;
                                        if (z2) {
                                            i = i6;
                                            defpackage.kh khVar = (defpackage.kh) ehVar3;
                                            ehVar2 = ehVar3;
                                            defpackage.nl0 nl0Var = khVar.ez2rX8ReCYw;
                                            defpackage.f70.abhbClRa(nl0Var, obj4, az0Var);
                                            z = z2;
                                            if (obj4 instanceof defpackage.yn) {
                                                defpackage.yn ynVar = (defpackage.yn) obj4;
                                                if (!nl0Var.r1MBDhnF(ynVar)) {
                                                    defpackage.f70.NHJTzaLwkd(khVar.SyNS6RMn, ynVar);
                                                }
                                                defpackage.nl0 nl0Var2 = az0Var.AARZUJiTa;
                                                if (nl0Var2 != null) {
                                                    nl0Var2.ez2rX8ReCYw(obj4);
                                                }
                                            }
                                        } else {
                                            ehVar2 = ehVar3;
                                            z = z2;
                                            i = i6;
                                        }
                                        if (z) {
                                            fl0Var.xiZrDbcSW0(i9);
                                        }
                                    } else {
                                        ehVar2 = ehVar3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    ehVar3 = ehVar2;
                                }
                                ehVar = ehVar3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                ehVar = ehVar3;
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                                ehVar3 = ehVar;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                defpackage.j51 j51Var = (defpackage.j51) obj3;
                defpackage.bv0 bv0Var = (defpackage.bv0) obj2;
                defpackage.av0 av0Var = (defpackage.av0) obj;
                int AARZUJiTa = j51Var.EgCjBq0SZwJ.IHQe1A4L2xu.AARZUJiTa();
                if (AARZUJiTa < 0) {
                    AARZUJiTa = 0;
                }
                if (AARZUJiTa <= i4) {
                    i4 = AARZUJiTa;
                }
                int i10 = -i4;
                boolean z3 = j51Var.fnWB2E7cs;
                int i11 = z3 ? 0 : i10;
                if (!z3) {
                    i10 = 0;
                }
                av0Var.adDC3e2L = true;
                defpackage.av0.DFo87pBq1E5(av0Var, bv0Var, i11, i10);
                av0Var.adDC3e2L = false;
                break;
        }
        return ok1Var;
    }
}
