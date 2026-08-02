package defpackage;

import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cof {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Album$AlbumType.values().length];
        try {
            iArr[Album$AlbumType.PODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
