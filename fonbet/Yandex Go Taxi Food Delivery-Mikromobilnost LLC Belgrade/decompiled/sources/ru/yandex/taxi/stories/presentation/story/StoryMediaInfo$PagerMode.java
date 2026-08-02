package ru.yandex.taxi.stories.presentation.story;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/stories/presentation/story/StoryMediaInfo$PagerMode", "", "Lru/yandex/taxi/stories/presentation/story/StoryMediaInfo$PagerMode;", JCP.RAW_PREFIX, "DOTS", "DASHES", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryMediaInfo$PagerMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoryMediaInfo$PagerMode[] $VALUES;
    public static final StoryMediaInfo$PagerMode DASHES;
    public static final StoryMediaInfo$PagerMode DOTS;
    public static final StoryMediaInfo$PagerMode NONE;

    static {
        StoryMediaInfo$PagerMode storyMediaInfo$PagerMode = new StoryMediaInfo$PagerMode(JCP.RAW_PREFIX, 0);
        NONE = storyMediaInfo$PagerMode;
        StoryMediaInfo$PagerMode storyMediaInfo$PagerMode2 = new StoryMediaInfo$PagerMode("DOTS", 1);
        DOTS = storyMediaInfo$PagerMode2;
        StoryMediaInfo$PagerMode storyMediaInfo$PagerMode3 = new StoryMediaInfo$PagerMode("DASHES", 2);
        DASHES = storyMediaInfo$PagerMode3;
        StoryMediaInfo$PagerMode[] storyMediaInfo$PagerModeArr = {storyMediaInfo$PagerMode, storyMediaInfo$PagerMode2, storyMediaInfo$PagerMode3};
        $VALUES = storyMediaInfo$PagerModeArr;
        $ENTRIES = kotlin.enums.a.a(storyMediaInfo$PagerModeArr);
    }

    public static StoryMediaInfo$PagerMode valueOf(String str) {
        return (StoryMediaInfo$PagerMode) Enum.valueOf(StoryMediaInfo$PagerMode.class, str);
    }

    public static StoryMediaInfo$PagerMode[] values() {
        return (StoryMediaInfo$PagerMode[]) $VALUES.clone();
    }
}
