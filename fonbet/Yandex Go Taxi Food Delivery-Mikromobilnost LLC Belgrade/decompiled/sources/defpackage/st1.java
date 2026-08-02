package defpackage;

import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$FeedbackBadgeType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class st1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeedbackBadgeChoice$FeedbackBadgeType.values().length];
        try {
            iArr[FeedbackBadgeChoice$FeedbackBadgeType.ACHIEVEMENT_ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedbackBadgeChoice$FeedbackBadgeType.TAG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeedbackBadgeChoice$FeedbackBadgeType.TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
