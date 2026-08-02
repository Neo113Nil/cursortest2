package com.yandex.music.shared.utils.assertions;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.vx7;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\"\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"", "throwable", "Lkotlin/Function0;", "", Constants.KEY_MESSAGE, "", "fail", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "throwException", "(Ljava/lang/Throwable;)V", "", "assertionsEnabled", "Z", "getAssertionsEnabled", "()Z", "setAssertionsEnabled", "(Z)V", "assertionsUncatchable", "getAssertionsUncatchable", "setAssertionsUncatchable", "Ljava/lang/Thread$UncaughtExceptionHandler;", "getAndroidExceptionPreHandler", "()Ljava/lang/Thread$UncaughtExceptionHandler;", "androidExceptionPreHandler", "shared-utils"}, k = 2, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class AssertionsKt {
    private static boolean assertionsEnabled = false;
    private static boolean assertionsUncatchable = true;

    @vx7
    public static final void fail(@NotNull Throwable th, @NotNull Function0<String> function0) {
        th.getClass();
        function0.getClass();
        String str = (String) function0.invoke();
        str.getClass();
        Assertions.throwOrSkip$default(new FailedAssertionException(str, th), null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r1.getModifiers()) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Thread.UncaughtExceptionHandler getAndroidExceptionPreHandler() {
        Method method;
        try {
            method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(method.getModifiers())) {
            }
        } catch (Throwable unused) {
        }
        method = null;
        Object invoke = method != null ? method.invoke(null, null) : null;
        if (invoke instanceof Thread.UncaughtExceptionHandler) {
            return (Thread.UncaughtExceptionHandler) invoke;
        }
        return null;
    }

    public static final boolean getAssertionsEnabled() {
        return assertionsEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void throwException(Throwable th) {
        if (!assertionsUncatchable) {
            throw th;
        }
        Thread currentThread = Thread.currentThread();
        try {
            Thread.UncaughtExceptionHandler androidExceptionPreHandler = getAndroidExceptionPreHandler();
            if (androidExceptionPreHandler != null) {
                androidExceptionPreHandler.uncaughtException(currentThread, th);
            }
        } catch (Throwable unused) {
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
