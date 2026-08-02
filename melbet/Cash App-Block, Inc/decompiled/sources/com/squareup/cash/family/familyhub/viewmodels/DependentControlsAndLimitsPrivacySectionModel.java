package com.squareup.cash.family.familyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentControlsAndLimitsPrivacySectionModel {
    public final String body;
    public final String label;
    public final Integer numOfBlockedAccounts;
    public final String title;

    public DependentControlsAndLimitsPrivacySectionModel(Integer num, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.label = str2;
        this.body = str3;
        this.numOfBlockedAccounts = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlsAndLimitsPrivacySectionModel)) {
            return false;
        }
        DependentControlsAndLimitsPrivacySectionModel dependentControlsAndLimitsPrivacySectionModel = (DependentControlsAndLimitsPrivacySectionModel) obj;
        return Intrinsics.areEqual(this.title, dependentControlsAndLimitsPrivacySectionModel.title) && Intrinsics.areEqual(this.label, dependentControlsAndLimitsPrivacySectionModel.label) && this.body.equals(dependentControlsAndLimitsPrivacySectionModel.body) && Intrinsics.areEqual(this.numOfBlockedAccounts, dependentControlsAndLimitsPrivacySectionModel.numOfBlockedAccounts);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.label), 31, this.body);
        Integer num = this.numOfBlockedAccounts;
        return m + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentControlsAndLimitsPrivacySectionModel(title=", this.title, ", label=", this.label, ", body=");
        m.append(this.body);
        m.append(", numOfBlockedAccounts=");
        m.append(this.numOfBlockedAccounts);
        m.append(")");
        return m.toString();
    }
}
