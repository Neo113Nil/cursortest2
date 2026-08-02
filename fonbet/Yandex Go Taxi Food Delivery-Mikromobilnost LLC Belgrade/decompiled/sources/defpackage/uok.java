package defpackage;

import com.ybsdk.feature.educations.api.domain.EducationDivkitContentPositionEntity;
import com.ybsdk.feature.educations.api.domain.EducationScrollScreenEdgeEntity;
import com.ybsdk.feature.educations.api.domain.EducationScrollSnapPreferenceEntity;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipBehaviour;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class uok {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[EducationDivkitContentPositionEntity.values().length];
        try {
            iArr[EducationDivkitContentPositionEntity.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EducationDivkitContentPositionEntity.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EducationDivkitContentPositionEntity.CONTENT_RELATED_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EducationDivkitContentPositionEntity.CONTENT_RELATED_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[EducationsTooltipEntity$EducationsTooltipBehaviour.values().length];
        try {
            iArr2[EducationsTooltipEntity$EducationsTooltipBehaviour.ABOVE_ANCHOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EducationsTooltipEntity$EducationsTooltipBehaviour.UNDER_ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[EducationScrollScreenEdgeEntity.values().length];
        try {
            iArr3[EducationScrollScreenEdgeEntity.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[EducationScrollScreenEdgeEntity.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[EducationScrollSnapPreferenceEntity.values().length];
        try {
            iArr4[EducationScrollSnapPreferenceEntity.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[EducationScrollSnapPreferenceEntity.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
