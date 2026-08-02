package com.google.mlkit.vision.text;

import android.os.Parcel;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.trace.api.trace.DatadogTraceId;
import com.datadog.trace.common.sampling.Sampler;
import com.datadog.trace.core.DDSpan;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.google.android.gms.internal.tapandpay.zzaj;
import com.google.android.gms.internal.tapandpay.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.hybrid.internal.X25519;
import com.google.mlkit.vision.text.Text;
import com.google.zxing.BinaryBitmap;
import com.miteksystems.misnap.controller.a.z;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.graphics.BumpNoisePBRMaterial;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.HeartScene$Companion$HeartMaterialSpec;
import com.squareup.cash.card.onboarding.graphics.SolidColorPBRMaterial;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.atm.AtmWithdrawalSearchAddress;
import com.squareup.cash.cdf.atm.AtmWithdrawalSelectAddress;
import com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.lynx.api.v1_0.model.CvcResultCode;
import com.squareup.cash.lynx.api.v1_0.model.link.LinkedReason;
import java.util.Objects;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzb implements DatadogTraceId, Sampler, Clock, RemoteCall, X25519, zzu, z, AddressAnalyticsFactory {
    public final /* synthetic */ int $r8$classId;

    /* renamed from: fromValue, reason: collision with other method in class */
    public static LinkedReason m2066fromValue(int i) {
        if (i == 0) {
            return LinkedReason.UNKNOWN_REASON;
        }
        if (i == 1) {
            return LinkedReason.LINK;
        }
        if (i == 2) {
            return LinkedReason.REPLACE;
        }
        if (i == 3) {
            return LinkedReason.RTAU;
        }
        if (i == 4) {
            return LinkedReason.NETWORK_TOKEN_UPDATE;
        }
        if (i != 5) {
            return null;
        }
        return LinkedReason.ASYNC_ACCOUNT_UPDATE;
    }

    public static VoiceProcessorFragment.WorkflowSettings getDefaultWorkflowSettings() {
        return new VoiceProcessorFragment.WorkflowSettings(Integer.valueOf(R.drawable.misnap_progress_tracker_processed_icon), Integer.valueOf(R.drawable.misnap_progress_tracker_failed_icon), Integer.valueOf(R.drawable.misnap_progress_tracker_unprocessed_icon), Integer.valueOf(R.drawable.misnap_button_help_icon));
    }

    public static SolidColorPBRMaterial materialFor(Engine engine, String str, boolean z) {
        engine.getClass();
        str.getClass();
        HeartScene$Companion$HeartMaterialSpec heartScene$Companion$HeartMaterialSpec = (HeartScene$Companion$HeartMaterialSpec) HeartScene.SUBMESH_MATERIALS.get(str);
        if (heartScene$Companion$HeartMaterialSpec == null) {
            heartScene$Companion$HeartMaterialSpec = HeartScene.DEFAULT_MATERIAL_SPEC;
        }
        SolidColorPBRMaterial bumpNoisePBRMaterial = str.equals("Heart_Body_Mat") ? new BumpNoisePBRMaterial(engine, heartScene$Companion$HeartMaterialSpec.baseColor, heartScene$Companion$HeartMaterialSpec.roughness, heartScene$Companion$HeartMaterialSpec.metallic, z, 16) : new SolidColorPBRMaterial(engine, heartScene$Companion$HeartMaterialSpec.baseColor, heartScene$Companion$HeartMaterialSpec.roughness, heartScene$Companion$HeartMaterialSpec.metallic, z, 16);
        bumpNoisePBRMaterial.keyLightIntensity = 5.018f;
        bumpNoisePBRMaterial.markDirty$1();
        bumpNoisePBRMaterial.fillLightIntensity = 0.962f;
        bumpNoisePBRMaterial.markDirty$1();
        bumpNoisePBRMaterial.rimLightIntensity = 1.215f;
        bumpNoisePBRMaterial.markDirty$1();
        bumpNoisePBRMaterial.accentLightIntensity = 0.851f;
        bumpNoisePBRMaterial.markDirty$1();
        bumpNoisePBRMaterial.ambientLightIntensity = RecyclerView.DECELERATION_RATE;
        bumpNoisePBRMaterial.markDirty$1();
        return bumpNoisePBRMaterial;
    }

    public static final CharSequence zzd(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public /* synthetic */ UserAction a(Frame frame, MiSnapFaceAnalyzer.Result.Processed processed) {
        frame.getClass();
        return UserAction.NONE.INSTANCE;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.internal.tapandpay.zzd zzdVar = (com.google.android.gms.internal.tapandpay.zzd) ((zzaj) obj).getService();
        zzy zzyVar = new zzy(0, (TaskCompletionSource) obj2);
        Parcel zza = zzdVar.zza();
        int i = com.google.android.gms.internal.tapandpay.zzc.$r8$clinit;
        zza.writeStrongBinder(zzyVar);
        zzdVar.zzb(zza, 21);
    }

    @Override // com.google.crypto.tink.hybrid.internal.X25519
    public byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) {
        return com.google.crypto.tink.subtle.X25519.computeSharedSecret(bArr, bArr2);
    }

    @Override // com.google.crypto.tink.hybrid.internal.X25519
    public BinaryBitmap generateKeyPair() {
        byte[] generatePrivateKey = com.google.crypto.tink.subtle.X25519.generatePrivateKey();
        return new BinaryBitmap(6, generatePrivateKey, com.google.crypto.tink.subtle.X25519.publicFromPrivate(generatePrivateKey));
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.datadog.trace.common.sampling.Sampler
    public boolean sample(DDSpan dDSpan) {
        return true;
    }

    @Override // com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory
    public Event searchAddressEvent() {
        return new AtmWithdrawalSearchAddress();
    }

    @Override // com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory
    public Event selectAddressEvent(boolean z) {
        return new AtmWithdrawalSelectAddress(Boolean.valueOf(z));
    }

    @Override // com.datadog.android.trace.api.trace.DatadogTraceId
    public String toHexString() {
        return "";
    }

    @Override // com.datadog.android.trace.api.trace.DatadogTraceId
    public long toLong() {
        return 0L;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 4:
                return "AllSampler { sample=true }";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzvj zzvjVar = (zzvj) obj;
                return new Text.Symbol(zzvjVar.zza, zzvjVar.zzb, zzvjVar.zzc, "");
            default:
                String str = (String) ((Text.TextBase) ((Text.TextBlock) obj)).zza;
                return str == null ? "" : str;
        }
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public /* synthetic */ void a() {
    }

    public /* synthetic */ zzb(int i) {
        this.$r8$classId = i;
    }

    public static CvcResultCode fromValue(int i) {
        if (i == 0) {
            return CvcResultCode.UNKNOWN_CVC_RESULT;
        }
        if (i == 1) {
            return CvcResultCode.CVC_MATCH;
        }
        if (i == 2) {
            return CvcResultCode.CVC_NO_MATCH;
        }
        if (i == 3) {
            return CvcResultCode.CVC_SKIPPED;
        }
        if (i != 4) {
            return null;
        }
        return CvcResultCode.CVC_UNAVAILABLE;
    }
}
