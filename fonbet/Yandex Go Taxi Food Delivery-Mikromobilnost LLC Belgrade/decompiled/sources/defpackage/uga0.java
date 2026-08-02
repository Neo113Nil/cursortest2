package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class uga0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ljh b;
    public final /* synthetic */ anh c;
    public final /* synthetic */ String w;

    public /* synthetic */ uga0(ljh ljhVar, anh anhVar, String str, int i) {
        this.a = i;
        this.b = ljhVar;
        this.c = anhVar;
        this.w = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.w;
        anh anhVar = this.c;
        ljh ljhVar = this.b;
        switch (i) {
            case 0:
                ljhVar.a.onSuccess(new rm0(anhVar.a, str));
                break;
            default:
                ljhVar.a.onSuccess(new rm0(anhVar.a, str));
                break;
        }
        return zy11Var;
    }
}
