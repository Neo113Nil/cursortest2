package defpackage;

import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class w4p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[lqs.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            quk qukVar = lqs.b;
            iArr[9] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            quk qukVar2 = lqs.b;
            iArr[10] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Album$AlbumType.values().length];
        try {
            iArr2[Album$AlbumType.PODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Album$AlbumType.AUDIOBOOK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
