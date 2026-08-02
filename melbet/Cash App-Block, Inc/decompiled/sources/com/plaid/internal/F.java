package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.F6;
import com.plaid.internal.I2;
import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class F {
    public final i8 a;
    public final HashSet<String> b;
    public boolean c;

    public F(i8 i8Var) {
        i8Var.getClass();
        this.a = i8Var;
        this.b = new HashSet<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (r12 != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b7 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(F f, A a, G g, ContinuationImpl continuationImpl) {
        E e;
        int i;
        String str;
        boolean z;
        F f2;
        A a2;
        long j;
        f.getClass();
        if (continuationImpl instanceof E) {
            e = (E) continuationImpl;
            int i2 = e.h;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                e.h = i2 - PKIFailureInfo.systemUnavail;
                Object obj = e.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = e.h;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("channel_id", a.a));
                    mapOf.getClass();
                    F6.a.a("Polling started", mapOf, J6.INFO);
                    boolean z2 = f.c;
                    j = a.c;
                    e.a = f;
                    e.b = a;
                    e.c = g;
                    e.d = str2;
                    e.e = z2;
                    e.h = 1;
                    if (JobKt.delay(j, e) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = e.e;
                    str = e.d;
                    g = e.c;
                    a2 = e.b;
                    f2 = e.a;
                    SafeTrace.throwOnFailure(obj);
                    String str3 = str;
                    boolean z3 = z;
                    f = f2;
                    E e2 = e;
                    Object obj2 = obj;
                    G g2 = g;
                    String str4 = str3;
                    AbstractC0193i4 abstractC0193i4 = (AbstractC0193i4) obj2;
                    if (abstractC0193i4 instanceof AbstractC0193i4.b) {
                        C0095a6.a aVar = C0095a6.a;
                        IOException iOException = ((AbstractC0193i4.b) abstractC0193i4).a;
                        aVar.getClass();
                        C0095a6.b.a(iOException, true);
                    } else if (abstractC0193i4 instanceof AbstractC0193i4.a) {
                        if (C0279s1.a((AbstractC0193i4.a) abstractC0193i4)) {
                            C0095a6.a.e(C0095a6.a, "Closing channel due to invalid channel response.");
                            EmptyMap emptyMap = EmptyMap.INSTANCE;
                            emptyMap.getClass();
                            F6.a.b(emptyMap, "Polling stopped, channel closed.");
                            return Unit.INSTANCE;
                        }
                    } else if (abstractC0193i4 instanceof AbstractC0193i4.d) {
                        C0095a6.a aVar2 = C0095a6.a;
                        Throwable th = ((AbstractC0193i4.d) abstractC0193i4).a;
                        aVar2.getClass();
                        C0095a6.b.a(th, true);
                    } else if (abstractC0193i4 instanceof AbstractC0193i4.c) {
                        AbstractC0193i4.c cVar = (AbstractC0193i4.c) abstractC0193i4;
                        str4 = ((Channel$LinkChannelFetchResponse) cVar.a).getFetchId();
                        LinkResult a3 = f.a((Channel$LinkChannelFetchResponse) cVar.a, g2);
                        if (a3 != null) {
                            g2.a(a3);
                            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                            emptyMap2.getClass();
                            F6.a.b(emptyMap2, "Polling stopped, link result received.");
                            return Unit.INSTANCE;
                        }
                    }
                    if (z3) {
                        g2.a();
                        EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                        emptyMap3.getClass();
                        F6.a.b(emptyMap3, "Polling stopped, no results from channel.");
                        return Unit.INSTANCE;
                    }
                    a = a2;
                    e = e2;
                    str2 = str4;
                    g = g2;
                    boolean z22 = f.c;
                    j = a.c;
                    e.a = f;
                    e.b = a;
                    e.c = g;
                    e.d = str2;
                    e.e = z22;
                    e.h = 1;
                    if (JobKt.delay(j, e) != coroutineSingletons) {
                        a2 = a;
                        str = str2;
                        f2 = f;
                        z = z22;
                        i8 i8Var = f2.a;
                        Channel$LinkChannelFetchRequest.a newBuilder = Channel$LinkChannelFetchRequest.newBuilder();
                        newBuilder.a(a2.a);
                        newBuilder.b(a2.b);
                        if (str != null) {
                            newBuilder.c(str);
                        }
                        Channel$LinkChannelFetchRequest build = newBuilder.build();
                        build.getClass();
                        e.a = f2;
                        e.b = a2;
                        e.c = g;
                        e.d = str;
                        e.e = z;
                        e.h = 2;
                        obj = i8Var.a(build, e);
                    }
                    return coroutineSingletons;
                }
                z = e.e;
                str = e.d;
                g = e.c;
                a2 = e.b;
                f2 = e.a;
                SafeTrace.throwOnFailure(obj);
                i8 i8Var2 = f2.a;
                Channel$LinkChannelFetchRequest.a newBuilder2 = Channel$LinkChannelFetchRequest.newBuilder();
                newBuilder2.a(a2.a);
                newBuilder2.b(a2.b);
                if (str != null) {
                }
                Channel$LinkChannelFetchRequest build2 = newBuilder2.build();
                build2.getClass();
                e.a = f2;
                e.b = a2;
                e.c = g;
                e.d = str;
                e.e = z;
                e.h = 2;
                obj = i8Var2.a(build2, e);
            }
        }
        e = new E(f, continuationImpl);
        Object obj3 = e.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = e.h;
        String str22 = null;
        if (i != 0) {
        }
    }

    public final LinkResult a(Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse, G g) {
        Channel$Message.SDKResult result;
        LinkResult a;
        Unit unit;
        Channel$Message.SDKEvent event;
        LinkResult linkResult = null;
        for (Channel$Message channel$Message : channel$LinkChannelFetchResponse.getMessagesList()) {
            if (!this.b.contains(channel$Message.getMessageId())) {
                this.b.add(channel$Message.getMessageId());
                if (channel$Message.hasEvent() && (event = channel$Message.getEvent()) != null) {
                    LinkEvent a2 = S6.a(event);
                    if (a2.getEventName().toString().length() != 0) {
                        g.a(a2, I2.d.a);
                    }
                }
                if (channel$Message.hasInternalEvent() && channel$Message.getInternalEvent().hasRequestSilentNetworkAuth()) {
                    Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth = channel$Message.getInternalEvent().getRequestSilentNetworkAuth();
                    requestSilentNetworkAuth.getClass();
                    AbstractC0187h7 a3 = Q6.a(requestSilentNetworkAuth);
                    if (a3 != null) {
                        F6.a.a("Polling received SNA request");
                        g.a(a3);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        Y6.a.a("Invalid SNA request: " + requestSilentNetworkAuth);
                    }
                }
                if (channel$Message.hasPreCompletionResult()) {
                    Channel$Message.SDKResult preCompletionResult = channel$Message.getPreCompletionResult();
                    preCompletionResult.getClass();
                    g.a(preCompletionResult);
                }
                if (channel$Message.hasResult() && (result = channel$Message.getResult()) != null && (a = T6.a(result)) != null) {
                    linkResult = a;
                }
            }
        }
        return linkResult;
    }
}
