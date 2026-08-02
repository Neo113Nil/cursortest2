package com.squareup.cash.securityhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProtectionsSectionUiModel {
    public final List educationCards;
    public final List supportRows;
    public final String supportSectionTitle;

    public ProtectionsSectionUiModel(String str, List list, List list2) {
        list.getClass();
        str.getClass();
        list2.getClass();
        this.educationCards = list;
        this.supportSectionTitle = str;
        this.supportRows = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtectionsSectionUiModel)) {
            return false;
        }
        ProtectionsSectionUiModel protectionsSectionUiModel = (ProtectionsSectionUiModel) obj;
        return Intrinsics.areEqual(this.educationCards, protectionsSectionUiModel.educationCards) && Intrinsics.areEqual(this.supportSectionTitle, protectionsSectionUiModel.supportSectionTitle) && Intrinsics.areEqual(this.supportRows, protectionsSectionUiModel.supportRows);
    }

    public final int hashCode() {
        return this.supportRows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.educationCards.hashCode() * 31, 31, this.supportSectionTitle);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(Request$Priority$EnumUnboxingLocalUtility.m("ProtectionsSectionUiModel(educationCards=", ", supportSectionTitle=", this.supportSectionTitle, ", supportRows=", this.educationCards), this.supportRows, ")");
    }
}
