package com.squareup.cash.recurringpayments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class SelectDayOfCadenceViewModel {
    public final ArrayList dayOfCadenceOptions;
    public final String subtitle;
    public final String title;

    public SelectDayOfCadenceViewModel(String str, String str2, ArrayList arrayList) {
        this.title = str;
        this.subtitle = str2;
        this.dayOfCadenceOptions = arrayList;
        if (arrayList.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDayOfCadenceViewModel)) {
            return false;
        }
        SelectDayOfCadenceViewModel selectDayOfCadenceViewModel = (SelectDayOfCadenceViewModel) obj;
        return this.title.equals(selectDayOfCadenceViewModel.title) && this.subtitle.equals(selectDayOfCadenceViewModel.subtitle) && this.dayOfCadenceOptions.equals(selectDayOfCadenceViewModel.dayOfCadenceOptions);
    }

    public final int hashCode() {
        return this.dayOfCadenceOptions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectDayOfCadenceViewModel(title=", this.title, ", subtitle=", this.subtitle, ", dayOfCadenceOptions="), this.dayOfCadenceOptions);
    }
}
