package androidx.activity;

import O.C0350l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.O;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.i implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4574n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f4575u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i) {
        super(0);
        this.f4574n = i;
        this.f4575u = pVar;
    }

    @Override // E7.a
    public final Object invoke() {
        k kVar;
        switch (this.f4574n) {
            case 0:
                p pVar = this.f4575u;
                return new O(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
            case 1:
                this.f4575u.reportFullyDrawn();
                return q7.v.f40183a;
            case 2:
                p pVar2 = this.f4575u;
                kVar = pVar2.reportFullyDrawnExecutor;
                return new x(kVar, new o(pVar2, 1));
            default:
                p pVar3 = this.f4575u;
                G g9 = new G(new RunnableC0462d(pVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.h.a(Looper.myLooper(), Looper.getMainLooper())) {
                        pVar3.getLifecycle().a(new C0350l(1, g9, pVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new D5.b(12, pVar3, g9));
                    }
                }
                return g9;
        }
    }
}
