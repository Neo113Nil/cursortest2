package com.google.android.libraries.places.api.net.kotlin;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzm extends ContinuationImpl {
    public /* synthetic */ Object zza;
    public int zzb;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitFindCurrentPlace(null, null, this);
    }
}
