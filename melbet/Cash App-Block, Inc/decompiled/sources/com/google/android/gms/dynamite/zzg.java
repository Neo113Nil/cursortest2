package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import androidx.core.provider.FontsContractCompat;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bugsnag.android.internal.InternalMetrics;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzagy;
import com.google.android.gms.internal.measurement.zzahe;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaie;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public class zzg implements CreationExtras.Key, CoroutineContext.Key, InternalMetrics, DynamiteModule.VersionPolicy, zzbo {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ zzg zza = new zzg(12);
    public static final /* synthetic */ zzg zza$1 = new zzg(13);
    public static final /* synthetic */ zzg zza$2 = new zzg(14);
    public static final /* synthetic */ zzg zza$3 = new zzg(15);
    public static final /* synthetic */ zzg zza$4 = new zzg(16);
    public static final /* synthetic */ zzg zza$5 = new zzg(17);
    public static final /* synthetic */ zzg zza$6 = new zzg(18);
    public static final /* synthetic */ zzg zza$7 = new zzg(19);
    public static final /* synthetic */ zzg zza$8 = new zzg(20);
    public static final /* synthetic */ zzg zza$9 = new zzg(21);
    public static final /* synthetic */ zzg zza$10 = new zzg(22);
    public static final /* synthetic */ zzg zza$11 = new zzg(23);
    public static final /* synthetic */ zzg zza$12 = new zzg(24);
    public static final /* synthetic */ zzg zza$13 = new zzg(25);
    public static final /* synthetic */ zzg zza$14 = new zzg(26);
    public static final /* synthetic */ zzg zza$15 = new zzg(27);
    public static final /* synthetic */ zzg zza$16 = new zzg(28);
    public static final /* synthetic */ zzg zza$17 = new zzg(29);

    public zzg() {
        this.$r8$classId = 4;
        new ConcurrentHashMap();
    }

    public static Font findBaseFont(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int matchScore = getMatchScore(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int matchScore2 = getMatchScore(fontStyle, font2.getStyle());
            if (matchScore2 < matchScore) {
                font = font2;
                matchScore = matchScore2;
            }
        }
        return font;
    }

    public static Snapshot getCurrentThreadSnapshot() {
        return (Snapshot) SnapshotKt.threadSnapshot.get();
    }

    public static int getMatchScore(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Snapshot makeCurrentNonObservable(Snapshot snapshot) {
        if (snapshot instanceof TransparentObserverMutableSnapshot) {
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
            if (transparentObserverMutableSnapshot.threadId == Expect_jvmKt.currentThreadId()) {
                transparentObserverMutableSnapshot.readObserver = null;
                return snapshot;
            }
        }
        if (snapshot instanceof TransparentObserverSnapshot) {
            TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
            if (transparentObserverSnapshot.threadId == Expect_jvmKt.currentThreadId()) {
                transparentObserverSnapshot.readObserver = null;
                return snapshot;
            }
        }
        Snapshot createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(snapshot, null, false);
        createTransparentSnapshotWithNoParentReadObserver.makeCurrent();
        return createTransparentSnapshotWithNoParentReadObserver;
    }

    public static Object observe(Function0 function0, Function1 function1) {
        Snapshot transparentObserverMutableSnapshot;
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        if (snapshot instanceof TransparentObserverMutableSnapshot) {
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
            if (transparentObserverMutableSnapshot2.threadId == Expect_jvmKt.currentThreadId()) {
                Function1 function12 = transparentObserverMutableSnapshot2.readObserver;
                Function1 function13 = transparentObserverMutableSnapshot2.writeObserver;
                try {
                    ((TransparentObserverMutableSnapshot) snapshot).readObserver = SnapshotKt.mergedReadObserver(function1, function12, true);
                    ((TransparentObserverMutableSnapshot) snapshot).writeObserver = function13;
                    return function0.invoke();
                } finally {
                    transparentObserverMutableSnapshot2.readObserver = function12;
                    transparentObserverMutableSnapshot2.writeObserver = function13;
                }
            }
        }
        if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
            transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, function1, null, true, false);
        } else {
            transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(function1);
        }
        try {
            Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
            try {
                Object invoke = function0.invoke();
                Snapshot.restoreCurrent(makeCurrent);
                transparentObserverMutableSnapshot.dispose();
                return invoke;
            } catch (Throwable th) {
                Snapshot.restoreCurrent(makeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            transparentObserverMutableSnapshot.dispose();
            throw th2;
        }
    }

    public static void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, Function1 function1) {
        if (snapshot != snapshot2) {
            snapshot2.getClass();
            Snapshot.restoreCurrent(snapshot);
            snapshot2.dispose();
        } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
            ((TransparentObserverMutableSnapshot) snapshot).readObserver = function1;
        } else if (snapshot instanceof TransparentObserverSnapshot) {
            ((TransparentObserverSnapshot) snapshot).readObserver = function1;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$1(snapshot, "Non-transparent snapshot was reused: ");
        }
    }

    public Typeface createFromFontInfoWithFallback(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamily = getFontFamily((FontsContractCompat.FontInfo[]) list.get(0), contentResolver);
            if (fontFamily == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamily);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamily2 = getFontFamily((FontsContractCompat.FontInfo[]) list.get(i2), contentResolver);
                if (fontFamily2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamily2);
                }
            }
            return customFallbackBuilder.setStyle(findBaseFont(fontFamily, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public FontFamily getFontFamily(FontsContractCompat.FontInfo[] fontInfoArr, ContentResolver contentResolver) {
        Font font;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.isSystemFont()) {
                font = getFontFromSystemFont(fontInfo);
            } else {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(fontInfo.getWeight()).setSlant(fontInfo.isItalic() ? 1 : 0).setTtcIndex(fontInfo.getTtcIndex());
                        if (!TextUtils.isEmpty(fontInfo.getVariationSettings())) {
                            ttcIndex.setFontVariationSettings(fontInfo.getVariationSettings());
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font getFontFromSystemFont(FontsContractCompat.FontInfo fontInfo) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void notifyAddCallback(String str) {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int zza2 = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza2;
        if (zza2 != 0) {
            selectionResult.selection = 1;
            return selectionResult;
        }
        int zzb = iVersions.zzb(context, str);
        selectionResult.localVersion = zzb;
        if (zzb != 0) {
            selectionResult.selection = -1;
        }
        return selectionResult;
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setBreadcrumbTrimMetrics(int i, int i2) {
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setCallbackCounts(HashMap hashMap) {
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setConfigDifferences(Map map) {
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public void setMetadataTrimMetrics(int i, int i2) {
    }

    @Override // com.bugsnag.android.internal.InternalMetrics
    public Map toJsonableMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 12:
                return new Boolean(zzagy.zza());
            case 13:
                List list = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time", 1).get();
            case 14:
                List list2 = zzfy.zzbk;
                return zzahe.zzc();
            case 15:
                List list3 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(100000L, "measurement.store.max_stored_events_per_app", 20).get()).longValue());
            case 16:
                List list4 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(600000L, "measurement.sgtm.upload.retry_interval", 51).get();
            case 17:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(10L, "measurement.sgtm.batch.retry_max_count", 42).get()).longValue());
            case 18:
                List list6 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(600000L, "measurement.sgtm.upload.min_delay_after_background", 48).get();
            case 19:
                List list7 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(3600000L, "measurement.upload.interval", 65).get();
            case 20:
                List list8 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(86400000L, "measurement.upload.stale_data_deletion_interval", 53).get();
            case 21:
                List list9 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(6L, "measurement.upload.retry_count", 76).get()).longValue());
            case 22:
                List list10 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(5000L, "measurement.service_client.idle_disconnect_millis", 36).get();
            case 23:
                List list11 = zzfy.zzbk;
                zzaic.zza.get();
                return (Long) zzaie.zza.zzb(-1L, "measurement.test.long_flag", 4).get();
            case 24:
                List list12 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(27L, "measurement.upload.max_item_scoped_custom_parameters", 23).get()).longValue());
            case 25:
                List list13 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(100L, "measurement.upload.max_bundles", 67).get()).longValue());
            case 26:
                List list14 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 27:
                List list15 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 28:
                List list16 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once", 25).get()).longValue());
            default:
                List list17 = zzfy.zzbk;
                zzags.zza.get();
                return (Boolean) zzagu.zza.zza("measurement.config.default_flag_values", 10, true).get();
        }
    }

    public /* synthetic */ zzg(int i) {
        this.$r8$classId = i;
    }
}
