package com.squareup.cash.profile.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CategoryGroupSectionViewModel implements NotificationSectionViewModel {
    public final List categories;
    public final Function1 onClicked;
    public final String title;

    public CategoryGroupSectionViewModel(List list, String str, Function1 function1) {
        str.getClass();
        this.categories = list;
        this.title = str;
        this.onClicked = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryGroupSectionViewModel)) {
            return false;
        }
        CategoryGroupSectionViewModel categoryGroupSectionViewModel = (CategoryGroupSectionViewModel) obj;
        return this.categories.equals(categoryGroupSectionViewModel.categories) && Intrinsics.areEqual(this.title, categoryGroupSectionViewModel.title) && this.onClicked.equals(categoryGroupSectionViewModel.onClicked);
    }

    public final int hashCode() {
        return this.onClicked.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.categories.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("CategoryGroupSectionViewModel(categories=", ", title=", this.title, ", onClicked=", this.categories);
        m.append(this.onClicked);
        m.append(")");
        return m.toString();
    }
}
