package com.google.android.gms.internal.mlkit_genai_prompt;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzoz extends ContinuationImpl {
    public Object zza;
    public Object zzb;
    public /* synthetic */ Object zzc;
    public final /* synthetic */ zzpa zzd;
    public int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoz(zzpa zzpaVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzd = zzpaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= PKIFailureInfo.systemUnavail;
        return zzpa.zzh(this.zzd, null, null, this);
    }
}
