package defpackage;

import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class nbb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Album$AlbumType.values().length];
        try {
            iArr[Album$AlbumType.PODCAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Album$AlbumType.COMMON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Album$AlbumType.COMPILATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Album$AlbumType.SINGLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Album$AlbumType.ASMR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Album$AlbumType.NOISE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Album$AlbumType.RADIO_RECORD.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Album$AlbumType.FAIRY_TALE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Album$AlbumType.AUDIOBOOK.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
        int[] iArr2 = new int[jjm.values().length];
        try {
            quk qukVar = jjm.b;
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            quk qukVar2 = jjm.b;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            quk qukVar3 = jjm.b;
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            quk qukVar4 = jjm.b;
            iArr2[2] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            quk qukVar5 = jjm.b;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            quk qukVar6 = jjm.b;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            quk qukVar7 = jjm.b;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            quk qukVar8 = jjm.b;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            quk qukVar9 = jjm.b;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        int[] iArr3 = new int[jzb.values().length];
        try {
            h1b h1bVar = jzb.b;
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            h1b h1bVar2 = jzb.b;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            h1b h1bVar3 = jzb.b;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        b = iArr3;
    }
}
