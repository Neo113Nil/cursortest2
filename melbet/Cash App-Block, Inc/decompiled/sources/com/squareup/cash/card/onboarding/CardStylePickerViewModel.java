package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardStylePickerViewModel {
    public final ArrayList headers;
    public final ArrayList sections;
    public final String short_title_text;
    public final String title_text;

    public CardStylePickerViewModel(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        this.title_text = str;
        this.short_title_text = str2;
        this.headers = arrayList;
        this.sections = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStylePickerViewModel)) {
            return false;
        }
        CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj;
        return Intrinsics.areEqual(this.title_text, cardStylePickerViewModel.title_text) && Intrinsics.areEqual(this.short_title_text, cardStylePickerViewModel.short_title_text) && this.headers.equals(cardStylePickerViewModel.headers) && this.sections.equals(cardStylePickerViewModel.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.headers, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title_text.hashCode() * 31, 31, this.short_title_text), 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardStylePickerViewModel(title_text=", this.title_text, ", short_title_text=", this.short_title_text, ", headers=");
        m.append(this.headers);
        m.append(", sections=");
        m.append(this.sections);
        m.append(")");
        return m.toString();
    }
}
