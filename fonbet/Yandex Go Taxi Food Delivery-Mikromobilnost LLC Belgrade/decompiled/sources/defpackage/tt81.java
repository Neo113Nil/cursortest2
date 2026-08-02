package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import yads.p93;

/* loaded from: classes7.dex */
public final class tt81 extends vi71 {
    public final au81 x;
    public final a081 y;

    public tt81(au81 au81Var, vi71 vi71Var, a081 a081Var, d881 d881Var) {
        super(vi71Var, d881Var);
        this.x = au81Var;
        this.y = a081Var;
    }

    @Override // defpackage.vi71
    public final te81 e(Context context, int i, boolean z) {
        a081 a081Var = this.y;
        gg81 a = a081Var.a(context);
        te81 e = a != null ? a.p : true ? super.e(context, i, z) : new f881();
        if (!(e instanceof f881)) {
            return e;
        }
        ArrayList arrayList = this.x.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof va81) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                va81 va81Var = (va81) it2.next();
                vi71 vi71Var = va81Var.d;
                hlx0 hlx0Var = va81Var.e;
                gg81 a2 = a081Var.a(context);
                boolean z2 = a2 != null ? a2.p : true;
                Iterator it3 = ((ArrayList) hlx0Var.c).iterator();
                while (it3.hasNext()) {
                    int i2 = z2 ? ((qt81) it3.next()).c : i;
                    if ((z ? vi71Var.e(context, i2, true) : vi71Var.e(context, i2, false)) instanceof a581) {
                        break;
                    }
                }
                return e;
            }
        }
        return new a581(p93.d, null, null);
    }
}
