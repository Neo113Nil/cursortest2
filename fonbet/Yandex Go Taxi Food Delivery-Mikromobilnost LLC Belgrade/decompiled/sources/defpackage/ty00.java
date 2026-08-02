package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ty00 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MapObjectComponentType.values().length];
        try {
            iArr[MapObjectComponentType.BODY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapObjectComponentType.BUBBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapObjectComponentType.LABEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MapObjectComponentType.OVERLAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MapObjectComponentType.IMAGE_OVERLAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[LayersAnalyticEventEmmiter.Event.values().length];
        try {
            iArr2[LayersAnalyticEventEmmiter.Event.SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LayersAnalyticEventEmmiter.Event.TAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
