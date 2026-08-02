package ru.yandex.taxi.design;

import ru.yandex.taxi.design.SpannableTextStrategyInteractor;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpannableTextStrategyInteractor.SpannableTextStrategy.values().length];
        try {
            iArr[SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_50_TEXT_SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_55_TEXT_SIZE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_100_TEXT_SIZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
