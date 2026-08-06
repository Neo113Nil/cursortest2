package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h60 {
    public boolean AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public final NsRGN7gRqWF GWasM1elztuh;
    public final /* synthetic */ int JFJ3QoxA;
    public boolean OOA6hdeuvCS;
    public boolean X1lG3V04pd;
    public NsRGN7gRqWF encWxUiV2;
    public boolean xqGvceK5x;
    public boolean Yi7zF1RB1 = true;
    public final HashMap mOu10nynGul = new HashMap();

    public h60(NsRGN7gRqWF nsRGN7gRqWF, int i) {
        this.JFJ3QoxA = i;
        this.GWasM1elztuh = nsRGN7gRqWF;
    }

    public static final void GWasM1elztuh(h60 h60Var, iK7aQfvhG ik7aqfvhg, int i, bk0 bk0Var) {
        HashMap hashMap = h60Var.mOu10nynGul;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (h60Var.JFJ3QoxA) {
                    case 0:
                        fn0 fn0Var = bk0Var.VeqTn1PQw7;
                        if (fn0Var != null) {
                            ry ryVar = (ry) fn0Var;
                            float[] Yi7zF1RB1 = ryVar.Yi7zF1RB1();
                            if (!ryVar.lv06NcmrQ) {
                                j = z50.lv06NcmrQ(Yi7zF1RB1, j);
                            }
                        }
                        j = qj.rezfBrjOrqK(j, bk0Var.EXrPz3p7hFb);
                        break;
                    default:
                        wb0 P4U4zqyW7wx = bk0Var.P4U4zqyW7wx();
                        P4U4zqyW7wx.getClass();
                        long j2 = P4U4zqyW7wx.jivtDDk9H;
                        j = uk0.OOA6hdeuvCS((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                bk0Var = bk0Var.Y6hRI1cF8;
                bk0Var.getClass();
                if (bk0Var.equals(h60Var.GWasM1elztuh.iwATDS1i01k())) {
                    int round = Math.round(ik7aqfvhg instanceof qz ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(ik7aqfvhg)) {
                        hashMap.getClass();
                        Object obj = hashMap.get(ik7aqfvhg);
                        if (obj == null && !hashMap.containsKey(ik7aqfvhg)) {
                            throw new NoSuchElementException("Key " + ik7aqfvhg + " is missing in the map.");
                        }
                        int intValue = ((Number) obj).intValue();
                        qz qzVar = d6sfifL1.GWasM1elztuh;
                        round = ((Number) ik7aqfvhg.GWasM1elztuh.EljAMC1QTz(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(ik7aqfvhg, Integer.valueOf(round));
                    return;
                }
            } while (!h60Var.Yi7zF1RB1(bk0Var).containsKey(ik7aqfvhg));
            float X1lG3V04pd = h60Var.X1lG3V04pd(bk0Var, ik7aqfvhg);
            long floatToRawIntBits3 = Float.floatToRawIntBits(X1lG3V04pd);
            long floatToRawIntBits4 = Float.floatToRawIntBits(X1lG3V04pd);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final void AvO7iQsrTN() {
        HashMap hashMap = this.mOu10nynGul;
        hashMap.clear();
        NWXxPwoOUSX9 nWXxPwoOUSX9 = new NWXxPwoOUSX9(0, this);
        NsRGN7gRqWF nsRGN7gRqWF = this.GWasM1elztuh;
        nsRGN7gRqWF.rQPn8YBR(nWXxPwoOUSX9);
        hashMap.putAll(Yi7zF1RB1(nsRGN7gRqWF.iwATDS1i01k()));
        this.Yi7zF1RB1 = false;
    }

    public final void EljAMC1QTz() {
        this.Yi7zF1RB1 = true;
        NsRGN7gRqWF nsRGN7gRqWF = this.GWasM1elztuh;
        NsRGN7gRqWF lv06NcmrQ = nsRGN7gRqWF.lv06NcmrQ();
        if (lv06NcmrQ == null) {
            return;
        }
        if (this.X1lG3V04pd) {
            lv06NcmrQ.YXi2hvwn7WL();
        } else if (this.OOA6hdeuvCS || this.xqGvceK5x) {
            lv06NcmrQ.requestLayout();
        }
        if (this.EljAMC1QTz) {
            nsRGN7gRqWF.YXi2hvwn7WL();
        }
        if (this.AvO7iQsrTN) {
            nsRGN7gRqWF.requestLayout();
        }
        lv06NcmrQ.GWasM1elztuh().EljAMC1QTz();
    }

    public final boolean OOA6hdeuvCS() {
        encWxUiV2();
        return this.encWxUiV2 != null;
    }

    public final int X1lG3V04pd(bk0 bk0Var, iK7aQfvhG ik7aqfvhg) {
        switch (this.JFJ3QoxA) {
            case 0:
                return bk0Var.mqNvfisv7(ik7aqfvhg);
            default:
                wb0 P4U4zqyW7wx = bk0Var.P4U4zqyW7wx();
                P4U4zqyW7wx.getClass();
                return P4U4zqyW7wx.mqNvfisv7(ik7aqfvhg);
        }
    }

    public final Map Yi7zF1RB1(bk0 bk0Var) {
        switch (this.JFJ3QoxA) {
            case 0:
                return bk0Var.gHe2tSmr6w().GWasM1elztuh();
            default:
                wb0 P4U4zqyW7wx = bk0Var.P4U4zqyW7wx();
                P4U4zqyW7wx.getClass();
                return P4U4zqyW7wx.gHe2tSmr6w().GWasM1elztuh();
        }
    }

    public final void encWxUiV2() {
        h60 GWasM1elztuh;
        h60 GWasM1elztuh2;
        boolean xqGvceK5x = xqGvceK5x();
        NsRGN7gRqWF nsRGN7gRqWF = this.GWasM1elztuh;
        if (!xqGvceK5x) {
            NsRGN7gRqWF lv06NcmrQ = nsRGN7gRqWF.lv06NcmrQ();
            if (lv06NcmrQ == null) {
                return;
            }
            nsRGN7gRqWF = lv06NcmrQ.GWasM1elztuh().encWxUiV2;
            if (nsRGN7gRqWF == null || !nsRGN7gRqWF.GWasM1elztuh().xqGvceK5x()) {
                NsRGN7gRqWF nsRGN7gRqWF2 = this.encWxUiV2;
                if (nsRGN7gRqWF2 == null || nsRGN7gRqWF2.GWasM1elztuh().xqGvceK5x()) {
                    return;
                }
                NsRGN7gRqWF lv06NcmrQ2 = nsRGN7gRqWF2.lv06NcmrQ();
                if (lv06NcmrQ2 != null && (GWasM1elztuh2 = lv06NcmrQ2.GWasM1elztuh()) != null) {
                    GWasM1elztuh2.encWxUiV2();
                }
                NsRGN7gRqWF lv06NcmrQ3 = nsRGN7gRqWF2.lv06NcmrQ();
                nsRGN7gRqWF = (lv06NcmrQ3 == null || (GWasM1elztuh = lv06NcmrQ3.GWasM1elztuh()) == null) ? null : GWasM1elztuh.encWxUiV2;
            }
        }
        this.encWxUiV2 = nsRGN7gRqWF;
    }

    public final boolean xqGvceK5x() {
        return this.X1lG3V04pd || this.OOA6hdeuvCS || this.EljAMC1QTz || this.AvO7iQsrTN;
    }
}
