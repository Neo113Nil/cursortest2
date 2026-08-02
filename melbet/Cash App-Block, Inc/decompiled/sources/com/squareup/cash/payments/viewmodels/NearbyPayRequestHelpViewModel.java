package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPayRequestHelpViewModel {
    public final String moreInfoButtonText;
    public final List steps;
    public final String subtitle;
    public final String title;

    public NearbyPayRequestHelpViewModel(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        this.title = str;
        this.subtitle = str2;
        this.steps = list;
        this.moreInfoButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPayRequestHelpViewModel)) {
            return false;
        }
        NearbyPayRequestHelpViewModel nearbyPayRequestHelpViewModel = (NearbyPayRequestHelpViewModel) obj;
        return Intrinsics.areEqual(this.title, nearbyPayRequestHelpViewModel.title) && Intrinsics.areEqual(this.subtitle, nearbyPayRequestHelpViewModel.subtitle) && Intrinsics.areEqual(this.steps, nearbyPayRequestHelpViewModel.steps) && Intrinsics.areEqual(this.moreInfoButtonText, nearbyPayRequestHelpViewModel.moreInfoButtonText);
    }

    public final int hashCode() {
        return this.moreInfoButtonText.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.steps);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyPayRequestHelpViewModel(title=", this.title, ", subtitle=", this.subtitle, ", steps=");
        m.append(this.steps);
        m.append(", moreInfoButtonText=");
        m.append(this.moreInfoButtonText);
        m.append(")");
        return m.toString();
    }
}
