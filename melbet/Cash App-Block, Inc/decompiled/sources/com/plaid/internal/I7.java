package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class I7 {
    public final C0326x3 a;
    public final B6 b;

    public I7(C0326x3 c0326x3, B6 b6) {
        c0326x3.getClass();
        b6.getClass();
        this.a = c0326x3;
        this.b = b6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        F7 f7;
        int i;
        String str;
        if (continuationImpl instanceof F7) {
            f7 = (F7) continuationImpl;
            int i2 = f7.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                f7.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = f7.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f7.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    B6 b6 = this.b;
                    f7.a = this;
                    f7.d = 1;
                    obj = b6.a(f7);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = f7.a;
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    C0095a6.a.e(C0095a6.a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackCancelEvent");
                } else {
                    this.a.a(str);
                    C0095a6.a.a(C0095a6.a, "WebviewFallbackCancel webviewFallbackId=".concat(str));
                }
                return Unit.INSTANCE;
            }
        }
        f7 = new F7(this, continuationImpl);
        Object obj2 = f7.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f7.d;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        G7 g7;
        int i;
        String str;
        if (continuationImpl instanceof G7) {
            g7 = (G7) continuationImpl;
            int i2 = g7.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                g7.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = g7.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = g7.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    B6 b6 = this.b;
                    g7.a = this;
                    g7.d = 1;
                    obj = b6.a(g7);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = g7.a;
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    C0095a6.a.e(C0095a6.a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackEmitPreCompletionResultEvent");
                } else {
                    this.a.b(str);
                    C0095a6.a.a(C0095a6.a, "WebviewFallbackEmitPreCompletionResult webviewFallbackId=".concat(str));
                }
                return Unit.INSTANCE;
            }
        }
        g7 = new G7(this, continuationImpl);
        Object obj2 = g7.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g7.d;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        H7 h7;
        int i;
        String str;
        if (continuationImpl instanceof H7) {
            h7 = (H7) continuationImpl;
            int i2 = h7.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                h7.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = h7.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = h7.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    B6 b6 = this.b;
                    h7.a = this;
                    h7.d = 1;
                    obj = b6.a(h7);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = h7.a;
                    SafeTrace.throwOnFailure(obj);
                }
                str = (String) obj;
                this.getClass();
                if (str != null) {
                    C0095a6.a.e(C0095a6.a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackOpenEvent");
                } else {
                    this.a.c(str);
                    C0095a6.a.a(C0095a6.a, "WebviewFallbackOpen webviewFallbackId=".concat(str));
                }
                return Unit.INSTANCE;
            }
        }
        h7 = new H7(this, continuationImpl);
        Object obj2 = h7.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = h7.d;
        if (i != 0) {
        }
        str = (String) obj2;
        this.getClass();
        if (str != null) {
        }
        return Unit.INSTANCE;
    }
}
