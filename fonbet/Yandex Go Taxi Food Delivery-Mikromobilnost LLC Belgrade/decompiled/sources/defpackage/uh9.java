package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.address.search.common.presenter.b;
import com.yandex.go.suggest.DestinationSuggest;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public class uh9 extends b {
    public final /* synthetic */ int v0 = 0;
    public Object w0;
    public Object x0;

    public uh9(ru.yandex.taxi.design.utils.b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, w4l0 w4l0Var, msi msiVar, c cVar, nbv0 nbv0Var, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, rh9 rh9Var, pav0 pav0Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, w4l0Var, nbv0Var, cVar, h51Var, prj0Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, pav0Var, cVar2);
        this.w0 = msiVar;
        this.x0 = rh9Var;
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i
    public void Bh(pv0 pv0Var) {
        switch (this.v0) {
            case 0:
                ((rh9) this.x0).b = false;
                super.Bh(pv0Var);
                break;
            default:
                super.Bh(pv0Var);
                break;
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public void Ch() {
        switch (this.v0) {
            case 0:
                ((rh9) this.x0).b = false;
                super.Ch();
                break;
            default:
                super.Ch();
                break;
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public boolean Jh(int i) {
        switch (this.v0) {
            case 0:
                super.Jh(i);
                int size = this.k0.c.c().b.size();
                if (i < size) {
                    rh9 rh9Var = (rh9) this.x0;
                    rh9Var.a = i;
                    rh9Var.b = false;
                    return true;
                }
                hst hstVar = jst.e;
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("stop index in out of range");
                ke00 a = hstVar.b.a();
                if (a == null || !a.b(15)) {
                    return false;
                }
                a.a(15, null, indexOutOfBoundsException, b64.d(i, size, "Stop index ", " not in range [0, ", ") of destination addresses"), hstVar.a);
                return false;
            default:
                return super.Jh(i);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b, ru.yandex.taxi.search.presenter.e
    public void Kg(boolean z) {
        switch (this.v0) {
            case 0:
                ((rh9) this.x0).b = z;
                super.Kg(z);
                break;
            default:
                super.Kg(z);
                break;
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final boolean Kh(DestinationSuggest destinationSuggest) {
        switch (this.v0) {
            case 0:
                super.Kh(destinationSuggest);
                rh9 rh9Var = (rh9) this.x0;
                rh9Var.a = this.k0.c.c().b.lastIndexOf(destinationSuggest);
                rh9Var.b = false;
                break;
            default:
                super.Kh(destinationSuggest);
                if (destinationSuggest != null) {
                    if (destinationSuggest instanceof Address) {
                        Address address = (Address) destinationSuggest;
                        if (!address.getIsFavorite()) {
                            jst.e.s(new IllegalStateException("Cannot initialize presenter with plain address"));
                        }
                        PlainAddress.Companion.getClass();
                        this.x0 = new PlainAddress(address, address.getAddress());
                        this.w0 = address.getPlaceType();
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public igq0 Mh(DestinationSuggest destinationSuggest) {
        int i = this.v0;
        w4l0 w4l0Var = this.m0;
        u0j u0jVar = tyi.a;
        switch (i) {
            case 0:
                if (destinationSuggest instanceof Address) {
                    u0jVar = new dzi(w4l0Var.j((Address) destinationSuggest));
                }
                return p7b1.d(u0jVar, w4l0Var);
            default:
                if (destinationSuggest != null) {
                    u0jVar = new lzi(destinationSuggest);
                }
                return p7b1.d(u0jVar, w4l0Var);
        }
    }

    public Address Nh() {
        rh9 rh9Var = (rh9) this.x0;
        if (rh9Var.a < 0) {
            return null;
        }
        mav0 mav0Var = this.k0;
        int min = Math.min(rh9Var.a, mav0Var.c.c().b.size() - 1);
        rh9Var.a = min;
        return (Address) kotlin.collections.a.S(min, mav0Var.c.c().b);
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, defpackage.w51, ru.yandex.taxi.search.presenter.e
    public void Qg(itj0 itj0Var) {
        switch (this.v0) {
            case 0:
                ((rh9) this.x0).b = false;
                super.Qg(itj0Var);
                ((msi) this.w0).a(itj0Var);
                break;
            default:
                super.Qg(itj0Var);
                break;
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public void Zg() {
        switch (this.v0) {
            case 0:
                ((rh9) this.x0).b = false;
                super.Zg();
                break;
            default:
                super.Zg();
                break;
        }
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public pv0 dh() {
        switch (this.v0) {
            case 0:
                Address Nh = Nh();
                if (Nh != null) {
                    return new pv0(Nh, null, null, null, null, null, null, null, 1022);
                }
                return null;
            default:
                return super.dh();
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b, com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public void eh(j61 j61Var) {
        int i;
        switch (this.v0) {
            case 1:
                super.eh(j61Var);
                PlaceType placeType = (PlaceType) this.w0;
                if (placeType == null) {
                    ny61.t("attachView() was called prior to setting PlaceType");
                    break;
                } else {
                    if (placeType != PlaceType.HOME) {
                        if (placeType != PlaceType.WORK) {
                            ny61.r("Unknown place type");
                            break;
                        } else {
                            i = kyh0.suggested_favorite_search_hint_work;
                        }
                    } else {
                        i = kyh0.suggested_favorite_search_hint_home;
                    }
                    j61Var.sb(i);
                    break;
                }
            default:
                super.eh(j61Var);
                break;
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b, ru.yandex.taxi.search.presenter.e
    public void onDismiss() {
        switch (this.v0) {
            case 0:
                super.onDismiss();
                rh9 rh9Var = (rh9) this.x0;
                if (rh9Var.b && this.q0.a) {
                    int i = rh9Var.a;
                    mav0 mav0Var = this.k0;
                    if (mav0Var.c.c().b.isEmpty() ? false : mav0Var.a.i(i)) {
                        rh9Var.b = false;
                        rh9Var.a--;
                        break;
                    }
                }
                break;
            default:
                super.onDismiss();
                break;
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.b, defpackage.w51
    public void rh(ic61 ic61Var) {
        List J0;
        switch (this.v0) {
            case 1:
                PlainAddress plainAddress = (PlainAddress) this.x0;
                if (plainAddress != null) {
                    boolean a = ic61Var.a();
                    List list = ic61Var.a;
                    if (a) {
                        J0 = Collections.singletonList(plainAddress);
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() + 1);
                        linkedHashSet.add(plainAddress);
                        linkedHashSet.addAll(list);
                        J0 = kotlin.collections.a.J0(linkedHashSet);
                    }
                    ic61Var = this.G.a(J0);
                }
                super.rh(ic61Var);
                break;
            default:
                super.rh(ic61Var);
                break;
        }
    }

    @Override // defpackage.w51
    public List th() {
        switch (this.v0) {
            case 1:
                PlainAddress plainAddress = (PlainAddress) this.x0;
                if (plainAddress != null) {
                    return Collections.singletonList(plainAddress);
                }
                return null;
            default:
                return super.th();
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public String zh() {
        Address d;
        switch (this.v0) {
            case 0:
                if (this.O.f) {
                    return ((j61) Dg()).getFilter();
                }
                Address Nh = Nh();
                if (Nh != null) {
                    return q5z.F(Nh);
                }
                return null;
            default:
                PlainAddress plainAddress = (PlainAddress) this.x0;
                if (plainAddress == null || (d = this.k0.c.d()) == null || !d.equals(plainAddress)) {
                    return null;
                }
                return q5z.L(plainAddress);
        }
    }

    public /* synthetic */ uh9(ru.yandex.taxi.design.utils.b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, w4l0 w4l0Var, nbv0 nbv0Var, c cVar, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, w4l0Var, nbv0Var, cVar, h51Var, prj0Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, pav0Var, cVar2);
    }
}
