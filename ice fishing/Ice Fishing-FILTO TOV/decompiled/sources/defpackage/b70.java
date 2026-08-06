package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class b70 implements pe1 {
    public static i00 GWasM1elztuh;

    public static final void A1EKNP6CxJ(b2 b2Var, int i) {
        Object obj;
        Iterator<T> it = b2Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((g60) ((Map.Entry) obj).getKey()).EljAMC1QTz == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        o4.YmKjaVtbfp5Z();
    }

    public static final void AEn1Rrio(hg0 hg0Var, Object obj) {
        boolean z;
        long[] jArr = hg0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = hg0Var.Yi7zF1RB1[i4];
                        Object obj3 = hg0Var.X1lG3V04pd[i4];
                        if (obj3 instanceof ig0) {
                            ig0 ig0Var = (ig0) obj3;
                            ig0Var.E7jCp8Ls(obj);
                            z = ig0Var.AvO7iQsrTN();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            hg0Var.E7jCp8Ls(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void AvO7iQsrTN(qx qxVar, ie0 ie0Var) {
        e0 e0Var = e0.EljAMC1QTz;
        int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
        ie0 MZhzXH72 = n30.MZhzXH72(qxVar, ie0Var);
        cp0 E7jCp8Ls = qxVar.E7jCp8Ls();
        oe.X1lG3V04pd.getClass();
        hf hfVar = ne.Yi7zF1RB1;
        qxVar.c4eaifQP();
        if (qxVar.CMh55RymNfS) {
            qxVar.rQPn8YBR(hfVar);
        } else {
            qxVar.K0ReC6MK();
        }
        l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, e0Var);
        l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls);
        l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
        l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
        l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
        qxVar.WIEu4Ya2g8(true);
    }

    public static final void E7jCp8Ls(hg0 hg0Var, Object obj, Object obj2) {
        int EljAMC1QTz = hg0Var.EljAMC1QTz(obj);
        boolean z = EljAMC1QTz < 0;
        Object obj3 = z ? null : hg0Var.X1lG3V04pd[EljAMC1QTz];
        if (obj3 != null) {
            if (obj3 instanceof ig0) {
                ((ig0) obj3).GWasM1elztuh(obj2);
            } else if (obj3 != obj2) {
                ig0 ig0Var = new ig0();
                ig0Var.GWasM1elztuh(obj3);
                ig0Var.GWasM1elztuh(obj2);
                obj2 = ig0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            hg0Var.X1lG3V04pd[EljAMC1QTz] = obj2;
            return;
        }
        int i = ~EljAMC1QTz;
        hg0Var.Yi7zF1RB1[i] = obj;
        hg0Var.X1lG3V04pd[i] = obj2;
    }

    public static yd0 EXrPz3p7hFb(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    yd0 yd0Var = new yd0();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    yd0Var.encWxUiV2 = duplicate;
                    yd0Var.OOA6hdeuvCS = position;
                    int i6 = position - duplicate.getInt(position);
                    yd0Var.EljAMC1QTz = i6;
                    yd0Var.AvO7iQsrTN = ((ByteBuffer) yd0Var.encWxUiV2).getShort(i6);
                    return yd0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void EljAMC1QTz(final m31 m31Var, ie0 ie0Var, z11 z11Var, long j, long j2, long j3, long j4, long j5, qx qxVar, final int i) {
        int i2;
        final ie0 ie0Var2;
        final z11 z11Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long X1lG3V04pd;
        long X1lG3V04pd2;
        z11 z11Var3;
        ie0 ie0Var3;
        int i3;
        long j11;
        long j12;
        long j13;
        qxVar.Uxq83abb04(274621471);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(m31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (qxVar.dqB83aoLBB(i4 & 1, (38347923 & i4) != 38347922)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                z11 GWasM1elztuh2 = e21.GWasM1elztuh(p.WdrkLMV3xh, qxVar);
                X1lG3V04pd = fc.X1lG3V04pd(p.cilMamHF, qxVar);
                X1lG3V04pd2 = fc.X1lG3V04pd(p.arNh8D4Z5gB, qxVar);
                ec ecVar = p.jivtDDk9H;
                long X1lG3V04pd3 = fc.X1lG3V04pd(ecVar, qxVar);
                long X1lG3V04pd4 = fc.X1lG3V04pd(ecVar, qxVar);
                long X1lG3V04pd5 = fc.X1lG3V04pd(p.WRKkgoJXwDn, qxVar);
                int i5 = i4 & (-268434433);
                z11Var3 = GWasM1elztuh2;
                ie0Var3 = fe0.GWasM1elztuh;
                i3 = i5;
                j11 = X1lG3V04pd3;
                j12 = X1lG3V04pd4;
                j13 = X1lG3V04pd5;
            } else {
                qxVar.YXi2hvwn7WL();
                int i6 = i4 & (-268434433);
                z11Var3 = z11Var;
                X1lG3V04pd = j;
                X1lG3V04pd2 = j2;
                j11 = j3;
                j12 = j4;
                j13 = j5;
                i3 = i6;
                ie0Var3 = ie0Var;
            }
            qxVar.YmKjaVtbfp5Z();
            m31Var.GWasM1elztuh.getClass();
            qxVar.MjxSquD6Av(-663517017);
            qxVar.WIEu4Ya2g8(false);
            m31Var.GWasM1elztuh.getClass();
            qxVar.MjxSquD6Av(-662974393);
            qxVar.WIEu4Ya2g8(false);
            z11 z11Var4 = z11Var3;
            long j14 = X1lG3V04pd;
            long j15 = X1lG3V04pd2;
            j9 = j12;
            j10 = j13;
            OOA6hdeuvCS(o30.eUH21U3apd(ie0Var3, 12.0f), null, null, z11Var4, j14, j15, j9, j10, rj0.YZjbz8VdP5(-1266389126, new j31(m31Var, 1), qxVar), qxVar, ((i3 << 3) & 7168) | 805306368);
            ie0Var2 = ie0Var3;
            z11Var2 = z11Var4;
            j6 = j14;
            j7 = j15;
            j8 = j11;
        } else {
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
            z11Var2 = z11Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new lv() { // from class: r31
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(i | 1);
                    b70.EljAMC1QTz(m31.this, ie0Var2, z11Var2, j6, j7, j8, j9, j10, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final void GWasM1elztuh(final ie0 ie0Var, u80 u80Var, final nn0 nn0Var, final t4 t4Var, p6 p6Var, fk fkVar, boolean z, m0 m0Var, final hv hvVar, qx qxVar, final int i) {
        final u80 u80Var2;
        final p6 p6Var2;
        final fk fkVar2;
        final boolean z2;
        final m0 m0Var2;
        u80 u80Var3;
        m0 m0Var3;
        int i2;
        fk fkVar3;
        m0 m0Var4;
        qxVar.Uxq83abb04(53695811);
        int i3 = i | 46861328 | (qxVar.encWxUiV2(hvVar) ? 536870912 : 268435456);
        boolean z3 = true;
        if (qxVar.dqB83aoLBB(i3 & 1, (306783379 & i3) != 306783378)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                p80 p80Var = w80.GWasM1elztuh;
                Object[] objArr = new Object[0];
                d dVar = u80.WdrkLMV3xh;
                boolean xqGvceK5x = qxVar.xqGvceK5x(0) | qxVar.xqGvceK5x(0);
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                Object obj = ue.GWasM1elztuh;
                if (xqGvceK5x || HFYAaqMd6 == obj) {
                    HFYAaqMd6 = new sb9fmtV8A(17);
                    qxVar.dcDmLGVhzWm(HFYAaqMd6);
                }
                u80Var3 = (u80) d70.AEn1Rrio(objArr, dVar, (wu) HFYAaqMd6, qxVar, 0);
                p6 p6Var3 = b9xEq24R1.YmKjaVtbfp5Z;
                float f = a51.GWasM1elztuh;
                el elVar = (el) qxVar.JFJ3QoxA(kf.encWxUiV2);
                boolean X1lG3V04pd = qxVar.X1lG3V04pd(elVar.Yi7zF1RB1());
                Object HFYAaqMd62 = qxVar.HFYAaqMd6();
                if (X1lG3V04pd || HFYAaqMd62 == obj) {
                    HFYAaqMd62 = new sj(new j6IIN2O8eOU(elVar));
                    qxVar.dcDmLGVhzWm(HFYAaqMd62);
                }
                sj sjVar = (sj) HFYAaqMd62;
                boolean EljAMC1QTz = qxVar.EljAMC1QTz(sjVar);
                Object HFYAaqMd63 = qxVar.HFYAaqMd6();
                if (EljAMC1QTz || HFYAaqMd63 == obj) {
                    HFYAaqMd63 = new fk(sjVar);
                    qxVar.dcDmLGVhzWm(HFYAaqMd63);
                }
                fk fkVar4 = (fk) HFYAaqMd63;
                lf lfVar = en0.GWasM1elztuh;
                qxVar.MjxSquD6Av(282942128);
                n0 n0Var = (n0) qxVar.JFJ3QoxA(en0.GWasM1elztuh);
                if (n0Var == null) {
                    qxVar.WIEu4Ya2g8(false);
                    m0Var3 = null;
                } else {
                    boolean EljAMC1QTz2 = qxVar.EljAMC1QTz(n0Var);
                    Object HFYAaqMd64 = qxVar.HFYAaqMd6();
                    if (EljAMC1QTz2 || HFYAaqMd64 == obj) {
                        Object m0Var5 = new m0(n0Var.GWasM1elztuh, n0Var.Yi7zF1RB1, n0Var.X1lG3V04pd, n0Var.xqGvceK5x);
                        qxVar.dcDmLGVhzWm(m0Var5);
                        HFYAaqMd64 = m0Var5;
                    }
                    m0Var3 = (m0) HFYAaqMd64;
                    qxVar.WIEu4Ya2g8(false);
                }
                i2 = i3 & (-238551153);
                fkVar3 = fkVar4;
                p6Var2 = p6Var3;
                m0Var4 = m0Var3;
            } else {
                qxVar.YXi2hvwn7WL();
                i2 = i3 & (-238551153);
                u80Var3 = u80Var;
                p6Var2 = p6Var;
                fkVar3 = fkVar;
                z3 = z;
                m0Var4 = m0Var;
            }
            qxVar.YmKjaVtbfp5Z();
            l60.GWasM1elztuh(ie0Var, u80Var3, nn0Var, fkVar3, z3, m0Var4, p6Var2, t4Var, hvVar, qxVar, 806907270, 6 | ((i2 >> 18) & 7168));
            fkVar2 = fkVar3;
            z2 = z3;
            m0Var2 = m0Var4;
            u80Var2 = u80Var3;
        } else {
            qxVar.YXi2hvwn7WL();
            u80Var2 = u80Var;
            p6Var2 = p6Var;
            fkVar2 = fkVar;
            z2 = z;
            m0Var2 = m0Var;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new lv(u80Var2, nn0Var, t4Var, p6Var2, fkVar2, z2, m0Var2, hvVar, i) { // from class: a70
                public final /* synthetic */ nn0 AvO7iQsrTN;
                public final /* synthetic */ m0 E7jCp8Ls;
                public final /* synthetic */ u80 EljAMC1QTz;
                public final /* synthetic */ fk JFJ3QoxA;
                public final /* synthetic */ hv XnEVoBF0td1l;
                public final /* synthetic */ t4 encWxUiV2;
                public final /* synthetic */ p6 mOu10nynGul;
                public final /* synthetic */ boolean rQPn8YBR;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(24967);
                    b70.GWasM1elztuh(ie0.this, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, (qx) obj2, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final int HFYAaqMd6(qf0 qf0Var) {
        int Yi7zF1RB1;
        int i = qf0Var.Yi7zF1RB1;
        int Yi7zF1RB12 = qf0Var.Yi7zF1RB1(0);
        while (qf0Var.Yi7zF1RB1 != 0 && qf0Var.Yi7zF1RB1(0) == Yi7zF1RB12) {
            int i2 = qf0Var.Yi7zF1RB1;
            if (i2 == 0) {
                o4.AvO7iQsrTN("IntList is empty.");
                return 0;
            }
            qf0Var.xqGvceK5x(0, qf0Var.GWasM1elztuh[i2 - 1]);
            qf0Var.X1lG3V04pd(qf0Var.Yi7zF1RB1 - 1);
            int i3 = qf0Var.Yi7zF1RB1;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int Yi7zF1RB13 = qf0Var.Yi7zF1RB1(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int Yi7zF1RB14 = qf0Var.Yi7zF1RB1(i7);
                if (i6 >= i3 || (Yi7zF1RB1 = qf0Var.Yi7zF1RB1(i6)) <= Yi7zF1RB14) {
                    if (Yi7zF1RB14 > Yi7zF1RB13) {
                        qf0Var.xqGvceK5x(i5, Yi7zF1RB14);
                        qf0Var.xqGvceK5x(i7, Yi7zF1RB13);
                        i5 = i7;
                    }
                } else if (Yi7zF1RB1 > Yi7zF1RB13) {
                    qf0Var.xqGvceK5x(i5, Yi7zF1RB1);
                    qf0Var.xqGvceK5x(i6, Yi7zF1RB13);
                    i5 = i6;
                }
            }
        }
        return Yi7zF1RB12;
    }

    public static final Object[] JFJ3QoxA(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        d5.mqNvfisv7(objArr, objArr2, 0, i, 6);
        d5.Fm8W7vP7q(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean M3K9sHhK(rt rtVar, n2 n2Var) {
        rt[] rtVarArr = new rt[16];
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitChildren called on an unattached node");
        }
        rg0 rg0Var = new rg0(new he0[16]);
        he0 he0Var = rtVar.OOA6hdeuvCS;
        he0 he0Var2 = he0Var.JFJ3QoxA;
        if (he0Var2 == null) {
            vc0.mOu10nynGul(rg0Var, he0Var);
        } else {
            rg0Var.Yi7zF1RB1(he0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = rg0Var.AvO7iQsrTN;
            if (i2 == 0) {
                break;
            }
            he0 he0Var3 = (he0) rg0Var.rQPn8YBR(i2 - 1);
            if ((he0Var3.encWxUiV2 & 1024) == 0) {
                vc0.mOu10nynGul(rg0Var, he0Var3);
            } else {
                while (true) {
                    if (he0Var3 == null) {
                        break;
                    }
                    if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                        rg0 rg0Var2 = null;
                        while (he0Var3 != null) {
                            if (he0Var3 instanceof rt) {
                                rt rtVar2 = (rt) he0Var3;
                                int i3 = i + 1;
                                if (rtVarArr.length < i3) {
                                    int length = rtVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(rtVarArr, 0, r10, 0, length);
                                    rtVarArr = r10;
                                }
                                rtVarArr[i] = rtVar2;
                                i = i3;
                            } else if ((he0Var3.AvO7iQsrTN & 1024) != 0 && (he0Var3 instanceof yk)) {
                                int i4 = 0;
                                for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                    if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            he0Var3 = he0Var4;
                                        } else {
                                            if (rg0Var2 == null) {
                                                rg0Var2 = new rg0(new he0[16]);
                                            }
                                            if (he0Var3 != null) {
                                                rg0Var2.Yi7zF1RB1(he0Var3);
                                                he0Var3 = null;
                                            }
                                            rg0Var2.Yi7zF1RB1(he0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            he0Var3 = vc0.E7jCp8Ls(rg0Var2);
                        }
                    } else {
                        he0Var3 = he0Var3.JFJ3QoxA;
                    }
                }
            }
        }
        Arrays.sort(rtVarArr, 0, i, st.Yi7zF1RB1);
        int i5 = i - 1;
        if (i5 < rtVarArr.length) {
            while (i5 >= 0) {
                rt rtVar3 = rtVarArr[i5];
                if (qj.YZjbz8VdP5(rtVar3) && iwATDS1i01k(rtVar3, n2Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final void OOA6hdeuvCS(final ie0 ie0Var, final lv lvVar, final lv lvVar2, final z11 z11Var, final long j, final long j2, final long j3, final long j4, final jd jdVar, qx qxVar, final int i) {
        int i2;
        lv lvVar3;
        lv lvVar4;
        z11 z11Var2;
        jd jdVar2;
        qxVar.Uxq83abb04(-1218779924);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lvVar3 = lvVar;
            i2 |= qxVar.encWxUiV2(lvVar3) ? 32 : 16;
        } else {
            lvVar3 = lvVar;
        }
        if ((i & 384) == 0) {
            lvVar4 = lvVar2;
            i2 |= qxVar.encWxUiV2(lvVar4) ? 256 : 128;
        } else {
            lvVar4 = lvVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.AvO7iQsrTN(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z11Var2 = z11Var;
            i2 |= qxVar.EljAMC1QTz(z11Var2) ? 16384 : 8192;
        } else {
            z11Var2 = z11Var;
        }
        if ((196608 & i) == 0) {
            i2 |= qxVar.OOA6hdeuvCS(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= qxVar.OOA6hdeuvCS(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= qxVar.OOA6hdeuvCS(j3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= qxVar.OOA6hdeuvCS(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            jdVar2 = jdVar;
            i2 |= qxVar.encWxUiV2(jdVar2) ? 536870912 : 268435456;
        } else {
            jdVar2 = jdVar;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (306783379 & i2) != 306783378)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) != 0 && !qxVar.WRKkgoJXwDn()) {
                qxVar.YXi2hvwn7WL();
            }
            qxVar.YmKjaVtbfp5Z();
            float f = p.lv06NcmrQ;
            jd YZjbz8VdP5 = rj0.YZjbz8VdP5(-1343524879, new v31(lvVar3, jdVar2, lvVar4, j3, j4), qxVar);
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            y61.GWasM1elztuh(ie0Var, z11Var2, j, j2, f, null, YZjbz8VdP5, qxVar, (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896), 80);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new lv() { // from class: s31
                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(i | 1);
                    b70.OOA6hdeuvCS(ie0.this, lvVar, lvVar2, z11Var, j, j2, j3, j4, jdVar, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final void TpUsjqg3bxO(List list, h1 h1Var) {
        vo0 vo0Var;
        float f;
        float f2;
        float f3;
        Path path = h1Var.GWasM1elztuh;
        Path path2 = h1Var.GWasM1elztuh;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        vo0 vo0Var2 = list.isEmpty() ? jo0.Yi7zF1RB1 : (vo0) list.get(0);
        int size = list.size();
        float f4 = 0.0f;
        int i = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (i < size) {
            vo0 vo0Var3 = (vo0) list.get(i);
            if (vo0Var3 instanceof jo0) {
                path2.close();
                vo0Var = vo0Var3;
                f5 = f7;
                f9 = f5;
                f6 = f8;
                f10 = f6;
            } else if (vo0Var3 instanceof no0) {
                no0 no0Var = (no0) vo0Var3;
                f7 = no0Var.Yi7zF1RB1;
                f8 = no0Var.X1lG3V04pd;
                path2.moveTo(f7, f8);
                vo0Var = vo0Var3;
                f9 = f7;
                f10 = f8;
            } else {
                if (vo0Var3 instanceof ro0) {
                    ro0 ro0Var = (ro0) vo0Var3;
                    float f11 = ro0Var.X1lG3V04pd;
                    float f12 = ro0Var.Yi7zF1RB1;
                    path2.rLineTo(f12, f11);
                    f9 += f12;
                    f10 += f11;
                } else if (vo0Var3 instanceof mo0) {
                    mo0 mo0Var = (mo0) vo0Var3;
                    float f13 = mo0Var.X1lG3V04pd;
                    float f14 = mo0Var.Yi7zF1RB1;
                    path2.lineTo(f14, f13);
                    f9 = f14;
                    vo0Var = vo0Var3;
                    f10 = f13;
                } else if (vo0Var3 instanceof qo0) {
                    float f15 = ((qo0) vo0Var3).Yi7zF1RB1;
                    path2.rLineTo(f15, f4);
                    f9 += f15;
                } else if (vo0Var3 instanceof lo0) {
                    float f16 = ((lo0) vo0Var3).Yi7zF1RB1;
                    path2.lineTo(f16, f10);
                    f9 = f16;
                } else if (vo0Var3 instanceof to0) {
                    float f17 = ((to0) vo0Var3).Yi7zF1RB1;
                    path2.rLineTo(f4, f17);
                    f10 += f17;
                } else if (vo0Var3 instanceof uo0) {
                    path2.lineTo(f9, 4.0f);
                    vo0Var = vo0Var3;
                    f10 = 4.0f;
                } else {
                    if (vo0Var3 instanceof po0) {
                        po0 po0Var = (po0) vo0Var3;
                        vo0Var = vo0Var3;
                        path2.rCubicTo(po0Var.Yi7zF1RB1, po0Var.X1lG3V04pd, po0Var.xqGvceK5x, po0Var.OOA6hdeuvCS, po0Var.EljAMC1QTz, po0Var.AvO7iQsrTN);
                        f5 = po0Var.xqGvceK5x + f9;
                        f6 = po0Var.OOA6hdeuvCS + f10;
                        f9 += po0Var.EljAMC1QTz;
                        f3 = po0Var.AvO7iQsrTN;
                    } else {
                        vo0Var = vo0Var3;
                        if (vo0Var instanceof ko0) {
                            path2.cubicTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
                            f5 = 14.21f;
                            f10 = 4.0f;
                            f9 = 12.0f;
                            f6 = 4.0f;
                        } else if (vo0Var instanceof so0) {
                            if (vo0Var2.GWasM1elztuh) {
                                f2 = f10 - f6;
                                f = f9 - f5;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                            }
                            so0 so0Var = (so0) vo0Var;
                            path2.rCubicTo(f, f2, so0Var.Yi7zF1RB1, so0Var.X1lG3V04pd, so0Var.xqGvceK5x, so0Var.OOA6hdeuvCS);
                            f5 = so0Var.Yi7zF1RB1 + f9;
                            f6 = so0Var.X1lG3V04pd + f10;
                            f9 += so0Var.xqGvceK5x;
                            f3 = so0Var.OOA6hdeuvCS;
                        } else {
                            if (!(vo0Var instanceof oo0)) {
                                o4.xqGvceK5x();
                                return;
                            }
                            if (vo0Var2.GWasM1elztuh) {
                                f9 = (f9 * 2.0f) - f5;
                                f10 = (2.0f * f10) - f6;
                            }
                            path2.cubicTo(f9, f10, 7.0f, 3.24f, 7.0f, 6.0f);
                            f9 = 7.0f;
                            f10 = 6.0f;
                            f6 = 3.24f;
                            f5 = 7.0f;
                        }
                    }
                    f10 += f3;
                }
                vo0Var = vo0Var3;
            }
            i++;
            vo0Var2 = vo0Var;
            f4 = 0.0f;
        }
    }

    public static hg0 WIEu4Ya2g8() {
        long[] jArr = kx0.GWasM1elztuh;
        return new hg0();
    }

    public static final int WRKkgoJXwDn(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final m81 WdrkLMV3xh(zz0 zz0Var) {
        hv hvVar;
        ArrayList arrayList = new ArrayList();
        Object AvO7iQsrTN = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(yz0.GWasM1elztuh);
        if (AvO7iQsrTN == null) {
            AvO7iQsrTN = null;
        }
        VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN;
        if (veqTn1PQw7 == null || (hvVar = (hv) veqTn1PQw7.Yi7zF1RB1) == null || !((Boolean) hvVar.mOu10nynGul(arrayList)).booleanValue()) {
            return null;
        }
        return (m81) arrayList.get(0);
    }

    public static final void X1lG3V04pd(final jd jdVar, lv lvVar, lv lvVar2, final y81 y81Var, final long j, long j2, qx qxVar, final int i) {
        lv lvVar3;
        lv lvVar4;
        boolean z;
        int i2;
        boolean z2;
        final long j3 = j2;
        qxVar.Uxq83abb04(-931325388);
        int i3 = i | (qxVar.encWxUiV2(jdVar) ? 4 : 2) | (qxVar.encWxUiV2(lvVar) ? 32 : 16) | (qxVar.encWxUiV2(lvVar2) ? 256 : 128) | (qxVar.EljAMC1QTz(y81Var) ? 2048 : 1024) | (qxVar.OOA6hdeuvCS(j) ? 16384 : 8192) | (qxVar.OOA6hdeuvCS(j3) ? 131072 : 65536);
        if (qxVar.dqB83aoLBB(i3 & 1, (74899 & i3) != 74898)) {
            ie0 DmJncFq5 = o30.DmJncFq5(fe0.GWasM1elztuh, lvVar2 == null ? 8.0f : 0.0f, 0.0f, 10);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new e0(5);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            bd0 bd0Var = (bd0) HFYAaqMd6;
            int M3K9sHhK = fb1.M3K9sHhK(qxVar);
            cp0 E7jCp8Ls = qxVar.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, DmJncFq5);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            r2 r2Var = ne.OOA6hdeuvCS;
            l60.WRKkgoJXwDn(r2Var, qxVar, bd0Var);
            r2 r2Var2 = ne.xqGvceK5x;
            l60.WRKkgoJXwDn(r2Var2, qxVar, E7jCp8Ls);
            r2 r2Var3 = ne.EljAMC1QTz;
            if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK))) {
                mr0.XnEVoBF0td1l(M3K9sHhK, qxVar, M3K9sHhK, r2Var3);
            }
            r2 r2Var4 = ne.X1lG3V04pd;
            l60.WRKkgoJXwDn(r2Var4, qxVar, MZhzXH72);
            ie0 MZhzXH722 = o30.MZhzXH72(qj.eUH21U3apd("text"), 0.0f, 6.0f, 1);
            r6 r6Var = b9xEq24R1.EljAMC1QTz;
            bd0 xqGvceK5x = n7.xqGvceK5x(r6Var, false);
            int M3K9sHhK2 = fb1.M3K9sHhK(qxVar);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            ie0 MZhzXH723 = n30.MZhzXH72(qxVar, MZhzXH722);
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(r2Var, qxVar, xqGvceK5x);
            l60.WRKkgoJXwDn(r2Var2, qxVar, E7jCp8Ls2);
            if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK2))) {
                mr0.XnEVoBF0td1l(M3K9sHhK2, qxVar, M3K9sHhK2, r2Var3);
            }
            l60.WRKkgoJXwDn(r2Var4, qxVar, MZhzXH723);
            jdVar.EljAMC1QTz(qxVar, Integer.valueOf(i3 & 14));
            qxVar.WIEu4Ya2g8(true);
            if (lvVar != null) {
                qxVar.MjxSquD6Av(-1014168049);
                ie0 eUH21U3apd = qj.eUH21U3apd("action");
                bd0 xqGvceK5x2 = n7.xqGvceK5x(r6Var, false);
                int M3K9sHhK3 = fb1.M3K9sHhK(qxVar);
                cp0 E7jCp8Ls3 = qxVar.E7jCp8Ls();
                ie0 MZhzXH724 = n30.MZhzXH72(qxVar, eUH21U3apd);
                qxVar.c4eaifQP();
                i2 = 8;
                if (qxVar.CMh55RymNfS) {
                    qxVar.rQPn8YBR(hfVar);
                } else {
                    qxVar.K0ReC6MK();
                }
                l60.WRKkgoJXwDn(r2Var, qxVar, xqGvceK5x2);
                l60.WRKkgoJXwDn(r2Var2, qxVar, E7jCp8Ls3);
                if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK3))) {
                    mr0.XnEVoBF0td1l(M3K9sHhK3, qxVar, M3K9sHhK3, r2Var3);
                }
                l60.WRKkgoJXwDn(r2Var4, qxVar, MZhzXH724);
                int i4 = 8 | (i3 & 112);
                lvVar3 = lvVar;
                vc0.xqGvceK5x(new qs0[]{kg.GWasM1elztuh.GWasM1elztuh(new yb(j)), j81.GWasM1elztuh.GWasM1elztuh(y81Var)}, lvVar3, qxVar, i4);
                qxVar.WIEu4Ya2g8(true);
                z = false;
                qxVar.WIEu4Ya2g8(false);
            } else {
                lvVar3 = lvVar;
                z = false;
                i2 = 8;
                qxVar.MjxSquD6Av(-1013852841);
                qxVar.WIEu4Ya2g8(false);
            }
            if (lvVar2 != null) {
                qxVar.MjxSquD6Av(-1013804481);
                ie0 eUH21U3apd2 = qj.eUH21U3apd("dismissAction");
                bd0 xqGvceK5x3 = n7.xqGvceK5x(r6Var, z);
                int M3K9sHhK4 = fb1.M3K9sHhK(qxVar);
                cp0 E7jCp8Ls4 = qxVar.E7jCp8Ls();
                ie0 MZhzXH725 = n30.MZhzXH72(qxVar, eUH21U3apd2);
                qxVar.c4eaifQP();
                if (qxVar.CMh55RymNfS) {
                    qxVar.rQPn8YBR(hfVar);
                } else {
                    qxVar.K0ReC6MK();
                }
                l60.WRKkgoJXwDn(r2Var, qxVar, xqGvceK5x3);
                l60.WRKkgoJXwDn(r2Var2, qxVar, E7jCp8Ls4);
                if (qxVar.CMh55RymNfS || !o30.rQPn8YBR(qxVar.HFYAaqMd6(), Integer.valueOf(M3K9sHhK4))) {
                    mr0.XnEVoBF0td1l(M3K9sHhK4, qxVar, M3K9sHhK4, r2Var3);
                }
                l60.WRKkgoJXwDn(r2Var4, qxVar, MZhzXH725);
                j3 = j2;
                lvVar4 = lvVar2;
                vc0.X1lG3V04pd(kg.GWasM1elztuh.GWasM1elztuh(new yb(j3)), lvVar4, qxVar, i2 | ((i3 >> 3) & 112));
                z2 = true;
                qxVar.WIEu4Ya2g8(true);
                qxVar.WIEu4Ya2g8(false);
            } else {
                lvVar4 = lvVar2;
                j3 = j2;
                boolean z3 = z;
                z2 = true;
                qxVar.MjxSquD6Av(-1013535401);
                qxVar.WIEu4Ya2g8(z3);
            }
            qxVar.WIEu4Ya2g8(z2);
        } else {
            lvVar3 = lvVar;
            lvVar4 = lvVar2;
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            final lv lvVar5 = lvVar3;
            final lv lvVar6 = lvVar4;
            Mjvvu5DE.xqGvceK5x = new lv(lvVar5, lvVar6, y81Var, j, j3, i) { // from class: q31
                public final /* synthetic */ lv AvO7iQsrTN;
                public final /* synthetic */ lv EljAMC1QTz;
                public final /* synthetic */ long JFJ3QoxA;
                public final /* synthetic */ y81 encWxUiV2;
                public final /* synthetic */ long mOu10nynGul;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(1);
                    b70.X1lG3V04pd(jd.this, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, this.JFJ3QoxA, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static void XnEVoBF0td1l(StringBuilder sb, Object obj, hv hvVar) {
        if (hvVar != null) {
            sb.append((CharSequence) hvVar.mOu10nynGul(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final boolean Y6hRI1cF8(rt rtVar, rt rtVar2, int i, n2 n2Var) {
        if (eUH21U3apd(rtVar, rtVar2, i, n2Var)) {
            return true;
        }
        Boolean bool = (Boolean) p.cilMamHF(rtVar, i, new kl0(((nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner()).EljAMC1QTz(), rtVar, rtVar2, i, n2Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long YZjbz8VdP5(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        mo moVar = mo.NANOSECONDS;
        if (j4 >= 0) {
            return n30.MjxSquD6Av(j3, moVar);
        }
        mo moVar2 = mo.MILLISECONDS;
        if (moVar.compareTo(moVar2) >= 0) {
            return jo.X1lG3V04pd(arNh8D4Z5gB(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        k61 k61Var = jo.OOA6hdeuvCS;
        long MjxSquD6Av = n30.MjxSquD6Av(j5, moVar2);
        long MjxSquD6Av2 = n30.MjxSquD6Av(j6, moVar);
        int i = ((int) MjxSquD6Av) & 1;
        if (i != (((int) MjxSquD6Av2) & 1)) {
            return i == 1 ? jo.GWasM1elztuh(MjxSquD6Av >> 1, MjxSquD6Av2 >> 1) : jo.GWasM1elztuh(MjxSquD6Av2 >> 1, MjxSquD6Av >> 1);
        }
        if (i == 0) {
            long j7 = (MjxSquD6Av >> 1) + (MjxSquD6Av2 >> 1);
            if (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) {
                return n30.lv06NcmrQ(j7 / 1000000);
            }
            long j8 = j7 << 1;
            int i2 = lo.GWasM1elztuh;
            return j8;
        }
        long AvO7iQsrTN = n30.AvO7iQsrTN(MjxSquD6Av >> 1, MjxSquD6Av2 >> 1);
        if (AvO7iQsrTN == 9223372036854759646L) {
            o4.mE4lRynR("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (AvO7iQsrTN == 4611686018427387903L || AvO7iQsrTN == -4611686018427387903L) {
            return n30.lv06NcmrQ(AvO7iQsrTN);
        }
        if (-4611686018426L > AvO7iQsrTN || AvO7iQsrTN >= 4611686018427L) {
            return n30.lv06NcmrQ(o50.mOu10nynGul(AvO7iQsrTN));
        }
        long j9 = (AvO7iQsrTN * 1000000) << 1;
        int i3 = lo.GWasM1elztuh;
        return j9;
    }

    public static final void Yi7zF1RB1(fh0 fh0Var, iw0 iw0Var, jd jdVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(233973821);
        int i2 = 2;
        if ((((qxVar.encWxUiV2(fh0Var) ? 4 : 2) | i | (qxVar.encWxUiV2(iw0Var) ? 32 : 16)) & 147) == 146 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
        } else {
            vc0.xqGvceK5x(new qs0[]{eb0.GWasM1elztuh.GWasM1elztuh(fh0Var), za0.GWasM1elztuh.GWasM1elztuh(fh0Var), db0.GWasM1elztuh.GWasM1elztuh(fh0Var)}, rj0.YZjbz8VdP5(1808964477, new y8(i2, iw0Var, jdVar), qxVar), qxVar, 56);
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new xw(fh0Var, iw0Var, jdVar, i, 1);
        }
    }

    public static final long arNh8D4Z5gB(long j) {
        if (j < 0) {
            k61 k61Var = jo.OOA6hdeuvCS;
            return jo.AvO7iQsrTN;
        }
        k61 k61Var2 = jo.OOA6hdeuvCS;
        return jo.EljAMC1QTz;
    }

    public static Intent cilMamHF(Context context, ComponentName componentName) {
        String lv06NcmrQ = lv06NcmrQ(context, componentName);
        if (lv06NcmrQ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), lv06NcmrQ);
        return lv06NcmrQ(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean eUH21U3apd(rt rtVar, rt rtVar2, int i, n2 n2Var) {
        he0 he0Var;
        g60 eUH21U3apd;
        xj0 xj0Var;
        if (rtVar.bfDgRvRIg() != qt.EljAMC1QTz) {
            o4.jivtDDk9H("This function should only be used within a parent that has focus.");
            return false;
        }
        rt[] rtVarArr = new rt[16];
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitChildren called on an unattached node");
        }
        rg0 rg0Var = new rg0(new he0[16]);
        he0 he0Var2 = rtVar.OOA6hdeuvCS;
        he0 he0Var3 = he0Var2.JFJ3QoxA;
        if (he0Var3 == null) {
            vc0.mOu10nynGul(rg0Var, he0Var2);
        } else {
            rg0Var.Yi7zF1RB1(he0Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = rg0Var.AvO7iQsrTN;
            he0Var = null;
            if (i3 == 0) {
                break;
            }
            he0 he0Var4 = (he0) rg0Var.rQPn8YBR(i3 - 1);
            if ((he0Var4.encWxUiV2 & 1024) == 0) {
                vc0.mOu10nynGul(rg0Var, he0Var4);
            } else {
                while (true) {
                    if (he0Var4 == null) {
                        break;
                    }
                    if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                        rg0 rg0Var2 = null;
                        while (he0Var4 != null) {
                            if (he0Var4 instanceof rt) {
                                rt rtVar3 = (rt) he0Var4;
                                int i4 = i2 + 1;
                                if (rtVarArr.length < i4) {
                                    int length = rtVarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(rtVarArr, 0, r11, 0, length);
                                    rtVarArr = r11;
                                }
                                rtVarArr[i2] = rtVar3;
                                i2 = i4;
                            } else if ((he0Var4.AvO7iQsrTN & 1024) != 0 && (he0Var4 instanceof yk)) {
                                int i5 = 0;
                                for (he0 he0Var5 = ((yk) he0Var4).jivtDDk9H; he0Var5 != null; he0Var5 = he0Var5.JFJ3QoxA) {
                                    if ((he0Var5.AvO7iQsrTN & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            he0Var4 = he0Var5;
                                        } else {
                                            if (rg0Var2 == null) {
                                                rg0Var2 = new rg0(new he0[16]);
                                            }
                                            if (he0Var4 != null) {
                                                rg0Var2.Yi7zF1RB1(he0Var4);
                                                he0Var4 = null;
                                            }
                                            rg0Var2.Yi7zF1RB1(he0Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            he0Var4 = vc0.E7jCp8Ls(rg0Var2);
                        }
                    } else {
                        he0Var4 = he0Var4.JFJ3QoxA;
                    }
                }
            }
        }
        Arrays.sort(rtVarArr, 0, i2, st.Yi7zF1RB1);
        if (i != 1) {
            if (i != 2) {
                o4.jivtDDk9H("This function should only be used for 1-D focus search");
                return false;
            }
            x20 MZhzXH72 = o50.MZhzXH72(0, i2);
            int i6 = MZhzXH72.OOA6hdeuvCS;
            int i7 = MZhzXH72.EljAMC1QTz;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        rt rtVar4 = rtVarArr[i7];
                        if (qj.YZjbz8VdP5(rtVar4) && iwATDS1i01k(rtVar4, n2Var)) {
                            break;
                        }
                    }
                    if (o30.rQPn8YBR(rtVarArr[i7], rtVar2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
                }
                he0 he0Var6 = rtVar.OOA6hdeuvCS.mOu10nynGul;
                eUH21U3apd = vc0.eUH21U3apd(rtVar);
                loop5: while (true) {
                    if (eUH21U3apd == null) {
                    }
                }
                if (he0Var != null) {
                }
            }
            return false;
        }
        x20 MZhzXH722 = o50.MZhzXH72(0, i2);
        int i8 = MZhzXH722.OOA6hdeuvCS;
        int i9 = MZhzXH722.EljAMC1QTz;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    rt rtVar5 = rtVarArr[i8];
                    if (qj.YZjbz8VdP5(rtVar5) && jivtDDk9H(rtVar5, n2Var)) {
                        break;
                    }
                }
                if (o30.rQPn8YBR(rtVarArr[i8], rtVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && rtVar.XmVeRDAr().GWasM1elztuh) {
            if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitAncestors called on an unattached node");
            }
            he0 he0Var62 = rtVar.OOA6hdeuvCS.mOu10nynGul;
            eUH21U3apd = vc0.eUH21U3apd(rtVar);
            loop5: while (true) {
                if (eUH21U3apd == null) {
                    break;
                }
                if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                    while (he0Var62 != null) {
                        if ((he0Var62.AvO7iQsrTN & 1024) != 0) {
                            he0 he0Var7 = he0Var62;
                            rg0 rg0Var3 = null;
                            while (he0Var7 != null) {
                                if (he0Var7 instanceof rt) {
                                    he0Var = he0Var7;
                                    break loop5;
                                }
                                if ((he0Var7.AvO7iQsrTN & 1024) != 0 && (he0Var7 instanceof yk)) {
                                    int i10 = 0;
                                    for (he0 he0Var8 = ((yk) he0Var7).jivtDDk9H; he0Var8 != null; he0Var8 = he0Var8.JFJ3QoxA) {
                                        if ((he0Var8.AvO7iQsrTN & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                he0Var7 = he0Var8;
                                            } else {
                                                if (rg0Var3 == null) {
                                                    rg0Var3 = new rg0(new he0[16]);
                                                }
                                                if (he0Var7 != null) {
                                                    rg0Var3.Yi7zF1RB1(he0Var7);
                                                    he0Var7 = null;
                                                }
                                                rg0Var3.Yi7zF1RB1(he0Var8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                he0Var7 = vc0.E7jCp8Ls(rg0Var3);
                            }
                        }
                        he0Var62 = he0Var62.mOu10nynGul;
                    }
                }
                eUH21U3apd = eUH21U3apd.cilMamHF();
                he0Var62 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
            }
            if (he0Var != null) {
                return ((Boolean) n2Var.mOu10nynGul(rtVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Object[] encWxUiV2(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        d5.mqNvfisv7(objArr, objArr2, 0, i, 6);
        d5.Fm8W7vP7q(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean iwATDS1i01k(rt rtVar, n2 n2Var) {
        int ordinal = rtVar.bfDgRvRIg().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                rt cilMamHF = qj.cilMamHF(rtVar);
                if (cilMamHF == null) {
                    o4.jivtDDk9H("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = cilMamHF.bfDgRvRIg().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                o4.xqGvceK5x();
                                return false;
                            }
                            o4.jivtDDk9H("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (iwATDS1i01k(cilMamHF, n2Var) || Y6hRI1cF8(rtVar, cilMamHF, 2, n2Var) || (cilMamHF.XmVeRDAr().GWasM1elztuh && ((Boolean) n2Var.mOu10nynGul(cilMamHF)).booleanValue())) {
                        return true;
                    }
                }
                return Y6hRI1cF8(rtVar, cilMamHF, 2, n2Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    o4.xqGvceK5x();
                    return false;
                }
                if (!M3K9sHhK(rtVar, n2Var)) {
                    if (!(rtVar.XmVeRDAr().GWasM1elztuh ? ((Boolean) n2Var.mOu10nynGul(rtVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return M3K9sHhK(rtVar, n2Var);
    }

    public static final boolean jivtDDk9H(rt rtVar, n2 n2Var) {
        int ordinal = rtVar.bfDgRvRIg().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                rt cilMamHF = qj.cilMamHF(rtVar);
                if (cilMamHF != null) {
                    return jivtDDk9H(cilMamHF, n2Var) || Y6hRI1cF8(rtVar, cilMamHF, 1, n2Var);
                }
                o4.jivtDDk9H("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return rtVar.XmVeRDAr().GWasM1elztuh ? ((Boolean) n2Var.mOu10nynGul(rtVar)).booleanValue() : k8h8IjolWQ(rtVar, n2Var);
                }
                o4.xqGvceK5x();
                return false;
            }
        }
        return k8h8IjolWQ(rtVar, n2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean k8h8IjolWQ(rt rtVar, n2 n2Var) {
        rt[] rtVarArr = new rt[16];
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitChildren called on an unattached node");
        }
        rg0 rg0Var = new rg0(new he0[16]);
        he0 he0Var = rtVar.OOA6hdeuvCS;
        he0 he0Var2 = he0Var.JFJ3QoxA;
        if (he0Var2 == null) {
            vc0.mOu10nynGul(rg0Var, he0Var);
        } else {
            rg0Var.Yi7zF1RB1(he0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = rg0Var.AvO7iQsrTN;
            if (i2 == 0) {
                break;
            }
            he0 he0Var3 = (he0) rg0Var.rQPn8YBR(i2 - 1);
            if ((he0Var3.encWxUiV2 & 1024) == 0) {
                vc0.mOu10nynGul(rg0Var, he0Var3);
            } else {
                while (true) {
                    if (he0Var3 == null) {
                        break;
                    }
                    if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                        rg0 rg0Var2 = null;
                        while (he0Var3 != null) {
                            if (he0Var3 instanceof rt) {
                                rt rtVar2 = (rt) he0Var3;
                                int i3 = i + 1;
                                if (rtVarArr.length < i3) {
                                    int length = rtVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(rtVarArr, 0, r10, 0, length);
                                    rtVarArr = r10;
                                }
                                rtVarArr[i] = rtVar2;
                                i = i3;
                            } else if ((he0Var3.AvO7iQsrTN & 1024) != 0 && (he0Var3 instanceof yk)) {
                                int i4 = 0;
                                for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                    if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            he0Var3 = he0Var4;
                                        } else {
                                            if (rg0Var2 == null) {
                                                rg0Var2 = new rg0(new he0[16]);
                                            }
                                            if (he0Var3 != null) {
                                                rg0Var2.Yi7zF1RB1(he0Var3);
                                                he0Var3 = null;
                                            }
                                            rg0Var2.Yi7zF1RB1(he0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            he0Var3 = vc0.E7jCp8Ls(rg0Var2);
                        }
                    } else {
                        he0Var3 = he0Var3.JFJ3QoxA;
                    }
                }
            }
        }
        Arrays.sort(rtVarArr, 0, i, st.Yi7zF1RB1);
        for (int i5 = 0; i5 < i; i5++) {
            rt rtVar3 = rtVarArr[i5];
            if (qj.YZjbz8VdP5(rtVar3) && jivtDDk9H(rtVar3, n2Var)) {
                return true;
            }
        }
        return false;
    }

    public static String lv06NcmrQ(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static String mE4lRynR(c9 c9Var) {
        StringBuilder sb = new StringBuilder(c9Var.size());
        for (int i = 0; i < c9Var.size(); i++) {
            byte GWasM1elztuh2 = c9Var.GWasM1elztuh(i);
            if (GWasM1elztuh2 == 34) {
                sb.append("\\\"");
            } else if (GWasM1elztuh2 == 39) {
                sb.append("\\'");
            } else if (GWasM1elztuh2 != 92) {
                switch (GWasM1elztuh2) {
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (GWasM1elztuh2 < 32 || GWasM1elztuh2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((GWasM1elztuh2 >>> 6) & 3) + 48));
                            sb.append((char) (((GWasM1elztuh2 >>> 3) & 7) + 48));
                            sb.append((char) ((GWasM1elztuh2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) GWasM1elztuh2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Object[] mOu10nynGul(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        d5.mqNvfisv7(objArr, objArr2, 0, i, 6);
        d5.Fm8W7vP7q(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final boolean ozMwhSAI(hg0 hg0Var, Object obj, Object obj2) {
        Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(obj);
        if (AvO7iQsrTN == null) {
            return false;
        }
        if (!(AvO7iQsrTN instanceof ig0)) {
            if (!AvO7iQsrTN.equals(obj2)) {
                return false;
            }
            hg0Var.rQPn8YBR(obj);
            return true;
        }
        ig0 ig0Var = (ig0) AvO7iQsrTN;
        boolean E7jCp8Ls = ig0Var.E7jCp8Ls(obj2);
        if (E7jCp8Ls && ig0Var.AvO7iQsrTN()) {
            hg0Var.rQPn8YBR(obj);
        }
        return E7jCp8Ls;
    }

    public static cd0 pog2g9KITJA(wv0 wv0Var, int i, int i2, int i3, int i4, int i5, dd0 dd0Var, List list, up0[] up0VarArr, int i6) {
        int i7;
        float f;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        List list2 = list;
        long j2 = i5;
        int[] iArr = new int[i6];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        float f2 = 0.0f;
        while (i13 < i6) {
            wc0 wc0Var = (wc0) list2.get(i13);
            float iwATDS1i01k = w60.iwATDS1i01k(w60.uFEq9NpZ(wc0Var));
            if (iwATDS1i01k > 0.0f) {
                f2 += iwATDS1i01k;
                i14++;
                j = j2;
                i9 = i13;
            } else {
                int i17 = i3 - i15;
                up0 up0Var = up0VarArr[i13];
                j = j2;
                if (up0Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i9 = i13;
                        i10 = i14;
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i9 = i13;
                        i10 = i14;
                        i11 = i17 < 0 ? 0 : i17;
                    }
                    up0Var = wc0Var.OOA6hdeuvCS(wv0Var.OOA6hdeuvCS(0, i11, i4, false));
                } else {
                    i9 = i13;
                    i10 = i14;
                }
                up0 up0Var2 = up0Var;
                int mOu10nynGul = wv0Var.mOu10nynGul(up0Var2);
                int EljAMC1QTz = wv0Var.EljAMC1QTz(up0Var2);
                iArr[i9] = mOu10nynGul;
                int i18 = i17 - mOu10nynGul;
                if (i18 < 0) {
                    i18 = 0;
                }
                i16 = Math.min(i5, i18);
                i15 += mOu10nynGul + i16;
                i12 = Math.max(i12, EljAMC1QTz);
                up0VarArr[i9] = up0Var2;
                i14 = i10;
            }
            i13 = i9 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i14 == 0) {
            i15 -= i16;
            i7 = 0;
        } else {
            long j4 = (r21 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i15) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i19 = 0; i19 < i6; i19++) {
                j5 -= Math.round(w60.iwATDS1i01k(w60.uFEq9NpZ((wc0) list2.get(i19))) * f3);
            }
            int i20 = i12;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i6) {
                if (up0VarArr[i21] == null) {
                    wc0 wc0Var2 = (wc0) list2.get(i21);
                    xv0 uFEq9NpZ = w60.uFEq9NpZ(wc0Var2);
                    float iwATDS1i01k2 = w60.iwATDS1i01k(uFEq9NpZ);
                    if (iwATDS1i01k2 <= 0.0f) {
                        r10.Yi7zF1RB1("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int signum = Long.signum(j5);
                    j5 -= signum;
                    int max = Math.max(0, Math.round(iwATDS1i01k2 * f) + signum);
                    if ((uFEq9NpZ != null ? uFEq9NpZ.Yi7zF1RB1 : true) && max != Integer.MAX_VALUE) {
                        i8 = max;
                        up0 OOA6hdeuvCS = wc0Var2.OOA6hdeuvCS(wv0Var.OOA6hdeuvCS(i8, max, i4, true));
                        int mOu10nynGul2 = wv0Var.mOu10nynGul(OOA6hdeuvCS);
                        int EljAMC1QTz2 = wv0Var.EljAMC1QTz(OOA6hdeuvCS);
                        iArr[i21] = mOu10nynGul2;
                        i22 += mOu10nynGul2;
                        int max2 = Math.max(i20, EljAMC1QTz2);
                        up0VarArr[i21] = OOA6hdeuvCS;
                        i20 = max2;
                    }
                    i8 = 0;
                    up0 OOA6hdeuvCS2 = wc0Var2.OOA6hdeuvCS(wv0Var.OOA6hdeuvCS(i8, max, i4, true));
                    int mOu10nynGul22 = wv0Var.mOu10nynGul(OOA6hdeuvCS2);
                    int EljAMC1QTz22 = wv0Var.EljAMC1QTz(OOA6hdeuvCS2);
                    iArr[i21] = mOu10nynGul22;
                    i22 += mOu10nynGul22;
                    int max22 = Math.max(i20, EljAMC1QTz22);
                    up0VarArr[i21] = OOA6hdeuvCS2;
                    i20 = max22;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (i22 + j4);
            int i23 = i3 - i15;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i23) {
                i7 = i23;
            }
            i12 = i20;
        }
        int i24 = i7 + i15;
        if (i24 < 0) {
            i24 = 0;
        }
        int max3 = Math.max(i24, i);
        int max4 = Math.max(i12, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        wv0Var.X1lG3V04pd(max3, dd0Var, iArr, iArr2);
        return wv0Var.GWasM1elztuh(up0VarArr, dd0Var, iArr2, max3, max4);
    }

    public static final void rQPn8YBR(qf0 qf0Var, int i) {
        if (qf0Var.Yi7zF1RB1 == 0 || !(qf0Var.Yi7zF1RB1(0) == i || qf0Var.Yi7zF1RB1(qf0Var.Yi7zF1RB1 - 1) == i)) {
            int i2 = qf0Var.Yi7zF1RB1;
            qf0Var.GWasM1elztuh(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int Yi7zF1RB1 = qf0Var.Yi7zF1RB1(i3);
                if (i <= Yi7zF1RB1) {
                    break;
                }
                qf0Var.xqGvceK5x(i2, Yi7zF1RB1);
                i2 = i3;
            }
            qf0Var.xqGvceK5x(i2, i);
        }
    }

    public static final String rezfBrjOrqK(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void uFEq9NpZ(we1 we1Var, d dVar, w90 w90Var) {
        dVar.getClass();
        w90Var.getClass();
        qw0 qw0Var = (qw0) we1Var.X1lG3V04pd("androidx.lifecycle.savedstate.vm.tag");
        if (qw0Var == null || qw0Var.AvO7iQsrTN) {
            return;
        }
        qw0Var.xqGvceK5x(dVar, w90Var);
        m90 m90Var = w90Var.encWxUiV2;
        if (m90Var == m90.EljAMC1QTz || m90Var.compareTo(m90.encWxUiV2) >= 0) {
            dVar.Y6hRI1cF8();
        } else {
            w90Var.GWasM1elztuh(new ok(dVar, w90Var));
        }
    }

    public static final void xqGvceK5x(iw0 iw0Var, jd jdVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(832919318);
        int i2 = (qxVar.encWxUiV2(iw0Var) ? 4 : 2) | i | (qxVar.encWxUiV2(jdVar) ? 32 : 16);
        if ((i2 & 19) == 18 && qxVar.pog2g9KITJA()) {
            qxVar.YXi2hvwn7WL();
        } else {
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new bCsSzSHkbaQ(26);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            hv hvVar = (hv) HFYAaqMd6;
            ff1 GWasM1elztuh2 = eb0.GWasM1elztuh(qxVar);
            if (GWasM1elztuh2 == null) {
                o4.jivtDDk9H("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            va GWasM1elztuh3 = st0.GWasM1elztuh(a6.class);
            q10 q10Var = new q10(0);
            q10Var.GWasM1elztuh(st0.GWasM1elztuh(a6.class), hvVar);
            p10 Yi7zF1RB1 = q10Var.Yi7zF1RB1();
            xh xqGvceK5x = GWasM1elztuh2 instanceof hz ? ((hz) GWasM1elztuh2).xqGvceK5x() : vh.Yi7zF1RB1;
            xqGvceK5x.getClass();
            rx0 rx0Var = new rx0(GWasM1elztuh2.OOA6hdeuvCS(), Yi7zF1RB1, xqGvceK5x);
            String GWasM1elztuh4 = GWasM1elztuh3.GWasM1elztuh();
            if (GWasM1elztuh4 == null) {
                o4.mE4lRynR("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                a6 a6Var = (a6) rx0Var.YmKjaVtbfp5Z(GWasM1elztuh3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(GWasM1elztuh4));
                a6Var.xqGvceK5x = new lf1(iw0Var);
                iw0Var.Yi7zF1RB1(a6Var.X1lG3V04pd, jdVar, qxVar, ((i2 << 6) & 896) | (i2 & 112));
            }
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(iw0Var, jdVar, i);
        }
    }

    public abstract void DmJncFq5(boolean z);

    public abstract int Mjvvu5DE(String str, byte[] bArr, int i, int i2);

    public abstract String YmKjaVtbfp5Z(byte[] bArr, int i, int i2);

    public void MZhzXH72(boolean z) {
    }
}
