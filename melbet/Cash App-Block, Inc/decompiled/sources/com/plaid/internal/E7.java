package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class E7 implements A6, A8 {
    public final T3 a;
    public final C0100b1 b;

    public E7(T3 t3, C0100b1 c0100b1) {
        t3.getClass();
        c0100b1.getClass();
        this.a = t3;
        this.b = c0100b1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.plaid.internal.A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        D7 d7;
        int i;
        if (continuationImpl instanceof D7) {
            d7 = (D7) continuationImpl;
            int i2 = d7.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                d7.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = d7.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = d7.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.b.getClass();
                    EnumC0110c1 enumC0110c1 = EnumC0110c1.BACKEND_DETERMINES;
                    if (enumC0110c1.isSet()) {
                        this.b.getClass();
                        return Boolean.valueOf(enumC0110c1.toBoolean());
                    }
                    T3 t3 = this.a;
                    d7.c = 1;
                    obj = t3.a("webview_background_transparency_state", "webview_background_is_transparent", d7);
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
                String str = (String) obj;
                return str != null ? Boolean.FALSE : Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        d7 = new D7(this, continuationImpl);
        Object obj2 = d7.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = d7.c;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    @Override // com.plaid.internal.A6
    public final Object a(S7 s7) {
        Object a = this.a.a("webview_background_transparency_state", s7);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.A8
    public final Object a(boolean z, C0280s2 c0280s2) {
        Object a = this.a.a("webview_background_transparency_state", "webview_background_is_transparent", String.valueOf(z), c0280s2);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
