package com.anythink.core.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bm;
import com.anythink.core.common.v.af;
import com.anythink.core.d.l;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17440a = "n";

    /* renamed from: b, reason: collision with root package name */
    private static volatile n f17441b;

    /* renamed from: c, reason: collision with root package name */
    private Context f17442c;

    /* renamed from: e, reason: collision with root package name */
    private final p f17444e;

    /* renamed from: d, reason: collision with root package name */
    private final s f17443d = new s();

    /* renamed from: f, reason: collision with root package name */
    private final o f17445f = new o(this);

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f17463a;

        /* renamed from: b, reason: collision with root package name */
        private b f17464b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f17465c = false;

        public a(String str, b bVar) {
            this.f17463a = str;
            this.f17464b = bVar;
        }

        @Override // com.anythink.core.d.n.b
        public final void b() {
            b bVar = this.f17464b;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void a() {
            b bVar = this.f17464b;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void b(l lVar) {
            b bVar = this.f17464b;
            if (bVar != null) {
                bVar.b(lVar);
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void a(l lVar) {
            if (this.f17464b == null || this.f17465c) {
                return;
            }
            n.a(com.anythink.core.common.d.t.b().g()).b(this.f17463a, lVar.aZ());
            this.f17465c = true;
            this.f17464b.a(lVar);
        }

        @Override // com.anythink.core.d.n.b
        public final void a(AdError adError) {
            if (this.f17464b == null || this.f17465c) {
                return;
            }
            this.f17465c = true;
            this.f17464b.a(adError);
        }
    }

    public interface b {
        void a();

        void a(AdError adError);

        void a(l lVar);

        void b();

        void b(l lVar);
    }

    private n(Context context) {
        this.f17442c = context;
        this.f17444e = new p(context);
    }

    public final l d(String str) {
        return this.f17444e.a(com.anythink.core.common.d.t.b().p(), str, 2);
    }

    public final l e(String str) {
        return this.f17444e.a(com.anythink.core.common.d.t.b().p(), str, 0);
    }

    public final l f(String str) {
        String p9 = com.anythink.core.common.d.t.b().p();
        if (this.f17444e.a(com.anythink.core.common.d.t.b().p(), str, 0) != null) {
            this.f17444e.b(p9, str, 1);
            return null;
        }
        l a9 = this.f17444e.a(p9, str, 1);
        if (a9 == null) {
            a9 = this.f17443d.b(str);
        }
        if (a9 != null) {
            a(str, a9, null, 1);
        }
        return a9;
    }

    public final void g(String str) {
        this.f17444e.d(com.anythink.core.common.d.t.b().p(), str);
    }

    public final boolean h(String str) {
        return this.f17444e.b(com.anythink.core.common.d.t.b().p(), str);
    }

    public final void i(String str) {
        this.f17443d.a(str);
    }

    public final int j(String str) {
        return this.f17444e.e(com.anythink.core.common.d.t.b().p(), str);
    }

    public static n a(Context context) {
        if (f17441b == null) {
            synchronized (n.class) {
                try {
                    if (f17441b == null) {
                        f17441b = new n(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17441b;
    }

    public final l b(String str) {
        return a(str);
    }

    public final l c(String str) {
        return this.f17444e.a(com.anythink.core.common.d.t.b().p(), str);
    }

    public final void b(String str, int i) {
        this.f17444e.a(str, i);
    }

    public final void a() {
        af.a(this.f17442c, u.b.f12855j);
    }

    public final void a(String str, l lVar, JSONObject jSONObject, int i) {
        this.f17444e.a(com.anythink.core.common.d.t.b().p(), str, lVar, jSONObject, i);
    }

    public final l a(String str) {
        return this.f17444e.c(com.anythink.core.common.d.t.b().p(), str);
    }

    public final l a(String str, int i) {
        return this.f17444e.a(com.anythink.core.common.d.t.b().p(), str, i);
    }

    public final void a(final l lVar, final String str, final String str2, final String str3, final Map<String, Object> map, final b bVar, final int i, final boolean z3, final ATAdRequest aTAdRequest) {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.d.n.1

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f17453h = true;

            @Override // java.lang.Runnable
            public final void run() {
                final a aVar = new a(str3, bVar);
                l lVar2 = lVar;
                String aj = lVar2 != null ? lVar2.aj() : "";
                Map<String, Object> d2 = com.anythink.core.common.d.t.b().d(str3);
                bm bmVar = new bm(str, str2, str3, aj, d2, map, com.anythink.core.common.u.a().g(str3), aTAdRequest);
                bmVar.a(this.f17453h);
                bmVar.a(i);
                l lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.aZ();
                }
                l lVar4 = lVar;
                com.anythink.core.common.t.b bVar2 = null;
                if (lVar4 == null) {
                    n.this.f17445f.a(n.this.f17442c, bmVar, new m(n.this, bmVar, aVar, null));
                    return;
                }
                if (lVar4.br()) {
                    lVar.b(4);
                    aVar.a(lVar);
                    return;
                }
                lVar.b(3);
                bmVar.a(lVar.bb());
                if (z3) {
                    n.this.f17445f.a(n.this.f17442c, bmVar, new m(n.this, bmVar, aVar, lVar));
                    return;
                }
                if (lVar.aR()) {
                    aVar.a(lVar);
                    bmVar.a((Map<String, String>) null);
                    n.this.f17445f.a(n.this.f17442c, bmVar, new m(n.this, bmVar, aVar, lVar));
                    return;
                }
                if (lVar.aT()) {
                    aVar.a(lVar);
                    aVar.f17464b = null;
                }
                l e9 = n.this.e(str3);
                if (e9 == null) {
                    bmVar.a((Map<String, String>) null);
                    n.this.f17445f.a(n.this.f17442c, bmVar, new m(n.this, bmVar, aVar, lVar));
                    return;
                }
                bmVar.a(e9.bb());
                boolean equals = d2.equals(e9.ag());
                if (equals && !e9.bk() && !com.anythink.core.common.r.a().b(n.this.f17442c, str3) && !e9.bl()) {
                    aVar.a(lVar);
                    return;
                }
                final boolean[] zArr = new boolean[1];
                long bx = !equals ? e9.bx() : e9.as();
                com.anythink.core.common.t.a a9 = com.anythink.core.common.t.d.a();
                if (bx == 0) {
                    zArr[0] = true;
                    aVar.a(lVar);
                } else {
                    bVar2 = new com.anythink.core.common.t.b() { // from class: com.anythink.core.d.n.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            zArr[0] = true;
                            lVar.b(1);
                            aVar.a(lVar);
                        }
                    };
                    a9.a(bVar2, bx, false);
                }
                com.anythink.core.common.t.b bVar3 = bVar2;
                com.anythink.core.c.b.a().b(str3);
                n.this.f17445f.a(n.this.f17442c, bmVar, new m(n.this, bmVar, aVar, lVar, a9, bVar3, zArr));
            }
        }, 2);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        l a9;
        JSONObject aQ;
        if (jSONObject != null) {
            if (jSONObject2 == null && TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (jSONObject2 != null) {
                    jSONObject.put(l.a.aa, jSONObject2);
                } else {
                    if (TextUtils.isEmpty(str) || (a9 = a(str)) == null || (aQ = a9.aQ()) == null) {
                        return;
                    }
                    jSONObject.put(l.a.aa, aQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Object obj, final bm bmVar, b bVar, boolean[] zArr, l lVar) {
        if (!(obj instanceof JSONObject) || bmVar == null) {
            if (bVar != null) {
                if (lVar == null) {
                    bVar.a(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", "Placement LoadParams error."));
                    return;
                } else {
                    bVar.a(lVar);
                    return;
                }
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put(l.a.ac, System.currentTimeMillis());
            l a9 = a(bmVar.d(), jSONObject.optInt(l.a.av, 0));
            if (a9 != null) {
                a9.a(jSONObject, bmVar.d());
            }
        } catch (Throwable th) {
            Log.e(f17440a, "parse place strategy error:" + th.getMessage());
        }
        final l a10 = l.a(bmVar.d(), jSONObject);
        final String d2 = bmVar.d();
        if (a10 != null) {
            a10.b(bmVar.o() ? 5 : 2);
            if (a10.at() != 1) {
                jSONObject = null;
            }
            a(d2, a10, jSONObject, a10.aZ());
            int h9 = bmVar.h();
            a10.aZ();
            if (h9 == 3 && a10.aT()) {
                bmVar.a(2);
                bmVar.a((Map<String, String>) null);
                this.f17445f.a(this.f17442c, bmVar);
            } else if (a10.aU()) {
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.d.n.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a10.ah() == 1) {
                            com.anythink.core.common.r.a().a(n.this.f17442c, d2, bmVar.j());
                        }
                        if (!a10.aS()) {
                            n.this.f17444e.b(bmVar.b(), d2, 2);
                            return;
                        }
                        bmVar.a(1);
                        l d9 = n.this.d(d2);
                        if (d9 != null) {
                            bmVar.a(d9.bb());
                        } else {
                            bmVar.a((Map<String, String>) null);
                        }
                        n.this.f17445f.a(n.this.f17442c, bmVar);
                    }
                });
            }
        }
        if (zArr != null && zArr.length > 0 && zArr[0]) {
            if (bVar == null || a10 == null) {
                return;
            }
            bVar.b(a10);
            return;
        }
        if (bVar != null) {
            if (a10 != null) {
                bVar.a(a10);
            } else {
                bVar.a(ErrorCode.getErrorCode(ErrorCode.placeStrategyError, "", "Placement Service error."));
            }
        }
    }

    public static boolean a(l lVar) {
        if (lVar == null) {
            return false;
        }
        int aZ = lVar.aZ();
        if (aZ != 0) {
            if (aZ == 1) {
                lVar.i();
                return true;
            }
            if (aZ != 2) {
                lVar.i();
                return true;
            }
        }
        if (lVar.bl()) {
            lVar.i();
            return false;
        }
        lVar.i();
        return true;
    }

    public final void a(String str, String str2, l lVar) {
        if (lVar == null) {
            return;
        }
        this.f17444e.b(str, str2, lVar.aZ());
    }
}
