package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NativeVibrateRequest$VibrateType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class q450 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OutMessage$NativeVibrateRequest$VibrateType.values().length];
        try {
            iArr[OutMessage$NativeVibrateRequest$VibrateType.SELECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OutMessage$NativeVibrateRequest$VibrateType.SOFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OutMessage$NativeVibrateRequest$VibrateType.LIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OutMessage$NativeVibrateRequest$VibrateType.MEDIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OutMessage$NativeVibrateRequest$VibrateType.HARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
