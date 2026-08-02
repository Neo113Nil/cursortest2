package defpackage;

import com.yandex.go.places.impl.ui.sorting.OrganizationsSortingModalView;

/* loaded from: classes13.dex */
public final class tp80 implements wp80 {
    public final /* synthetic */ OrganizationsSortingModalView a;

    public tp80(OrganizationsSortingModalView organizationsSortingModalView) {
        this.a = organizationsSortingModalView;
    }

    @Override // defpackage.wp80
    public final void He(bq80 bq80Var) {
        CharSequence charSequence = bq80Var.a;
        OrganizationsSortingModalView organizationsSortingModalView = this.a;
        if (charSequence != null) {
            OrganizationsSortingModalView.access$getBinding(organizationsSortingModalView).b.setVisibility(0);
            OrganizationsSortingModalView.access$getBinding(organizationsSortingModalView).b.setText(bq80Var.a);
        } else {
            OrganizationsSortingModalView.access$getBinding(organizationsSortingModalView).b.setVisibility(8);
        }
        organizationsSortingModalView.getOrganizationsSortingListAdapter().submitList(bq80Var.b, null);
    }
}
