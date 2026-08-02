package defpackage;

import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class pvg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Album$AlbumType.values().length];
        try {
            iArr[Album$AlbumType.PODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Album$AlbumType.AUDIOBOOK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
