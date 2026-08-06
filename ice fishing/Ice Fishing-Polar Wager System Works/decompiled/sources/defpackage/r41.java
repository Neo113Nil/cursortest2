package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r41 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ r41(int i) {
        this.adDC3e2L = i;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                obj.getClass();
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(0);
                defpackage.uf1 uf1Var = (defpackage.x70.QoRHpC4k(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (defpackage.uf1) ((defpackage.g00) defpackage.ci0.SyNS6RMn.AARZUJiTa).AARZUJiTa(obj2);
                uf1Var.getClass();
                int i2 = uf1Var.IHQe1A4L2xu;
                java.lang.Object obj3 = list.get(1);
                java.lang.Boolean bool = obj3 != null ? (java.lang.Boolean) obj3 : null;
                bool.getClass();
                return new defpackage.vf1(i2, bool.booleanValue());
            case 1:
                obj.getClass();
                return new defpackage.uf1(((java.lang.Integer) obj).intValue());
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.n51(((java.lang.Integer) obj).intValue());
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Boolean.valueOf(!false);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Boolean.valueOf(obj == null);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.r41 r41Var = defpackage.wa1.IHQe1A4L2xu;
                return ok1Var;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.j90[] j90VarArr = defpackage.l71.IHQe1A4L2xu;
                defpackage.m71 m71Var = defpackage.j71.DFo87pBq1E5;
                defpackage.j90 j90Var = defpackage.l71.IHQe1A4L2xu[5];
                ((defpackage.n71) obj).IHQe1A4L2xu(m71Var, java.lang.Boolean.TRUE);
                return ok1Var;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ok1Var;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                android.content.res.Resources resources = (android.content.res.Resources) obj;
                resources.getClass();
                return java.lang.Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 9:
                defpackage.k31 k31Var = (defpackage.k31) obj;
                k31Var.getClass();
                return java.lang.Boolean.valueOf(k31Var.NHJTzaLwkd());
            case 10:
                defpackage.s61 s61Var = (defpackage.s61) obj;
                long j = s61Var.xiZrDbcSW0;
                ((defpackage.ib1) defpackage.qi1.oh6vYeIP.getValue()).oh6vYeIP(s61Var, defpackage.qi1.IHQe1A4L2xu, s61Var.AARZUJiTa);
                long j2 = s61Var.xiZrDbcSW0;
                if (j != j2) {
                    defpackage.l61 l61Var = s61Var.SyNS6RMn;
                    if (l61Var != null) {
                        if (l61Var.IHQe1A4L2xu > j2) {
                            s61Var.G3OKOH3wZRC();
                        } else {
                            l61Var.AARZUJiTa = j2;
                            if (l61Var.oh6vYeIP == null) {
                                l61Var.EXtogiMhuM = defpackage.ci0.WLpAkxCo((1.0d - l61Var.adDC3e2L.IHQe1A4L2xu(0)) * s61Var.xiZrDbcSW0);
                            }
                        }
                    } else if (j2 != 0) {
                        s61Var.fnWB2E7cs();
                    }
                }
                return ok1Var;
            case 11:
                ((defpackage.vz) obj).IHQe1A4L2xu();
                return ok1Var;
            case 12:
                defpackage.k31 k31Var2 = (defpackage.k31) obj;
                k31Var2.getClass();
                defpackage.c81 c81Var = new defpackage.c81();
                while (k31Var2.NHJTzaLwkd()) {
                    c81Var.add(java.lang.Integer.valueOf((int) k31Var2.getLong(0)));
                }
                return defpackage.s70.ez2rX8ReCYw(c81Var);
            case 13:
                return new defpackage.e5(((java.lang.Float) obj).floatValue());
            case 14:
                return new defpackage.e5(((java.lang.Integer) obj).intValue());
            case 15:
                return java.lang.Integer.valueOf((int) ((defpackage.e5) obj).IHQe1A4L2xu);
            case 16:
                return new defpackage.e5(((defpackage.uq) obj).adDC3e2L);
            case 17:
                return new defpackage.uq(((defpackage.e5) obj).IHQe1A4L2xu);
            case 18:
                defpackage.wq wqVar = (defpackage.wq) obj;
                return new defpackage.f5(java.lang.Float.intBitsToFloat((int) (wqVar.IHQe1A4L2xu >> 32)), java.lang.Float.intBitsToFloat((int) (wqVar.IHQe1A4L2xu & 4294967295L)));
            case 19:
                defpackage.f5 f5Var = (defpackage.f5) obj;
                return new defpackage.wq((java.lang.Float.floatToRawIntBits(f5Var.oh6vYeIP) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f5Var.IHQe1A4L2xu) << 32));
            case 20:
                defpackage.z91 z91Var = (defpackage.z91) obj;
                return new defpackage.f5(java.lang.Float.intBitsToFloat((int) (z91Var.IHQe1A4L2xu >> 32)), java.lang.Float.intBitsToFloat((int) (z91Var.IHQe1A4L2xu & 4294967295L)));
            case 21:
                defpackage.f5 f5Var2 = (defpackage.f5) obj;
                return new defpackage.z91((java.lang.Float.floatToRawIntBits(f5Var2.oh6vYeIP) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f5Var2.IHQe1A4L2xu) << 32));
            case 22:
                defpackage.gq0 gq0Var = (defpackage.gq0) obj;
                return new defpackage.f5(java.lang.Float.intBitsToFloat((int) (gq0Var.IHQe1A4L2xu >> 32)), java.lang.Float.intBitsToFloat((int) (gq0Var.IHQe1A4L2xu & 4294967295L)));
            case 23:
                defpackage.f5 f5Var3 = (defpackage.f5) obj;
                return new defpackage.gq0((java.lang.Float.floatToRawIntBits(f5Var3.oh6vYeIP) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f5Var3.IHQe1A4L2xu) << 32));
            case 24:
                long j3 = ((defpackage.z60) obj).IHQe1A4L2xu;
                return new defpackage.f5((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 25:
                defpackage.f5 f5Var4 = (defpackage.f5) obj;
                return new defpackage.z60((java.lang.Math.round(f5Var4.oh6vYeIP) & 4294967295L) | (java.lang.Math.round(f5Var4.IHQe1A4L2xu) << 32));
            case 26:
                long j4 = ((defpackage.i70) obj).IHQe1A4L2xu;
                return new defpackage.f5((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 27:
                defpackage.f5 f5Var5 = (defpackage.f5) obj;
                int round = java.lang.Math.round(f5Var5.IHQe1A4L2xu);
                if (round < 0) {
                    round = 0;
                }
                return new defpackage.i70((round << 32) | ((java.lang.Math.round(f5Var5.oh6vYeIP) >= 0 ? r8 : 0) & 4294967295L));
            case 28:
                defpackage.kz0 kz0Var = (defpackage.kz0) obj;
                return new defpackage.h5(kz0Var.IHQe1A4L2xu, kz0Var.oh6vYeIP, kz0Var.r1MBDhnF, kz0Var.F7NU4MC0GW);
            default:
                defpackage.h5 h5Var = (defpackage.h5) obj;
                return new defpackage.kz0(h5Var.IHQe1A4L2xu, h5Var.oh6vYeIP, h5Var.r1MBDhnF, h5Var.F7NU4MC0GW);
        }
    }
}
