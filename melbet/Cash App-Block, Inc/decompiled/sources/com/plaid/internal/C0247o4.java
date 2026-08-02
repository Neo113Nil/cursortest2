package com.plaid.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.o4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0247o4 {
    public final i8 a;
    public final C0326x3 b;
    public final C0256p4 c;
    public final r8 d;
    public final Workflow$LinkWorkflowPollRequest e;

    public C0247o4(i8 i8Var, C0326x3 c0326x3, C0256p4 c0256p4, String str, r8 r8Var) {
        i8Var.getClass();
        c0326x3.getClass();
        c0256p4.getClass();
        str.getClass();
        r8Var.getClass();
        this.a = i8Var;
        this.b = c0326x3;
        this.c = c0256p4;
        this.d = r8Var;
        this.e = Workflow$LinkWorkflowPollRequest.newBuilder().a(r8Var.a).a(Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder().a(str).build()).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r14 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bf -> B:11:0x00c2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0238n4 c0238n4;
        int i;
        long currentTimeMillis;
        boolean z;
        boolean z2;
        if (continuationImpl instanceof C0238n4) {
            c0238n4 = (C0238n4) continuationImpl;
            int i2 = c0238n4.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0238n4.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0238n4.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0238n4.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.c.c()) {
                        C0095a6.a.a(C0095a6.a, "Not polling for oAuth result");
                        return Unit.INSTANCE;
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    C0095a6.a aVar = C0095a6.a;
                    long b = this.c.b();
                    long a = this.c.a();
                    StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(b, "Polling for oAuth result - duration: ", " interval: ");
                    m1149m.append(a);
                    C0095a6.a.a(aVar, m1149m.toString());
                    this.b.b(this.d);
                    z = false;
                    z2 = false;
                    if (!z) {
                    }
                } else if (i == 1) {
                    currentTimeMillis = c0238n4.b;
                    this = c0238n4.a;
                    SafeTrace.throwOnFailure(obj);
                    C0095a6.a.a(C0095a6.a, "OAuth polling attempt - " + (System.currentTimeMillis() - currentTimeMillis));
                    i8 i8Var = this.a;
                    Workflow$LinkWorkflowPollRequest workflow$LinkWorkflowPollRequest = this.e;
                    workflow$LinkWorkflowPollRequest.getClass();
                    c0238n4.a = this;
                    c0238n4.b = currentTimeMillis;
                    c0238n4.e = 2;
                    obj = i8Var.a(workflow$LinkWorkflowPollRequest, c0238n4);
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    currentTimeMillis = c0238n4.b;
                    this = c0238n4.a;
                    SafeTrace.throwOnFailure(obj);
                    AbstractC0193i4 abstractC0193i4 = (AbstractC0193i4) obj;
                    if (abstractC0193i4 instanceof AbstractC0193i4.c) {
                        Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = (Workflow$LinkWorkflowPollResponse) ((AbstractC0193i4.c) abstractC0193i4).b();
                        this.getClass();
                        if (workflow$LinkWorkflowPollResponse.hasOauthRedirectComplete() ? workflow$LinkWorkflowPollResponse.getOauthRedirectComplete().getIsComplete() : false) {
                            z2 = true;
                            if (z2) {
                                C0095a6.a.a(C0095a6.a, "OAuth polling detected OAuth session completion");
                            } else if (System.currentTimeMillis() - currentTimeMillis <= this.c.b()) {
                                z = false;
                                if (!z) {
                                    this.b.a(this.d);
                                    C0095a6.a.a(C0095a6.a, "Stopped polling, session was completed: " + z2);
                                    return Unit.INSTANCE;
                                }
                                long a2 = this.c.a();
                                c0238n4.a = this;
                                c0238n4.b = currentTimeMillis;
                                c0238n4.e = 1;
                            }
                            z = true;
                            if (!z) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        c0238n4 = new C0238n4(this, continuationImpl);
        Object obj2 = c0238n4.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0238n4.e;
        if (i != 0) {
        }
    }
}
