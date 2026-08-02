package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class O7 implements C8, C6 {
    public final T3 a;

    public O7(T3 t3) {
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
    @Override // com.plaid.internal.C6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        N7 n7;
        int i;
        if (continuationImpl instanceof N7) {
            n7 = (N7) continuationImpl;
            int i2 = n7.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                n7.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = n7.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = n7.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    T3 t3 = this.a;
                    n7.a = this;
                    n7.d = 1;
                    obj = t3.a("webview_fallback_state", "webview_fallback_initial_uri", n7);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str = (String) n7.a;
                        SafeTrace.throwOnFailure(obj);
                        return str;
                    }
                    this = (O7) n7.a;
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = (String) obj;
                T3 t32 = this.a;
                n7.a = str2;
                n7.d = 2;
                return t32.a("webview_fallback_state", n7) != coroutineSingletons ? coroutineSingletons : str2;
            }
        }
        n7 = new N7(this, continuationImpl);
        Object obj2 = n7.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = n7.d;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        T3 t322 = this.a;
        n7.a = str22;
        n7.d = 2;
        if (t322.a("webview_fallback_state", n7) != coroutineSingletons2) {
        }
    }

    @Override // com.plaid.internal.C8
    public final Object a(String str, C0280s2 c0280s2) {
        Object a = this.a.a("webview_fallback_state", "webview_fallback_initial_uri", str, c0280s2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
