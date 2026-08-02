package com.squareup.cash.securityhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationCardUiModel {
    public final EducationCardId id;
    public final String imageUrl;
    public final String title;

    public EducationCardUiModel(EducationCardId educationCardId, String str, String str2) {
        str.getClass();
        this.id = educationCardId;
        this.title = str;
        this.imageUrl = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationCardUiModel)) {
            return false;
        }
        EducationCardUiModel educationCardUiModel = (EducationCardUiModel) obj;
        return this.id == educationCardUiModel.id && Intrinsics.areEqual(this.title, educationCardUiModel.title) && Intrinsics.areEqual(this.imageUrl, educationCardUiModel.imageUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        String str = this.imageUrl;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationCardUiModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", imageUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.imageUrl, ")");
    }
}
