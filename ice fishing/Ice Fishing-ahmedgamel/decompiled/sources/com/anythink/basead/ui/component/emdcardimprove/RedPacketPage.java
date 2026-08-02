package com.anythink.basead.ui.component.emdcardimprove;

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
    RelativeLayout f11495a;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f11496b;

    /* renamed from: c, reason: collision with root package name */
    RoundImageView f11497c;

    /* renamed from: d, reason: collision with root package name */
    RoundImageView f11498d;

    /* renamed from: e, reason: collision with root package name */
    TextView f11499e;

    /* renamed from: f, reason: collision with root package name */
    TextView f11500f;

    /* renamed from: g, reason: collision with root package name */
    TextView f11501g;

    /* renamed from: h, reason: collision with root package name */
    TextView f11502h;
    TextView i;

    /* renamed from: j, reason: collision with root package name */
    ImageView f11503j;

    /* renamed from: k, reason: collision with root package name */
    ImageView f11504k;

    /* renamed from: l, reason: collision with root package name */
    ImageView f11505l;

    /* renamed from: m, reason: collision with root package name */
    ImageView f11506m;

    /* renamed from: n, reason: collision with root package name */
    TextView f11507n;

    /* renamed from: o, reason: collision with root package name */
    ValueAnimator f11508o;

    /* renamed from: p, reason: collision with root package name */
    ValueAnimator f11509p;

    /* renamed from: q, reason: collision with root package name */
    b.a f11510q;

    /* renamed from: r, reason: collision with root package name */
    private e f11511r;

    /* renamed from: s, reason: collision with root package name */
    private List<Integer> f11512s;

    /* renamed from: t, reason: collision with root package name */
    private int f11513t;

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            ImageView imageView = RedPacketPage.this.f11504k;
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
            b.a aVar = RedPacketPage.this.f11510q;
            if (aVar != null) {
                aVar.a(14, 27);
            }
            RedPacketPage.this.stopAnimation();
            if (RedPacketPage.this.f11513t == 1) {
                RedPacketPage.this.f11503j.setVisibility(8);
                RedPacketPage.this.f11506m.setVisibility(0);
                RedPacketPage redPacketPage = RedPacketPage.this;
                redPacketPage.f11508o = ValueAnimator.ofInt(0, redPacketPage.f11512s.size() - 1);
                RedPacketPage.this.f11508o.setDuration(r5.f11512s.size() * 80);
                RedPacketPage.this.f11508o.setRepeatCount(1);
                RedPacketPage.this.f11508o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        RedPacketPage redPacketPage2 = RedPacketPage.this;
                        if (redPacketPage2.f11506m == null || intValue >= redPacketPage2.f11512s.size()) {
                            return;
                        }
                        RedPacketPage redPacketPage3 = RedPacketPage.this;
                        redPacketPage3.f11506m.setImageResource(((Integer) redPacketPage3.f11512s.get(intValue)).intValue());
                    }
                });
                RedPacketPage.this.f11508o.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        final int y7 = (int) RedPacketPage.this.f11495a.getY();
                        RedPacketPage.this.f11509p = ValueAnimator.ofInt(0, y7);
                        RedPacketPage.this.f11509p.setDuration(300L);
                        RedPacketPage.this.f11509p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.2.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                float f2 = -intValue;
                                RedPacketPage.this.f11504k.setTranslationY(f2);
                                RedPacketPage.this.f11497c.setTranslationY(f2);
                                RedPacketPage.this.f11499e.setTranslationY(f2);
                                RedPacketPage.this.f11502h.setTranslationY(f2);
                                RedPacketPage.this.f11504k.setTranslationY(f2);
                                float f9 = intValue;
                                RedPacketPage.this.f11505l.setTranslationY(f9);
                                RelativeLayout relativeLayout = RedPacketPage.this.f11496b;
                                if (relativeLayout != null) {
                                    relativeLayout.setAlpha(((f9 * 1.0f) / y7) * 0.8f);
                                }
                            }
                        });
                        RedPacketPage.this.f11509p.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.2.2.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator2) {
                                super.onAnimationEnd(animator2);
                                RelativeLayout relativeLayout = RedPacketPage.this.f11495a;
                                if (relativeLayout != null) {
                                    relativeLayout.setVisibility(8);
                                }
                                RelativeLayout relativeLayout2 = RedPacketPage.this.f11496b;
                                if (relativeLayout2 != null) {
                                    relativeLayout2.setAlpha(1.0f);
                                    RedPacketPage.this.f11496b.setVisibility(0);
                                }
                                RedPacketPage redPacketPage2 = RedPacketPage.this;
                                redPacketPage2.a(redPacketPage2.f11507n);
                            }
                        });
                        RelativeLayout relativeLayout = RedPacketPage.this.f11496b;
                        if (relativeLayout != null) {
                            relativeLayout.setAlpha(0.0f);
                            RedPacketPage.this.f11496b.setVisibility(0);
                        }
                        RedPacketPage.this.f11509p.start();
                        RedPacketPage.this.f11506m.setVisibility(8);
                    }
                });
                RedPacketPage.this.f11508o.start();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.a aVar = RedPacketPage.this.f11510q;
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
            b.a aVar = RedPacketPage.this.f11510q;
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
            b.a aVar = RedPacketPage.this.f11510q;
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
            b.a aVar = RedPacketPage.this.f11510q;
            if (aVar != null) {
                aVar.a(14, 31);
            }
        }
    }

    public RedPacketPage(Context context) {
        this(context, null);
    }

    private void c() {
        e eVar = this.f11511r;
        if (eVar != null) {
            eVar.b();
        }
    }

    private void d() {
        e eVar = this.f11511r;
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
            e eVar = this.f11511r;
            if (eVar != null) {
                eVar.c();
                return;
            }
            return;
        }
        e eVar2 = this.f11511r;
        if (eVar2 != null) {
            eVar2.b();
        }
    }

    public void setAdBless(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11502h.setText(str);
        this.i.setText(str);
    }

    public void setAdIconUrl(final String str) {
        if (this.f11497c == null || this.f11498d == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f11497c.setVisibility(8);
            this.f11498d.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = this.f11497c.getLayoutParams();
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, str), layoutParams.width, layoutParams.height, new b.a() { // from class: com.anythink.basead.ui.component.emdcardimprove.RedPacketPage.7
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str2, String str3) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str2, Bitmap bitmap) {
                    if (TextUtils.equals(str2, str)) {
                        RoundImageView roundImageView = RedPacketPage.this.f11497c;
                        if (roundImageView != null) {
                            roundImageView.setImageBitmap(bitmap);
                        }
                        RoundImageView roundImageView2 = RedPacketPage.this.f11498d;
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
            this.f11501g.setText(str);
        } else if (i == 4) {
            this.f11501g.setText(getResources().getString(q.a(getContext(), "myoffer_red_packet_hint_link4_text", k.f20423g)));
        }
    }

    public void setAdTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11499e.setText(str);
        this.f11500f.setText(str);
    }

    public void setCTAText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11507n.setText(str);
    }

    public void setOpenIconClickClickAction(int i) {
        this.f11513t = i;
    }

    public void setRedPacketClickListener(b.a aVar) {
        this.f11510q = aVar;
    }

    public void stopAnimation() {
        e eVar = this.f11511r;
        if (eVar != null) {
            eVar.d();
            this.f11511r = null;
        }
        ValueAnimator valueAnimator = this.f11508o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11508o = null;
        }
        ValueAnimator valueAnimator2 = this.f11509p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f11509p = null;
        }
    }

    public RedPacketPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        this.f11503j.setOnClickListener(new AnonymousClass2());
        this.f11495a.setOnClickListener(new AnonymousClass3());
        setOnClickListener(new AnonymousClass4());
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f11507n.setOnClickListener(anonymousClass5);
        this.f11500f.setOnClickListener(anonymousClass5);
        this.f11498d.setOnClickListener(anonymousClass5);
        this.i.setOnClickListener(anonymousClass5);
        this.f11501g.setOnClickListener(anonymousClass5);
        this.f11496b.setOnClickListener(new AnonymousClass6());
    }

    public RedPacketPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_endcard_improve_red_packet", "layout"), this);
        this.f11496b = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_red_packet_receive_page", "id"));
        this.f11495a = (RelativeLayout) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_cover", "id");
        this.f11504k = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_half_topbg", "id");
        this.f11505l = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_half_bottombg", "id");
        this.f11497c = (RoundImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_icon", "id");
        this.f11498d = (RoundImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_icon_2", "id");
        this.f11499e = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_title", "id");
        this.f11500f = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_title_2", "id");
        this.f11502h = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_bless", "id");
        this.i = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_bless_2", "id");
        this.f11501g = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_hint_link", "id");
        this.f11503j = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_open_icon", "id");
        this.f11506m = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_anim_open_icon", "id");
        this.f11507n = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_cta", "id");
        this.f11497c.setRadiusInDip(18);
        this.f11497c.setNeedRadiu(true);
        this.f11498d.setRadiusInDip(12);
        this.f11498d.setNeedRadiu(true);
        ArrayList arrayList = new ArrayList();
        this.f11512s = arrayList;
        arrayList.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame1", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame2", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame3", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame4", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame5", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame6", k.f20419c)));
        a(this.f11503j);
        this.f11503j.setOnClickListener(new AnonymousClass2());
        this.f11495a.setOnClickListener(new AnonymousClass3());
        setOnClickListener(new AnonymousClass4());
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f11507n.setOnClickListener(anonymousClass5);
        this.f11500f.setOnClickListener(anonymousClass5);
        this.f11498d.setOnClickListener(anonymousClass5);
        this.i.setOnClickListener(anonymousClass5);
        this.f11501g.setOnClickListener(anonymousClass5);
        this.f11496b.setOnClickListener(new AnonymousClass6());
        String a9 = g.a().a(b.d.f12902a);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        com.IceFishing.LiveIceFishing.k.j().a(new com.anythink.core.common.res.e(3, a9), new AnonymousClass1());
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_endcard_improve_red_packet", "layout"), this);
        this.f11496b = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_red_packet_receive_page", "id"));
        this.f11495a = (RelativeLayout) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_cover", "id");
        this.f11504k = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_half_topbg", "id");
        this.f11505l = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_half_bottombg", "id");
        this.f11497c = (RoundImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_icon", "id");
        this.f11498d = (RoundImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_icon_2", "id");
        this.f11499e = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_title", "id");
        this.f11500f = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_title_2", "id");
        this.f11502h = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_bless", "id");
        this.i = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_bless_2", "id");
        this.f11501g = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_ad_hint_link", "id");
        this.f11503j = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_open_icon", "id");
        this.f11506m = (ImageView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_anim_open_icon", "id");
        this.f11507n = (TextView) com.IceFishing.LiveIceFishing.k.h(this, "myoffer_red_packet_cta", "id");
        this.f11497c.setRadiusInDip(18);
        this.f11497c.setNeedRadiu(true);
        this.f11498d.setRadiusInDip(12);
        this.f11498d.setNeedRadiu(true);
        ArrayList arrayList = new ArrayList();
        this.f11512s = arrayList;
        arrayList.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame1", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame2", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame3", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame4", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame5", k.f20419c)));
        this.f11512s.add(Integer.valueOf(q.a(getContext(), "myoffer_red_packet_frame6", k.f20419c)));
        a(this.f11503j);
        this.f11503j.setOnClickListener(new AnonymousClass2());
        this.f11495a.setOnClickListener(new AnonymousClass3());
        setOnClickListener(new AnonymousClass4());
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f11507n.setOnClickListener(anonymousClass5);
        this.f11500f.setOnClickListener(anonymousClass5);
        this.f11498d.setOnClickListener(anonymousClass5);
        this.i.setOnClickListener(anonymousClass5);
        this.f11501g.setOnClickListener(anonymousClass5);
        this.f11496b.setOnClickListener(new AnonymousClass6());
        String a9 = g.a().a(b.d.f12902a);
        if (TextUtils.isEmpty(a9)) {
            return;
        }
        com.IceFishing.LiveIceFishing.k.j().a(new com.anythink.core.common.res.e(3, a9), new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        if (view == null) {
            return;
        }
        e eVar = this.f11511r;
        if (eVar != null) {
            eVar.d();
        }
        e eVar2 = new e(view);
        this.f11511r = eVar2;
        eVar2.g();
        this.f11511r.a();
    }
}
