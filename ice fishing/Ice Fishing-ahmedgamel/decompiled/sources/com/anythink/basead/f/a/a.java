package com.anythink.basead.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.c.c;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.f.b.d;
import com.anythink.basead.f.c.c;
import com.anythink.basead.l.d;
import com.anythink.core.api.AdError;
import com.anythink.core.common.a.e;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bg;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.x;
import com.anythink.core.common.m.q;
import com.anythink.core.common.v.b.b;
import com.anythink.core.common.v.z;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f9587d;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f9588a = new ConcurrentHashMap<>(3);

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, c> f9589b = new ConcurrentHashMap<>(2);

    /* renamed from: c, reason: collision with root package name */
    private Context f9590c;

    /* renamed from: com.anythink.basead.f.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f9594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0038a f9595b;

        public AnonymousClass2(x xVar, InterfaceC0038a interfaceC0038a) {
            this.f9594a = xVar;
            this.f9595b = interfaceC0038a;
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadCanceled(int i) {
            InterfaceC0038a interfaceC0038a = this.f9595b;
            if (interfaceC0038a != null) {
                interfaceC0038a.a((r) null, g.a(g.i, "Cancel Request."));
            }
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadError(int i, String str, AdError adError) {
            InterfaceC0038a interfaceC0038a = this.f9595b;
            if (interfaceC0038a != null) {
                interfaceC0038a.a((r) null, g.a(g.i, str));
            }
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadFinish(int i, Object obj) {
            r rVar;
            try {
                x xVar = this.f9594a;
                rVar = e.a(xVar.f14941a, (JSONObject) obj, xVar.f14946f, false);
            } catch (Exception unused) {
                rVar = null;
            }
            if (rVar == null) {
                InterfaceC0038a interfaceC0038a = this.f9595b;
                if (interfaceC0038a != null) {
                    interfaceC0038a.a((r) null, g.a(g.i, obj != null ? obj.toString() : "No Ad Return."));
                    return;
                }
                return;
            }
            rVar.d(this.f9594a.f14953n);
            a.this.a(rVar, this.f9594a);
            com.anythink.core.common.a.a a9 = com.anythink.core.common.a.a.a();
            Context context = a.this.f9590c;
            x xVar2 = this.f9594a;
            a9.a(context, xVar2.f14943c, xVar2.f14941a, obj.toString());
            InterfaceC0038a interfaceC0038a2 = this.f9595b;
            if (interfaceC0038a2 != null) {
                interfaceC0038a2.a(rVar);
            }
            a.this.b(rVar, this.f9594a, this.f9595b);
        }

        @Override // com.anythink.core.common.m.q
        public final void onLoadStart(int i) {
        }
    }

    /* renamed from: com.anythink.basead.f.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0038a {
        void a(d dVar);

        void a(r rVar);

        void a(r rVar, f fVar);

        void a(r rVar, d dVar);
    }

    private a(Context context) {
        this.f9590c = context.getApplicationContext();
    }

    private void b(x xVar, InterfaceC0038a interfaceC0038a) {
        r rVar;
        try {
            rVar = a(xVar);
            try {
                rVar.d(xVar.f14953n);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            rVar = null;
        }
        if (rVar == null) {
            new com.anythink.basead.i.a(xVar).a(0, (q) new AnonymousClass2(xVar, interfaceC0038a));
        } else {
            a(rVar, xVar, interfaceC0038a, false);
        }
    }

    public static a a(Context context) {
        if (f9587d == null) {
            synchronized (a.class) {
                try {
                    if (f9587d == null) {
                        f9587d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9587d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final r rVar, final x xVar, final InterfaceC0038a interfaceC0038a) {
        if (TextUtils.isEmpty(rVar.d()) && rVar.m() == 2) {
            new com.anythink.basead.l.d(this.f9590c, rVar, xVar).a(new d.a() { // from class: com.anythink.basead.f.a.a.4
                @Override // com.anythink.basead.l.d.a
                public final void a(r rVar2) {
                    a.this.a(rVar2, xVar, interfaceC0038a);
                }

                @Override // com.anythink.basead.l.d.a
                public final void a(String str, String str2) {
                    interfaceC0038a.a(rVar, g.a(g.f6971q, D.x.m("[", str, ",", str2, "]")));
                }
            });
        } else {
            a(rVar, xVar, interfaceC0038a);
        }
    }

    public final void a(final x xVar, final InterfaceC0038a interfaceC0038a) {
        if (this.f9588a.contains(xVar.f14942b + xVar.f14941a)) {
            if (this.f9588a.get(xVar.f14942b + xVar.f14941a).booleanValue()) {
                interfaceC0038a.a((r) null, g.a(g.f6962g, g.f6977w));
                return;
            }
        }
        this.f9588a.put(xVar.f14942b + xVar.f14941a, Boolean.TRUE);
        b.a().b(new Runnable() { // from class: com.anythink.basead.f.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, xVar, interfaceC0038a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(r rVar, x xVar, InterfaceC0038a interfaceC0038a, boolean z6) {
        if (interfaceC0038a != null) {
            interfaceC0038a.a(rVar);
        }
        if (z6) {
            if (com.anythink.basead.f.c.a.a() && com.anythink.basead.f.c.a.b().a(rVar, xVar)) {
                b(rVar, xVar, interfaceC0038a);
                return;
            }
            return;
        }
        b(rVar, xVar, interfaceC0038a);
    }

    public final void a(final bj bjVar, final x xVar, final InterfaceC0038a interfaceC0038a) {
        b.a().b(new Runnable() { // from class: com.anythink.basead.f.a.a.3
            @Override // java.lang.Runnable
            public final void run() {
                bj bjVar2 = bjVar;
                if (bjVar2 == null || !(bjVar2 instanceof r)) {
                    return;
                }
                if (!TextUtils.isEmpty(((r) bjVar2).d())) {
                    if (com.anythink.basead.f.c.a.a()) {
                        com.anythink.basead.f.c.a.b().a((r) bjVar);
                        a.this.a((r) bjVar, xVar, interfaceC0038a, true);
                        return;
                    }
                    return;
                }
                if (bjVar.m() != 2 || bjVar.ag()) {
                    return;
                }
                String d9 = com.anythink.core.common.a.a.a().d(a.this.f9590c, xVar.f14941a);
                if (TextUtils.isEmpty(d9)) {
                    return;
                }
                new com.anythink.basead.l.d(a.this.f9590c, (r) bjVar, xVar).a(new d.a() { // from class: com.anythink.basead.f.a.a.3.1
                    @Override // com.anythink.basead.l.d.a
                    public final void a(String str, String str2) {
                    }

                    @Override // com.anythink.basead.l.d.a
                    public final void a(r rVar) {
                        InterfaceC0038a interfaceC0038a2 = interfaceC0038a;
                        if (interfaceC0038a2 != null) {
                            interfaceC0038a2.a(rVar, (com.anythink.basead.f.b.d) null);
                        }
                    }
                }, d9);
            }
        });
    }

    public final void a(final r rVar, final x xVar, final InterfaceC0038a interfaceC0038a) {
        com.anythink.basead.f.f.a.a(xVar, rVar);
        if (!TextUtils.isEmpty(rVar.d())) {
            if (com.anythink.basead.f.c.a.a()) {
                com.anythink.basead.f.c.a.b().a(rVar, xVar, new com.anythink.basead.f.c.e() { // from class: com.anythink.basead.f.a.a.5
                    @Override // com.anythink.basead.f.c.e
                    public final void a(c cVar) {
                        InterfaceC0038a interfaceC0038a2 = interfaceC0038a;
                        if (interfaceC0038a2 != null) {
                            interfaceC0038a2.a(cVar);
                        }
                    }

                    @Override // com.anythink.basead.f.c.e
                    public final void b(c cVar) {
                        a.this.f9588a.put(xVar.f14942b + xVar.f14941a, Boolean.FALSE);
                        InterfaceC0038a interfaceC0038a2 = interfaceC0038a;
                        if (interfaceC0038a2 != null) {
                            interfaceC0038a2.a(rVar, cVar);
                        }
                    }

                    @Override // com.anythink.basead.f.c.e
                    public final void a(f fVar) {
                        a.this.f9588a.put(xVar.f14942b + xVar.f14941a, Boolean.FALSE);
                        InterfaceC0038a interfaceC0038a2 = interfaceC0038a;
                        if (interfaceC0038a2 != null) {
                            interfaceC0038a2.a(rVar, fVar);
                        }
                    }
                });
                return;
            } else {
                if (interfaceC0038a != null) {
                    interfaceC0038a.a(rVar, g.a(g.f6972r, g.f6953W));
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals(rVar.aD(), com.anythink.basead.f.d.b.f9728a)) {
            if (com.anythink.basead.f.d.b.a() != null || interfaceC0038a == null) {
                return;
            }
            interfaceC0038a.a(rVar, g.a(g.f6973s, g.f6954X));
            return;
        }
        com.anythink.basead.b.f.a();
        com.anythink.basead.b.f.a(xVar.f14942b, rVar, xVar, new c.b() { // from class: com.anythink.basead.f.a.a.6
            @Override // com.anythink.basead.b.c.c.b
            public final void a() {
                a.this.f9588a.put(xVar.f14942b + xVar.f14941a, Boolean.FALSE);
                InterfaceC0038a interfaceC0038a2 = interfaceC0038a;
                if (interfaceC0038a2 != null) {
                    interfaceC0038a2.a(rVar, (com.anythink.basead.f.b.d) null);
                }
            }

            @Override // com.anythink.basead.b.c.c.b
            public final void a(f fVar) {
                a.this.f9588a.put(xVar.f14942b + xVar.f14941a, Boolean.FALSE);
                InterfaceC0038a interfaceC0038a2 = interfaceC0038a;
                if (interfaceC0038a2 != null) {
                    interfaceC0038a2.a(rVar, fVar);
                }
            }
        });
    }

    public final r a(x xVar) {
        bg a9 = com.anythink.core.common.a.a.a().a(this.f9590c, xVar.f14941a);
        r rVar = null;
        if (a9 != null && !TextUtils.isEmpty(a9.a())) {
            try {
                rVar = e.a(xVar.f14941a, new JSONObject(a9.a()), xVar.f14946f, false);
                rVar.d(a9.b());
            } catch (Throwable unused) {
            }
            if (rVar != null) {
                a(rVar, xVar);
            }
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(r rVar, x xVar) {
        if (rVar == null || xVar == null) {
            return;
        }
        rVar.h(xVar.f14944d);
        rVar.P(xVar.f14958s);
        rVar.Q(xVar.f14959t);
        s c9 = t.b().c();
        if (c9 != null && c9.a()) {
            c9.fillDataFetchStatus(this.f9590c, rVar, xVar);
        } else {
            rVar.m(0);
        }
        com.anythink.basead.f.f.b.a(rVar);
        if (xVar.f14946f == 67) {
            com.anythink.core.common.f.c.a(this.f9590c).a(rVar.v(), rVar.az());
            com.anythink.core.common.f.b.a(this.f9590c).a(rVar.w(), rVar.az());
        }
        z.a();
        com.anythink.basead.b.e.a.a();
    }

    public static /* synthetic */ void a(a aVar, x xVar, InterfaceC0038a interfaceC0038a) {
        r rVar;
        try {
            rVar = aVar.a(xVar);
            try {
                rVar.d(xVar.f14953n);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            rVar = null;
        }
        if (rVar == null) {
            new com.anythink.basead.i.a(xVar).a(0, (q) aVar.new AnonymousClass2(xVar, interfaceC0038a));
        } else {
            aVar.a(rVar, xVar, interfaceC0038a, false);
        }
    }
}
