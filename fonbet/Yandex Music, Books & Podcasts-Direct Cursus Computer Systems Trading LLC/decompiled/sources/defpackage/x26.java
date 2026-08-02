package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class x26 implements y26, suq {
    public final xdr a;

    public x26() {
        this.a = ydr.a(c5b.a);
    }

    @Override // defpackage.y26
    public boolean b() {
        return false;
    }

    @Override // defpackage.suq
    public void c(int i) {
        xdr xdrVar;
        Object value;
        List list;
        do {
            xdrVar = this.a;
            value = xdrVar.getValue();
            List list2 = (List) value;
            list = list2;
            if (i >= 0) {
                List list3 = list2;
                list = list2;
                if (i < list3.size()) {
                    ArrayList y0 = CollectionsKt.y0(list3);
                    kd6 kd6Var = (kd6) y0.get(i);
                    kd6Var.getClass();
                    y0.set(i, kd6.a(kd6Var, true));
                    list = y0;
                }
            }
        } while (!xdrVar.k(value, list));
    }

    @Override // defpackage.y26
    public void d(int i, h06 h06Var) {
        h06Var.getClass();
    }

    @Override // defpackage.suq
    public xdr e() {
        return this.a;
    }

    @Override // defpackage.suq
    public void f(int i) {
        xdr xdrVar;
        Object value;
        List list;
        do {
            xdrVar = this.a;
            value = xdrVar.getValue();
            List list2 = (List) value;
            list = list2;
            if (i >= 0) {
                List list3 = list2;
                list = list2;
                if (i < list3.size()) {
                    ArrayList y0 = CollectionsKt.y0(list3);
                    kd6 kd6Var = (kd6) y0.get(i);
                    kd6Var.getClass();
                    y0.set(i, kd6.a(kd6Var, false));
                    list = y0;
                }
            }
        } while (!xdrVar.k(value, list));
    }

    @Override // defpackage.y26
    public void g(boolean z, int i, String str, h06 h06Var) {
        str.getClass();
        h06Var.getClass();
    }

    @Override // defpackage.y26
    public vdr getState() {
        return this.a;
    }

    public x26(h36 h36Var) {
        this.a = ydr.a(h36Var);
    }

    @Override // defpackage.y26
    public void a(String str) {
    }
}
