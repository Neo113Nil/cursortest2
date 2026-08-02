package ru.yandex.taxi.layers.presentation.pickup;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PickupPointBubbleHandler$ImageType.values().length];
        try {
            iArr[PickupPointBubbleHandler$ImageType.IMAGE_TAG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PickupPointBubbleHandler$ImageType.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PickupPointBubbleHandler$ImageType.IMAGE_URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
