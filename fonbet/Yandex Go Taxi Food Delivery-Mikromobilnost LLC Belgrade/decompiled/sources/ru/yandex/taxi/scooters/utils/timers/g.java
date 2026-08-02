package ru.yandex.taxi.scooters.utils.timers;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersTimersRepository$TimerDirection.values().length];
        try {
            iArr[ScootersTimersRepository$TimerDirection.DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersTimersRepository$TimerDirection.UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
