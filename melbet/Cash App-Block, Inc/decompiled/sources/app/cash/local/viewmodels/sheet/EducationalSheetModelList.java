package app.cash.local.viewmodels.sheet;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class EducationalSheetModelList {
    public final List sheets;
    public final boolean showProgressBar;
    public final boolean workingAsync;

    public EducationalSheetModelList(List list, boolean z, boolean z2) {
        list.getClass();
        this.sheets = list;
        this.showProgressBar = z;
        this.workingAsync = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationalSheetModelList)) {
            return false;
        }
        EducationalSheetModelList educationalSheetModelList = (EducationalSheetModelList) obj;
        return Intrinsics.areEqual(this.sheets, educationalSheetModelList.sheets) && this.showProgressBar == educationalSheetModelList.showProgressBar && this.workingAsync == educationalSheetModelList.workingAsync;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.workingAsync) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sheets.hashCode() * 31, 31, this.showProgressBar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationalSheetModelList(sheets=");
        sb.append(this.sheets);
        sb.append(", showProgressBar=");
        sb.append(this.showProgressBar);
        sb.append(", workingAsync=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.workingAsync, ")");
    }
}
