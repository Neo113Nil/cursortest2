package com.squareup.cash.clientsync;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.api.ResponseContextProcessor;
import com.squareup.cash.clientsync.network.RealClientSyncResponseContextProcessor;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ResponseContextProcessors implements ResponseContextProcessor {
    public final Set processors;

    public ResponseContextProcessors(RealClientSyncResponseContextProcessor realClientSyncResponseContextProcessor) {
        Set of = SetsKt__SetsJVMKt.setOf(realClientSyncResponseContextProcessor);
        of.getClass();
        this.processors = of;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.api.ResponseContextProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processResponseContext(RequestContext requestContext, ResponseContext responseContext, String str, ContinuationImpl continuationImpl) {
        ResponseContextProcessors$processResponseContext$1 responseContextProcessors$processResponseContext$1;
        int i;
        Iterator it;
        int i2;
        String str2;
        ResponseContext responseContext2;
        RequestContext requestContext2;
        if (continuationImpl instanceof ResponseContextProcessors$processResponseContext$1) {
            responseContextProcessors$processResponseContext$1 = (ResponseContextProcessors$processResponseContext$1) continuationImpl;
            int i3 = responseContextProcessors$processResponseContext$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                responseContextProcessors$processResponseContext$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = responseContextProcessors$processResponseContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = responseContextProcessors$processResponseContext$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    it = this.processors.iterator();
                    i2 = 0;
                    str2 = str;
                    responseContext2 = responseContext;
                    requestContext2 = requestContext;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = responseContextProcessors$processResponseContext$1.I$0;
                    it = responseContextProcessors$processResponseContext$1.L$4;
                    String str3 = responseContextProcessors$processResponseContext$1.L$2;
                    responseContext2 = responseContextProcessors$processResponseContext$1.L$1;
                    RequestContext requestContext3 = responseContextProcessors$processResponseContext$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str2 = str3;
                    requestContext2 = requestContext3;
                }
                while (it.hasNext()) {
                    ResponseContextProcessor responseContextProcessor = (ResponseContextProcessor) it.next();
                    responseContextProcessors$processResponseContext$1.L$0 = requestContext2;
                    responseContextProcessors$processResponseContext$1.L$1 = responseContext2;
                    responseContextProcessors$processResponseContext$1.L$2 = str2;
                    responseContextProcessors$processResponseContext$1.L$4 = it;
                    responseContextProcessors$processResponseContext$1.I$0 = i2;
                    responseContextProcessors$processResponseContext$1.label = 1;
                    if (responseContextProcessor.processResponseContext(requestContext2, responseContext2, str2, responseContextProcessors$processResponseContext$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        responseContextProcessors$processResponseContext$1 = new ResponseContextProcessors$processResponseContext$1(this, continuationImpl);
        Object obj2 = responseContextProcessors$processResponseContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = responseContextProcessors$processResponseContext$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
