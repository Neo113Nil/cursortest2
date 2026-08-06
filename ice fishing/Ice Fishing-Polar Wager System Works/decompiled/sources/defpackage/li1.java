package defpackage;

/* loaded from: classes.dex */
public final class li1 {
    public final defpackage.qt0 EXtogiMhuM;
    public final defpackage.qt0 F7NU4MC0GW;
    public final defpackage.sg IHQe1A4L2xu;
    public final defpackage.yn JlrlGoKF;
    public final defpackage.gb1 SH1y5HwkJhh;
    public final defpackage.qt0 adDC3e2L;
    public final defpackage.qt0 ez2rX8ReCYw;
    public final defpackage.li1 oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final defpackage.gb1 riuEU0zW4;
    public final defpackage.ot0 xiZrDbcSW0 = new defpackage.ot0(0);
    public final defpackage.ot0 AARZUJiTa = new defpackage.ot0(Long.MIN_VALUE);

    public li1(defpackage.sg sgVar, defpackage.li1 li1Var, java.lang.String str) {
        this.IHQe1A4L2xu = sgVar;
        this.oh6vYeIP = li1Var;
        this.r1MBDhnF = str;
        this.F7NU4MC0GW = defpackage.c80.nBH8hAHy(sgVar.xiZrDbcSW0());
        this.adDC3e2L = defpackage.c80.nBH8hAHy(new defpackage.ii1(sgVar.xiZrDbcSW0(), sgVar.xiZrDbcSW0()));
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.EXtogiMhuM = defpackage.c80.nBH8hAHy(bool);
        this.riuEU0zW4 = new defpackage.gb1();
        this.SH1y5HwkJhh = new defpackage.gb1();
        this.ez2rX8ReCYw = defpackage.c80.nBH8hAHy(bool);
        this.JlrlGoKF = defpackage.c80.QoRHpC4k(new defpackage.ei1(this, 1));
        sgVar.SH1y5HwkJhh(this);
    }

    public final boolean AARZUJiTa() {
        return ((java.lang.Boolean) this.ez2rX8ReCYw.getValue()).booleanValue();
    }

