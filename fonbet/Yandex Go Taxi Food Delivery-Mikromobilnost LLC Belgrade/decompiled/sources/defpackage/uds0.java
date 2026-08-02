package defpackage;

import com.yandex.messaging.domain.SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.domain.SimpleUseCase$perform$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.domain.k;

/* loaded from: classes15.dex */
public final class uds0 implements e1k {
    public final /* synthetic */ int a = 1;
    public final pzt0 b;
    public final /* synthetic */ Object c;

    public uds0(ike ikeVar, e9e e9eVar, k kVar, Object obj) {
        this.c = obj;
        this.b = tje.N(ikeVar, null, null, new SimpleUseCase$perform$$inlined$suspendDisposable$1$1(null, e9eVar, kVar, obj), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.b.a(null);
                break;
            default:
                this.b.a(null);
                break;
        }
    }

    public uds0(tse tseVar, vds0 vds0Var, Object obj, e9e e9eVar) {
        this.c = obj;
        this.b = tje.N(tseVar, null, null, new SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1(null, vds0Var, obj, e9eVar), 3);
    }
}
