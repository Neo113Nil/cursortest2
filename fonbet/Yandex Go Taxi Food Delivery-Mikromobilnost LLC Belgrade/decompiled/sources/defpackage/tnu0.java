package defpackage;

import com.ybsdk.core.stories.ChangeStoryReason;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tnu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeStoryReason.values().length];
        try {
            iArr[ChangeStoryReason.STORIES_NEXT_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeStoryReason.STORIES_PREVIEW_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChangeStoryReason.STORIES_NEXT_TIME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChangeStoryReason.STORIES_NEXT_DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
