package defpackage;

import com.yandex.go.address.models.PlainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class tit0 {
    public PlainAddress a;
    public pv0 b;
    public oce0 c;
    public mq40 d;
    public gmb0 e;
    public List f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public zzs l;
    public boolean m;
    public jr40 n;
    public wq40 o;
    public jr40 p;
    public wq40 q;

    public tit0() {
        mq40 mq40Var = mq40.f;
        this.d = mq40.f;
        this.f = EmptyList.a;
    }

    public final ArrayList a() {
        List list = this.d.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((jr40) it.next()).c, arrayList);
        }
        return arrayList;
    }

    public final Pair b(wpb0 wpb0Var) {
        jr40 jr40Var;
        wq40 wq40Var;
        mq40 mq40Var = this.d;
        String str = wpb0Var.a;
        Iterator it = mq40Var.a.iterator();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            jr40Var = (jr40) it.next();
            Iterator it2 = jr40Var.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((wq40) next).b().equals(str)) {
                    obj = next;
                    break;
                }
            }
            wq40Var = (wq40) obj;
        } while (wq40Var == null);
        return new Pair(jr40Var, wq40Var);
    }

    public final boolean c() {
        return !this.d.a.isEmpty();
    }
}
