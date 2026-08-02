package ru.yandex.taxi.search.presenter;

import android.view.View;
import com.yandex.go.coroutines.h;
import com.yandex.go.search.address.model.Service;
import defpackage.bvf0;
import defpackage.j51;
import defpackage.j61;
import defpackage.k8v0;
import defpackage.pv0;
import defpackage.tje;
import defpackage.x9v0;
import defpackage.yn0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;

/* loaded from: classes6.dex */
public abstract class f extends e {
    public final ru.yandex.taxi.design.utils.b B;
    public final ru.yandex.taxi.search.c C;
    public boolean D;
    public final h E;
    public final r0 F;

    public f(ru.yandex.taxi.design.utils.b bVar, j51 j51Var, ru.yandex.taxi.search.c cVar) {
        super(j51Var);
        this.B = bVar;
        this.C = cVar;
        this.E = new h(new BaseAddressSearchPresenter$inputBg$1(this, null));
        this.F = bvf0.c(Service.UNDEFINED);
    }

    public void N0(int i) {
    }

    public void bc(k8v0 k8v0Var) {
    }

    public pv0 dh() {
        return null;
    }

    public void eh(j61 j61Var) {
        Bg(j61Var);
        tje.N(Jg(), null, null, new BaseAddressSearchPresenter$attachView$1(j61Var, this, null), 3);
        qh();
    }

    public void fh(yn0 yn0Var, String str, String str2, Events$Suggest$ZeroSuggestAdditionalTapArea events$Suggest$ZeroSuggestAdditionalTapArea) {
    }

    public void gh(String str, String str2) {
    }

    public void hh() {
    }

    public void hideKeyboard() {
    }

    public void ih(x9v0 x9v0Var) {
        int i = x9v0Var.a;
        int i2 = x9v0Var.a;
        j51 j51Var = this.x;
        if (i != -1) {
            showProgress();
            Sg(j51Var.e(i2, false, this.D));
        } else {
            if (i == -1) {
                return;
            }
            showProgress();
            Sg(j51Var.e(i2, false, false));
        }
    }

    public void jh() {
    }

    public void kh() {
    }

    public void lh() {
    }

    public void mh() {
        throw new UnsupportedOperationException();
    }

    public void nh(pv0 pv0Var) {
        throw new UnsupportedOperationException();
    }

    public void oh(String str) {
        throw new UnsupportedOperationException();
    }

    public final void ph(View view) {
        tje.N(Jg(), null, null, new BaseAddressSearchPresenter$setViewShadow$1(this, view, null), 3);
    }

    public void qh() {
        tje.N(Jg(), null, null, new BaseAddressSearchPresenter$showInput$1(this, null), 3);
    }

    public void s7(k8v0 k8v0Var) {
    }

    public void showKeyboard() {
    }
}
