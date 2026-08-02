package app.cash.local.presenters.sheet;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.protos.cash.local.client.v1.EducationalSheetText;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class EducationalSheetPresenterKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[EducationalSheetText.Style.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            SliceStatus.Companion companion = EducationalSheetText.Style.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            SliceStatus.Companion companion2 = EducationalSheetText.Style.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            SliceStatus.Companion companion3 = EducationalSheetText.Style.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            SliceStatus.Companion companion4 = EducationalSheetText.Style.Companion;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            SliceStatus.Companion companion5 = EducationalSheetText.Style.Companion;
            iArr[6] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            SliceStatus.Companion companion6 = EducationalSheetText.Style.Companion;
            iArr[2] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            SliceStatus.Companion companion7 = EducationalSheetText.Style.Companion;
            iArr[7] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EducationalSheetButton.Style.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            Origin.Companion companion8 = EducationalSheetButton.Style.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            Origin.Companion companion9 = EducationalSheetButton.Style.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
