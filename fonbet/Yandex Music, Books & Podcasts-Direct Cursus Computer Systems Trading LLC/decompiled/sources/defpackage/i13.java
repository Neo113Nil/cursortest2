package defpackage;

import com.yandex.payment.sdk.ui.payment.sbp.BindSbpActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class i13 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ BindSbpActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i13(BindSbpActivity bindSbpActivity, int i) {
        super(0);
        this.r = i;
        this.s = bindSbpActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        BindSbpActivity bindSbpActivity = this.s;
        switch (i) {
            case 0:
                int i2 = ddu.o;
                a6p a6pVar = new a6p(bindSbpActivity.l().c());
                jfu viewModelStore = bindSbpActivity.getViewModelStore();
                is6 defaultViewModelCreationExtras = bindSbpActivity.getDefaultViewModelCreationExtras();
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
                return ((nhk) bindSbpActivity.D()).e;
            case 2:
                return ((nhk) bindSbpActivity.D()).f;
            default:
                p77 l = bindSbpActivity.l();
                return new q77(l.a, new j6e(new ehk(""), (xwj) null));
        }
    }
}
