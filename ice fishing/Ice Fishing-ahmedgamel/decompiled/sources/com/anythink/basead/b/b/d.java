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
    WeakReference<View> f6558h;
    private com.anythink.core.common.v.a.c i;

    /* renamed from: j, reason: collision with root package name */
    private long f6559j;

    /* renamed from: k, reason: collision with root package name */
    private final long f6560k;

    /* renamed from: l, reason: collision with root package name */
    private c f6561l;

    /* renamed from: com.anythink.basead.b.b.d$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.basead.b.a.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6565c;

        public AnonymousClass2(String str, String str2, int i) {
            this.f6563a = str;
            this.f6564b = str2;
            this.f6565c = i;
        }

        @Override // com.anythink.basead.b.a.c
        public final void a(boolean z6) {
            if (!z6) {
                d dVar = d.this;
                com.anythink.core.common.u.e.b(dVar.f6531d, dVar.f6530c, this.f6564b, this.f6563a, 3);
                return;
            }
            WeakReference<View> weakReference = d.this.f6558h;
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
                        if (!TextUtils.isEmpty(AnonymousClass2.this.f6563a)) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (!anonymousClass2.f6564b.equals(anonymousClass2.f6563a)) {
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                int i = anonymousClass22.f6565c;
                                if (i != 2 && i != 3) {
                                    d dVar2 = d.this;
                                    com.anythink.core.common.u.e.b(dVar2.f6531d, dVar2.f6530c, anonymousClass22.f6564b, anonymousClass22.f6563a, 2);
                                    return;
                                } else {
                                    if (System.currentTimeMillis() - d.this.f6559j > com.anythink.basead.exoplayer.f.f7973a) {
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                    d dVar3 = d.this;
                                    com.anythink.core.common.u.e.b(dVar3.f6531d, dVar3.f6530c, anonymousClass23.f6564b, anonymousClass23.f6563a, 0);
                                    if (d.this.f6531d.f14954o.bo() == 1 && d.this.f6561l != null) {
                                        d.this.f6561l.a(d.this.f6561l.d(), e.HANDLE_DEEPLINK_REFUSE);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                        d dVar4 = d.this;
                        com.anythink.core.common.u.e.b(dVar4.f6531d, dVar4.f6530c, anonymousClass24.f6564b, anonymousClass24.f6563a, 1);
                    }
                };
                w wVar = d.this.f6530c;
                int bO = (wVar == null || wVar.r() == null) ? 1 : d.this.f6530c.r().bO();
                d dVar2 = d.this;
                view.getContext();
                dVar2.i = new com.anythink.core.common.v.a.c(bO, 0);
                d.this.i.a(view, aVar);
            }
        }
    }

    public d(a.C0006a c0006a) {
        super(c0006a);
        this.f6559j = 0L;
        this.f6560k = com.anythink.basead.exoplayer.f.f7973a;
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
        this.f6558h = weakReference;
    }

    public final void a(c cVar) {
        this.f6561l = cVar;
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        k kVar = this.f6532e;
        if (kVar == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        com.anythink.basead.d.j a9 = kVar.a();
        if (a9 == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        a9.f7001k = new com.anythink.basead.d.b();
        com.anythink.basead.d.e b9 = b();
        a9.f7001k.f6917a = b9 != null ? b9.f6929c : "";
        com.anythink.basead.b.b.a(23, this.f6530c, a9);
        if (!TextUtils.isEmpty(this.f6530c.G())) {
            String G2 = this.f6530c.G();
            String str = this.f6531d.f14944d;
            String replaceAll = G2.replaceAll("\\{req_id\\}", str != null ? str : "");
            com.anythink.core.common.o.a().a(this.f6530c);
            com.anythink.core.basead.a.d b10 = com.anythink.core.basead.a.e.b(this.f6529b, replaceAll, this.f6530c, this.f6531d);
            int a10 = b10.a();
            if (a10 == 0) {
                a9.f7001k.f6918b = 1;
            } else if (a10 != 1) {
                a9.f7001k.f6918b = 3;
            } else {
                a9.f7001k.f6918b = 2;
            }
            if (b10.a() == 0) {
                com.anythink.basead.d.a aVar = a9.i;
                if (aVar != null) {
                    aVar.i = true;
                }
                k kVar2 = this.f6532e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                new f(this.f6530c, this.f6531d, replaceAll, a9.i).a();
                com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, replaceAll, "1", 0, 0, b10.b());
                b bVar = this.f6533f;
                if (bVar != null) {
                    bVar.b();
                    this.f6533f.a();
                    this.f6533f.a(true);
                    this.f6533f.c();
                }
                com.anythink.basead.c.a().a(new com.anythink.basead.b.a.b() { // from class: com.anythink.basead.b.b.d.1
                    @Override // com.anythink.basead.b.a.b
                    public final void a(long j6) {
                        long currentTimeMillis = System.currentTimeMillis();
                        d dVar = d.this;
                        x xVar = dVar.f6531d;
                        com.anythink.core.common.u.e.a(xVar, xVar.f14949j, dVar.f6530c, j6, currentTimeMillis);
                    }
                });
                com.anythink.basead.b.b.a(24, this.f6530c, a9);
                if (com.anythink.basead.b.e.f(this.f6530c, this.f6531d) != 1) {
                    String H8 = this.f6530c.H();
                    int K7 = this.f6530c.K();
                    this.f6559j = System.currentTimeMillis();
                    com.anythink.basead.c.a().a(new AnonymousClass2(H8, replaceAll, K7));
                }
                return n.a(true, "DeeplinkClickAction execute success");
            }
            com.anythink.core.common.o.a().b(this.f6530c);
            if (com.anythink.basead.b.b.a(this.f6529b, this.f6530c.I())) {
                com.anythink.basead.b.b.a(28, this.f6530c, a9);
            } else {
                com.anythink.basead.b.b.a(29, this.f6530c, a9);
            }
            com.anythink.core.common.u.e.a(this.f6531d, this.f6530c, replaceAll, "0", 0, b10.a(), b10.b());
        }
        return n.a(false, "DeeplinkClickAction execute fail");
    }

    private void a(String str) {
        String H8 = this.f6530c.H();
        int K7 = this.f6530c.K();
        this.f6559j = System.currentTimeMillis();
        com.anythink.basead.c.a().a(new AnonymousClass2(H8, str, K7));
    }
}
