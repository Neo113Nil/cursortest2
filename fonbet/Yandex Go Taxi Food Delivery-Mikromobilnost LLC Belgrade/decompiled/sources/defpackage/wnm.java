package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class wnm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnm b;
    public final /* synthetic */ vnm c;

    public /* synthetic */ wnm(vnm vnmVar, vnm vnmVar2, int i, int i2) {
        this.a = i2;
        this.b = vnmVar;
        this.c = vnmVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vnm vnmVar = this.c;
        vnm vnmVar2 = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qn91.c(vnmVar2, vnmVar, fidVar, vng.O(1));
                break;
            default:
                qn91.f(vnmVar2, vnmVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
