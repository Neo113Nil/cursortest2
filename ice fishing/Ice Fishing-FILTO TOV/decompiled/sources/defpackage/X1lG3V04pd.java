package defpackage;

import com.combinations.level.experts.core.domain.model.LevelSpec;
import com.combinations.level.experts.core.domain.model.Puzzle;
import com.combinations.level.experts.core.domain.model.Sector;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class X1lG3V04pd implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ X1lG3V04pd(kx kxVar, LevelSpec levelSpec, Puzzle puzzle) {
        this.OOA6hdeuvCS = 8;
        this.EljAMC1QTz = levelSpec;
        this.AvO7iQsrTN = puzzle;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        f4 f4Var;
        long j;
        w90 AvO7iQsrTN;
        int i = 7;
        int i2 = 5;
        int i3 = 2;
        int i4 = 3;
        int i5 = 0;
        vg vgVar = null;
        int i6 = 1;
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((tf0) this.EljAMC1QTz).Yi7zF1RB1((ur0) this.AvO7iQsrTN);
                return kc1.GWasM1elztuh;
            case 1:
                r5 r5Var = (r5) this.EljAMC1QTz;
                s5 s5Var = (s5) this.AvO7iQsrTN;
                kc1 kc1Var = kc1.GWasM1elztuh;
                i91 i91Var = r5Var.mE4lRynR;
                if (i91Var != null) {
                    i91Var.Yi7zF1RB1();
                }
                r5Var.mE4lRynR = null;
                rc rcVar = s5Var.Yi7zF1RB1;
                if (rcVar != null) {
                    rcVar.qugwajBSa59j(kc1Var);
                }
                s5Var.Yi7zF1RB1 = null;
                return kc1Var;
            case 2:
                h1 h1Var = (h1) this.EljAMC1QTz;
                qj qjVar = (qj) this.AvO7iQsrTN;
                i60 i60Var = (i60) obj;
                i60Var.GWasM1elztuh();
                ho.YTyqgZhdF(i60Var, h1Var, qjVar, 0.0f, null, 60);
                return kc1.GWasM1elztuh;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                zm0 zm0Var = (zm0) this.EljAMC1QTz;
                qj qjVar2 = (qj) this.AvO7iQsrTN;
                i60 i60Var2 = (i60) obj;
                i60Var2.GWasM1elztuh();
                ho.YTyqgZhdF(i60Var2, zm0Var.Yi7zF1RB1, qjVar2, 0.0f, null, 60);
                return kc1.GWasM1elztuh;
            case 4:
                ((x7) this.EljAMC1QTz).GWasM1elztuh.JFJ3QoxA((lg) this.AvO7iQsrTN);
                return kc1.GWasM1elztuh;
            case 5:
                y00 y00Var = (y00) this.EljAMC1QTz;
                nt0 nt0Var = (nt0) this.AvO7iQsrTN;
                boolean z = nt0Var.OOA6hdeuvCS || ((ey) obj).eUH21U3apd(y00Var);
                nt0Var.OOA6hdeuvCS = z;
                return Boolean.valueOf(!z);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                kq0 kq0Var = (kq0) this.EljAMC1QTz;
                nt0 nt0Var2 = (nt0) this.AvO7iQsrTN;
                boolean z2 = nt0Var2.OOA6hdeuvCS || ((ey) obj).OOA6hdeuvCS(kq0Var);
                nt0Var2.OOA6hdeuvCS = z2;
                return Boolean.valueOf(!z2);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((tf0) this.EljAMC1QTz).Yi7zF1RB1((d30) this.AvO7iQsrTN);
                return kc1.GWasM1elztuh;
            case 8:
                LevelSpec levelSpec = (LevelSpec) this.EljAMC1QTz;
                Puzzle puzzle = (Puzzle) this.AvO7iQsrTN;
                cx cxVar = (cx) obj;
                cxVar.getClass();
                int index = levelSpec.getIndex();
                Sector GWasM1elztuh = h90.GWasM1elztuh(index);
                int cellCount = puzzle.getCellCount();
                ArrayList arrayList = new ArrayList(cellCount);
                for (int i7 = 0; i7 < cellCount; i7++) {
                    arrayList.add(0);
                }
                return cx.GWasM1elztuh(cxVar, tw.EljAMC1QTz, index, GWasM1elztuh.getId(), GWasM1elztuh.getName(), puzzle.getWidth(), puzzle.getHeight(), puzzle.getStart(), arrayList, puzzle.getStart(), d5.K0ReC6MK(n4.YmKjaVtbfp5Z(puzzle.getWidth(), puzzle.getHeight(), puzzle.getStart(), puzzle.getCoreIndex())), puzzle.getCoreIndex(), puzzle.getPar(), 0, 0L, 0, null, null, cxVar.Mjvvu5DE + 1, 49152);
            case 9:
                ((dz) this.EljAMC1QTz).AvO7iQsrTN.removeCallbacks((cz) this.AvO7iQsrTN);
                return kc1.GWasM1elztuh;
            case 10:
                m10 m10Var = (m10) this.EljAMC1QTz;
                k10 k10Var = (k10) this.AvO7iQsrTN;
                m10Var.GWasM1elztuh.Yi7zF1RB1(k10Var);
                m10Var.Yi7zF1RB1.setValue(Boolean.TRUE);
                return new wl(i6, m10Var, k10Var);
            case 11:
                x80 x80Var = (x80) this.EljAMC1QTz;
                Object obj2 = this.AvO7iQsrTN;
                x80Var.AvO7iQsrTN.mOu10nynGul(obj2);
                return new wl(i3, x80Var, obj2);
            case 12:
                return new x80((kw0) this.EljAMC1QTz, (Map) obj, (iw0) this.AvO7iQsrTN);
            case 13:
                m51 m51Var = (m51) this.EljAMC1QTz;
                m51 m51Var2 = (m51) this.AvO7iQsrTN;
                ho hoVar = (ho) obj;
                hoVar.getClass();
                char c = ' ';
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hoVar.xqGvceK5x() & 4294967295L)) / 2.0f) & 4294967295L);
                float Yi7zF1RB1 = t21.Yi7zF1RB1(hoVar.xqGvceK5x()) / 2.0f;
                hoVar.WdrkLMV3xh(new ss0(fb1.rezfBrjOrqK(new yb(yb.Yi7zF1RB1(((Number) m51Var.getValue()).floatValue() * 0.28f, ac.EljAMC1QTz)), new yb(yb.EljAMC1QTz)), floatToRawIntBits, Yi7zF1RB1), Yi7zF1RB1, floatToRawIntBits);
                j61 j61Var = new j61(Yi7zF1RB1 * 0.055f, 0.0f, 1, 0, 26);
                float f = 0.86f;
                float f2 = 0.62f;
                for (rn0 rn0Var : fb1.rezfBrjOrqK(new rn0(Float.valueOf(0.86f), Float.valueOf(0.5f)), new rn0(Float.valueOf(0.62f), Float.valueOf(0.32f)))) {
                    long j2 = floatToRawIntBits;
                    ho.JB4pnjMK(hoVar, yb.Yi7zF1RB1(((Number) rn0Var.EljAMC1QTz).floatValue(), ac.EljAMC1QTz), ((Number) rn0Var.OOA6hdeuvCS).floatValue() * Yi7zF1RB1, j2, 0.0f, j61Var, 104);
                    floatToRawIntBits = j2;
                }
                while (i5 < i4) {
                    float floatValue = (i5 * 120.0f) + ((Number) m51Var2.getValue()).floatValue();
                    f4 arNh8D4Z5gB = hoVar.arNh8D4Z5gB();
                    long mOu10nynGul = arNh8D4Z5gB.mOu10nynGul();
                    arNh8D4Z5gB.EljAMC1QTz().E7jCp8Ls();
                    char c2 = c;
                    try {
                        ((j6IIN2O8eOU) arNh8D4Z5gB.Yi7zF1RB1).Mjvvu5DE(floatValue, floatToRawIntBits);
                        float f3 = Yi7zF1RB1 * f;
                        float f4 = f2;
                        yb ybVar = new yb(ac.mOu10nynGul);
                        long j3 = ac.EljAMC1QTz;
                        float f5 = Yi7zF1RB1;
                        int i8 = i5;
                        m51 m51Var3 = m51Var2;
                        long j4 = floatToRawIntBits;
                        ma0 ma0Var = new ma0(fb1.rezfBrjOrqK(ybVar, new yb(j3)), null, j4, (Float.floatToRawIntBits(Float.intBitsToFloat(r3)) << c2) | (Float.floatToRawIntBits(Float.intBitsToFloat(r7) - f3) & 4294967295L));
                        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c2));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) - f3;
                        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                        long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
                        m51 m51Var4 = m51Var;
                        f4Var = arNh8D4Z5gB;
                        j = mOu10nynGul;
                        try {
                            hoVar.MZhzXH72(ma0Var, j4, floatToRawIntBits3 | (floatToRawIntBits2 << c2), 0.075f * f5);
                            ho.JB4pnjMK(hoVar, j3, f5 * 0.085f, (Float.floatToRawIntBits(Float.intBitsToFloat(r3)) << c2) | (Float.floatToRawIntBits(Float.intBitsToFloat(r7) - f3) & 4294967295L), 0.0f, null, 120);
                            f4Var.EljAMC1QTz().JFJ3QoxA();
                            f4Var.jivtDDk9H(j);
                            i5 = i8 + 1;
                            c = c2;
                            m51Var = m51Var4;
                            floatToRawIntBits = j4;
                            f2 = f4;
                            Yi7zF1RB1 = f5;
                            m51Var2 = m51Var3;
                            f = 0.86f;
                            i4 = 3;
                        } catch (Throwable th) {
                            th = th;
                            f4Var.EljAMC1QTz().JFJ3QoxA();
                            f4Var.jivtDDk9H(j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        f4Var = arNh8D4Z5gB;
                        j = mOu10nynGul;
                    }
                }
                m51 m51Var5 = m51Var2;
                char c3 = c;
                float f6 = Yi7zF1RB1;
                long j5 = floatToRawIntBits;
                m51 m51Var6 = m51Var;
                double radians = Math.toRadians((-((Number) m51Var5.getValue()).floatValue()) * 2.4f);
                long j6 = ac.mOu10nynGul;
                int i9 = (int) (j5 >> c3);
                float intBitsToFloat3 = Float.intBitsToFloat(i9);
                double cos = Math.cos(radians);
                double d = f6 * f2;
                ho.JB4pnjMK(hoVar, yb.Yi7zF1RB1(0.9f, j6), f6 * 0.05f, (Float.floatToRawIntBits(Float.intBitsToFloat(r2) + ((float) (d * Math.sin(radians)))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3 + ((float) (cos * d))) << c3), 0.0f, null, 120);
                float f7 = 0.34f * f6;
                hoVar.WdrkLMV3xh(new ss0(fb1.rezfBrjOrqK(new yb(yb.X1lG3V04pd), new yb(j6), new yb(yb.Yi7zF1RB1(0.0f, j6))), j5, ((Number) m51Var6.getValue()).floatValue() * f7), ((Number) m51Var6.getValue()).floatValue() * f7, j5);
                long Yi7zF1RB12 = yb.Yi7zF1RB1(0.85f, ac.EljAMC1QTz);
                float floatValue2 = ((Number) m51Var5.getValue()).floatValue();
                float f8 = f6 * 0.98f;
                float intBitsToFloat4 = Float.intBitsToFloat(i9) - f8;
                float intBitsToFloat5 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - f8;
                float f9 = f6 * 1.96f;
                hoVar.uFEq9NpZ(Yi7zF1RB12, floatValue2, (Float.floatToRawIntBits(intBitsToFloat4) << c3) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L), (Float.floatToRawIntBits(f9) << c3) | (Float.floatToRawIntBits(f9) & 4294967295L), new j61(0.045f * f6, 0.0f, 1, 0, 26));
                return kc1.GWasM1elztuh;
            case 14:
                ((mf0) this.EljAMC1QTz).X1lG3V04pd.add(new jf0(obj, (t01) this.AvO7iQsrTN));
                return kc1.GWasM1elztuh;
            case Side.ALL /* 15 */:
                Set set = (Set) this.EljAMC1QTz;
                mf0 mf0Var = (mf0) this.AvO7iQsrTN;
                if (set.contains(obj)) {
                    hg0 hg0Var = mf0Var.Yi7zF1RB1;
                    ig0 ig0Var = mf0Var.xqGvceK5x;
                    Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(obj);
                    if (AvO7iQsrTN2 != null) {
                        if (AvO7iQsrTN2 instanceof ig0) {
                            ig0 ig0Var2 = (ig0) AvO7iQsrTN2;
                            Object[] objArr = ig0Var2.Yi7zF1RB1;
                            long[] jArr = ig0Var2.GWasM1elztuh;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr[i10];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((255 & j7) < 128) {
                                                ig0Var.GWasM1elztuh((t01) objArr[(i10 << 3) + i12]);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i11 != 8) {
                                        }
                                    }
                                    if (i10 != length) {
                                        i10++;
                                    }
                                }
                            }
                        } else {
                            ig0Var.GWasM1elztuh((t01) AvO7iQsrTN2);
                        }
                    }
                }
                return kc1.GWasM1elztuh;
            case 16:
                xh0 xh0Var = (xh0) this.EljAMC1QTz;
                ph0 ph0Var = ((hi0) this.AvO7iQsrTN).Yi7zF1RB1;
                ti0 ti0Var = (ti0) obj;
                ti0Var.getClass();
                ri0 ri0Var = ti0Var.GWasM1elztuh;
                ri0Var.OOA6hdeuvCS = 0;
                ri0Var.EljAMC1QTz = 0;
                if (xh0Var instanceof bi0) {
                    int i13 = xh0.mOu10nynGul;
                    Iterator it = o50.Mjvvu5DE(xh0Var).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            xh0 xh0Var2 = (xh0) it.next();
                            xh0 encWxUiV2 = ph0Var.encWxUiV2();
                            if (o30.rQPn8YBR(xh0Var2, encWxUiV2 != null ? encWxUiV2.AvO7iQsrTN : null)) {
                            }
                        } else {
                            int i14 = bi0.rQPn8YBR;
                            bi0 bi0Var = ph0Var.X1lG3V04pd;
                            if (bi0Var == null) {
                                o4.jivtDDk9H("You must call setGraph() before calling getGraph()");
                                return null;
                            }
                            Iterator it2 = x01.EXrPz3p7hFb(bi0Var, new oh0(i4)).iterator();
                            if (!it2.hasNext()) {
                                o4.AvO7iQsrTN("Sequence is empty.");
                                return null;
                            }
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                next = it2.next();
                            }
                            ti0Var.X1lG3V04pd = ((xh0) next).EljAMC1QTz.GWasM1elztuh;
                            ti0Var.OOA6hdeuvCS = false;
                            ti0Var.EljAMC1QTz = true;
                        }
                    }
                }
                return kc1.GWasM1elztuh;
            case 17:
                return new wl(i4, (m51) this.EljAMC1QTz, (zd) this.AvO7iQsrTN);
            case 18:
                hi0 hi0Var = (hi0) this.EljAMC1QTz;
                t90 t90Var = (t90) this.AvO7iQsrTN;
                hi0Var.getClass();
                t90Var.getClass();
                ph0 ph0Var2 = hi0Var.Yi7zF1RB1;
                lh0 lh0Var = ph0Var2.Mjvvu5DE;
                if (!t90Var.equals(ph0Var2.uFEq9NpZ)) {
                    t90 t90Var2 = ph0Var2.uFEq9NpZ;
                    if (t90Var2 != null && (AvO7iQsrTN = t90Var2.AvO7iQsrTN()) != null) {
                        AvO7iQsrTN.EljAMC1QTz(lh0Var);
                    }
                    ph0Var2.uFEq9NpZ = t90Var;
                    t90Var.AvO7iQsrTN().GWasM1elztuh(lh0Var);
                }
                return new pi0(0);
            case 19:
                ln0 ln0Var = (ln0) this.EljAMC1QTz;
                up0 up0Var = (up0) this.AvO7iQsrTN;
                tp0 tp0Var = (tp0) obj;
                boolean z3 = ln0Var.lv06NcmrQ;
                float f10 = ln0Var.mE4lRynR;
                if (z3) {
                    tp0.JFJ3QoxA(tp0Var, up0Var, tp0Var.rezfBrjOrqK(f10), tp0Var.rezfBrjOrqK(ln0Var.jivtDDk9H));
                } else {
                    tp0.AvO7iQsrTN(tp0Var, up0Var, tp0Var.rezfBrjOrqK(f10), tp0Var.rezfBrjOrqK(ln0Var.jivtDDk9H));
                }
                return kc1.GWasM1elztuh;
            case 20:
                z5 z5Var = (z5) this.EljAMC1QTz;
                fe feVar = (fe) this.AvO7iQsrTN;
                rx0 rx0Var = z5Var.GWasM1elztuh;
                if (rx0Var != null) {
                    rx0.X1lG3V04pd(rx0Var, feVar.Yi7zF1RB1);
                } else {
                    hl0 hl0Var = z5Var.Yi7zF1RB1;
                    if (hl0Var == null) {
                        o4.jivtDDk9H("Unreachable");
                        return null;
                    }
                    y5 y5Var = feVar.GWasM1elztuh;
                    y5Var.getClass();
                    bl0 bl0Var = new bl0(y5Var, new cl0(y5Var, null));
                    y5Var.GWasM1elztuh.add(bl0Var);
                    rx0.X1lG3V04pd(hl0Var.GWasM1elztuh(), bl0Var);
                }
                return new wl(4, z5Var, feVar);
            case 21:
                df dfVar = (df) this.EljAMC1QTz;
                ig0 ig0Var3 = (ig0) this.AvO7iQsrTN;
                dfVar.arNh8D4Z5gB(obj);
                if (ig0Var3 != null) {
                    ig0Var3.GWasM1elztuh(obj);
                }
                return kc1.GWasM1elztuh;
            case 22:
                gt0 gt0Var = (gt0) this.EljAMC1QTz;
                Throwable th3 = (Throwable) this.AvO7iQsrTN;
                Throwable th4 = (Throwable) obj;
                synchronized (gt0Var.X1lG3V04pd) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th4 != null) {
                        try {
                            if (th4 instanceof CancellationException) {
                                th4 = null;
                            }
                            if (th4 != null) {
                                p.xqGvceK5x(th3, th4);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    gt0Var.OOA6hdeuvCS = th3;
                    p51 p51Var = gt0Var.Y6hRI1cF8;
                    dt0 dt0Var = dt0.OOA6hdeuvCS;
                    p51Var.getClass();
                    p51Var.JFJ3QoxA(null, dt0Var);
                }
                return kc1.GWasM1elztuh;
            case 23:
                uy0 uy0Var = (uy0) this.EljAMC1QTz;
                wy0 wy0Var = (wy0) this.AvO7iQsrTN;
                nn nnVar = (nn) obj;
                float f11 = nnVar.Yi7zF1RB1 ? -1.0f : 1.0f;
                long j8 = nnVar.GWasM1elztuh;
                uy0Var.GWasM1elztuh(1, uk0.EljAMC1QTz(f11, wy0Var.xqGvceK5x == xm0.EljAMC1QTz ? uk0.GWasM1elztuh(j8, 0.0f, 1) : uk0.GWasM1elztuh(j8, 0.0f, 2)));
                return kc1.GWasM1elztuh;
            case 24:
                m51 m51Var7 = (m51) this.EljAMC1QTz;
                kz0 kz0Var = (kz0) this.AvO7iQsrTN;
                i80 i80Var = (i80) obj;
                i80Var.getClass();
                List list = ((jz0) m51Var7.getValue()).xqGvceK5x;
                dx0 dx0Var = new dx0(21);
                int size = list.size();
                iy iyVar = new iy(i3, dx0Var, list);
                i8 i8Var = new i8(i4, list);
                jd jdVar = new jd(802480018, true, new iz0(list, kz0Var));
                x0 x0Var = i80Var.GWasM1elztuh;
                f4 f4Var2 = new f4(iyVar, i8Var, jdVar, i);
                x0Var.getClass();
                if (size < 0) {
                    w10.GWasM1elztuh("size should be >=0");
                }
                if (size != 0) {
                    j30 j30Var = new j30(x0Var.GWasM1elztuh, size, f4Var2);
                    x0Var.GWasM1elztuh += size;
                    ((rg0) x0Var.Yi7zF1RB1).Yi7zF1RB1(j30Var);
                }
                return kc1.GWasM1elztuh;
            case 25:
                fb1.MZhzXH72((ph) this.EljAMC1QTz, null, new mi0((qa1) this.AvO7iQsrTN, null), 1);
                return new pi0(1);
            case 26:
                vz0 vz0Var = (vz0) this.EljAMC1QTz;
                vz0Var.lv06NcmrQ(new r41(new X1lG3V04pd(29, Thread.currentThread(), (ph) this.AvO7iQsrTN)));
                return new z(i2, vz0Var);
            case 27:
                qa1 qa1Var = (qa1) this.EljAMC1QTz;
                qa1 qa1Var2 = (qa1) this.AvO7iQsrTN;
                qa1Var.JFJ3QoxA.add(qa1Var2);
                return new wl(i2, qa1Var, qa1Var2);
            case 28:
                return new wl(6, (qa1) this.EljAMC1QTz, (la1) this.AvO7iQsrTN);
            default:
                Object obj3 = this.EljAMC1QTz;
                ph phVar = (ph) this.AvO7iQsrTN;
                wu wuVar = (wu) obj;
                if (obj3 == Thread.currentThread()) {
                    wuVar.GWasM1elztuh();
                } else {
                    fb1.MZhzXH72(phVar, null, new rQPn8YBR(wuVar, vgVar, i3), 3);
                }
                return kc1.GWasM1elztuh;
        }
    }

    public /* synthetic */ X1lG3V04pd(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }
}
