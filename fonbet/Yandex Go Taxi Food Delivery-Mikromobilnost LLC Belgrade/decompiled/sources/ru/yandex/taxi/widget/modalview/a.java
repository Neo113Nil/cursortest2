package ru.yandex.taxi.widget.modalview;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModalViewCoordinatorImpl$OnAppearingListener$Step.values().length];
        try {
            iArr[ModalViewCoordinatorImpl$OnAppearingListener$Step.APPEARED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalViewCoordinatorImpl$OnAppearingListener$Step.DISAPPEARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
