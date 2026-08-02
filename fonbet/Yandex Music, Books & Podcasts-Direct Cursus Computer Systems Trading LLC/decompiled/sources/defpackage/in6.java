package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class in6 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk0 b;

    public /* synthetic */ in6(fk0 fk0Var, int i) {
        this.a = i;
        this.b = fk0Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        fk0 fk0Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                yci o = d.o(vci.a, 32, 40);
                oq5 oq5Var = (oq5) ((hq5) obj2);
                boolean h = oq5Var.h(fk0Var);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new gn6(fk0Var, 1);
                    oq5Var.k0(K);
                }
                irf.r(a0g.E(R.drawable.ic_video_shot_big_32, 0, oq5Var), null, wyf.s(o, (Function0) K), null, null, 0.0f, new d43(d85.f, 5), oq5Var, 1572912, 56);
                return Unit.a;
            default:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                ga6 ga6Var = (ga6) obj3;
                mfhVar.getClass();
                ffhVar.getClass();
                return mfh.m0(mfhVar, ga6.i(ga6Var.a), eeh.b(((Number) fk0Var.e()).floatValue() * r14.b), new zj(ffhVar.M(ga6Var.a), 6));
        }
    }
}
