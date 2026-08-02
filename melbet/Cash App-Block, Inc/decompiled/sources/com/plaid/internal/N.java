package com.plaid.internal;

import android.os.Looper;
import android.util.Patterns;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0321w7;
import com.plaid.internal.InterfaceC0267q6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class N implements InterfaceC0312v7 {
    public final L a;

    public N(L l) {
        l.getClass();
        this.a = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: Exception -> 0x0085, w7 -> 0x0091, TryCatch #2 {w7 -> 0x0091, Exception -> 0x0085, blocks: (B:11:0x0025, B:12:0x005a, B:16:0x006d, B:19:0x0073, B:20:0x007e, B:21:0x0065, B:25:0x0033, B:27:0x003f, B:29:0x004d, B:32:0x007f, B:33:0x0081, B:34:0x0082, B:35:0x0084), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[Catch: Exception -> 0x0085, w7 -> 0x0091, TryCatch #2 {w7 -> 0x0091, Exception -> 0x0085, blocks: (B:11:0x0025, B:12:0x005a, B:16:0x006d, B:19:0x0073, B:20:0x007e, B:21:0x0065, B:25:0x0033, B:27:0x003f, B:29:0x004d, B:32:0x007f, B:33:0x0081, B:34:0x0082, B:35:0x0084), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: Exception -> 0x0085, w7 -> 0x0091, TryCatch #2 {w7 -> 0x0091, Exception -> 0x0085, blocks: (B:11:0x0025, B:12:0x005a, B:16:0x006d, B:19:0x0073, B:20:0x007e, B:21:0x0065, B:25:0x0033, B:27:0x003f, B:29:0x004d, B:32:0x007f, B:33:0x0081, B:34:0x0082, B:35:0x0084), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.plaid.internal.InterfaceC0312v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        M m;
        int i;
        String str2;
        boolean z;
        try {
            if (continuationImpl instanceof M) {
                m = (M) continuationImpl;
                int i2 = m.d;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    m.d = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = m.b;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = m.d;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!Patterns.WEB_URL.matcher(str).matches()) {
                            throw AbstractC0321w7.b.a;
                        }
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            throw AbstractC0321w7.e.a;
                        }
                        L l = this.a;
                        m.a = this;
                        m.d = 1;
                        obj = l.a(str, m);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = m.a;
                        SafeTrace.throwOnFailure(obj);
                    }
                    C0184h4 c0184h4 = (C0184h4) obj;
                    str2 = c0184h4.b;
                    this.getClass();
                    z = false;
                    if (str2 == null) {
                        z = StringsKt.contains((CharSequence) str2, (CharSequence) "ErrorCode=0&ErrorDescription=Success", false);
                    }
                    if (z) {
                        throw new AbstractC0321w7.d(String.valueOf(c0184h4.b));
                    }
                    return new InterfaceC0267q6.b(c0184h4);
                }
            }
            if (i != 0) {
            }
            C0184h4 c0184h42 = (C0184h4) obj;
            str2 = c0184h42.b;
            this.getClass();
            z = false;
            if (str2 == null) {
            }
            if (z) {
            }
        } catch (AbstractC0321w7 e) {
            return new InterfaceC0267q6.a(e);
        } catch (Exception e2) {
            return new InterfaceC0267q6.a(new AbstractC0321w7.f(e2));
        }
        m = new M(this, continuationImpl);
        Object obj2 = m.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = m.d;
    }
}
