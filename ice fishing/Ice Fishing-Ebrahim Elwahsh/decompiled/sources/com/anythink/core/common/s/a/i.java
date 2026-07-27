package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f16511a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f16512b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f16511a == null) {
            this.f16511a = new o(0, this, runnable);
            h.a().execute(this.f16511a);
        } else {
            if (this.f16512b == null) {
                this.f16512b = new o(0, this, runnable);
            }
        }
    }

    private Runnable a(Runnable runnable) {
        return new o(0, this, runnable);
    }

    private synchronized void a() {
        Runnable runnable = this.f16512b;
        this.f16511a = runnable;
        this.f16512b = null;
        if (runnable != null) {
            h.a().execute(this.f16511a);
        }
    }
}
