package app.cash.trifle;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.profileinstaller.ProfileInstaller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzahe;
import com.google.android.gms.internal.measurement.zzahh;
import com.google.android.gms.internal.measurement.zzaic;
import com.google.android.gms.internal.measurement.zzaie;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzxs;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class Trifle implements CornerSize, CreationExtras.Key, ProfileInstaller.DiagnosticsCallback, DynamiteModule.VersionPolicy, zzbo {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ Trifle zza = new Trifle(13);
    public static final /* synthetic */ Trifle zza$1 = new Trifle(14);
    public static final /* synthetic */ Trifle zza$2 = new Trifle(15);
    public static final /* synthetic */ Trifle zza$3 = new Trifle(16);
    public static final /* synthetic */ Trifle zza$4 = new Trifle(17);
    public static final /* synthetic */ Trifle zza$5 = new Trifle(18);
    public static final /* synthetic */ Trifle zza$6 = new Trifle(19);
    public static final /* synthetic */ Trifle zza$7 = new Trifle(20);
    public static final /* synthetic */ Trifle zza$8 = new Trifle(21);
    public static final /* synthetic */ Trifle zza$9 = new Trifle(22);
    public static final /* synthetic */ Trifle zza$10 = new Trifle(23);
    public static final /* synthetic */ Trifle zza$11 = new Trifle(24);
    public static final /* synthetic */ Trifle zza$12 = new Trifle(25);
    public static final /* synthetic */ Trifle zza$13 = new Trifle(26);
    public static final /* synthetic */ Trifle zza$14 = new Trifle(27);
    public static final /* synthetic */ Trifle zza$15 = new Trifle(28);
    public static final /* synthetic */ Trifle zza$16 = new Trifle(29);

    public /* synthetic */ Trifle(int i) {
        this.$r8$classId = i;
    }

    /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
    public static long m1424hslJlNiLsg$default(float f, float f2, float f3, float f4) {
        int i = Color.$r8$clinit;
        Rgb rgb = ColorSpaces.Srgb;
        if (RecyclerView.DECELERATION_RATE > f || f > 360.0f || RecyclerView.DECELERATION_RATE > f2 || f2 > 1.0f || RecyclerView.DECELERATION_RATE > f3 || f3 > 1.0f) {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HSL (", f, ", ", f2, ", ");
            m.append(f3);
            m.append(") must be in range (0..360, 0..1, 0..1)");
            InlineClassHelperKt.throwIllegalArgumentException(m.toString());
        }
        return ColorKt.Color(hslToRgbComponent(f, f2, f3, 0), hslToRgbComponent(f, f2, f3, 8), hslToRgbComponent(f, f2, f3, 4), f4, rgb);
    }

    public static float hslToRgbComponent(float f, float f2, float f3, int i) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
    public void onDiagnosticReceived() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
    public void onResultReceived(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int zza2;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int zzb = iVersions.zzb(context, str);
        selectionResult.localVersion = zzb;
        int i = 1;
        int i2 = 0;
        if (zzb != 0) {
            zza2 = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = zza2;
        } else {
            zza2 = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = zza2;
        }
        int i3 = selectionResult.localVersion;
        if (i3 != 0) {
            i2 = i3;
        } else if (zza2 == 0) {
            i = 0;
            selectionResult.selection = i;
            return selectionResult;
        }
        if (i2 >= zza2) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo339toPxTmRCtEA(long j, Density density) {
        return RecyclerView.DECELERATION_RATE;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 2:
                return "ZeroCornerSize";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza, reason: collision with other method in class */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 13:
                return new Boolean(zzahh.zzb());
            case 14:
                List list = zzfy.zzbk;
                return zzahe.zza();
            case 15:
                List list2 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(10000L, "measurement.upload.max_conversions_per_day", 68).get()).longValue());
            case 16:
                List list3 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 17:
                List list4 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(1800000L, "measurement.sgtm.batch.retry_interval", 41).get();
            case 18:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(5000L, "measurement.sgtm.upload.min_delay_after_startup", 50).get();
            case 19:
                List list6 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(43200000L, "measurement.upload.backoff_period", 63).get();
            case 20:
                List list7 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(500L, "measurement.upload.minimum_delay", 28).get();
            case 21:
                List list8 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(8, "measurement.config.url_scheme", "https").get();
            case 22:
                List list9 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(4L, "measurement.lifetimevalue.max_currency_tracked", 17).get()).longValue());
            case 23:
                List list10 = zzfy.zzbk;
                zzaic.zza.get();
                return (String) zzaie.zza.zzd(5, "measurement.test.string_flag", "---").get();
            case 24:
                List list11 = zzfy.zzbk;
                zzaic.zza.get();
                WorkLauncherImpl workLauncherImpl = zzaie.zza;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) workLauncherImpl.processor;
                zzof zzofVar = (zzof) atomicReferenceArray.get(2);
                zzof zzofVar2 = zzofVar;
                if (zzofVar == null) {
                    zznz zznzVar = new zznz((zzpi) ((zzxs) workLauncherImpl.workTaskExecutor).zza$1);
                    boolean m = FillrEnv$EnumUnboxingLocalUtility.m(atomicReferenceArray, zznzVar);
                    zzofVar2 = zznzVar;
                    if (!m) {
                        zzof zzofVar3 = (zzof) atomicReferenceArray.get(2);
                        zzofVar3.getClass();
                        zzofVar2 = zzofVar3;
                    }
                }
                return (Double) zzofVar2.get();
            case 25:
                List list12 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(604800000L, "measurement.sdk.attribution.cache.ttl", 61).get();
            case 26:
                List list13 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 27:
                List list14 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 28:
                List list15 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(16L, "measurement.rb.attribution.max_retry_delay_seconds", 54).get()).longValue());
            default:
                List list16 = zzfy.zzbk;
                zzags.zza.get();
                return (Boolean) zzagu.zza.zza("measurement.config.notify_trigger_uris_on_backgrounded", 31, true).get();
        }
    }

    public static final boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
