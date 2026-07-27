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
    private static final String f14429a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f14430b;

    /* renamed from: c, reason: collision with root package name */
    private volatile z f14431c;

    /* renamed from: d, reason: collision with root package name */
    private volatile z f14432d;

    /* renamed from: e, reason: collision with root package name */
    private final k f14433e = new k(10, TimeUnit.MINUTES);

    public static class a implements q {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.core.common.m.a.d f14434b;

        public a(com.anythink.core.common.m.a.d dVar) {
            this.f14434b = dVar;
        }

        @Override // com.anythink.core.common.n.b.q
        public final List<InetAddress> lookup(String str) {
            com.anythink.core.common.m.a.d dVar = this.f14434b;
            return dVar != null ? dVar.a(str) : q.f15708a.lookup(str);
        }
    }

    private d() {
    }

    public static d a() {
        if (f14430b == null) {
            synchronized (d.class) {
                try {
                    if (f14430b == null) {
                        f14430b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14430b;
    }

    public final synchronized z a(com.anythink.core.common.m.a.f fVar, i iVar) {
        z zVar;
        try {
            com.anythink.core.common.m.a.d dVar = fVar.i;
            if (dVar != null) {
                if (this.f14432d == null) {
                    this.f14432d = new z.a().c(fVar.f14446c, fVar.f14447d).b(fVar.f14444a, fVar.f14445b).a(fVar.f14448e, fVar.f14449f).a(this.f14433e).a(new p(fVar.f14450g)).a(new a(dVar)).a();
                } else {
                    this.f14432d = this.f14432d.t().a(new a(dVar)).a();
                }
                zVar = this.f14432d;
                String str = iVar.f14462a;
            } else {
                zVar = null;
            }
            if (zVar == null) {
                if (this.f14431c == null) {
                    this.f14431c = new z.a().c(fVar.f14446c, fVar.f14447d).b(fVar.f14444a, fVar.f14445b).a(fVar.f14448e, fVar.f14449f).a(this.f14433e).a(new p(fVar.f14450g)).a();
                }
                zVar = this.f14431c;
                String str2 = iVar.f14462a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zVar;
    }
}
