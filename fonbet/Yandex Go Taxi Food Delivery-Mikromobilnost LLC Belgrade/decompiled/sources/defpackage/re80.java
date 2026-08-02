package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.PlacesOrganizationCardNestedScrollView;

/* loaded from: classes13.dex */
public final class re80 implements zo31 {
    public final GoFrameLayout a;
    public final AppCompatImageView b;
    public final ViewStub c;
    public final ViewStub d;
    public final FrameLayout e;
    public final PlacesOrganizationCardNestedScrollView f;

    public re80(GoFrameLayout goFrameLayout, AppCompatImageView appCompatImageView, ViewStub viewStub, ViewStub viewStub2, FrameLayout frameLayout, PlacesOrganizationCardNestedScrollView placesOrganizationCardNestedScrollView) {
        this.a = goFrameLayout;
        this.b = appCompatImageView;
        this.c = viewStub;
        this.d = viewStub2;
        this.e = frameLayout;
        this.f = placesOrganizationCardNestedScrollView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
