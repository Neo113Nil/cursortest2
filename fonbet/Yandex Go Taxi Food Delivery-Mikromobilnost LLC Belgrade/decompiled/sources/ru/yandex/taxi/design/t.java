package ru.yandex.taxi.design;

import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SliderButtonView.State.values().length];
        try {
            iArr[SliderButtonView.State.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SliderButtonView.State.PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SliderButtonView.State.DONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
