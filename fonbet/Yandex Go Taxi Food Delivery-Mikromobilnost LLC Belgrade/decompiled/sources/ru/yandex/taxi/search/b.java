package ru.yandex.taxi.search;

import com.yandex.go.coroutines.h;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.kyh0;
import defpackage.qoi0;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.experiment.AddressItemMode;

/* loaded from: classes6.dex */
public final class b {
    public final AddressInputView a;
    public final a b;
    public final hbp0 c;
    public final r0 d;
    public g18 e;
    public final h f;
    public final h g;

    public b(AddressInputView addressInputView, a aVar) {
        this.a = addressInputView;
        this.b = aVar;
        String d = qoi0.a(b.class).d();
        this.c = new hbp0(new czo0(14), d == null ? "" : d, null);
        this.d = bvf0.c(new ru.yandex.taxi.address.experiment.a(null, null, null, null, null, ru.yandex.taxi.design.utils.c.G(kyh0.point_on_map, addressInputView), null, null, AddressItemMode.EDITABLE, false, false, null, null, 522111));
        this.f = new h(new AddressInputHolder$shadow$1(this, null));
        this.g = new h(new AddressInputHolder$minorStyleBackground$1(this, null));
    }

    public final void a() {
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new AddressInputHolder$attach$1(this, null), 3);
    }

    public final void b() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.d;
            value = r0Var.getValue();
        } while (!r0Var.k(value, ru.yandex.taxi.address.experiment.a.a((ru.yandex.taxi.address.experiment.a) value, null, null, null, null, null, null, null, null, false, false, false, false, 520191)));
    }

    public final void c(String str) {
        r0 r0Var = this.d;
        ru.yandex.taxi.address.experiment.a a = ru.yandex.taxi.address.experiment.a.a((ru.yandex.taxi.address.experiment.a) r0Var.getValue(), null, str, null, null, null, null, null, null, false, false, false, false, 524285);
        r0Var.getClass();
        r0Var.m(null, a);
    }

    public final void d(String str) {
        r0 r0Var = this.d;
        ru.yandex.taxi.address.experiment.a a = ru.yandex.taxi.address.experiment.a.a((ru.yandex.taxi.address.experiment.a) r0Var.getValue(), null, null, null, str == null ? "" : str, null, null, null, null, false, false, false, false, 524271);
        r0Var.getClass();
        r0Var.m(null, a);
    }

    public final void e() {
        tje.N(this.c.c(), null, null, new AddressInputHolder$setShadow$1(this, null), 3);
    }
}
