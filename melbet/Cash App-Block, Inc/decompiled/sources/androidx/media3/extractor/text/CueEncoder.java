package androidx.media3.extractor.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.camera.video.internal.encoder.TimeProvider;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import coil3.svg.internal.AndroidSvg;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.util.pool.FactoryPools;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.internal.data.upload.DataUploader;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.persistence.BatchData;
import com.datadog.android.core.internal.persistence.BatchId;
import com.datadog.android.core.internal.persistence.NoOpStorage$getEventWriteScope$1;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.system.SystemInfo;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.datadog.android.rum.internal.domain.InfoData;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.display.DisplayInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public class CueEncoder implements TimeProvider, SampleStream, ExtractorOutput, BitmapPool, Downsampler.DecodeCallbacks, RequestManagerTreeNode, FactoryPools.Factory, DataUploader, Storage, SystemInfoProvider, InfoProvider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CueEncoder(int i) {
        this.$r8$classId = i;
    }

    public static final int access$unpack(int i, long j) {
        int i2 = TouchBoundsExpansion.$r8$clinit;
        return ((int) (j >> (i * 15))) & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE;
    }

    /* renamed from: getNone-RZrCHBk, reason: not valid java name */
    public static long m1147getNoneRZrCHBk() {
        return TouchBoundsExpansion.None;
    }

    public static long pack$ui(int i, int i2, int i3, int i4) {
        return ((i2 & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE) << 15) | (i & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE) | ((i3 & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE) << 30) | ((i4 & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE) << 45) | Long.MIN_VALUE;
    }

    public static boolean resolveViewHasReplay(DatadogContext datadogContext, String str) {
        datadogContext.getClass();
        Map map = (Map) datadogContext.featuresContext.get("session-replay");
        if (map == null) {
            return false;
        }
        Object obj = map.get(str);
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("has_replay") : null;
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public void cleanup() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public void confirmBatchRead(BatchId batchId, RemovalReason removalReason, boolean z) {
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
    public Object create() {
        return new ArrayList();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public Bitmap getDirty(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public Function1 getEventWriteScope(DatadogContext datadogContext) {
        datadogContext.getClass();
        return NoOpStorage$getEventWriteScope$1.INSTANCE;
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public SystemInfo getLatestSystemInfo() {
        return new SystemInfo();
    }

    @Override // com.datadog.android.rum.internal.domain.InfoProvider
    public InfoData getState() {
        return new DisplayInfo(null);
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
    public void onDecodeComplete(Bitmap bitmap, BitmapPool bitmapPool) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
    public void onObtainBounds() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void put(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(AndroidSvg androidSvg, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.flags = 4;
        return -4;
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public BatchData readNextBatch() {
        return null;
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long realtimeUs() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        return 0;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
            default:
                return super.toString();
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return new DiscardingTrackOutput();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void trimMemory(int i) {
    }

    @Override // com.datadog.android.core.internal.system.SystemInfoProvider
    public void unregister(Context context) {
    }

    @Override // com.datadog.android.core.internal.data.upload.DataUploader
    public UploadStatus upload(DatadogContext datadogContext, List list, byte[] bArr, BatchId batchId) {
        datadogContext.getClass();
        list.getClass();
        return UploadStatus.UnknownStatus.INSTANCE;
    }

    @Override // androidx.camera.video.internal.encoder.TimeProvider
    public long uptimeUs() {
        return System.nanoTime() / 1000;
    }

    public /* synthetic */ CueEncoder(Object obj, int i) {
        this.$r8$classId = i;
    }
}
