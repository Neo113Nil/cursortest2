package com.anythink.basead.ui.c;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.component.emdcardimprove.RedPacketPage;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: o, reason: collision with root package name */
    com.anythink.basead.ui.f.a f10632o;

    /* renamed from: p, reason: collision with root package name */
    int f10633p;

    /* renamed from: q, reason: collision with root package name */
    int f10634q;

    /* renamed from: r, reason: collision with root package name */
    private RedPacketPage f10635r;

    public c(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10633p = this.f10612c.f14168o.aX() / 10;
        this.f10634q = this.f10612c.f14168o.aX() % 10;
        this.f10635r = new RedPacketPage(this.f10610a);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10611b, this.f10612c);
        this.f10632o = aVar;
        aVar.b(this.f10635r);
        this.f10635r.setOpenIconClickClickAction(this.f10612c.f14168o.aW());
        this.f10635r.setRedPacketClickListener(new b.a() { // from class: com.anythink.basead.ui.c.c.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x000d, code lost:
            
                if (r5.f10636a.f10634q > 0) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0010, code lost:
            
                r1 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
            
                if (r5.f10636a.f10633p > 0) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x001e, code lost:
            
                if (r5.f10636a.f10633p >= 2) goto L10;
             */
            @Override // com.anythink.basead.ui.f.b.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i, int i6) {
                boolean z3;
                c.a aVar2;
                boolean z6 = true;
                switch (i6) {
                    case 27:
                        z3 = c.this.f10612c.f14168o.aW() == 2;
                        if (!z3) {
                            c cVar = c.this;
                            com.anythink.basead.ui.f.b.a(cVar.f10622n, true, cVar.f10612c, false);
                        }
                        z6 = z3;
                        break;
                    case 28:
                        break;
                    case 29:
                        break;
                    case 30:
                        z3 = false;
                        break;
                    case 31:
                        break;
                    default:
                        z3 = false;
                        z6 = z3;
                        break;
                }
                if (z6 && (aVar2 = c.this.f10614e) != null) {
                    aVar2.a(i, i6);
                }
                if (z3) {
                    if (c.this.f10635r != null) {
                        am.a(c.this.f10635r);
                        d.a aVar3 = c.this.f10617h;
                        if (aVar3 != null) {
                            aVar3.a(false);
                        }
                    }
                    c.this.f10622n.setVisibility(0);
                    c.this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.c.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.a aVar4 = c.this.f10617h;
                            if (aVar4 != null) {
                                aVar4.b();
                            }
                        }
                    });
                }
            }
        });
        w wVar = this.f10611b;
        if (wVar != null) {
            String x9 = wVar.x();
            w wVar2 = this.f10611b;
            if ((wVar2 instanceof r) && !TextUtils.isEmpty(((r) wVar2).aL())) {
                x9 = ((r) this.f10611b).aL();
            }
            this.f10635r.setAdTitle(TextUtils.isEmpty(x9) ? "" : !TextUtils.isEmpty(this.f10612c.f14168o.aS()) ? this.f10612c.f14168o.aS().replace("{__sender__}", "") : this.f10610a.getResources().getString(q.a(this.f10610a, "myoffer_red_packet_title_text", k.f19636g), x9));
            this.f10635r.setAdBless(this.f10612c.f14168o.aT());
            if (TextUtils.isEmpty(this.f10611b.z())) {
                this.f10635r.setAdIconUrl(this.f10611b.B());
            } else {
                this.f10635r.setAdIconUrl(this.f10611b.z());
            }
            this.f10635r.setAdNotice(this.f10612c.f14168o.aV(), this.f10611b.K());
            this.f10635r.setCTAText(this.f10612c.f14168o.bh());
        }
        viewGroup.addView(this.f10635r, -1, -1);
        b(this.f10612c.f14168o.aR());
        CountDownView countDownView = this.f10622n;
        if (countDownView != null) {
            com.anythink.basead.ui.f.b.a(countDownView, false, this.f10612c, false);
        }
        d.a aVar2 = this.f10617h;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a() {
        super.a();
        d.a aVar = this.f10617h;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j6) {
        super.a(j6);
        if (this.f10620l >= this.f10621m) {
            this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.c.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a aVar = c.this.f10617h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
    }
}
