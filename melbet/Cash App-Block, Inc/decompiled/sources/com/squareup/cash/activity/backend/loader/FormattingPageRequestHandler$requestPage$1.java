package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class FormattingPageRequestHandler$requestPage$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public GrpcMethod L$0;
    public Collection L$12;
    public ActivitiesManager.ActivityPage L$3;
    public ArrayList L$5;
    public Collection L$7;
    public Iterator L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GrpcMethod this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormattingPageRequestHandler$requestPage$1(GrpcMethod grpcMethod, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = grpcMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return GrpcMethod.requestPage$suspendImpl(this.this$0, null, null, this);
    }
}
