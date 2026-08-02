package defpackage;

import com.yandex.fintechsdk.features.bdui.api.dependencies.navigation.action.DeeplinkResolution;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.deeplink.DeeplinkResult;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class t470 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DeeplinkResolution.values().length];
        try {
            iArr[DeeplinkResolution.HANDLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeeplinkResolution.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeeplinkResolution.NOT_HANDLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DeeplinkResult.values().length];
        try {
            iArr2[DeeplinkResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DeeplinkResult.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DeeplinkResult.NO_APP_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
