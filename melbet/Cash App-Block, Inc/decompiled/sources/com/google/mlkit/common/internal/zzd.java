package com.google.mlkit.common.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzahp;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaih;
import com.google.android.gms.internal.measurement.zzaii;
import com.google.android.gms.internal.measurement.zzaiw;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.play.integrity.internal.h;
import com.google.android.play.integrity.internal.z;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.firebase.components.ComponentFactory;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer$KeyProvider;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.NameProvider;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.List;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final /* synthetic */ class zzd implements zzbo, z, EngineWrapper, MapBackedMetadataContainer$KeyProvider, ComponentFactory, NameProvider {
    public static final /* synthetic */ zzd zza = new zzd(1);
    public static final /* synthetic */ zzd zza$1 = new zzd(2);
    public static final /* synthetic */ zzd zza$2 = new zzd(3);
    public static final /* synthetic */ zzd zza$3 = new zzd(4);
    public static final /* synthetic */ zzd zza$4 = new zzd(5);
    public static final /* synthetic */ zzd zza$5 = new zzd(6);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzd(int i) {
        this.$r8$classId = i;
    }

    public static Icons get(String str) {
        str.getClass();
        return (Icons) Icons.iconMap.get(str);
    }

    @Override // com.google.android.play.integrity.internal.z
    public Object a(IBinder iBinder) {
        return h.b(iBinder);
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        switch (this.$r8$classId) {
            case 0:
                return new ExecutorSelector(zzljVar.getProvider(MlKitThreadPool.class));
            default:
                return new SharedPrefManager((Context) zzljVar.get(Context.class));
        }
    }

    @Override // com.google.crypto.tink.subtle.EngineWrapper
    public Object getInstance(String str, Provider provider) {
        switch (this.$r8$classId) {
            case 8:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer$KeyProvider
    public Object getKeyOf(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        return phonemetadata$PhoneMetadata.id_;
    }

    @Override // com.squareup.cash.cdf.NameProvider
    public String getName() {
        switch (this.$r8$classId) {
            case 14:
                return "Account SignIn RequireHelp";
            case 15:
                return "Asset Request Start";
            case 16:
                return "BankingOption Browse TapItem";
            case 17:
                return "BlockerFlow Interact TapBlockerAction";
            case 18:
                return "Cash Deposit EnterAmount";
            case 19:
                return "Cash Withdraw DismissPendingConfirmation";
            case 20:
                return "ClientRoute Interact Route";
            case 21:
                return "FormBlocker Launch Show";
            case 22:
                return "Instrument Link Start";
            case 23:
                return "MintPdp Page Dismissed";
            case 24:
                return "MintTag Unlock Completed";
            case 25:
                return "Moneybot Chat Open";
            case 26:
                return "NearbyPayment Dismiss ScreenDismiss";
            case 27:
                return "PaperMoney Deposit ViewBarcode";
            default:
                return "Stock Trade Start";
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 1:
                List list = zzfy.zzbk;
                return (Boolean) zzahp.zzc.get();
            case 2:
                List list2 = zzfy.zzbk;
                return Boolean.valueOf(zzahk.zzb());
            case 3:
                List list3 = zzfy.zzbk;
                zzaif.zza.get();
                return (Boolean) zzaih.zza.zza("measurement.rb.attribution.service", 6, true).get();
            case 4:
                List list4 = zzfy.zzbk;
                return Boolean.valueOf(zzaii.zza());
            case 5:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return (Long) zzagu.zza.zzb(10000L, "measurement.ad_id_cache_time", 0).get();
            default:
                return new Boolean(((Boolean) zzaiw.zza.get()).booleanValue());
        }
    }
}
