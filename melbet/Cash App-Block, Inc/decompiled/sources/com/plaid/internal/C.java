package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.A;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class C implements InterfaceC0320w6, x8 {
    public final T3 a;
    public final Json b;

    public C(T3 t3, Json json) {
        t3.getClass();
        json.getClass();
        this.a = t3;
        this.b = json;
    }

    @Override // com.plaid.internal.x8
    public final Object a(A a, C0280s2 c0280s2) {
        Object a2 = this.a.a("channel_state", "Channel_info", this.b.encodeToString(A.a.a, a), c0280s2);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.plaid.internal.InterfaceC0320w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        B b;
        int i;
        String str;
        if (continuationImpl instanceof B) {
            b = (B) continuationImpl;
            int i2 = b.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                b.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = b.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    T3 t3 = this.a;
                    b.a = this;
                    b.d = 1;
                    obj = t3.a("channel_state", "Channel_info", b);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = b.a;
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    return (A) this.b.decodeFromString(str, A.a.a);
                }
                return null;
            }
        }
        b = new B(this, continuationImpl);
        Object obj2 = b.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b.d;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
    }

    @Override // com.plaid.internal.InterfaceC0320w6
    public final Object a(ContinuationImpl continuationImpl) {
        Object a = this.a.a("channel_state", continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.x8
    public final Object a(C0280s2 c0280s2) {
        Object a = a((ContinuationImpl) c0280s2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
