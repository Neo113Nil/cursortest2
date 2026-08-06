package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rf extends defpackage.P82Dd68gK implements defpackage.k00 {
    public final /* synthetic */ int JlrlGoKF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.JlrlGoKF = i3;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.JlrlGoKF;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj3 = this.adDC3e2L;
        switch (i) {
            case 0:
                ((defpackage.sf) obj3).r1MBDhnF((defpackage.t10) obj, ((java.lang.Number) obj2).intValue());
                return ok1Var;
            default:
                long j = ((defpackage.rl1) obj).IHQe1A4L2xu;
                defpackage.a61 a61Var = (defpackage.a61) obj3;
                defpackage.uj ujVar = (defpackage.uj) ((defpackage.vz) a61Var.lpprD5VAS.AARZUJiTa).IHQe1A4L2xu();
                if (ujVar == null) {
                    defpackage.db.AARZUJiTa("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                    return null;
                }
                defpackage.fm.SiPhmbmu(ujVar, null, new defpackage.y51(a61Var, j, null, 1), 3);
                return ok1Var;
        }
    }
}
