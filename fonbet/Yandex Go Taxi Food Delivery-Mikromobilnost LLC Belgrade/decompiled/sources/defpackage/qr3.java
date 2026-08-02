package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import ru.yandex.taxi.am.r;

/* loaded from: classes9.dex */
public final class qr3 implements q {
    public final /* synthetic */ r a;

    public qr3(r rVar) {
        this.a = rVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (pr3.a[event.ordinal()] == 1) {
            this.a.o.b();
            r rVar = this.a;
            rVar.a.d(rVar.p);
            this.a.s = false;
        }
    }
}
