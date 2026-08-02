package com.squareup.address.typeahead.views;

import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AddressTypeaheadState$setSearcher$1 extends ContinuationImpl {
    public PlacesAddressSearcher L$0;
    public AddressTypeaheadState L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddressTypeaheadState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTypeaheadState$setSearcher$1(AddressTypeaheadState addressTypeaheadState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = addressTypeaheadState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setSearcher$views(null, this);
    }
}
