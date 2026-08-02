package defpackage;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class rci {
    public final xdh a;
    public final List b;
    public final List c;
    public final qci d;

    public rci(xdh xdhVar, ArrayList arrayList, List list) {
        arrayList.getClass();
        list.getClass();
        this.a = xdhVar;
        this.b = arrayList;
        this.c = list;
        this.d = new qci(this);
    }

    public final Object a(lm4 lm4Var, Object obj) {
        obj.getClass();
        Class b = lm4Var.b();
        b.getClass();
        if (!b.isInterface()) {
            xq0.q("Check failed.");
            return null;
        }
        Class b2 = lm4Var.b();
        b2.getClass();
        w4i w4iVar = new w4i(2, this.d, qci.class, "adapt", "adapt(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/String;", 0, 3);
        List list = this.c;
        list.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(b2.getClassLoader(), new Class[]{b2}, new cj2(b2, obj, this.a, w4iVar, list));
        newProxyInstance.getClass();
        return newProxyInstance;
    }
}
