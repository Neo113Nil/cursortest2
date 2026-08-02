package defpackage;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class rij0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequirementRoundedCornersUiState.values().length];
        try {
            iArr[RequirementRoundedCornersUiState.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementRoundedCornersUiState.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequirementRoundedCornersUiState.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequirementRoundedCornersUiState.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
