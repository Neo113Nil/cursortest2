package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.compose.ui.semantics.f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import com.yandex.alicekit.core.permissions.b;
import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView;
import com.yandex.plus.home.feature.webviews.internal.stories.list.WebStoriesContainer;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.OfferSwitchView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes14.dex */
public final class xzr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public xzr(int i, zxu zxuVar) {
        this.a = 0;
        this.b = i;
        this.c = zxuVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dfc0 dfc0Var;
        int i;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                mnq0 mnq0Var = (mnq0) obj;
                f.k(mnq0Var, new icc(i3, 0));
                zxu zxuVar = (zxu) obj2;
                String str = zxuVar.h;
                if (str == null) {
                    str = zxuVar.b;
                }
                f.l(mnq0Var, str);
                f.q(mnq0Var, zxuVar.j);
                f.p(mnq0Var, 0);
                return zy11Var;
            case 1:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = ((OfferSwitchView) obj2).findViewById(i3);
                    if (findViewById != null) {
                        return (MaterialCardView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 2:
                ((b) obj2).d(i3);
                return zy11Var;
            case 3:
                a76 a76Var = (a76) obj;
                PlacesSearchbarContainerView placesSearchbarContainerView = (PlacesSearchbarContainerView) obj2;
                y66 y66Var = (y66) (a76Var instanceof y66 ? a76Var : null);
                float measuredHeight = placesSearchbarContainerView.getMeasuredHeight();
                int i4 = y66Var != null ? y66Var.a : 0;
                BlurEffect$CoordinatesType blurEffect$CoordinatesType = BlurEffect$CoordinatesType.Relative;
                dfc0Var = placesSearchbarContainerView.searchbarViewDimens;
                float f = (measuredHeight - i3) - dfc0Var.c.c;
                i = placesSearchbarContainerView.blurTopOffset;
                return ngd0.w(i4, blurEffect$CoordinatesType, f - i, y66Var != null ? y66Var.d : 0.0f, measuredHeight, y66Var != null ? y66Var.f : 1.0f, null, 192);
            case 4:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = ((PresaleFragment) obj2).requireView().findViewById(i3);
                    if (findViewById2 != null) {
                        return (PresaleContentView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 5:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = ((ProgressView) obj2).findViewById(i3);
                    if (findViewById3 != null) {
                        return (ProgressBar) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 6:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = ((WebStoriesContainer) obj2).findViewById(i3);
                    if (findViewById4 != null) {
                        return (ViewPager2) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            default:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById5 = ((WebViewContainer) obj2).findViewById(i3);
                    if (findViewById5 != null) {
                        return (WebView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
        }
    }

    public /* synthetic */ xzr(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
