package ru.yandex.taxi.widget.buttons;

import ru.yandex.taxi.widget.buttons.ButtonTrailView;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonTrailView.ButtonStyle.values().length];
        try {
            iArr[ButtonTrailView.ButtonStyle.OUTLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonTrailView.ButtonStyle.CONTROL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonTrailView.ButtonStyle.CONTROL_SECONDARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
