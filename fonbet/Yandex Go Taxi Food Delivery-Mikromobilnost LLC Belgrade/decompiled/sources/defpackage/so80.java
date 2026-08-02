package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class so80 implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final GoView c;
    public final DotsIndicatorComponent d;
    public final CompressionResistantListComponent e;
    public final ViewPager2 f;
    public final GoFrameLayout g;
    public final CompressionResistantListComponent h;
    public final RobotoTextView i;

    public so80(LinearLayout linearLayout, RobotoTextView robotoTextView, GoView goView, DotsIndicatorComponent dotsIndicatorComponent, CompressionResistantListComponent compressionResistantListComponent, ViewPager2 viewPager2, GoFrameLayout goFrameLayout, CompressionResistantListComponent compressionResistantListComponent2, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = goView;
        this.d = dotsIndicatorComponent;
        this.e = compressionResistantListComponent;
        this.f = viewPager2;
        this.g = goFrameLayout;
        this.h = compressionResistantListComponent2;
        this.i = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
