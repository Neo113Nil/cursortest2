package androidx.collection.internal;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.text.font.FontWeight;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.profileinstaller.ProfileInstaller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzahb;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaie;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class Lock implements CreationExtras.Key, ProfileInstaller.DiagnosticsCallback, DynamiteModule.VersionPolicy, zzbo {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ Lock zza = new Lock(13);
    public static final /* synthetic */ Lock zza$1 = new Lock(14);
    public static final /* synthetic */ Lock zza$2 = new Lock(15);
    public static final /* synthetic */ Lock zza$3 = new Lock(16);
    public static final /* synthetic */ Lock zza$4 = new Lock(17);
    public static final /* synthetic */ Lock zza$5 = new Lock(18);
    public static final /* synthetic */ Lock zza$6 = new Lock(19);
    public static final /* synthetic */ Lock zza$7 = new Lock(20);
    public static final /* synthetic */ Lock zza$8 = new Lock(21);
    public static final /* synthetic */ Lock zza$9 = new Lock(22);
    public static final /* synthetic */ Lock zza$10 = new Lock(23);
    public static final /* synthetic */ Lock zza$11 = new Lock(24);
    public static final /* synthetic */ Lock zza$12 = new Lock(25);
    public static final /* synthetic */ Lock zza$13 = new Lock(26);
    public static final /* synthetic */ Lock zza$14 = new Lock(27);
    public static final /* synthetic */ Lock zza$15 = new Lock(28);
    public static final /* synthetic */ Lock zza$16 = new Lock(29);

    public /* synthetic */ Lock(int i) {
        this.$r8$classId = i;
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    public static Typeface m130createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i) {
        if (i == 0 && Intrinsics.areEqual(fontWeight, FontWeight.Normal) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fontWeight.weight, i == 1);
    }

    /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
    public static LinearGradient m131horizontalGradient8A3gB4$default(List list, float f, float f2, int i) {
        return new LinearGradient(list, null, (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax));
    }

    /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
    public static LinearGradient m132linearGradientmHitzGk(Pair[] pairArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new Color(((Color) pair.second).value));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.first).floatValue()));
        }
        return new LinearGradient(arrayList, arrayList2, j, j2);
    }

    @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
    public void onDiagnosticReceived() {
    }

    @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
    public void onResultReceived(int i, Object obj) {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i = 1;
        int zza2 = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza2;
        int i2 = selectionResult.localVersion;
        if (i2 == 0) {
            i2 = 0;
            if (zza2 == 0) {
                i = 0;
                selectionResult.selection = i;
                return selectionResult;
            }
        }
        if (i2 >= zza2) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 13:
                return new Boolean(zzahb.zza());
            case 14:
                List list = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 15:
                List list2 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(50000L, "measurement.upload.max_public_events_per_day", 72).get()).longValue());
            case 16:
                List list3 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 17:
                List list4 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(21600000L, "measurement.sgtm.upload.retry_max_wait", 52).get();
            case 18:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(5L, "measurement.sgtm.upload.batches_retrieval_limit", 46).get()).longValue());
            case 19:
                List list6 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(86400000L, "measurement.config.cache_time", 5).get();
            case 20:
                List list7 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(1000L, "measurement.upload.debug_upload_interval", 9).get();
            case 21:
                List list8 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(15000L, "measurement.upload.initial_upload_delay_time", 64).get();
            case 22:
                List list9 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(605000L, "measurement.upload.google_signal_max_queue_time", 15).get();
            case 23:
                List list10 = zzfy.zzbk;
                zzaic.zza.get();
                return (Boolean) zzaie.zza.zza("measurement.test.boolean_flag", 0, false).get();
            case 24:
                List list11 = zzfy.zzbk;
                zzaic.zza.get();
                return Integer.valueOf((int) ((Long) zzaie.zza.zzb(-2L, "measurement.test.int_flag", 3).get()).longValue());
            case 25:
                List list12 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(100L, "measurement.max_bundles_per_iteration", 3).get()).longValue());
            case 26:
                List list13 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(1L, "measurement.dma_consent.max_daily_dcu_realtime_events", 18).get()).longValue());
            case 27:
                List list14 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 28:
                List list15 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(864000000L, "measurement.rb.attribution.max_queue_time", 57).get();
            default:
                List list16 = zzfy.zzbk;
                zzags.zza.get();
                return (Boolean) zzagu.zza.zza("measurement.config.bundle_for_all_apps_on_backgrounded", 2, true).get();
        }
    }

    /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
    public static LinearGradient m133verticalGradient8A3gB4$default(List list) {
        return new LinearGradient(list, null, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
    }
}
