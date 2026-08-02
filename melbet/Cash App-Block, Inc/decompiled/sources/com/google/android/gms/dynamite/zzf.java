package com.google.android.gms.dynamite;

import android.content.Context;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.TextRange;
import androidx.lifecycle.AtomicReference;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzahe;
import com.google.android.gms.internal.measurement.zzahq;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import com.squareup.cash.presenters.AccentColorsKt;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import okhttp3.internal.connection.Exchange;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class zzf implements Saver, SupportSQLiteOpenHelper.Factory, DynamiteModule.VersionPolicy.IVersions, zzak, zzbo {
    public final /* synthetic */ int $r8$classId;
    public static final /* synthetic */ zzf zza = new zzf(12);
    public static final /* synthetic */ zzf zza$1 = new zzf(13);
    public static final /* synthetic */ zzf zza$2 = new zzf(14);
    public static final /* synthetic */ zzf zza$3 = new zzf(15);
    public static final /* synthetic */ zzf zza$4 = new zzf(16);
    public static final /* synthetic */ zzf zza$5 = new zzf(17);
    public static final /* synthetic */ zzf zza$6 = new zzf(18);
    public static final /* synthetic */ zzf zza$7 = new zzf(19);
    public static final /* synthetic */ zzf zza$8 = new zzf(20);
    public static final /* synthetic */ zzf zza$9 = new zzf(21);
    public static final /* synthetic */ zzf zza$10 = new zzf(22);
    public static final /* synthetic */ zzf zza$11 = new zzf(23);
    public static final /* synthetic */ zzf zza$12 = new zzf(24);
    public static final /* synthetic */ zzf zza$13 = new zzf(25);
    public static final /* synthetic */ zzf zza$14 = new zzf(26);
    public static final /* synthetic */ zzf zza$15 = new zzf(27);
    public static final /* synthetic */ zzf zza$16 = new zzf(28);
    public static final /* synthetic */ zzf zza$17 = new zzf(29);

    public /* synthetic */ zzf(int i) {
        this.$r8$classId = i;
    }

    public static final float access$lookupAndInterpolate(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        int length = fArr.length - 1;
        float f5 = RecyclerView.DECELERATION_RATE;
        if (i2 >= length) {
            float f6 = fArr[fArr.length - 1];
            return f6 == RecyclerView.DECELERATION_RATE ? RecyclerView.DECELERATION_RATE : (fArr2[fArr.length - 1] / f6) * f;
        }
        if (i2 == -1) {
            f2 = fArr[0];
            f3 = fArr2[0];
            f4 = 0.0f;
        } else {
            float f7 = fArr[i2];
            f2 = fArr[i];
            f5 = fArr2[i2];
            f3 = fArr2[i];
            f4 = f7;
        }
        return AccentColorsKt.constrainedMap(f5, f3, f4, f2, abs) * signum;
    }

    public static AtomicReference create$default(ViewModelStoreOwner viewModelStoreOwner, ViewModelProvider$Factory viewModelProvider$Factory, int i) {
        if ((i & 2) != 0) {
            viewModelProvider$Factory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
        }
        CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        viewModelProvider$Factory.getClass();
        defaultViewModelCreationExtras.getClass();
        return new AtomicReference(viewModelStoreOwner.getViewModelStore(), viewModelProvider$Factory, defaultViewModelCreationExtras);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(Exchange exchange) {
        return new FrameworkSQLiteOpenHelper((Context) exchange.call, (String) exchange.finder, (SupportSQLiteOpenHelper.Callback) exchange.codec, exchange.isDuplex, exchange.hasFailure);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public Object mo380restore(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        String str = (String) obj3;
        Object obj4 = list.get(2);
        obj4.getClass();
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        obj5.getClass();
        int intValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        obj6.getClass();
        long TextRange = SizeKt.TextRange(intValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        obj7.getClass();
        int intValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        obj8.getClass();
        long TextRange2 = SizeKt.TextRange(intValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        obj9.getClass();
        return new TextUndoOperation(intValue, str, str2, TextRange, TextRange2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaveableHolder saveableHolder, Object obj) {
        TextUndoOperation textUndoOperation = (TextUndoOperation) obj;
        Integer valueOf = Integer.valueOf(textUndoOperation.index);
        String str = textUndoOperation.preText;
        String str2 = textUndoOperation.postText;
        long j = textUndoOperation.preSelection;
        int i = TextRange.$r8$clinit;
        Integer valueOf2 = Integer.valueOf((int) (j >> 32));
        Integer valueOf3 = Integer.valueOf((int) (j & BodyPartID.bodyIdMax));
        long j2 = textUndoOperation.postSelection;
        return CollectionsKt__CollectionsKt.listOf(valueOf, str, str2, valueOf2, valueOf3, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (BodyPartID.bodyIdMax & j2)), Long.valueOf(textUndoOperation.timeInMillis));
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 13:
                return new Boolean(zzahq.zza());
            case 14:
                List list = zzfy.zzbk;
                return zzahe.zzb();
            case 15:
                List list2 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(10L, "measurement.upload.max_realtime_events_per_day", 74).get()).longValue());
            case 16:
                List list3 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 17:
                List list4 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(21600000L, "measurement.sgtm.batch.retry_max_wait", 43).get();
            case 18:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(1000L, "measurement.sgtm.upload.min_delay_after_broadcast", 49).get();
            case 19:
                List list6 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(3600000L, "measurement.upload.window_interval", 79).get();
            case 20:
                List list7 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(60000L, "measurement.alarm_manager.minimum_interval", 27).get();
            case 21:
                List list8 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(1800000L, "measurement.upload.retry_time", 77).get();
            case 22:
                List list9 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(200L, "measurement.audience.filter_result_max_count", 22).get()).longValue());
            case 23:
                List list10 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 24:
                List list11 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(50L, "measurement.experiment.max_ids", 21).get()).longValue());
            case 25:
                List list12 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(7200000L, "measurement.redaction.app_instance_id.ttl", 62).get();
            case 26:
                List list13 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 27:
                List list14 = zzfy.zzbk;
                zzags.zza.get();
                return (String) zzagu.zza.zzd(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 28:
                List list15 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(90L, "measurement.rb.attribution.client.min_time_after_boot_seconds", 55).get()).longValue());
            default:
                List list16 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(3000L, "measurement.rb.attribution.notify_app_delay_millis", 30).get()).longValue());
        }
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public int zzb(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public int zza(Context context, String str, boolean z) {
        return DynamiteModule.zza(context, str, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzak
    public /* synthetic */ String zza(String str, String str2) {
        return null;
    }
}
