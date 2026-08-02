package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyMemberSection {
    public final ArrayList familyMemberRows;
    public final String headerButtonText;
    public final String headerText;

    public FamilyMemberSection(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.headerText = str;
        this.headerButtonText = str2;
        this.familyMemberRows = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyMemberSection)) {
            return false;
        }
        FamilyMemberSection familyMemberSection = (FamilyMemberSection) obj;
        return Intrinsics.areEqual(this.headerText, familyMemberSection.headerText) && Intrinsics.areEqual(this.headerButtonText, familyMemberSection.headerButtonText) && this.familyMemberRows.equals(familyMemberSection.familyMemberRows);
    }

    public final int hashCode() {
        int hashCode = this.headerText.hashCode() * 31;
        String str = this.headerButtonText;
        return this.familyMemberRows.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FamilyMemberSection(headerText=", this.headerText, ", headerButtonText=", this.headerButtonText, ", familyMemberRows="), this.familyMemberRows);
    }
}
