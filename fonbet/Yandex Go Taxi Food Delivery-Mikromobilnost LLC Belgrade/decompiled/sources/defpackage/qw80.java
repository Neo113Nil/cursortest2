package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$UrlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ModalHeight$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$OpenFormat;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class qw80 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PresentationOptionsDto$OpenFormat.values().length];
        try {
            iArr[PresentationOptionsDto$OpenFormat.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PresentationOptionsDto$OpenFormat.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PresentationOptionsDto$ModalHeight$Type.values().length];
        try {
            iArr2[PresentationOptionsDto$ModalHeight$Type.PERCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PresentationOptionsDto$ModalHeight$Type.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[OutMessage$OpenUrl$UrlType.values().length];
        try {
            iArr3[OutMessage$OpenUrl$UrlType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[OutMessage$OpenUrl$UrlType.WEBLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
