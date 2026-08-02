package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes6.dex */
public final class qdt0 implements q {
    public final /* synthetic */ r a;

    public qdt0(r rVar) {
        this.a = rVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        r rVar = this.a;
        tb1 tb1Var = rVar.x;
        d dVar = rVar.e;
        int i = odt0.a[event.ordinal()];
        if (i == 1) {
            dVar.resume();
            tb1Var.a = new pdt0(rVar);
        } else {
            if (i != 2) {
                return;
            }
            dVar.pause();
            tb1Var.a = null;
        }
    }
}
