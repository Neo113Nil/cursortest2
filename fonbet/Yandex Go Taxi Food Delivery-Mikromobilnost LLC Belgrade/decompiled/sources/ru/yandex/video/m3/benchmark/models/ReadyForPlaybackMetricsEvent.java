package ru.yandex.video.m3.benchmark.models;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.w610;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.StreamType;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/yandex/video/m3/benchmark/models/ReadyForPlaybackMetricsEvent;", "Lru/yandex/video/m3/benchmark/models/MetricsEvent;", "Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "measurement", "Lru/yandex/video/m3/data/StreamType;", "streamType", "", "fileUrl", "<init>", "(Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;Lru/yandex/video/m3/data/StreamType;Ljava/lang/String;)V", "Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "getMeasurement", "()Lru/yandex/video/m3/benchmark/models/MetricsMeasurement;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "Ljava/lang/String;", "name$delegate", "Li3y;", "getName", "()Ljava/lang/String;", "name", "", "maxMs", "J", "getMaxMs", "()J", "", "buckets", CA20Status.STATUS_USER_I, "getBuckets", "()I", "Lkotlin/text/Regex;", "regex$delegate", "getRegex", "()Lkotlin/text/Regex;", "regex", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReadyForPlaybackMetricsEvent extends MetricsEvent {
    public static final int $stable = 8;
    private final int buckets;
    private final String fileUrl;
    private final long maxMs;
    private final MetricsMeasurement measurement;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final i3y name;

    /* renamed from: regex$delegate, reason: from kotlin metadata */
    private final i3y regex;
    private final StreamType streamType;

    public ReadyForPlaybackMetricsEvent(MetricsMeasurement metricsMeasurement, StreamType streamType, String str) {
        this.measurement = metricsMeasurement;
        this.streamType = streamType;
        this.fileUrl = str;
        this.name = a.a(new sls() { // from class: ru.yandex.video.m3.benchmark.models.ReadyForPlaybackMetricsEvent$name$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                String str2;
                String obj;
                Regex regex;
                StreamType streamType2 = ReadyForPlaybackMetricsEvent.this.getStreamType();
                String str3 = null;
                if (streamType2 == null) {
                    streamType2 = null;
                }
                if (streamType2 == null || (obj = streamType2.toString()) == null) {
                    str2 = ReadyForPlaybackMetricsEvent.this.fileUrl;
                    if (str2 != null) {
                        regex = ReadyForPlaybackMetricsEvent.this.getRegex();
                        w610 b = regex.b(str2);
                        if (b != null) {
                            str3 = evu0.S("?", evu0.Q(Extension.DOT_CHAR, b.a.group()));
                        }
                    }
                    obj = str3 == null ? StreamType.Unknown.toString() : str3;
                }
                return "READY_FOR_PLAYBACK_".concat(obj.toUpperCase(Locale.ROOT));
            }
        });
        this.maxMs = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
        this.buckets = 200;
        this.regex = a.a(new sls() { // from class: ru.yandex.video.m3.benchmark.models.ReadyForPlaybackMetricsEvent$regex$2
            @Override // defpackage.sls
            public final Regex invoke() {
                return new Regex("\\.\\w+($|\\?)");
            }
        });
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
    public MetricsMeasurement getMeasurement() {
        return this.measurement;
    }

    @Override // ru.yandex.video.m3.benchmark.models.MetricsEvent
    public String getName() {
        return (String) this.name.getValue();
    }

    public final StreamType getStreamType() {
        return this.streamType;
    }

    public /* synthetic */ ReadyForPlaybackMetricsEvent(MetricsMeasurement metricsMeasurement, StreamType streamType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(metricsMeasurement, streamType, (i & 4) != 0 ? null : str);
    }
}
