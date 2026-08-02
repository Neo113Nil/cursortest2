package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import coil3.memory.RealStrongMemoryCache;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes4.dex */
public final class zzgq extends zzb implements zzbd {
    public final /* synthetic */ zzeo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgq(zzgg zzggVar, zzeo zzeoVar) {
        super("com.google.android.apps.aicore.aidl.ILLMStreamingCallback", 4);
        this.zza = zzeoVar;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        if (i != 2) {
            return false;
        }
        parcel.readInt();
        parcel.readString();
        zzl.zzb(parcel);
        ((RealStrongMemoryCache) this.zza.f67zza).onNewText();
        return true;
    }
}
