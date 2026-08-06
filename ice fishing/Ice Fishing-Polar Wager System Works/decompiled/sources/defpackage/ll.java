package defpackage;

/* loaded from: classes.dex */
public final class ll extends defpackage.ce1 implements defpackage.k00 {
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll(int i, defpackage.ej ejVar, int i2) {
        super(i, ejVar);
        this.riuEU0zW4 = i2;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                defpackage.f70.nBH8hAHy(obj);
                return java.lang.Boolean.valueOf(!(((defpackage.dc1) this.SH1y5HwkJhh) instanceof defpackage.sv));
            case 1:
                defpackage.n10 n10Var = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(n10Var, 0, 0, 0L, 0L, null, null, null, null, null, 511), ok1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.n10 n10Var2 = (defpackage.n10) this.SH1y5HwkJhh;
                defpackage.f70.nBH8hAHy(obj);
                return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(n10Var2, 0, 0, 0L, 0L, null, null, null, null, null, 1007), ok1Var);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.f70.nBH8hAHy(obj);
                return java.lang.Boolean.valueOf(((defpackage.dz0) this.SH1y5HwkJhh) == defpackage.dz0.adDC3e2L);
            default:
                defpackage.f70.nBH8hAHy(obj);
                return java.lang.Boolean.valueOf(((defpackage.o91) this.SH1y5HwkJhh) != defpackage.o91.adDC3e2L);
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.ll) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.dc1) obj)).SyNS6RMn(ok1Var);
            case 1:
                return ((defpackage.ll) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.n10) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.ll) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.n10) obj)).SyNS6RMn(ok1Var);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.ll) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.dz0) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.ll) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.o91) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                defpackage.ll llVar = new defpackage.ll(2, ejVar, 0);
                llVar.SH1y5HwkJhh = obj;
                return llVar;
            case 1:
                defpackage.ll llVar2 = new defpackage.ll(2, ejVar, 1);
                llVar2.SH1y5HwkJhh = obj;
                return llVar2;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ll llVar3 = new defpackage.ll(2, ejVar, 2);
                llVar3.SH1y5HwkJhh = obj;
                return llVar3;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ll llVar4 = new defpackage.ll(2, ejVar, 3);
                llVar4.SH1y5HwkJhh = obj;
                return llVar4;
            default:
                defpackage.ll llVar5 = new defpackage.ll(2, ejVar, 4);
                llVar5.SH1y5HwkJhh = obj;
                return llVar5;
        }
    }
}
