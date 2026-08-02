package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.fillr.e;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.mlkit_genai_prompt.zzajk;
import com.google.android.gms.internal.mlkit_genai_prompt.zzajp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzajt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_common.zzma;
import com.google.android.gms.internal.mlkit_vision_common.zzmf;
import com.google.android.gms.internal.mlkit_vision_common.zzmj;
import com.google.android.gms.internal.mlkit_vision_face.zznq;
import com.google.android.gms.internal.mlkit_vision_face.zznu;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_text_common.zztq;
import com.google.android.gms.internal.mlkit_vision_text_common.zztv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.ArrayList;
import papa.InteractionResult;

/* loaded from: classes4.dex */
public final class zzsr extends InteractionResult {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzsr(int i) {
        super((byte) 0, 4);
        this.$r8$classId = i;
    }

    @Override // papa.InteractionResult
    public final Object create(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                MlKitContext mlKitContext = MlKitContext.getInstance();
                Context applicationContext = MlKitContext.getInstance().getApplicationContext();
                ArrayList arrayList = new ArrayList();
                ((zzru) obj).getClass();
                e eVar = new e();
                CCTDestination cCTDestination = CCTDestination.INSTANCE;
                TransportRuntime.initialize(applicationContext);
                TransportRuntime.getInstance().newFactory(cCTDestination);
                CCTDestination.SUPPORTED_ENCODINGS.contains(new Encoding("json"));
                arrayList.add(eVar);
                return new zzsh(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class));
            case 1:
                MlKitContext mlKitContext2 = MlKitContext.getInstance();
                return new zzajt(mlKitContext2.getApplicationContext(), (SharedPrefManager) mlKitContext2.get(SharedPrefManager.class), new zzajp(MlKitContext.getInstance().getApplicationContext(), (zzajk) obj));
            case 2:
                zzwd zzwdVar = (zzwd) obj;
                MlKitContext mlKitContext3 = MlKitContext.getInstance();
                return new zzwp(mlKitContext3.getApplicationContext(), (SharedPrefManager) mlKitContext3.get(SharedPrefManager.class), new zzwi(MlKitContext.getInstance().getApplicationContext(), zzwdVar), zzwdVar.zza);
            case 3:
                MlKitContext mlKitContext4 = MlKitContext.getInstance();
                return new zzmj(mlKitContext4.getApplicationContext(), (SharedPrefManager) mlKitContext4.get(SharedPrefManager.class), new zzmf(MlKitContext.getInstance().getApplicationContext(), (zzma) obj));
            case 4:
                zznq zznqVar = (zznq) obj;
                MlKitContext mlKitContext5 = MlKitContext.getInstance();
                return new zzoc(mlKitContext5.getApplicationContext(), (SharedPrefManager) mlKitContext5.get(SharedPrefManager.class), new zznu(MlKitContext.getInstance().getApplicationContext(), zznqVar), zznqVar.zza);
            default:
                zztq zztqVar = (zztq) obj;
                MlKitContext mlKitContext6 = MlKitContext.getInstance();
                return new zzuc(mlKitContext6.getApplicationContext(), (SharedPrefManager) mlKitContext6.get(SharedPrefManager.class), new zztv(MlKitContext.getInstance().getApplicationContext(), zztqVar), zztqVar.zza);
        }
    }
}
