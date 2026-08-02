package com.squareup.cash.clientrouting.routers.blockers;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ClientScenarioRouter$route$3 extends ContinuationImpl {
    public ClientRoute.PreauthedCompleteScenario L$0;
    public RoutingParams L$1;
    public Screen L$2;
    public ClientScenario L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ClientScenarioRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientScenarioRouter$route$3(ClientScenarioRouter clientScenarioRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = clientScenarioRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route((ClientRoute.PreauthedCompleteScenario) null, (RoutingParams) null, this);
    }
}
