package com.squareup.cash.aiedge;

import com.google.zxing.BinaryBitmap;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class MLKitTitleGenerator$generateTitle$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BinaryBitmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLKitTitleGenerator$generateTitle$1(BinaryBitmap binaryBitmap, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = binaryBitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Serializable m2100generateTitlegIAlus = this.this$0.m2100generateTitlegIAlus(null, this);
        return m2100generateTitlegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m2100generateTitlegIAlus : new Result(m2100generateTitlegIAlus);
    }
}
