package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.tracing.Trace;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DefaultDataSource implements DataSource {
    public AssetDataSource assetDataSource;
    public final DataSource baseDataSource;
    public ContentDataSource contentDataSource;
    public final Context context;
    public DataSchemeDataSource dataSchemeDataSource;
    public DataSource dataSource;
    public FileDataSource fileDataSource;
    public RawResourceDataSource rawResourceDataSource;
    public DataSource rtmpDataSource;
    public final ArrayList transferListeners;
    public UdpDataSource udpDataSource;

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.context = context.getApplicationContext();
        dataSource.getClass();
        this.baseDataSource = dataSource;
        this.transferListeners = new ArrayList();
    }

    public static void maybeAddListenerToDataSource(DataSource dataSource, DefaultBandwidthMeter defaultBandwidthMeter) {
        if (dataSource != null) {
            dataSource.addTransferListener(defaultBandwidthMeter);
        }
    }

    public final void addListenersToDataSource(DataSource dataSource) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.transferListeners;
            if (i >= arrayList.size()) {
                return;
            }
            dataSource.addTransferListener((DefaultBandwidthMeter) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(DefaultBandwidthMeter defaultBandwidthMeter) {
        defaultBandwidthMeter.getClass();
        this.baseDataSource.addTransferListener(defaultBandwidthMeter);
        this.transferListeners.add(defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.fileDataSource, defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.assetDataSource, defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.contentDataSource, defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.rtmpDataSource, defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.udpDataSource, defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, defaultBandwidthMeter);
        maybeAddListenerToDataSource(this.rawResourceDataSource, defaultBandwidthMeter);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        DataSource dataSource = this.dataSource;
        return dataSource == null ? Collections.EMPTY_MAP : dataSource.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        Trace.checkState(this.dataSource == null);
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        String str = Util.DEVICE_DEBUG_INFO;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.context;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.fileDataSource == null) {
                    FileDataSource fileDataSource = new FileDataSource(false);
                    this.fileDataSource = fileDataSource;
                    addListenersToDataSource(fileDataSource);
                }
                this.dataSource = this.fileDataSource;
            } else {
                if (this.assetDataSource == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.assetDataSource = assetDataSource;
                    addListenersToDataSource(assetDataSource);
                }
                this.dataSource = this.assetDataSource;
            }
        } else if ("asset".equals(scheme)) {
            if (this.assetDataSource == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.assetDataSource = assetDataSource2;
                addListenersToDataSource(assetDataSource2);
            }
            this.dataSource = this.assetDataSource;
        } else if ("content".equals(scheme)) {
            if (this.contentDataSource == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.contentDataSource = contentDataSource;
                addListenersToDataSource(contentDataSource);
            }
            this.dataSource = this.contentDataSource;
        } else {
            boolean equals = "rtmp".equals(scheme);
            DataSource dataSource = this.baseDataSource;
            if (equals) {
                if (this.rtmpDataSource == null) {
                    try {
                        DataSource dataSource2 = (DataSource) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.rtmpDataSource = dataSource2;
                        addListenersToDataSource(dataSource2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("Error instantiating RTMP extension", (Throwable) e);
                        return 0L;
                    }
                    if (this.rtmpDataSource == null) {
                        this.rtmpDataSource = dataSource;
                    }
                }
                this.dataSource = this.rtmpDataSource;
            } else if ("udp".equals(scheme)) {
                if (this.udpDataSource == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.udpDataSource = udpDataSource;
                    addListenersToDataSource(udpDataSource);
                }
                this.dataSource = this.udpDataSource;
            } else if ("data".equals(scheme)) {
                if (this.dataSchemeDataSource == null) {
                    DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource(false);
                    this.dataSchemeDataSource = dataSchemeDataSource;
                    addListenersToDataSource(dataSchemeDataSource);
                }
                this.dataSource = this.dataSchemeDataSource;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.rawResourceDataSource == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.rawResourceDataSource = rawResourceDataSource;
                    addListenersToDataSource(rawResourceDataSource);
                }
                this.dataSource = this.rawResourceDataSource;
            } else {
                this.dataSource = dataSource;
            }
        }
        return this.dataSource.open(dataSpec);
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        DataSource dataSource = this.dataSource;
        dataSource.getClass();
        return dataSource.read(bArr, i, i2);
    }
}
