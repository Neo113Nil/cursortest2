package defpackage;

import com.apollographql.apollo3.network.http.c;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qo2 implements Closeable {
    public final c a;
    public final com.apollographql.apollo3.api.c b;
    public final x160 c;
    public final ArrayList w;
    public final tko x;
    public final zwd y;
    public final wv50 z;

    public qo2(c cVar, com.apollographql.apollo3.api.c cVar2, x160 x160Var, ArrayList arrayList, ovn ovnVar) {
        this.a = cVar;
        this.b = cVar2;
        this.c = x160Var;
        this.w = arrayList;
        this.x = ovnVar;
        mdh mdhVar = vyj.a;
        this.y = new zwd(mdhVar, bvf0.a(mdhVar));
        this.z = new wv50(cVar, x160Var, mdhVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bvf0.j(this.y.a, null);
        this.a.dispose();
        this.c.dispose();
    }
}
