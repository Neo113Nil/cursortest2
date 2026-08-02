package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0273r4 implements y8, InterfaceC0329x6 {
    public final T3 a;

    public C0273r4(T3 t3) {
        t3.getClass();
        this.a = t3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.plaid.internal.InterfaceC0329x6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0265q4 c0265q4;
        int i;
        if (continuationImpl instanceof C0265q4) {
            c0265q4 = (C0265q4) continuationImpl;
            int i2 = c0265q4.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0265q4.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0265q4.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0265q4.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    T3 t3 = this.a;
                    c0265q4.a = this;
                    c0265q4.d = 1;
                    obj = t3.a("oauth_pane_state", "received_redirect_uri", c0265q4);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str = (String) c0265q4.a;
                        SafeTrace.throwOnFailure(obj);
                        return str;
                    }
                    this = (C0273r4) c0265q4.a;
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = (String) obj;
                T3 t32 = this.a;
                c0265q4.a = str2;
                c0265q4.d = 2;
                return t32.a("oauth_pane_state", c0265q4) != coroutineSingletons ? coroutineSingletons : str2;
            }
        }
        c0265q4 = new C0265q4(this, continuationImpl);
        Object obj2 = c0265q4.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0265q4.d;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        T3 t322 = this.a;
        c0265q4.a = str22;
        c0265q4.d = 2;
        if (t322.a("oauth_pane_state", c0265q4) != coroutineSingletons2) {
        }
    }

    @Override // com.plaid.internal.y8
    public final Object a(X2 x2) {
        Object a = this.a.a("oauth_pane_state", x2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.y8
    public final Object a(String str, C0263q2 c0263q2) {
        Object a = this.a.a("oauth_pane_state", "received_redirect_uri", str, c0263q2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
