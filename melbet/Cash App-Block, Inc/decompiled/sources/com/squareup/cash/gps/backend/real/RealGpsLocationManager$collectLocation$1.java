package com.squareup.cash.gps.backend.real;

import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealGpsLocationManager$collectLocation$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public String L$0;
    public String L$1;
    public RealGpsLocationManager L$2;
    public GpsConsentStatus L$3;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGpsLocationManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGpsLocationManager$collectLocation$1(RealGpsLocationManager realGpsLocationManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realGpsLocationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collectLocation$real(null, null, false, false, this);
    }
}
