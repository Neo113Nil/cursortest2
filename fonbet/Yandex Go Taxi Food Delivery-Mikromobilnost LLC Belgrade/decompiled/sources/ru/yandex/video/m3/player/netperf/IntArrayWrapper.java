package ru.yandex.video.m3.player.netperf;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/netperf/IntArrayWrapper;", "", Constants.KEY_DATA, "", "([I)V", "getData", "()[I", "equals", "", "other", "hashCode", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntArrayWrapper {
    public static final int $stable = 8;
    private final int[] data;

    public IntArrayWrapper(int[] iArr) {
        this.data = iArr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return IntArrayWrapper.class.equals(other != null ? other.getClass() : null) && Arrays.equals(this.data, ((IntArrayWrapper) other).data);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }
}
