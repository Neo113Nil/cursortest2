package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class e00 {
    public static final ie0 GWasM1elztuh = v21.Yi7zF1RB1(fe0.GWasM1elztuh, ki1.uFEq9NpZ);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GWasM1elztuh(final i00 i00Var, final String str, ie0 ie0Var, long j, qx qxVar, final int i, final int i2) {
        String str2;
        ie0 ie0Var2;
        long j2;
        final ie0 ie0Var3;
        final long j3;
        at0 Mjvvu5DE;
        ie0 ie0Var4;
        ie0 ie0Var5;
        Object[] objArr;
        long j4;
        int i3;
        qxVar.Uxq83abb04(-126890956);
        int i4 = (qxVar.EljAMC1QTz(i00Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            str2 = str;
            i4 |= qxVar.EljAMC1QTz(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            ie0Var2 = ie0Var;
            i4 |= qxVar.EljAMC1QTz(ie0Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (qxVar.OOA6hdeuvCS(j2)) {
                        i3 = 2048;
                        i4 |= i3;
                    }
                } else {
                    j2 = j;
                }
                i3 = 1024;
                i4 |= i3;
            } else {
                j2 = j;
            }
            if (qxVar.dqB83aoLBB(i4 & 1, (i4 & 1171) == 1170)) {
                qxVar.YXi2hvwn7WL();
                ie0Var3 = ie0Var2;
                j3 = j2;
            } else {
                qxVar.qugwajBSa59j();
                if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                    ie0Var4 = i5 != 0 ? fe0.GWasM1elztuh : ie0Var2;
                    if ((i2 & 8) != 0) {
                        j2 = ((yb) qxVar.JFJ3QoxA(kg.GWasM1elztuh)).GWasM1elztuh;
                        i4 &= -7169;
                    }
                } else {
                    qxVar.YXi2hvwn7WL();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    ie0Var4 = ie0Var2;
                }
                qxVar.YmKjaVtbfp5Z();
                el elVar = (el) qxVar.JFJ3QoxA(kf.encWxUiV2);
                float f = i00Var.JFJ3QoxA;
                boolean OOA6hdeuvCS = qxVar.OOA6hdeuvCS((Float.floatToRawIntBits(elVar.Yi7zF1RB1()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                if (OOA6hdeuvCS || HFYAaqMd6 == ue.GWasM1elztuh) {
                    yy yyVar = new yy();
                    z50.E7jCp8Ls(yyVar, i00Var.EljAMC1QTz);
                    float f2 = i00Var.Yi7zF1RB1;
                    float f3 = i00Var.X1lG3V04pd;
                    float jivtDDk9H = elVar.jivtDDk9H(f2);
                    ie0Var5 = ie0Var4;
                    long floatToRawIntBits = (Float.floatToRawIntBits(elVar.jivtDDk9H(f3)) & 4294967295L) | (Float.floatToRawIntBits(jivtDDk9H) << 32);
                    float f4 = i00Var.xqGvceK5x;
                    float f5 = i00Var.OOA6hdeuvCS;
                    if (Float.isNaN(f4)) {
                        objArr = 32;
                        j4 = 4294967295L;
                        f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    } else {
                        objArr = 32;
                        j4 = 4294967295L;
                    }
                    if (Float.isNaN(f5)) {
                        f5 = Float.intBitsToFloat((int) (floatToRawIntBits & j4));
                    }
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f5) & j4) | (Float.floatToRawIntBits(f4) << (objArr == true ? 1L : 0L));
                    rd1 rd1Var = new rd1(yyVar);
                    String str3 = i00Var.GWasM1elztuh;
                    long j5 = i00Var.AvO7iQsrTN;
                    s6 s6Var = j5 != 16 ? new s6(i00Var.encWxUiV2, j5) : null;
                    boolean z = i00Var.mOu10nynGul;
                    rd1Var.xqGvceK5x.setValue(new t21(floatToRawIntBits));
                    rd1Var.OOA6hdeuvCS.setValue(Boolean.valueOf(z));
                    md1 md1Var = rd1Var.EljAMC1QTz;
                    md1Var.AvO7iQsrTN.setValue(s6Var);
                    md1Var.mOu10nynGul.setValue(new t21(floatToRawIntBits2));
                    md1Var.X1lG3V04pd = str3;
                    qxVar.dcDmLGVhzWm(rd1Var);
                    HFYAaqMd6 = rd1Var;
                } else {
                    ie0Var5 = ie0Var4;
                }
                ie0 ie0Var6 = ie0Var5;
                long j6 = j2;
                Yi7zF1RB1((rd1) HFYAaqMd6, str2, ie0Var6, j6, qxVar, (i4 & 112) | 8 | (i4 & 896) | (i4 & 7168));
                ie0Var3 = ie0Var6;
                j3 = j6;
            }
            Mjvvu5DE = qxVar.Mjvvu5DE();
            if (Mjvvu5DE == null) {
                Mjvvu5DE.xqGvceK5x = new lv() { // from class: d00
                    @Override // defpackage.lv
                    public final Object EljAMC1QTz(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        e00.GWasM1elztuh(i00.this, str, ie0Var3, j3, (qx) obj, n4.lv06NcmrQ(i | 1), i2);
                        return kc1.GWasM1elztuh;
                    }
                };
                return;
            }
            return;
        }
        ie0Var2 = ie0Var;
        if ((i & 3072) != 0) {
        }
        if (qxVar.dqB83aoLBB(i4 & 1, (i4 & 1171) == 1170)) {
        }
        Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r9 & 4294967295L))) != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Yi7zF1RB1(rd1 rd1Var, String str, ie0 ie0Var, long j, qx qxVar, int i) {
        int i2;
        ie0 ie0Var2;
        qxVar.Uxq83abb04(-2142239481);
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(rd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.EljAMC1QTz(ie0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.OOA6hdeuvCS(j) ? 2048 : 1024;
        }
        int i3 = 1;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 1171) != 1170)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) != 0 && !qxVar.WRKkgoJXwDn()) {
                qxVar.YXi2hvwn7WL();
            }
            qxVar.YmKjaVtbfp5Z();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && qxVar.OOA6hdeuvCS(j)) || (i2 & 3072) == 2048;
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (z || HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = yb.X1lG3V04pd(j, yb.AvO7iQsrTN) ? null : new s6(5, j);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            s6 s6Var = (s6) HFYAaqMd6;
            ie0 ie0Var3 = fe0.GWasM1elztuh;
            if (str != null) {
                qxVar.MjxSquD6Av(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object HFYAaqMd62 = qxVar.HFYAaqMd6();
                if (z2 || HFYAaqMd62 == k61Var) {
                    HFYAaqMd62 = new tj(str, i3);
                    qxVar.dcDmLGVhzWm(HFYAaqMd62);
                }
                ie0Var2 = a01.GWasM1elztuh(ie0Var3, (hv) HFYAaqMd62);
                qxVar.WIEu4Ya2g8(false);
            } else {
                qxVar.MjxSquD6Av(-536832197);
                qxVar.WIEu4Ya2g8(false);
                ie0Var2 = ie0Var3;
            }
            if (!t21.GWasM1elztuh(rd1Var.Yi7zF1RB1(), 9205357640488583168L)) {
                long Yi7zF1RB1 = rd1Var.Yi7zF1RB1();
                if (Float.isInfinite(Float.intBitsToFloat((int) (Yi7zF1RB1 >> 32)))) {
                }
                n7.GWasM1elztuh(vc0.EXrPz3p7hFb(ie0Var.X1lG3V04pd(ie0Var3), rd1Var, s6Var).X1lG3V04pd(ie0Var2), qxVar, 0);
            }
            ie0Var3 = GWasM1elztuh;
            n7.GWasM1elztuh(vc0.EXrPz3p7hFb(ie0Var.X1lG3V04pd(ie0Var3), rd1Var, s6Var).X1lG3V04pd(ie0Var2), qxVar, 0);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new bh(rd1Var, str, ie0Var, j, i);
        }
    }
}
