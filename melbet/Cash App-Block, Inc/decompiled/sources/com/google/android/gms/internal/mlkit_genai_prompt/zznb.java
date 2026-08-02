package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zznb extends ContinuationImpl {
    public Collection zza;
    public Iterator zzb;
    public Collection zzc;
    public int zzd;
    public /* synthetic */ Object zze;
    public final /* synthetic */ zzlq zzf;
    public int zzg;
    public zzlq zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznb(zzlq zzlqVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.zzf = zzlqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= PKIFailureInfo.systemUnavail;
        return zzlq.zzc(this.zzf, this);
    }
}
