package androidx.activity;

import O.C0337l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.O;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4459n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f4460u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i) {
        super(0);
        this.f4459n = i;
        this.f4460u = pVar;
    }

    @Override // I7.a
    public final Object invoke() {
        k kVar;
        switch (this.f4459n) {
            case 0:
                p pVar = this.f4460u;
                return new O(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
            case 1:
                this.f4460u.reportFullyDrawn();
                return u7.v.f41353a;
            case 2:
                p pVar2 = this.f4460u;
                kVar = pVar2.reportFullyDrawnExecutor;
                return new x(kVar, new o(pVar2, 1));
            default:
                p pVar3 = this.f4460u;
                G g4 = new G(new RunnableC0452d(pVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.h.a(Looper.myLooper(), Looper.getMainLooper())) {
                        pVar3.getLifecycle().a(new C0337l(1, g4, pVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new F.n(12, pVar3, g4));
                    }
                }
                return g4;
        }
    }
}
