package ru.yandex.video.m3.player.lowlatency.datasource;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import defpackage.al7;
import defpackage.bg61;
import defpackage.cj01;
import defpackage.d5j0;
import defpackage.ge10;
import defpackage.hie0;
import defpackage.kbs;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.l5j0;
import defpackage.m5j0;
import defpackage.npg;
import defpackage.nz4;
import defpackage.oci0;
import defpackage.p77;
import defpackage.pwu;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.tw21;
import defpackage.vuu;
import defpackage.w4r0;
import defpackage.wg10;
import defpackage.wms;
import defpackage.wuu;
import defpackage.xf7;
import defpackage.yf7;
import defpackage.za7;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.RealConnection;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier;
import ru.yandex.video.m3.player.lowlatency.source.ChunkDownloadListener;
import ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes7.dex */
class LowLatencyOkHttpDataSource extends nz4 implements InterruptableHttpDataSource {
    private static final long afterHeaderUUIDTrigger = -7613782305446615761L;
    private static final long beforeMoofUUIDTrigger = -7308519144238225891L;
    private static final long mdatTagTrigger = 1835295092;
    private static final long uuidTagTrigger = 1970628964;
    private long bytesRead;
    private long bytesToRead;
    private final za7 cacheControl;
    private final xf7 callFactory;
    private final ChunkDownloadListener chunkDownloadListener;
    private long clientMdatLoadTime;
    private final hie0 contentTypePredicate;
    private volatile yf7 currentCall;
    private long currentMdatBytesDownloaded;
    private boolean currentMdatCompleted;
    private long currentMdatSize;
    private DownloadState currentState;
    private npg dataSpec;
    private final wuu defaultRequestProperties;
    private long endClientTime;
    private long idleTime;
    private boolean ignoreThisChunk;
    private boolean opened;
    private long prevMdatStartClientTimeMs;
    private final wuu requestProperties;
    private kvj0 response;
    private InputStream responseByteStream;
    private long segmentStartTimeMs;
    private long startClientTimeMs;
    private long startServerTimeMs;
    private long totalBytes;
    private long totalTime;
    private final TrackType trackType;
    private boolean useProgressBandwidthEstimate;
    private final String userAgent;

