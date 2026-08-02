package com.squareup.cash.payments.presenters;

import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class UtilsKt$getClipboardRecipient$1 extends ContinuationImpl {
    public String L$0;
    public AndroidStringManager L$3;
    public CryptoPaymentManager.SelectedRecipient L$4;
    public List L$5;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return UtilsKt.getClipboardRecipient(null, null, null, null, null, null, this);
    }
}
