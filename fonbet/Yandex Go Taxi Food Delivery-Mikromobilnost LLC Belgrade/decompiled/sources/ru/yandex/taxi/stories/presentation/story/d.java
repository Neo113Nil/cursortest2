package ru.yandex.taxi.stories.presentation.story;

import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[StoryModalView.MediaType.values().length];
        try {
            iArr2[StoryModalView.MediaType.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[StoryModalView.MediaType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StoryModalView.MediaType.ANIMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[StoryModalView.State.values().length];
        try {
            iArr3[StoryModalView.State.APPEARING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[StoryModalView.State.SETTLING_DISMISS_SCROLL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[StoryModalView.State.SCROLL_FOR_DISMISS.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[StoryModalView.State.SCROLLING_STORY_VERTICAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[StoryModalView.State.RESET.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[StoryModalView.State.BUFFERING.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[StoryModalView.State.ANIMATING_TO_VIDEO.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[StoryModalView.State.PLAYING.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[StoryModalView.State.PAUSED.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[StoryModalView.State.SCROLLING_PAGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[StoryModalView.State.SETTLING_PAGE_SCROLL.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[StoryModalView.State.SCROLLING_STORIES.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[StoryModalView.State.SETTLING_STORIES_SCROLL.ordinal()] = 13;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[StoryModalView.State.ERROR.ordinal()] = 14;
        } catch (NoSuchFieldError unused19) {
        }
        c = iArr3;
    }
}