    /* renamed from: ru.yandex.video.m3.player.lowlatency.datasource.LowLatencyOkHttpDataSource$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState;

        static {
            int[] iArr = new int[DownloadState.values().length];
            $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState = iArr;
            try {
                iArr[DownloadState.OPEN_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.START_CHUNK_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.RECEIVING_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.ON_UUID_TAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.AFTER_HEADER_UUID_TAG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.BEFORE_MOOF_UUID_TAG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.RECEIVING_MOOF_BOX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.START_MDAT_BOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.RECEIVING_MDAT_BOX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[DownloadState.END_MDAT_BOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum DownloadState {
        INIT,
        OPEN_CONNECTION,
        RECEIVING_DATA,
        START_CHUNK_DOWNLOAD,
        ON_UUID_TAG,
        AFTER_HEADER_UUID_TAG,
        BEFORE_MOOF_UUID_TAG,
        RECEIVING_MOOF_BOX,
        START_MDAT_BOX,
        RECEIVING_MDAT_BOX,
        END_MDAT_BOX,
        CLOSE_CONNECTION
    }

    static {
        ge10.a("goog.exo.okhttp");
    }

    private LowLatencyOkHttpDataSource(xf7 xf7Var, String str, za7 za7Var, wuu wuuVar, hie0 hie0Var, ChunkDownloadListener chunkDownloadListener, TrackType trackType) {
        super(true);
        this.currentState = DownloadState.INIT;
        this.totalTime = 0L;
        this.totalBytes = 0L;
        this.currentMdatSize = 0L;
        this.currentMdatBytesDownloaded = 0L;
        this.currentMdatCompleted = true;
        this.useProgressBandwidthEstimate = true;
        this.segmentStartTimeMs = 0L;
        this.ignoreThisChunk = false;
        xf7Var.getClass();
        this.callFactory = xf7Var;
        this.userAgent = str;
        this.cacheControl = za7Var;
        this.defaultRequestProperties = wuuVar;
        this.contentTypePredicate = hie0Var;
        this.requestProperties = new wuu();
        this.chunkDownloadListener = chunkDownloadListener;
        this.trackType = trackType == null ? TrackType.Other : trackType;
    }

    private void closeConnectionQuietly() {
        this.currentState = DownloadState.CLOSE_CONNECTION;
        kvj0 kvj0Var = this.response;
        if (kvj0Var != null) {
            rvj0 rvj0Var = kvj0Var.z;
            rvj0Var.getClass();
            rvj0Var.close();
            this.response = null;
        }
        this.responseByteStream = null;
    }

    private kvj0 executeCall(yf7 yf7Var) throws IOException {
        final w4r0 w4r0Var = new w4r0();
        yf7Var.I(new al7() { // from class: ru.yandex.video.m3.player.lowlatency.datasource.LowLatencyOkHttpDataSource.1
            @Override // defpackage.al7
            public void onFailure(yf7 yf7Var2, IOException iOException) {
                w4r0Var.m(iOException);
            }

            @Override // defpackage.al7
            public void onResponse(yf7 yf7Var2, kvj0 kvj0Var) {
                w4r0Var.l(kvj0Var);
            }
        });
        try {
            return (kvj0) w4r0Var.get();
        } catch (InterruptedException unused) {
            yf7Var.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e) {
            kbs.r(e);
            return null;
        }
    }

    private void flushSampleAndResetState(long j, boolean z) {
        if (this.chunkDownloadListener != null && !this.ignoreThisChunk && !shouldIgnoreThisFlush()) {
            ChunkDownloadListener chunkDownloadListener = this.chunkDownloadListener;
            if (z) {
                chunkDownloadListener.flushChunk(this.trackType, this.totalBytes, this.totalTime);
            } else {
                chunkDownloadListener.flushSegment(this.trackType, this.totalBytes, this.totalTime);
            }
        }
        this.endClientTime = j;
        this.totalBytes = 0L;
        this.totalTime = 0L;
        this.ignoreThisChunk = false;
    }

    private kvj0 getResponse(yf7 yf7Var) throws IOException {
        final w4r0 w4r0Var = new w4r0();
        yf7Var.I(new al7() { // from class: ru.yandex.video.m3.player.lowlatency.datasource.LowLatencyOkHttpDataSource.2
            @Override // defpackage.al7
            public void onFailure(yf7 yf7Var2, IOException iOException) {
                w4r0Var.m(iOException);
            }

            @Override // defpackage.al7
            public void onResponse(yf7 yf7Var2, kvj0 kvj0Var) {
                w4r0Var.l(kvj0Var);
            }
        });
        try {
            return (kvj0) w4r0Var.get();
        } catch (InterruptedException unused) {
            yf7Var.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e) {
            throw ((IOException) e.getCause());
        }
    }

    private d5j0 makeRequest(npg npgVar) throws HttpDataSource$HttpDataSourceException {
        long j = npgVar.f;
        int i = npgVar.c;
        long j2 = npgVar.g;
        kwu h = kwu.h(npgVar.a.toString());
        if (h == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", npgVar, 1004);
        }
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = h;
        za7 za7Var = this.cacheControl;
        if (za7Var != null) {
            t4j0Var.b(za7Var);
        }
        HashMap hashMap = new HashMap();
        wuu wuuVar = this.defaultRequestProperties;
        if (wuuVar != null) {
            hashMap.putAll(wuuVar.c());
        }
        hashMap.putAll(this.requestProperties.c());
        hashMap.putAll(npgVar.e);
        for (Map.Entry entry : hashMap.entrySet()) {
            t4j0Var.d((String) entry.getKey(), (String) entry.getValue());
        }
        String a = pwu.a(j, j2);
        if (a != null) {
            t4j0Var.a("Range", a);
        }
        String str = this.userAgent;
        if (str != null) {
            t4j0Var.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
        }
        if (!npgVar.c(1)) {
            t4j0Var.a("Accept-Encoding", ClidProvider.IDENTITY);
        }
        byte[] bArr = npgVar.d;
        l5j0 l5j0Var = null;
        if (bArr != null) {
            int i2 = m5j0.a;
            l5j0Var = wms.c(null, bArr);
        } else if (i == 2) {
            byte[] bArr2 = tw21.c;
            int i3 = m5j0.a;
            l5j0Var = wms.c(null, bArr2);
        }
        t4j0Var.e(npg.b(i), l5j0Var);
        return new d5j0(t4j0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0183 A[ADDED_TO_REGION, LOOP:4: B:66:0x0183->B:67:0x0185, LOOP_START, PHI: r7 r8
      0x0183: PHI (r7v4 int) = (r7v3 int), (r7v5 int) binds: [B:65:0x0181, B:67:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0183: PHI (r8v2 long) = (r8v0 long), (r8v4 long) binds: [B:65:0x0181, B:67:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        char c;
        int i4 = i2;
        if (i4 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        long j2 = 0;
        if (j != -1) {
            long j3 = j - this.bytesRead;
            if (j3 == 0) {
                return -1;
            }
            i4 = (int) Math.min(i4, j3);
        }
        InputStream inputStream = this.responseByteStream;
        int i5 = tw21.a;
        int read = inputStream.read(bArr, i, i4);
        if (read == -1) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        switch (AnonymousClass3.$SwitchMap$ru$yandex$video$m3$player$lowlatency$datasource$LowLatencyOkHttpDataSource$DownloadState[this.currentState.ordinal()]) {
            case 1:
            case 2:
                this.currentMdatBytesDownloaded = 0L;
                this.currentMdatSize = 0L;
                this.currentState = DownloadState.RECEIVING_DATA;
                this.segmentStartTimeMs = System.currentTimeMillis();
                i3 = 8;
                if (read == i3) {
                    for (int i6 = 4; i6 < i3; i6++) {
                        j2 = (j2 << i3) + (bArr[i6] & 255);
                    }
                    if (j2 == uuidTagTrigger) {
                        this.currentState = DownloadState.ON_UUID_TAG;
                    }
                }
                this.totalBytes += read;
                submitPendingSample(currentTimeMillis);
                break;
            case 3:
                i3 = 8;
                if (read == i3) {
                }
                this.totalBytes += read;
                submitPendingSample(currentTimeMillis);
                break;
            case 4:
            case 5:
                if (read == 24) {
                    long j4 = 0;
                    for (int i7 = 8; i7 < 24; i7++) {
                        j4 = (j4 << 8) + (bArr[i7] & 255);
                    }
                    for (int i8 = 24; i8 < 32; i8++) {
                        j2 = (j2 << 8) + (bArr[i8] & 255);
                    }
                    if (j4 == afterHeaderUUIDTrigger) {
                        this.currentState = DownloadState.AFTER_HEADER_UUID_TAG;
                        this.startServerTimeMs = j2;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        this.startClientTimeMs = currentTimeMillis2;
                        this.prevMdatStartClientTimeMs = currentTimeMillis2;
                        this.useProgressBandwidthEstimate = false;
                    } else if (j4 == beforeMoofUUIDTrigger) {
                        this.currentState = DownloadState.BEFORE_MOOF_UUID_TAG;
                        this.idleTime = j2 - this.startServerTimeMs;
                        this.startServerTimeMs = j2;
                    }
                }
                this.totalBytes += read;
                break;
            case 6:
                this.currentState = DownloadState.RECEIVING_MOOF_BOX;
            case 7:
                if (read != 8) {
                    this.totalBytes += read;
                    break;
                } else {
                    long j5 = 0;
                    for (int i9 = 4; i9 < 8; i9++) {
                        j5 = (j5 << 8) + (bArr[i9] & 255);
                    }
                    if (j5 != mdatTagTrigger) {
                        this.totalBytes += read;
                        break;
                    } else {
                        this.currentState = DownloadState.START_MDAT_BOX;
                    }
                }
            case 8:
                if (this.currentMdatCompleted) {
                    this.currentMdatCompleted = false;
                    long j6 = currentTimeMillis - this.prevMdatStartClientTimeMs;
                    this.clientMdatLoadTime = j6;
                    long j7 = this.idleTime;
                    if (j6 >= j7) {
                        c = '\b';
                        this.totalTime = Math.min(j6 - j7, currentTimeMillis - this.endClientTime) + this.totalTime;
                        this.totalBytes += read;
                    } else {
                        c = '\b';
                        if (j7 < 50) {
                            this.totalTime = (currentTimeMillis - this.endClientTime) + this.totalTime;
                            this.totalBytes += read;
                        }
                    }
                    this.prevMdatStartClientTimeMs = currentTimeMillis - this.totalTime;
                    this.endClientTime = currentTimeMillis;
                } else {
                    c = '\b';
                }
                for (int i10 = 0; i10 < 4; i10++) {
                    j2 = (bArr[i10] & 255) + (j2 << c);
                }
                this.currentMdatSize = j2;
                this.currentMdatBytesDownloaded += read;
                this.currentState = DownloadState.RECEIVING_MDAT_BOX;
                this.startClientTimeMs = System.currentTimeMillis();
                break;
            case 9:
                long j8 = read;
                long j9 = this.currentMdatBytesDownloaded + j8;
                this.currentMdatBytesDownloaded = j9;
                this.totalBytes += j8;
                if (j9 != this.currentMdatSize) {
                    submitPendingSample(currentTimeMillis);
                    break;
                } else {
                    this.currentState = DownloadState.END_MDAT_BOX;
                }
            case 10:
                this.totalTime = (currentTimeMillis - this.endClientTime) + this.totalTime;
                flushSampleAndResetState(currentTimeMillis, true);
                this.currentMdatCompleted = true;
                this.currentState = DownloadState.START_CHUNK_DOWNLOAD;
                break;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private boolean shouldIgnoreThisFlush() {
        npg npgVar = this.dataSpec;
        if (npgVar == null) {
            return true;
        }
        String uri = npgVar.a.toString();
        return uri.contains(".mpd") || uri.contains("init.mp4");
    }

    private void skipFully(long j, npg npgVar) throws HttpDataSource$HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int min = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                InputStream inputStream = this.responseByteStream;
                int i = tw21.a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource$HttpDataSourceException(npgVar, 2008);
                }
                j -= read;
                bytesTransferred(read);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(npgVar, 2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }

    private void submitPendingSample(long j) {
        long max = j - Math.max(this.segmentStartTimeMs, this.endClientTime);
        ChunkDownloadListener chunkDownloadListener = this.chunkDownloadListener;
        if (chunkDownloadListener != null) {
            chunkDownloadListener.submitPendingSample(this.trackType, this.totalBytes, max, j);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource, defpackage.xuu
    public void clearAllRequestProperties() {
        this.requestProperties.a();
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource, defpackage.xuu
    public void clearRequestProperty(String str) {
        str.getClass();
        this.requestProperties.d(str);
    }

    @Override // defpackage.kpg
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
            closeConnectionQuietly();
        }
        if (this.useProgressBandwidthEstimate) {
            long currentTimeMillis = System.currentTimeMillis();
            this.totalTime = currentTimeMillis - this.segmentStartTimeMs;
            flushSampleAndResetState(currentTimeMillis, false);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource, defpackage.xuu
    public int getResponseCode() {
        kvj0 kvj0Var = this.response;
        if (kvj0Var == null) {
            return -1;
        }
        return kvj0Var.w;
    }

    @Override // defpackage.kpg
    public Map<String, List<String>> getResponseHeaders() {
        kvj0 kvj0Var = this.response;
        return kvj0Var == null ? Collections.EMPTY_MAP : kvj0Var.y.e();
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public Uri getInflatedUri() {
        kvj0 kvj0Var = this.response;
        if (kvj0Var == null) {
            return null;
        }
        return Uri.parse(kvj0Var.a.a.i);
    }

    @Override // defpackage.kpg
    public long open(npg npgVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArr;
        this.dataSpec = npgVar;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        this.currentState = DownloadState.OPEN_CONNECTION;
        this.useProgressBandwidthEstimate = true;
        transferInitializing(npgVar);
        d5j0 makeRequest = makeRequest(npgVar);
        try {
            this.currentState = DownloadState.START_CHUNK_DOWNLOAD;
            this.currentCall = this.callFactory.newCall(makeRequest);
            kvj0 response = getResponse(this.currentCall);
            this.response = response;
            rvj0 rvj0Var = response.z;
            rvj0Var.getClass();
            this.responseByteStream = rvj0Var.byteStream();
            int i = response.w;
            if (!response.J) {
                if (i == 416) {
                    if (npgVar.f == pwu.c(response.y.a("Content-Range"))) {
                        this.opened = true;
                        transferStarted(npgVar);
                        long j2 = npgVar.g;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                try {
                    InputStream inputStream = this.responseByteStream;
                    inputStream.getClass();
                    int i2 = tw21.a;
                    bArr = p77.b(inputStream);
                } catch (IOException unused) {
                    bArr = tw21.c;
                }
                byte[] bArr2 = bArr;
                TreeMap e = response.y.e();
                closeConnectionQuietly();
                throw new HttpDataSource$InvalidResponseCodeException(i, response.c, i == 416 ? new DataSourceException(2008) : null, e, npgVar, bArr2);
            }
            wg10 contentType = rvj0Var.contentType();
            String str = contentType != null ? contentType.a : "";
            hie0 hie0Var = this.contentTypePredicate;
            if (hie0Var != null && !hie0Var.apply(str)) {
                closeConnectionQuietly();
                throw new HttpDataSource$InvalidContentTypeException(str, npgVar);
            }
            if (i == 200) {
                long j3 = npgVar.f;
                if (j3 != 0) {
                    j = j3;
                }
            }
            long j4 = npgVar.g;
            if (j4 != -1) {
                this.bytesToRead = j4;
            } else {
                long contentLength = rvj0Var.contentLength();
                this.bytesToRead = contentLength != -1 ? contentLength - j : -1L;
            }
            this.opened = true;
            transferStarted(npgVar);
            try {
                skipFully(j, npgVar);
                return this.bytesToRead;
            } catch (HttpDataSource$HttpDataSourceException e2) {
                closeConnectionQuietly();
                throw e2;
            }
        } catch (IOException e3) {
            throw HttpDataSource$HttpDataSourceException.a(e3, npgVar, 1);
        }
    }

    @Override // defpackage.apg
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            npg npgVar = this.dataSpec;
            int i3 = tw21.a;
            throw HttpDataSource$HttpDataSourceException.a(e, npgVar, 2);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource, defpackage.xuu
    public void setRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.requestProperties.e(str, str2);
    }

    @Override // ru.yandex.video.m3.player.lowlatency.source.InterruptableHttpDataSource
    public boolean tryInterruptPendingRequest() {
        Socket socket;
        yf7 yf7Var = this.currentCall;
        if (yf7Var == null) {
            return false;
        }
        closeConnectionQuietly();
        yf7Var.cancel();
        xf7 xf7Var = this.callFactory;
        if (xf7Var instanceof OkHttpClient) {
            oci0 oci0Var = ((OkHttpClient) xf7Var).Z.a;
            Iterator it = oci0Var.f.iterator();
            while (it.hasNext()) {
                RealConnection realConnection = (RealConnection) it.next();
                synchronized (realConnection) {
                    if (realConnection.q.isEmpty()) {
                        it.remove();
                        realConnection.k = true;
                        socket = realConnection.e;
                    } else {
                        socket = null;
                    }
                }
                if (socket != null) {
                    bg61.d(socket);
                    oci0Var.b.getClass();
                }
            }
            if (oci0Var.f.isEmpty()) {
                oci0Var.d.a();
            }
        }
        return true;
    }

    public static final class Factory implements vuu, TrackTypeIdentifier {
        private za7 cacheControl;
        private final xf7 callFactory;
        private ChunkDownloadListener chunkDownloadListener;
        private hie0 contentTypePredicate;
        private final wuu defaultRequestProperties = new wuu();
        private TrackType trackType;
        private cj01 transferListener;
        private String userAgent;

        public Factory(xf7 xf7Var) {
            this.callFactory = xf7Var;
        }

        @Override // defpackage.vuu, defpackage.ipg
        public LowLatencyOkHttpDataSource createDataSource() {
            LowLatencyOkHttpDataSource lowLatencyOkHttpDataSource = new LowLatencyOkHttpDataSource(this.callFactory, this.userAgent, this.cacheControl, this.defaultRequestProperties, this.contentTypePredicate, this.chunkDownloadListener, this.trackType);
            cj01 cj01Var = this.transferListener;
            if (cj01Var != null) {
                lowLatencyOkHttpDataSource.addTransferListener(cj01Var);
            }
            return lowLatencyOkHttpDataSource;
        }

        public Factory setCacheControl(za7 za7Var) {
            this.cacheControl = za7Var;
            return this;
        }

        public Factory setContentTypePredicate(hie0 hie0Var) {
            this.contentTypePredicate = hie0Var;
            return this;
        }

        @Override // defpackage.vuu
        public Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.b(map);
            return this;
        }

        @Override // ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier
        public void setTrackType(TrackType trackType) {
            this.trackType = trackType;
        }

        public Factory setTransferListener(cj01 cj01Var) {
            this.transferListener = cj01Var;
            if (cj01Var instanceof ChunkDownloadListener) {
                this.chunkDownloadListener = (ChunkDownloadListener) cj01Var;
            }
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override // defpackage.vuu
        public /* bridge */ /* synthetic */ vuu setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }
    }
}
