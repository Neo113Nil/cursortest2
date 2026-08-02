package defpackage;

import com.yandex.go.navigator.main_screen.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class tb00 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ tb00(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                oVar.j(new fpb(oVar.Q()));
                return zy11Var;
            case 1:
                oVar.R(false);
                return zy11Var;
            default:
                return (uj00) oVar.H.get();
        }
    }
}
