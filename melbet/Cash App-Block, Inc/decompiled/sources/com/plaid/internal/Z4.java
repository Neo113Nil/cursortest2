package com.plaid.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.C0095a6;
import java.lang.Thread;
import java.util.Locale;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;

/* loaded from: classes5.dex */
public final class Z4 {
    public final C0099b0 a;
    public final C0207k0 b;
    public final M2 c;

    public Z4(C0099b0 c0099b0, C0207k0 c0207k0, M2 m2) {
        c0099b0.getClass();
        c0207k0.getClass();
        m2.getClass();
        this.a = c0099b0;
        this.b = c0207k0;
        this.c = m2;
    }

    public static final void a(Z4 z4, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        z4.getClass();
        thread.getClass();
        th.getClass();
        Throwable cause = th.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = className.toLowerCase(locale);
                lowerCase.getClass();
                if (!StringsKt.contains((CharSequence) lowerCase, (CharSequence) "com.plaid", false)) {
                }
                try {
                    break;
                } catch (Exception e) {
                    C0095a6.a.a(C0095a6.a, e);
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    } else {
                        System.exit(2);
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("System.exit returned normally, while it was supposed to halt JVM.");
                        return;
                    }
                }
            }
        }
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        stackTrace2.getClass();
        for (StackTraceElement stackTraceElement2 : stackTrace2) {
            String className2 = stackTraceElement2.getClassName();
            className2.getClass();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase2 = className2.toLowerCase(locale2);
            lowerCase2.getClass();
            if (!StringsKt.contains((CharSequence) lowerCase2, (CharSequence) "com.plaid", false)) {
            }
            break;
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new Y4(z4, th, null));
            if (z4.c.a(th)) {
                return;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.exit(2);
            OptionalProvider$$ExternalSyntheticLambda0.m$1("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(new Z4$$ExternalSyntheticLambda1(this, Thread.getDefaultUncaughtExceptionHandler(), 0));
    }
}
