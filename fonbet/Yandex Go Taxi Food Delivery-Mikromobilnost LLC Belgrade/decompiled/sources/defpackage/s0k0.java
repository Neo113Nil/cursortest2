package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class s0k0 {
    public xf7 a;
    public kwu b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final void a(yme ymeVar) {
        Objects.requireNonNull(ymeVar, "factory == null");
        this.c.add(ymeVar);
    }

    public final void b(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        jwu jwuVar = new jwu();
        jwuVar.i(null, str);
        kwu e = jwuVar.e();
        if ("".equals(e.f.get(r0.size() - 1))) {
            this.b = e;
        } else {
            kbs.f(e, "baseUrl must end in /: ");
        }
    }

    public final t0k0 c() {
        if (this.b == null) {
            ny61.r("Base URL required.");
            return null;
        }
        xf7 xf7Var = this.a;
        if (xf7Var == null) {
            xf7Var = new OkHttpClient();
        }
        xf7 xf7Var2 = xf7Var;
        ua2 ua2Var = cvc0.a;
        kl40 kl40Var = cvc0.c;
        ArrayList arrayList = new ArrayList(this.d);
        List h = kl40Var.h(ua2Var);
        arrayList.addAll(h);
        List i = kl40Var.i();
        int size = i.size();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new dt6(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(i);
        kwu kwuVar = this.b;
        List unmodifiableList = Collections.unmodifiableList(arrayList3);
        List unmodifiableList2 = Collections.unmodifiableList(arrayList);
        h.size();
        return new t0k0(xf7Var2, kwuVar, unmodifiableList, unmodifiableList2, ua2Var);
    }
}
