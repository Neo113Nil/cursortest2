package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.search.common.presenter.a;
import java.util.List;
import java.util.function.BiConsumer;
import ru.yandex.taxi.address.experiment.e;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public final class tsd implements j61 {
    public final PointType a;
    public final rsd b = new rsd();
    public BiConsumer c = new ssd(0);
    public bjd w;
    public final /* synthetic */ a x;

    public tsd(a aVar, PointType pointType) {
        this.x = aVar;
        this.a = pointType;
    }

    @Override // defpackage.j61
    public final void C(o5v0 o5v0Var) {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.C(o5v0Var);
        }
    }

    @Override // defpackage.j61
    public final s2h D() {
        return ((bjd) this.x.Dg()).D();
    }

    @Override // defpackage.i51
    public final void M5(Drawable drawable) {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.M5(drawable);
        }
    }

    @Override // defpackage.j61
    public final void O() {
        ((bjd) this.x.Dg()).O();
    }

    @Override // defpackage.j61
    public final void P6(pv0 pv0Var) {
        hideProgress();
        this.c.accept(this.a, pv0Var);
    }

    @Override // defpackage.j61
    public final void Rb(String str) {
        ((bjd) this.x.Dg()).de(this.a, str);
    }

    @Override // defpackage.j61
    public final void Ta(String str) {
    }

    @Override // defpackage.j61
    public final void U9(String str) {
    }

    @Override // defpackage.i51
    public final boolean Xd() {
        return this.b.b;
    }

    @Override // defpackage.j61
    public final void Y5() {
        hideProgress();
        a aVar = this.x;
        aVar.Og((bjd) aVar.Dg());
    }

    @Override // defpackage.i51
    public final void a9() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.a9();
        }
        rsd rsdVar = this.b;
        rsdVar.b = false;
        rsdVar.d = false;
        rsdVar.c = true;
    }

    @Override // defpackage.j61
    public final void c8(hks hksVar) {
    }

    @Override // defpackage.i51
    public final void cg() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.cg();
        }
        rsd rsdVar = this.b;
        rsdVar.b = false;
        rsdVar.c = false;
        rsdVar.d = true;
    }

    @Override // defpackage.hz20
    public final void dismiss() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.dismiss();
        }
    }

    @Override // defpackage.j61
    public final void fg() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.d9();
        }
    }

    @Override // defpackage.j61
    public final boolean g() {
        return false;
    }

    @Override // defpackage.j61
    public final String getFilter() {
        return ((bjd) this.x.Dg()).q8(this.a);
    }

    public final void h(BiConsumer biConsumer) {
        this.c = biConsumer;
        this.w = (bjd) this.x.Dg();
        rsd rsdVar = this.b;
        if (rsdVar.b) {
            showProgress();
            return;
        }
        if (rsdVar.c) {
            a9();
        } else if (rsdVar.d) {
            cg();
        } else {
            y2(rsdVar.a);
        }
    }

    @Override // defpackage.j61
    public final void hideKeyboard() {
        ((bjd) this.x.Dg()).hideKeyboard();
    }

    @Override // defpackage.i51
    public final void hideProgress() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.hideProgress();
        }
        this.b.b = false;
    }

    @Override // defpackage.j61
    public final boolean isCollapsed() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            return bjdVar.isCollapsed();
        }
        return false;
    }

    @Override // defpackage.j61
    public final void na(e eVar) {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.p4(eVar);
        }
    }

    @Override // defpackage.j61
    public final void sb(int i) {
    }

    @Override // defpackage.j61
    public final void setTitle(String str) {
    }

    @Override // defpackage.i51
    public final void showProgress() {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.showProgress();
        }
        rsd rsdVar = this.b;
        rsdVar.c = false;
        rsdVar.d = false;
        rsdVar.b = true;
        this.x.nh();
    }

    @Override // defpackage.j61
    public final void w7() {
        hideProgress();
        this.c.accept(this.a, new psd());
    }

    @Override // defpackage.i51
    public final void y2(List list) {
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.y2(list);
        }
        rsd rsdVar = this.b;
        rsdVar.b = false;
        rsdVar.c = false;
        rsdVar.d = false;
        rsdVar.a = list;
        this.x.nh();
    }

    @Override // defpackage.j61
    public final void zd(pv0 pv0Var, boolean z) {
        Address address;
        hideProgress();
        a aVar = this.x;
        pv0 pv0Var2 = aVar.V;
        if (pv0Var2 == null || (address = pv0Var2.a) == null) {
            pv0 pv0Var3 = aVar.U;
            address = pv0Var3 != null ? pv0Var3.a : null;
        }
        bjd bjdVar = this.w;
        if (bjdVar != null) {
            bjdVar.M3(this.a, address, pv0Var, z);
        }
    }
}
