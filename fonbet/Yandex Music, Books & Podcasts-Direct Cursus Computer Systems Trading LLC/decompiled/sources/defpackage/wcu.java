package defpackage;

import ru.yandex.video.m3.data.VideoType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class wcu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoType.values().length];
        try {
            iArr[VideoType.VOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoType.EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoType.LIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
