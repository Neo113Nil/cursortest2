package com.anythink.basead.b.b;

import android.text.TextUtils;
import android.view.View;
import com.anythink.basead.b.b.a;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: h, reason: collision with root package name */
    WeakReference<View> f5772h;
    private com.anythink.core.common.v.a.c i;

    /* renamed from: j, reason: collision with root package name */
    private long f5773j;

    /* renamed from: k, reason: collision with root package name */
    private final long f5774k;

    /* renamed from: l, reason: collision with root package name */
    private c f5775l;

    /* renamed from: com.anythink.basead.b.b.d$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.basead.b.a.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5779c;

        public AnonymousClass2(String str, String str2, int i) {
            this.f5777a = str;
            this.f5778b = str2;
            this.f5779c = i;
        }

        @Override // com.anythink.basead.b.a.c
        public final void a(boolean z3) {
            if (!z3) {
                d dVar = d.this;
                com.anythink.core.common.u.e.b(dVar.f5745d, dVar.f5744c, this.f5778b, this.f5777a, 3);
                return;
            }
            WeakReference<View> weakReference = d.this.f5772h;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null) {
                if (d.this.i != null) {
                    d.this.i.b();
                    d.this.i = null;
                }
                com.anythink.core.common.v.a.a aVar = new com.anythink.core.common.v.a.a() { // from class: com.anythink.basead.b.b.d.2.1
                    @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                    public final int getImpressionMinPercentageViewed() {
                        return 50;
                    }

                    @Override // com.anythink.core.common.v.a.a, com.anythink.core.common.v.a.b
                    public final void recordImpression(View view2) {
                        if (!TextUtils.isEmpty(AnonymousClass2.this.f5777a)) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (!anonymousClass2.f5778b.equals(anonymousClass2.f5777a)) {
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                int i = anonymousClass22.f5779c;
                                if (i != 2 && i != 3) {
                                    d dVar2 = d.this;
                                    com.anythink.core.common.u.e.b(dVar2.f5745d, dVar2.f5744c, anonymousClass22.f5778b, anonymousClass22.f5777a, 2);
                                    return;
                                } else {
                                    if (System.currentTimeMillis() - d.this.f5773j > com.anythink.basead.exoplayer.f.f7187a) {
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                    d dVar3 = d.this;
                                    com.anythink.core.common.u.e.b(dVar3.f5745d, dVar3.f5744c, anonymousClass23.f5778b, anonymousClass23.f5777a, 0);
                                    if (d.this.f5745d.f14168o.bo() == 1 && d.this.f5775l != null) {
                                        d.this.f5775l.a(d.this.f5775l.d(), e.HANDLE_DEEPLINK_REFUSE);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                        d dVar4 = d.this;
                        com.anythink.core.common.u.e.b(dVar4.f5745d, dVar4.f5744c, anonymousClass24.f5778b, anonymousClass24.f5777a, 1);
                    }
                };
                w wVar = d.this.f5744c;
                int bO = (wVar == null || wVar.r() == null) ? 1 : d.this.f5744c.r().bO();
                d dVar2 = d.this;
                view.getContext();
                dVar2.i = new com.anythink.core.common.v.a.c(bO, 0);
                d.this.i.a(view, aVar);
            }
        }
    }

    public d(a.C0006a c0006a) {
        super(c0006a);
        this.f5773j = 0L;
        this.f5774k = com.anythink.basead.exoplayer.f.f7187a;
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final void c() {
        super.c();
        com.anythink.core.common.v.a.c cVar = this.i;
        if (cVar != null) {
            cVar.b();
            this.i = null;
        }
    }

    public final void a(WeakReference<View> weakReference) {
        this.f5772h = weakReference;
    }

    public final void a(c cVar) {
        this.f5775l = cVar;
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        k kVar = this.f5746e;
        if (kVar == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        com.anythink.basead.d.j a9 = kVar.a();
        if (a9 == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        a9.f6215k = new com.anythink.basead.d.b();
        com.anythink.basead.d.e b9 = b();
        a9.f6215k.f6131a = b9 != null ? b9.f6143c : "";
        com.anythink.basead.b.b.a(23, this.f5744c, a9);
        if (!TextUtils.isEmpty(this.f5744c.G())) {
            String G7 = this.f5744c.G();
            String str = this.f5745d.f14158d;
            String replaceAll = G7.replaceAll("\\{req_id\\}", str != null ? str : "");
            com.anythink.core.common.o.a().a(this.f5744c);
            com.anythink.core.basead.a.d b10 = com.anythink.core.basead.a.e.b(this.f5743b, replaceAll, this.f5744c, this.f5745d);
            int a10 = b10.a();
            if (a10 == 0) {
                a9.f6215k.f6132b = 1;
            } else if (a10 != 1) {
                a9.f6215k.f6132b = 3;
            } else {
                a9.f6215k.f6132b = 2;
            }
            if (b10.a() == 0) {
                com.anythink.basead.d.a aVar = a9.i;
                if (aVar != null) {
                    aVar.i = true;
                }
                k kVar2 = this.f5746e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                new f(this.f5744c, this.f5745d, replaceAll, a9.i).a();
                com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, replaceAll, "1", 0, 0, b10.b());
                b bVar = this.f5747f;
                if (bVar != null) {
                    bVar.b();
                    this.f5747f.a();
                    this.f5747f.a(true);
                    this.f5747f.c();
                }
                com.anythink.basead.c.a().a(new com.anythink.basead.b.a.b() { // from class: com.anythink.basead.b.b.d.1
                    @Override // com.anythink.basead.b.a.b
                    public final void a(long j6) {
                        long currentTimeMillis = System.currentTimeMillis();
                        d dVar = d.this;
                        x xVar = dVar.f5745d;
                        com.anythink.core.common.u.e.a(xVar, xVar.f14163j, dVar.f5744c, j6, currentTimeMillis);
                    }
                });
                com.anythink.basead.b.b.a(24, this.f5744c, a9);
                if (com.anythink.basead.b.e.f(this.f5744c, this.f5745d) != 1) {
                    String H8 = this.f5744c.H();
                    int K7 = this.f5744c.K();
                    this.f5773j = System.currentTimeMillis();
                    com.anythink.basead.c.a().a(new AnonymousClass2(H8, replaceAll, K7));
                }
                return n.a(true, "DeeplinkClickAction execute success");
            }
            com.anythink.core.common.o.a().b(this.f5744c);
            if (com.anythink.basead.b.b.a(this.f5743b, this.f5744c.I())) {
                com.anythink.basead.b.b.a(28, this.f5744c, a9);
            } else {
                com.anythink.basead.b.b.a(29, this.f5744c, a9);
            }
            com.anythink.core.common.u.e.a(this.f5745d, this.f5744c, replaceAll, "0", 0, b10.a(), b10.b());
        }
        return n.a(false, "DeeplinkClickAction execute fail");
    }

    private void a(String str) {
        String H8 = this.f5744c.H();
        int K7 = this.f5744c.K();
        this.f5773j = System.currentTimeMillis();
        com.anythink.basead.c.a().a(new AnonymousClass2(H8, str, K7));
    }
}
