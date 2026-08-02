package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.DataReader;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public interface DataSource extends DataReader {

    public interface Factory {
        DataSource createDataSource();
    }

    void addTransferListener(DefaultBandwidthMeter defaultBandwidthMeter);

    void close();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(DataSpec dataSpec);
}
