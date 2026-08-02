package defpackage;

import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class oar {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoggingStalledReason.values().length];
        try {
            iArr[LoggingStalledReason.INIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoggingStalledReason.SET_SOURCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
