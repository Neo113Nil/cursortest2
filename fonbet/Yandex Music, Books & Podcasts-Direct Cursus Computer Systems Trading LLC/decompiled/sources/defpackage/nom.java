package defpackage;

import android.content.Intent;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class nom extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ PreselectActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nom(PreselectActivity preselectActivity, int i) {
        super(0);
        this.r = i;
        this.s = preselectActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        PreselectActivity preselectActivity = this.s;
        switch (i) {
            case 0:
                int i2 = ddu.o;
                a6p a6pVar = new a6p(preselectActivity.l().c());
                jfu viewModelStore = preselectActivity.getViewModelStore();
                is6 defaultViewModelCreationExtras = preselectActivity.getDefaultViewModelCreationExtras();
                viewModelStore.getClass();
                defaultViewModelCreationExtras.getClass();
                bjt bjtVar = new bjt(viewModelStore, a6pVar, defaultViewModelCreationExtras);
                lm4 a = ern.a(u8q.class);
                String f = a.f();
                if (f != null) {
                    return (u8q) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                }
                xq0.x("Local and anonymous classes can not be ViewModels");
                return null;
            case 1:
                rk7 rk7Var = new rk7();
                rk7Var.a(p77.class, preselectActivity.l());
                rk7Var.a(s77.class, (s77) preselectActivity.b.getValue());
                Intent intent = preselectActivity.getIntent();
                intent.getClass();
                q77 Q = preselectActivity.Q(intent);
                if (Q != null) {
                    rk7Var.a(q77.class, Q);
                }
                return rk7Var;
            case 2:
                return ((ohk) preselectActivity.D()).d;
            default:
                return ((ohk) preselectActivity.D()).e;
        }
    }
}
