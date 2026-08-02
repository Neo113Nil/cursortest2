package defpackage;

import com.yandex.plus.home.feature.webviews.internal.overlap.ViewOverlappingDetector$State;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$ModalHeightType;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class tv41 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ViewOverlappingDetector$State.values().length];
        try {
            iArr[ViewOverlappingDetector$State.VIEW_IS_OVERLAPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewOverlappingDetector$State.VIEW_IS_NOT_OVERLAPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Deeplink$WebViewFormat.values().length];
        try {
            iArr2[Deeplink$WebViewFormat.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Deeplink$WebViewFormat.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[Deeplink$ModalHeightType.values().length];
        try {
            iArr3[Deeplink$ModalHeightType.PERCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[Deeplink$ModalHeightType.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
