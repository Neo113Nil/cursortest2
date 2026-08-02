package com.squareup.cash.account.settings.backend;

import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocalInstalledStore$showGeoTab$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfilePhotoManager$takePhoto$1$2$invokeSuspend$$inlined$filter$1$2$1(RealLocalInstalledStore$showGeoTab$$inlined$map$1$2 realLocalInstalledStore$showGeoTab$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realLocalInstalledStore$showGeoTab$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
