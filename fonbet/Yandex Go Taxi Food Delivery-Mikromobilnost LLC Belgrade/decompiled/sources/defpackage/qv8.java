package defpackage;

import com.yandex.go.address.search.common.domain.interactor.a;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class qv8 extends a390 {
    public final String y0;

    public qv8(String str, b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, y9y0 y9y0Var, msi msiVar, c cVar, nbv0 nbv0Var, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, rh9 rh9Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, y9y0Var, msiVar, cVar, nbv0Var, h51Var, prj0Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, rh9Var, pav0Var, cVar2);
        this.y0 = str;
        Kh(null);
        pav0Var.a = false;
    }

    @Override // defpackage.uh9, com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        super.eh(j61Var);
        String zh = zh();
        if (zh != null) {
            j61Var.Rb(zh);
            showProgress();
            Sg(this.x.b(zh));
        }
    }

    @Override // defpackage.a390, defpackage.uh9, com.yandex.go.address.search.common.presenter.i
    public final String zh() {
        String str = this.y0;
        return str == null ? super.zh() : str;
    }
}
