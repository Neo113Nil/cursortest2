package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0249o6;
import com.plaid.internal.C0095a6;
import com.plaid.internal.N2;
import com.plaid.link.OnLoadCallback;
import com.plaid.link.SubmissionData;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.k6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0213k6 {
    public final Z2 a;
    public final Y2 b;
    public final N5 c;
    public final C0100b1 d;
    public final C0231m6 e;
    public final L7 f;
    public SubmissionData g;

    public C0213k6(Z2 z2, Y2 y2, N5 n5, C0100b1 c0100b1, C0231m6 c0231m6, L7 l7) {
        z2.getClass();
        y2.getClass();
        n5.getClass();
        c0100b1.getClass();
        c0231m6.getClass();
        l7.getClass();
        this.a = z2;
        this.b = y2;
        this.c = n5;
        this.d = c0100b1;
        this.e = c0231m6;
        this.f = l7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r9, r11, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r9, r11, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher, new com.plaid.internal.C0186h6(r9, r11, r10, null), r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004e, code lost:
    
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OnLoadCallback onLoadCallback, ContinuationImpl continuationImpl) {
        C0159e6 c0159e6;
        int i;
        if (continuationImpl instanceof C0159e6) {
            c0159e6 = (C0159e6) continuationImpl;
            int i2 = c0159e6.e;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0159e6.e = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0159e6.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0159e6.e;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    c0159e6.a = this;
                    c0159e6.b = onLoadCallback;
                    c0159e6.e = 1;
                    obj = a(c0159e6);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3 && i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        C0095a6.a.a(C0095a6.a, "Preload link complete");
                        return Unit.INSTANCE;
                    }
                    onLoadCallback = c0159e6.b;
                    this = c0159e6.a;
                    SafeTrace.throwOnFailure(obj);
                }
                AbstractC0249o6 abstractC0249o6 = (AbstractC0249o6) obj;
                if (JobKt.isActive(c0159e6.getContext())) {
                    return Unit.INSTANCE;
                }
                C0095a6.a.a(C0095a6.a, "Preload Link " + abstractC0249o6);
                if (!Intrinsics.areEqual(abstractC0249o6, AbstractC0249o6.a.a)) {
                    if (abstractC0249o6 instanceof AbstractC0249o6.d) {
                        if (onLoadCallback != null) {
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                            C0168f6 c0168f6 = new C0168f6(onLoadCallback, null);
                            c0159e6.a = null;
                            c0159e6.b = null;
                            c0159e6.e = 2;
                        }
                    } else if (abstractC0249o6 instanceof AbstractC0249o6.b) {
                        this.getClass();
                        if (onLoadCallback != null) {
                            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                            HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
                            C0177g6 c0177g6 = new C0177g6(onLoadCallback, null);
                            c0159e6.a = null;
                            c0159e6.b = null;
                            c0159e6.e = 3;
                        }
                    } else if (abstractC0249o6 instanceof AbstractC0249o6.c) {
                        String a = ((AbstractC0249o6.c) abstractC0249o6).a();
                        c0159e6.a = null;
                        c0159e6.b = null;
                        c0159e6.e = 4;
                        this.getClass();
                        DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                    }
                }
                C0095a6.a.a(C0095a6.a, "Preload link complete");
                return Unit.INSTANCE;
            }
        }
        c0159e6 = new C0159e6(this, continuationImpl);
        Object obj2 = c0159e6.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0159e6.e;
        if (i != 0) {
        }
        AbstractC0249o6 abstractC0249o62 = (AbstractC0249o6) obj2;
        if (JobKt.isActive(c0159e6.getContext())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        if (r9.a(r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        C0195i6 c0195i6;
        int i;
        if (continuationImpl instanceof C0195i6) {
            c0195i6 = (C0195i6) continuationImpl;
            int i2 = c0195i6.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0195i6.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0195i6.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0195i6.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!JobKt.isActive(c0195i6.getContext())) {
                        return Unit.INSTANCE;
                    }
                    Z2 z2 = this.a;
                    c0195i6.a = this;
                    c0195i6.d = 1;
                    obj = z2.a(c0195i6);
                } else if (i == 1) {
                    this = c0195i6.a;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = c0195i6.a;
                    SafeTrace.throwOnFailure(obj);
                    N2 n2 = (N2) obj;
                    if (!JobKt.isActive(c0195i6.getContext())) {
                        return Unit.INSTANCE;
                    }
                    C0095a6.a.a(C0095a6.a, "Preload workflow complete " + n2);
                    Z2 z22 = this.a;
                    c0195i6.a = null;
                    c0195i6.d = 3;
                }
                N2 n22 = (N2) obj;
                if (JobKt.isActive(c0195i6.getContext())) {
                    return Unit.INSTANCE;
                }
                C0095a6.a.a(C0095a6.a, "Preload workflow from " + n22);
                Y2 y2 = this.b;
                c0195i6.a = this;
                c0195i6.d = 2;
                obj = y2.a(n22, true, (ContinuationImpl) c0195i6);
            }
        }
        c0195i6 = new C0195i6(this, continuationImpl);
        Object obj2 = c0195i6.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0195i6.d;
        if (i != 0) {
        }
        N2 n222 = (N2) obj2;
        if (JobKt.isActive(c0195i6.getContext())) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0150d6 c0150d6;
        int i;
        N2 n2;
        boolean z;
        if (continuationImpl instanceof C0150d6) {
            c0150d6 = (C0150d6) continuationImpl;
            int i2 = c0150d6.d;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0150d6.d = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0150d6.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0150d6.d;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Z2 z2 = this.a;
                    c0150d6.a = this;
                    c0150d6.d = 1;
                    obj = z2.a(c0150d6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = c0150d6.a;
                    SafeTrace.throwOnFailure(obj);
                }
                n2 = (N2) obj;
                if (!(n2 instanceof N2.b)) {
                    return AbstractC0249o6.a.a;
                }
                if (!(n2 instanceof N2.k)) {
                    return AbstractC0249o6.d.a;
                }
                N2.k kVar = (N2.k) n2;
                if (!kVar.k) {
                    this.d.getClass();
                    EnumC0110c1 enumC0110c1 = EnumC0110c1.BACKEND_DETERMINES;
                    if (enumC0110c1.isSet()) {
                        this.d.getClass();
                        z = enumC0110c1.toBoolean();
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return AbstractC0249o6.d.a;
                    }
                }
                boolean z3 = kVar.j;
                String str = kVar.f;
                if (z3) {
                    return new AbstractC0249o6.b(str);
                }
                return new AbstractC0249o6.c(str);
            }
        }
        c0150d6 = new C0150d6(this, continuationImpl);
        Object obj2 = c0150d6.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0150d6.d;
        if (i != 0) {
        }
        n2 = (N2) obj2;
        if (!(n2 instanceof N2.b)) {
        }
    }
}
