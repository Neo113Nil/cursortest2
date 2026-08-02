package androidx.media3.datasource;

import android.os.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.tracing.Trace;
import com.google.common.collect.RegularImmutableList;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class BaseDataSource implements DataSource {
    public DataSpec dataSpec;
    public final boolean isNetwork;
    public int listenerCount;
    public final ArrayList listeners = new ArrayList(1);

    public BaseDataSource(boolean z) {
        this.isNetwork = z;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(DefaultBandwidthMeter defaultBandwidthMeter) {
        defaultBandwidthMeter.getClass();
        ArrayList arrayList = this.listeners;
        if (arrayList.contains(defaultBandwidthMeter)) {
            return;
        }
        arrayList.add(defaultBandwidthMeter);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i) {
        boolean z;
        DataSpec dataSpec = this.dataSpec;
        String str = Util.DEVICE_DEBUG_INFO;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            DefaultBandwidthMeter defaultBandwidthMeter = (DefaultBandwidthMeter) this.listeners.get(i2);
            boolean z2 = this.isNetwork;
            synchronized (defaultBandwidthMeter) {
                RegularImmutableList regularImmutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
                if (z2) {
                    int i3 = dataSpec.flags;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    defaultBandwidthMeter.sampleBytesTransferred += i;
                }
            }
        }
    }

    public final void transferEnded() {
        boolean z;
        DataSpec dataSpec = this.dataSpec;
        String str = Util.DEVICE_DEBUG_INFO;
        for (int i = 0; i < this.listenerCount; i++) {
            DefaultBandwidthMeter defaultBandwidthMeter = (DefaultBandwidthMeter) this.listeners.get(i);
            boolean z2 = this.isNetwork;
            synchronized (defaultBandwidthMeter) {
                try {
                    RegularImmutableList regularImmutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
                    if (z2) {
                        int i2 = dataSpec.flags;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Trace.checkState(defaultBandwidthMeter.streamCount > 0);
                        defaultBandwidthMeter.clock.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - defaultBandwidthMeter.sampleStartTimeMs);
                        defaultBandwidthMeter.totalElapsedTimeMs += i3;
                        long j = defaultBandwidthMeter.totalBytesTransferred;
                        long j2 = defaultBandwidthMeter.sampleBytesTransferred;
                        defaultBandwidthMeter.totalBytesTransferred = j + j2;
                        if (i3 > 0) {
                            defaultBandwidthMeter.slidingPercentile.addSample((j2 * 8000.0f) / i3, (int) Math.sqrt(j2));
                            if (defaultBandwidthMeter.totalElapsedTimeMs < 2000) {
                                if (defaultBandwidthMeter.totalBytesTransferred >= 524288) {
                                }
                                defaultBandwidthMeter.maybeNotifyBandwidthSample(i3, defaultBandwidthMeter.sampleBytesTransferred, defaultBandwidthMeter.bitrateEstimate);
                                defaultBandwidthMeter.sampleStartTimeMs = elapsedRealtime;
                                defaultBandwidthMeter.sampleBytesTransferred = 0L;
                            }
                            defaultBandwidthMeter.bitrateEstimate = (long) defaultBandwidthMeter.slidingPercentile.getPercentile();
                            defaultBandwidthMeter.maybeNotifyBandwidthSample(i3, defaultBandwidthMeter.sampleBytesTransferred, defaultBandwidthMeter.bitrateEstimate);
                            defaultBandwidthMeter.sampleStartTimeMs = elapsedRealtime;
                            defaultBandwidthMeter.sampleBytesTransferred = 0L;
                        }
                        defaultBandwidthMeter.streamCount--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.dataSpec = null;
    }

    public final void transferInitializing() {
        for (int i = 0; i < this.listenerCount; i++) {
            ((DefaultBandwidthMeter) this.listeners.get(i)).getClass();
        }
    }

    public final void transferStarted(DataSpec dataSpec) {
        boolean z;
        this.dataSpec = dataSpec;
        for (int i = 0; i < this.listenerCount; i++) {
            DefaultBandwidthMeter defaultBandwidthMeter = (DefaultBandwidthMeter) this.listeners.get(i);
            boolean z2 = this.isNetwork;
            synchronized (defaultBandwidthMeter) {
                try {
                    RegularImmutableList regularImmutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
                    if (z2) {
                        int i2 = dataSpec.flags;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (defaultBandwidthMeter.streamCount == 0) {
                            defaultBandwidthMeter.clock.getClass();
                            defaultBandwidthMeter.sampleStartTimeMs = SystemClock.elapsedRealtime();
                        }
                        defaultBandwidthMeter.streamCount++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
