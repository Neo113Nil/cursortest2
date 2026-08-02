package com.anythink.basead.ui.c;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.CountDownView;
import com.anythink.basead.ui.component.emdcardimprove.RPSecondEndCardView;
import com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.basead.ui.simpleview.SimplePlayer;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: o, reason: collision with root package name */
    ViewGroup f11435o;

    /* renamed from: p, reason: collision with root package name */
    SimplePlayer f11436p;

    /* renamed from: q, reason: collision with root package name */
    SecondEndCardView f11437q;

    /* renamed from: r, reason: collision with root package name */
    com.anythink.basead.ui.f.a f11438r;

    /* renamed from: s, reason: collision with root package name */
    int f11439s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11440t;

    public e(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
        this.f11440t = false;
        this.f11439s = 1;
    }

    public static /* synthetic */ boolean a(e eVar) {
        eVar.f11440t = true;
        return true;
    }

    private void b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f11396a).inflate(q.a(this.f11396a, "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        viewGroup.addView(inflate, layoutParams);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        String str;
        super.a(viewGroup);
        this.f11435o = viewGroup;
        y r9 = this.f11397b.r();
        if (r9 != null) {
            str = r9.bb();
            this.f11439s = r9.bg();
        } else {
            str = "";
        }
        b(this.f11398c.f14954o.aR());
        CountDownView countDownView = this.f11408n;
        Context context = this.f11396a;
        countDownView.setCountDownEndDrawable(am.a(context, q.a(context, "myoffer_base_skip_icon", k.f20419c)));
        SimplePlayer simplePlayer = new SimplePlayer(this.f11396a);
        this.f11436p = simplePlayer;
        viewGroup.addView(simplePlayer, -1, -1);
        this.f11436p.load(str, true);
        this.f11436p.setSimplePlayerViewListener(new SimplePlayer.a() { // from class: com.anythink.basead.ui.c.e.1
            @Override // com.anythink.basead.ui.simpleview.SimplePlayer.a
            public final void a() {
                e.a(e.this);
            }

            @Override // com.anythink.basead.ui.simpleview.SimplePlayer.a
            public final void b() {
                SimplePlayer simplePlayer2;
                if (!e.this.f11440t && (simplePlayer2 = e.this.f11436p) != null) {
                    am.a(simplePlayer2);
                }
                e.this.e();
                e eVar = e.this;
                eVar.f11408n.refresh(eVar.f11407m);
                CountDownView countDownView2 = e.this.f11408n;
                if (countDownView2 != null) {
                    countDownView2.setVisibility(0);
                    e eVar2 = e.this;
                    CountDownView countDownView3 = eVar2.f11408n;
                    Context context2 = eVar2.f11396a;
                    countDownView3.setCountDownEndDrawable(am.a(context2, q.a(context2, "myoffer_base_close_icon", k.f20419c)));
                    e.this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.a aVar = e.this.f11403h;
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    });
                }
            }
        });
        this.f11436p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a aVar = e.this.f11400e;
                if (aVar != null) {
                    aVar.a(14, 32);
                }
            }
        });
        RPSecondEndCardView rPSecondEndCardView = new RPSecondEndCardView(this.f11396a);
        this.f11437q = rPSecondEndCardView;
        if (r9 != null) {
            rPSecondEndCardView.setAdTitle(r9.bd());
            this.f11437q.setAdIcon(r9.bc());
            this.f11437q.setAdPoster(r9.be());
            String bf = r9.bf();
            if (!TextUtils.isEmpty(bf)) {
                this.f11437q.setCTAText(bf);
            } else if (this.f11397b.K() == 4) {
                this.f11437q.setCTAText(this.f11396a.getResources().getString(q.a(this.f11396a, "myoffer_rp_second_hint_link4_text", k.f20423g)));
            }
        }
        this.f11437q.setBackgroundColor(Color.parseColor("#CC000000"));
        View inflate = LayoutInflater.from(this.f11396a).inflate(q.a(this.f11396a, "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        viewGroup.addView(inflate, layoutParams);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f11397b, this.f11398c);
        this.f11438r = aVar;
        aVar.b(viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j6) {
        super.a(j6);
        if (this.f11406l >= this.f11407m) {
            com.anythink.basead.ui.f.b.a(this.f11408n, true, this.f11398c, false);
            this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar = e.this;
                    CountDownView countDownView = eVar.f11408n;
                    Context context = eVar.f11396a;
                    countDownView.setCountDownEndDrawable(am.a(context, q.a(context, "myoffer_base_close_icon", k.f20419c)));
                    e.this.f11408n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.3.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d.a aVar = e.this.f11403h;
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    });
                    SimplePlayer simplePlayer = e.this.f11436p;
                    if (simplePlayer != null) {
                        simplePlayer.stopVideo();
                    }
                    d.a aVar = e.this.f11403h;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                    SecondEndCardView secondEndCardView = e.this.f11437q;
                    if (secondEndCardView != null && secondEndCardView.getParent() == null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        e eVar2 = e.this;
                        eVar2.f11435o.addView(eVar2.f11437q, 1, layoutParams);
                        e.this.f11437q.setSecondECClickListener(new b.a() { // from class: com.anythink.basead.ui.c.e.3.2
                            @Override // com.anythink.basead.ui.f.b.a
                            public final void a(int i, int i4) {
                                switch (i4) {
                                    case 33:
                                    case 35:
                                        if (e.this.f11439s < 2) {
                                            return;
                                        }
                                        break;
                                    case 34:
                                        break;
                                    default:
                                        return;
                                }
                                c.a aVar2 = e.this.f11400e;
                                if (aVar2 != null) {
                                    aVar2.a(i, i4);
                                }
                            }
                        });
                    }
                    e eVar3 = e.this;
                    com.anythink.basead.ui.f.b.a(eVar3.f11408n, true, eVar3.f11398c, false);
                    e.this.a(true);
                }
            });
        }
    }
}
