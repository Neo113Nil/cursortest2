package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.lang.Thread;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Thread implements JsonStream.Streamable {
    public final ThreadInternal impl;
    public final Logger logger;

    /* renamed from: com.bugsnag.android.Thread$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$lang$Thread$State;

        static {
            int[] iArr = new int[Thread.State.values().length];
            $SwitchMap$java$lang$Thread$State = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$lang$Thread$State[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public Thread(String str, String str2, ErrorType errorType, int i, Logger logger) {
        this.impl = new ThreadInternal(str, str2, errorType, false, Thread$State$EnumUnboxingLocalUtility.getDescriptor(i), new Stacktrace(new ArrayList()));
        this.logger = logger;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }

    public Thread(String str, String str2, ErrorType errorType, boolean z, int i, Stacktrace stacktrace, Logger logger) {
        this.impl = new ThreadInternal(str, str2, errorType, z, Thread$State$EnumUnboxingLocalUtility.getDescriptor(i), stacktrace);
        this.logger = logger;
    }

    public Thread(ThreadInternal threadInternal, Logger logger) {
        this.impl = threadInternal;
        this.logger = logger;
    }
}
