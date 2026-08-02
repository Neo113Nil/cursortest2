package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class pal implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ pal(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        jnb C;
        int i = this.a;
        int i2 = 0;
        a aVar = this.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                x97.y(wyf.F(aVar.getLifecycle()), null, null, new qal(aVar, objArr == true ? 1 : 0, i2), 3);
                break;
            case 1:
                int ordinal = ((ou0) obj).ordinal();
                if (ordinal == 0) {
                    View view = aVar.x;
                    if (view != null) {
                        view.setBackgroundResource(R.color.bg_primary_night);
                    }
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    View view2 = aVar.x;
                    if (view2 != null) {
                        view2.setBackgroundResource(R.color.bg_primary_day);
                    }
                }
                break;
            case 2:
                if (((aal) obj) == aal.b && !aVar.getIntent().getBooleanExtra("need_expand", false) && (C = aVar.C()) != null) {
                    nnb nnbVar = C.g;
                    gfo j = C.getJ();
                    fnb m = nnbVar.m();
                    uqi uqiVar = m instanceof uqi ? (uqi) m : null;
                    if (uqiVar != null) {
                        if (j != null) {
                            uqiVar.a = j;
                        }
                        gfo gfoVar = uqiVar.a;
                        gfoVar.getClass();
                        uqiVar.b = avf.G(gfoVar.a);
                    }
                }
                break;
            case 3:
                int i3 = TariffPaywallActivity.z;
                aVar.startActivity(dml.b(aVar, new lik(vik.f, null, null)));
                break;
            default:
                xdh xdhVar = aVar.E;
                if (xdhVar != null) {
                    x97.y((qyf) xdhVar.c, null, null, new g2l(xdhVar, objArr2 == true ? 1 : 0, 14), 3);
                }
                break;
        }
        return Unit.a;
    }
}
