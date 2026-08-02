package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import com.plaid.internal.C0095a6;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class P0 {
    public final n8 a;
    public final i8 b;
    public final Json c;

    public P0(InterfaceC0092a3 interfaceC0092a3) {
        interfaceC0092a3.getClass();
        C0243o0 c0243o0 = (C0243o0) interfaceC0092a3;
        C0252p0 c0252p0 = c0243o0.a;
        C0243o0 c0243o02 = c0243o0.b;
        new C0234n0(c0252p0, c0243o02, new I1());
        this.a = (n8) c0243o02.i.get();
        E5 e5 = (E5) c0243o02.a.l.get();
        C0230m5 c0230m5 = (C0230m5) c0243o02.a.m.get();
        e5.getClass();
        c0230m5.getClass();
        EnumC0203j5 b = c0230m5.b();
        b.getClass();
        int i = C0212k5.a[b.ordinal()];
        String str = "https://production.plaid.com/";
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object create = e5.a(str, new G5(null, 3)).create(i8.class);
        create.getClass();
        this.b = (i8) create;
        this.c = (Json) c0252p0.e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        O0 o0;
        int i;
        AbstractC0193i4 abstractC0193i4;
        if (continuationImpl instanceof O0) {
            o0 = (O0) continuationImpl;
            int i2 = o0.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                o0.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = o0.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o0.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    n8 n8Var = this.a;
                    if (n8Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("workflowApiRequestFactory");
                        throw null;
                    }
                    Workflow$LinkWorkflowStartRequest a = n8Var.a(str);
                    C0095a6.a.a(C0095a6.a, "embedded view workflow start request is : " + a);
                    i8 i8Var = this.b;
                    if (i8Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("workflowApi");
                        throw null;
                    }
                    o0.c = 1;
                    obj = i8Var.a(a, o0);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                abstractC0193i4 = (AbstractC0193i4) obj;
                if (!abstractC0193i4.a()) {
                    C0095a6.a.b(C0095a6.a, "embedded search workflow start request error: " + abstractC0193i4);
                    Result.Companion companion = Result.Companion;
                    return new Result.Failure(new Exception("embedded search workflow start request error: " + abstractC0193i4));
                }
                Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC0193i4.c) abstractC0193i4).b();
                String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                url.getClass();
                if (url.length() != 0) {
                    Result.Companion companion2 = Result.Companion;
                    return workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                }
                C0095a6.a.b(C0095a6.a, "missing webview fallback url: " + workflow$LinkWorkflowStartResponse);
                Result.Companion companion3 = Result.Companion;
                return new Result.Failure(new Exception("missing webview fallback url: " + workflow$LinkWorkflowStartResponse));
            }
        }
        o0 = new O0(this, continuationImpl);
        Object obj2 = o0.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o0.c;
        if (i != 0) {
        }
        abstractC0193i4 = (AbstractC0193i4) obj2;
        if (!abstractC0193i4.a()) {
        }
    }
}
