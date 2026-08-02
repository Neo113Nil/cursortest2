package com.google.android.gms.internal.mlkit_genai_prompt;

import coil3.memory.RealStrongMemoryCache;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;

/* loaded from: classes4.dex */
public final class zzou extends zzajh {
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final zzer zzb(zzfn zzfnVar, zzct zzctVar) {
        zzfnVar.getClass();
        zzctVar.getClass();
        zzgk zzgkVar = new zzgk(zzctVar, zzfnVar, new zzzx(15));
        return new zzgw(zzgkVar.zzc, zzgkVar.zza, zzgkVar.zzb);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ Object zzi(Object obj, RealStrongMemoryCache realStrongMemoryCache) {
        GenerateContentRequest generateContentRequest = (GenerateContentRequest) obj;
        generateContentRequest.getClass();
        return zznv.zza(generateContentRequest, realStrongMemoryCache, null);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajh
    public final /* bridge */ /* synthetic */ GenerateContentResponse zzk(Object obj) {
        zzgh zzghVar = (zzgh) obj;
        zzghVar.getClass();
        return zznv.zzb(zzghVar);
    }
}
