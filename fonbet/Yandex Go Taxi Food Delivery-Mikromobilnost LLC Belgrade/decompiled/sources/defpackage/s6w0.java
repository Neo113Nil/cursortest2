package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.DiscoveryMapSearchbarAnimatedTextView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class s6w0 implements zo31 {
    public final SuperAppMapSearchbarView a;
    public final GoLinearLayout b;
    public final GoLinearLayout c;
    public final RobotoTextView d;
    public final DiscoveryMapSearchbarAnimatedTextView e;
    public final GoLinearLayout f;

    public s6w0(SuperAppMapSearchbarView superAppMapSearchbarView, GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, RobotoTextView robotoTextView, DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView, GoLinearLayout goLinearLayout3) {
        this.a = superAppMapSearchbarView;
        this.b = goLinearLayout;
        this.c = goLinearLayout2;
        this.d = robotoTextView;
        this.e = discoveryMapSearchbarAnimatedTextView;
        this.f = goLinearLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