    public final void DFo87pBq1E5(defpackage.l61 l61Var) {
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            defpackage.ji1 ji1Var = (defpackage.ji1) gb1Var.get(i);
            defpackage.qt0 qt0Var = ji1Var.SyNS6RMn;
            if (!defpackage.x70.QoRHpC4k(ji1Var.IHQe1A4L2xu().r1MBDhnF, ji1Var.IHQe1A4L2xu().F7NU4MC0GW)) {
                ji1Var.SH1y5HwkJhh = ji1Var.IHQe1A4L2xu();
                ji1Var.riuEU0zW4 = l61Var;
            }
            ji1Var.EXtogiMhuM.setValue(new defpackage.ye1(ji1Var.kd6TUFXn, ji1Var.adDC3e2L, qt0Var.getValue(), qt0Var.getValue(), ji1Var.cnag84Bm.r1MBDhnF()));
            ji1Var.QoRHpC4k.EXtogiMhuM(ji1Var.IHQe1A4L2xu().r1MBDhnF());
            ji1Var.DFo87pBq1E5 = true;
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.li1) gb1Var2.get(i2)).DFo87pBq1E5(l61Var);
        }
    }

    public final void EXtogiMhuM(long j, boolean z) {
        defpackage.ot0 ot0Var = this.AARZUJiTa;
        long AARZUJiTa = ot0Var.AARZUJiTa();
        defpackage.sg sgVar = this.IHQe1A4L2xu;
        if (AARZUJiTa == Long.MIN_VALUE) {
            ot0Var.EXtogiMhuM(j);
            ((defpackage.qt0) sgVar.IHQe1A4L2xu).setValue(java.lang.Boolean.TRUE);
        } else if (!((java.lang.Boolean) ((defpackage.qt0) sgVar.IHQe1A4L2xu).getValue()).booleanValue()) {
            ((defpackage.qt0) sgVar.IHQe1A4L2xu).setValue(java.lang.Boolean.TRUE);
        }
        this.EXtogiMhuM.setValue(java.lang.Boolean.FALSE);
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            defpackage.ji1 ji1Var = (defpackage.ji1) gb1Var.get(i);
            defpackage.qt0 qt0Var = ji1Var.ez2rX8ReCYw;
            defpackage.qt0 qt0Var2 = ji1Var.ez2rX8ReCYw;
            if (!((java.lang.Boolean) qt0Var.getValue()).booleanValue()) {
                long r1MBDhnF = z ? ji1Var.IHQe1A4L2xu().r1MBDhnF() : j;
                ji1Var.adDC3e2L(ji1Var.IHQe1A4L2xu().oh6vYeIP(r1MBDhnF));
                ji1Var.cnag84Bm = ji1Var.IHQe1A4L2xu().xiZrDbcSW0(r1MBDhnF);
                if (ji1Var.IHQe1A4L2xu().AARZUJiTa(r1MBDhnF)) {
                    qt0Var2.setValue(java.lang.Boolean.TRUE);
                }
            }
            if (!((java.lang.Boolean) qt0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.li1 li1Var = (defpackage.li1) gb1Var2.get(i2);
            defpackage.qt0 qt0Var3 = li1Var.F7NU4MC0GW;
            defpackage.sg sgVar2 = li1Var.IHQe1A4L2xu;
            if (!defpackage.x70.QoRHpC4k(qt0Var3.getValue(), sgVar2.xiZrDbcSW0())) {
                li1Var.EXtogiMhuM(j, z);
            }
            if (!defpackage.x70.QoRHpC4k(li1Var.F7NU4MC0GW.getValue(), sgVar2.xiZrDbcSW0())) {
                z2 = false;
            }
        }
        if (z2) {
            riuEU0zW4();
        }
    }

    public final boolean F7NU4MC0GW() {
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.ji1) gb1Var.get(i)).riuEU0zW4 != null) {
                return true;
            }
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((defpackage.li1) gb1Var2.get(i2)).F7NU4MC0GW()) {
                return true;
            }
        }
        return false;
    }

    public final void IHQe1A4L2xu(java.lang.Object obj, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? t10Var.xiZrDbcSW0(obj) : t10Var.EXtogiMhuM(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.xiZrDbcSW0(this) ? 32 : 16;
        }
        int i3 = 0;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            if (AARZUJiTa()) {
                t10Var.AsxAYCCkb3Hi(416369985);
            } else {
                t10Var.AsxAYCCkb3Hi(466062241);
                QoRHpC4k(obj);
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
                if (z || mAr5m2L7gYDP == ad1Var) {
                    mAr5m2L7gYDP = defpackage.c80.QoRHpC4k(new defpackage.ei1(this, i3));
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
                }
                if (((java.lang.Boolean) ((defpackage.ec1) mAr5m2L7gYDP).getValue()).booleanValue()) {
                    t10Var.AsxAYCCkb3Hi(466470356);
                    java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                    if (mAr5m2L7gYDP2 == ad1Var) {
                        mAr5m2L7gYDP2 = defpackage.s21.NHJTzaLwkd(t10Var);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                    }
                    defpackage.uj ujVar = (defpackage.uj) mAr5m2L7gYDP2;
                    boolean EXtogiMhuM = t10Var.EXtogiMhuM(ujVar) | (i4 == 32);
                    java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
                    if (EXtogiMhuM || mAr5m2L7gYDP3 == ad1Var) {
                        mAr5m2L7gYDP3 = new defpackage.r1MBDhnF(27, ujVar, this);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
                    }
                    defpackage.s21.r1MBDhnF(ujVar, this, (defpackage.g00) mAr5m2L7gYDP3, t10Var);
                } else {
                    t10Var.AsxAYCCkb3Hi(416369985);
                }
                t10Var.QoRHpC4k(false);
            }
            t10Var.QoRHpC4k(false);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.KaQkzhFJpl(i, 11, this, obj);
        }
    }

    public final void JlrlGoKF(long j) {
        defpackage.ot0 ot0Var = this.AARZUJiTa;
        if (ot0Var.AARZUJiTa() == Long.MIN_VALUE) {
            ot0Var.EXtogiMhuM(j);
        }
        SyNS6RMn(j);
        this.EXtogiMhuM.setValue(java.lang.Boolean.FALSE);
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ji1) gb1Var.get(i)).r1MBDhnF(j);
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            defpackage.li1 li1Var = (defpackage.li1) gb1Var2.get(i2);
            if (!defpackage.x70.QoRHpC4k(li1Var.F7NU4MC0GW.getValue(), li1Var.IHQe1A4L2xu.xiZrDbcSW0())) {
                li1Var.JlrlGoKF(j);
            }
        }
    }

    public final void QoRHpC4k(java.lang.Object obj) {
        defpackage.qt0 qt0Var = this.F7NU4MC0GW;
        if (defpackage.x70.QoRHpC4k(qt0Var.getValue(), obj)) {
            return;
        }
        this.adDC3e2L.setValue(new defpackage.ii1(qt0Var.getValue(), obj));
        defpackage.sg sgVar = this.IHQe1A4L2xu;
        if (!defpackage.x70.QoRHpC4k(sgVar.xiZrDbcSW0(), qt0Var.getValue())) {
            sgVar.riuEU0zW4(qt0Var.getValue());
        }
        qt0Var.setValue(obj);
        if (this.AARZUJiTa.AARZUJiTa() == Long.MIN_VALUE) {
            this.EXtogiMhuM.setValue(java.lang.Boolean.TRUE);
        }
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ji1) gb1Var.get(i)).JlrlGoKF.EXtogiMhuM(-2.0f);
        }
    }

    public final void SH1y5HwkJhh(float f) {
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            defpackage.ji1 ji1Var = (defpackage.ji1) gb1Var.get(i);
            ji1Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                defpackage.ye1 ye1Var = ji1Var.SH1y5HwkJhh;
                if (ye1Var != null) {
                    ji1Var.IHQe1A4L2xu().EXtogiMhuM(ye1Var.r1MBDhnF);
                    ji1Var.riuEU0zW4 = null;
                    ji1Var.SH1y5HwkJhh = null;
                }
                java.lang.Object obj = f == -4.0f ? ji1Var.IHQe1A4L2xu().F7NU4MC0GW : ji1Var.IHQe1A4L2xu().r1MBDhnF;
                ji1Var.IHQe1A4L2xu().EXtogiMhuM(obj);
                ji1Var.IHQe1A4L2xu().riuEU0zW4(obj);
                ji1Var.adDC3e2L(obj);
                ji1Var.QoRHpC4k.EXtogiMhuM(ji1Var.IHQe1A4L2xu().r1MBDhnF());
            } else {
                ji1Var.JlrlGoKF.EXtogiMhuM(f);
            }
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.li1) gb1Var2.get(i2)).SH1y5HwkJhh(f);
        }
    }

    public final void SyNS6RMn(long j) {
        if (this.oh6vYeIP == null) {
            this.xiZrDbcSW0.EXtogiMhuM(j);
        }
    }

    public final long adDC3e2L() {
        defpackage.li1 li1Var = this.oh6vYeIP;
        return li1Var != null ? li1Var.adDC3e2L() : this.xiZrDbcSW0.AARZUJiTa();
    }

    public final void cnag84Bm() {
        defpackage.ye1 ye1Var;
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            defpackage.ji1 ji1Var = (defpackage.ji1) gb1Var.get(i);
            defpackage.l61 l61Var = ji1Var.riuEU0zW4;
            if (l61Var != null && (ye1Var = ji1Var.SH1y5HwkJhh) != null) {
                long WLpAkxCo = defpackage.ci0.WLpAkxCo(l61Var.AARZUJiTa * l61Var.F7NU4MC0GW);
                java.lang.Object oh6vYeIP = ye1Var.oh6vYeIP(WLpAkxCo);
                if (ji1Var.DFo87pBq1E5) {
                    ji1Var.IHQe1A4L2xu().riuEU0zW4(oh6vYeIP);
                }
                ji1Var.IHQe1A4L2xu().EXtogiMhuM(oh6vYeIP);
                ji1Var.QoRHpC4k.EXtogiMhuM(ji1Var.IHQe1A4L2xu().r1MBDhnF());
                if (ji1Var.JlrlGoKF.AARZUJiTa() == -2.0f || ji1Var.DFo87pBq1E5) {
                    ji1Var.adDC3e2L(oh6vYeIP);
                } else {
                    ji1Var.r1MBDhnF(ji1Var.EgCjBq0SZwJ.adDC3e2L());
                }
                if (WLpAkxCo >= l61Var.AARZUJiTa) {
                    ji1Var.riuEU0zW4 = null;
                    ji1Var.SH1y5HwkJhh = null;
                } else {
                    l61Var.r1MBDhnF = false;
                }
            }
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.li1) gb1Var2.get(i2)).cnag84Bm();
        }
    }

    public final void ez2rX8ReCYw(java.lang.Object obj, java.lang.Object obj2) {
        this.AARZUJiTa.EXtogiMhuM(Long.MIN_VALUE);
        defpackage.sg sgVar = this.IHQe1A4L2xu;
        ((defpackage.qt0) sgVar.IHQe1A4L2xu).setValue(java.lang.Boolean.FALSE);
        boolean AARZUJiTa = AARZUJiTa();
        defpackage.qt0 qt0Var = this.F7NU4MC0GW;
        if (!AARZUJiTa || !defpackage.x70.QoRHpC4k(sgVar.xiZrDbcSW0(), obj) || !defpackage.x70.QoRHpC4k(qt0Var.getValue(), obj2)) {
            if (!defpackage.x70.QoRHpC4k(sgVar.xiZrDbcSW0(), obj) && (sgVar instanceof defpackage.tl0)) {
                ((defpackage.tl0) sgVar).riuEU0zW4(obj);
            }
            qt0Var.setValue(obj2);
            this.ez2rX8ReCYw.setValue(java.lang.Boolean.TRUE);
            this.adDC3e2L.setValue(new defpackage.ii1(obj, obj2));
        }
        defpackage.gb1 gb1Var = this.SH1y5HwkJhh;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            defpackage.li1 li1Var = (defpackage.li1) gb1Var.get(i);
            li1Var.getClass();
            if (li1Var.AARZUJiTa()) {
                li1Var.ez2rX8ReCYw(li1Var.IHQe1A4L2xu.xiZrDbcSW0(), li1Var.F7NU4MC0GW.getValue());
            }
        }
        defpackage.gb1 gb1Var2 = this.riuEU0zW4;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.ji1) gb1Var2.get(i2)).r1MBDhnF(0L);
        }
    }

    public final long oh6vYeIP() {
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = java.lang.Math.max(j, ((defpackage.ji1) gb1Var.get(i)).QoRHpC4k.AARZUJiTa());
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = java.lang.Math.max(j, ((defpackage.li1) gb1Var2.get(i2)).oh6vYeIP());
        }
        return j;
    }

    public final void r1MBDhnF() {
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            defpackage.ji1 ji1Var = (defpackage.ji1) gb1Var.get(i);
            ji1Var.SH1y5HwkJhh = null;
            ji1Var.riuEU0zW4 = null;
            ji1Var.DFo87pBq1E5 = false;
        }
        defpackage.gb1 gb1Var2 = this.SH1y5HwkJhh;
        int size2 = gb1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.li1) gb1Var2.get(i2)).r1MBDhnF();
        }
    }

    public final void riuEU0zW4() {
        this.AARZUJiTa.EXtogiMhuM(Long.MIN_VALUE);
        defpackage.sg sgVar = this.IHQe1A4L2xu;
        if (sgVar instanceof defpackage.tl0) {
            ((defpackage.tl0) sgVar).riuEU0zW4(this.F7NU4MC0GW.getValue());
        }
        SyNS6RMn(0L);
        ((defpackage.qt0) sgVar.IHQe1A4L2xu).setValue(java.lang.Boolean.FALSE);
        defpackage.gb1 gb1Var = this.SH1y5HwkJhh;
        int size = gb1Var.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.li1) gb1Var.get(i)).riuEU0zW4();
        }
    }

    public final java.lang.String toString() {
        defpackage.gb1 gb1Var = this.riuEU0zW4;
        int size = gb1Var.size();
        java.lang.String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((defpackage.ji1) gb1Var.get(i)) + ", ";
        }
        return str;
    }

    public final defpackage.hi1 xiZrDbcSW0() {
        return (defpackage.hi1) this.adDC3e2L.getValue();
    }
}
