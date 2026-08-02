package defpackage;

import com.ybsdk.feature.transfer.internal.screens.phone.adapter.ListContentData$Partner$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class wqy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ListContentData$Partner$Status.values().length];
        try {
            iArr[ListContentData$Partner$Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ListContentData$Partner$Status.CHECKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ListContentData$Partner$Status.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ListContentData$Partner$Status.FOUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
