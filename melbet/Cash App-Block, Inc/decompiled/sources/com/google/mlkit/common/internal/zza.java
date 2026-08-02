package com.google.mlkit.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.dynamite.zzh;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzaht;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaih;
import com.google.android.gms.internal.measurement.zzail;
import com.google.android.gms.internal.measurement.zzair;
import com.google.android.gms.internal.measurement.zzaja;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentFactory;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zzi;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.cdf.NameProvider;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class zza implements zzbo, EngineWrapper, ComponentFactory, NameProvider {
    public static final /* synthetic */ zza zza = new zza(1);
    public static final /* synthetic */ zza zza$1 = new zza(2);
    public static final /* synthetic */ zza zza$2 = new zza(3);
    public static final /* synthetic */ zza zza$3 = new zza(4);
    public static final /* synthetic */ zza zza$4 = new zza(5);
    public static final /* synthetic */ zza zza$5 = new zza(6);
    public static final /* synthetic */ zza zza$6 = new zza(10);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zza(int i) {
        this.$r8$classId = i;
    }

    public ApiException a(Bundle bundle) {
        int i = bundle.getInt(BreadcrumbHelper.Category.ERROR);
        if (i == 0) {
            return null;
        }
        bundle.getBoolean("is.error.remediable");
        return new StandardIntegrityException(i, null);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        AnalyticsConnector lambda$getComponents$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                return new zzh(i);
            case 10:
                lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(zzljVar);
                return lambda$getComponents$0;
            case 11:
                return new zzg(i);
            default:
                return new com.google.mlkit.vision.barcode.internal.zzg((zzi) zzljVar.get(zzi.class), (ExecutorSelector) zzljVar.get(ExecutorSelector.class), (MlKitContext) zzljVar.get(MlKitContext.class));
        }
    }

    @Override // com.google.crypto.tink.subtle.EngineWrapper
    public Object getInstance(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // com.squareup.cash.cdf.NameProvider
    public String getName() {
        switch (this.$r8$classId) {
            case 15:
                return "Alias Verify RequireHelp";
            case 16:
                return "Asset Send NavigateBack";
            case 17:
                return "BlockerFlow Interact CompleteFlow";
            case 18:
                return "BlockerFlow Interact ViewBlockerResponse";
            case 19:
                return "Cash Request Cancel";
            case 20:
                return "Cash Withdraw Start";
            case 21:
                return "Crypto Trade Complete";
            case 22:
                return "Instrument Link AuthenticateInstitution";
            case 23:
                return "LocalClient CheckoutFlow PlaceOrder";
            case 24:
                return "MintTag Lock Completed";
            case 25:
                return "MintTag Unlock Requested";
            case 26:
                return "Moneybot Message ClientReceive";
            case 27:
                return "NearbyPayment Nux BluetoothPermissionResult";
            default:
                return "SavingsFolder TransferIn Start";
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 1:
                List list = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(65536L, "measurement.upload.max_bundle_size", 66).get()).longValue());
            case 2:
                List list2 = zzfy.zzbk;
                return Boolean.valueOf(zzaja.zzb());
            case 3:
                List list3 = zzfy.zzbk;
                return Boolean.valueOf(zzair.zzb());
            case 4:
                List list4 = zzfy.zzbk;
                zzaif.zza.get();
                return (Boolean) zzaih.zza.zza("measurement.rb.attribution.uuid_generation", 8, true).get();
            case 5:
                List list5 = zzfy.zzbk;
                return Boolean.valueOf(zzail.zzb());
            default:
                return new Boolean(zzaht.zzb());
        }
    }
}
