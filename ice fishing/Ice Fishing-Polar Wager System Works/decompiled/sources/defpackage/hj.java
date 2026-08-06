package defpackage;

/* loaded from: classes.dex */
public abstract class hj implements defpackage.e91 {
    public final defpackage.ij F7NU4MC0GW;
    public final defpackage.ij IHQe1A4L2xu;
    public final defpackage.ij oh6vYeIP;
    public final defpackage.ij r1MBDhnF;

    public hj(defpackage.ij ijVar, defpackage.ij ijVar2, defpackage.ij ijVar3, defpackage.ij ijVar4) {
        this.IHQe1A4L2xu = ijVar;
        this.oh6vYeIP = ijVar2;
        this.r1MBDhnF = ijVar3;
        this.F7NU4MC0GW = ijVar4;
    }

    public static /* synthetic */ defpackage.hj r1MBDhnF(defpackage.hj hjVar, defpackage.ij ijVar, defpackage.ij ijVar2, defpackage.ij ijVar3, defpackage.ij ijVar4, int i) {
        if ((i & 1) != 0) {
            ijVar = hjVar.IHQe1A4L2xu;
        }
        if ((i & 2) != 0) {
            ijVar2 = hjVar.oh6vYeIP;
        }
        if ((i & 4) != 0) {
            ijVar3 = hjVar.r1MBDhnF;
        }
        if ((i & 8) != 0) {
            ijVar4 = hjVar.F7NU4MC0GW;
        }
        return hjVar.oh6vYeIP(ijVar, ijVar2, ijVar3, ijVar4);
    }

    public abstract defpackage.e90 F7NU4MC0GW(long j, float f, float f2, float f3, float f4, defpackage.w90 w90Var);

    @Override // defpackage.e91
    public final defpackage.e90 IHQe1A4L2xu(long j, defpackage.w90 w90Var, defpackage.qn qnVar) {
        float IHQe1A4L2xu = this.IHQe1A4L2xu.IHQe1A4L2xu(j, qnVar);
        float IHQe1A4L2xu2 = this.oh6vYeIP.IHQe1A4L2xu(j, qnVar);
        float IHQe1A4L2xu3 = this.r1MBDhnF.IHQe1A4L2xu(j, qnVar);
        float IHQe1A4L2xu4 = this.F7NU4MC0GW.IHQe1A4L2xu(j, qnVar);
        float oh6vYeIP = defpackage.z91.oh6vYeIP(j);
        float f = IHQe1A4L2xu + IHQe1A4L2xu4;
        if (f > oh6vYeIP) {
            float f2 = oh6vYeIP / f;
            IHQe1A4L2xu *= f2;
            IHQe1A4L2xu4 *= f2;
        }
        float f3 = IHQe1A4L2xu2 + IHQe1A4L2xu3;
        if (f3 > oh6vYeIP) {
            float f4 = oh6vYeIP / f3;
            IHQe1A4L2xu2 *= f4;
            IHQe1A4L2xu3 *= f4;
        }
        if (IHQe1A4L2xu < 0.0f || IHQe1A4L2xu2 < 0.0f || IHQe1A4L2xu3 < 0.0f || IHQe1A4L2xu4 < 0.0f) {
            defpackage.a60.IHQe1A4L2xu("Corner size in Px can't be negative(topStart = " + IHQe1A4L2xu + ", topEnd = " + IHQe1A4L2xu2 + ", bottomEnd = " + IHQe1A4L2xu3 + ", bottomStart = " + IHQe1A4L2xu4 + ")!");
        }
        return F7NU4MC0GW(j, IHQe1A4L2xu, IHQe1A4L2xu2, IHQe1A4L2xu3, IHQe1A4L2xu4, w90Var);
    }

    public abstract defpackage.hj oh6vYeIP(defpackage.ij ijVar, defpackage.ij ijVar2, defpackage.ij ijVar3, defpackage.ij ijVar4);
}
