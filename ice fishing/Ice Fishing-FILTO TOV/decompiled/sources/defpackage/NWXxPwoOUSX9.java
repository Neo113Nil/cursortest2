package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class NWXxPwoOUSX9 extends h50 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NWXxPwoOUSX9(j6IIN2O8eOU j6iin2o8eou, gn gnVar, nt0 nt0Var) {
        super(1);
        this.EljAMC1QTz = 9;
        this.AvO7iQsrTN = nt0Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        ua1 ua1Var = ua1.EljAMC1QTz;
        ua1 ua1Var2 = ua1.OOA6hdeuvCS;
        int i2 = 1;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                NsRGN7gRqWF nsRGN7gRqWF = (NsRGN7gRqWF) obj;
                h60 h60Var = (h60) obj2;
                if (nsRGN7gRqWF.VeqTn1PQw7() != Integer.MAX_VALUE) {
                    if (nsRGN7gRqWF.GWasM1elztuh().Yi7zF1RB1) {
                        nsRGN7gRqWF.WRKkgoJXwDn();
                    }
                    for (Map.Entry entry : nsRGN7gRqWF.GWasM1elztuh().mOu10nynGul.entrySet()) {
                        h60.GWasM1elztuh(h60Var, (iK7aQfvhG) entry.getKey(), ((Number) entry.getValue()).intValue(), nsRGN7gRqWF.iwATDS1i01k());
                    }
                    bk0 bk0Var = nsRGN7gRqWF.iwATDS1i01k().Y6hRI1cF8;
                    bk0Var.getClass();
                    while (!bk0Var.equals(h60Var.GWasM1elztuh.iwATDS1i01k())) {
                        for (iK7aQfvhG ik7aqfvhg : h60Var.Yi7zF1RB1(bk0Var).keySet()) {
                            h60.GWasM1elztuh(h60Var, ik7aqfvhg, h60Var.X1lG3V04pd(bk0Var, ik7aqfvhg), bk0Var);
                        }
                        bk0Var = bk0Var.Y6hRI1cF8;
                        bk0Var.getClass();
                    }
                }
                return kc1Var;
            case 1:
                return Boolean.valueOf(((rt) obj).d5idzIhj55b(((dt) obj2).GWasM1elztuh));
            case 2:
                rb0 rb0Var = (rb0) obj;
                c cVar = ((PCrRnrghk5) obj2).jivtDDk9H;
                if (cVar.getInsetsListener().rQPn8YBR.AvO7iQsrTN() > 0) {
                    rf0 rf0Var = fh1.GWasM1elztuh;
                    rb0Var.OOA6hdeuvCS = true;
                    ub0 ub0Var = rb0Var.encWxUiV2;
                    n50 vaTCmWUgXF = ub0Var.vaTCmWUgXF();
                    if (u20.GWasM1elztuh(rb0Var.EljAMC1QTz, 9223372034707292159L)) {
                        rb0Var.EljAMC1QTz = qj.dqB83aoLBB(vaTCmWUgXF.X1lG3V04pd(0L));
                        rb0Var.AvO7iQsrTN = vaTCmWUgXF.DmJncFq5();
                    }
                    ub0Var.bCsSzSHkbaQ().MZhzXH72.Yi7zF1RB1();
                    long DmJncFq5 = vaTCmWUgXF.DmJncFq5();
                    hg0 hg0Var = cVar.getInsetsListener().JFJ3QoxA;
                    int i3 = (int) (DmJncFq5 >> 32);
                    int i4 = (int) (DmJncFq5 & 4294967295L);
                    for (dh1 dh1Var : fh1.Yi7zF1RB1) {
                        Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(dh1Var);
                        AvO7iQsrTN.getClass();
                        th1 th1Var = (th1) AvO7iQsrTN;
                        fh1.GWasM1elztuh(rb0Var, ((eh1) dh1Var).X1lG3V04pd, th1Var.encWxUiV2, i3, i4);
                        if (((Boolean) th1Var.Yi7zF1RB1.getValue()).booleanValue()) {
                            fh1.GWasM1elztuh(rb0Var, th1Var.EljAMC1QTz, th1Var.JFJ3QoxA, i3, i4);
                            fh1.GWasM1elztuh(rb0Var, th1Var.AvO7iQsrTN, th1Var.rQPn8YBR, i3, i4);
                        }
                        fh1.GWasM1elztuh(rb0Var, ((eh1) dh1Var).xqGvceK5x, th1Var.mOu10nynGul, i3, i4);
                    }
                    ag0 ag0Var = cVar.getInsetsListener().E7jCp8Ls;
                    if (ag0Var.mOu10nynGul()) {
                        p41 p41Var = cVar.getInsetsListener().XnEVoBF0td1l;
                        Object[] objArr = ag0Var.GWasM1elztuh;
                        int i5 = ag0Var.Yi7zF1RB1;
                        for (int i6 = 0; i6 < i5; i6++) {
                            mg0 mg0Var = (mg0) objArr[i6];
                            a20 a20Var = (a20) p41Var.get(i6);
                            Rect rect = (Rect) mg0Var.getValue();
                            rb0Var.GWasM1elztuh(a20Var.Yi7zF1RB1(), rect.left);
                            rb0Var.GWasM1elztuh(a20Var.xqGvceK5x(), rect.top);
                            rb0Var.GWasM1elztuh(a20Var.X1lG3V04pd(), rect.right);
                            rb0Var.GWasM1elztuh(a20Var.GWasM1elztuh(), rect.bottom);
                        }
                    }
                }
                return kc1Var;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(((s20) obj2).GWasM1elztuh(((d01) obj).EljAMC1QTz));
            case 4:
                return Boolean.valueOf(n30.JFJ3QoxA((d01) obj, (Resources) obj2));
            case 5:
                return Boolean.valueOf(o30.rQPn8YBR(obj, obj2));
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                q3 q3Var = (q3) obj;
                float f = q3Var.Yi7zF1RB1;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = q3Var.X1lG3V04pd;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = q3Var.xqGvceK5x;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = q3Var.GWasM1elztuh;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new yb(yb.GWasM1elztuh(ki1.Yi7zF1RB1(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, jc.WdrkLMV3xh), (gc) obj2));
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return kc1Var;
            case 8:
                return new z(i2, (vm) obj2);
            case 9:
                gn gnVar = (gn) obj;
                if (!gnVar.Mjvvu5DE) {
                    return ua1Var;
                }
                if (gnVar.jivtDDk9H != null) {
                    t10.Yi7zF1RB1("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gnVar.jivtDDk9H = null;
                nt0 nt0Var = (nt0) obj2;
                nt0Var.OOA6hdeuvCS = nt0Var.OOA6hdeuvCS;
                return ua1Var2;
            case 10:
                gn gnVar2 = (gn) obj;
                if (!gnVar2.OOA6hdeuvCS.Mjvvu5DE) {
                    return ua1Var;
                }
                gn gnVar3 = gnVar2.jivtDDk9H;
                if (gnVar3 != null) {
                    NWXxPwoOUSX9 nWXxPwoOUSX9 = new NWXxPwoOUSX9(10, (j6IIN2O8eOU) obj2);
                    if (nWXxPwoOUSX9.mOu10nynGul(gnVar3) == ua1Var2) {
                        w60.M3K9sHhK(gnVar3, nWXxPwoOUSX9);
                    }
                }
                gnVar2.jivtDDk9H = null;
                gnVar2.mE4lRynR = null;
                return ua1Var2;
            case 11:
                if (ky.Yi7zF1RB1.compareAndSet(false, true)) {
                    ((n8) obj2).mE4lRynR(kc1Var);
                }
                return kc1Var;
            case 12:
                ho hoVar = (ho) obj;
                oy oyVar = (oy) obj2;
                h1 h1Var = oyVar.E7jCp8Ls;
                if (oyVar.uFEq9NpZ && oyVar.lv06NcmrQ && h1Var != null) {
                    f4 arNh8D4Z5gB = hoVar.arNh8D4Z5gB();
                    long mOu10nynGul = arNh8D4Z5gB.mOu10nynGul();
                    arNh8D4Z5gB.EljAMC1QTz().E7jCp8Ls();
                    try {
                        ((f4) ((j6IIN2O8eOU) arNh8D4Z5gB.Yi7zF1RB1).EljAMC1QTz).EljAMC1QTz().Mjvvu5DE(h1Var);
                        oyVar.X1lG3V04pd(hoVar);
                    } finally {
                        arNh8D4Z5gB.EljAMC1QTz().JFJ3QoxA();
                        arNh8D4Z5gB.jivtDDk9H(mOu10nynGul);
                    }
                } else {
                    oyVar.X1lG3V04pd(hoVar);
                }
                return kc1Var;
            case 13:
                ho hoVar2 = (ho) obj;
                s9 EljAMC1QTz = hoVar2.arNh8D4Z5gB().EljAMC1QTz();
                lv lvVar = ((ry) obj2).encWxUiV2;
                if (lvVar != null) {
                    lvVar.EljAMC1QTz(EljAMC1QTz, (oy) hoVar2.arNh8D4Z5gB().X1lG3V04pd);
                }
                return kc1Var;
            case 14:
                id1 id1Var = (id1) obj;
                yy yyVar = (yy) obj2;
                yyVar.AvO7iQsrTN(id1Var);
                hv hvVar = yyVar.mOu10nynGul;
                if (hvVar != null) {
                    hvVar.mOu10nynGul(id1Var);
                }
                return kc1Var;
            case Side.ALL /* 15 */:
                ((rg0) obj2).Yi7zF1RB1((ge0) obj);
                return Boolean.TRUE;
            case 16:
                j01.GWasM1elztuh((l01) obj, ((ov0) obj2).GWasM1elztuh);
                return kc1Var;
            case 17:
                u40[] u40VarArr = j01.GWasM1elztuh;
                ((l01) obj).GWasM1elztuh(h01.GWasM1elztuh, fb1.HFYAaqMd6((String) obj2));
                return kc1Var;
            case 18:
                ((List) obj).add((Float) ((e80) obj2).GWasM1elztuh());
                return true;
            case 19:
                yu0 yu0Var = (yu0) obj;
                n21 n21Var = (n21) obj2;
                yu0Var.OOA6hdeuvCS(n21Var.mE4lRynR);
                yu0Var.EljAMC1QTz(n21Var.jivtDDk9H);
                yu0Var.X1lG3V04pd(n21Var.Y6hRI1cF8);
                float f8 = n21Var.cilMamHF;
                if (yu0Var.mOu10nynGul != f8) {
                    yu0Var.OOA6hdeuvCS |= 32;
                    yu0Var.mOu10nynGul = f8;
                }
                float f9 = n21Var.lv06NcmrQ;
                if (yu0Var.E7jCp8Ls != f9) {
                    yu0Var.OOA6hdeuvCS |= 2048;
                    yu0Var.E7jCp8Ls = f9;
                }
                yu0Var.AvO7iQsrTN(n21Var.WdrkLMV3xh);
                z11 z11Var = n21Var.WRKkgoJXwDn;
                if (!o30.rQPn8YBR(yu0Var.uFEq9NpZ, z11Var)) {
                    yu0Var.OOA6hdeuvCS |= 8192;
                    yu0Var.uFEq9NpZ = z11Var;
                }
                boolean z = n21Var.arNh8D4Z5gB;
                if (yu0Var.iwATDS1i01k != z) {
                    yu0Var.OOA6hdeuvCS |= 16384;
                    yu0Var.iwATDS1i01k = z;
                }
                long j = n21Var.pog2g9KITJA;
                if (!yb.X1lG3V04pd(yu0Var.JFJ3QoxA, j)) {
                    yu0Var.OOA6hdeuvCS |= 64;
                    yu0Var.JFJ3QoxA = j;
                }
                long j2 = n21Var.M3K9sHhK;
                if (!yb.X1lG3V04pd(yu0Var.rQPn8YBR, j2)) {
                    yu0Var.OOA6hdeuvCS |= 128;
                    yu0Var.rQPn8YBR = j2;
                }
                int i7 = n21Var.k8h8IjolWQ;
                if (yu0Var.mE4lRynR != i7) {
                    yu0Var.OOA6hdeuvCS |= 524288;
                    yu0Var.mE4lRynR = i7;
                }
                return kc1Var;
            default:
                Throwable th = (Throwable) obj;
                g71 g71Var = (g71) obj2;
                n9 n9Var = g71Var.AvO7iQsrTN;
                if (n9Var != null) {
                    n9Var.rQPn8YBR(th);
                }
                g71Var.AvO7iQsrTN = null;
                return kc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NWXxPwoOUSX9(int i, Object obj) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
    }
}
