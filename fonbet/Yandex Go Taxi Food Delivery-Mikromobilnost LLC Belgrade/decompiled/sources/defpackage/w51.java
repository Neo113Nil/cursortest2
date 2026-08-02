package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.search.common.presenter.AddressSearchPresenterWithZeroSuggests$loadDefaultSuggests$$inlined$safeCollectIn$1;
import com.yandex.go.suggest.DestinationSuggest;
import java.util.List;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;
import ru.yandex.taxi.search.presenter.f;

/* loaded from: classes12.dex */
public abstract class w51 extends f {
    public final i G;
    public final rwp0 H;
    public final prj0 I;
    public boolean J;
    public pzt0 K;

    public w51(b bVar, v7b0 v7b0Var, c cVar, i iVar, rwp0 rwp0Var, prj0 prj0Var) {
        super(bVar, v7b0Var, cVar);
        this.G = iVar;
        this.H = rwp0Var;
        this.I = prj0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (((Boolean) ((qqo) this.I.a.getValue()).b()).booleanValue()) {
            this.H.d.set(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // ru.yandex.taxi.search.presenter.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tpr Mg(x9v0 x9v0Var) {
        Address address;
        if (!this.J) {
            i iVar = this.G;
            if (!iVar.k.a()) {
                int i = x9v0Var.a;
                List list = iVar.k.a;
                if (vez0.g0(i, "Default suggest index is out of bounds", list)) {
                    DestinationSuggest destinationSuggest = (DestinationSuggest) list.get(i);
                    if (destinationSuggest instanceof Address) {
                        address = (Address) destinationSuggest;
                        return address == null ? new g92(2, address) : pvn.a;
                    }
                }
                address = null;
                if (address == null) {
                }
            }
        }
        return super.Mg(x9v0Var);
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public void Qg(itj0 itj0Var) {
        this.J = !itj0Var.d.isEmpty();
        super.Qg(itj0Var);
    }

    public void rh(ic61 ic61Var) {
        if (Eg()) {
            if (!this.J || ((j61) Dg()).Xd()) {
                this.J = false;
                uh(ic61Var.b);
            }
        }
    }

    public void sh(Throwable th) {
        jst.e.k(th, "Error while loading suggests");
        String filter = ((j61) Dg()).getFilter();
        if (filter == null || filter.length() == 0) {
            ((j61) Dg()).a9();
        } else {
            Sg(this.x.b(filter));
        }
    }

    public List th() {
        return null;
    }

    public void uh(List list) {
        List wh = wh(list);
        if (wh.isEmpty()) {
            ((j61) Dg()).a9();
        } else {
            ((j61) Dg()).y2(wh);
        }
    }

    public final void vh() {
        this.J = false;
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = tje.N(Jg(), null, null, new AddressSearchPresenterWithZeroSuggests$loadDefaultSuggests$$inlined$safeCollectIn$1(this.G.b(th(), this.H.b), com.yandex.go.coroutines.b.e(), null, this), 3);
    }

    public List wh(List list) {
        return list;
    }
}
