package defpackage;

import kotlin.a;
import ru.yandex.taxi.order.services.b;
import ru.yandex.taxi.order.services.c;

/* loaded from: classes9.dex */
public final class zgx extends b {
    public final i3y b;

    public zgx(c cVar, h3y h3yVar) {
        super(cVar);
        this.b = a.a(new mj(h3yVar, 5));
    }

    @Override // ru.yandex.taxi.order.services.b
    public final void c(String str) {
        ((hqo) this.b.getValue()).a(str);
    }

    @Override // ru.yandex.taxi.order.services.b
    public final void d(String str) {
        super.d(str);
        i3y i3yVar = this.b;
        if (i3yVar.isInitialized()) {
            ((hqo) i3yVar.getValue()).b(str);
        }
    }
}
