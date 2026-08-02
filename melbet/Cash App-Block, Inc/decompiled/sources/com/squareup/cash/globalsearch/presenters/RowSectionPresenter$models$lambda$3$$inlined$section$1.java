package com.squareup.cash.globalsearch.presenters;

import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class RowSectionPresenter$models$lambda$3$$inlined$section$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final RowSectionPresenter$models$lambda$3$$inlined$section$1 INSTANCE$1 = new RowSectionPresenter$models$lambda$3$$inlined$section$1(1);
    public static final RowSectionPresenter$models$lambda$3$$inlined$section$1 INSTANCE = new RowSectionPresenter$models$lambda$3$$inlined$section$1(0);

    public /* synthetic */ RowSectionPresenter$models$lambda$3$$inlined$section$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                GlobalSearchResponseSectionModel globalSearchResponseSectionModel = (GlobalSearchResponseSectionModel) obj;
                globalSearchResponseSectionModel.getClass();
                return (GlobalSearchResponseSectionModel.Rows) globalSearchResponseSectionModel;
            default:
                GlobalSearchResponseSectionModel globalSearchResponseSectionModel2 = (GlobalSearchResponseSectionModel) obj;
                globalSearchResponseSectionModel2.getClass();
                return (GlobalSearchResponseSectionModel.Activities) globalSearchResponseSectionModel2;
        }
    }
}
