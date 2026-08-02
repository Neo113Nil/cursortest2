package com.google.mlkit.common.internal;

import androidx.biometric.CryptoObjectUtils;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzahp;
import com.google.android.gms.internal.measurement.zzahz;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaih;
import com.google.android.gms.internal.measurement.zzail;
import com.google.android.gms.internal.measurement.zzajd;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.play.integrity.internal.aw;
import com.google.android.play.integrity.internal.ax;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.vision.text.internal.zzp;
import com.squareup.cash.cdf.NameProvider;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class zzb implements zzbo, aw, EngineWrapper, ComponentFactory, NameProvider {
    public static zzb singleton;
    public static final /* synthetic */ zzb zza = new zzb(1);
    public static final /* synthetic */ zzb zza$1 = new zzb(2);
    public static final /* synthetic */ zzb zza$2 = new zzb(3);
    public static final /* synthetic */ zzb zza$3 = new zzb(4);
    public static final /* synthetic */ zzb zza$4 = new zzb(5);
    public static final /* synthetic */ zzb zza$5 = new zzb(6);
    public final /* synthetic */ int $r8$classId;

    public zzb(ax axVar, aw awVar) {
        this.$r8$classId = 7;
    }

    @Override // com.google.android.play.integrity.internal.az
    public Object a() {
        switch (this.$r8$classId) {
            case 7:
                return new zza(7);
            default:
                return new zze(7);
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        switch (this.$r8$classId) {
            case 0:
                return new MlKitThreadPool();
            case 11:
                CryptoObjectUtils.zzb();
                return new zzf(1);
            default:
                return new zzp((MlKitContext) zzljVar.get(MlKitContext.class));
        }
    }

    @Override // com.google.crypto.tink.subtle.EngineWrapper
    public Object getInstance(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // com.squareup.cash.cdf.NameProvider
    public String getName() {
        switch (this.$r8$classId) {
            case 15:
                return "Asset Request DismissSheet";
            case 16:
                return "Asset Send Start";
            case 17:
                return "BlockerFlow Interact ReceiveJourneyOutcome";
            case 18:
                return "Cash Deposit Canceled";
            case 19:
                return "Cash Send Cancel";
            case 20:
                return "CashCard Manage Disable";
            case 21:
                return "Crypto Trade Start";
            case 22:
                return "Instrument Link Initiate";
            case 23:
                return "LocalClient CheckoutFlow ViewOrderStatus";
            case 24:
                return "MintTag Lock Failed";
            case 25:
                return "Moneybot ActionCard Result";
            case 26:
                return "NearbyPayment Discover PageLand";
            case 27:
                return "NearbyPayment Nux LocationPermissionResult";
            default:
                return "SavingsFolder TransferOut Start";
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 1:
                List list = zzfy.zzbk;
                return (Boolean) zzahp.zzb.get();
            case 2:
                List list2 = zzfy.zzbk;
                return Boolean.valueOf(zzajd.zza());
            case 3:
                List list3 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(1000L, "measurement.upload.max_events_per_bundle", 70).get()).longValue());
            case 4:
                List list4 = zzfy.zzbk;
                zzaif.zza.get();
                return (Boolean) zzaih.zza.zza("measurement.rb.attribution.enable_trigger_redaction", 7, true).get();
            case 5:
                List list5 = zzfy.zzbk;
                return Boolean.valueOf(zzail.zza());
            default:
                return new Boolean(zzahz.zza());
        }
    }

    public /* synthetic */ zzb(int i) {
        this.$r8$classId = i;
    }
}
