package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class uao {
    public final ptk a;
    public ds3 b;
    public u7e c;
    public final ArrayList d;
    public final ArrayList e;
    public gx0 f;

    public uao() {
        ptk ptkVar = ptk.b;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = ptkVar;
    }

    public final void a(uj6 uj6Var) {
        Objects.requireNonNull(uj6Var, "factory == null");
        this.d.add(uj6Var);
    }

    public final void b(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        s7e s7eVar = new s7e();
        s7eVar.h(null, str);
        u7e e = s7eVar.e();
        if ("".equals(e.f.get(r0.size() - 1))) {
            this.c = e;
        } else {
            kac.j(e, "baseUrl must end in /: ");
        }
    }

    public final vao c() {
        if (this.c == null) {
            xq0.q("Base URL required.");
            return null;
        }
        ds3 ds3Var = this.b;
        if (ds3Var == null) {
            ds3Var = new OkHttpClient();
        }
        ds3 ds3Var2 = ds3Var;
        Executor executor = this.f;
        ptk ptkVar = this.a;
        if (executor == null) {
            executor = ptkVar.a();
        }
        Executor executor2 = executor;
        ArrayList arrayList = new ArrayList(this.e);
        ptkVar.getClass();
        arrayList.addAll(Arrays.asList(im5.a, new nk7(executor2)));
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 2);
        qj3 qj3Var = new qj3();
        qj3Var.a = true;
        arrayList3.add(qj3Var);
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(Collections.singletonList(nwj.b));
        return new vao(ds3Var2, this.c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executor2);
    }
}
