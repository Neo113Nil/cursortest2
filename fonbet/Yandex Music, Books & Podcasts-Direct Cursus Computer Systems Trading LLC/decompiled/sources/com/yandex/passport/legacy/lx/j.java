package com.yandex.passport.legacy.lx;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class j {
    public boolean a;
    public Future b;
    public e c;

    public final void a() {
        if (!this.a) {
            this.b.cancel(this.c.a());
        }
        this.a = true;
    }
}
