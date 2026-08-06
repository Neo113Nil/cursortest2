package defpackage;

/* loaded from: classes.dex */
public final class ue1 implements defpackage.y71 {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final defpackage.y71 oh6vYeIP;
    public final defpackage.g00 r1MBDhnF;

    public /* synthetic */ ue1(defpackage.y71 y71Var, defpackage.g00 g00Var, int i) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = y71Var;
        this.r1MBDhnF = g00Var;
    }

    @Override // defpackage.y71
    public final java.util.Iterator iterator() {
        switch (this.IHQe1A4L2xu) {
            case 0:
                return new defpackage.qv(this);
            default:
                return new defpackage.di1(this);
        }
    }
}
