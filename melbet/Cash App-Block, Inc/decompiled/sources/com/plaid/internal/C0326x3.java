package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Timestamp;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.scheduling.UnlimitedIoScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0326x3 {
    public final i8 a;
    public final A3 b;
    public final CoroutineDispatcher c;
    public Long d;

    public C0326x3(i8 i8Var, A3 a3) {
        i8Var.getClass();
        a3.getClass();
        this.a = i8Var;
        this.b = a3;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler.INSTANCE.getClass();
        this.c = UnlimitedIoScheduler.INSTANCE.limitedParallelism(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        r11 = r0;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac A[LOOP:1: B:42:0x00a6->B:44:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0326x3 c0326x3, ContinuationImpl continuationImpl) {
        C0299u3 c0299u3;
        int i;
        Iterator it;
        C0299u3 c0299u32;
        Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
        Iterator it2;
        c0326x3.getClass();
        if (continuationImpl instanceof C0299u3) {
            c0299u3 = (C0299u3) continuationImpl;
            int i2 = c0299u3.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0299u3.f = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0299u3.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0299u3.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    A3 a3 = c0326x3.b;
                    c0299u3.a = c0326x3;
                    c0299u3.f = 1;
                    obj = a3.a(c0299u3);
                } else if (i == 1) {
                    c0326x3 = c0299u3.a;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest2 = c0299u3.c;
                    Iterator it3 = c0299u3.b;
                    C0326x3 c0326x32 = c0299u3.a;
                    SafeTrace.throwOnFailure(obj);
                    workflow$LinkWorkflowEventRequest = workflow$LinkWorkflowEventRequest2;
                    c0326x3 = c0326x32;
                    c0299u32 = c0299u3;
                    it2 = it3;
                    if (((AbstractC0193i4) obj) instanceof AbstractC0193i4.c) {
                    }
                    it = it2;
                    c0299u3 = c0299u32;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it4 = c0299u3.b;
                    C0326x3 c0326x33 = c0299u3.a;
                    SafeTrace.throwOnFailure(obj);
                    it = it4;
                    c0326x3 = c0326x33;
                    if (it.hasNext()) {
                        workflow$LinkWorkflowEventRequest = (Workflow$LinkWorkflowEventRequest) it.next();
                        i8 i8Var = c0326x3.a;
                        workflow$LinkWorkflowEventRequest.getClass();
                        c0299u3.a = c0326x3;
                        c0299u3.b = it;
                        c0299u3.c = workflow$LinkWorkflowEventRequest;
                        c0299u3.f = 2;
                        Object a = i8Var.a(workflow$LinkWorkflowEventRequest, c0299u3);
                        if (a != coroutineSingletons) {
                            C0299u3 c0299u33 = c0299u3;
                            it2 = it;
                            obj = a;
                            c0299u32 = c0299u33;
                            if (((AbstractC0193i4) obj) instanceof AbstractC0193i4.c) {
                                A3 a32 = c0326x3.b;
                                List<ClientEventOuterClass$ClientEvent> eventsList = workflow$LinkWorkflowEventRequest.getEventsList();
                                eventsList.getClass();
                                c0299u32.a = c0326x3;
                                c0299u32.b = it2;
                                c0299u32.c = null;
                                c0299u32.f = 3;
                                if (a32.a(eventsList, c0299u32) != coroutineSingletons) {
                                }
                            }
                            it = it2;
                            c0299u3 = c0299u32;
                            if (it.hasNext()) {
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    String workflowSessionId = ((ClientEventOuterClass$ClientEvent) obj2).getWorkflowSessionId();
                    Object obj3 = linkedHashMap.get(workflowSessionId);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(workflowSessionId, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Workflow$LinkWorkflowEventRequest.a newBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
                    newBuilder.b((String) entry.getKey());
                    newBuilder.a((Iterable<? extends ClientEventOuterClass$ClientEvent>) entry.getValue());
                    arrayList.add(newBuilder.build());
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                }
            }
        }
        c0299u3 = new C0299u3(c0326x3, continuationImpl);
        Object obj4 = c0299u3.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0299u3.f;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r11.hasNext()) {
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        while (r2.hasNext()) {
        }
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
    }

    public final void b(r8 r8Var) {
        r8Var.getClass();
        String str = r8Var.a;
        ClientEventOuterClass$ClientEvent.a a = a().a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingStarted.getDefaultInstance()));
        a.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0317w3(this, a, str, null), 3);
    }

    public final void c(String str) {
        str.getClass();
        ClientEventOuterClass$ClientEvent build = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackOpen.getDefaultInstance()).build();
        build.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0308v3(this, str, build, null), 3);
    }

    public final void b() {
        this.d = Long.valueOf(System.currentTimeMillis());
    }

    public final void b(String str) {
        str.getClass();
        ClientEventOuterClass$ClientEvent build = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackEmitPreCompletionResult.getDefaultInstance()).build();
        build.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0308v3(this, str, build, null), 3);
    }

    public final void a(r8 r8Var) {
        r8Var.getClass();
        String str = r8Var.a;
        ClientEventOuterClass$ClientEvent.a a = a().a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingComplete.getDefaultInstance()));
        a.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0317w3(this, a, str, null), 3);
    }

    public final void a(r8 r8Var, r8 r8Var2) {
        String str;
        r8Var.getClass();
        String str2 = r8Var.a;
        ClientEventOuterClass$ClientEvent.a a = a();
        ClientEventOuterClass$ClientEvent.Back.a newBuilder = ClientEventOuterClass$ClientEvent.Back.newBuilder();
        newBuilder.a(r8Var.c);
        if (r8Var2 == null || (str = r8Var2.c) == null) {
            str = "";
        }
        newBuilder.b(str);
        ClientEventOuterClass$ClientEvent.a a2 = a.a(newBuilder);
        a2.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0317w3(this, a2, str2, null), 3);
    }

    public static ClientEventOuterClass$ClientEvent.a a() {
        return ClientEventOuterClass$ClientEvent.newBuilder().a(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000));
    }

    public final void a(String str) {
        str.getClass();
        ClientEventOuterClass$ClientEvent build = a().a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.newBuilder().a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.b.LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN).build()).build();
        build.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0308v3(this, str, build, null), 3);
    }
}
