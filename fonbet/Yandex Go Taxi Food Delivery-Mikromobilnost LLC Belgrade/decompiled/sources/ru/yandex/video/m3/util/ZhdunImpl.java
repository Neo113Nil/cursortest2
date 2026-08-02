package ru.yandex.video.m3.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/util/ZhdunImpl;", "Lru/yandex/video/m3/util/Zhdun;", "<init>", "()V", "", "milliseconds", "Lzy11;", "waitFor", "(J)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ZhdunImpl implements Zhdun {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.util.Zhdun
    public void waitFor(long milliseconds) {
        Thread.sleep(milliseconds);
    }
}
