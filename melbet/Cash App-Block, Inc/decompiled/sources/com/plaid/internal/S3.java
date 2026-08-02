package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class S3 implements T3 {
    public final InterfaceC0331y<String, Object> a;
    public final I3 b;

    public S3(WorkflowDatabase workflowDatabase) {
        C0093a4 c0093a4 = new C0093a4();
        workflowDatabase.getClass();
        this.a = c0093a4;
        this.b = workflowDatabase.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.plaid.internal.T3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        R3 r3;
        int i;
        if (continuationImpl instanceof R3) {
            r3 = (R3) continuationImpl;
            int i2 = r3.f;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                r3.f = i2 - PKIFailureInfo.systemUnavail;
                Object obj = r3.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r3.f;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    I3 i3 = this.b;
                    r3.a = this;
                    r3.b = str2;
                    r3.c = str3;
                    r3.f = 1;
                    if (i3.a(str, str2, str3, r3) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = r3.c;
                    str2 = r3.b;
                    this = r3.a;
                    SafeTrace.throwOnFailure(obj);
                }
                this.a.a(str2, str3);
                return Unit.INSTANCE;
            }
        }
        r3 = new R3(this, continuationImpl);
        Object obj2 = r3.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r3.f;
        if (i != 0) {
        }
        this.a.a(str2, str3);
        return Unit.INSTANCE;
    }

    @Override // com.plaid.internal.T3
    public final Object a(String str, ContinuationImpl continuationImpl) {
        this.a.clear();
        Object a = this.b.a(str, continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.T3
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        Object a = this.a.a(str2);
        String str3 = a instanceof String ? (String) a : null;
        return str3 == null ? this.b.a(str, str2, continuationImpl) : str3;
    }
}
