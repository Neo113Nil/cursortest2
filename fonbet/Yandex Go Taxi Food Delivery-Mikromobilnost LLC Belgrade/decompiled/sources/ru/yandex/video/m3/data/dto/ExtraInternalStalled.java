package ru.yandex.video.m3.data.dto;

import defpackage.xfx;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u000f2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001:\u0001\u000fB\u0011\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00060\u0003j\u0002`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/data/dto/ExtraInternalStalled;", "", "", "", "Lru/yandex/video/m3/data/Milliseconds;", "duration", "(J)V", "getDuration", "()J", "key", "getKey", "()Ljava/lang/String;", "value", "getValue", "()Ljava/lang/Long;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtraInternalStalled implements Map.Entry<String, Long>, xfx {
    public static final int $stable = 0;
    public static final String key = "EXTRA_INTERNAL_STALLED_KEY";
    private final long duration;

    public ExtraInternalStalled(long j) {
        this.duration = j;
    }

    public final long getDuration() {
        return this.duration;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map.Entry
    public Long getValue() {
        return Long.valueOf(this.duration);
    }

    public Long setValue(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return key;
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ Long setValue(Long l) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
