package com.google.mlkit.common.internal;

import coil3.memory.MemoryCacheService;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzagu;
import com.google.android.gms.internal.measurement.zzagv;
import com.google.android.gms.internal.measurement.zzahp;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzaih;
import com.google.android.gms.internal.measurement.zzaiq;
import com.google.android.gms.internal.measurement.zzaiz;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.measurement.internal.zzbo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.play.integrity.internal.aw;
import com.google.android.play.integrity.internal.s;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.components.Qualified;
import com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.text.internal.zzo;
import com.google.mlkit.vision.text.internal.zzp;
import com.squareup.cash.cdf.NameProvider;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final /* synthetic */ class zzc implements zzbo, aw, EngineWrapper, ComponentRegistrarProcessor, ComponentFactory, NameProvider {
    public static final /* synthetic */ zzc zza = new zzc(1);
    public static final /* synthetic */ zzc zza$1 = new zzc(2);
    public static final /* synthetic */ zzc zza$2 = new zzc(3);
    public static final /* synthetic */ zzc zza$3 = new zzc(4);
    public static final /* synthetic */ zzc zza$4 = new zzc(5);
    public static final /* synthetic */ zzc zza$5 = new zzc(6);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzc(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.play.integrity.internal.az
    public Object a() {
        switch (this.$r8$classId) {
            case 7:
                return new s("StandardIntegrity");
            default:
                return new zza(8);
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        switch (this.$r8$classId) {
            case 0:
                return new MemoryCacheService(zzljVar.setOf(Qualified.unqualified(RemoteModelManager$RemoteModelManagerRegistration.class)));
            case 11:
                return new RemoteModelManager$RemoteModelManagerRegistration(zzljVar.getProvider(zzf.class));
            default:
                return new zzo((zzp) zzljVar.get(zzp.class), (ExecutorSelector) zzljVar.get(ExecutorSelector.class));
        }
    }

    @Override // com.google.crypto.tink.subtle.EngineWrapper
    public Object getInstance(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // com.squareup.cash.cdf.NameProvider
    public String getName() {
        switch (this.$r8$classId) {
            case 14:
                return "Account Recovery Start";
            case 15:
                return "Asset Request NavigateBack";
            case 16:
                return "Asset Send ViewLoadingScreen";
            case 17:
                return "BlockerFlow Interact StartFlow";
            case 18:
                return "Cash Deposit DismissPendingConfirmation";
            case 19:
                return "Cash Withdraw Cancel";
            case 20:
                return "CashCard Manage Enable";
            case 21:
                return "CustomerSupport Access Start";
            case 22:
                return "Instrument Link Replace";
            case 23:
                return "MintPdp Page CtaTapped";
            case 24:
                return "MintTag Lock Requested";
            case 25:
                return "Moneybot Chat Close";
            case 26:
                return "NearbyPayment Discover SelectDirection";
            case 27:
                return "NearbyPayment StillLooking PageLand";
            default:
                return "Stock Trade Exit";
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component component : componentRegistrar.getComponents()) {
            String str = component.name;
            if (str != null) {
                component = new Component(str, component.providedInterfaces, component.dependencies, component.instantiation, component.f1003type, new PrimitiveRegistry$$ExternalSyntheticLambda0(2, str, component), component.publishedEvents);
            }
            arrayList.add(component);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzbo
    /* renamed from: zza */
    public Object mo1425zza() {
        switch (this.$r8$classId) {
            case 1:
                List list = zzfy.zzbk;
                return (Boolean) zzahp.zza.get();
            case 2:
                List list2 = zzfy.zzbk;
                return Integer.valueOf((int) zzagv.zza());
            case 3:
                List list3 = zzfy.zzbk;
                return (Boolean) zzaiz.zza.get();
            case 4:
                List list4 = zzfy.zzbk;
                zzaif.zza.get();
                return (Boolean) zzaih.zza.zza("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", 4, true).get();
            case 5:
                List list5 = zzfy.zzbk;
                zzags.zza.get();
                return Integer.valueOf((int) ((Long) zzagu.zza.zzb(100000L, "measurement.upload.max_events_per_day", 71).get()).longValue());
            default:
                return new Boolean(((Boolean) zzaiq.zza.get()).booleanValue());
        }
    }
}
