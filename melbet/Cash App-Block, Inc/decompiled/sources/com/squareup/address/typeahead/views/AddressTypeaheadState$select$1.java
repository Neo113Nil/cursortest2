package com.squareup.address.typeahead.views;

import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AddressTypeaheadState$select$1 extends ContinuationImpl {
    public AddressSearchResult L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddressTypeaheadState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTypeaheadState$select$1(AddressTypeaheadState addressTypeaheadState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = addressTypeaheadState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.select$views(null, this);
    }
}
