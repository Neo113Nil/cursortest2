package com.google.common.util.concurrent;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import kotlin.io.ByteStreamsKt;

/* loaded from: classes.dex */
public abstract class InterruptibleTask extends AtomicReference implements Runnable {
    public static final EmojiCompatInitializer.LoadEmojiCompatRunnable DONE;
    public static final EmojiCompatInitializer.LoadEmojiCompatRunnable PARKED;

    /* loaded from: classes4.dex */
    public final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        public final InterruptibleTask task;

        public Blocker(InterruptibleTask interruptibleTask) {
            this.task = interruptibleTask;
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.task.toString();
        }
    }

    static {
        int i = 1;
        DONE = new EmojiCompatInitializer.LoadEmojiCompatRunnable(i);
        PARKED = new EmojiCompatInitializer.LoadEmojiCompatRunnable(i);
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th);

    public abstract void afterRanInterruptiblySuccess(Object obj);

    public final void interruptTask() {
        EmojiCompatInitializer.LoadEmojiCompatRunnable loadEmojiCompatRunnable = PARKED;
        EmojiCompatInitializer.LoadEmojiCompatRunnable loadEmojiCompatRunnable2 = DONE;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker(this);
            blocker.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(loadEmojiCompatRunnable2)) == loadEmojiCompatRunnable) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean isDone();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean isDone = isDone();
            EmojiCompatInitializer.LoadEmojiCompatRunnable loadEmojiCompatRunnable = DONE;
            if (!isDone) {
                try {
                    obj = runInterruptibly();
                } catch (Throwable th) {
                    try {
                        ByteStreamsKt.restoreInterruptIfIsInterruptedException(th);
                        if (!compareAndSet(currentThread, loadEmojiCompatRunnable)) {
                            waitForInterrupt(currentThread);
                        }
                        if (isDone) {
                            return;
                        }
                        afterRanInterruptiblyFailure(th);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, loadEmojiCompatRunnable)) {
                            waitForInterrupt(currentThread);
                        }
                        if (!isDone) {
                            afterRanInterruptiblySuccess(null);
                        }
                    }
                }
            }
        }
    }

    public abstract Object runInterruptibly();

    public abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ", ");
        m108m.append(toPendingString());
        return m108m.toString();
    }

    public final void waitForInterrupt(Thread thread) {
        Runnable runnable = (Runnable) get();
        Blocker blocker = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof Blocker;
            EmojiCompatInitializer.LoadEmojiCompatRunnable loadEmojiCompatRunnable = PARKED;
            if (!z2 && runnable != loadEmojiCompatRunnable) {
                break;
            }
            if (z2) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == loadEmojiCompatRunnable || compareAndSet(runnable, loadEmojiCompatRunnable)) {
                z = Thread.interrupted() || z;
                LockSupport.park(blocker);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }
}
