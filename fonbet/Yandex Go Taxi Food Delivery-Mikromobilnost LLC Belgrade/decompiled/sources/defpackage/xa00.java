package defpackage;

import com.yandex.go.pin.repository.MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1;
import com.yandex.go.pin.repository.d;
import com.yandex.go.pin.repository.f;
import com.yandex.go.pin.repository.o;
import com.yandex.go.pin.repository.q;
import com.yandex.go.pin.repository.u;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.main.map.e;
import ru.yandex.taxi.main.map.h;
import ru.yandex.taxi.main.map.i;

/* loaded from: classes13.dex */
public final class xa00 extends va00 {
    public final e a;
    public final AddressResolveRepository b;
    public final o c;
    public final uze0 d;
    public final eco e;
    public final p2c0 f;

    public xa00(e eVar, AddressResolveRepository addressResolveRepository, o oVar, uze0 uze0Var, eco ecoVar, p2c0 p2c0Var) {
        this.a = eVar;
        this.b = addressResolveRepository;
        this.c = oVar;
        this.d = uze0Var;
        this.e = ecoVar;
        this.f = p2c0Var;
    }

    @Override // defpackage.y0c0
    public final tpr a() {
        return new q(this.b.b, this.f.a());
    }

    @Override // defpackage.y0c0
    public final tpr b() {
        return new g92(2, null);
    }

    @Override // defpackage.y0c0
    public final tpr c() {
        i iVar = this.a.a;
        return new u(kotlinx.coroutines.flow.e.t(new h(((k) iVar.b).f(), iVar)), this);
    }

    @Override // defpackage.y0c0
    public final tpr d(tpr tprVar) {
        return kotlinx.coroutines.flow.e.X(tprVar, new MainScreenPinV1DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.y0c0
    public final tpr e() {
        o oVar = this.c;
        return new com.yandex.go.pin.repository.h(new f(((ru.yandex.taxi.styling.f) oVar.c).d(new d(oVar.c()))), oVar);
    }

    @Override // defpackage.y0c0
    public final tpr f() {
        return this.a.a();
    }
}
