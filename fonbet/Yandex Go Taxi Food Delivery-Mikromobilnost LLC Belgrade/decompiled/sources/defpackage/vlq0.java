package defpackage;

import com.yandex.go.pin.repository.d;
import com.yandex.go.pin.repository.f;
import com.yandex.go.pin.repository.h;
import com.yandex.go.pin.repository.o;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.routeselector.presentation.SelectorPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.routeselector.presentation.u;

/* loaded from: classes6.dex */
public abstract class vlq0 extends y0c0 {
    public final AddressResolveRepository a;
    public final p2c0 b;
    public final tpr c;

    public vlq0(AddressResolveRepository addressResolveRepository, o oVar, boolean z, p2c0 p2c0Var) {
        tpr g92Var;
        this.a = addressResolveRepository;
        this.b = p2c0Var;
        if (z) {
            g92Var = new h(new f(((ru.yandex.taxi.styling.f) oVar.c).d(new d(oVar.c()))), oVar);
        } else {
            g92Var = new g92(2, oVar.d.a());
        }
        this.c = g92Var;
    }

    @Override // defpackage.y0c0
    public final tpr a() {
        return new u(this.a.b, this.b.a());
    }

    @Override // defpackage.y0c0
    public final tpr b() {
        return new g92(2, null);
    }

    @Override // defpackage.y0c0
    public final tpr c() {
        return new g92(2, "");
    }

    @Override // defpackage.y0c0
    public final tpr d(tpr tprVar) {
        return e.X(tprVar, new SelectorPinV1DataRepository$stateFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.y0c0
    public final tpr e() {
        return this.c;
    }
}
