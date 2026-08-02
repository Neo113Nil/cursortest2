package defpackage;

import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class xvp {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[lqs.values().length];
        try {
            iArr[10] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            quk qukVar = lqs.b;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Album$AlbumType.values().length];
        try {
            iArr2[Album$AlbumType.AUDIOBOOK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Album$AlbumType.PODCAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr2;
    }
}
