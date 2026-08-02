package com.squareup.cash.boost.backend;

import androidx.compose.ui.platform.DerivedSize;
import app.cash.api.ApiResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.boost.AppPresentation;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealBoostSelector$selectRewardInternal$1 extends ContinuationImpl {
    public String L$1;
    public Function0 L$11;
    public BlockersData L$13;
    public List L$14;
    public BoostEvent L$16;
    public DerivedSize.Companion L$2;
    public ApiResult L$20;
    public String L$3;
    public String L$5;
    public String L$6;
    public String L$7;
    public AppPresentation L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBoostSelector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBoostSelector$selectRewardInternal$1(RealBoostSelector realBoostSelector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBoostSelector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealBoostSelector.access$selectRewardInternal(this.this$0, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
