package com.google.android.gms.internal.mlkit_genai_prompt;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzml extends ContinuationImpl {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzmz zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzml(zzmz zzmzVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzb = zzmzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= PKIFailureInfo.systemUnavail;
        return zzmz.zzg(this.zzb, null, this);
    }
}
