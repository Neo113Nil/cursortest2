package com.squareup.cash.securityhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecoveryGuideViewModel {
    public final String navigationTitle;
    public final String pageHeaderBody;
    public final String pageHeaderTitle;
    public final List sections;

    public RecoveryGuideViewModel(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.navigationTitle = str;
        this.pageHeaderTitle = str2;
        this.pageHeaderBody = str3;
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoveryGuideViewModel)) {
            return false;
        }
        RecoveryGuideViewModel recoveryGuideViewModel = (RecoveryGuideViewModel) obj;
        return Intrinsics.areEqual(this.navigationTitle, recoveryGuideViewModel.navigationTitle) && Intrinsics.areEqual(this.pageHeaderTitle, recoveryGuideViewModel.pageHeaderTitle) && Intrinsics.areEqual(this.pageHeaderBody, recoveryGuideViewModel.pageHeaderBody) && Intrinsics.areEqual(this.sections, recoveryGuideViewModel.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.navigationTitle.hashCode() * 31, 31, this.pageHeaderTitle), 31, this.pageHeaderBody);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecoveryGuideViewModel(navigationTitle=", this.navigationTitle, ", pageHeaderTitle=", this.pageHeaderTitle, ", pageHeaderBody=");
        m.append(this.pageHeaderBody);
        m.append(", sections=");
        m.append(this.sections);
        m.append(")");
        return m.toString();
    }
}
