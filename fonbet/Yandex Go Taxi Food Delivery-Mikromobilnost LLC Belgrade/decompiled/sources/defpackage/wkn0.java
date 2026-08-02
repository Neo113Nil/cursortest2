package defpackage;

import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class wkn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeedbackSettingsParams$Screen.values().length];
        try {
            iArr[FeedbackSettingsParams$Screen.FINISH_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedbackSettingsParams$Screen.CANCEL_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
