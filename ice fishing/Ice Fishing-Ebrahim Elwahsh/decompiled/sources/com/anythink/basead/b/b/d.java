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
    WeakReference<View> f5929h;
    private com.anythink.core.common.v.a.c i;

    /* renamed from: j, reason: collision with root package name */
    private long f5930j;

    /* renamed from: k, reason: collision with root package name */
    private final long f5931k;

    /* renamed from: l, reason: collision with root package name */
    private c f5932l;

    /* renamed from: com.anythink.basead.b.b.d$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.basead.b.a.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5936c;

        public AnonymousClass2(String str, String str2, int i) {
            this.f5934a = str;
            this.f5935b = str2;
            this.f5936c = i;
        }

        @Override // com.anythink.basead.b.a.c
        public final void a(boolean z8) {
            if (!z8) {
                d dVar = d.this;
                com.anythink.core.common.u.e.b(dVar.f5902d, dVar.f5901c, this.f5935b, this.f5934a, 3);
                return;
            }
            WeakReference<View> weakReference = d.this.f5929h;
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
                        if (!TextUtils.isEmpty(AnonymousClass2.this.f5934a)) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (!anonymousClass2.f5935b.equals(anonymousClass2.f5934a)) {
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                int i = anonymousClass22.f5936c;
                                if (i != 2 && i != 3) {
                                    d dVar2 = d.this;
                                    com.anythink.core.common.u.e.b(dVar2.f5902d, dVar2.f5901c, anonymousClass22.f5935b, anonymousClass22.f5934a, 2);
                                    return;
                                } else {
                                    if (System.currentTimeMillis() - d.this.f5930j > com.anythink.basead.exoplayer.f.f7344a) {
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                    d dVar3 = d.this;
                                    com.anythink.core.common.u.e.b(dVar3.f5902d, dVar3.f5901c, anonymousClass23.f5935b, anonymousClass23.f5934a, 0);
                                    if (d.this.f5902d.f14325o.bo() == 1 && d.this.f5932l != null) {
                                        d.this.f5932l.a(d.this.f5932l.d(), e.HANDLE_DEEPLINK_REFUSE);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                        d dVar4 = d.this;
                        com.anythink.core.common.u.e.b(dVar4.f5902d, dVar4.f5901c, anonymousClass24.f5935b, anonymousClass24.f5934a, 1);
                    }
                };
                w wVar = d.this.f5901c;
                int bO = (wVar == null || wVar.r() == null) ? 1 : d.this.f5901c.r().bO();
                d dVar2 = d.this;
                view.getContext();
                dVar2.i = new com.anythink.core.common.v.a.c(bO, 0);
                d.this.i.a(view, aVar);
            }
        }
    }

    public d(a.C0005a c0005a) {
        super(c0005a);
        this.f5930j = 0L;
        this.f5931k = com.anythink.basead.exoplayer.f.f7344a;
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
        this.f5929h = weakReference;
    }

    public final void a(c cVar) {
        this.f5932l = cVar;
    }

    @Override // com.anythink.basead.b.b.a, com.anythink.basead.b.b.m
    public final n a() {
        k kVar = this.f5903e;
        if (kVar == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        com.anythink.basead.d.j a9 = kVar.a();
        if (a9 == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        a9.f6372k = new com.anythink.basead.d.b();
        com.anythink.basead.d.e b9 = b();
        a9.f6372k.f6288a = b9 != null ? b9.f6300c : "";
        com.anythink.basead.b.b.a(23, this.f5901c, a9);
        if (!TextUtils.isEmpty(this.f5901c.G())) {
            String G7 = this.f5901c.G();
            String str = this.f5902d.f14315d;
            String replaceAll = G7.replaceAll("\\{req_id\\}", str != null ? str : "");
            com.anythink.core.common.o.a().a(this.f5901c);
            com.anythink.core.basead.a.d b10 = com.anythink.core.basead.a.e.b(this.f5900b, replaceAll, this.f5901c, this.f5902d);
            int a10 = b10.a();
            if (a10 == 0) {
                a9.f6372k.f6289b = 1;
            } else if (a10 != 1) {
                a9.f6372k.f6289b = 3;
            } else {
                a9.f6372k.f6289b = 2;
            }
            if (b10.a() == 0) {
                com.anythink.basead.d.a aVar = a9.i;
                if (aVar != null) {
                    aVar.i = true;
                }
                k kVar2 = this.f5903e;
                if (kVar2 != null) {
                    kVar2.b();
                }
                new f(this.f5901c, this.f5902d, replaceAll, a9.i).a();
                com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, replaceAll, "1", 0, 0, b10.b());
                b bVar = this.f5904f;
                if (bVar != null) {
                    bVar.b();
                    this.f5904f.a();
                    this.f5904f.a(true);
                    this.f5904f.c();
                }
                com.anythink.basead.c.a().a(new com.anythink.basead.b.a.b() { // from class: com.anythink.basead.b.b.d.1
                    @Override // com.anythink.basead.b.a.b
                    public final void a(long j9) {
                        long currentTimeMillis = System.currentTimeMillis();
                        d dVar = d.this;
                        x xVar = dVar.f5902d;
                        com.anythink.core.common.u.e.a(xVar, xVar.f14320j, dVar.f5901c, j9, currentTimeMillis);
                    }
                });
                com.anythink.basead.b.b.a(24, this.f5901c, a9);
                if (com.anythink.basead.b.e.f(this.f5901c, this.f5902d) != 1) {
                    String H6 = this.f5901c.H();
                    int K8 = this.f5901c.K();
                    this.f5930j = System.currentTimeMillis();
                    com.anythink.basead.c.a().a(new AnonymousClass2(H6, replaceAll, K8));
                }
                return n.a(true, "DeeplinkClickAction execute success");
            }
            com.anythink.core.common.o.a().b(this.f5901c);
            if (com.anythink.basead.b.b.a(this.f5900b, this.f5901c.I())) {
                com.anythink.basead.b.b.a(28, this.f5901c, a9);
            } else {
                com.anythink.basead.b.b.a(29, this.f5901c, a9);
            }
            com.anythink.core.common.u.e.a(this.f5902d, this.f5901c, replaceAll, "0", 0, b10.a(), b10.b());
        }
        return n.a(false, "DeeplinkClickAction execute fail");
    }

    private void a(String str) {
        String H6 = this.f5901c.H();
        int K8 = this.f5901c.K();
        this.f5930j = System.currentTimeMillis();
        com.anythink.basead.c.a().a(new AnonymousClass2(H6, str, K8));
    }
}
