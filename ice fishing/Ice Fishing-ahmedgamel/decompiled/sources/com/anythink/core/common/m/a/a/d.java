package com.anythink.core.common.m.a.a;

import com.anythink.core.common.m.a.i;
import com.anythink.core.common.n.b.k;
import com.anythink.core.common.n.b.p;
import com.anythink.core.common.n.b.q;
import com.anythink.core.common.n.b.z;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15215a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f15216b;

    /* renamed from: c, reason: collision with root package name */
    private volatile z f15217c;

    /* renamed from: d, reason: collision with root package name */
    private volatile z f15218d;

    /* renamed from: e, reason: collision with root package name */
    private final k f15219e = new k(10, TimeUnit.MINUTES);

    public static class a implements q {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.core.common.m.a.d f15220b;

        public a(com.anythink.core.common.m.a.d dVar) {
            this.f15220b = dVar;
        }

        @Override // com.anythink.core.common.n.b.q
        public final List<InetAddress> lookup(String str) {
            com.anythink.core.common.m.a.d dVar = this.f15220b;
            return dVar != null ? dVar.a(str) : q.f16495a.lookup(str);
        }
    }

    private d() {
    }

    public static d a() {
        if (f15216b == null) {
            synchronized (d.class) {
                try {
                    if (f15216b == null) {
                        f15216b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15216b;
    }

    public final synchronized z a(com.anythink.core.common.m.a.f fVar, i iVar) {
        z zVar;
        try {
            com.anythink.core.common.m.a.d dVar = fVar.i;
            if (dVar != null) {
                if (this.f15218d == null) {
                    this.f15218d = new z.a().c(fVar.f15232c, fVar.f15233d).b(fVar.f15230a, fVar.f15231b).a(fVar.f15234e, fVar.f15235f).a(this.f15219e).a(new p(fVar.f15236g)).a(new a(dVar)).a();
                } else {
                    this.f15218d = this.f15218d.t().a(new a(dVar)).a();
                }
                zVar = this.f15218d;
                String str = iVar.f15248a;
            } else {
                zVar = null;
            }
            if (zVar == null) {
                if (this.f15217c == null) {
                    this.f15217c = new z.a().c(fVar.f15232c, fVar.f15233d).b(fVar.f15230a, fVar.f15231b).a(fVar.f15234e, fVar.f15235f).a(this.f15219e).a(new p(fVar.f15236g)).a();
                }
                zVar = this.f15217c;
                String str2 = iVar.f15248a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zVar;
    }
}
