package defpackage;

import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.l;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

/* loaded from: classes5.dex */
public final class uj3 implements nk3 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ um3 c;
    public final /* synthetic */ l d;

    public uj3(l lVar, um3 um3Var) {
        this.d = lVar;
        this.c = um3Var;
    }

    @Override // defpackage.nk3
    public final void a() {
        int i = this.b;
        um3 um3Var = this.c;
        switch (i) {
            case 0:
                um3Var.b.a();
                break;
            default:
                um3Var.b.a();
                break;
        }
    }

    @Override // defpackage.nk3
    public final void b(Throwable th) {
        int i = this.b;
        um3 um3Var = this.c;
        l lVar = this.d;
        switch (i) {
            case 0:
                lVar.h.a.l(AuthStateRepository.AuthState.READY);
                um3Var.b.b(th);
                break;
            default:
                lVar.h.a.l(AuthStateRepository.AuthState.READY);
                um3Var.b.b(th);
                break;
        }
    }

    @Override // defpackage.nk3
    public final void onSuccess() {
        int i = this.b;
        l lVar = this.d;
        um3 um3Var = this.c;
        switch (i) {
            case 0:
                tjy tjyVar = lVar.e;
                mh3 mh3Var = new mh3(2, um3Var, lVar);
                ru.yandex.taxi.zalogin.l lVar2 = tjyVar.a;
                if (tjyVar.b.a.Mg()) {
                    lVar2.d.b.getClass();
                    eky ekyVar = lVar2.b;
                    if (!((cne0) ekyVar.b).f(ekyVar.w)) {
                        lVar2.a(Events$Zalogin$LinkageContext.INSTANT_LINK, mh3Var);
                        break;
                    }
                }
                mh3Var.run();
                break;
            default:
                um3Var.b.onSuccess();
                lVar.h.a.l(AuthStateRepository.AuthState.DONE);
                break;
        }
    }

    public uj3(um3 um3Var, l lVar) {
        this.c = um3Var;
        this.d = lVar;
    }
}
