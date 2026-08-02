package defpackage;

import ru.yandex.taxi.preorder.source.userposition.repository.a;

/* loaded from: classes9.dex */
public final /* synthetic */ class rd7 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ rd7(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                hbp0 hbp0Var = new hbp0(new rd7(aVar, 1), "CachedLocationRepositoryImpl", (mse) aVar.b.a.getValue());
                hbp0Var.a();
                return hbp0Var;
            default:
                aVar.a.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
        }
    }
}
