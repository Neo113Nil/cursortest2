package defpackage;

import com.yandex.payment.common.result.ResultType;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;

/* loaded from: classes2.dex */
public final class qs20 {
    public final e100 a;
    public final rwo b;

    public qs20(e100 e100Var, rwo rwoVar) {
        this.a = e100Var;
        this.b = rwoVar;
    }

    public final md51 a(tv5 tv5Var) {
        g700 g700Var = new g700(20, this, tv5Var);
        final int i = 1;
        Object obj = null;
        kdd0 kdd0Var = new kdd0((Object) 3, (Object) new bzd0(c.a(1000), i), obj, obj);
        final we6 we6Var = new we6(this.b);
        md51 f = new d2e0(new g700(25, we6Var, g700Var), new ps20(9), kdd0Var).b().f(new ps20(10));
        final int i2 = 0;
        f.h(new tls() { // from class: yt20
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                we6 we6Var2 = we6Var;
                switch (i3) {
                    case 0:
                        we6Var2.d("success");
                        break;
                    default:
                        we6Var2.d(ResultType.RESULT_TYPE_FAILURE);
                        break;
                }
                return zy11Var;
            }
        }).b(new tls() { // from class: yt20
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                we6 we6Var2 = we6Var;
                switch (i3) {
                    case 0:
                        we6Var2.d("success");
                        break;
                    default:
                        we6Var2.d(ResultType.RESULT_TYPE_FAILURE);
                        break;
                }
                return zy11Var;
            }
        });
        return f;
    }

    public final md51 b(r45 r45Var) {
        return this.a.f(r45Var, new rv10(21), NetworkServiceRetryingStrategy.noRetry);
    }
}
