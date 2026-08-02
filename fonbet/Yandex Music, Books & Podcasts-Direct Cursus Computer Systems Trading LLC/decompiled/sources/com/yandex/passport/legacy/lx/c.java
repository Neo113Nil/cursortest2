package com.yandex.passport.legacy.lx;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.b;
                eVar.b();
                return eVar.e.c();
            default:
                ((Runnable) this.b).run();
                return null;
        }
    }
}
