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
    SecondEndCardView f10639o;

    /* renamed from: p, reason: collision with root package name */
    com.anythink.basead.ui.f.a f10640p;

    /* renamed from: q, reason: collision with root package name */
    int f10641q;

    /* renamed from: r, reason: collision with root package name */
    boolean f10642r;

    /* renamed from: s, reason: collision with root package name */
    boolean f10643s;

    /* renamed from: t, reason: collision with root package name */
    private View f10644t;

    public d(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
        this.f10641q = 1;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void d() {
        super.d();
        this.f10643s = true;
    }

    @Override // com.anythink.basead.ui.c.a
    public final View f() {
        return this.f10644t;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(final ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10644t = this.f10616g;
        this.f10641q = this.f10612c.f14168o.aY();
        SecondEndCardView secondEndCardView = new SecondEndCardView(this.f10610a);
        this.f10639o = secondEndCardView;
        secondEndCardView.setAdTitle(this.f10611b.x());
        this.f10639o.setAdDesc(this.f10611b.y());
        if (TextUtils.isEmpty(this.f10611b.z())) {
            this.f10639o.setAdIcon(this.f10611b.B());
        } else {
            this.f10639o.setAdIcon(this.f10611b.z());
        }
        if (TextUtils.isEmpty(this.f10611b.D())) {
            SecondEndCardView secondEndCardView2 = this.f10639o;
            Context context = this.f10610a;
            secondEndCardView2.setCTAText(context.getString(com.anythink.basead.b.e.a(context, this.f10611b)));
        } else {
            this.f10639o.setCTAText(this.f10611b.D());
        }
        boolean z3 = this.f10615f != 1;
        this.f10642r = z3;
        this.f10639o.addApkComplianceElements(!z3);
        if (!this.f10642r) {
            this.f10639o.setBackgroundColor(Color.parseColor("#CC000000"));
        }
        d.a aVar = this.f10617h;
        View c9 = aVar != null ? aVar.c() : null;
        if (c9 == null) {
            c9 = b();
        }
        if (c9 != null) {
            if ((c9 instanceof TextView) && TextUtils.isEmpty(this.f10612c.f14168o.bm())) {
                ((TextView) c9).setText(q.a(this.f10610a, "myoffer_sub_close_default_skip_text", k.f19636g));
            }
            if (c9 instanceof ImageView) {
                c9.setBackgroundResource(q.a(this.f10610a, "myoffer_base_skip_icon", k.f19632c));
            }
            c9.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.d.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CountDownView countDownView;
                    d.a aVar2 = d.this.f10617h;
                    if (aVar2 != null) {
                        aVar2.a(true);
                    }
                    SecondEndCardView secondEndCardView3 = d.this.f10639o;
                    if (secondEndCardView3 != null && secondEndCardView3.getParent() == null) {
                        d dVar = d.this;
                        if (dVar.f10642r) {
                            ViewGroup viewGroup2 = dVar.f10616g;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(4);
                                if (d.this.f10616g.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) d.this.f10616g.getParent()).addView(d.this.f10639o, -1, -1);
                                }
                            }
                        } else {
                            viewGroup.addView(dVar.f10639o, -1, -1);
                        }
                        d dVar2 = d.this;
                        dVar2.f10644t = dVar2.f10639o;
                        d dVar3 = d.this;
                        dVar3.f10640p = new com.anythink.basead.ui.f.a(dVar3.f10611b, dVar3.f10612c);
                        d dVar4 = d.this;
                        dVar4.f10640p.b(dVar4.f10639o);
                        d.this.f10639o.setSecondECClickListener(new b.a() { // from class: com.anythink.basead.ui.c.d.1.1
                            @Override // com.anythink.basead.ui.f.b.a
                            public final void a(int i, int i6) {
                                switch (i6) {
                                    case 36:
                                        break;
                                    case 37:
                                        if (d.this.f10641q < 2) {
                                            return;
                                        }
                                        break;
                                    case j.f5806M /* 38 */:
                                        if (d.this.f10641q < 3) {
                                            return;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                                c.a aVar3 = d.this.f10614e;
                                if (aVar3 != null) {
                                    aVar3.a(i, i6);
                                }
                            }
                        });
                    }
                    d dVar5 = d.this;
                    dVar5.b(dVar5.f10612c.f14168o.ba());
                    d dVar6 = d.this;
                    if (dVar6.f10642r && (countDownView = dVar6.f10622n) != null) {
                        am.a(countDownView);
                        ViewGroup.LayoutParams layoutParams = d.this.f10622n.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
                        layoutParams2.addRule(11);
                        layoutParams2.setMargins(0, q.a(d.this.f10610a, 8.0f), q.a(d.this.f10610a, 8.0f), 0);
                        d dVar7 = d.this;
                        dVar7.f10639o.addCloseView(dVar7.f10622n, layoutParams2);
                    }
                    d.this.a(true);
                }
            });
        }
        this.f10643s = false;
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j6) {
        super.a(j6);
        if (this.f10620l >= this.f10621m) {
            com.anythink.basead.ui.f.b.a(this.f10622n, true, this.f10612c, false);
            this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.d.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar = d.this;
                    if (dVar.f10643s || dVar.f10641q != 4) {
                        d.a aVar = dVar.f10617h;
                        if (aVar != null) {
                            aVar.b();
                            return;
                        }
                        return;
                    }
                    c.a aVar2 = dVar.f10614e;
                    if (aVar2 != null) {
                        aVar2.a(1, 39);
                    }
                }
            });
        }
    }
}
