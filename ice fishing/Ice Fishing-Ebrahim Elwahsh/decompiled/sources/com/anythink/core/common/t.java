package com.anythink.core.common;

import com.anythink.core.api.AdError;
import com.anythink.core.common.h.aq;
import com.anythink.core.common.m.d.d;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t {

    /* renamed from: c, reason: collision with root package name */
    private static volatile t f16577c;

    /* renamed from: b, reason: collision with root package name */
    private String f16579b = "t";

    /* renamed from: a, reason: collision with root package name */
    AtomicInteger f16578a = new AtomicInteger(0);

    private t() {
    }

    public final synchronized void b() {
        List<aq> a9;
        int i;
        if (this.f16578a.get() <= 0 && (a9 = com.anythink.core.common.e.k.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).a()) != null && a9.size() > 0) {
            this.f16578a.set(a9.size());
            this.f16578a.get();
            for (final aq aqVar : a9) {
                if (System.currentTimeMillis() - aqVar.f13700f >= com.anythink.core.d.h.f17448f) {
                    this.f16578a.decrementAndGet();
                    com.anythink.core.common.e.k.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).b(aqVar);
                } else {
                    try {
                        i = new JSONObject(aqVar.f13701g).optInt(aq.f13693h);
                    } catch (Throwable unused) {
                        i = 1000;
                    }
                    if (aqVar.f13696b == 3) {
                        new com.anythink.core.common.m.d.c(aqVar.f13699e, i).a(new d.a() { // from class: com.anythink.core.common.t.2
                            @Override // com.anythink.core.common.m.d.d.a
                            public final void a(Object obj) {
                                String unused2 = t.this.f16579b;
                                aqVar.a();
                                com.anythink.core.common.e.k.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).b(aqVar);
                                t.this.f16578a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.m.d.d.a
                            public final void a(Throwable th) {
                                String unused2 = t.this.f16579b;
                                aqVar.a();
                                th.getMessage();
                                t.this.f16578a.decrementAndGet();
                            }
                        });
                    } else {
                        final com.anythink.core.common.m.u uVar = new com.anythink.core.common.m.u(aqVar);
                        if (i == 1001) {
                            uVar.s();
                        }
                        uVar.a(0, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.t.3
                            @Override // com.anythink.core.common.m.q
                            public final void onLoadCanceled(int i4) {
                                t.this.f16578a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.m.q
                            public final void onLoadError(int i4, String str, AdError adError) {
                                String unused2 = t.this.f16579b;
                                aqVar.a();
                                t.this.f16578a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.m.q
                            public final void onLoadFinish(int i4, Object obj) {
                                String unused2 = t.this.f16579b;
                                aqVar.a();
                                com.anythink.core.common.e.k.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).b(uVar.t());
                                t.this.f16578a.decrementAndGet();
                            }

                            @Override // com.anythink.core.common.m.q
                            public final void onLoadStart(int i4) {
                            }
                        });
                    }
                }
            }
        }
    }

    public static t a() {
        if (f16577c == null) {
            synchronized (t.class) {
                try {
                    if (f16577c == null) {
                        f16577c = new t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16577c;
    }

    public final void a(final int i, final String str, final String str2, final String str3, final String str4) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.t.1
            @Override // java.lang.Runnable
            public final void run() {
                aq aqVar = new aq();
                aqVar.f13696b = i;
                aqVar.f13698d = str;
                aqVar.f13697c = str2;
                aqVar.f13699e = str3;
                aqVar.f13700f = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(aqVar.f13700f);
                sb.append(str3);
                aqVar.f13695a = com.anythink.core.common.v.o.a(sb.toString() != null ? str3 : "");
                aqVar.f13701g = str4;
                String unused = t.this.f16579b;
                aqVar.a();
                com.anythink.core.common.e.k.a(com.anythink.core.common.e.e.a(com.anythink.core.common.d.t.b().g())).a(aqVar);
            }
        }, 16);
    }
}
