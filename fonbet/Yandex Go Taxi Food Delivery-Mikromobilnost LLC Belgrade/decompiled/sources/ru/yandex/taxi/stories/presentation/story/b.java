package ru.yandex.taxi.stories.presentation.story;

import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StoryModalView.State.values().length];
        try {
            iArr[StoryModalView.State.SCROLLING_PAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoryModalView.State.SCROLLING_STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StoryModalView.State.SCROLLING_STORY_VERTICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StoryModalView.State.SCROLL_FOR_DISMISS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
