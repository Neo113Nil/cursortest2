package defpackage;

import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;

/* loaded from: classes3.dex */
public final /* synthetic */ class z8b0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PfmCategoriesView b;

    public /* synthetic */ z8b0(PfmCategoriesView pfmCategoriesView, int i) {
        this.a = i;
        this.b = pfmCategoriesView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        l59 categoriesAdapter$lambda$4;
        boolean z;
        int i = this.a;
        PfmCategoriesView pfmCategoriesView = this.b;
        switch (i) {
            case 0:
                categoriesAdapter$lambda$4 = PfmCategoriesView.categoriesAdapter$lambda$4(pfmCategoriesView);
                return categoriesAdapter$lambda$4;
            default:
                z = pfmCategoriesView.shouldAnimateCategorySize;
                return Boolean.valueOf(z);
        }
    }
}
