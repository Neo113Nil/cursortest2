package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class zqb0 {
    public final lei a;
    public final r0 b = bvf0.c(Boolean.FALSE);

    public zqb0(lei leiVar) {
        this.a = leiVar;
    }

    public final void a(int i) {
        Object value;
        List list;
        Object value2;
        lei leiVar = this.a;
        if (i == 0) {
            r0 r0Var = leiVar.a;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, kei.e));
            return;
        }
        int i2 = i - 1;
        r0 r0Var2 = leiVar.b;
        do {
            value = r0Var2.getValue();
            List list2 = (List) value;
            if (i2 < 0 || i2 >= list2.size()) {
                jgz jgzVar = jgz.a;
                jgz.a("Wrong destination index", new Object[0]);
                return;
            } else if (list2.size() > 1) {
                ArrayList arrayList = new ArrayList(list2);
                arrayList.remove(i2);
                list = arrayList;
            } else {
                list = Collections.singletonList(kei.f);
            }
        } while (!r0Var2.k(value, list));
    }

    public final void b(int i, oo0 oo0Var) {
        r0 r0Var;
        Object value;
        Object value2;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.FALSE));
        lei leiVar = this.a;
        if (i != 0) {
            leiVar.a(i - 1, oo0Var);
            return;
        }
        r0 r0Var2 = leiVar.a;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, kei.a((kei) value2, oo0Var, null, null, 13)));
    }

    public final void c(int i, s9e s9eVar) {
        r0 r0Var;
        Object value;
        Object value2;
        ArrayList arrayList;
        Object value3;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.FALSE));
        lei leiVar = this.a;
        if (i == 0) {
            r0 r0Var2 = leiVar.a;
            do {
                value3 = r0Var2.getValue();
            } while (!r0Var2.k(value3, kei.a((kei) value3, null, s9eVar, null, 11)));
            return;
        }
        int i2 = i - 1;
        r0 r0Var3 = leiVar.b;
        do {
            value2 = r0Var3.getValue();
            List list = (List) value2;
            if (y6i0.d(i2, 0, list.size()) == list.size()) {
                arrayList = new ArrayList(list);
                arrayList.add(kei.a(kei.f, null, s9eVar, null, 11));
            } else {
                arrayList = new ArrayList(list);
                arrayList.set(i2, kei.a((kei) arrayList.get(i2), null, s9eVar, null, 11));
            }
        } while (!r0Var3.k(value2, arrayList));
    }
}
