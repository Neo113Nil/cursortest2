package ru.yandex.video.m3.benchmark.models;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.kgk;
import defpackage.n4i;
import defpackage.xuj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.StreamType;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/yandex/video/m3/benchmark/models/ReadyForPlaybackMetricsEvent;", "Lru/yandex/video/m3/benchmark/models/MetricsEvent;", "Ln4i;", "measurement", "Lru/yandex/video/m3/data/StreamType;", "streamType", "", "fileUrl", "<init>", "(Ln4i;Lru/yandex/video/m3/data/StreamType;Ljava/lang/String;)V", "Ln4i;", "getMeasurement", "()Ln4i;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "Ljava/lang/String;", "name$delegate", "Larf;", "getName", "()Ljava/lang/String;", "name", "", "maxMs", "J", "getMaxMs", "()J", "", "buckets", "I", "getBuckets", "()I", "Lkotlin/text/Regex;", "regex$delegate", "getRegex", "()Lkotlin/text/Regex;", "regex", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ReadyForPlaybackMetricsEvent extends MetricsEvent {
    public static final int $stable = 8;
    private final int buckets;
    private final String fileUrl;
    private final long maxMs;
    private final n4i measurement;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    @NotNull
    private final arf name;

    /* renamed from: regex$delegate, reason: from kotlin metadata */
    @NotNull
    private final arf regex;
    private final StreamType streamType;

    public ReadyForPlaybackMetricsEvent(n4i n4iVar, StreamType streamType, String str) {
        this.streamType = streamType;
        this.fileUrl = str;
        this.name = btf.b(new kgk(8, this));
        this.maxMs = 20000L;
        this.buckets = 200;
        this.regex = btf.b(xuj.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Regex getRegex() {
        return (Regex) this.regex.getValue();
    }

    @Override // ru.yandex.video.m3.benchmark.models.MetricsEvent
    public int getBuckets() {
        return this.buckets;
    }

    @Override // ru.yandex.video.m3.benchmark.models.MetricsEvent
    public long getMaxMs() {
        return this.maxMs;
    }

    @Override // ru.yandex.video.m3.benchmark.models.MetricsEvent
    public n4i getMeasurement() {
        return null;
    }

    @Override // ru.yandex.video.m3.benchmark.models.MetricsEvent
    @NotNull
    public String getName() {
        return (String) this.name.getValue();
    }

    public final StreamType getStreamType() {
        return this.streamType;
    }

    public /* synthetic */ ReadyForPlaybackMetricsEvent(n4i n4iVar, StreamType streamType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(n4iVar, streamType, (i & 4) != 0 ? null : str);
    }
}
