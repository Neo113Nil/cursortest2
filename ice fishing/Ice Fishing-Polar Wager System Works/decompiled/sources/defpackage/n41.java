package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class n41 implements defpackage.k00 {
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ n41(int i) {
        this.adDC3e2L = i;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.n5 n5Var;
        java.lang.Object IHQe1A4L2xu;
        switch (this.adDC3e2L) {
            case 0:
                return java.lang.Integer.valueOf(((defpackage.hf1) obj2).IHQe1A4L2xu);
            case 1:
                return java.lang.Integer.valueOf(((defpackage.n40) obj2).IHQe1A4L2xu);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Integer.valueOf(((defpackage.bz) obj2).IHQe1A4L2xu);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(((defpackage.cz) obj2).IHQe1A4L2xu);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.fg1 fg1Var = (defpackage.fg1) obj2;
                return fg1Var != null ? defpackage.fg1.IHQe1A4L2xu(fg1Var.IHQe1A4L2xu, defpackage.fg1.r1MBDhnF) : false ? java.lang.Boolean.FALSE : defpackage.fm.QoRHpC4k(java.lang.Float.valueOf(defpackage.fg1.r1MBDhnF(fg1Var.IHQe1A4L2xu)), defpackage.q41.IHQe1A4L2xu(new defpackage.gg1(defpackage.fg1.oh6vYeIP(fg1Var.IHQe1A4L2xu)), defpackage.q41.PAEGRtP0bX, (defpackage.q31) obj));
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.oe0 oe0Var = (defpackage.oe0) obj2;
                return defpackage.fm.QoRHpC4k(oe0Var.IHQe1A4L2xu, defpackage.q41.IHQe1A4L2xu(oe0Var.oh6vYeIP, defpackage.q41.riuEU0zW4, (defpackage.q31) obj));
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                long j = ((defpackage.gg1) obj2).IHQe1A4L2xu;
                if (defpackage.gg1.IHQe1A4L2xu(j, 8589934592L)) {
                    return 0;
                }
                if (defpackage.gg1.IHQe1A4L2xu(j, 4294967296L)) {
                    return 1;
                }
                return java.lang.Boolean.FALSE;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.gq0 gq0Var = (defpackage.gq0) obj2;
                return gq0Var != null ? defpackage.gq0.oh6vYeIP(gq0Var.IHQe1A4L2xu, 9205357640488583168L) : false ? java.lang.Boolean.FALSE : defpackage.fm.QoRHpC4k(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (gq0Var.IHQe1A4L2xu >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (gq0Var.IHQe1A4L2xu & 4294967295L))));
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.q31 q31Var = (defpackage.q31) obj;
                defpackage.k5 k5Var = (defpackage.k5) obj2;
                java.lang.Object obj3 = k5Var.IHQe1A4L2xu;
                if (obj3 instanceof defpackage.kt0) {
                    n5Var = defpackage.n5.adDC3e2L;
                } else if (obj3 instanceof defpackage.ob1) {
                    n5Var = defpackage.n5.xiZrDbcSW0;
                } else if (obj3 instanceof defpackage.ul1) {
                    n5Var = defpackage.n5.AARZUJiTa;
                } else if (obj3 instanceof defpackage.gl1) {
                    n5Var = defpackage.n5.EXtogiMhuM;
                } else if (obj3 instanceof defpackage.pe0) {
                    n5Var = defpackage.n5.riuEU0zW4;
                } else if (obj3 instanceof defpackage.oe0) {
                    n5Var = defpackage.n5.SH1y5HwkJhh;
                } else {
                    if (!(obj3 instanceof defpackage.qc1)) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    n5Var = defpackage.n5.ez2rX8ReCYw;
                }
                switch (n5Var.ordinal()) {
                    case 0:
                        obj3.getClass();
                        IHQe1A4L2xu = defpackage.q41.IHQe1A4L2xu((defpackage.kt0) obj3, defpackage.q41.AARZUJiTa, q31Var);
                        break;
                    case 1:
                        obj3.getClass();
                        IHQe1A4L2xu = defpackage.q41.IHQe1A4L2xu((defpackage.ob1) obj3, defpackage.q41.EXtogiMhuM, q31Var);
                        break;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        obj3.getClass();
                        IHQe1A4L2xu = defpackage.q41.IHQe1A4L2xu((defpackage.ul1) obj3, defpackage.q41.r1MBDhnF, q31Var);
                        break;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        obj3.getClass();
                        IHQe1A4L2xu = defpackage.q41.IHQe1A4L2xu((defpackage.gl1) obj3, defpackage.q41.F7NU4MC0GW, q31Var);
                        break;
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        obj3.getClass();
                        IHQe1A4L2xu = defpackage.q41.IHQe1A4L2xu((defpackage.pe0) obj3, defpackage.q41.adDC3e2L, q31Var);
                        break;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        obj3.getClass();
                        IHQe1A4L2xu = defpackage.q41.IHQe1A4L2xu((defpackage.oe0) obj3, defpackage.q41.xiZrDbcSW0, q31Var);
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj3.getClass();
                        IHQe1A4L2xu = ((defpackage.qc1) obj3).IHQe1A4L2xu;
                        break;
                    default:
                        defpackage.db.F7NU4MC0GW();
                        return null;
                }
                return defpackage.fm.QoRHpC4k(n5Var, IHQe1A4L2xu, java.lang.Integer.valueOf(k5Var.oh6vYeIP), java.lang.Integer.valueOf(k5Var.r1MBDhnF), k5Var.F7NU4MC0GW);
            case 9:
                defpackage.q31 q31Var2 = (defpackage.q31) obj;
                java.util.List list = ((defpackage.ff0) obj2).adDC3e2L;
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(defpackage.q41.IHQe1A4L2xu((defpackage.ef0) list.get(i), defpackage.q41.QQUzIjv3iOC5, q31Var2));
                }
                return arrayList;
            case 10:
                return ((defpackage.ef0) obj2).IHQe1A4L2xu.toLanguageTag();
            case 11:
                defpackage.q31 q31Var3 = (defpackage.q31) obj;
                defpackage.je0 je0Var = (defpackage.je0) obj2;
                return defpackage.fm.QoRHpC4k(defpackage.q41.IHQe1A4L2xu(new defpackage.ge0(je0Var.IHQe1A4L2xu), defpackage.q41.UsuH8pd5P, q31Var3), defpackage.q41.IHQe1A4L2xu(new defpackage.ie0(je0Var.oh6vYeIP), defpackage.q41.nBH8hAHy, q31Var3), defpackage.q41.IHQe1A4L2xu(new defpackage.he0(je0Var.r1MBDhnF), defpackage.q41.v5iciZok, q31Var3));
            case 12:
                return java.lang.Float.valueOf(((defpackage.ge0) obj2).IHQe1A4L2xu);
            case 13:
                return java.lang.Integer.valueOf(((defpackage.ie0) obj2).IHQe1A4L2xu);
            case 14:
                return java.lang.Integer.valueOf(((defpackage.he0) obj2).IHQe1A4L2xu);
            case 15:
                return ((defpackage.ul1) obj2).IHQe1A4L2xu;
            case 16:
                defpackage.q31 q31Var4 = (defpackage.q31) obj;
                defpackage.kt0 kt0Var = (defpackage.kt0) obj2;
                java.lang.Object IHQe1A4L2xu2 = defpackage.q41.IHQe1A4L2xu(new defpackage.cf1(kt0Var.IHQe1A4L2xu), defpackage.q41.G3OKOH3wZRC, q31Var4);
                java.lang.Object IHQe1A4L2xu3 = defpackage.q41.IHQe1A4L2xu(new defpackage.hf1(kt0Var.oh6vYeIP), defpackage.q41.kd6TUFXn, q31Var4);
                java.lang.Object IHQe1A4L2xu4 = defpackage.q41.IHQe1A4L2xu(new defpackage.fg1(kt0Var.r1MBDhnF), defpackage.q41.V7bD7b8KA, q31Var4);
                defpackage.kf1 kf1Var = kt0Var.F7NU4MC0GW;
                defpackage.kf1 kf1Var2 = defpackage.kf1.r1MBDhnF;
                java.lang.Object IHQe1A4L2xu5 = defpackage.q41.IHQe1A4L2xu(kf1Var, defpackage.q41.JlrlGoKF, q31Var4);
                java.lang.Object IHQe1A4L2xu6 = defpackage.q41.IHQe1A4L2xu(kt0Var.adDC3e2L, defpackage.ci0.SH1y5HwkJhh, q31Var4);
                defpackage.je0 je0Var2 = kt0Var.xiZrDbcSW0;
                defpackage.je0 je0Var3 = defpackage.je0.F7NU4MC0GW;
                return defpackage.fm.QoRHpC4k(IHQe1A4L2xu2, IHQe1A4L2xu3, IHQe1A4L2xu4, IHQe1A4L2xu5, IHQe1A4L2xu6, defpackage.q41.IHQe1A4L2xu(je0Var2, defpackage.q41.C0U8sNJm, q31Var4), defpackage.q41.IHQe1A4L2xu(new defpackage.ee0(kt0Var.AARZUJiTa), defpackage.ci0.JlrlGoKF, q31Var4), defpackage.q41.IHQe1A4L2xu(new defpackage.n40(kt0Var.EXtogiMhuM), defpackage.q41.EgCjBq0SZwJ, q31Var4), defpackage.q41.IHQe1A4L2xu(kt0Var.riuEU0zW4, defpackage.ci0.DFo87pBq1E5, q31Var4));
            case 17:
                return ((defpackage.gl1) obj2).IHQe1A4L2xu;
            case 18:
                defpackage.q31 q31Var5 = (defpackage.q31) obj;
                defpackage.ob1 ob1Var = (defpackage.ob1) obj2;
                defpackage.ae aeVar = new defpackage.ae(ob1Var.IHQe1A4L2xu.r1MBDhnF());
                defpackage.p41 p41Var = defpackage.q41.QoRHpC4k;
                java.lang.Object IHQe1A4L2xu7 = defpackage.q41.IHQe1A4L2xu(aeVar, p41Var, q31Var5);
                defpackage.fg1 fg1Var2 = new defpackage.fg1(ob1Var.oh6vYeIP);
                defpackage.p41 p41Var2 = defpackage.q41.V7bD7b8KA;
                java.lang.Object IHQe1A4L2xu8 = defpackage.q41.IHQe1A4L2xu(fg1Var2, p41Var2, q31Var5);
                defpackage.dz dzVar = ob1Var.r1MBDhnF;
                defpackage.dz dzVar2 = defpackage.dz.xiZrDbcSW0;
                java.lang.Object IHQe1A4L2xu9 = defpackage.q41.IHQe1A4L2xu(dzVar, defpackage.q41.DFo87pBq1E5, q31Var5);
                java.lang.Object IHQe1A4L2xu10 = defpackage.q41.IHQe1A4L2xu(ob1Var.F7NU4MC0GW, defpackage.q41.fnWB2E7cs, q31Var5);
                java.lang.Object IHQe1A4L2xu11 = defpackage.q41.IHQe1A4L2xu(ob1Var.adDC3e2L, defpackage.q41.kNAkVymC, q31Var5);
                java.lang.String str = ob1Var.AARZUJiTa;
                java.lang.Object IHQe1A4L2xu12 = defpackage.q41.IHQe1A4L2xu(new defpackage.fg1(ob1Var.EXtogiMhuM), p41Var2, q31Var5);
                java.lang.Object IHQe1A4L2xu13 = defpackage.q41.IHQe1A4L2xu(ob1Var.riuEU0zW4, defpackage.q41.SyNS6RMn, q31Var5);
                java.lang.Object IHQe1A4L2xu14 = defpackage.q41.IHQe1A4L2xu(ob1Var.SH1y5HwkJhh, defpackage.q41.ez2rX8ReCYw, q31Var5);
                defpackage.ff0 ff0Var = ob1Var.ez2rX8ReCYw;
                defpackage.ff0 ff0Var2 = defpackage.ff0.AARZUJiTa;
                java.lang.Object IHQe1A4L2xu15 = defpackage.q41.IHQe1A4L2xu(ff0Var, defpackage.q41.NHJTzaLwkd, q31Var5);
                java.lang.Object IHQe1A4L2xu16 = defpackage.q41.IHQe1A4L2xu(new defpackage.ae(ob1Var.JlrlGoKF), p41Var, q31Var5);
                java.lang.Object IHQe1A4L2xu17 = defpackage.q41.IHQe1A4L2xu(ob1Var.DFo87pBq1E5, defpackage.q41.SH1y5HwkJhh, q31Var5);
                defpackage.c91 c91Var = ob1Var.SyNS6RMn;
                defpackage.c91 c91Var2 = defpackage.c91.F7NU4MC0GW;
                return defpackage.fm.QoRHpC4k(IHQe1A4L2xu7, IHQe1A4L2xu8, IHQe1A4L2xu9, IHQe1A4L2xu10, IHQe1A4L2xu11, -1, str, IHQe1A4L2xu12, IHQe1A4L2xu13, IHQe1A4L2xu14, IHQe1A4L2xu15, IHQe1A4L2xu16, IHQe1A4L2xu17, defpackage.q41.IHQe1A4L2xu(c91Var, defpackage.q41.cnag84Bm, q31Var5));
            case 19:
                defpackage.q31 q31Var6 = (defpackage.q31) obj;
                defpackage.tf1 tf1Var = (defpackage.tf1) obj2;
                defpackage.ob1 ob1Var2 = tf1Var.IHQe1A4L2xu;
                defpackage.F7NU4MC0GW f7nu4mc0gw = defpackage.q41.EXtogiMhuM;
                return defpackage.fm.QoRHpC4k(defpackage.q41.IHQe1A4L2xu(ob1Var2, f7nu4mc0gw, q31Var6), defpackage.q41.IHQe1A4L2xu(tf1Var.oh6vYeIP, f7nu4mc0gw, q31Var6), defpackage.q41.IHQe1A4L2xu(tf1Var.r1MBDhnF, f7nu4mc0gw, q31Var6), defpackage.q41.IHQe1A4L2xu(tf1Var.F7NU4MC0GW, f7nu4mc0gw, q31Var6));
            case 20:
                defpackage.iv0 iv0Var = (defpackage.iv0) obj2;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(iv0Var.IHQe1A4L2xu);
                defpackage.F7NU4MC0GW f7nu4mc0gw2 = defpackage.q41.IHQe1A4L2xu;
                return defpackage.fm.QoRHpC4k(valueOf, defpackage.q41.IHQe1A4L2xu(new defpackage.gt(iv0Var.oh6vYeIP), defpackage.ci0.ez2rX8ReCYw, (defpackage.q31) obj));
            case 21:
                return java.lang.Integer.valueOf(((defpackage.gt) obj2).IHQe1A4L2xu);
            case 22:
                return java.lang.Integer.valueOf(((defpackage.ee0) obj2).IHQe1A4L2xu);
            case 23:
                defpackage.vf1 vf1Var = (defpackage.vf1) obj2;
                return defpackage.fm.QoRHpC4k(defpackage.q41.IHQe1A4L2xu(new defpackage.uf1(vf1Var.IHQe1A4L2xu), defpackage.ci0.SyNS6RMn, (defpackage.q31) obj), java.lang.Boolean.valueOf(vf1Var.oh6vYeIP));
            case 24:
                return java.lang.Integer.valueOf(((defpackage.uf1) obj2).IHQe1A4L2xu);
            case 25:
                return java.lang.Integer.valueOf(((defpackage.n51) obj2).IHQe1A4L2xu.AARZUJiTa());
            case 26:
                defpackage.jj jjVar = (defpackage.jj) obj2;
                if (!(jjVar instanceof defpackage.kg1)) {
                    return obj;
                }
                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? jjVar : java.lang.Integer.valueOf(intValue + 1);
            case 27:
                defpackage.kg1 kg1Var = (defpackage.kg1) obj;
                defpackage.jj jjVar2 = (defpackage.jj) obj2;
                if (kg1Var != null) {
                    return kg1Var;
                }
                if (jjVar2 instanceof defpackage.kg1) {
                    return (defpackage.kg1) jjVar2;
                }
                return null;
            default:
                defpackage.pg1 pg1Var = (defpackage.pg1) obj;
                defpackage.jj jjVar3 = (defpackage.jj) obj2;
                if (jjVar3 instanceof defpackage.kg1) {
                    defpackage.kg1 kg1Var2 = (defpackage.kg1) jjVar3;
                    defpackage.lj ljVar = pg1Var.IHQe1A4L2xu;
                    java.lang.Object r1MBDhnF = kg1Var2.r1MBDhnF();
                    java.lang.Object[] objArr = pg1Var.oh6vYeIP;
                    int i2 = pg1Var.F7NU4MC0GW;
                    objArr[i2] = r1MBDhnF;
                    defpackage.kg1[] kg1VarArr = pg1Var.r1MBDhnF;
                    pg1Var.F7NU4MC0GW = i2 + 1;
                    kg1VarArr[i2] = kg1Var2;
                }
                return pg1Var;
        }
    }
}
