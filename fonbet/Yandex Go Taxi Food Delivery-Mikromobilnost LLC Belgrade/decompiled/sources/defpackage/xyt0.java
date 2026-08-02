package defpackage;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes9.dex */
public abstract class xyt0 {
    public static final /* synthetic */ int a = 0;

    static {
        Object failure;
        Object failure2;
        new v73();
        v73.a();
        try {
            failure = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            failure2 = xyt0.class.getCanonicalName();
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        if (Result.a(failure2) != null) {
            failure2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
