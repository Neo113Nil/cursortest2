package com.squareup.cash.investing.presenters.categories;

import com.squareup.cash.investing.viewmodels.categories.FilterCategoriesViewModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingFilterCategoriesPresenter$models$1$3 implements Function1 {
    public static final InvestingFilterCategoriesPresenter$models$1$3 INSTANCE = new InvestingFilterCategoriesPresenter$models$1$3();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FilterCategoriesViewModel.ChoiceRowModel choiceRowModel = (FilterCategoriesViewModel.ChoiceRowModel) obj;
        choiceRowModel.getClass();
        return choiceRowModel.label;
    }
}
