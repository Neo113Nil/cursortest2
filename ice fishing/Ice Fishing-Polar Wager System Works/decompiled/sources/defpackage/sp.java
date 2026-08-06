package defpackage;

/* loaded from: classes.dex */
public final class sp extends defpackage.vm1 {
    public final defpackage.c1NqjJifC7 AARZUJiTa;
    public boolean EXtogiMhuM;
    public final defpackage.xy0 F7NU4MC0GW;
    public final defpackage.x9 adDC3e2L;
    public final defpackage.vc oh6vYeIP;
    public final defpackage.hc1 r1MBDhnF;
    public boolean riuEU0zW4;
    public final defpackage.tb xiZrDbcSW0;

    public sp(defpackage.vc vcVar, defpackage.vc vcVar2) {
        this.oh6vYeIP = vcVar2;
        defpackage.hc1 F7NU4MC0GW = defpackage.gq1.F7NU4MC0GW(new defpackage.pp(true, false, "", "", 0, 0, defpackage.nt.adDC3e2L, false, false));
        this.r1MBDhnF = F7NU4MC0GW;
        this.F7NU4MC0GW = new defpackage.xy0(F7NU4MC0GW);
        defpackage.x9 oh6vYeIP = defpackage.w70.oh6vYeIP(-2, 6, null);
        this.adDC3e2L = oh6vYeIP;
        this.xiZrDbcSW0 = defpackage.gq1.nBH8hAHy(oh6vYeIP);
        this.AARZUJiTa = new defpackage.c1NqjJifC7(28);
        defpackage.fm.SiPhmbmu(defpackage.h1.UsuH8pd5P(this), null, new defpackage.adDC3e2L(vcVar, this, null, 15), 3);
    }

    public static final java.lang.String adDC3e2L(defpackage.sp spVar, defpackage.yo yoVar) {
        spVar.getClass();
        if (yoVar instanceof defpackage.wo) {
            java.util.List list = defpackage.d01.IHQe1A4L2xu;
            return "Recovered: ".concat(defpackage.d01.oh6vYeIP(((defpackage.wo) yoVar).IHQe1A4L2xu).oh6vYeIP);
        }
        if (yoVar instanceof defpackage.uo) {
            return defpackage.fx0.riuEU0zW4(((defpackage.uo) yoVar).IHQe1A4L2xu, "+", " doubloons");
        }
        if (!(yoVar instanceof defpackage.xo)) {
            if (defpackage.x70.QoRHpC4k(yoVar, defpackage.to.IHQe1A4L2xu)) {
                return "Cursed sand — it costs you an extra move.";
            }
            if (defpackage.x70.QoRHpC4k(yoVar, defpackage.vo.IHQe1A4L2xu)) {
                return null;
            }
            defpackage.db.F7NU4MC0GW();
            return null;
        }
        defpackage.xo xoVar = (defpackage.xo) yoVar;
        int i = xoVar.oh6vYeIP;
        java.lang.String lowerCase = xoVar.IHQe1A4L2xu.r1MBDhnF().toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        return "+" + i + " " + lowerCase + " shards";
    }
}
