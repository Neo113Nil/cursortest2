package com.anythink.core.common.m.a.a;

import D.y;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.common.m.b.g;
import com.anythink.core.common.n.a.h;
import com.anythink.core.common.n.a.m;
import com.anythink.core.common.n.b.q;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14418a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final String f14419b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14420c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.m.b.a f14421d;

    public a(String str, String str2) {
        this.f14419b = str;
        this.f14420c = str2;
    }

    public final com.anythink.core.common.m.b.a a() {
        return this.f14421d;
    }

    private static boolean b(com.anythink.core.common.m.b.d dVar) {
        com.anythink.core.d.b a9 = com.anythink.core.d.d.a();
        return a9 != null && a9.g(dVar != null ? dVar.b() : "");
    }

    public final com.anythink.core.common.m.a.d a(com.anythink.core.common.m.b.d dVar) {
        com.anythink.core.d.b a9 = com.anythink.core.d.d.a();
        String b9 = dVar != null ? dVar.b() : "";
        if (a9 == null || !a9.g(b9)) {
            return null;
        }
        com.anythink.core.common.m.b.a aVar = new com.anythink.core.common.m.b.a();
        aVar.d(this.f14419b);
        aVar.e(this.f14420c);
        aVar.b(g.a(dVar.b()));
        this.f14421d = aVar;
        return new C0085a(aVar, dVar.b());
    }

    /* renamed from: com.anythink.core.common.m.a.a.a$a, reason: collision with other inner class name */
    public static class C0085a implements com.anythink.core.common.m.a.d {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.core.common.m.b.a f14422a;

        /* renamed from: b, reason: collision with root package name */
        private final String f14423b;

        public C0085a(com.anythink.core.common.m.b.a aVar, String str) {
            this.f14422a = aVar;
            this.f14423b = str;
        }

        private static List<InetAddress> b(String str, com.anythink.core.common.m.b.a aVar) {
            aVar.p();
            com.anythink.core.common.n.a.c a9 = com.anythink.core.common.n.a.c.a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!a9.b()) {
                throw new IllegalArgumentException("init custom dns server failed.");
            }
            m a10 = a9.a(new h(str));
            aVar.c(SystemClock.elapsedRealtime() - elapsedRealtime);
            com.anythink.core.common.n.a.f b9 = a10 != null ? a10.b() : null;
            if (b9 != null) {
                aVar.a(b9.a());
                aVar.a(b9.b());
                aVar.a(b9.c());
            }
            InetAddress[] a11 = a10 != null ? a10.a() : null;
            if (a11 == null || a11.length <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, a11);
            String unused = a.f14418a;
            arrayList.size();
            aVar.k();
            return arrayList;
        }

        @Override // com.anythink.core.common.m.a.d
        public final List<InetAddress> a(String str) {
            Throwable th;
            com.anythink.core.common.m.b.a aVar;
            com.anythink.core.common.n.a.c a9;
            long elapsedRealtime;
            ArrayList arrayList;
            String unused = a.f14418a;
            List<InetAddress> a10 = a(str, this.f14422a);
            if (a10 != null && !a10.isEmpty()) {
                return a10;
            }
            try {
                aVar = this.f14422a;
                aVar.p();
                a9 = com.anythink.core.common.n.a.c.a();
                elapsedRealtime = SystemClock.elapsedRealtime();
            } catch (Throwable th2) {
                th = th2;
                String unused2 = a.f14418a;
                this.f14422a.c(th + ": " + th.getMessage());
            }
            if (!a9.b()) {
                throw new IllegalArgumentException("init custom dns server failed.");
            }
            m a11 = a9.a(new h(str));
            aVar.c(SystemClock.elapsedRealtime() - elapsedRealtime);
            th = null;
            com.anythink.core.common.n.a.f b9 = a11 != null ? a11.b() : null;
            if (b9 != null) {
                aVar.a(b9.a());
                aVar.a(b9.b());
                aVar.a(b9.c());
            }
            InetAddress[] a12 = a11 != null ? a11.a() : null;
            if (a12 == null || a12.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                Collections.addAll(arrayList, a12);
                String unused3 = a.f14418a;
                arrayList.size();
                aVar.k();
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                return arrayList;
            }
            if (th == null) {
                String o6 = y.o("cant not resolve \"", str, "\".");
                if (TextUtils.isEmpty(this.f14422a.l())) {
                    this.f14422a.c(o6);
                }
                throw new UnknownHostException(o6);
            }
            throw new UnknownHostException(th + ": " + th.getMessage());
        }

        private static List<InetAddress> a(String str, com.anythink.core.common.m.b.a aVar) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                List<InetAddress> lookup = q.f15708a.lookup(str);
                aVar.b(SystemClock.elapsedRealtime() - elapsedRealtime);
                if (lookup == null || lookup.isEmpty()) {
                    return null;
                }
                String unused = a.f14418a;
                lookup.size();
                return lookup;
            } catch (Throwable th) {
                String unused2 = a.f14418a;
                aVar.h();
                aVar.b(th + ": " + th.getMessage());
                return null;
            }
        }
    }
}
