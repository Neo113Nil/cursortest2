package com.google.android.gms.internal.mlkit_genai_prompt;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzaje extends ContinuationImpl {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzajh zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaje(zzajh zzajhVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzb = zzajhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        return zzajh.zzG(this.zzb, this);
    }
}
