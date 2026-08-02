package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;

/* loaded from: classes14.dex */
public final class ui31 implements zo31 {
    public final VerticalTariffSelectorView a;
    public final ViewPager2 b;
    public final View c;

    public ui31(VerticalTariffSelectorView verticalTariffSelectorView, ViewPager2 viewPager2, View view) {
        this.a = verticalTariffSelectorView;
        this.b = viewPager2;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
