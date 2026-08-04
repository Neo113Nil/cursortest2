package com.gamericefishpro.space.s5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Executor {
    public final /* synthetic */ int d;
    public final ArrayDeque e;
    public final Executor i;
    public Runnable v;
    public final Object w;

    public y(Executor executor, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.i = executor;
                this.e = new ArrayDeque();
                this.w = new Object();
                break;
            default:
                Intrinsics.checkNotNullParameter(executor, "executor");
                this.i = executor;
                this.e = new ArrayDeque();
                this.w = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                synchronized (this.w) {
                    try {
                        Object objPoll = this.e.poll();
                        Runnable runnable = (Runnable) objPoll;
                        this.v = runnable;
                        if (objPoll != null) {
                            this.i.execute(runnable);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.e.poll();
                this.v = runnable2;
                if (runnable2 != null) {
                    this.i.execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(command, "command");
                synchronized (this.w) {
                    try {
                        this.e.offer(new com.gamericefishpro.space.bb.h(10, command, this));
                        if (this.v == null) {
                            a();
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.w) {
                    try {
                        this.e.add(new com.gamericefishpro.space.r9.l(7, this, command, false));
                        if (this.v == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}
