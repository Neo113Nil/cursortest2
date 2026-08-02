package ru.yandex.taxi.scooters.presentation.feedback.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nsq;
import defpackage.wuq;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackSettingsParams$Screen", "", "Lru/yandex/taxi/scooters/presentation/feedback/data/model/FeedbackSettingsParams$Screen;", "Companion", "wuq", "FINISH_CARD", "CANCEL_CARD", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeedbackSettingsParams$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedbackSettingsParams$Screen[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final FeedbackSettingsParams$Screen CANCEL_CARD;
    public static final wuq Companion;
    public static final FeedbackSettingsParams$Screen FINISH_CARD;

    static {
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = new FeedbackSettingsParams$Screen("FINISH_CARD", 0);
        FINISH_CARD = feedbackSettingsParams$Screen;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen2 = new FeedbackSettingsParams$Screen("CANCEL_CARD", 1);
        CANCEL_CARD = feedbackSettingsParams$Screen2;
        FeedbackSettingsParams$Screen[] feedbackSettingsParams$ScreenArr = {feedbackSettingsParams$Screen, feedbackSettingsParams$Screen2};
        $VALUES = feedbackSettingsParams$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(feedbackSettingsParams$ScreenArr);
        Companion = new wuq();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(14));
    }

    public static FeedbackSettingsParams$Screen valueOf(String str) {
        return (FeedbackSettingsParams$Screen) Enum.valueOf(FeedbackSettingsParams$Screen.class, str);
    }

    public static FeedbackSettingsParams$Screen[] values() {
        return (FeedbackSettingsParams$Screen[]) $VALUES.clone();
    }
}
