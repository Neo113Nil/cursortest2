package com.datadog.android.internal.utils;

import android.os.Build;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.Thread;

/* loaded from: classes4.dex */
public abstract class ThreadExtKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thread.State.values().length];
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String asString(Thread.State state) {
        state.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "blocked";
            case 3:
                return "runnable";
            case 4:
                return "terminated";
            case 5:
                return "timed_waiting";
            case 6:
                return "waiting";
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static final long safeGetThreadId(Thread thread) {
        thread.getClass();
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }
}
