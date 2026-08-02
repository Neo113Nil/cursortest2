package defpackage;

import io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class wvc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlatformChannel$Brightness.values().length];
        c = iArr;
        try {
            iArr[PlatformChannel$Brightness.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[PlatformChannel$Brightness.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[PlatformChannel$SystemUiOverlay.values().length];
        b = iArr2;
        try {
            iArr2[PlatformChannel$SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[PlatformChannel$SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr3 = new int[PlatformChannel$HapticFeedbackType.values().length];
        a = iArr3;
        try {
            iArr3[PlatformChannel$HapticFeedbackType.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[PlatformChannel$HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[PlatformChannel$HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[PlatformChannel$HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[PlatformChannel$HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
