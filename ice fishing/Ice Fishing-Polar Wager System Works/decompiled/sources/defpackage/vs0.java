package defpackage;

/* loaded from: classes.dex */
public final class vs0 extends defpackage.p90 implements defpackage.g00 {
    public static final defpackage.vs0 AARZUJiTa;
    public static final defpackage.vs0 DFo87pBq1E5;
    public static final defpackage.vs0 EXtogiMhuM;
    public static final defpackage.vs0 JlrlGoKF;
    public static final defpackage.vs0 SH1y5HwkJhh;
    public static final defpackage.vs0 ez2rX8ReCYw;
    public static final defpackage.vs0 riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0;

    static {
        int i = 1;
        AARZUJiTa = new defpackage.vs0(i, 0);
        EXtogiMhuM = new defpackage.vs0(i, 1);
        riuEU0zW4 = new defpackage.vs0(i, 2);
        SH1y5HwkJhh = new defpackage.vs0(i, 3);
        ez2rX8ReCYw = new defpackage.vs0(i, 4);
        JlrlGoKF = new defpackage.vs0(i, 5);
        DFo87pBq1E5 = new defpackage.vs0(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(int i) {
        super(1);
        this.xiZrDbcSW0 = 9;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                defpackage.ma0 ma0Var = (defpackage.ma0) obj;
                if (ma0Var.p4kuH6PDtgom()) {
                    ma0Var.frpfPPIgqM9O();
                }
                return ok1Var;
            case 1:
                return ok1Var;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(((defpackage.h51) obj).oh6vYeIP);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.e70 e70Var = ((defpackage.h51) obj).r1MBDhnF;
                return java.lang.Integer.valueOf(e70Var.F7NU4MC0GW - e70Var.oh6vYeIP);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return ok1Var;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                throw null;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.i70((((int) (((defpackage.i70) obj).IHQe1A4L2xu & 4294967295L)) & 4294967295L) | (0 << 32));
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.i70((((int) (((defpackage.i70) obj).IHQe1A4L2xu & 4294967295L)) & 4294967295L) | (0 << 32));
            default:
                return java.lang.Boolean.valueOf(((defpackage.gy) obj).UVjEelCZ());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs0(int i, int i2) {
        super(i);
        this.xiZrDbcSW0 = i2;
    }
}
