package ru.yandex.video.m3.telemetry.datasource;

import android.net.Uri;
import android.os.SystemClock;
import defpackage.cj01;
import defpackage.mpg;
import defpackage.npg;
import defpackage.tls;
import defpackage.xuu;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.yandex.video.m3.data.dto.DefaultVideoDataKt;
import ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerCaller;
import ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerControlCallRestrictor;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030-0,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0016\u0010<\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?¨\u0006A"}, d2 = {"Lru/yandex/video/m3/telemetry/datasource/StrmTelemetryDataSource;", "Lxuu;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerCaller;", "", "sessionId", "originalHttpDataSource", "Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;", "errorNotifier", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "manifestUrlInflater", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "netPerfManagerRestrictor", "<init>", "(Ljava/lang/String;Lxuu;Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;)V", "Lzy11;", "resetStats", "()V", "T", "Lkotlin/Function1;", "action", "runWithErrorNotify", "(Ltls;)Ljava/lang/Object;", "Lnpg;", "dataSpec", "", OpenList.STR_OPEN, "(Lnpg;)J", "close", "", "buffer", "", "offset", "length", "read", "([BII)I", "name", "value", "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "clearRequestProperty", "(Ljava/lang/String;)V", "clearAllRequestProperties", "getResponseCode", "()I", "", "", "getResponseHeaders", "()Ljava/util/Map;", "Lcj01;", "transferListener", "addTransferListener", "(Lcj01;)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "Lxuu;", "Lru/yandex/video/m3/telemetry/datasource/DataSourceErrorNotifier;", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "inflatedUri", "Landroid/net/Uri;", "bytesRead", "J", "lastLoadStartTimeMs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmTelemetryDataSource implements xuu, NetPerfManagerCaller {
    public static final int $stable = 8;
    private long bytesRead;
    private final DataSourceErrorNotifier errorNotifier;
    private Uri inflatedUri = Uri.EMPTY;
    private long lastLoadStartTimeMs = -1;
    private final ManifestUrlInflater manifestUrlInflater;
    private final NetPerfManagerControlCallRestrictor netPerfManagerRestrictor;
    private final xuu originalHttpDataSource;
    private final String sessionId;

    public StrmTelemetryDataSource(String str, xuu xuuVar, DataSourceErrorNotifier dataSourceErrorNotifier, ManifestUrlInflater manifestUrlInflater, NetPerfManagerControlCallRestrictor netPerfManagerControlCallRestrictor) {
        this.sessionId = str;
        this.originalHttpDataSource = xuuVar;
        this.errorNotifier = dataSourceErrorNotifier;
        this.manifestUrlInflater = manifestUrlInflater;
        this.netPerfManagerRestrictor = netPerfManagerControlCallRestrictor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetStats() {
        this.bytesRead = 0L;
        this.lastLoadStartTimeMs = -1L;
    }

    private final <T> T runWithErrorNotify(tls action) {
        T t;
        try {
            t = (T) action.invoke(this.originalHttpDataSource);
        } catch (Throwable th) {
            t = (T) new Result.Failure(th);
        }
        Throwable a = Result.a(t);
        if (a != null) {
            this.errorNotifier.onLoadError(this.inflatedUri, a, SystemClock.elapsedRealtime() - this.lastLoadStartTimeMs, this.bytesRead);
            resetStats();
            this.netPerfManagerRestrictor.stop(this);
        }
        b.b(t);
        return t;
    }

    @Override // defpackage.kpg
    public void addTransferListener(cj01 transferListener) {
        this.originalHttpDataSource.addTransferListener(transferListener);
    }

    @Override // defpackage.xuu
    public void clearAllRequestProperties() {
        this.originalHttpDataSource.clearAllRequestProperties();
    }

    @Override // defpackage.xuu
    public void clearRequestProperty(String name) {
        this.originalHttpDataSource.clearRequestProperty(name);
    }

    @Override // defpackage.kpg
    public void close() {
        runWithErrorNotify(new tls() { // from class: ru.yandex.video.m3.telemetry.datasource.StrmTelemetryDataSource$close$1
            {
                super(1);
            }

            public final void invoke(xuu xuuVar) {
                NetPerfManagerControlCallRestrictor netPerfManagerControlCallRestrictor;
                StrmTelemetryDataSource.this.resetStats();
                xuuVar.close();
                netPerfManagerControlCallRestrictor = StrmTelemetryDataSource.this.netPerfManagerRestrictor;
                netPerfManagerControlCallRestrictor.stop(StrmTelemetryDataSource.this);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((xuu) obj);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.xuu
    public int getResponseCode() {
        return this.originalHttpDataSource.getResponseCode();
    }

    @Override // defpackage.xuu, defpackage.kpg
    public Map<String, List<String>> getResponseHeaders() {
        return this.originalHttpDataSource.getResponseHeaders();
    }

    @Override // defpackage.kpg
    /* renamed from: getUri, reason: from getter */
    public Uri getInflatedUri() {
        return this.inflatedUri;
    }

    @Override // defpackage.kpg
    public long open(final npg dataSpec) {
        return ((Number) runWithErrorNotify(new tls() { // from class: ru.yandex.video.m3.telemetry.datasource.StrmTelemetryDataSource$open$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Long invoke(xuu xuuVar) {
                NetPerfManagerControlCallRestrictor netPerfManagerControlCallRestrictor;
                ManifestUrlInflater manifestUrlInflater;
                String str;
                netPerfManagerControlCallRestrictor = StrmTelemetryDataSource.this.netPerfManagerRestrictor;
                netPerfManagerControlCallRestrictor.start(StrmTelemetryDataSource.this);
                manifestUrlInflater = StrmTelemetryDataSource.this.manifestUrlInflater;
                str = StrmTelemetryDataSource.this.sessionId;
                String inflateManifestUrl = manifestUrlInflater.inflateManifestUrl(str, DefaultVideoDataKt.DefaultVideoData$default(dataSpec.a.toString(), null, 2, null), null, -9223372036854775807L, false, -1, false);
                mpg a = dataSpec.a();
                a.a = Uri.parse(inflateManifestUrl);
                npg a2 = a.a();
                StrmTelemetryDataSource.this.inflatedUri = a2.a;
                StrmTelemetryDataSource.this.bytesRead = 0L;
                StrmTelemetryDataSource.this.lastLoadStartTimeMs = SystemClock.elapsedRealtime();
                return Long.valueOf(xuuVar.open(a2));
            }
        })).longValue();
    }

    @Override // defpackage.apg
    public int read(final byte[] buffer, final int offset, final int length) {
        return ((Number) runWithErrorNotify(new tls() { // from class: ru.yandex.video.m3.telemetry.datasource.StrmTelemetryDataSource$read$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Integer invoke(xuu xuuVar) {
                long j;
                int read = xuuVar.read(buffer, offset, length);
                if (read != -1) {
                    StrmTelemetryDataSource strmTelemetryDataSource = this;
                    j = strmTelemetryDataSource.bytesRead;
                    strmTelemetryDataSource.bytesRead = j + read;
                }
                return Integer.valueOf(read);
            }
        })).intValue();
    }

    @Override // defpackage.xuu
    public void setRequestProperty(String name, String value) {
        this.originalHttpDataSource.setRequestProperty(name, value);
    }
}
