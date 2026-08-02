package ru.yandex.taxi.stories.presentation.story;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/stories/presentation/story/StoryConfig$Mode", "", "Lru/yandex/taxi/stories/presentation/story/StoryConfig$Mode;", "ONE_STORY", "STORIES_FOR_SCREEN", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StoryConfig$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StoryConfig$Mode[] $VALUES;
    public static final StoryConfig$Mode ONE_STORY;
    public static final StoryConfig$Mode STORIES_FOR_SCREEN;

    static {
        StoryConfig$Mode storyConfig$Mode = new StoryConfig$Mode("ONE_STORY", 0);
        ONE_STORY = storyConfig$Mode;
        StoryConfig$Mode storyConfig$Mode2 = new StoryConfig$Mode("STORIES_FOR_SCREEN", 1);
        STORIES_FOR_SCREEN = storyConfig$Mode2;
        StoryConfig$Mode[] storyConfig$ModeArr = {storyConfig$Mode, storyConfig$Mode2};
        $VALUES = storyConfig$ModeArr;
        $ENTRIES = kotlin.enums.a.a(storyConfig$ModeArr);
    }

    public static StoryConfig$Mode valueOf(String str) {
        return (StoryConfig$Mode) Enum.valueOf(StoryConfig$Mode.class, str);
    }

    public static StoryConfig$Mode[] values() {
        return (StoryConfig$Mode[]) $VALUES.clone();
    }
}
