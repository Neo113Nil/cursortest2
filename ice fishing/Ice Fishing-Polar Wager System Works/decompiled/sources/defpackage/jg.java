package defpackage;

/* loaded from: classes.dex */
public final class jg extends defpackage.o11 implements defpackage.k00 {
    public int AARZUJiTa;
    public int EXtogiMhuM;
    public final /* synthetic */ defpackage.kg JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(defpackage.kg kgVar, defpackage.ej ejVar) {
        super(ejVar);
        this.JlrlGoKF = kgVar;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.z71 z71Var;
        int i;
        int i2;
        int i3;
        java.lang.String str;
        int i4;
        int i5;
        java.lang.String str2;
        defpackage.kg kgVar = this.JlrlGoKF;
        defpackage.gl0 gl0Var = kgVar.adDC3e2L;
        defpackage.wk0 wk0Var = kgVar.AARZUJiTa;
        int i6 = this.SH1y5HwkJhh;
        if (i6 == 0) {
            defpackage.f70.nBH8hAHy(obj);
            z71Var = (defpackage.z71) this.ez2rX8ReCYw;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.riuEU0zW4;
            i2 = this.EXtogiMhuM;
            i3 = this.AARZUJiTa;
            z71Var = (defpackage.z71) this.ez2rX8ReCYw;
            defpackage.f70.nBH8hAHy(obj);
        }
        if (i3 >= java.lang.Math.min(kgVar.EXtogiMhuM + 10, wk0Var.oh6vYeIP)) {
            return defpackage.ok1.IHQe1A4L2xu;
        }
        int i7 = i3 + 1;
        int oh6vYeIP = wk0Var.oh6vYeIP(i3);
        switch (oh6vYeIP) {
            case 0:
                str = "up";
                break;
            case 1:
                java.lang.Object xiZrDbcSW0 = gl0Var.xiZrDbcSW0(i2);
                i2++;
                str = "down " + xiZrDbcSW0;
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                str = "remove " + wk0Var.oh6vYeIP(i7) + ' ' + wk0Var.oh6vYeIP(i3 + 2);
                i7 = i3 + 3;
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                str = "move " + wk0Var.oh6vYeIP(i7) + ' ' + wk0Var.oh6vYeIP(i3 + 2) + ' ' + wk0Var.oh6vYeIP(i3 + 3);
                i7 = i3 + 4;
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                str = "clear";
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                i4 = i3 + 2;
                int oh6vYeIP2 = wk0Var.oh6vYeIP(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + oh6vYeIP2 + ' ' + gl0Var.xiZrDbcSW0(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = i3 + 2;
                int oh6vYeIP3 = wk0Var.oh6vYeIP(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + oh6vYeIP3 + ' ' + gl0Var.xiZrDbcSW0(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object xiZrDbcSW02 = gl0Var.xiZrDbcSW0(i2);
                xiZrDbcSW02.getClass();
                defpackage.mj1.kNAkVymC(2, xiZrDbcSW02);
                i2 += 2;
                str = "apply " + ((defpackage.k00) xiZrDbcSW02);
                break;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                str = "reuse " + kgVar.xiZrDbcSW0.xiZrDbcSW0(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = defpackage.fx0.SH1y5HwkJhh("unknown op: ", oh6vYeIP);
                break;
        }
        this.ez2rX8ReCYw = z71Var;
        this.AARZUJiTa = i7;
        this.EXtogiMhuM = i2;
        this.riuEU0zW4 = i;
        this.SH1y5HwkJhh = 1;
        z71Var.oh6vYeIP(this, i3 + ": " + str);
        return defpackage.vj.adDC3e2L;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.jg) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.z71) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.jg jgVar = new defpackage.jg(this.JlrlGoKF, ejVar);
        jgVar.ez2rX8ReCYw = obj;
        return jgVar;
    }
}
