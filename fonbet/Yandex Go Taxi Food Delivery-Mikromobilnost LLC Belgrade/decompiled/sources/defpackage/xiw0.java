package defpackage;

import android.widget.ImageView;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;
import ru.yandex.taxi.widget.MaskedShimmeringBar;

/* loaded from: classes14.dex */
public final class xiw0 implements djw0 {
    public final /* synthetic */ SupportDetailsModalView a;

    public xiw0(SupportDetailsModalView supportDetailsModalView) {
        this.a = supportDetailsModalView;
    }

    public final void h() {
        SupportDetailsModalView supportDetailsModalView = this.a;
        yiw0 access$getBinding = SupportDetailsModalView.access$getBinding(supportDetailsModalView);
        xw31.E(access$getBinding.e, null, Integer.valueOf(tje.u(20, supportDetailsModalView.getContext())), null, null);
        MaskedShimmeringBar maskedShimmeringBar = (MaskedShimmeringBar) SupportDetailsModalView.access$getBinding(supportDetailsModalView).b.b;
        if (maskedShimmeringBar.getVisibility() == 0) {
            cma1.L(maskedShimmeringBar);
        }
        m2y m2yVar = access$getBinding.b;
        ImageView imageView = (ImageView) m2yVar.d;
        ImageView imageView2 = (ImageView) m2yVar.e;
        if (imageView2.getVisibility() == 0) {
            cma1.L(imageView2);
        }
        if (imageView.getVisibility() == 0) {
            cma1.L(imageView);
        }
    }
}
