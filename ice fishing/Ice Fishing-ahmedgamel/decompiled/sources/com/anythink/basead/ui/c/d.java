package com.anythink.basead.ui.c;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.b.j;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: o, reason: collision with root package name */
    SecondEndCardView f11425o;

    /* renamed from: p, reason: collision with root package name */
    com.anythink.basead.ui.f.a f11426p;

    /* renamed from: q, reason: collision with root package name */
    int f11427q;

    /* renamed from: r, reason: collision with root package name */
    boolean f11428r;

    /* renamed from: s, reason: collision with root package name */
    boolean f11429s;

    /* renamed from: t, reason: collision with root package name */
    private View f11430t;

    public d(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
        this.f11427q = 1;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void d() {
        super.d();
        this.f11429s = true;
    }

    @Override // com.anythink.basead.ui.c.a
    public final View f() {
        return this.f11430t;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(final ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f11430t = this.f11402g;
        this.f11427q = this.f11398c.f14954o.aY();
        SecondEndCardView secondEndCardView = new SecondEndCardView(this.f11396a);
        this.f11425o = secondEndCardView;
        secondEndCardView.setAdTitle(this.f11397b.x());
        this.f11425o.setAdDesc(this.f11397b.y());
        if (TextUtils.isEmpty(this.f11397b.z())) {
            this.f11425o.setAdIcon(this.f11397b.B());
        } else {
            this.f11425o.setAdIcon(this.f11397b.z());
        }
        if (TextUtils.isEmpty(this.f11397b.D())) {
            SecondEndCardView secondEndCardView2 = this.f11425o;
            Context context = this.f11396a;
            secondEndCardView2.setCTAText(context.getString(com.anythink.basead.b.e.a(context, this.f11397b)));
        } else {
            this.f11425o.setCTAText(this.f11397b.D());
        }
        boolean z6 = this.f11401f != 1;
        this.f11428r = z6;
        this.f11425o.addApkComplianceElements(!z6);
        if (!this.f11428r) {
            this.f11425o.setBackgroundColor(Color.parseColor("#CC000000"));
        }
        d.a aVar = this.f11403h;
        View c9 = aVar != null ? aVar.c() : null;
        if (c9 == null) {
            c9 = b();
        }
        if (c9 != null) {
            if ((c9 instanceof TextView) && TextUtils.isEmpty(this.f11398c.f14954o.bm())) {
                ((TextView) c9).setText(q.a(this.f11396a, "myoffer_sub_close_default_skip_text", k.f20423g));
            }
            if (c9 instanceof ImageView) {
                c9.setBackgroundResource(q.a(this.f11396a, "myoffer_base_skip_icon", k.f20419c));
            }
            c9.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.d.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CountDownView countDownView;
                    d.a aVar2 = d.this.f11403h;
                    if (aVar2 != null) {
                        aVar2.a(true);
                    }
                    SecondEndCardView secondEndCardView3 = d.this.f11425o;
                    if (secondEndCardView3 != null && secondEndCardView3.getParent() == null) {
                        d dVar = d.this;
                        if (dVar.f11428r) {
                            ViewGroup viewGroup2 = dVar.f11402g;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(4);
                                if (d.this.f11402g.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) d.this.f11402g.getParent()).addView(d.this.f11425o, -1, -1);
                                }
                            }
                        } else {
                            viewGroup.addView(dVar.f11425o, -1, -1);
                        }
                        d dVar2 = d.this;
                        dVar2.f11430t = dVar2.f11425o;
                        d dVar3 = d.this;
                        dVar3.f11426p = new com.anythink.basead.ui.f.a(dVar3.f11397b, dVar3.f11398c);
                        d dVar4 = d.this;
                        dVar4.f11426p.b(dVar4.f11425o);
                        d.this.f11425o.setSecondECClickListener(new b.a() { // from class: com.anythink.basead.ui.c.d.1.1
                            @Override // com.anythink.basead.ui.f.b.a
                            public final void a(int i, int i4) {
                                switch (i4) {
                                    case 36:
                                        break;
                                    case 37:
                                        if (d.this.f11427q < 2) {
                                            return;
                                        }
                                        break;
                                    case j.f6592M /* 38 */:
                                        if (d.this.f11427q < 3) {
                                            return;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                                c.a aVar3 = d.this.f11400e;
                                if (aVar3 != null) {
                                    aVar3.a(i, i4);
                                }
                            }
                        });
                    }
                    d dVar5 = d.this;
                    dVar5.b(dVar5.f11398c.f14954o.ba());
                    d dVar6 = d.this;
                    if (dVar6.f11428r && (countDownView = dVar6.f11408n) != null) {
                        am.a(countDownView);
                        ViewGroup.LayoutParams layoutParams = d.this.f11408n.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
                        layoutParams2.addRule(11);
                        layoutParams2.setMargins(0, q.a(d.this.f11396a, 8.0f), q.a(d.this.f11396a, 8.0f), 0);
                        d dVar7 = d.this;
                        dVar7.f11425o.addCloseView(dVar7.f11408n, layoutParams2);
                    }
                    d.this.a(true);
                }
            });
        }
        this.f11429s = false;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j6) {
        super.a(j6);
        if (this.f11406l >= this.f11407m) {
            com.anythink.basead.ui.f.b.a(this.f11408n, true, this.f11398c, false);
            this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.d.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    if (dVar.f11429s || dVar.f11427q != 4) {
                        d.a aVar = dVar.f11403h;
                        if (aVar != null) {
                            aVar.b();
                            return;
                        }
                        return;
                    }
                    c.a aVar2 = dVar.f11400e;
                    if (aVar2 != null) {
                        aVar2.a(1, 39);
                    }
                }
            });
        }
    }
}
