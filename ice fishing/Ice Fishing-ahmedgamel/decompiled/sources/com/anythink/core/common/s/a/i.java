package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f17140a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f17141b;

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
        if (this.f17140a == null) {
            this.f17140a = new o(0, this, runnable);
            h.a().execute(this.f17140a);
        } else {
            if (this.f17141b == null) {
                this.f17141b = new o(0, this, runnable);
            }
        }
    }

    private Runnable a(Runnable runnable) {
        return new o(0, this, runnable);
    }

    private synchronized void a() {
        Runnable runnable = this.f17141b;
        this.f17140a = runnable;
        this.f17141b = null;
        if (runnable != null) {
            h.a().execute(this.f17140a);
        }
    }
}
