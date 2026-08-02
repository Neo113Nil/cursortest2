package app.cash.local.viewmodels.sheet;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalShortlinkViewModel {
    public final EducationalSheetModelList educationalSheetModelList;

    public LocalShortlinkViewModel(EducationalSheetModelList educationalSheetModelList) {
        this.educationalSheetModelList = educationalSheetModelList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalShortlinkViewModel) && Intrinsics.areEqual(this.educationalSheetModelList, ((LocalShortlinkViewModel) obj).educationalSheetModelList);
    }

    public final int hashCode() {
        EducationalSheetModelList educationalSheetModelList = this.educationalSheetModelList;
        if (educationalSheetModelList == null) {
            return 0;
        }
        return educationalSheetModelList.hashCode();
    }

    public final String toString() {
        return "LocalShortlinkViewModel(educationalSheetModelList=" + this.educationalSheetModelList + ")";
    }
}
