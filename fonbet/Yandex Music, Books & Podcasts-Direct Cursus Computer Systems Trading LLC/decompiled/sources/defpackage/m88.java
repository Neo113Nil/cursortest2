package defpackage;

import android.app.Activity;
import com.yandex.plus.home.t;
import com.yandex.plus.paymentsdk.internal.method.e;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public final class m88 {
    public final jyr a;

    public m88(h4d h4dVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, jyr jyrVar6, jyr jyrVar7) {
        drt drtVar;
        this.a = jyrVar3;
        boolean z = false;
        hld.s(new rjq(false), dm6.b());
        hld.s(new rjq(false), dm6.b());
        yxc yxcVar = (yxc) x97.D(g.a, new r1w(this, null, 6));
        boolean booleanValue = ((Boolean) ((tiw) jyrVar6.getValue()).a.getValue()).booleanValue();
        boolean z2 = (yxcVar == null || (drtVar = yxcVar.a) == null || !drtVar.d) ? false : true;
        if (yxcVar != null && yxcVar.g) {
            z = true;
        }
        ydr.a(new yqw(z2, z, ((z66) jyrVar5.getValue()).g(), booleanValue));
    }

    public Object a(List list, nvl nvlVar, cg6 cg6Var) {
        Object b = ((pi4) this.a.getValue()).b(list, nvlVar, cg6Var);
        return b == nm6.a ? b : Unit.a;
    }

    public m88(Activity activity) {
        activity.getClass();
        this.a = btf.b(new aw5(18, activity, this));
    }

    public m88(hn5 hn5Var, t tVar, e eVar) {
        this.a = btf.b(new cte(16, tVar, hn5Var, eVar));
    }

    public m88() {
        this.a = l18.b.b(hag.I(cjl.class), true);
    }

    public m88(jyr jyrVar) {
        this.a = jyrVar;
    }
}
