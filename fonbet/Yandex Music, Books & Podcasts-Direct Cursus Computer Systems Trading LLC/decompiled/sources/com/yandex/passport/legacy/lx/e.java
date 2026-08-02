package com.yandex.passport.legacy.lx;

import android.os.Handler;
import android.os.Looper;
import com.yandex.passport.internal.methods.z5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class e extends z5 {
    public static final ExecutorService f = Executors.newCachedThreadPool();
    public final Handler d;
    public final z5 e;

    public e(z5 z5Var) {
        super(z5Var);
        this.d = new Handler(Looper.getMainLooper());
        this.e = z5Var;
    }

    @Override // com.yandex.passport.internal.methods.z5
    public final Object c() {
        return this.e.c();
    }

    public final j h(a aVar, a aVar2) {
        j jVar = new j();
        jVar.c = this;
        int i = 0;
        jVar.b = f.submit(new d(i, new b(this, jVar, aVar, 0), new c(0, this), new b(this, jVar, aVar2, 1)));
        return jVar;
    }
}
