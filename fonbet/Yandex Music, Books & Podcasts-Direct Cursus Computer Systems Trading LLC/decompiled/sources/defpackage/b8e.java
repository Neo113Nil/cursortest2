package defpackage;

/* loaded from: classes3.dex */
public final class b8e implements a9h {
    public final /* synthetic */ int a;
    public final jyr b;

    public b8e(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = l18.b.b(hag.I(iw2.class), true);
                break;
            default:
                this.b = l18.b.b(hag.I(iw2.class), true);
                break;
        }
    }

    @Override // defpackage.a9h
    public final boolean a() {
        switch (this.a) {
            case 0:
                if (super.a()) {
                    ((iw2) this.b.getValue()).getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Boolean a = ((kw2) ((byb) qdcVar.C(I)).b(kw2.class)).a().a("isHuaweiEnable");
                    if (a != null ? a.booleanValue() : true) {
                    }
                }
                break;
            default:
                if (super.a()) {
                    ((iw2) this.b.getValue()).getClass();
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(byb.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    Boolean a2 = ((kw2) ((byb) qdcVar2.C(I2)).b(kw2.class)).a().a("isSamsungEnable");
                    if (a2 != null ? a2.booleanValue() : true) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.a9h
    public final String b() {
        switch (this.a) {
            case 0:
                return "Huawei";
            default:
                return "Samsung";
        }
    }
}
