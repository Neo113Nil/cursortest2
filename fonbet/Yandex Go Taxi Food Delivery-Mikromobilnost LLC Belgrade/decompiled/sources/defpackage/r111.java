package defpackage;

import ru.yandex.taxi.masstransit.TransportCardSourceScreen;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r111 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportCardSourceScreen.values().length];
        try {
            iArr[TransportCardSourceScreen.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportCardSourceScreen.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportCardSourceScreen.HUB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
