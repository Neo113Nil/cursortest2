package com.squareup.cash.data.blockers;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$delay$1 extends ContinuationImpl {
    public int I$0;
    public BlockersScreens L$1;
    public SubmitFormRequest L$2;
    public Screen L$3;
    public BlockerAction L$4;
    public Function2 L$5;
    public BlockerAction L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$delay$1(RealBlockersHelper realBlockersHelper, Continuation continuation) {
        super(continuation);
        this.this$0 = realBlockersHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.delay(null, null, null, null, false, null, null, this);
    }
}
