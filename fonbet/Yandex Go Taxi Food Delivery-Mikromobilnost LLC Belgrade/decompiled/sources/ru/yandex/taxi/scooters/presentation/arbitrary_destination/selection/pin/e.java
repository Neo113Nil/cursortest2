package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin;

import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.ScootersPinStateRepository;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersPinStateRepository.State.values().length];
        try {
            iArr[ScootersPinStateRepository.State.LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPinStateRepository.State.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPinStateRepository.State.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
