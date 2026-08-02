package com.google.mlkit.common.internal;

import com.fillr.browsersdk.Fillr;
import com.google.android.gms.internal.measurement.zzahk;
import com.google.android.gms.internal.measurement.zzaht;
import com.google.android.gms.internal.measurement.zzahw;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaih;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.play.integrity.internal.aw;
import com.google.android.play.integrity.internal.s;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.firebase.components.ComponentFactory;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer$KeyProvider;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zzi;
import com.squareup.cash.cdf.NameProvider;
import com.squareup.cash.common.cashsearch.DatabaseFactoryKt;
import com.squareup.cash.common.cashsearch.EntityType;
import java.lang.ref.ReferenceQueue;
import java.security.Provider;
import java.security.Signature;
import java.util.List;
import java.util.Set;
import javax.crypto.KeyAgreement;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class zze implements zzbo, aw, EngineWrapper, MapBackedMetadataContainer$KeyProvider, ComponentFactory, NameProvider {
    public static final /* synthetic */ zze zza = new zze(1);
    public static final /* synthetic */ zze zza$1 = new zze(2);
    public static final /* synthetic */ zze zza$2 = new zze(3);
    public static final /* synthetic */ zze zza$3 = new zze(4);
    public static final /* synthetic */ zze zza$4 = new zze(5);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zze(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.play.integrity.internal.az
    public /* synthetic */ Object a() {
        return new s("IntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        switch (this.$r8$classId) {
            case 0:
                Cleaner cleaner = new Cleaner();
                Fillr.AnonymousClass3 anonymousClass3 = new Fillr.AnonymousClass3(5);
                ReferenceQueue referenceQueue = cleaner.zza;
                Set set = cleaner.zzb;
                set.add(new com.google.mlkit.common.sdkinternal.zzd(cleaner, referenceQueue, set, anonymousClass3));
                Thread thread = new Thread(new com.google.mlkit.common.sdkinternal.zzb(referenceQueue, set, false, 0 == true ? 1 : 0), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return cleaner;
            default:
                return new zzi((MlKitContext) zzljVar.get(MlKitContext.class));
        }
    }

    public Object encode(Object obj) {
        EntityType entityType = (EntityType) obj;
        entityType.getClass();
        return (Long) MapsKt__MapsKt.getValue(DatabaseFactoryKt.entityIndexed, entityType);
    }

    @Override // com.google.crypto.tink.subtle.EngineWrapper
    public Object getInstance(String str, Provider provider) {
        switch (this.$r8$classId) {
            case 8:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer$KeyProvider
    public Object getKeyOf(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        return Integer.valueOf(phonemetadata$PhoneMetadata.countryCode_);
    }

    @Override // com.squareup.cash.cdf.NameProvider
    public String getName() {
        switch (this.$r8$classId) {
            case 14:
                return "Alias Verify ReceiveError";
            case 15:
                return "Asset Send DismissSheet";
            case 16:
                return "BlockerFlow Interact CancelFlow";
            case 17:
                return "BlockerFlow Interact ViewBlocker";
            case 18:
                return "Cash Deposit Start";
            case 19:
                return "Cash Withdraw EnterAmount";
            case 20:
                return "Crypto Trade Close";
            case 21:
                return "Identity Open View";
            case 22:
                return "LocalClient CheckoutFlow OrderFailed";
            case 23:
                return "MintPdp Page Viewed";
            case 24:
                return "MintTag Unlock Failed";
            case 25:
                return "Moneybot Error ChatError";
            case 26:
                return "NearbyPayment GetPaid PaymentReceivedPageLand";
            case 27:
                return "PaperMoney Deposit ViewHelp";
            default:
                return "Stock Trade SubmitAmount";
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 1:
                List list = zzfy.zzbk;
                return Boolean.valueOf(zzahw.zza());
            case 2:
                List list2 = zzfy.zzbk;
                return Boolean.valueOf(zzahk.zzc());
            case 3:
                List list3 = zzfy.zzbk;
                zzaif.zza.get();
                return (Boolean) zzaih.zza.zza("measurement.rb.attribution.client2", 1, true).get();
            case 4:
                List list4 = zzfy.zzbk;
                zzaif.zza.get();
                return (Boolean) zzaih.zza.zza("measurement.rb.attribution.service.trigger_uris_high_priority", 2, true).get();
            default:
                return new Boolean(zzaht.zza());
        }
    }
}
