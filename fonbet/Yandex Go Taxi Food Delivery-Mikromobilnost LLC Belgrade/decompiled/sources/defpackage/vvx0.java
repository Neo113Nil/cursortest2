package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;

/* loaded from: classes6.dex */
public final class vvx0 {
    public final n0 a;
    public final eci0 b;

    public vvx0() {
        n0 c = ffx.c(0, 64, null, 4);
        this.a = c;
        this.b = e.c(c);
    }

    public final void a() {
        this.a.g(TaxiMainControlElementEvent.ENABLE);
    }
}
