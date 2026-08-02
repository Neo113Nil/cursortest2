package com.squareup.cash.recurringpayments.viewmodels;

import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SelectCadenceViewModel {
    public final ArrayList cadenceOptions;
    public final FormBlocker.Element.LocalImageElement.Icon icon;
    public final String subtitle;
    public final String title;

    public SelectCadenceViewModel(FormBlocker.Element.LocalImageElement.Icon icon, String str, String str2, ArrayList arrayList) {
        icon.getClass();
        str.getClass();
        str2.getClass();
        this.icon = icon;
        this.title = str;
        this.subtitle = str2;
        this.cadenceOptions = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectCadenceViewModel)) {
            return false;
        }
        SelectCadenceViewModel selectCadenceViewModel = (SelectCadenceViewModel) obj;
        return this.icon == selectCadenceViewModel.icon && Intrinsics.areEqual(this.title, selectCadenceViewModel.title) && Intrinsics.areEqual(this.subtitle, selectCadenceViewModel.subtitle) && this.cadenceOptions.equals(selectCadenceViewModel.cadenceOptions);
    }

    public final int hashCode() {
        return this.cadenceOptions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle);
    }

    public final String toString() {
        return "SelectCadenceViewModel(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", cadenceOptions=" + this.cadenceOptions + ")";
    }
}
