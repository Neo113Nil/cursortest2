package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.tariffcard.ui.view.TariffCardScrollButtonView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;

/* loaded from: classes14.dex */
public final class thx0 implements zo31 {
    public final TariffOptionsCardView a;
    public final FrameLayout b;
    public final TariffCardScrollButtonView c;
    public final RecyclerView d;
    public final LinearLayout e;
    public final GoImageView f;
    public final Space g;
    public final FloatButtonIconComponent h;
    public final OrderButtonComponent i;
    public final CompositePaymentIconsView j;
    public final View k;

    public thx0(TariffOptionsCardView tariffOptionsCardView, FrameLayout frameLayout, TariffCardScrollButtonView tariffCardScrollButtonView, ImageView imageView, RecyclerView recyclerView, LinearLayout linearLayout, GoImageView goImageView, Space space, FloatButtonIconComponent floatButtonIconComponent, OrderButtonComponent orderButtonComponent, CompositePaymentIconsView compositePaymentIconsView, View view) {
        this.a = tariffOptionsCardView;
        this.b = frameLayout;
        this.c = tariffCardScrollButtonView;
        this.d = recyclerView;
        this.e = linearLayout;
        this.f = goImageView;
        this.g = space;
        this.h = floatButtonIconComponent;
        this.i = orderButtonComponent;
        this.j = compositePaymentIconsView;
        this.k = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
