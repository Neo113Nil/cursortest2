package com.google.common.util.concurrent;

import androidx.tracing.Trace;
import com.google.zxing.BinaryBitmap;
import com.miteksystems.misnap.camera.a.n;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class ExecutionSequencer$TaskNonReentrantExecutor extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Executor delegate;
    public BinaryBitmap sequencer;
    public Thread submitting;
    public Runnable task;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ExecutionSequencer$RunningState.CANCELLED) {
            this.delegate = null;
            this.sequencer = null;
            return;
        }
        this.submitting = Thread.currentThread();
        try {
            BinaryBitmap binaryBitmap = this.sequencer;
            Objects.requireNonNull(binaryBitmap);
            n nVar = (n) binaryBitmap.matrix;
            if (((Thread) nVar.b) == this.submitting) {
                this.sequencer = null;
                Trace.checkState(((Runnable) nVar.c) == null);
                nVar.c = runnable;
                Executor executor = this.delegate;
                Objects.requireNonNull(executor);
                nVar.a = executor;
                this.delegate = null;
            } else {
                Executor executor2 = this.delegate;
                Objects.requireNonNull(executor2);
                this.delegate = null;
                this.task = runnable;
                executor2.execute(this);
            }
            this.submitting = null;
        } catch (Throwable th) {
            this.submitting = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.submitting) {
            Runnable runnable = this.task;
            Objects.requireNonNull(runnable);
            this.task = null;
            runnable.run();
            return;
        }
        n nVar = new n(5);
        nVar.b = currentThread;
        BinaryBitmap binaryBitmap = this.sequencer;
        Objects.requireNonNull(binaryBitmap);
        binaryBitmap.matrix = nVar;
        this.sequencer = null;
        try {
            Runnable runnable2 = this.task;
            Objects.requireNonNull(runnable2);
            this.task = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) nVar.c;
                if (runnable3 == null || (executor = (Executor) nVar.a) == null) {
                    break;
                }
                nVar.c = null;
                nVar.a = null;
                executor.execute(runnable3);
            }
        } finally {
            nVar.b = null;
        }
    }
}
