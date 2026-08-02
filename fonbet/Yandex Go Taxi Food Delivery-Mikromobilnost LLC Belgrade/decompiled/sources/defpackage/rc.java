package defpackage;

import com.yandex.go.agreement.interactor.a;
import ru.yandex.taxi.sdc.router.b;

/* loaded from: classes6.dex */
public final class rc implements pco {
    public final /* synthetic */ b a;
    public final /* synthetic */ bd b;

    public rc(b bVar, bd bdVar) {
        this.a = bVar;
        this.b = bdVar;
    }

    @Override // defpackage.pco
    public final void n() {
        b bVar = this.a;
        a aVar = (a) bVar.I;
        bd bdVar = this.b;
        aVar.a(bdVar);
        bVar.r(new pc(bdVar, 1));
    }

    @Override // defpackage.pco
    public final void o() {
        this.a.r(new p0(5));
    }
}
