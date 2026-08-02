package defpackage;

import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class tft0 {
    public final nzb0 a;
    public final e b;
    public final AddressResolveRepository c;
    public final h3y d;
    public final fy01 e;

    public tft0(nzb0 nzb0Var, e eVar, AddressResolveRepository addressResolveRepository, h3y h3yVar, fy01 fy01Var) {
        this.a = nzb0Var;
        this.b = eVar;
        this.c = addressResolveRepository;
        this.d = h3yVar;
        this.e = fy01Var;
    }

    public final n5v0 a(boolean z) {
        this.a.a.f();
        e eVar = this.b;
        eVar.g(true);
        if (!eVar.a.a().q()) {
            ((nwx0) this.e).a.c().M0();
            if (z) {
                this.c.b(AddressResolveRepository.State.LOADING);
            }
        }
        return (n5v0) this.d.get();
    }
}
