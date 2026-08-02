package com.google.android.gms.internal.mlkit_genai_prompt;

import coil3.memory.RealStrongMemoryCache;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzon extends ContinuationImpl {
    public RealStrongMemoryCache zza;
    public boolean zzb;
    public /* synthetic */ Object zzc;
    public final /* synthetic */ zzot zzd;
    public int zze;
    public GenerateContentRequest zzf;
    public String zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzon(zzot zzotVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzd = zzotVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= PKIFailureInfo.systemUnavail;
        return this.zzd.zzq(null, this);
    }
}
