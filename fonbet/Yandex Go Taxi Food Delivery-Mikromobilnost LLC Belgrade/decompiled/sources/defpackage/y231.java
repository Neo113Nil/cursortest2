package defpackage;

import com.yandex.go.vault.data.ActionButtonTypeResponse;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class y231 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActionButtonTypeResponse.values().length];
        try {
            iArr[ActionButtonTypeResponse.CLIPBOARD_COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionButtonTypeResponse.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionButtonTypeResponse.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
