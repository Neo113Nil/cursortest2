package ru.yandex.taxi.design;

import ru.yandex.taxi.design.NavigationWithTextTrailView;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[NavigationWithTextTrailView.NavigationType.values().length];
        try {
            iArr[NavigationWithTextTrailView.NavigationType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigationWithTextTrailView.NavigationType.INVISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NavigationWithTextTrailView.NavigationType.USUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NavigationWithTextTrailView.NavigationType.ROUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[NavigationWithTextTrailView.TextType.values().length];
        try {
            iArr2[NavigationWithTextTrailView.TextType.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NavigationWithTextTrailView.TextType.CASHBACK_AMOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[NavigationWithTextTrailView.TextType.NORMAL_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
