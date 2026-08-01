package com.anythink.basead.ui.component.emdcardimprove;

import D.y;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.basead.ui.a.a.e;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class RedPacketPage extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    RelativeLayout f10709a;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f10710b;

    /* renamed from: c, reason: collision with root package name */
    RoundImageView f10711c;

    /* renamed from: d, reason: collision with root package name */
    RoundImageView f10712d;

    /* renamed from: e, reason: collision with root package name */
    TextView f10713e;

    /* renamed from: f, reason: collision with root package name */
    TextView f10714f;

    /* renamed from: g, reason: collision with root package name */
    TextView f10715g;

    /* renamed from: h, reason: collision with root package name */
    TextView f10716h;
    TextView i;

    /* renamed from: j, reason: collision with root package name */
    ImageView f10717j;

    /* renamed from: k, reason: collision with root package name */
    ImageView f10718k;

    /* renamed from: l, reason: collision with root package name */
    ImageView f10719l;

    /* renamed from: m, reason: collision with root package name */
    ImageView f10720m;

    /* renamed from: n, reason: collision with root package name */
    TextView f10721n;

    /* renamed from: o, reason: collision with root package name */
    ValueAnimator f10722o;

    /* renamed from: p, reason: collision with root package name */
    ValueAnimator f10723p;

    /* renamed from: q, reason: collision with root package name */
    b.a f10724q;

    /* renamed from: r, reason: collision with root package name */
    private e f10725r;

    /* renamed from: s, reason: collision with root package name */
    private List<Integer> f10726s;

    /* renamed from: t, reason: collision with root package name */
    private int f10727t;

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = RedPacketPage.this.f10718k;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.a aVar = RedPacketPage.this.f10724q;
            if (aVar != null) {
                aVar.a(14, 27);
            }
            RedPacketPage.this.stopAnimation();
            if (RedPacketPage.this.f10727t == 1) {
                RedPacketPage.this.f10717j.setVisibility(8);
                RedPacketPage.this.f10720m.setVisibility(0);
                RedPacketPage redPacketPage = RedPacketPage.this;
                redPacketPage.f10722o = ValueAnimator.ofInt(0, redPacketPage.f10726s.size() - 1);
                RedPacketPage.this.f10722o.setDuration(r5.f10726s.size() * 80);
                RedPacketPage.this.f10722o.setRepeatCount(1);
                RedPacketPage.this.f10722o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        RedPacketPage redPacketPage2 = RedPacketPage.this;
                        if (redPacketPage2.f10720m == null || intValue >= redPacketPage2.f10726s.size()) {
                            return;
                        }
                        RedPacketPage redPacketPage3 = RedPacketPage.this;
                        redPacketPage3.f10720m.setImageResource(((Integer) redPacketPage3.f10726s.get(intValue)).intValue());
                    }
                });
                RedPacketPage.this.f10722o.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        final int y7 = (int) RedPacketPage.this.f10709a.getY();
                        RedPacketPage.this.f10723p = ValueAnimator.ofInt(0, y7);
                        RedPacketPage.this.f10723p.setDuration(300L);
                        RedPacketPage.this.f10723p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.2.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                float f3 = -intValue;
                                RedPacketPage.this.f10718k.setTranslationY(f3);
                                RedPacketPage.this.f10711c.setTranslationY(f3);
                                RedPacketPage.this.f10713e.setTranslationY(f3);
                                RedPacketPage.this.f10716h.setTranslationY(f3);
                                RedPacketPage.this.f10718k.setTranslationY(f3);
                                float f9 = intValue;
                                RedPacketPage.this.f10719l.setTranslationY(f9);
                                RelativeLayout relativeLayout = RedPacketPage.this.f10710b;
                                if (relativeLayout != null) {
                                    relativeLayout.setAlpha(((f9 * 1.0f) / y7) * 0.8f);
                                }
                            }
                        });
                        RedPacketPage.this.f10723p.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.2.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator2) {
                                super.onAnimationEnd(animator2);
                                RelativeLayout relativeLayout = RedPacketPage.this.f10709a;
                                if (relativeLayout != null) {
                                    relativeLayout.setVisibility(8);
                                }
                                RelativeLayout relativeLayout2 = RedPacketPage.this.f10710b;
                                if (relativeLayout2 != null) {
                                    relativeLayout2.setAlpha(1.0f);
                                    RedPacketPage.this.f10710b.setVisibility(0);
                                }
                                RedPacketPage redPacketPage2 = RedPacketPage.this;
                                redPacketPage2.a(redPacketPage2.f10721n);
                            }
                        });
                        RelativeLayout relativeLayout = RedPacketPage.this.f10710b;
                        if (relativeLayout != null) {
                            relativeLayout.setAlpha(0.0f);
                            RedPacketPage.this.f10710b.setVisibility(0);
                        }
                        RedPacketPage.this.f10723p.start();
                        RedPacketPage.this.f10720m.setVisibility(8);
                    }
                });
                RedPacketPage.this.f10722o.start();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.a aVar = RedPacketPage.this.f10724q;
            if (aVar != null) {
                aVar.a(14, 28);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.a aVar = RedPacketPage.this.f10724q;
            if (aVar != null) {
                aVar.a(14, 29);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.a aVar = RedPacketPage.this.f10724q;
            if (aVar != null) {
                aVar.a(14, 30);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$6, reason: invalid class name */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.a aVar = RedPacketPage.this.f10724q;
            if (aVar != null) {
                aVar.a(14, 31);
            }
        }
    }

    public RedPacketPage(Context context) {
        this(context, null);
    }

    private void c() {
        e eVar = this.f10725r;
        if (eVar != null) {
            eVar.b();
        }
    }

    private void d() {
        e eVar = this.f10725r;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            e eVar = this.f10725r;
            if (eVar != null) {
                eVar.c();
                return;
            }
            return;
        }
        e eVar2 = this.f10725r;
        if (eVar2 != null) {
            eVar2.b();
        }
    }

    public void setAdBless(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10716h.setText(str);
        this.i.setText(str);
    }

    public void setAdIconUrl(final String str) {
        if (this.f10711c == null || this.f10712d == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f10711c.setVisibility(8);
            this.f10712d.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = this.f10711c.getLayoutParams();
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, str), layoutParams.width, layoutParams.height, new b.a() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.7
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str2, String str3) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str2, Bitmap bitmap) {
                    if (TextUtils.equals(str2, str)) {
                        RoundImageView roundImageView = RedPacketPage.this.f10711c;
                        if (roundImageView != null) {
                            roundImageView.setImageBitmap(bitmap);
                        }
                        RoundImageView roundImageView2 = RedPacketPage.this.f10712d;
                        if (roundImageView2 != null) {
                            roundImageView2.setImageBitmap(bitmap);
                        }
                    }
                }
            });
        }
    }

    public void setAdNotice(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f10715g.setText(str);
        } else if (i == 4) {
            this.f10715g.setText(getResources().getString(q.a(getContext(), "myoffer_red_packet_hint_link4_text", k.f19636g)));
        }
    }

    public void setAdTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10713e.setText(str);
        this.f10714f.setText(str);
    }

    public void setCTAText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10721n.setText(str);
    }

    public void setOpenIconClickClickAction(int i) {
        this.f10727t = i;
    }

    public void setRedPacketClickListener(b.a aVar) {
        this.f10724q = aVar;
    }

    public void stopAnimation() {
        e eVar = this.f10725r;
        if (eVar != null) {
            eVar.d();
            this.f10725r = null;
        }
        ValueAnimator valueAnimator = this.f10722o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10722o = null;
        }
        ValueAnimator valueAnimator2 = this.f10723p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f10723p = null;
        }
    }

    public RedPacketPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        this.f10717j.setOnClickListener(new AnonymousClass2());
        this.f10709a.setOnClickListener(new AnonymousClass3());
        setOnClickListener(new AnonymousClass4());
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f10721n.setOnClickListener(anonymousClass5);
        this.f10714f.setOnClickListener(anonymousClass5);
        this.f10712d.setOnClickListener(anonymousClass5);
        this.i.setOnClickListener(anonymousClass5);
        this.f10715g.setOnClickListener(anonymousClass5);
        this.f10710b.setOnClickListener(new AnonymousClass6());
    }

    public RedPacketPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_endcard_improve_red_packet", "layout"), this);
        this.f10710b = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_red_packet_receive_page", "id"));
        this.f10709a = (RelativeLayout) f.j(this, "myoffer_red_packet_cover", "id");
        this.f10718k = (ImageView) f.j(this, "myoffer_red_packet_half_topbg", "id");
        this.f10719l = (ImageView) f.j(this, "myoffer_red_packet_half_bottombg", "id");
        this.f10711c = (RoundImageView) f.j(this, "myoffer_red_packet_ad_icon", "id");
        this.f10712d = (RoundImageView) f.j(this, "myoffer_red_packet_ad_icon_2", "id");
        this.f10713e = (TextView) f.j(this, "myoffer_red_packet_ad_title", "id");
        this.f10714f = (TextView) f.j(this, "myoffer_red_packet_ad_title_2", "id");
        this.f10716h = (TextView) f.j(this, "myoffer_red_packet_ad_bless", "id");
        this.i = (TextView) f.j(this, "myoffer_red_packet_ad_bless_2", "id");
        this.f10715g = (TextView) f.j(this, "myoffer_red_packet_ad_hint_link", "id");
        this.f10717j = (ImageView) f.j(this, "myoffer_red_packet_open_icon", "id");
        this.f10720m = (ImageView) f.j(this, "myoffer_red_packet_anim_open_icon", "id");
        this.f10721n = (TextView) f.j(this, "myoffer_red_packet_cta", "id");
        this.f10711c.setRadiusInDip(18);
        this.f10711c.setNeedRadiu(true);
        this.f10712d.setRadiusInDip(12);
        this.f10712d.setNeedRadiu(true);
        ArrayList arrayList = new ArrayList();
        this.f10726s = arrayList;
        arrayList.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame1", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame2", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame3", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame4", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame5", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame6", k.f19632c)));
        a(this.f10717j);
        this.f10717j.setOnClickListener(new AnonymousClass2());
        this.f10709a.setOnClickListener(new AnonymousClass3());
        setOnClickListener(new AnonymousClass4());
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f10721n.setOnClickListener(anonymousClass5);
        this.f10714f.setOnClickListener(anonymousClass5);
        this.f10712d.setOnClickListener(anonymousClass5);
        this.i.setOnClickListener(anonymousClass5);
        this.f10715g.setOnClickListener(anonymousClass5);
        this.f10710b.setOnClickListener(new AnonymousClass6());
        String a9 = g.a().a(b.d.f12116a);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        y.f().a(new com.anythink.core.common.res.e(3, a9), new AnonymousClass1());
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_endcard_improve_red_packet", "layout"), this);
        this.f10710b = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_red_packet_receive_page", "id"));
        this.f10709a = (RelativeLayout) f.j(this, "myoffer_red_packet_cover", "id");
        this.f10718k = (ImageView) f.j(this, "myoffer_red_packet_half_topbg", "id");
        this.f10719l = (ImageView) f.j(this, "myoffer_red_packet_half_bottombg", "id");
        this.f10711c = (RoundImageView) f.j(this, "myoffer_red_packet_ad_icon", "id");
        this.f10712d = (RoundImageView) f.j(this, "myoffer_red_packet_ad_icon_2", "id");
        this.f10713e = (TextView) f.j(this, "myoffer_red_packet_ad_title", "id");
        this.f10714f = (TextView) f.j(this, "myoffer_red_packet_ad_title_2", "id");
        this.f10716h = (TextView) f.j(this, "myoffer_red_packet_ad_bless", "id");
        this.i = (TextView) f.j(this, "myoffer_red_packet_ad_bless_2", "id");
        this.f10715g = (TextView) f.j(this, "myoffer_red_packet_ad_hint_link", "id");
        this.f10717j = (ImageView) f.j(this, "myoffer_red_packet_open_icon", "id");
        this.f10720m = (ImageView) f.j(this, "myoffer_red_packet_anim_open_icon", "id");
        this.f10721n = (TextView) f.j(this, "myoffer_red_packet_cta", "id");
        this.f10711c.setRadiusInDip(18);
        this.f10711c.setNeedRadiu(true);
        this.f10712d.setRadiusInDip(12);
        this.f10712d.setNeedRadiu(true);
        ArrayList arrayList = new ArrayList();
        this.f10726s = arrayList;
        arrayList.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame1", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame2", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame3", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame4", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame5", k.f19632c)));
        this.f10726s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame6", k.f19632c)));
        a(this.f10717j);
        this.f10717j.setOnClickListener(new AnonymousClass2());
        this.f10709a.setOnClickListener(new AnonymousClass3());
        setOnClickListener(new AnonymousClass4());
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f10721n.setOnClickListener(anonymousClass5);
        this.f10714f.setOnClickListener(anonymousClass5);
        this.f10712d.setOnClickListener(anonymousClass5);
        this.i.setOnClickListener(anonymousClass5);
        this.f10715g.setOnClickListener(anonymousClass5);
        this.f10710b.setOnClickListener(new AnonymousClass6());
        String a9 = g.a().a(b.d.f12116a);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        y.f().a(new com.anythink.core.common.res.e(3, a9), new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (view == null) {
            return;
        }
        e eVar = this.f10725r;
        if (eVar != null) {
            eVar.d();
        }
        e eVar2 = new e(view);
        this.f10725r = eVar2;
        eVar2.g();
        this.f10725r.a();
    }
}
