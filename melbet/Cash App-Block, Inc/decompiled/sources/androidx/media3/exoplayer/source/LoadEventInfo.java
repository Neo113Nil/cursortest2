package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class LoadEventInfo {
    public static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final Uri uri;

    public LoadEventInfo(DataSpec dataSpec, Uri uri, Map map, long j, long j2, long j3) {
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.elapsedRealtimeMs = j;
        this.loadDurationMs = j2;
        this.bytesLoaded = j3;
    }
}
