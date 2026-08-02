package com.google.android.filament;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.datadog.android.core.internal.utils.JsonSerializer$safeMapValuesToJson$1$1;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.event.RumEventMapper;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher$SlowFramesTelemetry;
import com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher$sendMetric$2;
import com.datadog.android.trace.api.propagation.DatadogPropagation;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.internal.DatadogSpanContextAdapter;
import com.datadog.android.trace.model.SpanEvent;
import com.datadog.trace.bootstrap.instrumentation.api.AgentSpan$Context;
import com.datadog.trace.bootstrap.instrumentation.api.TagContext;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.propagation.HttpCodec;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.analytics.metrics.FillrAPI;
import com.fillr.browsersdk.Fillr;
import com.fillr.e0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zaf;
import com.google.android.gms.common.moduleinstall.internal.zaj;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.common.moduleinstall.internal.zaz;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.mlkit_vision_common.zzhi;
import com.google.android.gms.internal.tapandpay.zzai;
import com.google.android.gms.internal.tapandpay.zzaj;
import com.google.android.gms.internal.tapandpay.zzc;
import com.google.android.gms.internal.tapandpay.zzd;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.zze;
import com.google.android.libraries.places.api.net.zzf;
import com.google.android.libraries.places.api.net.zzn;
import com.google.android.libraries.places.internal.zzbpq;
import com.google.android.libraries.places.internal.zzbpr;
import com.google.android.libraries.places.internal.zzbrl;
import com.google.android.libraries.places.internal.zzbrm;
import com.google.android.libraries.places.internal.zzbro;
import com.google.android.libraries.places.internal.zzbrs;
import com.google.android.libraries.places.internal.zzbru;
import com.google.android.libraries.places.internal.zzbsh;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzbtu;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbud;
import com.google.android.libraries.places.internal.zzbuf;
import com.google.android.libraries.places.internal.zzbvs;
import com.google.android.libraries.places.internal.zzbvt;
import com.google.android.libraries.places.internal.zzbzg;
import com.google.android.libraries.places.internal.zzcaf;
import com.google.android.libraries.places.internal.zzcax;
import com.google.android.libraries.places.internal.zzcdg;
import com.google.android.libraries.places.internal.zzcdh;
import com.google.android.libraries.places.internal.zzcdj;
import com.google.android.libraries.places.internal.zzcee;
import com.google.android.libraries.places.internal.zzcfa;
import com.google.android.libraries.places.internal.zzcfe;
import com.google.android.libraries.places.internal.zzcfj;
import com.google.android.libraries.places.internal.zzcfk;
import com.google.android.libraries.places.internal.zzcfm;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfa;
import com.google.android.libraries.places.internal.zzfv;
import com.google.android.libraries.places.internal.zzgb;
import com.google.android.libraries.places.internal.zzgc;
import com.google.android.libraries.places.internal.zzgg;
import com.google.android.libraries.places.internal.zzgh;
import com.google.android.libraries.places.internal.zzje;
import com.google.android.libraries.places.internal.zzld;
import com.google.android.libraries.places.internal.zzle;
import com.google.android.libraries.places.internal.zzmb;
import com.google.android.libraries.places.internal.zznj;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.FutureCallback;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.mlkit.common.sdkinternal.zzb;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$1;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.AndroidMainExecutor;

/* loaded from: classes4.dex */
public final class Box implements Serializer, DatadogPropagation, RemoteCall, FutureCallback, zzbru, zzbvt, SuccessContinuation, Continuation {
    public static Box _instance;
    public final /* synthetic */ int $r8$classId;
    public Object mCenter;
    public Object mHalfExtent;

