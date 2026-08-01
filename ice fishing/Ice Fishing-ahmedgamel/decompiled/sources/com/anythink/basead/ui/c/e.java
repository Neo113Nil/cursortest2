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
    ViewGroup f10649o;

    /* renamed from: p, reason: collision with root package name */
    SimplePlayer f10650p;

    /* renamed from: q, reason: collision with root package name */
    SecondEndCardView f10651q;

    /* renamed from: r, reason: collision with root package name */
    com.anythink.basead.ui.f.a f10652r;

    /* renamed from: s, reason: collision with root package name */
    int f10653s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10654t;

    public e(Context context, w wVar, x xVar, c.a aVar, int i, ViewGroup viewGroup) {
        super(context, wVar, xVar, aVar, i, viewGroup);
        this.f10654t = false;
        this.f10653s = 1;
    }

    public static /* synthetic */ boolean a(e eVar) {
        eVar.f10654t = true;
        return true;
    }

    private void b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f10610a).inflate(q.a(this.f10610a, "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        viewGroup.addView(inflate, layoutParams);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(ViewGroup viewGroup) {
        String str;
        super.a(viewGroup);
        this.f10649o = viewGroup;
        y r9 = this.f10611b.r();
        if (r9 != null) {
            str = r9.bb();
            this.f10653s = r9.bg();
        } else {
            str = "";
        }
        b(this.f10612c.f14168o.aR());
        CountDownView countDownView = this.f10622n;
        Context context = this.f10610a;
        countDownView.setCountDownEndDrawable(am.a(context, q.a(context, "myoffer_base_skip_icon", k.f19632c)));
        SimplePlayer simplePlayer = new SimplePlayer(this.f10610a);
        this.f10650p = simplePlayer;
        viewGroup.addView(simplePlayer, -1, -1);
        this.f10650p.load(str, true);
        this.f10650p.setSimplePlayerViewListener(new SimplePlayer.a() { // from class: com.anythink.basead.ui.c.e.1
            @Override // com.anythink.basead.ui.simpleview.SimplePlayer.a
            public final void a() {
                e.a(e.this);
            }

            @Override // com.anythink.basead.ui.simpleview.SimplePlayer.a
            public final void b() {
                SimplePlayer simplePlayer2;
                if (!e.this.f10654t && (simplePlayer2 = e.this.f10650p) != null) {
                    am.a(simplePlayer2);
                }
                e.this.e();
                e eVar = e.this;
                eVar.f10622n.refresh(eVar.f10621m);
                CountDownView countDownView2 = e.this.f10622n;
                if (countDownView2 != null) {
                    countDownView2.setVisibility(0);
                    e eVar2 = e.this;
                    CountDownView countDownView3 = eVar2.f10622n;
                    Context context2 = eVar2.f10610a;
                    countDownView3.setCountDownEndDrawable(am.a(context2, q.a(context2, "myoffer_base_close_icon", k.f19632c)));
                    e.this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d.a aVar = e.this.f10617h;
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    });
                }
            }
        });
        this.f10650p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.a aVar = e.this.f10614e;
                if (aVar != null) {
                    aVar.a(14, 32);
                }
            }
        });
        RPSecondEndCardView rPSecondEndCardView = new RPSecondEndCardView(this.f10610a);
        this.f10651q = rPSecondEndCardView;
        if (r9 != null) {
            rPSecondEndCardView.setAdTitle(r9.bd());
            this.f10651q.setAdIcon(r9.bc());
            this.f10651q.setAdPoster(r9.be());
            String bf = r9.bf();
            if (!TextUtils.isEmpty(bf)) {
                this.f10651q.setCTAText(bf);
            } else if (this.f10611b.K() == 4) {
                this.f10651q.setCTAText(this.f10610a.getResources().getString(q.a(this.f10610a, "myoffer_rp_second_hint_link4_text", k.f19636g)));
            }
        }
        this.f10651q.setBackgroundColor(Color.parseColor("#CC000000"));
        View inflate = LayoutInflater.from(this.f10610a).inflate(q.a(this.f10610a, "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        viewGroup.addView(inflate, layoutParams);
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10611b, this.f10612c);
        this.f10652r = aVar;
        aVar.b(viewGroup);
    }

    @Override // com.anythink.basead.ui.c.a
    public final void a(long j6) {
        super.a(j6);
        if (this.f10620l >= this.f10621m) {
            com.anythink.basead.ui.f.b.a(this.f10622n, true, this.f10612c, false);
            this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar = e.this;
                    CountDownView countDownView = eVar.f10622n;
                    Context context = eVar.f10610a;
                    countDownView.setCountDownEndDrawable(am.a(context, q.a(context, "myoffer_base_close_icon", k.f19632c)));
                    e.this.f10622n.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.c.e.3.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d.a aVar = e.this.f10617h;
                            if (aVar != null) {
                                aVar.b();
                            }
                        }
                    });
                    SimplePlayer simplePlayer = e.this.f10650p;
                    if (simplePlayer != null) {
                        simplePlayer.stopVideo();
                    }
                    d.a aVar = e.this.f10617h;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                    SecondEndCardView secondEndCardView = e.this.f10651q;
                    if (secondEndCardView != null && secondEndCardView.getParent() == null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        e eVar2 = e.this;
                        eVar2.f10649o.addView(eVar2.f10651q, 1, layoutParams);
                        e.this.f10651q.setSecondECClickListener(new b.a() { // from class: com.anythink.basead.ui.c.e.3.2
                            @Override // com.anythink.basead.ui.f.b.a
                            public final void a(int i, int i6) {
                                switch (i6) {
                                    case 33:
                                    case 35:
                                        if (e.this.f10653s < 2) {
                                            return;
                                        }
                                        break;
                                    case 34:
                                        break;
                                    default:
                                        return;
                                }
                                c.a aVar2 = e.this.f10614e;
                                if (aVar2 != null) {
                                    aVar2.a(i, i6);
                                }
                            }
                        });
                    }
                    e eVar3 = e.this;
                    com.anythink.basead.ui.f.b.a(eVar3.f10622n, true, eVar3.f10612c, false);
                    e.this.a(true);
                }
            });
        }
    }
}
