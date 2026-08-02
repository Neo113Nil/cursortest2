package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class qna implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pna b;
    public final /* synthetic */ f530 c;

    public /* synthetic */ qna(pna pnaVar, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = pnaVar;
        this.c = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f530 f530Var = this.c;
        pna pnaVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                jjb1.c(pnaVar, f530Var, fidVar, vng.O(9));
                break;
            default:
                jjb1.a(pnaVar, f530Var, fidVar, vng.O(9));
                break;
        }
        return zy11Var;
    }
}
