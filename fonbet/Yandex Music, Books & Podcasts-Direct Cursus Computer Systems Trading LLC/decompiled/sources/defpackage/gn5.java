package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gn5 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ hn5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn5(hn5 hn5Var, int i) {
        super(0);
        this.r = i;
        this.s = hn5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dn5 dn5Var;
        switch (this.r) {
            case 0:
                hn5 hn5Var = this.s;
                return new xoo(hn5Var.getApplication(), hn5Var, hn5Var.getIntent() != null ? hn5Var.getIntent().getExtras() : null);
            case 1:
                this.s.reportFullyDrawn();
                return Unit.a;
            case 2:
                hn5 hn5Var2 = this.s;
                dn5Var = hn5Var2.reportFullyDrawnExecutor;
                return new eyc(dn5Var, new gn5(hn5Var2, 1));
            case 3:
                hn5 hn5Var3 = this.s;
                qpj qpjVar = new qpj(new wm5(hn5Var3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                        hn5Var3.getLifecycle().a(new an5(0, qpjVar, hn5Var3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new qf0(12, hn5Var3, qpjVar));
                    }
                }
                return qpjVar;
            case 4:
                gfu defaultViewModelProviderFactory = this.s.getDefaultViewModelProviderFactory();
                defaultViewModelProviderFactory.getClass();
                return defaultViewModelProviderFactory;
            case 5:
                jfu viewModelStore = this.s.getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            default:
                is6 defaultViewModelCreationExtras = this.s.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                return defaultViewModelCreationExtras;
        }
    }
}
