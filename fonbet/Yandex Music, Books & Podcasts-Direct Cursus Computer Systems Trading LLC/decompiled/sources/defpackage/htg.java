package defpackage;

import com.yandex.passport.api.h;
import com.yandex.passport.api.n;
import com.yandex.passport.api.q;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.properties.k;
import com.yandex.passport.internal.properties.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class htg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ htg(z1 z1Var, int i) {
        this.a = i;
        this.b = z1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                z1 z1Var = this.b;
                k kVar = (k) obj;
                kVar.getClass();
                kVar.h = z1Var;
                j jVar = new j();
                l18 l18Var = l18.b;
                bdt I = hag.I(le7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str = r9k.PRODUCTION.a;
                q qVar = h.b;
                int parseInt = Integer.parseInt(str);
                qVar.getClass();
                h a = q.a(parseInt);
                if (a == null) {
                    xq0.x("Required value was null.");
                    return null;
                }
                jVar.a = a;
                jVar.y(n.CHILDISH);
                kVar.b = jVar.l();
                return Unit.a;
            default:
                ((s) obj).getClass();
                if (pd.M()) {
                    y1 y1Var = y1.b;
                } else {
                    y1 y1Var2 = y1.a;
                }
                return Unit.a;
        }
    }
}
