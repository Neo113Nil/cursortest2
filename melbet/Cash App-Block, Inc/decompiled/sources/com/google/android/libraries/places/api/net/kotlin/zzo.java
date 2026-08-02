package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzo extends ContinuationImpl {
    public /* synthetic */ Object zza;
    public int zzb;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= PKIFailureInfo.systemUnavail;
        return PlacesClientKt.awaitIsOpen((PlacesClient) null, (Place) null, (Long) null, this);
    }
}
