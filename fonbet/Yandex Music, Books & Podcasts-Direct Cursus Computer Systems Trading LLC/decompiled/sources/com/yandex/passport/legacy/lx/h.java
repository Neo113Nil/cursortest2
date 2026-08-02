package com.yandex.passport.legacy.lx;

import androidx.core.app.q;
import com.yandex.passport.internal.methods.z5;

/* loaded from: classes4.dex */
public final class h extends z5 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ z5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(z5 z5Var, z5 z5Var2, Object obj, int i) {
        super(z5Var2);
        this.d = i;
        this.f = z5Var;
        this.e = obj;
    }

    @Override // com.yandex.passport.internal.methods.z5
    public final Object c() {
        switch (this.d) {
            case 0:
                Object call = ((i) this.f).d.call();
                b();
                z5 z5Var = (z5) ((com.yandex.passport.internal.network.requester.d) this.e).b(call);
                b();
                return z5Var.c();
            case 1:
                Object c = ((h) this.f).c();
                b();
                ((com.yandex.passport.internal.network.requester.d) this.e).mo1b(c);
                b();
                return c;
            default:
                Object call2 = ((i) this.f).d.call();
                b();
                Object b = ((q) this.e).b(call2);
                b();
                return b;
        }
    }
}
