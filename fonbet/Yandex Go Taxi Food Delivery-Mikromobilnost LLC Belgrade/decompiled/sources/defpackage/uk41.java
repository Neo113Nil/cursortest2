package defpackage;

import com.yandex.plus.home.feature.webviews.internal.stories.StoryNavigation;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class uk41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StoryNavigation.values().length];
        try {
            iArr[StoryNavigation.SHOW_NEXT_STORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoryNavigation.SHOW_PREV_STORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
