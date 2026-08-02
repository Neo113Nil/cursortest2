package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes13.dex */
public final class r4c0 implements u4c0 {
    public final /* synthetic */ PlacesAddressLoaderModalView a;

    public r4c0(PlacesAddressLoaderModalView placesAddressLoaderModalView) {
        this.a = placesAddressLoaderModalView;
    }

    public final void h(boolean z) {
        s4c0 binding;
        binding = this.a.getBinding();
        qzm qzmVar = binding.b;
        ((AppCompatImageView) qzmVar.f).setVisibility(z ? 0 : 8);
        ((RobotoTextView) qzmVar.g).setVisibility(z ? 0 : 8);
        ((RobotoTextView) qzmVar.b).setVisibility(z ? 0 : 8);
        ((BottomEdgeButtonLayout) qzmVar.e).setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        s4c0 binding;
        l8x l8xVar;
        s4c0 binding2;
        b5c0 b5c0Var = (b5c0) obj;
        PlacesAddressLoaderModalView placesAddressLoaderModalView = this.a;
        binding = placesAddressLoaderModalView.getBinding();
        if (b5c0Var.equals(z4c0.a)) {
            l8xVar = placesAddressLoaderModalView.cancelButtonAppearanceJob;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            placesAddressLoaderModalView.cancelButtonAppearanceJob = null;
            binding2 = placesAddressLoaderModalView.getBinding();
            m2y m2yVar = binding2.c;
            ((CircularProgressBar) m2yVar.e).setVisibility(8);
            ((RobotoTextView) m2yVar.b).setVisibility(8);
            ((ButtonComponent) m2yVar.d).setVisibility(8);
            h(true);
            placesAddressLoaderModalView.hasShownCancelButtonBefore = true;
            return;
        }
        if (!b5c0Var.equals(a5c0.a)) {
            w511.b();
            return;
        }
        h(false);
        m2y m2yVar2 = binding.c;
        CircularProgressBar circularProgressBar = (CircularProgressBar) m2yVar2.e;
        circularProgressBar.setVisibility(0);
        if (circularProgressBar.getAlpha() == 0.0f) {
            cma1.b(1.0f, circularProgressBar);
        }
        ((RobotoTextView) m2yVar2.b).setVisibility(8);
        placesAddressLoaderModalView.setupCancelButton();
    }
}
