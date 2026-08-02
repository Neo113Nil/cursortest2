package defpackage;

import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class yg7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrackType.values().length];
        try {
            iArr[TrackType.Video.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackType.Audio.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ouj.E(4).length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
