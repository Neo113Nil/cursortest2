package com.squareup.cash.data.contacts;

import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContactModifiablePermissions$shouldShowRequestPermissionRationale$1 extends ContinuationImpl {
    public RealGooglePayer$createWallet$$inlined$filter$1 L$0;
    public RealGooglePayer$createWallet$$inlined$filter$1 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ContactModifiablePermissions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactModifiablePermissions$shouldShowRequestPermissionRationale$1(ContactModifiablePermissions contactModifiablePermissions, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = contactModifiablePermissions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.shouldShowRequestPermissionRationale(this);
    }
}
