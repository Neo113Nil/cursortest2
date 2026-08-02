package com.squareup.cash.family.familyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyListSection {
    public final List groups;
    public final String headerButtonText;
    public final String headerButtonUrl;
    public final String headerText;

    public FamilyListSection(String str, String str2, String str3, List list) {
        str.getClass();
        list.getClass();
        this.headerText = str;
        this.headerButtonText = str2;
        this.headerButtonUrl = str3;
        this.groups = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyListSection)) {
            return false;
        }
        FamilyListSection familyListSection = (FamilyListSection) obj;
        return Intrinsics.areEqual(this.headerText, familyListSection.headerText) && Intrinsics.areEqual(this.headerButtonText, familyListSection.headerButtonText) && Intrinsics.areEqual(this.headerButtonUrl, familyListSection.headerButtonUrl) && Intrinsics.areEqual(this.groups, familyListSection.groups);
    }

    public final int hashCode() {
        int hashCode = this.headerText.hashCode() * 31;
        String str = this.headerButtonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerButtonUrl;
        return this.groups.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FamilyListSection(headerText=", this.headerText, ", headerButtonText=", this.headerButtonText, ", headerButtonUrl=");
        m.append(this.headerButtonUrl);
        m.append(", groups=");
        m.append(this.groups);
        m.append(")");
        return m.toString();
    }
}
