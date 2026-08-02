package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.internal.LinkedTreeMap;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.D6;
import com.plaid.internal.I2;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.r8;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class Y2 {
    public final i8 a;
    public final L4 b;
    public final C0326x3 c;
    public final F3 d;
    public final n8 e;
    public final y8 f;
    public final H6 g;

    public Y2(i8 i8Var, L4 l4, C0326x3 c0326x3, F3 f3, n8 n8Var, y8 y8Var, H6 h6) {
        i8Var.getClass();
        l4.getClass();
        c0326x3.getClass();
        f3.getClass();
        n8Var.getClass();
        y8Var.getClass();
        h6.getClass();
        this.a = i8Var;
        this.b = l4;
        this.c = c0326x3;
        this.d = f3;
        this.e = n8Var;
        this.f = y8Var;
        this.g = h6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        P2 p2;
        int i;
        String str4;
        String str5;
        String str6;
        AbstractC0193i4 abstractC0193i4;
        L6 l6;
        List<Common$SDKEvent> onAppearList;
        if (continuationImpl instanceof P2) {
            p2 = (P2) continuationImpl;
            int i2 = p2.g;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                p2.g = i2 - PKIFailureInfo.systemUnavail;
                P2 p22 = p2;
                Object obj = p22.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p22.g;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    Q2 q2 = new Q2(this, workflow$LinkWorkflowStartRequest, null);
                    p22.a = this;
                    p22.b = str;
                    p22.c = str2;
                    str4 = str3;
                    p22.d = str4;
                    p22.g = 1;
                    obj = JobKt.withContext(defaultIoScheduler, q2, p22);
                    if (obj != coroutineSingletons) {
                        str5 = str;
                        str6 = str2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str7 = p22.d;
                String str8 = p22.c;
                String str9 = p22.b;
                Y2 y2 = p22.a;
                SafeTrace.throwOnFailure(obj);
                str4 = str7;
                this = y2;
                str6 = str8;
                str5 = str9;
                abstractC0193i4 = (AbstractC0193i4) obj;
                if (!abstractC0193i4.a()) {
                    return this.a(str5, abstractC0193i4, "", EmptyList.INSTANCE);
                }
                Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC0193i4.c) abstractC0193i4).a;
                H6 h6 = this.g;
                Workflow$LinkWorkflowStartResponse.c mobileSdkLogLevel = workflow$LinkWorkflowStartResponse.getMobileSdkLogLevel();
                mobileSdkLogLevel.getClass();
                int i3 = C0113c4.a[mobileSdkLogLevel.ordinal()];
                if (i3 == 1) {
                    l6 = L6.ALL;
                } else if (i3 == 2) {
                    l6 = L6.ERRORS_ONLY;
                } else if (i3 == 3) {
                    l6 = L6.NONE;
                } else if (i3 == 4) {
                    l6 = L6.NONE;
                } else {
                    if (i3 != 5) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    l6 = L6.NONE;
                }
                h6.a(l6);
                if (workflow$LinkWorkflowStartResponse.hasWebviewFallback()) {
                    String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                    url.getClass();
                    if (url.length() > 0) {
                        String workflowSessionId = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                        workflowSessionId.getClass();
                        String requestId = workflow$LinkWorkflowStartResponse.getRequestId();
                        requestId.getClass();
                        Common$WebviewFallback webviewFallback = workflow$LinkWorkflowStartResponse.getWebviewFallback();
                        webviewFallback.getClass();
                        p22.a = null;
                        p22.b = null;
                        p22.c = null;
                        p22.d = null;
                        p22.g = 2;
                        N2 a = this.a(str6, workflowSessionId, requestId, str4, webviewFallback);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                }
                C0326x3 c0326x3 = this.c;
                c0326x3.getClass();
                str5.getClass();
                Long l = c0326x3.d;
                if (l != null) {
                    ClientEventOuterClass$ClientEvent.a a2 = C0326x3.a().a(ClientEventOuterClass$ClientEvent.ClientOpenDelay.newBuilder().a(String.valueOf(l.longValue())));
                    a2.getClass();
                    JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0317w3(c0326x3, a2, str5, null), 3);
                } else {
                    C0095a6.a.e(C0095a6.a, "markOpenStart was not called before tracking open delay");
                }
                Workflow$LinkWorkflowStartResponse.Events events = workflow$LinkWorkflowStartResponse.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            common$SDKEvent.getClass();
                            linkEventListenerInternal$link_sdk_release.invoke(S6.a(common$SDKEvent), I2.d.a);
                        }
                    }
                }
                String workflowSessionId2 = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                workflowSessionId2.getClass();
                String continuationToken = workflow$LinkWorkflowStartResponse.getContinuationToken();
                continuationToken.getClass();
                String str10 = str6;
                Pane$PaneRendering nextPane = workflow$LinkWorkflowStartResponse.getNextPane();
                String str11 = str4;
                List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowStartResponse.getAdditionalPanesList();
                additionalPanesList.getClass();
                String requestId2 = workflow$LinkWorkflowStartResponse.getRequestId();
                requestId2.getClass();
                p22.a = null;
                p22.b = null;
                p22.c = null;
                p22.d = null;
                p22.g = 3;
                Object a3 = this.a(str10, workflowSessionId2, continuationToken, str11, nextPane, additionalPanesList, EmptyList.INSTANCE, requestId2, p22);
                if (a3 != coroutineSingletons) {
                    return a3;
                }
            }
        }
        p2 = new P2(this, continuationImpl);
        P2 p222 = p2;
        Object obj2 = p222.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p222.g;
        if (i != 0) {
        }
        abstractC0193i4 = (AbstractC0193i4) obj2;
        if (!abstractC0193i4.a()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0124, code lost:
    
        if (r2 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0124 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(N2 n2, ContinuationImpl continuationImpl) {
        V2 v2;
        int i;
        Object obj;
        r8 r8Var;
        N2 n22;
        Pane$PaneRendering pane$PaneRendering;
        Y2 y2;
        N2 n23;
        List mutableList;
        r8 r8Var2;
        Pane$Navigation navigation;
        Y2 y22 = this;
        if (continuationImpl instanceof V2) {
            v2 = (V2) continuationImpl;
            int i2 = v2.h;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                v2.h = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = v2.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = v2.h;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (n2 instanceof N2.i) {
                        return a((N2.i) n2);
                    }
                    if (!(n2 instanceof N2.f)) {
                        String c = n2 instanceof N2.h ? ((N2.h) n2).c() : null;
                        return new N2.e(n2.h(), new LinkExit(null, new LinkExitMetadata(LinkExitMetadataStatus.REQUIRES_CREDENTIALS.INSTANCE, null, n2.g(), c, L2.a(n2.g(), c != null ? c : ""))));
                    }
                    r8 e = ((N2.f) n2).e();
                    L4 l4 = y22.b;
                    v2.a = y22;
                    v2.b = n2;
                    v2.c = e;
                    v2.h = 1;
                    Object a = l4.a(e, v2);
                    if (a != coroutineSingletons) {
                        obj = a;
                        r8Var = e;
                        n22 = n2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj2);
                        return obj2;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj2);
                            return obj2;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r8 r8Var3 = v2.e;
                    mutableList = v2.d;
                    r8Var2 = v2.c;
                    N2 n24 = v2.b;
                    Y2 y23 = v2.a;
                    SafeTrace.throwOnFailure(obj2);
                    N2.h hVar = n24;
                    Y2 y24 = y23;
                    List list = mutableList;
                    Pane$PaneRendering pane$PaneRendering2 = (Pane$PaneRendering) obj2;
                    if (pane$PaneRendering2 != null) {
                        Pane$Navigation navigation2 = pane$PaneRendering2.getNavigation();
                        com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 backStackBehavior = navigation2 != null ? navigation2.getBackStackBehavior() : null;
                        if (backStackBehavior == null) {
                            backStackBehavior = com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.BACK_STACK_BEHAVIOR_UNKNOWN;
                        }
                        if (backStackBehavior == com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.BACK_STACK_BEHAVIOR_PERSISTENT) {
                            y24.c.a(r8Var2, r8Var3);
                            return new N2.l(hVar.g(), hVar.h(), hVar.b(), hVar instanceof N2.g ? ((N2.g) hVar).a() : "", r8Var3, EmptyList.INSTANCE, list, hVar instanceof N2.h ? hVar.c() : "");
                        }
                    } else {
                        C0095a6.a.e(C0095a6.a, "Could not find pane for workflowId: " + r8Var3);
                    }
                    mutableList = list;
                    n23 = hVar;
                    y2 = y24;
                    if (mutableList.isEmpty()) {
                        y2.c.a(r8Var2, (r8) null);
                        v2.a = null;
                        v2.b = null;
                        v2.c = null;
                        v2.d = null;
                        v2.e = null;
                        v2.h = 4;
                        Object a2 = y2.a(n23, v2);
                        if (a2 != coroutineSingletons) {
                            return a2;
                        }
                    } else {
                        r8Var3 = (r8) mutableList.remove(mutableList.size() - 1);
                        L4 l42 = y2.b;
                        v2.a = y2;
                        v2.b = n23;
                        v2.c = r8Var2;
                        v2.d = mutableList;
                        v2.e = r8Var3;
                        v2.h = 3;
                        obj2 = l42.a(r8Var3, v2);
                        hVar = n23;
                        y24 = y2;
                    }
                }
                r8 r8Var4 = v2.c;
                n22 = v2.b;
                Y2 y25 = v2.a;
                SafeTrace.throwOnFailure(obj2);
                r8Var = r8Var4;
                y22 = y25;
                obj = obj2;
                pane$PaneRendering = (Pane$PaneRendering) obj;
                if (pane$PaneRendering != null || (navigation = pane$PaneRendering.getNavigation()) == null || navigation.getBackVisible()) {
                    y2 = y22;
                    n23 = n22;
                    mutableList = CollectionsKt.toMutableList((Collection) ((N2.f) n22).d());
                    r8Var2 = r8Var;
                    if (mutableList.isEmpty()) {
                    }
                }
                y22.c.a(r8Var, (r8) null);
                v2.a = null;
                v2.b = null;
                v2.c = null;
                v2.h = 2;
                Object a3 = y22.a(n22, v2);
                return a3 == coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        v2 = new V2(y22, continuationImpl);
        Object obj22 = v2.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = v2.h;
        if (i != 0) {
        }
        pane$PaneRendering = (Pane$PaneRendering) obj;
        if (pane$PaneRendering != null) {
        }
        y2 = y22;
        n23 = n22;
        mutableList = CollectionsKt.toMutableList((Collection) ((N2.f) n22).d());
        r8Var2 = r8Var;
        if (mutableList.isEmpty()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n2, List list, ContinuationImpl continuationImpl) {
        T2 t2;
        int i;
        EmptyList emptyList;
        EmptyList emptyList2;
        Y2 y2;
        String str;
        ?? r12;
        AbstractC0193i4 abstractC0193i4;
        if (continuationImpl instanceof T2) {
            t2 = (T2) continuationImpl;
            int i2 = t2.g;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                t2.g = i2 - PKIFailureInfo.systemUnavail;
                T2 t22 = t2;
                Object obj = t22.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = t22.g;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (n2 instanceof N2.i) {
                        return a((N2.i) n2);
                    }
                    boolean z = n2 instanceof N2.l;
                    if (z) {
                        ?? arrayList = new ArrayList();
                        N2.l lVar = (N2.l) n2;
                        arrayList.addAll(lVar.h);
                        arrayList.add(lVar.f);
                        emptyList = arrayList;
                    } else {
                        emptyList = EmptyList.INSTANCE;
                    }
                    String str2 = z ? ((N2.l) n2).d : "";
                    Workflow$LinkWorkflowNextRequest.a newBuilder = Workflow$LinkWorkflowNextRequest.newBuilder();
                    newBuilder.b(n2.h());
                    newBuilder.a(str2);
                    if (!list.isEmpty()) {
                        newBuilder.a(list);
                    }
                    Workflow$LinkWorkflowNextRequest build = newBuilder.build();
                    Z0 z0 = Z0.a;
                    U2 u2 = new U2(this, build, null);
                    t22.a = this;
                    t22.b = n2;
                    t22.c = emptyList;
                    t22.d = str2;
                    t22.g = 1;
                    Object a = z0.a(u2, t22);
                    if (a != coroutineSingletons) {
                        emptyList2 = emptyList;
                        y2 = this;
                        str = str2;
                        obj = a;
                        r12 = n2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = t22.d;
                ?? r122 = t22.c;
                N2 n22 = t22.b;
                y2 = t22.a;
                SafeTrace.throwOnFailure(obj);
                emptyList2 = r122;
                r12 = n22;
                abstractC0193i4 = (AbstractC0193i4) obj;
                if (!abstractC0193i4.a()) {
                    return y2.a(r12.h(), abstractC0193i4, str, emptyList2);
                }
                Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = (Workflow$LinkWorkflowNextResponse) ((AbstractC0193i4.c) abstractC0193i4).a;
                String g = r12.g();
                String workflowSessionId = workflow$LinkWorkflowNextResponse.getWorkflowSessionId();
                workflowSessionId.getClass();
                String continuationToken = workflow$LinkWorkflowNextResponse.getContinuationToken();
                continuationToken.getClass();
                String a2 = r12 instanceof N2.g ? ((N2.g) r12).a() : "";
                Pane$PaneRendering nextPane = workflow$LinkWorkflowNextResponse.getNextPane();
                List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowNextResponse.getAdditionalPanesList();
                additionalPanesList.getClass();
                String requestId = workflow$LinkWorkflowNextResponse.getRequestId();
                requestId.getClass();
                t22.a = null;
                t22.b = null;
                t22.c = null;
                t22.d = null;
                t22.g = 2;
                Object a3 = y2.a(g, workflowSessionId, continuationToken, a2, nextPane, additionalPanesList, emptyList2, requestId, t22);
                return a3 == coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        t2 = new T2(this, continuationImpl);
        T2 t222 = t2;
        Object obj2 = t222.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = t222.g;
        if (i != 0) {
        }
        abstractC0193i4 = (AbstractC0193i4) obj2;
        if (!abstractC0193i4.a()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n2, ContinuationImpl continuationImpl) {
        R2 r2;
        int i;
        List<r8> list;
        Y2 y2;
        List<r8> list2;
        String str;
        N2 n22;
        Pane$PaneRendering pane$PaneRendering;
        if (continuationImpl instanceof R2) {
            r2 = (R2) continuationImpl;
            int i2 = r2.g;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                r2.g = i2 - PKIFailureInfo.systemUnavail;
                Object obj = r2.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r2.g;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    r8 f = n2.f();
                    boolean z = n2 instanceof N2.f;
                    String b = z ? ((N2.f) n2).b() : "";
                    if (z) {
                        list = ((N2.f) n2).d();
                    } else {
                        list = EmptyList.INSTANCE;
                    }
                    L4 l4 = this.b;
                    r2.a = this;
                    r2.b = n2;
                    r2.c = b;
                    r2.d = list;
                    r2.g = 1;
                    obj = l4.a(f, r2);
                    if (obj != coroutineSingletons) {
                        y2 = this;
                        list2 = list;
                        str = b;
                        n22 = n2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List<r8> list3 = r2.d;
                String str2 = r2.c;
                N2 n23 = r2.b;
                Y2 y22 = r2.a;
                SafeTrace.throwOnFailure(obj);
                list2 = list3;
                str = str2;
                n22 = n23;
                y2 = y22;
                pane$PaneRendering = (Pane$PaneRendering) obj;
                if (pane$PaneRendering != null) {
                    return y2.a(O2.a(n22), n22.h(), new Throwable("Current pane is null"), str, list2);
                }
                Pane$PaneOutput.a a = K4.a(pane$PaneRendering);
                if (a == null) {
                    return y2.a(O2.a(n22), n22.h(), new Throwable(Recorder$$ExternalSyntheticOutline2.m("Current pane could not be converted to an exit action: ", pane$PaneRendering.getRenderingPropertyKey())), str, list2);
                }
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(a.build());
                r2.a = null;
                r2.b = null;
                r2.c = null;
                r2.d = null;
                r2.g = 2;
                Object a2 = y2.a(n22, listOf, r2);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        r2 = new R2(this, continuationImpl);
        Object obj2 = r2.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r2.g;
        if (i != 0) {
        }
        pane$PaneRendering = (Pane$PaneRendering) obj2;
        if (pane$PaneRendering != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        if (r11.a(r6) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (r12.a(r6) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
    
        if (r12 == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n2, boolean z, ContinuationImpl continuationImpl) {
        X2 x2;
        int i;
        if (continuationImpl instanceof X2) {
            x2 = (X2) continuationImpl;
            int i2 = x2.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                x2.f = i2 - PKIFailureInfo.systemUnavail;
                X2 x22 = x2;
                Object obj = x22.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = x22.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (n2 instanceof N2.a) {
                        y8 y8Var = this.f;
                        x22.a = this;
                        x22.b = n2;
                        x22.f = 1;
                    } else if (n2 instanceof N2.b) {
                        y8 y8Var2 = this.f;
                        x22.a = this;
                        x22.b = n2;
                        x22.c = z;
                        x22.f = 3;
                    } else if (n2 instanceof N2.l) {
                        L4 l4 = this.b;
                        r8 f = n2.f();
                        x22.a = this;
                        x22.b = n2;
                        x22.f = 5;
                        obj = l4.a(f, x22);
                    } else {
                        if (n2 instanceof N2.i) {
                            return n2;
                        }
                        if (n2 instanceof N2.j) {
                            return this.d.a();
                        }
                        if (n2 instanceof N2.k) {
                            return n2;
                        }
                        return a(O2.a(n2), n2.h(), new Throwable("Should not call workflow.start with state: " + n2), "", EmptyList.INSTANCE);
                    }
                } else if (i == 1) {
                    n2 = x22.b;
                    this = x22.a;
                    SafeTrace.throwOnFailure(obj);
                    Y2 y2 = this;
                    y2.c.b();
                    N2.a aVar = (N2.a) n2;
                    Workflow$LinkWorkflowStartRequest a = y2.e.a(aVar);
                    y2.g.a(aVar.i().a(), aVar.i().b());
                    String h = n2.h();
                    String g = n2.g();
                    x22.a = null;
                    x22.b = null;
                    x22.f = 2;
                    Object a2 = y2.a(a, h, g, "", x22);
                    if (a2 != coroutineSingletons) {
                        return a2;
                    }
                } else {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n2 = x22.b;
                        this = x22.a;
                        SafeTrace.throwOnFailure(obj);
                        return ((Pane$PaneRendering) obj) == null ? this.a(((N2.l) n2).c(), n2.h(), new Throwable("Current pane is null"), ((N2.l) n2).b(), EmptyList.INSTANCE) : n2;
                    }
                    z = x22.c;
                    n2 = x22.b;
                    this = x22.a;
                    SafeTrace.throwOnFailure(obj);
                    Y2 y22 = this;
                    y22.c.b();
                    N2.b bVar = (N2.b) n2;
                    Workflow$LinkWorkflowStartRequest a3 = y22.e.a(bVar, z);
                    y22.g.a(n2.g(), bVar.i().getToken());
                    String h2 = n2.h();
                    String g2 = n2.g();
                    String a4 = ((N2.b) n2).a();
                    x22.a = null;
                    x22.b = null;
                    x22.f = 4;
                    Object a5 = y22.a(a3, h2, g2, a4, x22);
                    if (a5 != coroutineSingletons) {
                        return a5;
                    }
                }
                return coroutineSingletons;
            }
        }
        x2 = new X2(this, continuationImpl);
        X2 x222 = x2;
        Object obj2 = x222.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = x222.f;
        if (i != 0) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n2, D6 d6, ContinuationImpl continuationImpl) {
        W2 w2;
        Object obj;
        int i;
        Y2 y2;
        N2 n22;
        if (continuationImpl instanceof W2) {
            w2 = (W2) continuationImpl;
            int i2 = w2.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                w2.e = i2 - PKIFailureInfo.systemUnavail;
                W2 w22 = w2;
                obj = w22.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w22.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (d6 instanceof D6.d) {
                        return a(O2.a(n2), n2.h(), ((D6.d) d6).a(), "", EmptyList.INSTANCE);
                    }
                    if (n2 instanceof N2.k) {
                        if (!(d6 instanceof D6.b) && !(d6 instanceof D6.c)) {
                            n8 n8Var = this.e;
                            N2.k kVar = (N2.k) n2;
                            d6.getClass();
                            Workflow$LinkWorkflowStartRequest a = n8Var.a(kVar, (D6.a) d6);
                            String h = n2.h();
                            String g = n2.g();
                            String a2 = kVar.a();
                            w22.e = 1;
                            Object a3 = a(a, h, g, a2, w22);
                            if (a3 != coroutineSingletons) {
                                return a3;
                            }
                        } else {
                            return new N2.d(n2.g(), n2.h(), ((N2.k) n2).c(), d6 instanceof D6.c);
                        }
                    } else {
                        r8 e = n2 instanceof N2.l ? ((N2.l) n2).e() : null;
                        if (e == null) {
                            return a(O2.a(n2), n2.h(), new IllegalStateException("Link does not have a current pane"), "", EmptyList.INSTANCE);
                        }
                        L4 l4 = this.b;
                        w22.a = this;
                        w22.b = n2;
                        w22.e = 2;
                        Object a4 = l4.a(e, w22);
                        if (a4 != coroutineSingletons) {
                            y2 = this;
                            n22 = n2;
                            obj = a4;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n22 = w22.b;
                Y2 y22 = w22.a;
                SafeTrace.throwOnFailure(obj);
                y2 = y22;
                if (((Pane$PaneRendering) obj) == null) {
                    return n22;
                }
                return y2.a(O2.a(n22), n22.h(), new IllegalStateException("OAuth pane not found: " + n22), "", EmptyList.INSTANCE);
            }
        }
        w2 = new W2(this, continuationImpl);
        W2 w222 = w2;
        obj = w222.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w222.e;
        if (i != 0) {
        }
        if (((Pane$PaneRendering) obj) == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a A[LOOP:1: B:22:0x0114->B:24:0x011a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, Pane$PaneRendering pane$PaneRendering, List list, List list2, String str5, ContinuationImpl continuationImpl) {
        S2 s2;
        int i;
        String str6;
        List list3;
        String str7;
        Pane$PaneRendering pane$PaneRendering2;
        String str8;
        List list4;
        Y2 y2;
        String str9;
        String str10;
        List<Pane$PaneRendering> list5;
        List list6;
        Y2 y22;
        String str11;
        String str12;
        Pane$PaneRendering pane$PaneRendering3;
        String str13;
        String str14;
        Iterator it;
        String str15;
        if (continuationImpl instanceof S2) {
            s2 = (S2) continuationImpl;
            int i2 = s2.m;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                s2.m = i2 - PKIFailureInfo.systemUnavail;
                Object obj = s2.k;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = s2.m;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (pane$PaneRendering == null) {
                        return a(str5, str2, new Throwable("Next pane was null in start request"), str3, (List<r8>) list2);
                    }
                    L4 l4 = this.b;
                    r8.CREATOR.getClass();
                    r8 a = r8.c.a(pane$PaneRendering, str2);
                    s2.a = this;
                    str6 = str;
                    s2.b = str6;
                    s2.c = str2;
                    s2.d = str3;
                    s2.e = str4;
                    s2.f = pane$PaneRendering;
                    s2.g = list;
                    list3 = list2;
                    s2.h = list3;
                    str7 = str5;
                    s2.i = str7;
                    s2.m = 1;
                    if (l4.a(a, pane$PaneRendering, s2) != coroutineSingletons) {
                        pane$PaneRendering2 = pane$PaneRendering;
                        str8 = str4;
                        list4 = list;
                        y2 = this;
                        str9 = str3;
                        str10 = str2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = s2.j;
                    str15 = s2.i;
                    list6 = s2.h;
                    list5 = s2.g;
                    pane$PaneRendering3 = s2.f;
                    str12 = s2.e;
                    str14 = s2.d;
                    str13 = s2.c;
                    str11 = s2.b;
                    y22 = s2.a;
                    SafeTrace.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Pane$PaneRendering pane$PaneRendering4 = (Pane$PaneRendering) it.next();
                        L4 l42 = y22.b;
                        r8.CREATOR.getClass();
                        r8 a2 = r8.c.a(pane$PaneRendering4, str13);
                        s2.a = y22;
                        s2.b = str11;
                        s2.c = str13;
                        s2.d = str14;
                        s2.e = str12;
                        s2.f = pane$PaneRendering3;
                        s2.g = list5;
                        s2.h = list6;
                        s2.i = str15;
                        s2.j = it;
                        s2.m = 2;
                        if (l42.a(a2, pane$PaneRendering4, s2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    r8.CREATOR.getClass();
                    r8 a3 = r8.c.a(pane$PaneRendering3, str13);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    for (Pane$PaneRendering pane$PaneRendering5 : list5) {
                        r8.CREATOR.getClass();
                        arrayList.add(r8.c.a(pane$PaneRendering5, str13));
                    }
                    return new N2.l(str11, str13, str14, str12, a3, arrayList, list6, str15);
                }
                String str16 = s2.i;
                List list7 = s2.h;
                list4 = s2.g;
                pane$PaneRendering2 = s2.f;
                str8 = s2.e;
                String str17 = s2.d;
                str10 = s2.c;
                String str18 = s2.b;
                y2 = s2.a;
                SafeTrace.throwOnFailure(obj);
                str7 = str16;
                list3 = list7;
                str9 = str17;
                str6 = str18;
                Iterator it2 = list4.iterator();
                Pane$PaneRendering pane$PaneRendering6 = pane$PaneRendering2;
                list5 = list4;
                list6 = list3;
                y22 = y2;
                str11 = str6;
                str12 = str8;
                pane$PaneRendering3 = pane$PaneRendering6;
                str13 = str10;
                str14 = str9;
                it = it2;
                str15 = str7;
                while (it.hasNext()) {
                }
                r8.CREATOR.getClass();
                r8 a32 = r8.c.a(pane$PaneRendering3, str13);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                while (r3.hasNext()) {
                }
                return new N2.l(str11, str13, str14, str12, a32, arrayList2, list6, str15);
            }
        }
        s2 = new S2(this, continuationImpl);
        Object obj2 = s2.k;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s2.m;
        if (i != 0) {
        }
        Iterator it22 = list4.iterator();
        Pane$PaneRendering pane$PaneRendering62 = pane$PaneRendering2;
        list5 = list4;
        list6 = list3;
        y22 = y2;
        str11 = str6;
        str12 = str8;
        pane$PaneRendering3 = pane$PaneRendering62;
        str13 = str10;
        str14 = str9;
        it = it22;
        str15 = str7;
        while (it.hasNext()) {
        }
        r8.CREATOR.getClass();
        r8 a322 = r8.c.a(pane$PaneRendering3, str13);
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
        while (r3.hasNext()) {
        }
        return new N2.l(str11, str13, str14, str12, a322, arrayList22, list6, str15);
    }

    public static N2.e a(N2.i iVar) {
        String str = iVar.f;
        String str2 = iVar.e;
        String a = L2.a(str, str2, str2);
        str.getClass();
        str2.getClass();
        str2.getClass();
        a.getClass();
        LinkError linkError = new LinkError(LinkErrorCode.INSTANCE.convert(str), str2, str2, a);
        LinkExitMetadataStatus fromString = LinkExitMetadataStatus.INSTANCE.fromString(iVar.f);
        String str3 = iVar.b;
        String str4 = iVar.h;
        return new N2.e(iVar.b, new LinkExit(linkError, new LinkExitMetadata(fromString, null, str3, str4, L2.a(str3, str4))));
    }

    public final N2 a(String str, String str2, String str3, String str4, Common$WebviewFallback common$WebviewFallback) {
        A a;
        EnumC0151d7 enumC0151d7;
        String url = common$WebviewFallback.getUrl();
        url.getClass();
        if (url.length() == 0) {
            return a(str3, str2, new Throwable("Webview fallback URL was null"), "", EmptyList.INSTANCE);
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS) {
            String webviewFallbackId = common$WebviewFallback.getWebviewFallbackId();
            webviewFallbackId.getClass();
            String id = common$WebviewFallback.getChannelFromWebview().getId();
            id.getClass();
            String secret = common$WebviewFallback.getChannelFromWebview().getSecret();
            secret.getClass();
            return new N2.k(str, str2, str3, str4, url, webviewFallbackId, new A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id, secret), common$WebviewFallback.getShouldEagerStart(), EnumC0151d7.NO_SMS_AUTOFILL, 128);
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_IN_PROCESS) {
            if (common$WebviewFallback.hasChannelFromWebview()) {
                String id2 = common$WebviewFallback.getChannelFromWebview().getId();
                id2.getClass();
                String secret2 = common$WebviewFallback.getChannelFromWebview().getSecret();
                secret2.getClass();
                a = new A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id2, secret2);
            } else {
                a = null;
            }
            A a2 = a;
            String webviewFallbackId2 = common$WebviewFallback.getWebviewFallbackId();
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Z webviewFallbackBackground = common$WebviewFallback.getWebviewFallbackBackground();
            webviewFallbackBackground.getClass();
            boolean a3 = K7.a(webviewFallbackBackground);
            boolean shouldEagerStart = common$WebviewFallback.getShouldEagerStart();
            com.plaid.internal.core.protos.link.workflow.primitives.f androidSmsVerificationApiType = common$WebviewFallback.getAndroidSmsVerificationApiType();
            if (androidSmsVerificationApiType == null || (enumC0151d7 = C0152e.a(androidSmsVerificationApiType)) == null) {
                enumC0151d7 = EnumC0151d7.NO_SMS_AUTOFILL;
            }
            EnumC0151d7 enumC0151d72 = enumC0151d7;
            webviewFallbackId2.getClass();
            return new N2.k(str, str2, str3, str4, url, webviewFallbackId2, a2, a3, false, shouldEagerStart, enumC0151d72);
        }
        Throwable th = new Throwable("Unsupported webview fallback mode: " + common$WebviewFallback.getMode());
        C0095a6.a.a(C0095a6.a, th);
        return a(str3, str2, th, "", EmptyList.INSTANCE);
    }

    public final <T> N2.i a(String str, AbstractC0193i4<? extends T, ? extends Object> abstractC0193i4, String str2, List<r8> list) {
        String str3;
        H3 h3;
        F3 f3 = this.d;
        f3.getClass();
        abstractC0193i4.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        if (!(abstractC0193i4 instanceof AbstractC0193i4.c)) {
            str3 = "";
            if (abstractC0193i4 instanceof AbstractC0193i4.b) {
                h3 = H3.NETWORK_ERROR;
            } else if (abstractC0193i4 instanceof AbstractC0193i4.d) {
                h3 = H3.UNKNOWN_ERROR;
            } else if (abstractC0193i4 instanceof AbstractC0193i4.a) {
                AbstractC0193i4.a aVar = (AbstractC0193i4.a) abstractC0193i4;
                U u = aVar.a;
                str3 = u instanceof LinkedTreeMap ? String.valueOf(((Map) u).get("request_id")) : "";
                if (aVar.b == 440) {
                    h3 = H3.SESSION_EXPIRED;
                } else {
                    h3 = H3.HTTP_ERROR;
                }
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            H3 h32 = h3;
            String str4 = str3;
            r8.CREATOR.getClass();
            str.getClass();
            return new N2.i(str, new r8(str, "error_pane_id", "local_error_pane"), str2, f3.a(h32), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), list, str4, h32);
        }
        throw new B2("Can't convert success response to local error");
    }

    public final N2.i a(String str, String str2, Throwable th, String str3, List<r8> list) {
        C0095a6.a.a(C0095a6.a, th);
        F3 f3 = this.d;
        f3.getClass();
        str.getClass();
        th.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        r8.CREATOR.getClass();
        str2.getClass();
        r8 r8Var = new r8(str2, "error_pane_id", "local_error_pane");
        H3 h3 = H3.UNKNOWN_ERROR;
        return new N2.i(str2, r8Var, str3, f3.a(h3), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), list, str, h3);
    }
}
