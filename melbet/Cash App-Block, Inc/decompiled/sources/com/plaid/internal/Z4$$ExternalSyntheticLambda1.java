package com.plaid.internal;

import androidx.appcompat.widget.TintInfo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.Thread;

/* loaded from: classes5.dex */
public final /* synthetic */ class Z4$$ExternalSyntheticLambda1 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Thread.UncaughtExceptionHandler f$1;

    public /* synthetic */ Z4$$ExternalSyntheticLambda1(Object obj, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.$r8$classId;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Z4.a((Z4) obj, uncaughtExceptionHandler, thread, th);
                break;
            default:
                th.getClass();
                ((TintInfo) obj).recordError(th);
                if (uncaughtExceptionHandler == null) {
                    System.exit(1);
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("System.exit returned normally, while it was supposed to halt JVM.");
                    break;
                } else {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    break;
                }
        }
    }
}
