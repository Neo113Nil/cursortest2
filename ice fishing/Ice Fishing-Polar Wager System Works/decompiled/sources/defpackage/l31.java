package defpackage;

/* loaded from: classes.dex */
public final class l31 extends defpackage.fj implements defpackage.iw {
    public final defpackage.iw EXtogiMhuM;
    public defpackage.ej JlrlGoKF;
    public final int SH1y5HwkJhh;
    public defpackage.lj ez2rX8ReCYw;
    public final defpackage.lj riuEU0zW4;

    public l31(defpackage.iw iwVar, defpackage.lj ljVar) {
        super(defpackage.af.AARZUJiTa, defpackage.lt.adDC3e2L);
        this.EXtogiMhuM = iwVar;
        this.riuEU0zW4 = ljVar;
        this.SH1y5HwkJhh = ((java.lang.Number) ljVar.EgCjBq0SZwJ(new defpackage.e6(16, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.iw
    public final java.lang.Object EXtogiMhuM(java.lang.Object obj, defpackage.ej ejVar) {
        try {
            java.lang.Object G3OKOH3wZRC = G3OKOH3wZRC(ejVar, obj);
            return G3OKOH3wZRC == defpackage.vj.adDC3e2L ? G3OKOH3wZRC : defpackage.ok1.IHQe1A4L2xu;
        } catch (java.lang.Throwable th) {
            this.ez2rX8ReCYw = new defpackage.tq(ejVar.xiZrDbcSW0(), th);
            throw th;
        }
    }

    public final java.lang.Object G3OKOH3wZRC(defpackage.ej ejVar, java.lang.Object obj) {
        java.lang.Comparable comparable;
        java.lang.String str;
        defpackage.lj xiZrDbcSW0 = ejVar.xiZrDbcSW0();
        defpackage.x80.G3OKOH3wZRC(xiZrDbcSW0);
        defpackage.lj ljVar = this.ez2rX8ReCYw;
        if (ljVar != xiZrDbcSW0) {
            int i = 10;
            int i2 = 0;
            if (ljVar instanceof defpackage.tq) {
                java.lang.String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((defpackage.tq) ljVar).xiZrDbcSW0 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                java.util.List CGXpA9s3RjIa = defpackage.rc1.CGXpA9s3RjIa(str2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : CGXpA9s3RjIa) {
                    if (!defpackage.rc1.AQHddgaEX((java.lang.String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    java.lang.Object obj3 = arrayList.get(i3);
                    i3++;
                    java.lang.String str3 = (java.lang.String) obj3;
                    int length = str3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i4 = -1;
                            break;
                        }
                        if (!defpackage.x70.yIx6ChFVk(str3.charAt(i4))) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 == -1) {
                        i4 = str3.length();
                    }
                    arrayList2.add(java.lang.Integer.valueOf(i4));
                }
                java.util.Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (java.lang.Comparable) it.next();
                    while (it.hasNext()) {
                        java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                java.lang.Integer num = (java.lang.Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                CGXpA9s3RjIa.size();
                int size2 = CGXpA9s3RjIa.size() - 1;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj4 : CGXpA9s3RjIa) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        defpackage.fm.hkbnNdmy();
                        throw null;
                    }
                    java.lang.String str4 = (java.lang.String) obj4;
                    if ((i2 == 0 || i2 == size2) && defpackage.rc1.AQHddgaEX(str4)) {
                        str = null;
                    } else {
                        str4.getClass();
                        if (intValue < 0) {
                            defpackage.db.adDC3e2L(defpackage.fx0.riuEU0zW4(intValue, "Requested character count ", " is less than zero."));
                            return null;
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i2 = i5;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
                defpackage.td.OtkytngK3Mr(arrayList3, sb, "\n", "", "", "...", null);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (((java.lang.Number) xiZrDbcSW0.EgCjBq0SZwJ(new defpackage.t2LXIqmbaC5(i, this), 0)).intValue() != this.SH1y5HwkJhh) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.riuEU0zW4 + ",\n\t\tbut emission happened in " + xiZrDbcSW0 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.ez2rX8ReCYw = xiZrDbcSW0;
        }
        this.JlrlGoKF = ejVar;
        defpackage.l00 l00Var = defpackage.n31.IHQe1A4L2xu;
        defpackage.iw iwVar = this.EXtogiMhuM;
        iwVar.getClass();
        java.lang.Object F7NU4MC0GW = l00Var.F7NU4MC0GW(iwVar, obj, this);
        if (!defpackage.x70.QoRHpC4k(F7NU4MC0GW, defpackage.vj.adDC3e2L)) {
            this.JlrlGoKF = null;
        }
        return F7NU4MC0GW;
    }

    @Override // defpackage.v7
    public final java.lang.StackTraceElement JlrlGoKF() {
        return null;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        java.lang.Throwable IHQe1A4L2xu = defpackage.q11.IHQe1A4L2xu(obj);
        if (IHQe1A4L2xu != null) {
            this.ez2rX8ReCYw = new defpackage.tq(xiZrDbcSW0(), IHQe1A4L2xu);
        }
        defpackage.ej ejVar = this.JlrlGoKF;
        if (ejVar != null) {
            ejVar.SH1y5HwkJhh(obj);
        }
        return defpackage.vj.adDC3e2L;
    }

    @Override // defpackage.v7, defpackage.wj
    public final defpackage.wj r1MBDhnF() {
        defpackage.ej ejVar = this.JlrlGoKF;
        if (ejVar instanceof defpackage.wj) {
            return (defpackage.wj) ejVar;
        }
        return null;
    }

    @Override // defpackage.fj, defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        defpackage.lj ljVar = this.ez2rX8ReCYw;
        return ljVar == null ? defpackage.lt.adDC3e2L : ljVar;
    }
}
