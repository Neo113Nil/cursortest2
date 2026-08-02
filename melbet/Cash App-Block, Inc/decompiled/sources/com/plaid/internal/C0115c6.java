package com.plaid.internal;

import android.util.Base64;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0336y4;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0115c6 implements InterfaceC0347z6, z8 {
    public final T3 a;

    public C0115c6(T3 t3) {
        t3.getClass();
        this.a = t3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.plaid.internal.InterfaceC0347z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0105b6 c0105b6;
        int i;
        String str;
        if (continuationImpl instanceof C0105b6) {
            c0105b6 = (C0105b6) continuationImpl;
            int i2 = c0105b6.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0105b6.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0105b6.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0105b6.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    T3 t3 = this.a;
                    c0105b6.c = 1;
                    obj = t3.a("pre_completion_result_state", "pre_completion_result", c0105b6);
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
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                return Channel$Message.SDKResult.parseFrom(Base64.decode(str, 0));
            }
        }
        c0105b6 = new C0105b6(this, continuationImpl);
        Object obj2 = c0105b6.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0105b6.c;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    @Override // com.plaid.internal.InterfaceC0347z6
    public final Object b(ContinuationImpl continuationImpl) {
        Object a = this.a.a("pre_completion_result_state", continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.z8
    public final Object a(Channel$Message.SDKResult sDKResult, C0336y4.b bVar) {
        String encodeToString = Base64.encodeToString(sDKResult.toByteArray(), 0);
        T3 t3 = this.a;
        encodeToString.getClass();
        Object a = t3.a("pre_completion_result_state", "pre_completion_result", encodeToString, bVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
