package defpackage;

/* loaded from: classes.dex */
public final class j40 implements defpackage.e91 {
    public static final defpackage.j40 oh6vYeIP = new defpackage.j40(0);
    public static final defpackage.j40 r1MBDhnF = new defpackage.j40(1);
    public final /* synthetic */ int IHQe1A4L2xu;

    public /* synthetic */ j40(int i) {
        this.IHQe1A4L2xu = i;
    }

    @Override // defpackage.e91
    public final defpackage.e90 IHQe1A4L2xu(long j, defpackage.w90 w90Var, defpackage.qn qnVar) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                float yIx6ChFVk = qnVar.yIx6ChFVk(30.0f);
                return new defpackage.ns0(new defpackage.kz0(0.0f, -yIx6ChFVk, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + yIx6ChFVk));
            case 1:
                float yIx6ChFVk2 = qnVar.yIx6ChFVk(30.0f);
                return new defpackage.ns0(new defpackage.kz0(-yIx6ChFVk2, 0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) + yIx6ChFVk2, java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new defpackage.ns0(defpackage.j70.r1MBDhnF(0L, j));
        }
    }

    public java.lang.String toString() {
        switch (this.IHQe1A4L2xu) {
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
