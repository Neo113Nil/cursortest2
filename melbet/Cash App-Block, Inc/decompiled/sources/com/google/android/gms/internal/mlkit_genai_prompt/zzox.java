package com.google.android.gms.internal.mlkit_genai_prompt;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzox extends ContinuationImpl {
    public zzfz zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzpa zzc;
    public int zzd;
    public String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzox(zzpa zzpaVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzc = zzpaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= PKIFailureInfo.systemUnavail;
        return zzpa.zza(this.zzc, null, this);
    }
}
