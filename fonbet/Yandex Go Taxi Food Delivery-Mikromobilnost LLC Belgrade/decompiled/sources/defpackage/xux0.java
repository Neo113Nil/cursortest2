package defpackage;

import com.yandex.go.taxi.order.superapp.orders.n;
import com.yandex.go.taxi.order.superapp.orders.v;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class xux0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xux0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        i2s0 i2s0Var;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                o820 o820Var = (o820) obj3;
                avx0 avx0Var = (avx0) obj2;
                if (o820Var != null && (i2s0Var = avx0Var.b) != null) {
                    i2s0Var.a(o820Var.b);
                    break;
                }
                break;
            default:
                ((v) obj3).b(((n) obj2).a(), (q6y0) obj);
                break;
        }
    }
}
