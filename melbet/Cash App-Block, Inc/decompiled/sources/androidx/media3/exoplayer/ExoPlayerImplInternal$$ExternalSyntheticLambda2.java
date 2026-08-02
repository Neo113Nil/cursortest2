package androidx.media3.exoplayer;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.camera.core.SettableImageProxy;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.BinarySearchSeeker$SeekTimestampConverter;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.ts.SeiReader;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.cash.zipline.EventListener;
import bo.app.n8;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.appsflyer.internal.AFb1cSDK;
import com.caverock.androidsvg.SVG;
import com.datadog.trace.core.util.SimpleRateLimiter;
import com.fidesmo.sec.delivery.ErrorReportResult;
import com.fidesmo.sec.delivery.SecResponse;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest;
import com.google.android.datatransport.cct.internal.AutoValue_LogResponse;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.maps.zzai;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.json.JsonValueObjectEncoderContext;
import com.google.mlkit.vision.common.zzb;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate$CreateEmitter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function3;
import okhttp3.Request;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayerImplInternal$$ExternalSyntheticLambda2 implements ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory, BinarySearchSeeker$SeekTimestampConverter, Consumer, OnSuccessListener, OnCompleteListener, SwipeRefreshLayout.OnRefreshListener, EventListener.Factory, Function, io.reactivex.rxjava3.functions.Consumer, SynchronizationGuard$CriticalSection {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ExoPlayerImplInternal$$ExternalSyntheticLambda2(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.$r8$classId = 4;
        this.f$0 = decoderCounters;
    }

    @Override // androidx.media3.common.util.Consumer, io.reactivex.rxjava3.functions.Consumer
    public void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 11:
                ((ImmutableList.Builder) obj2).m2032add(obj);
                break;
            default:
                ((ObservableCreate$CreateEmitter) ((ObservableEmitter) obj2)).onError((Throwable) obj);
                break;
        }
    }

    public SimpleRateLimiter apply(SVG svg) {
        CctTransportBackend cctTransportBackend = (CctTransportBackend) this.f$0;
        URL url = (URL) svg.rootElement;
        String concat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(concat, 4)) {
            Log.i(concat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cctTransportBackend.readTimeout);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.2.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) svg.idToElementMap;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    zzb zzbVar = cctTransportBackend.dataEncoder;
                    AutoValue_BatchedLogRequest autoValue_BatchedLogRequest = (AutoValue_BatchedLogRequest) svg.cssRules;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    JsonDataEncoderBuilder jsonDataEncoderBuilder = (JsonDataEncoderBuilder) zzbVar.zza;
                    JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(bufferedWriter, jsonDataEncoderBuilder.objectEncoders, jsonDataEncoderBuilder.valueEncoders, jsonDataEncoderBuilder.fallbackEncoder, jsonDataEncoderBuilder.ignoreNullValues);
                    jsonValueObjectEncoderContext.add(autoValue_BatchedLogRequest);
                    jsonValueObjectEncoderContext.maybeUnNest();
                    jsonValueObjectEncoderContext.jsonWriter.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String concat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(concat2, 4)) {
                        Log.i(concat2, String.format("Status Code: %d", valueOf));
                    }
                    Logging.d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Logging.d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new SimpleRateLimiter(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new SimpleRateLimiter(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            SimpleRateLimiter simpleRateLimiter = new SimpleRateLimiter(responseCode, null, AutoValue_LogResponse.fromJson(new BufferedReader(new InputStreamReader(gZIPInputStream))).nextRequestWaitMillis);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return simpleRateLimiter;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException | IOException e) {
            Logging.e(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new SimpleRateLimiter(400, null, 0L);
        } catch (ConnectException | UnknownHostException e2) {
            Logging.e(e2, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new SimpleRateLimiter(500, null, 0L);
        }
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 10:
                AacUtil.consume(j, parsableByteArray, ((FragmentedMp4Extractor) obj).ceaTrackOutputs);
                break;
            case 13:
                AacUtil.consume(j, parsableByteArray, ((SeiReader) obj).outputs);
                break;
            default:
                AacUtil.consumeCcData(j, parsableByteArray, ((SeiReader) obj).outputs);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public RegularImmutableList create(int i, TrackGroup trackGroup, int[] iArr) {
        DefaultTrackSelector.Parameters parameters = (DefaultTrackSelector.Parameters) this.f$0;
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i2 = 0; i2 < trackGroup.length; i2++) {
            builder.m2032add((Object) new DefaultTrackSelector.ImageTrackInfo(i, trackGroup, i2, parameters, iArr[i2]));
        }
        return builder.build();
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) ((zzai) this.f$0).zze;
        SQLiteDatabase db = sQLiteEventStore.getDb();
        db.beginTransaction();
        try {
            db.compileStatement("DELETE FROM log_event_dropped").execute();
            db.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.wallClock.getTime()).execute();
            db.setTransactionSuccessful();
            db.endTransaction();
            return null;
        } catch (Throwable th) {
            db.endTransaction();
            throw th;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 1:
                ((Player.Listener) obj).onCues((CueGroup) obj2);
                break;
            case 2:
                ((Player.Listener) obj).onMediaMetadataChanged(ExoPlayerImpl.this.mediaMetadata);
                break;
            case 3:
                ((Player.Listener) obj).onMetadata((Metadata) obj2);
                break;
            case 4:
                ((AnalyticsListener) obj).onVideoDisabled((DecoderCounters) obj2);
                break;
            default:
                ((AnalyticsListener) obj).getClass();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 17:
                task.getClass();
                ((SettableImageProxy) obj).close();
                break;
            default:
                n8.a((n8) obj, task);
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ((WandScene$ring$3) this.f$0).invoke();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 16:
                ((xg$$ExternalSyntheticLambda9) obj2).invoke(obj);
                break;
            default:
                AFb1cSDK.getMonetizationNetwork((AFb1cSDK) obj2, (AppSetIdInfo) obj);
                break;
        }
    }

    public void set(Request.Builder builder, String str, String str2) {
        ((Function3) this.f$0).invoke(builder, str, str2);
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker$SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return Util.constrainValue((j * r8.sampleRate) / 1000000, 0L, ((FlacStreamMetadata) this.f$0).totalSamples - 1);
    }

    public /* synthetic */ ExoPlayerImplInternal$$ExternalSyntheticLambda2(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.$r8$classId = 5;
        this.f$0 = obj;
    }

    public /* synthetic */ ExoPlayerImplInternal$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // app.cash.zipline.EventListener.Factory
    public EventListener create(String str, String str2) {
        EventListener eventListener = (EventListener) this.f$0;
        str.getClass();
        return eventListener;
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        ErrorReportResult lambda$getReportClientErrorCall$17;
        lambda$getReportClientErrorCall$17 = ServiceDeliveryClient.lambda$getReportClientErrorCall$17((Boolean) this.f$0, (SecResponse) obj);
        return lambda$getReportClientErrorCall$17;
    }
}
