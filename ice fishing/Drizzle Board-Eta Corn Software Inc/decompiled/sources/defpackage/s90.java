package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s90 extends bb0 implements el {
    public int P7K7Inc8;
    public /* synthetic */ int Qr9iLBAD;
    public /* synthetic */ yg b2ZJblxo;
    public final /* synthetic */ u90 jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(u90 u90Var, g9 g9Var) {
        super(3, g9Var);
        this.jb9XjC4I = u90Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r0.OnDfzHZD(defpackage.k70.wxUZMvaN, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (defpackage.ej0.OnDfzHZD(r1, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.OnDfzHZD(defpackage.k70.MdtA4re8, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r14.OnDfzHZD(defpackage.k70.NCTxEWno, r13) == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        yg ygVar;
        u90 u90Var = this.jb9XjC4I;
        long j = u90Var.NCTxEWno;
        int i = this.P7K7Inc8;
        u9 u9Var = u9.NCTxEWno;
        if (i == 0) {
            fn.SgZGMMPL(obj);
            yg ygVar2 = this.b2ZJblxo;
            if (this.Qr9iLBAD > 0) {
                this.P7K7Inc8 = 1;
            } else {
                long j2 = u90Var.qoPGr6Ce;
                this.b2ZJblxo = ygVar2;
                this.P7K7Inc8 = 2;
                if (ej0.OnDfzHZD(j2, this) != u9Var) {
                    ygVar = ygVar2;
                    if (j > 0) {
                    }
                    this.b2ZJblxo = null;
                    this.P7K7Inc8 = 5;
                }
            }
            return u9Var;
        }
        if (i != 1) {
            if (i == 2) {
                ygVar = this.b2ZJblxo;
                fn.SgZGMMPL(obj);
                if (j > 0) {
                    this.b2ZJblxo = ygVar;
                    this.P7K7Inc8 = 3;
                }
                this.b2ZJblxo = null;
                this.P7K7Inc8 = 5;
            } else if (i == 3) {
                ygVar = this.b2ZJblxo;
                fn.SgZGMMPL(obj);
                this.b2ZJblxo = ygVar;
                this.P7K7Inc8 = 4;
            } else if (i == 4) {
                ygVar = this.b2ZJblxo;
                fn.SgZGMMPL(obj);
                this.b2ZJblxo = null;
                this.P7K7Inc8 = 5;
            } else if (i != 5) {
                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        fn.SgZGMMPL(obj);
        return xe0.qoPGr6Ce;
    }

    @Override // defpackage.el
    public final Object b2ZJblxo(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        s90 s90Var = new s90(this.jb9XjC4I, (g9) obj3);
        s90Var.b2ZJblxo = (yg) obj;
        s90Var.Qr9iLBAD = intValue;
        return s90Var.OxcuoDLp(xe0.qoPGr6Ce);
    }
}
