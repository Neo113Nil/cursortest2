package defpackage;

import com.ybsdk.feature.stories.internal.screens.verticalstories.view.PagePreviewType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vg31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PagePreviewType.values().length];
        try {
            iArr[PagePreviewType.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PagePreviewType.NEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
