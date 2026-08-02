package defpackage;

import com.yandex.mobile.drive.scan.ui.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class ulm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ ulm0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.m.b(bVar.i.a().getMode(), "restart hack", null);
                bVar.h();
                bVar.f();
                break;
            default:
                bVar.h.toPreviousScreen();
                break;
        }
        return zy11Var;
    }
}
