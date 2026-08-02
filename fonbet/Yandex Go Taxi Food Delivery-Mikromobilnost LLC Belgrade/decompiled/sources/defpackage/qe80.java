package defpackage;

import android.view.ViewGroup;
import com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.PlacesOrganizationCardNestedScrollView;
import com.yandex.go.places.organization.card.impl.ui.gallery.OrganizationCardGalleryView;
import java.util.List;

/* loaded from: classes13.dex */
public final class qe80 implements ye80 {
    public final /* synthetic */ OrganizationCardFlexModalView a;

    public qe80(OrganizationCardFlexModalView organizationCardFlexModalView) {
        this.a = organizationCardFlexModalView;
    }

    @Override // defpackage.xg00
    public final void b(float f, boolean z) {
        MapControlButtonsContainerView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateCompassButton(z, f);
    }

    @Override // defpackage.xg00
    public final void c(boolean z) {
        MapControlButtonsContainerView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateLocationFocusingButton(z);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        OrganizationCardGalleryView galleryView;
        jsj jsjVar;
        OrganizationCardGalleryView galleryView2;
        int visibleGalleryHeight;
        OrganizationCardGalleryView galleryView3;
        x3 x3Var = (x3) obj;
        boolean z = x3Var instanceof gf80;
        OrganizationCardFlexModalView organizationCardFlexModalView = this.a;
        if (z) {
            PlacesOrganizationCardNestedScrollView placesOrganizationCardNestedScrollView = OrganizationCardFlexModalView.access$getBinding(organizationCardFlexModalView).f;
            visibleGalleryHeight = organizationCardFlexModalView.getVisibleGalleryHeight();
            placesOrganizationCardNestedScrollView.setThreshold(visibleGalleryHeight);
            galleryView3 = organizationCardFlexModalView.getGalleryView();
            if (galleryView3 != null) {
                galleryView3.setContent$impl((List) x3Var.b, null, true);
                return;
            }
            return;
        }
        if (!(x3Var instanceof hf80)) {
            if (!(x3Var instanceof if80)) {
                w511.b();
                return;
            }
            galleryView = organizationCardFlexModalView.getGalleryView();
            if (galleryView != null) {
                galleryView.setContent$impl((List) x3Var.b, null, false);
                return;
            }
            return;
        }
        jsjVar = organizationCardFlexModalView.flexOrganizationCardContainer;
        ViewGroup viewGroup = jsjVar.a;
        if (viewGroup.getLayoutParams().height != -1) {
            viewGroup.getLayoutParams().height = -1;
            viewGroup.requestLayout();
        }
        galleryView2 = organizationCardFlexModalView.getGalleryView();
        if (galleryView2 != null) {
            galleryView2.setContent$impl((List) x3Var.b, null, false);
        }
    }

    @Override // defpackage.ye80
    public final void scrollToTop() {
        OrganizationCardFlexModalView.access$getBinding(this.a).f.smoothScrollTo(0, 0);
    }

    @Override // defpackage.ye80
    public final void selectGalleryItem(int i, boolean z) {
        OrganizationCardGalleryView galleryView;
        galleryView = this.a.getGalleryView();
        if (galleryView != null) {
            galleryView.selectGalleryItem(i, false);
        }
    }
}