    public Box(URI uri) {
        this.$r8$classId = 11;
        try {
            String uri2 = uri.toString();
            this.mCenter = URI.create(uri2 + "/features").normalize().toURL();
            URI.create(uri2 + "/metrics").normalize().toURL();
            this.mHalfExtent = URI.create(uri2 + "/register").normalize().toURL();
        } catch (MalformedURLException unused) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) uri, "Unleash API is not a valid URL: ");
            throw null;
        }
    }

    public static Box getInstance(String str, String str2) {
        if (_instance == null) {
            if (str == null) {
                str = "";
            }
            _instance = new Box(str, str2);
        }
        return _instance;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 13:
                zaj zajVar = new zaj((zay) this.mCenter, (TaskCompletionSource) obj2, 0);
                zaf zafVar = (zaf) ((zaz) obj).getService();
                ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.mHalfExtent;
                Parcel zaa = zafVar.zaa();
                zac.zac(zaa, zajVar);
                zac.zab(zaa, apiFeatureRequest);
                zafVar.zac(zaa, 1);
                break;
            default:
                PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) this.mCenter;
                Activity activity = (Activity) this.mHalfExtent;
                zzd zzdVar = (zzd) ((zzaj) obj).getService();
                zzai zzaiVar = new zzai(3, activity);
                Parcel zza = zzdVar.zza();
                int i = zzc.$r8$clinit;
                zza.writeInt(1);
                pushTokenizeRequest.writeToParcel(zza, 0);
                zza.writeStrongBinder(zzaiVar);
                zzdVar.zzb(zza, 28);
                break;
        }
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public DatadogSpanContext extract(Request request) {
        Box box = (Box) this.mHalfExtent;
        TagContext extract = ((HttpCodec.Extractor) box.mHalfExtent).extract(request, new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(19));
        if (extract != null) {
            return new DatadogSpanContextAdapter(extract);
        }
        return null;
    }

    public int getInt() {
        try {
            return Settings.System.getInt(((Context) this.mCenter).getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            DBUtil.log$default((InternalLogger) this.mHalfExtent, 4, InternalLogger.Target.MAINTAINER, new SessionWorker$doWork$2$2.AnonymousClass1(0), e, false, 48);
            return PKIFailureInfo.systemUnavail;
        }
    }

    @Override // com.datadog.android.trace.api.propagation.DatadogPropagation
    public void inject(DatadogSpanContext datadogSpanContext, Request.Builder builder, Function3 function3) {
        datadogSpanContext.getClass();
        if (!(datadogSpanContext instanceof DatadogSpanContextAdapter)) {
            DBUtil.log$default((InternalLogger) this.mCenter, 5, InternalLogger.Target.USER, new KeyHandle$keyPair$2(this, datadogSpanContext), null, false, 56);
            return;
        }
        Box box = (Box) this.mHalfExtent;
        AgentSpan$Context agentSpan$Context = ((DatadogSpanContextAdapter) datadogSpanContext).delegate;
        ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = new ExoPlayerImplInternal$$ExternalSyntheticLambda2(function3, 24);
        box.getClass();
        if (agentSpan$Context instanceof DDSpanContext) {
            DDSpanContext dDSpanContext = (DDSpanContext) agentSpan$Context;
            dDSpanContext.trace.setSamplingPriorityIfNecessary();
            ((HttpCodec.Injector) box.mCenter).inject(dDSpanContext, builder, exoPlayerImplInternal$$ExternalSyntheticLambda2);
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onFailure(Throwable th) {
        zzlj zzljVar = (zzlj) this.mHalfExtent;
        zzljVar.zzg();
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        zzljVar.zzi = false;
        zzljVar.zzx().add((zzoh) this.mCenter);
        if (zzljVar.zzj > ((Integer) zzfy.zzav.zzb(null)).intValue()) {
            zzljVar.zzj = 1;
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzgu.zzl(zzicVar.zzv().zzj()), zzgu.zzl(th.toString()));
            return;
        }
        zzgu zzguVar2 = zzicVar.zzi;
        zzic.zzP(zzguVar2);
        zzguVar2.zzg.zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgu.zzl(zzicVar.zzv().zzj()), zzgu.zzl(String.valueOf(zzljVar.zzj)), zzgu.zzl(th.toString()));
        int i = zzljVar.zzj;
        if (zzljVar.zzk == null) {
            zzljVar.zzk = new zzju(zzljVar, (zzjg) zzicVar, 1);
        }
        zzljVar.zzk.zzb(i * 1000);
        int i2 = zzljVar.zzj;
        zzljVar.zzj = i2 + i2;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onSuccess(Object obj) {
        zzlj zzljVar = (zzlj) this.mHalfExtent;
        zzljVar.zzg();
        zzic zzicVar = (zzic) zzljVar.$$delegate_0;
        zzhh zzhhVar = zzicVar.zzh;
        zzic.zzN(zzhhVar);
        SparseArray zzf = zzhhVar.zzf();
        zzoh zzohVar = (zzoh) this.mCenter;
        zzf.put(zzohVar.zzc, Long.valueOf(zzohVar.zzb));
        zzhh zzhhVar2 = zzicVar.zzh;
        zzic.zzN(zzhhVar2);
        int[] iArr = new int[zzf.size()];
        long[] jArr = new long[zzf.size()];
        for (int i = 0; i < zzf.size(); i++) {
            iArr[i] = zzf.keyAt(i);
            jArr[i] = ((Long) zzf.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhhVar2.zzi.zzb(bundle);
        zzljVar.zzi = false;
        zzljVar.zzj = 1;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzk.zzb(zzohVar.zza, "Successfully registered trigger URI");
        zzljVar.zzy$1();
    }

    public void sendEvent(Context context, AnalyticsEvent analyticsEvent) {
        String str = (String) this.mCenter;
        if (context == null) {
            return;
        }
        if (((FillrAPI) this.mHalfExtent) == null) {
            this.mHalfExtent = FillrAPI.getInstance(context, str);
        }
        if (((FillrAPI) this.mHalfExtent) == null) {
            return;
        }
        String str2 = analyticsEvent.devKey;
        if (str2 != null) {
            str2.equals(str);
        }
        analyticsEvent.devKey = str;
        try {
            ((FillrAPI) this.mHalfExtent).track(analyticsEvent.action, new JSONObject(new Gson().toJson(analyticsEvent)));
        } catch (JSONException unused) {
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void sendMetric(long j, String str) {
        str.getClass();
        DefaultUISlownessMetricDispatcher$SlowFramesTelemetry defaultUISlownessMetricDispatcher$SlowFramesTelemetry = (DefaultUISlownessMetricDispatcher$SlowFramesTelemetry) ((ConcurrentHashMap) this.mHalfExtent).remove(str);
        InternalLogger internalLogger = (InternalLogger) this.mCenter;
        if (defaultUISlownessMetricDispatcher$SlowFramesTelemetry == null) {
            DBUtil.log$default(internalLogger, 4, InternalLogger.Target.TELEMETRY, new Workflows__WorkflowActionKt$action$1(str, 4), null, false, 56);
            return;
        }
        int i = defaultUISlownessMetricDispatcher$SlowFramesTelemetry.slowFramesCount.get();
        int i2 = defaultUISlownessMetricDispatcher$SlowFramesTelemetry.ignoredFramesCount.get();
        int i3 = defaultUISlownessMetricDispatcher$SlowFramesTelemetry.missedFrameCount.get();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("metric_type", "rum ui slowness");
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put("view_duration", Long.valueOf(j));
        MapBuilder mapBuilder3 = new MapBuilder();
        mapBuilder3.put("count", Integer.valueOf(i));
        mapBuilder3.put("ignored_count", Integer.valueOf(i2));
        mapBuilder3.put("missed_count", Integer.valueOf(i3));
        MapBuilder mapBuilder4 = new MapBuilder();
        mapBuilder4.put("max_count", Integer.valueOf(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO));
        mapBuilder4.put("slow_frame_threshold", Float.valueOf(2.0f));
        mapBuilder4.put("max_duration", 700000000L);
        mapBuilder4.put("view_min_duration", 1000000000L);
        mapBuilder3.put("config", mapBuilder4.build());
        mapBuilder2.put("slow_frames", mapBuilder3.build());
        mapBuilder.put("rum_ui_slowness", mapBuilder2.build());
        ((com.google.android.gms.internal.measurement.zzlj) internalLogger).logMetric(DefaultUISlownessMetricDispatcher$sendMetric$2.INSTANCE, mapBuilder.build(), 0.75f, null);
    }

    public String serialize(DatadogContext datadogContext, SpanEvent spanEvent) {
        String str;
        String str2;
        Object value;
        datadogContext.getClass();
        SpanEvent.Meta meta = spanEvent.meta;
        SpanEvent.Usr usr = meta.usr;
        DatadogDataConstraints datadogDataConstraints = (DatadogDataConstraints) this.mHalfExtent;
        LinkedHashMap validateAttributes$default = zzhi.validateAttributes$default(datadogDataConstraints, usr.additionalProperties, "meta.usr", null, 12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(validateAttributes$default.size()));
        for (Map.Entry entry : validateAttributes$default.entrySet()) {
            Object key = entry.getKey();
            try {
                value = entry.getValue();
            } catch (Exception e) {
                DBUtil.log$default((InternalLogger) this.mCenter, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new JsonSerializer$safeMapValuesToJson$1$1(entry, 3), e, 48);
            }
            if (!Intrinsics.areEqual(value, MapUtilsKt.NULL_MAP_VALUE) && value != null) {
                str2 = value instanceof Date ? String.valueOf(((Date) value).getTime()) : value instanceof JsonPrimitive ? ((JsonPrimitive) value).getAsString() : value.toString();
                linkedHashMap.put(key, str2);
            }
            str2 = null;
            linkedHashMap.put(key, str2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        String str3 = usr.id;
        String str4 = usr.name;
        String str5 = usr.email;
        SpanEvent.Metrics metrics = spanEvent.metrics;
        LinkedHashMap validateAttributes$default2 = zzhi.validateAttributes$default(datadogDataConstraints, metrics.additionalProperties, "metrics", null, 12);
        Long l = metrics.topLevel;
        String str6 = meta.version;
        SpanEvent.Dd dd = meta.dd;
        SpanEvent.Tracer tracer = meta.tracer;
        SpanEvent.Network network = meta.network;
        SpanEvent.Device device = meta.device;
        SpanEvent.Os os = meta.os;
        Map map = meta.additionalProperties;
        str6.getClass();
        String str7 = spanEvent.traceId;
        String str8 = spanEvent.spanId;
        String str9 = spanEvent.parentId;
        String str10 = spanEvent.resource;
        String str11 = spanEvent.name;
        String str12 = spanEvent.service;
        long j = spanEvent.duration;
        long j2 = spanEvent.start;
        long j3 = spanEvent.error;
        str10.getClass();
        str11.getClass();
        str12.getClass();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("trace_id", str7);
        jsonObject.addProperty("span_id", str8);
        jsonObject.addProperty("parent_id", str9);
        jsonObject.addProperty("resource", str10);
        jsonObject.addProperty("name", str11);
        jsonObject.addProperty("service", str12);
        jsonObject.addProperty("duration", Long.valueOf(j));
        jsonObject.addProperty("start", Long.valueOf(j2));
        jsonObject.addProperty(BreadcrumbHelper.Category.ERROR, Long.valueOf(j3));
        jsonObject.addProperty("type", "custom");
        JsonObject jsonObject2 = new JsonObject();
        if (l != null) {
            RumErrorSource$EnumUnboxingLocalUtility.m(l, jsonObject2, "_top_level");
        }
        for (Map.Entry entry3 : validateAttributes$default2.entrySet()) {
            String str13 = (String) entry3.getKey();
            Number number = (Number) entry3.getValue();
            if (!ArraysKt___ArraysKt.contains(SpanEvent.Metrics.RESERVED_PROPERTIES, str13)) {
                jsonObject2.addProperty(str13, number);
            }
        }
        jsonObject.add("metrics", jsonObject2);
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("version", str6);
        JsonObject jsonObject4 = new JsonObject();
        String str14 = dd.source;
        if (str14 != null) {
            jsonObject4.addProperty("source", str14);
        }
        SpanEvent.Application application = dd.application;
        if (application != null) {
            JsonObject jsonObject5 = new JsonObject();
            String str15 = application.id;
            if (str15 != null) {
                jsonObject5.addProperty("id", str15);
            }
            jsonObject4.add("application", jsonObject5);
        }
        SpanEvent.Session session = dd.session;
        if (session != null) {
            JsonObject jsonObject6 = new JsonObject();
            String str16 = session.id;
            if (str16 != null) {
                jsonObject6.addProperty("id", str16);
            }
            jsonObject4.add("session", jsonObject6);
        }
        SpanEvent.View view = dd.view;
        if (view != null) {
            JsonObject jsonObject7 = new JsonObject();
            String str17 = view.id;
            if (str17 != null) {
                jsonObject7.addProperty("id", str17);
            }
            jsonObject4.add("view", jsonObject7);
        }
        jsonObject3.add("_dd", jsonObject4);
        JsonObject jsonObject8 = new JsonObject();
        jsonObject8.addProperty("kind", "client");
        jsonObject3.add("span", jsonObject8);
        JsonObject jsonObject9 = new JsonObject();
        jsonObject9.addProperty("version", tracer.version);
        jsonObject3.add("tracer", jsonObject9);
        JsonObject jsonObject10 = new JsonObject();
        if (str3 != null) {
            jsonObject10.addProperty("id", str3);
        }
        if (str4 != null) {
            jsonObject10.addProperty("name", str4);
        }
        if (str5 != null) {
            jsonObject10.addProperty("email", str5);
        }
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            String str18 = (String) entry4.getKey();
            Object value2 = entry4.getValue();
            if (!ArraysKt___ArraysKt.contains(SpanEvent.Usr.RESERVED_PROPERTIES, str18)) {
                jsonObject10.add(str18, JsonSerializer.toJsonElement(value2));
            }
        }
        jsonObject3.add("usr", jsonObject10);
        if (network != null) {
            JsonObject jsonObject11 = new JsonObject();
            SpanEvent.Client client = network.client;
            JsonObject jsonObject12 = new JsonObject();
            SpanEvent.SimCarrier simCarrier = client.simCarrier;
            if (simCarrier != null) {
                JsonObject jsonObject13 = new JsonObject();
                String str19 = simCarrier.id;
                if (str19 != null) {
                    jsonObject13.addProperty("id", str19);
                }
                String str20 = simCarrier.name;
                if (str20 != null) {
                    jsonObject13.addProperty("name", str20);
                }
                jsonObject12.add("sim_carrier", jsonObject13);
            }
            String str21 = client.signalStrength;
            if (str21 != null) {
                jsonObject12.addProperty("signal_strength", str21);
            }
            String str22 = client.downlinkKbps;
            if (str22 != null) {
                jsonObject12.addProperty("downlink_kbps", str22);
            }
            String str23 = client.uplinkKbps;
            if (str23 != null) {
                jsonObject12.addProperty("uplink_kbps", str23);
            }
            String str24 = client.connectivity;
            if (str24 != null) {
                jsonObject12.addProperty("connectivity", str24);
            }
            jsonObject11.add("client", jsonObject12);
            jsonObject3.add("network", jsonObject11);
        }
        JsonObject jsonObject14 = new JsonObject();
        int i = device.f976type;
        if (i != 0) {
            switch (i) {
                case 1:
                    str = "mobile";
                    break;
                case 2:
                    str = "desktop";
                    break;
                case 3:
                    str = "tablet";
                    break;
                case 4:
                    str = "tv";
                    break;
                case 5:
                    str = "gaming_console";
                    break;
                case 6:
                    str = "bot";
                    break;
                case 7:
                    str = "other";
                    break;
                default:
                    throw null;
            }
            jsonObject14.add("type", new JsonPrimitive(str));
        }
        String str25 = device.name;
        if (str25 != null) {
            jsonObject14.addProperty("name", str25);
        }
        String str26 = device.model;
        if (str26 != null) {
            jsonObject14.addProperty("model", str26);
        }
        String str27 = device.brand;
        if (str27 != null) {
            jsonObject14.addProperty("brand", str27);
        }
        String str28 = device.architecture;
        if (str28 != null) {
            jsonObject14.addProperty("architecture", str28);
        }
        jsonObject3.add("device", jsonObject14);
        JsonObject jsonObject15 = new JsonObject();
        jsonObject15.addProperty("name", os.name);
        jsonObject15.addProperty("version", os.version);
        jsonObject15.addProperty("version_major", os.versionMajor);
        jsonObject3.add("os", jsonObject15);
        for (Map.Entry entry5 : map.entrySet()) {
            String str29 = (String) entry5.getKey();
            String str30 = (String) entry5.getValue();
            if (!ArraysKt___ArraysKt.contains(SpanEvent.Meta.RESERVED_PROPERTIES, str29)) {
                jsonObject3.addProperty(str29, str30);
            }
        }
        jsonObject.add("meta", jsonObject3);
        JsonArray jsonArray = new JsonArray(1);
        jsonArray.add(jsonObject);
        JsonObject jsonObject16 = new JsonObject();
        jsonObject16.add("spans", jsonArray);
        jsonObject16.addProperty("env", datadogContext.env);
        String jsonElement = jsonObject16.toString();
        jsonElement.getClass();
        return jsonElement;
    }

    public void setIntentExtras(Intent intent) {
        String str = (String) this.mCenter;
        System.out.println("SDK SET INTENT EXTRAS");
        Fillr fillr = Fillr.getInstance();
        String str2 = null;
        if (fillr != null) {
            intent.putExtra("com.fillr.devkey", fillr.getDeveloperKey());
            SVG svg = fillr.fillrConfig;
            intent.putExtra("com.fillr.secretkey", svg == null ? null : (String) svg.cssRules);
        }
        intent.putExtra("com.fillr.sdkpackage", str);
        intent.putExtra("com.fillr.sdkversion", "11.2.0");
        intent.putExtra("com.fillr.whitelistdisabled", false);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_package", str);
            jSONObject.put("developer_key", Fillr.getInstance() == null ? null : Fillr.getInstance().getDeveloperKey());
            jSONObject.put("version", "11.2.0");
            SVG svg2 = (SVG) this.mHalfExtent;
            jSONObject.put("sdk_analytics_user_id", svg2 != null ? FillrAPI.getInstance((Context) svg2.cssRules, (String) svg2.rootElement).mPersistentIdentity.getEventsDistinctId() : "");
            str2 = jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (str2 != null) {
            intent.putExtra("com.fillr.additionalinfo", str2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ImmutableList immutableList;
        int i;
        boolean z;
        Location location = (Location) obj;
        e0 e0Var = (e0) this.mCenter;
        zzn zznVar = (zzn) this.mHalfExtent;
        e0Var.getClass();
        Trace.checkNotNull(location, "Location must not be null.");
        Box box = (Box) e0Var.c;
        WifiManager wifiManager = (WifiManager) ((Context) box.mHalfExtent).getSystemService("wifi");
        int i2 = 1;
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            immutableList = RegularImmutableList.EMPTY;
        } else {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults == null || scanResults.isEmpty()) {
                ImmutableList.Itr itr2 = ImmutableList.EMPTY_ITR;
                immutableList = RegularImmutableList.EMPTY;
            } else {
                RegularImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(Ordering.from(zzgh.zza), scanResults);
                ArrayList arrayList = new ArrayList();
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int i3 = sortedCopyOf.size;
                int i4 = 0;
                while (i4 < i3) {
                    ScanResult scanResult = (ScanResult) sortedCopyOf.get(i4);
                    if (TextUtils.isEmpty(scanResult.SSID)) {
                        i = i4;
                    } else {
                        ((zzfa) ((zzex) box.mCenter)).getClass();
                        i = i4;
                        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - scanResult.timestamp;
                        String str = scanResult.SSID;
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Null SSID.");
                            return null;
                        }
                        if (str.indexOf(95) >= 0) {
                            String lowerCase = str.toLowerCase(Locale.ENGLISH);
                            if (lowerCase.contains("_nomap") || lowerCase.contains("_optout")) {
                                z = true;
                                if (elapsedRealtime <= 60000000 && !z) {
                                    arrayList.add(new zzgg(connectionInfo, scanResult));
                                }
                            }
                        }
                        z = false;
                        if (elapsedRealtime <= 60000000) {
                            arrayList.add(new zzgg(connectionInfo, scanResult));
                        }
                    }
                    i4 = i + 1;
                }
                immutableList = ImmutableList.copyOf((Collection) arrayList);
            }
        }
        JWECryptoParts jWECryptoParts = (JWECryptoParts) e0Var.a;
        if (zznVar.zza.isEmpty()) {
            return Room.forException(new ApiException(new Status(9012, "Place Fields must not be empty.", null, null)));
        }
        zzje zzjeVar = (zzje) jWECryptoParts.header;
        zznj zznjVar = Places.zza;
        zzld zzldVar = new zzld(zznVar, location, immutableList, zznjVar.zzf(), zznjVar.zze(), zzjeVar);
        zzex zzexVar = (zzex) jWECryptoParts.authenticationTag;
        zbc zbcVar = (zbc) jWECryptoParts.encryptedKey;
        ((zzfa) zzexVar).getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzw zza = zbcVar.zza(zzldVar, zzle.class);
        zzgc zzgcVar = new zzgc(29);
        zza.getClass();
        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
        return ((zzw) zza.continueWith(androidMainExecutor, zzgcVar)).continueWith(androidMainExecutor, new zzmb(jWECryptoParts, elapsedRealtime2, i2));
    }

    @Override // com.google.android.libraries.places.internal.zzbru
    public void zza(zzbpr zzbprVar) {
        zzcdj zzcdjVar = (zzcdj) this.mCenter;
        zzcdh zzcdhVar = (zzcdh) this.mHalfExtent;
        zzbrm zzbrmVar = zzcdjVar.zzj;
        zzfz zzfzVar = zzcdjVar.zzl;
        zzbrs zzbrsVar = zzcdhVar.zza;
        zzbpq zzbpqVar = zzbprVar.zza;
        HashMap hashMap = zzcdjVar.zzk;
        if (zzcdhVar == hashMap.get(zzcdj.zzv(zzbrsVar)) && zzbpqVar != zzbpq.zze) {
            zzbpq zzbpqVar2 = zzbpq.zzb;
            zzbpq zzbpqVar3 = zzbpq.zzd;
            if (zzbpqVar == zzbpqVar3 && zzcdhVar.zzb == zzbpqVar2) {
                zzbrmVar.zzc();
            }
            zzcdhVar.zzd(zzbpqVar);
            zzbpq zzbpqVar4 = zzcdjVar.zzp;
            zzbpq zzbpqVar5 = zzbpq.zza;
            zzbpq zzbpqVar6 = zzbpq.zzc;
            if (zzbpqVar4 == zzbpqVar6 || zzcdjVar.zzq == zzbpqVar6) {
                if (zzbpqVar == zzbpqVar5) {
                    return;
                }
                if (zzbpqVar == zzbpqVar3) {
                    zzcdjVar.zzd();
                    return;
                }
            }
            int ordinal = zzbpqVar.ordinal();
            if (ordinal == 0) {
                zzcdjVar.zzp = zzbpqVar5;
                zzcdjVar.zzs(zzbpqVar5, new zzbrl(zzbro.zza));
                return;
            }
            if (ordinal == 1) {
                Box box = zzcdjVar.zzs;
                if (box != null) {
                    box.zza();
                    zzcdjVar.zzs = null;
                }
                zzcdjVar.zzu = null;
                Box box2 = zzcdjVar.zzo;
                if (box2 != null) {
                    box2.zza();
                    zzcdjVar.zzo = null;
                }
                for (zzcdh zzcdhVar2 : hashMap.values()) {
                    if (!zzcdhVar2.zza.equals(zzbrsVar)) {
                        zzcdhVar2.zza.zzb();
                    }
                }
                hashMap.clear();
                zzcdhVar.zzd(zzbpqVar2);
                hashMap.put(zzcdj.zzv(zzbrsVar), zzcdhVar);
                zzfzVar.zzh(zzcdj.zzv(zzbrsVar));
                zzcdjVar.zzp = zzbpqVar2;
                zzcdjVar.zzr(zzcdhVar);
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported state:".concat(String.valueOf(zzbpqVar)));
                    return;
                }
                zzfzVar.zzb = 0;
                zzcdjVar.zzp = zzbpqVar3;
                zzcdjVar.zzs(zzbpqVar3, new zzcdg(zzcdjVar, zzcdjVar));
                return;
            }
            if (zzfzVar.zza() && hashMap.get(zzfzVar.zzd()) == zzcdhVar) {
                if (zzfzVar.zzb()) {
                    Box box3 = zzcdjVar.zzo;
                    if (box3 != null) {
                        box3.zza();
                        zzcdjVar.zzo = null;
                    }
                    zzcdjVar.zzd();
                } else if (hashMap.size() >= ((List) zzfzVar.zza).size()) {
                    zzcdjVar.zzq();
                } else {
                    zzfzVar.zzb = 0;
                    zzcdjVar.zzd();
                }
            }
            if (hashMap.size() >= ((List) zzfzVar.zza).size()) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    if (!((zzcdh) it.next()).zzc) {
                        return;
                    }
                }
                zzcdjVar.zzp = zzbpqVar6;
                zzcdjVar.zzs(zzbpqVar6, new zzbrl(zzbro.zzb(zzbprVar.zzb)));
                int i = zzcdjVar.zzm + 1;
                zzcdjVar.zzm = i;
                if (i >= ((List) zzfzVar.zza).size() || zzcdjVar.zzn) {
                    zzcdjVar.zzn = false;
                    zzcdjVar.zzm = 0;
                    zzbrmVar.zzc();
                }
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zzb(zzfv zzfvVar) {
        zzcax zzcaxVar = (zzcax) this.mHalfExtent;
        zzcfj zzcfjVar = zzcaxVar.zzr.zzf;
        Trace.checkState("Headers should be received prior to messages.", zzcfjVar != null);
        if (zzcfjVar == ((zzcfj) this.mCenter)) {
            zzbuf zzbufVar = zzcaxVar.zzd$1;
            zzbufVar.zzb(new zzb(11, this, zzfvVar));
            zzbufVar.zza();
        } else {
            Logger logger = zzbzg.zzp;
            while (true) {
                InputStream inputStream = (InputStream) zzfvVar.zza;
                zzfvVar.zza = null;
                if (inputStream == null) {
                    return;
                } else {
                    zzbzg.zzh(inputStream);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x027b  */
    @Override // com.google.android.libraries.places.internal.zzbvt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzc(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        boolean z;
        zzcaf zzcafVar;
        String m;
        Integer num = -1;
        zzcax zzcaxVar = (zzcax) this.mHalfExtent;
        synchronized (zzcaxVar.zzl) {
            try {
                zzcfa zzcfaVar = zzcaxVar.zzr;
                zzcfj zzcfjVar = (zzcfj) this.mCenter;
                zzcfjVar.zzb = true;
                Collection collection = zzcfaVar.zzc;
                if (collection.contains(zzcfjVar)) {
                    ArrayList arrayList = new ArrayList(collection);
                    arrayList.remove(zzcfjVar);
                    zzcfaVar = new zzcfa(zzcfaVar.zzb, Collections.unmodifiableCollection(arrayList), zzcfaVar.zzd, zzcfaVar.zzf, zzcfaVar.zzg, zzcfaVar.zza, zzcfaVar.zzh, zzcfaVar.zze);
                }
                zzcaxVar.zzr = zzcfaVar;
                zzcaxVar.zzq.zza.add(String.valueOf(zzbtxVar.zzn));
            } finally {
            }
        }
        zzcax zzcaxVar2 = (zzcax) this.mHalfExtent;
        int i = 0;
        if (zzcaxVar2.zzu.decrementAndGet() == Integer.MIN_VALUE) {
            zzbuf zzbufVar = zzcaxVar2.zzd$1;
            zzbufVar.zzb(new zzcfe(this, i));
            zzbufVar.zza();
            return;
        }
        zzcfj zzcfjVar2 = (zzcfj) this.mCenter;
        if (zzcfjVar2.zzc) {
            zzcee zzaf = zzcaxVar2.zzaf(zzcfjVar2);
            if (zzaf != null) {
                zzcaxVar2.zzc$1.execute(zzaf);
            }
            if (zzcaxVar2.zzr.zzf == zzcfjVar2) {
                zzcaxVar2.zzal(zzbtxVar, zzbvsVar, zzbsnVar);
                return;
            }
            return;
        }
        zzbvs zzbvsVar2 = zzbvs.zzd;
        if (zzbvsVar == zzbvsVar2 && zzcaxVar2.zzt.incrementAndGet() > 1000) {
            zzcee zzaf2 = zzcaxVar2.zzaf(zzcfjVar2);
            if (zzaf2 != null) {
                zzcaxVar2.zzc$1.execute(zzaf2);
            }
            if (zzcaxVar2.zzr.zzf == zzcfjVar2) {
                zzbtu zzbtuVar = zzbtu.INTERNAL;
                Logger logger = zzbzg.zzp;
                zzbtx zzb = zzbtuVar.zzb();
                String str = zzbtxVar.zzo;
                zzbtu zzbtuVar2 = zzbtxVar.zzn;
                if (str == null) {
                    m = zzbtuVar2.toString();
                } else {
                    String valueOf = String.valueOf(zzbtuVar2);
                    String str2 = zzbtxVar.zzo;
                    m = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 2 + String.valueOf(str2).length()), valueOf, ": ", str2);
                }
                zzcaxVar2.zzal(zzb.zze("Too many transparent retries. Might be a bug in gRPC: ".concat(String.valueOf(m))).zzd(zzbtxVar.zzp), zzbvsVar, zzbsnVar);
                return;
            }
            return;
        }
        if (zzcaxVar2.zzr.zzf == null) {
            if (zzbvsVar == zzbvsVar2 || (zzbvsVar == zzbvs.zzb && zzcaxVar2.zzs.compareAndSet(false, true))) {
                zzcax zzcaxVar3 = (zzcax) this.mHalfExtent;
                zzcfj zzcfjVar3 = (zzcfj) this.mCenter;
                zzcfj zzag = zzcaxVar3.zzag(zzcfjVar3.zzd, true, false);
                if (zzag != null) {
                    if (zzcaxVar3.zzk) {
                        synchronized (zzcaxVar3.zzl) {
                            zzcfa zzcfaVar2 = zzcaxVar3.zzr;
                            ArrayList arrayList2 = new ArrayList(zzcfaVar2.zzd);
                            arrayList2.remove(zzcfjVar3);
                            arrayList2.add(zzag);
                            zzcaxVar3.zzr = new zzcfa(zzcfaVar2.zzb, zzcfaVar2.zzc, Collections.unmodifiableCollection(arrayList2), zzcfaVar2.zzf, zzcfaVar2.zzg, zzcfaVar2.zza, zzcfaVar2.zzh, zzcfaVar2.zze);
                        }
                    }
                    ((zzcax) this.mHalfExtent).zzc$1.execute(new zzb(10, this, zzag));
                    return;
                }
                return;
            }
            if (zzbvsVar != zzbvs.zzc) {
                zzcaxVar2.zzs.set(true);
                if (zzcaxVar2.zzk) {
                    String str3 = (String) zzbsnVar.zzb(zzcax.zzf);
                    if (str3 != null) {
                        try {
                            num = Integer.valueOf(str3);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        num = null;
                    }
                    zzcax zzcaxVar4 = (zzcax) this.mHalfExtent;
                    boolean contains = zzcaxVar4.zzj.zzc.contains(zzbtxVar.zzn);
                    boolean z2 = (zzcaxVar4.zzp == null || (!contains && (num == null || num.intValue() >= 0))) ? false : !zzcaxVar4.zzp.zzb();
                    if (contains && !z2 && !zzbtxVar.zzj() && num != null && num.intValue() > 0) {
                        num = 0;
                    }
                    boolean z3 = contains && !z2;
                    if (z3) {
                        zzcaxVar4.zzy(num);
                    }
                    synchronized (zzcaxVar4.zzl) {
                        try {
                            zzcfa zzcfaVar3 = zzcaxVar4.zzr;
                            zzcfj zzcfjVar4 = (zzcfj) this.mCenter;
                            ArrayList arrayList3 = new ArrayList(zzcfaVar3.zzd);
                            arrayList3.remove(zzcfjVar4);
                            zzcaxVar4.zzr = new zzcfa(zzcfaVar3.zzb, zzcfaVar3.zzc, Collections.unmodifiableCollection(arrayList3), zzcfaVar3.zzf, zzcfaVar3.zzg, zzcfaVar3.zza, zzcfaVar3.zzh, zzcfaVar3.zze);
                            if (!z3 || (!zzcaxVar4.zzaj(zzcaxVar4.zzr) && zzcaxVar4.zzr.zzd.isEmpty())) {
                            }
                            return;
                        } finally {
                        }
                    }
                }
                zzcfm zzcfmVar = zzcaxVar2.zzi;
                long j = 0;
                if (zzcfmVar != null) {
                    boolean contains2 = zzcfmVar.zzf.contains(zzbtxVar.zzn);
                    String str4 = (String) zzbsnVar.zzb(zzcax.zzf);
                    if (str4 != null) {
                        try {
                            num = Integer.valueOf(str4);
                        } catch (NumberFormatException unused2) {
                        }
                    } else {
                        num = null;
                    }
                    boolean z4 = zzcaxVar2.zzp != null ? (contains2 || (num != null && num.intValue() < 0)) ? !zzcaxVar2.zzp.zzb() : false : false;
                    zzcfm zzcfmVar2 = zzcaxVar2.zzi;
                    if (zzcfmVar2.zza > zzcfjVar2.zzd + 1 && !z4) {
                        if (num == null) {
                            if (contains2) {
                                long j2 = zzcaxVar2.zzA;
                                Random random = zzcax.zzD;
                                boolean z5 = zzcax.zzE;
                                double nextDouble = random.nextDouble();
                                if (z5) {
                                    nextDouble = (nextDouble * 0.4d) + 0.8d;
                                }
                                double d = j2;
                                zzcaxVar2.zzA = Math.min((long) (d * zzcfmVar2.zzd), zzcaxVar2.zzi.zzc);
                                j = (long) (nextDouble * d);
                                z = true;
                            }
                        } else if (num.intValue() >= 0) {
                            j = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                            zzcaxVar2.zzA = zzcaxVar2.zzi.zzb;
                            z = true;
                        }
                        if (z) {
                            zzcfj zzag2 = zzcaxVar2.zzag(zzcfjVar2.zzd + 1, false, false);
                            if (zzag2 != null) {
                                synchronized (zzcaxVar2.zzl) {
                                    zzcafVar = new zzcaf(zzcaxVar2.zzl);
                                    zzcaxVar2.zzy = zzcafVar;
                                }
                                zzcafVar.zza(((zzcax) this.mHalfExtent).zzg.schedule(new Fillr.AnonymousClass2(this, zzcafVar, zzag2, false, 25), j, TimeUnit.NANOSECONDS));
                                return;
                            }
                            return;
                        }
                    }
                }
                z = false;
                if (z) {
                }
            } else if (zzcaxVar2.zzk) {
                zzcaxVar2.zzak();
            }
        }
        zzcax zzcaxVar5 = (zzcax) this.mHalfExtent;
        zzcfj zzcfjVar5 = (zzcfj) this.mCenter;
        zzcee zzaf3 = zzcaxVar5.zzaf(zzcfjVar5);
        if (zzaf3 != null) {
            zzcaxVar5.zzc$1.execute(zzaf3);
        }
        if (zzcaxVar5.zzr.zzf == zzcfjVar5) {
            zzcaxVar5.zzal(zzbtxVar, zzbvsVar, zzbsnVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zzd() {
        zzcax zzcaxVar = (zzcax) this.mHalfExtent;
        if (zzcaxVar.zzm()) {
            zzbuf zzbufVar = zzcaxVar.zzd$1;
            zzbufVar.zzb(new zzcfe(this, 1));
            zzbufVar.zza();
        }
    }

    public /* synthetic */ Box(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.mCenter = obj;
        this.mHalfExtent = obj2;
    }

    public Box(InternalLogger internalLogger, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 7:
                DatadogDataConstraints datadogDataConstraints = new DatadogDataConstraints(internalLogger);
                this.mCenter = internalLogger;
                this.mHalfExtent = datadogDataConstraints;
                break;
            default:
                internalLogger.getClass();
                this.mCenter = internalLogger;
                this.mHalfExtent = new ConcurrentHashMap();
                break;
        }
    }

    public /* synthetic */ Box(e0 e0Var, zze zzeVar, zzgb zzgbVar) {
        this.$r8$classId = 29;
        this.mCenter = e0Var;
        this.mHalfExtent = zzeVar;
    }

    public /* synthetic */ Box(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.mCenter = obj2;
        this.mHalfExtent = obj;
    }

    public Box(IBinder iBinder) {
        this.$r8$classId = 12;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.mCenter = new Messenger(iBinder);
            this.mHalfExtent = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.mHalfExtent = new com.google.android.gms.cloudmessaging.zzd(iBinder);
            this.mCenter = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ Box(zzbtx zzbtxVar, Object obj) {
        this.$r8$classId = 22;
        Trace.checkNotNull(zzbtxVar, "status");
        this.mCenter = zzbtxVar;
        this.mHalfExtent = obj;
    }

    public /* synthetic */ Box(zzbud zzbudVar, ScheduledFuture scheduledFuture) {
        this.$r8$classId = 23;
        this.mCenter = zzbudVar;
        Trace.checkNotNull(scheduledFuture, "future");
        this.mHalfExtent = scheduledFuture;
    }

    public Box(zzcax zzcaxVar, zzcfj zzcfjVar) {
        this.$r8$classId = 26;
        Objects.requireNonNull(zzcaxVar);
        this.mHalfExtent = zzcaxVar;
        this.mCenter = zzcfjVar;
    }

    public /* synthetic */ Box(int i) {
        this.$r8$classId = i;
    }

    public Box(Context context, InternalLogger internalLogger) {
        this.$r8$classId = 4;
        context.getClass();
        internalLogger.getClass();
        this.mCenter = context;
        this.mHalfExtent = internalLogger;
    }

    public Box(InternalLogger internalLogger, Box box) {
        this.$r8$classId = 6;
        internalLogger.getClass();
        box.getClass();
        this.mCenter = internalLogger;
        this.mHalfExtent = box;
    }

    public Box(InternalLogger internalLogger, PlainFileReaderWriter plainFileReaderWriter) {
        this.$r8$classId = 1;
        internalLogger.getClass();
        this.mCenter = internalLogger;
        this.mHalfExtent = plainFileReaderWriter;
    }

    public Box(HttpCodec.Extractor extractor, HttpCodec.Injector injector, EnumMap enumMap) {
        this.$r8$classId = 8;
        this.mHalfExtent = extractor;
        this.mCenter = injector;
    }

    public Box() {
        this.$r8$classId = 0;
        this.mCenter = new float[3];
        this.mHalfExtent = new float[3];
    }

    public Box(Context context) {
        this.$r8$classId = 10;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            this.mCenter = applicationContext.getPackageName();
        }
    }

    public Box(float f, float f2, float f3, float f4, float f5, float f6) {
        this.$r8$classId = 0;
        this.mCenter = new float[]{f, f2, f3};
        this.mHalfExtent = new float[]{f4, f5, f6};
    }

    public Box(String str, String str2) {
        this.$r8$classId = 9;
        this.mCenter = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        e0 e0Var = (e0) this.mCenter;
        ((zbc) e0Var.i).zzo((zze) this.mHalfExtent, 3);
        "IsOpenGetPlace".concat("Duration");
        "IsOpenGetPlace".concat("Battery");
        return (zzf) task.getResult();
    }

    public void zza() {
        ((zzbud) this.mCenter).zzb = true;
        ((ScheduledFuture) this.mHalfExtent).cancel(false);
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zza(zzbsn zzbsnVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        zzcfj zzcfjVar = (zzcfj) this.mCenter;
        int i3 = zzcfjVar.zzd;
        if (i3 > 0) {
            zzbsh zzbshVar = zzcax.zze;
            zzbsnVar.zzd(zzbshVar);
            zzbsnVar.zzc(zzbshVar, String.valueOf(i3));
        }
        zzcax zzcaxVar = (zzcax) this.mHalfExtent;
        zzcee zzaf = zzcaxVar.zzaf(zzcfjVar);
        if (zzaf != null) {
            zzcaxVar.zzc$1.execute(zzaf);
        }
        if (zzcaxVar.zzr.zzf == zzcfjVar) {
            zzcfk zzcfkVar = zzcaxVar.zzp;
            if (zzcfkVar != null) {
                do {
                    atomicInteger = zzcfkVar.zzd;
                    i = atomicInteger.get();
                    i2 = zzcfkVar.zza;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(zzcfkVar.zzc + i, i2)));
            }
            zzbuf zzbufVar = zzcaxVar.zzd$1;
            zzbufVar.zzb(new zzb(8, this, zzbsnVar));
            zzbufVar.zza();
        }
    }

    @Override // com.datadog.android.core.persistence.Serializer
    public String serialize(Object obj) {
        obj.getClass();
        Object map = ((RumEventMapper) this.mCenter).map(obj);
        if (map == null) {
            return null;
        }
        return ((RumEventSerializer) this.mHalfExtent).serialize(map);
    }
}
