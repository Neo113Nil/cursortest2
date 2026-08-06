package defpackage;

/* loaded from: classes.dex */
public final class dv {
    public static final /* synthetic */ int r1MBDhnF = 0;
    public final defpackage.ka1 IHQe1A4L2xu = defpackage.ka1.xiZrDbcSW0();
    public boolean oh6vYeIP;

    static {
        new defpackage.dv(0);
    }

    public dv(int i) {
        IHQe1A4L2xu();
        IHQe1A4L2xu();
    }

    public static void oh6vYeIP(defpackage.rd rdVar, defpackage.tp1 tp1Var, int i, java.lang.Object obj) {
        if (tp1Var == defpackage.tp1.EXtogiMhuM) {
            rdVar.UsuH8pd5P(i, 3);
            ((defpackage.QQUzIjv3iOC5) obj).oh6vYeIP(rdVar);
            rdVar.UsuH8pd5P(i, 4);
        }
        rdVar.UsuH8pd5P(i, tp1Var.xiZrDbcSW0);
        switch (tp1Var.ordinal()) {
            case 0:
                rdVar.kNAkVymC(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case 1:
                rdVar.EgCjBq0SZwJ(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                rdVar.frpfPPIgqM9O(((java.lang.Long) obj).longValue());
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                rdVar.frpfPPIgqM9O(((java.lang.Long) obj).longValue());
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                rdVar.PAEGRtP0bX(((java.lang.Integer) obj).intValue());
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                rdVar.kNAkVymC(((java.lang.Long) obj).longValue());
                break;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                rdVar.EgCjBq0SZwJ(((java.lang.Integer) obj).intValue());
                break;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                rdVar.DFo87pBq1E5(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof defpackage.ra)) {
                    rdVar.C0U8sNJm((java.lang.String) obj);
                    break;
                } else {
                    rdVar.G3OKOH3wZRC((defpackage.ra) obj);
                    break;
                }
            case 9:
                ((defpackage.QQUzIjv3iOC5) obj).oh6vYeIP(rdVar);
                break;
            case 10:
                defpackage.QQUzIjv3iOC5 qQUzIjv3iOC5 = (defpackage.QQUzIjv3iOC5) obj;
                rdVar.v5iciZok(((defpackage.e20) qQUzIjv3iOC5).IHQe1A4L2xu(null));
                qQUzIjv3iOC5.oh6vYeIP(rdVar);
                break;
            case 11:
                if (!(obj instanceof defpackage.ra)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    rdVar.v5iciZok(length);
                    rdVar.SyNS6RMn(bArr, 0, length);
                    break;
                } else {
                    rdVar.G3OKOH3wZRC((defpackage.ra) obj);
                    break;
                }
            case 12:
                rdVar.v5iciZok(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                rdVar.PAEGRtP0bX(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                rdVar.EgCjBq0SZwJ(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                rdVar.kNAkVymC(((java.lang.Long) obj).longValue());
                break;
            case 16:
                int intValue = ((java.lang.Integer) obj).intValue();
                rdVar.v5iciZok((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((java.lang.Long) obj).longValue();
                rdVar.frpfPPIgqM9O((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void IHQe1A4L2xu() {
        if (this.oh6vYeIP) {
            return;
        }
        defpackage.ka1 ka1Var = this.IHQe1A4L2xu;
        int size = ka1Var.adDC3e2L.size();
        for (int i = 0; i < size; i++) {
            java.util.Map.Entry r1MBDhnF2 = ka1Var.r1MBDhnF(i);
            if (r1MBDhnF2.getValue() instanceof defpackage.e20) {
                defpackage.e20 e20Var = (defpackage.e20) r1MBDhnF2.getValue();
                e20Var.getClass();
                defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
                jy0Var.getClass();
                jy0Var.IHQe1A4L2xu(e20Var.getClass()).r1MBDhnF(e20Var);
                e20Var.EXtogiMhuM();
            }
        }
        if (!ka1Var.AARZUJiTa) {
            if (ka1Var.adDC3e2L.size() > 0) {
                ka1Var.r1MBDhnF(0).getKey().getClass();
                defpackage.db.kd6TUFXn();
                return;
            } else {
                java.util.Iterator it = ka1Var.F7NU4MC0GW().iterator();
                if (it.hasNext()) {
                    ((java.util.Map.Entry) it.next()).getKey().getClass();
                    defpackage.db.kd6TUFXn();
                    return;
                }
            }
        }
        if (!ka1Var.AARZUJiTa) {
            ka1Var.xiZrDbcSW0 = ka1Var.xiZrDbcSW0.isEmpty() ? java.util.Collections.EMPTY_MAP : java.util.Collections.unmodifiableMap(ka1Var.xiZrDbcSW0);
            ka1Var.riuEU0zW4 = ka1Var.riuEU0zW4.isEmpty() ? java.util.Collections.EMPTY_MAP : java.util.Collections.unmodifiableMap(ka1Var.riuEU0zW4);
            ka1Var.AARZUJiTa = true;
        }
        this.oh6vYeIP = true;
    }

    public final java.lang.Object clone() {
        defpackage.dv dvVar = new defpackage.dv();
        defpackage.ka1 ka1Var = this.IHQe1A4L2xu;
        if (ka1Var.adDC3e2L.size() > 0) {
            java.util.Map.Entry r1MBDhnF2 = ka1Var.r1MBDhnF(0);
            if (r1MBDhnF2.getKey() != null) {
                defpackage.db.kd6TUFXn();
                return null;
            }
            r1MBDhnF2.getValue();
            throw null;
        }
        java.util.Iterator it = ka1Var.F7NU4MC0GW().iterator();
        if (!it.hasNext()) {
            return dvVar;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (entry.getKey() != null) {
            defpackage.db.kd6TUFXn();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dv) {
            return this.IHQe1A4L2xu.equals(((defpackage.dv) obj).IHQe1A4L2xu);
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public dv() {
    }
}
