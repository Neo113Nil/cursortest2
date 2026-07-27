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
    private static final String f14586a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f14587b;

    /* renamed from: c, reason: collision with root package name */
    private volatile z f14588c;

    /* renamed from: d, reason: collision with root package name */
    private volatile z f14589d;

    /* renamed from: e, reason: collision with root package name */
    private final k f14590e = new k(10, TimeUnit.MINUTES);

    public static class a implements q {

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.core.common.m.a.d f14591b;

        public a(com.anythink.core.common.m.a.d dVar) {
            this.f14591b = dVar;
        }

        @Override // com.anythink.core.common.n.b.q
        public final List<InetAddress> lookup(String str) {
            com.anythink.core.common.m.a.d dVar = this.f14591b;
            return dVar != null ? dVar.a(str) : q.f15866a.lookup(str);
        }
    }

    private d() {
    }

    public static d a() {
        if (f14587b == null) {
            synchronized (d.class) {
                try {
                    if (f14587b == null) {
                        f14587b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14587b;
    }

    public final synchronized z a(com.anythink.core.common.m.a.f fVar, i iVar) {
        z zVar;
        try {
            com.anythink.core.common.m.a.d dVar = fVar.i;
            if (dVar != null) {
                if (this.f14589d == null) {
                    this.f14589d = new z.a().c(fVar.f14603c, fVar.f14604d).b(fVar.f14601a, fVar.f14602b).a(fVar.f14605e, fVar.f14606f).a(this.f14590e).a(new p(fVar.f14607g)).a(new a(dVar)).a();
                } else {
                    this.f14589d = this.f14589d.t().a(new a(dVar)).a();
                }
                zVar = this.f14589d;
                String str = iVar.f14619a;
            } else {
                zVar = null;
            }
            if (zVar == null) {
                if (this.f14588c == null) {
                    this.f14588c = new z.a().c(fVar.f14603c, fVar.f14604d).b(fVar.f14601a, fVar.f14602b).a(fVar.f14605e, fVar.f14606f).a(this.f14590e).a(new p(fVar.f14607g)).a();
                }
                zVar = this.f14588c;
                String str2 = iVar.f14619a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zVar;
    }
}
