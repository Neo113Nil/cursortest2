package defpackage;

import com.combinations.level.experts.core.domain.model.ConduitKt;
import com.combinations.level.experts.core.domain.model.Side;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class xf {
    public static final long GWasM1elztuh = ki1.xqGvceK5x(4282798706L);
    public static final long Yi7zF1RB1 = ki1.xqGvceK5x(4279244331L);

    public static final long EljAMC1QTz(ho hoVar, int i) {
        if (i == 1) {
            return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        if (i == 2) {
            float intBitsToFloat = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)) / 2.0f;
            return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        if (i != 4) {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)) / 2.0f;
            return (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32)) / 2.0f;
        float intBitsToFloat5 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32);
    }

    public static final void GWasM1elztuh(cx cxVar, xy0 xy0Var, hv hvVar, ie0 ie0Var, qx qxVar, int i) {
        cx cxVar2;
        xy0 xy0Var2;
        hv hvVar2;
        ie0 ie0Var2;
        int i2;
        cxVar.getClass();
        hvVar.getClass();
        qxVar.Uxq83abb04(1762749946);
        int i3 = 2;
        int i4 = (qxVar.encWxUiV2(cxVar) ? 4 : 2) | i | (qxVar.EljAMC1QTz(xy0Var) ? 32 : 16) | (qxVar.encWxUiV2(hvVar) ? 256 : 128) | (qxVar.EljAMC1QTz(ie0Var) ? 2048 : 1024);
        if (!qxVar.dqB83aoLBB(i4 & 1, (i4 & 1171) != 1170)) {
            cxVar2 = cxVar;
            xy0Var2 = xy0Var;
            hvVar2 = hvVar;
            ie0Var2 = ie0Var;
            i2 = i;
            qxVar.YXi2hvwn7WL();
        } else {
            if (cxVar.OOA6hdeuvCS == 0 || cxVar.EljAMC1QTz == 0) {
                at0 Mjvvu5DE = qxVar.Mjvvu5DE();
                if (Mjvvu5DE != null) {
                    Mjvvu5DE.xqGvceK5x = new uf(cxVar, xy0Var, hvVar, ie0Var, i, 0);
                    return;
                }
                return;
            }
            vc0.GWasM1elztuh(ie0Var, b9xEq24R1.JFJ3QoxA, rj0.YZjbz8VdP5(1165136976, new gz0(cxVar, xy0Var, hvVar, i3), qxVar), qxVar, ((i4 >> 9) & 14) | 3120);
            cxVar2 = cxVar;
            xy0Var2 = xy0Var;
            hvVar2 = hvVar;
            ie0Var2 = ie0Var;
            i2 = i;
        }
        at0 Mjvvu5DE2 = qxVar.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            int i5 = i2;
            ie0 ie0Var3 = ie0Var2;
            Mjvvu5DE2.xqGvceK5x = new uf(cxVar2, xy0Var2, hvVar2, ie0Var3, i5, 1);
        }
    }

    public static final void OOA6hdeuvCS(ho hoVar, xy0 xy0Var, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float Yi7zF1RB12 = t21.Yi7zF1RB1(hoVar.xqGvceK5x()) * 0.2f;
        float f2 = 2.6f * Yi7zF1RB12 * f;
        hoVar.WdrkLMV3xh(new ss0(fb1.rezfBrjOrqK(new yb(yb.Yi7zF1RB1(0.55f, xy0Var.X1lG3V04pd)), new yb(yb.EljAMC1QTz)), floatToRawIntBits, f2), f2, floatToRawIntBits);
        ho.JB4pnjMK(hoVar, xy0Var.X1lG3V04pd, Yi7zF1RB12 * f, floatToRawIntBits, 0.0f, null, 120);
        ho.JB4pnjMK(hoVar, yb.Yi7zF1RB1(0.85f, yb.X1lG3V04pd), Yi7zF1RB12 * 0.42f * f, floatToRawIntBits, 0.0f, null, 120);
    }

    public static final void X1lG3V04pd(final int i, final int i2, final boolean z, final boolean z2, final xy0 xy0Var, final boolean z3, final boolean z4, final float f, final wu wuVar, qx qxVar, final int i3) {
        qx qxVar2;
        db1 db1Var;
        k61 k61Var;
        int i4;
        int i5;
        boolean z5;
        qxVar.Uxq83abb04(455321373);
        int i6 = i3 | (qxVar.xqGvceK5x(i) ? 4 : 2) | (qxVar.xqGvceK5x(i2) ? 32 : 16) | (qxVar.AvO7iQsrTN(z) ? 256 : 128) | (qxVar.AvO7iQsrTN(z2) ? 2048 : 1024) | (qxVar.EljAMC1QTz(xy0Var) ? 16384 : 8192) | (qxVar.AvO7iQsrTN(z3) ? 131072 : 65536) | (qxVar.AvO7iQsrTN(z4) ? 1048576 : 524288) | (qxVar.X1lG3V04pd(f) ? 8388608 : 4194304) | (qxVar.encWxUiV2(wuVar) ? 67108864 : 33554432);
        if (qxVar.dqB83aoLBB(i6 & 1, (i6 & 38347923) != 38347922)) {
            final m51 GWasM1elztuh2 = k2.GWasM1elztuh(i2 * 90.0f, z3 ? fb1.JFXS9W1rB5s4(190, 2, po.GWasM1elztuh) : new x31(), "tileSpin", qxVar, 20);
            long j = z ? xy0Var.GWasM1elztuh : GWasM1elztuh;
            db1 JFXS9W1rB5s4 = fb1.JFXS9W1rB5s4(260, 6, null);
            boolean EljAMC1QTz = qxVar.EljAMC1QTz(yb.EljAMC1QTz(j));
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var2 = ue.GWasM1elztuh;
            if (EljAMC1QTz || HFYAaqMd6 == k61Var2) {
                db1Var = JFXS9W1rB5s4;
                k61Var = k61Var2;
                i4 = 6;
                HFYAaqMd6 = new eb1(XdwzlWIkSDqF.E7jCp8Ls, new NWXxPwoOUSX9(6, yb.EljAMC1QTz(j)));
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            } else {
                db1Var = JFXS9W1rB5s4;
                k61Var = k61Var2;
                i4 = 6;
            }
            int i7 = i4;
            k61 k61Var3 = k61Var;
            final m51 Yi7zF1RB12 = k2.Yi7zF1RB1(new yb(j), (eb1) HFYAaqMd6, db1Var, null, "conduitColor", qxVar, 24960, 8);
            final k10 Mjvvu5DE = ki1.Mjvvu5DE(ki1.MZhzXH72("core", qxVar), 0.75f, 1.15f, new j10(fb1.JFXS9W1rB5s4(1400, 2, po.GWasM1elztuh), iu0.EljAMC1QTz), "corePulse", qxVar);
            qxVar2 = qxVar;
            Object HFYAaqMd62 = qxVar2.HFYAaqMd6();
            if (HFYAaqMd62 == k61Var3) {
                HFYAaqMd62 = new tf0();
                qxVar2.dcDmLGVhzWm(HFYAaqMd62);
            }
            ie0 YmKjaVtbfp5Z = rj0.YmKjaVtbfp5Z(v21.Yi7zF1RB1(fe0.GWasM1elztuh, f), (tf0) HFYAaqMd62, null, z4, null, wuVar, 24);
            bd0 xqGvceK5x = n7.xqGvceK5x(b9xEq24R1.EljAMC1QTz, false);
            int hashCode = Long.hashCode(qxVar2.qugwajBSa59j);
            cp0 E7jCp8Ls = qxVar2.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar2, YmKjaVtbfp5Z);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar2.c4eaifQP();
            if (qxVar2.CMh55RymNfS) {
                qxVar2.rQPn8YBR(hfVar);
            } else {
                qxVar2.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar2, xqGvceK5x);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar2, E7jCp8Ls);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar2, Integer.valueOf(hashCode));
            l60.WdrkLMV3xh(qxVar2, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar2, MZhzXH72);
            ie0 eUH21U3apd = o30.eUH21U3apd(v21.Yi7zF1RB1, 1.5f);
            boolean EljAMC1QTz2 = qxVar2.EljAMC1QTz(GWasM1elztuh2) | ((i6 & 14) == 4) | qxVar2.EljAMC1QTz(Yi7zF1RB12) | ((i6 & 896) == 256) | ((57344 & i6) == 16384) | ((i6 & 7168) == 2048) | qxVar2.EljAMC1QTz(Mjvvu5DE);
            Object HFYAaqMd63 = qxVar2.HFYAaqMd6();
            if (EljAMC1QTz2 || HFYAaqMd63 == k61Var3) {
                i5 = i7;
                z5 = true;
                hv hvVar = new hv() { // from class: qf
                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj) {
                        xy0 xy0Var2 = xy0Var;
                        int i8 = i;
                        boolean z6 = z;
                        m51 m51Var = Yi7zF1RB12;
                        ho hoVar = (ho) obj;
                        hoVar.getClass();
                        long Yi7zF1RB13 = yb.Yi7zF1RB1(0.55f, xf.Yi7zF1RB1);
                        float Yi7zF1RB14 = t21.Yi7zF1RB1(hoVar.xqGvceK5x()) * 0.14f;
                        hoVar.pog2g9KITJA(Yi7zF1RB13, 0L, ho.jed7WnvkLvFq(hoVar.xqGvceK5x(), 0L), (Float.floatToRawIntBits(Yi7zF1RB14) << 32) | (Float.floatToRawIntBits(Yi7zF1RB14) & 4294967295L), sr.Mjvvu5DE);
                        float floatValue = ((Number) GWasM1elztuh2.getValue()).floatValue();
                        long z19UFEN2I = hoVar.z19UFEN2I();
                        f4 arNh8D4Z5gB = hoVar.arNh8D4Z5gB();
                        long mOu10nynGul = arNh8D4Z5gB.mOu10nynGul();
                        arNh8D4Z5gB.EljAMC1QTz().E7jCp8Ls();
                        try {
                            ((j6IIN2O8eOU) arNh8D4Z5gB.Yi7zF1RB1).Mjvvu5DE(floatValue, z19UFEN2I);
                            xf.xqGvceK5x(hoVar, i8, ((yb) m51Var.getValue()).GWasM1elztuh, z6, xy0Var2.Yi7zF1RB1);
                            arNh8D4Z5gB.EljAMC1QTz().JFJ3QoxA();
                            arNh8D4Z5gB.jivtDDk9H(mOu10nynGul);
                            if (z2) {
                                xf.OOA6hdeuvCS(hoVar, xy0Var2, ((Number) Mjvvu5DE.getValue()).floatValue());
                            }
                            return kc1.GWasM1elztuh;
                        } catch (Throwable th) {
                            arNh8D4Z5gB.EljAMC1QTz().JFJ3QoxA();
                            arNh8D4Z5gB.jivtDDk9H(mOu10nynGul);
                            throw th;
                        }
                    }
                };
                qxVar2.dcDmLGVhzWm(hvVar);
                HFYAaqMd63 = hvVar;
            } else {
                i5 = i7;
                z5 = true;
            }
            o30.Yi7zF1RB1(eUH21U3apd, (hv) HFYAaqMd63, qxVar2, i5);
            qxVar2.WIEu4Ya2g8(z5);
        } else {
            qxVar2 = qxVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE2 = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE2 != null) {
            Mjvvu5DE2.xqGvceK5x = new lv(i, i2, z, z2, xy0Var, z3, z4, f, wuVar, i3) { // from class: rf
                public final /* synthetic */ boolean AvO7iQsrTN;
                public final /* synthetic */ float E7jCp8Ls;
                public final /* synthetic */ int EljAMC1QTz;
                public final /* synthetic */ boolean JFJ3QoxA;
                public final /* synthetic */ int OOA6hdeuvCS;
                public final /* synthetic */ wu XnEVoBF0td1l;
                public final /* synthetic */ boolean encWxUiV2;
                public final /* synthetic */ xy0 mOu10nynGul;
                public final /* synthetic */ boolean rQPn8YBR;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(1);
                    xf.X1lG3V04pd(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Yi7zF1RB1(final int i, boolean z, final xy0 xy0Var, boolean z2, ie0 ie0Var, qx qxVar, final int i2, final int i3) {
        int i4;
        final boolean z3;
        int i5;
        final boolean z4;
        final ie0 ie0Var2;
        at0 Mjvvu5DE;
        xy0Var.getClass();
        qxVar.Uxq83abb04(-888549199);
        if ((i2 & 6) == 0) {
            i4 = (qxVar.xqGvceK5x(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | (qxVar.EljAMC1QTz(xy0Var) ? 256 : 128);
        int i7 = i3 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z3 = z2;
            i6 |= qxVar.AvO7iQsrTN(z3) ? 16384 : 8192;
            i5 = i6 | 196608;
            if (qxVar.dqB83aoLBB(i5 & 1, (74899 & i5) == 74898)) {
                z4 = z;
                qxVar.YXi2hvwn7WL();
                ie0Var2 = ie0Var;
            } else {
                if (i7 != 0) {
                    z3 = false;
                }
                ie0Var2 = fe0.GWasM1elztuh;
                ie0 OOA6hdeuvCS = p.OOA6hdeuvCS(n30.WIEu4Ya2g8(v21.Yi7zF1RB1(ie0Var2, 46.0f), vv0.GWasM1elztuh(10.0f)), k61.rQPn8YBR(fb1.rezfBrjOrqK(new yb(xy0Var.xqGvceK5x), new yb(xy0Var.OOA6hdeuvCS)), 0.0f, 0.0f, 14), null, 6);
                bd0 xqGvceK5x = n7.xqGvceK5x(b9xEq24R1.EljAMC1QTz, false);
                int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
                cp0 E7jCp8Ls = qxVar.E7jCp8Ls();
                ie0 MZhzXH72 = n30.MZhzXH72(qxVar, OOA6hdeuvCS);
                oe.X1lG3V04pd.getClass();
                hf hfVar = ne.Yi7zF1RB1;
                qxVar.c4eaifQP();
                if (qxVar.CMh55RymNfS) {
                    qxVar.rQPn8YBR(hfVar);
                } else {
                    qxVar.K0ReC6MK();
                }
                l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, xqGvceK5x);
                l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls);
                l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
                l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
                l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
                ie0 eUH21U3apd = o30.eUH21U3apd(v21.Yi7zF1RB1, 2.0f);
                boolean z5 = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 57344) == 16384);
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                if (z5 || HFYAaqMd6 == ue.GWasM1elztuh) {
                    z4 = z;
                    HFYAaqMd6 = new hv() { // from class: sf
                        @Override // defpackage.hv
                        public final Object mOu10nynGul(Object obj) {
                            ho hoVar = (ho) obj;
                            hoVar.getClass();
                            boolean z6 = z4;
                            xy0 xy0Var2 = xy0Var;
                            xf.xqGvceK5x(hoVar, i, z6 ? xy0Var2.GWasM1elztuh : xf.GWasM1elztuh, z6, xy0Var2.Yi7zF1RB1);
                            if (z3) {
                                xf.OOA6hdeuvCS(hoVar, xy0Var2, 1.0f);
                            }
                            return kc1.GWasM1elztuh;
                        }
                    };
                    qxVar.dcDmLGVhzWm(HFYAaqMd6);
                } else {
                    z4 = z;
                }
                o30.Yi7zF1RB1(eUH21U3apd, (hv) HFYAaqMd6, qxVar, 6);
                qxVar.WIEu4Ya2g8(true);
            }
            final boolean z6 = z3;
            Mjvvu5DE = qxVar.Mjvvu5DE();
            if (Mjvvu5DE == null) {
                Mjvvu5DE.xqGvceK5x = new lv() { // from class: tf
                    @Override // defpackage.lv
                    public final Object EljAMC1QTz(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xf.Yi7zF1RB1(i, z4, xy0Var, z6, ie0Var2, (qx) obj, n4.lv06NcmrQ(i2 | 1), i3);
                        return kc1.GWasM1elztuh;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        i5 = i6 | 196608;
        if (qxVar.dqB83aoLBB(i5 & 1, (74899 & i5) == 74898)) {
        }
        final boolean z62 = z3;
        Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE == null) {
        }
    }

    public static final void xqGvceK5x(ho hoVar, int i, long j, boolean z, long j2) {
        ho hoVar2 = hoVar;
        float Yi7zF1RB12 = t21.Yi7zF1RB1(hoVar2.xqGvceK5x()) * 0.15f;
        float intBitsToFloat = Float.intBitsToFloat((int) (hoVar2.xqGvceK5x() >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hoVar2.xqGvceK5x() & 4294967295L)) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i2 = 0;
        if (z) {
            for (int i3 : Side.INSTANCE.getEntries()) {
                if (ConduitKt.hasSide(i, i3)) {
                    long j3 = floatToRawIntBits;
                    hoVar2.c4eaifQP(yb.Yi7zF1RB1(0.22f, j2), j3, EljAMC1QTz(hoVar2, i3), 2.1f * Yi7zF1RB12);
                    floatToRawIntBits = j3;
                }
            }
        }
        int[] entries = Side.INSTANCE.getEntries();
        int length = entries.length;
        while (i2 < length) {
            int i4 = entries[i2];
            if (ConduitKt.hasSide(i, i4)) {
                long j4 = floatToRawIntBits;
                hoVar2.c4eaifQP(j, j4, EljAMC1QTz(hoVar2, i4), Yi7zF1RB12);
                floatToRawIntBits = j4;
            }
            i2++;
            hoVar2 = hoVar;
        }
        int i5 = wf.GWasM1elztuh[ConduitKt.shape(i).ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                ho.JB4pnjMK(hoVar, j, Yi7zF1RB12 * 0.5f, floatToRawIntBits, 0.0f, null, 120);
            }
        } else {
            ho.JB4pnjMK(hoVar, j, Yi7zF1RB12 * 0.95f, floatToRawIntBits, 0.0f, null, 120);
            ho.JB4pnjMK(hoVar, Yi7zF1RB1, Yi7zF1RB12 * 0.42f, floatToRawIntBits, 0.0f, null, 120);
        }
    }
}
