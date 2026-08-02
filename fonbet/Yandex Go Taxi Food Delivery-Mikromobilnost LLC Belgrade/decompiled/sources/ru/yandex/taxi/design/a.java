package ru.yandex.taxi.design;

import ru.yandex.taxi.design.AddressInputComponent;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressInputComponent.Mode.values().length];
        try {
            iArr[AddressInputComponent.Mode.INPUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressInputComponent.Mode.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddressInputComponent.Mode.VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
