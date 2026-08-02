package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzmj extends ContinuationImpl {
    public Context zza;
    public MutexImpl zzb;
    public /* synthetic */ Object zzc;
    public final /* synthetic */ zzmz zzd;
    public int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmj(zzmz zzmzVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzd = zzmzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= PKIFailureInfo.systemUnavail;
        return this.zzd.zzv(null, this);
    }
}
