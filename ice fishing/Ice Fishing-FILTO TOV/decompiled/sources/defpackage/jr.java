package defpackage;

import com.combinations.level.experts.core.domain.model.Side;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jr {
    public static final /* synthetic */ int X1lG3V04pd = 0;
    public final e31 GWasM1elztuh = e31.EljAMC1QTz();
    public boolean Yi7zF1RB1;

    static {
        new jr(0);
    }

    public jr(int i) {
        GWasM1elztuh();
        GWasM1elztuh();
    }

    public static void Yi7zF1RB1(pb pbVar, yh1 yh1Var, int i, Object obj) {
        if (yh1Var == yh1.encWxUiV2) {
            pbVar.M3K9sHhK(i, 3);
            ((WRKkgoJXwDn) obj).Yi7zF1RB1(pbVar);
            pbVar.M3K9sHhK(i, 4);
        }
        pbVar.M3K9sHhK(i, yh1Var.EljAMC1QTz);
        switch (yh1Var.ordinal()) {
            case 0:
                pbVar.Y6hRI1cF8(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                pbVar.mE4lRynR(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                pbVar.AEn1Rrio(((Long) obj).longValue());
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                pbVar.AEn1Rrio(((Long) obj).longValue());
                break;
            case 4:
                pbVar.lv06NcmrQ(((Integer) obj).intValue());
                break;
            case 5:
                pbVar.Y6hRI1cF8(((Long) obj).longValue());
                break;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                pbVar.mE4lRynR(((Integer) obj).intValue());
                break;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                pbVar.XnEVoBF0td1l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof c9)) {
                    pbVar.pog2g9KITJA((String) obj);
                    break;
                } else {
                    pbVar.YmKjaVtbfp5Z((c9) obj);
                    break;
                }
            case 9:
                ((WRKkgoJXwDn) obj).Yi7zF1RB1(pbVar);
                break;
            case 10:
                WRKkgoJXwDn wRKkgoJXwDn = (WRKkgoJXwDn) obj;
                pbVar.EXrPz3p7hFb(((ay) wRKkgoJXwDn).GWasM1elztuh(null));
                wRKkgoJXwDn.Yi7zF1RB1(pbVar);
                break;
            case 11:
                if (!(obj instanceof c9)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    pbVar.EXrPz3p7hFb(length);
                    pbVar.uFEq9NpZ(bArr, 0, length);
                    break;
                } else {
                    pbVar.YmKjaVtbfp5Z((c9) obj);
                    break;
                }
            case 12:
                pbVar.EXrPz3p7hFb(((Integer) obj).intValue());
                break;
            case 13:
                pbVar.lv06NcmrQ(((Integer) obj).intValue());
                break;
            case 14:
                pbVar.mE4lRynR(((Integer) obj).intValue());
                break;
            case Side.ALL /* 15 */:
                pbVar.Y6hRI1cF8(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                pbVar.EXrPz3p7hFb((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                pbVar.AEn1Rrio((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void GWasM1elztuh() {
        if (this.Yi7zF1RB1) {
            return;
        }
        e31 e31Var = this.GWasM1elztuh;
        int size = e31Var.OOA6hdeuvCS.size();
        for (int i = 0; i < size; i++) {
            Map.Entry X1lG3V04pd2 = e31Var.X1lG3V04pd(i);
            if (X1lG3V04pd2.getValue() instanceof ay) {
                ay ayVar = (ay) X1lG3V04pd2.getValue();
                ayVar.getClass();
                ns0 ns0Var = ns0.X1lG3V04pd;
                ns0Var.getClass();
                ns0Var.GWasM1elztuh(ayVar.getClass()).X1lG3V04pd(ayVar);
                ayVar.encWxUiV2();
            }
        }
        if (!e31Var.AvO7iQsrTN) {
            if (e31Var.OOA6hdeuvCS.size() > 0) {
                e31Var.X1lG3V04pd(0).getKey().getClass();
                o4.YmKjaVtbfp5Z();
                return;
            } else {
                Iterator it = e31Var.xqGvceK5x().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    o4.YmKjaVtbfp5Z();
                    return;
                }
            }
        }
        if (!e31Var.AvO7iQsrTN) {
            e31Var.EljAMC1QTz = e31Var.EljAMC1QTz.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e31Var.EljAMC1QTz);
            e31Var.mOu10nynGul = e31Var.mOu10nynGul.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e31Var.mOu10nynGul);
            e31Var.AvO7iQsrTN = true;
        }
        this.Yi7zF1RB1 = true;
    }

    public final Object clone() {
        jr jrVar = new jr();
        e31 e31Var = this.GWasM1elztuh;
        if (e31Var.OOA6hdeuvCS.size() > 0) {
            Map.Entry X1lG3V04pd2 = e31Var.X1lG3V04pd(0);
            if (X1lG3V04pd2.getKey() != null) {
                o4.YmKjaVtbfp5Z();
                return null;
            }
            X1lG3V04pd2.getValue();
            throw null;
        }
        Iterator it = e31Var.xqGvceK5x().iterator();
        if (!it.hasNext()) {
            return jrVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            o4.YmKjaVtbfp5Z();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jr) {
            return this.GWasM1elztuh.equals(((jr) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public jr() {
    }
}
