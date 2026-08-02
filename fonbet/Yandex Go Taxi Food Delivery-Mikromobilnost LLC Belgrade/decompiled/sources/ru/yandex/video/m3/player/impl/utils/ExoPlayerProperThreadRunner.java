package ru.yandex.video.m3.player.impl.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.l9;
import defpackage.sls;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "", "Landroid/os/Looper;", "properLooper", "<init>", "(Landroid/os/Looper;)V", "", "throwable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "clientException", "Lzy11;", "joinStackTraces", "(Ljava/lang/Throwable;Ljava/lang/Exception;)V", "T", "Lkotlin/Function0;", "block", "runOnProperThread", "(Lsls;)Ljava/lang/Object;", "Landroid/os/Looper;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerProperThreadRunner {
    public static final int $stable = 8;
    private final Handler handler;
    private final Looper properLooper;

    public ExoPlayerProperThreadRunner(Looper looper) {
        this.properLooper = looper;
        this.handler = new Handler(looper);
    }

    private final void joinStackTraces(Throwable throwable, Exception clientException) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        int i = -1;
        int length = stackTrace.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (evu0.y(stackTrace[length].getClassName(), "ExoPlayerProperThreadRunner", false)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        if (i < 0) {
            return;
        }
        int length2 = clientException.getStackTrace().length + i + 1;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            stackTraceElementArr[i3] = null;
        }
        int i4 = i + 1;
        System.arraycopy(throwable.getStackTrace(), 0, stackTraceElementArr, 0, i4);
        System.arraycopy(clientException.getStackTrace(), 0, stackTraceElementArr, i4, clientException.getStackTrace().length);
        throwable.setStackTrace(stackTraceElementArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnProperThread$lambda$0(AtomicReference atomicReference, sls slsVar, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        try {
            atomicReference.set(slsVar.invoke());
        } catch (Throwable th) {
            try {
                atomicReference2.set(th);
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final <T> T runOnProperThread(sls block) {
        if (jl40.l(Looper.myLooper(), this.properLooper)) {
            return (T) block.invoke();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.handler.post(new l9(atomicReference, block, atomicReference2, countDownLatch, 12));
        countDownLatch.await();
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return (T) atomicReference.get();
        }
        joinStackTraces(th, new RuntimeException("Exception in runOnProperThread"));
        throw th;
    }
}
