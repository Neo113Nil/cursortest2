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
    com.anythink.basead.ui.f.a f11418o;

    /* renamed from: p, reason: collision with root package name */
    int f11419p;

    /* renamed from: q, reason: collision with root package name */
    int f11420q;

    /* renamed from: r, reason: collision with root package name */
    private RedPacketPage f11421r;

    public c(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f11419p = this.f11398c.f14954o.aX() / 10;
        this.f11420q = this.f11398c.f14954o.aX() % 10;
        this.f11421r = new RedPacketPage(this.f11396a);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f11397b, this.f11398c);
        this.f11418o = aVar;
        aVar.b(this.f11421r);
        this.f11421r.setOpenIconClickClickAction(this.f11398c.f14954o.aW());
        this.f11421r.setRedPacketClickListener(new b.a() { // from class: com.anythink.basead.ui.c.c.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x000d, code lost:
            
                if (r5.f11422a.f11420q > 0) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0010, code lost:
            
                r1 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
            
                if (r5.f11422a.f11419p > 0) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x001e, code lost:
            
                if (r5.f11422a.f11419p >= 2) goto L10;
             */
            @Override // com.anythink.basead.ui.f.b.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(int i, int i4) {
                boolean z6;
                c.a aVar2;
                boolean z9 = true;
                switch (i4) {
                    case 27:
                        z6 = c.this.f11398c.f14954o.aW() == 2;
                        if (!z6) {
                            c cVar = c.this;
                            com.anythink.basead.ui.f.b.a(cVar.f11408n, true, cVar.f11398c, false);
                        }
                        z9 = z6;
                        break;
                    case 28:
                        break;
                    case 29:
                        break;
                    case 30:
                        z6 = false;
                        break;
                    case 31:
                        break;
                    default:
                        z6 = false;
                        z9 = z6;
                        break;
                }
                if (z9 && (aVar2 = c.this.f11400e) != null) {
                    aVar2.a(i, i4);
                }
                if (z6) {
                    if (c.this.f11421r != null) {
                        am.a(c.this.f11421r);
                        d.a aVar3 = c.this.f11403h;
                        if (aVar3 != null) {
                            aVar3.a(false);
                        }
                    }
                    c.this.f11408n.setVisibility(0);
                    c.this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.c.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.a aVar4 = c.this.f11403h;
                            if (aVar4 != null) {
                                aVar4.b();
                            }
                        }
                    });
                }
            }
        });
        w wVar = this.f11397b;
        if (wVar != null) {
            String x9 = wVar.x();
            w wVar2 = this.f11397b;
            if ((wVar2 instanceof r) && !TextUtils.isEmpty(((r) wVar2).aL())) {
                x9 = ((r) this.f11397b).aL();
            }
            this.f11421r.setAdTitle(TextUtils.isEmpty(x9) ? "" : !TextUtils.isEmpty(this.f11398c.f14954o.aS()) ? this.f11398c.f14954o.aS().replace("{__sender__}", "") : this.f11396a.getResources().getString(q.a(this.f11396a, "myoffer_red_packet_title_text", k.f20423g), x9));
            this.f11421r.setAdBless(this.f11398c.f14954o.aT());
            if (TextUtils.isEmpty(this.f11397b.z())) {
                this.f11421r.setAdIconUrl(this.f11397b.B());
            } else {
                this.f11421r.setAdIconUrl(this.f11397b.z());
            }
            this.f11421r.setAdNotice(this.f11398c.f14954o.aV(), this.f11397b.K());
            this.f11421r.setCTAText(this.f11398c.f14954o.bh());
        }
        viewGroup.addView(this.f11421r, -1, -1);
        b(this.f11398c.f14954o.aR());
        CountDownView countDownView = this.f11408n;
        if (countDownView != null) {
            com.anythink.basead.ui.f.b.a(countDownView, false, this.f11398c, false);
        }
        d.a aVar2 = this.f11403h;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a() {
        super.a();
        d.a aVar = this.f11403h;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j6) {
        super.a(j6);
        if (this.f11406l >= this.f11407m) {
            this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.c.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a aVar = c.this.f11403h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
    }
}
