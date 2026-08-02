package com.anythink.expressad.widget.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.rewardpopview.ATGradientAndShadowTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ATAcquireRewardPopView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f23304a;

    /* renamed from: b, reason: collision with root package name */
    private c f23305b;

    /* renamed from: c, reason: collision with root package name */
    private AnimationSet f23306c;

    /* renamed from: d, reason: collision with root package name */
    private float f23307d;

    /* renamed from: e, reason: collision with root package name */
    private float f23308e;

    /* renamed from: f, reason: collision with root package name */
    private float f23309f;

    /* renamed from: g, reason: collision with root package name */
    private float f23310g;

    /* renamed from: h, reason: collision with root package name */
    private int f23311h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23312j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f23313k;

    /* renamed from: l, reason: collision with root package name */
    private final View.OnClickListener f23314l;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f23315m;

    /* renamed from: n, reason: collision with root package name */
    private Runnable f23316n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnTouchListener f23317o;

    /* renamed from: p, reason: collision with root package name */
    private final View.OnClickListener f23318p;

    /* renamed from: q, reason: collision with root package name */
    private final View.OnClickListener f23319q;

    /* renamed from: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (ATAcquireRewardPopView.this.f23306c != null) {
                ATAcquireRewardPopView.this.f23306c.cancel();
            }
        }
    }

    /* renamed from: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnAttachStateChangeListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ATAcquireRewardPopView.this.setLongClickable(true);
            ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
            aTAcquireRewardPopView.setOnTouchListener(aTAcquireRewardPopView.f23317o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView$4, reason: invalid class name */
    public class AnonymousClass4 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f23324a;

        public AnonymousClass4(View view) {
            this.f23324a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f23324a.startAnimation(ATAcquireRewardPopView.this.f23306c);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView$5, reason: invalid class name */
    public class AnonymousClass5 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f23326a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AlphaAnimation f23327b;

        public AnonymousClass5(View view, AlphaAnimation alphaAnimation) {
            this.f23326a = view;
            this.f23327b = alphaAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f23326a.startAnimation(this.f23327b);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public ATAcquireRewardPopView(Context context) {
        super(context);
        this.f23304a = "ATAcquireRewardPopView";
        this.f23307d = 0.0f;
        this.f23308e = 0.0f;
        this.f23309f = 0.0f;
        this.f23310g = 0.0f;
        this.f23314l = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = ATAcquireRewardPopView.this.f23305b.f23405q.contains(str);
                ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                View e9 = contains ? ATAcquireRewardPopView.e(aTAcquireRewardPopView2) : ATAcquireRewardPopView.f(aTAcquireRewardPopView2);
                View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                }
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    if (contains) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    } else {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                }
                ATAcquireRewardPopView aTAcquireRewardPopView3 = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView3.postDelayed(aTAcquireRewardPopView3.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
            }
        };
        this.f23315m = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public final void run() {
                if (ATAcquireRewardPopView.this.f23311h > 0) {
                    ATAcquireRewardPopView.j(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.postDelayed(aTAcquireRewardPopView.f23315m, 1000L);
                } else {
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                    ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView.this.setVisibility(8);
                    ATAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f23316n = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8
            @Override // java.lang.Runnable
            public final void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                        ATAcquireRewardPopView.this.setVisibility(8);
                        ATAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                ATAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f23317o = new View.OnTouchListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ATAcquireRewardPopView.this.f23307d = motionEvent.getX();
                    ATAcquireRewardPopView.this.f23308e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        ATAcquireRewardPopView.this.f23309f = motionEvent.getX();
                        ATAcquireRewardPopView.this.f23310g = motionEvent.getY();
                    }
                } else if (ATAcquireRewardPopView.this.f23309f <= ATAcquireRewardPopView.this.f23307d) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                } else if (Math.abs(ATAcquireRewardPopView.this.f23309f - ATAcquireRewardPopView.this.f23307d) <= 50.0f || Math.abs(ATAcquireRewardPopView.this.f23310g - ATAcquireRewardPopView.this.f23308e) >= 100.0f) {
                    a aVar2 = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused3 = ATAcquireRewardPopView.this.f23307d;
                    float unused4 = ATAcquireRewardPopView.this.f23308e;
                    aVar2.b();
                } else {
                    if (ATAcquireRewardPopView.this.f23312j) {
                        return false;
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                    ATAcquireRewardPopView.p(ATAcquireRewardPopView.this);
                    View e9 = ATAcquireRewardPopView.e(ATAcquireRewardPopView.this);
                    View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                    }
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView2.postDelayed(aTAcquireRewardPopView2.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
                }
                return false;
            }
        };
        this.f23318p = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                }
            }
        };
        this.f23319q = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    ATAcquireRewardPopView.this.f23305b.f23389T.a();
                }
                ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                ATAcquireRewardPopView.this.setVisibility(8);
                ATAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public static /* synthetic */ View e(ATAcquireRewardPopView aTAcquireRewardPopView) {
        LinearLayout linearLayout = new LinearLayout(aTAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        c cVar = aTAcquireRewardPopView.f23305b;
        aVar.f23339a = cVar.f23376F;
        aVar.f23340b = cVar.f23377G;
        aVar.f23341c = cVar.f23378H;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(aTAcquireRewardPopView.getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.b(aTAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        c cVar2 = aTAcquireRewardPopView.f23305b;
        int i = cVar2.f23392c;
        String str = i == 1 ? cVar2.f23398j : i == 2 ? cVar2.f23404p : "";
        aTGradientAndShadowTextView.setGravity(17);
        aTGradientAndShadowTextView.setText(" " + str + " ");
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable a9 = a(new int[]{b.f23362r, b.f23363s, b.f23363s, b.f23364t}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(aTAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(aTAcquireRewardPopView.f23305b.f23373C);
        c cVar3 = aTAcquireRewardPopView.f23305b;
        textView.setText(String.format(cVar3.f23399k, Integer.valueOf(cVar3.f23394e)));
        int b9 = v.b(aTAcquireRewardPopView.getContext(), 6.0f);
        int b10 = v.b(aTAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(b10, b9, b10, b9);
        textView.setBackgroundDrawable(a9);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ View f(ATAcquireRewardPopView aTAcquireRewardPopView) {
        LinearLayout linearLayout = new LinearLayout(aTAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        c cVar = aTAcquireRewardPopView.f23305b;
        aVar.f23339a = cVar.f23382M;
        aVar.f23340b = cVar.f23383N;
        aVar.f23341c = cVar.f23384O;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(aTAcquireRewardPopView.getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.b(aTAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setGravity(17);
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        aTGradientAndShadowTextView.setText(" " + aTAcquireRewardPopView.f23305b.f23400l + " ");
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable a9 = a(new int[]{b.f23365u, b.f23366v, b.f23366v, b.f23365u}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(aTAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(aTAcquireRewardPopView.f23305b.f23374D);
        textView.setText(String.format(aTAcquireRewardPopView.f23305b.f23401m, ""));
        int b9 = v.b(aTAcquireRewardPopView.getContext(), 6.0f);
        int b10 = v.b(aTAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(b10, b9, b10, b9);
        textView.setBackgroundDrawable(a9);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ boolean i(ATAcquireRewardPopView aTAcquireRewardPopView) {
        aTAcquireRewardPopView.i = false;
        return false;
    }

    public static /* synthetic */ int j(ATAcquireRewardPopView aTAcquireRewardPopView) {
        int i = aTAcquireRewardPopView.f23311h;
        aTAcquireRewardPopView.f23311h = i - 1;
        return i;
    }

    public static /* synthetic */ boolean p(ATAcquireRewardPopView aTAcquireRewardPopView) {
        aTAcquireRewardPopView.f23312j = true;
        return true;
    }

    public void init(c cVar) {
        View view;
        if (cVar == null) {
            return;
        }
        this.f23305b = cVar;
        if (cVar.f23392c == 1) {
            ArrayList<String> arrayList = new ArrayList<>();
            c cVar2 = this.f23305b;
            if (cVar2 != null) {
                List<String> list = cVar2.f23405q;
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (this.f23305b.f23406r != null) {
                    int nextInt = new Random().nextInt(this.f23305b.f23406r.size());
                    if (nextInt > this.f23305b.f23406r.size() - 1) {
                        nextInt = 0;
                    }
                    arrayList.add(this.f23305b.f23406r.get(nextInt));
                }
            }
            view = a(arrayList);
            if (this.f23305b.f23395f) {
                setOnClickListener(this.f23318p);
            }
        } else {
            view = null;
        }
        if (this.f23305b.f23392c == 2) {
            int b9 = v.b(getContext(), 290.0f);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b9, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
            c cVar3 = this.f23305b;
            aVar.f23339a = cVar3.f23376F;
            aVar.f23340b = cVar3.f23377G;
            aVar.f23341c = cVar3.f23378H;
            aVar.f23342d = 30;
            ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, 0, 0, v.b(getContext(), 12.0f));
            layoutParams2.gravity = 1;
            aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
            aTGradientAndShadowTextView.setText(" " + this.f23305b.f23402n + " ");
            aTGradientAndShadowTextView.setGravity(17);
            linearLayout.addView(aTGradientAndShadowTextView);
            GradientDrawable a9 = a(new int[]{b.f23362r, b.f23363s, b.f23363s, b.f23364t}, GradientDrawable.Orientation.LEFT_RIGHT);
            this.f23313k = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.setMargins(0, 0, 0, v.b(getContext(), 25.0f));
            this.f23313k.setLayoutParams(layoutParams3);
            this.f23313k.setTextSize(12.0f);
            this.f23313k.setGravity(17);
            this.f23313k.setTextColor(this.f23305b.f23373C);
            TextView textView = this.f23313k;
            c cVar4 = this.f23305b;
            textView.setText(String.format(cVar4.f23403o, Integer.valueOf(cVar4.f23394e)));
            int b10 = v.b(getContext(), 6.0f);
            int b11 = v.b(getContext(), 32.0f);
            this.f23313k.setPadding(b11, b10, b11, b10);
            this.f23313k.setBackgroundDrawable(a9);
            linearLayout.addView(this.f23313k);
            View imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            imageView.setLayoutParams(layoutParams4);
            imageView.setBackgroundResource(getResources().getIdentifier("anythink_slide_rightarrow", k.f20419c, com.anythink.expressad.foundation.b.a.c().b()));
            linearLayout.addView(imageView);
            View imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView2.setBackgroundResource(getResources().getIdentifier("anythink_slide_hand", k.f20419c, com.anythink.expressad.foundation.b.a.c().b()));
            linearLayout.addView(imageView2);
            imageView2.addOnAttachStateChangeListener(new AnonymousClass1());
            linearLayout.addOnAttachStateChangeListener(new AnonymousClass3());
            view = linearLayout;
        }
        if (view != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f23305b.f23375E);
            addView(view);
            int i = this.f23305b.f23393d;
            if (i > 0) {
                this.f23311h = i;
                post(this.f23315m);
                this.i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f23315m);
    }

    public void onPause() {
        if (!this.i || this.f23311h <= 0) {
            return;
        }
        removeCallbacks(this.f23315m);
    }

    public void onResume() {
        if (!this.i || this.f23311h <= 0) {
            return;
        }
        post(this.f23315m);
    }

    public void onStop() {
        if (!this.i || this.f23311h <= 0) {
            return;
        }
        removeCallbacks(this.f23315m);
    }

    public void onTimeLessThanReduce(int i) {
        c cVar = this.f23305b;
        cVar.f23394e = i;
        TextView textView = this.f23313k;
        if (textView != null) {
            textView.setText(String.format(cVar.i, Integer.valueOf(i)));
        }
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v.b(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        c cVar = this.f23305b;
        int i = cVar.f23407s;
        int i4 = cVar.f23408t;
        int i6 = cVar.f23409u;
        int i9 = cVar.f23410v;
        int[] iArr = {i, i4};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable a9 = a(iArr, orientation);
        a9.setCornerRadius(v.b(getContext(), 12.0f));
        GradientDrawable a10 = a(new int[]{i6, i9}, orientation);
        a10.setCornerRadius(v.b(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a9, a10});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        linearLayout.setBackgroundDrawable(layerDrawable);
        ImageView imageView = new ImageView(getContext());
        int b9 = v.b(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(b9, b9);
        layoutParams2.gravity = 8388613;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("anythink_reward_popview_close", k.f20419c, com.anythink.expressad.foundation.b.a.c().b()));
        imageView.setOnClickListener(this.f23319q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int b10 = v.b(getContext(), 18.0f);
        layoutParams3.setMargins(b10, 5, b10, v.b(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f23305b.f23397h);
        textView.setTextColor(this.f23305b.f23413y);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList.size() > 1) {
            int b11 = v.b(getContext(), 8.0f);
            int b12 = v.b(getContext(), 24.0f);
            int b13 = v.b(getContext(), 30.0f);
            int b14 = v.b(getContext(), 12.0f);
            int b15 = v.b(getContext(), 40.0f);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                boolean contains = this.f23305b.f23405q.contains(arrayList.get(i10));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(b13, b14, b13, 0);
                textView2.setPadding(b12, b11, b12, b11);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i10));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i10));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                c cVar2 = this.f23305b;
                textView2.setTextColor(contains ? cVar2.f23371A : cVar2.f23372B);
                c cVar3 = this.f23305b;
                int i11 = contains ? cVar3.f23411w : cVar3.f23412x;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i11);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(b15);
                textView2.setBackgroundDrawable(gradientDrawable);
                textView2.setOnClickListener(this.f23314l);
                linearLayout.addView(textView2);
            }
        }
        this.f23313k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int b16 = v.b(getContext(), 16.0f);
        int b17 = v.b(getContext(), 18.0f);
        layoutParams5.setMargins(b17, b16, b17, b16);
        layoutParams5.gravity = 1;
        this.f23313k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f23313k;
        c cVar4 = this.f23305b;
        textView3.setText(String.format(cVar4.i, Integer.valueOf(cVar4.f23394e)));
        this.f23313k.setTextColor(this.f23305b.f23414z);
        this.f23313k.setGravity(17);
        this.f23313k.setTextSize(12.0f);
        linearLayout.addView(this.f23313k);
        return linearLayout;
    }

    private View b() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        c cVar = this.f23305b;
        aVar.f23339a = cVar.f23382M;
        aVar.f23340b = cVar.f23383N;
        aVar.f23341c = cVar.f23384O;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.b(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setGravity(17);
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        aTGradientAndShadowTextView.setText(" " + this.f23305b.f23400l + " ");
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable a9 = a(new int[]{b.f23365u, b.f23366v, b.f23366v, b.f23365u}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f23305b.f23374D);
        textView.setText(String.format(this.f23305b.f23401m, ""));
        int b9 = v.b(getContext(), 6.0f);
        int b10 = v.b(getContext(), 32.0f);
        textView.setPadding(b10, b9, b10, b9);
        textView.setBackgroundDrawable(a9);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private View c() {
        int b9 = v.b(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b9, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        c cVar = this.f23305b;
        aVar.f23339a = cVar.f23376F;
        aVar.f23340b = cVar.f23377G;
        aVar.f23341c = cVar.f23378H;
        aVar.f23342d = 30;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.b(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        aTGradientAndShadowTextView.setText(" " + this.f23305b.f23402n + " ");
        aTGradientAndShadowTextView.setGravity(17);
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable a9 = a(new int[]{b.f23362r, b.f23363s, b.f23363s, b.f23364t}, GradientDrawable.Orientation.LEFT_RIGHT);
        this.f23313k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, v.b(getContext(), 25.0f));
        this.f23313k.setLayoutParams(layoutParams3);
        this.f23313k.setTextSize(12.0f);
        this.f23313k.setGravity(17);
        this.f23313k.setTextColor(this.f23305b.f23373C);
        TextView textView = this.f23313k;
        c cVar2 = this.f23305b;
        textView.setText(String.format(cVar2.f23403o, Integer.valueOf(cVar2.f23394e)));
        int b10 = v.b(getContext(), 6.0f);
        int b11 = v.b(getContext(), 32.0f);
        this.f23313k.setPadding(b11, b10, b11, b10);
        this.f23313k.setBackgroundDrawable(a9);
        linearLayout.addView(this.f23313k);
        View imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        imageView.setLayoutParams(layoutParams4);
        imageView.setBackgroundResource(getResources().getIdentifier("anythink_slide_rightarrow", k.f20419c, com.anythink.expressad.foundation.b.a.c().b()));
        linearLayout.addView(imageView);
        View imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView2.setBackgroundResource(getResources().getIdentifier("anythink_slide_hand", k.f20419c, com.anythink.expressad.foundation.b.a.c().b()));
        linearLayout.addView(imageView2);
        imageView2.addOnAttachStateChangeListener(new AnonymousClass1());
        linearLayout.addOnAttachStateChangeListener(new AnonymousClass3());
        return linearLayout;
    }

    private ArrayList<String> d() {
        ArrayList<String> arrayList = new ArrayList<>();
        c cVar = this.f23305b;
        if (cVar != null) {
            List<String> list = cVar.f23405q;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (this.f23305b.f23406r != null) {
                int nextInt = new Random().nextInt(this.f23305b.f23406r.size());
                if (nextInt > this.f23305b.f23406r.size() - 1) {
                    nextInt = 0;
                }
                arrayList.add(this.f23305b.f23406r.get(nextInt));
            }
        }
        return arrayList;
    }

    public ATAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23304a = "ATAcquireRewardPopView";
        this.f23307d = 0.0f;
        this.f23308e = 0.0f;
        this.f23309f = 0.0f;
        this.f23310g = 0.0f;
        this.f23314l = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = ATAcquireRewardPopView.this.f23305b.f23405q.contains(str);
                ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                View e9 = contains ? ATAcquireRewardPopView.e(aTAcquireRewardPopView2) : ATAcquireRewardPopView.f(aTAcquireRewardPopView2);
                View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                }
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    if (contains) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    } else {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                }
                ATAcquireRewardPopView aTAcquireRewardPopView3 = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView3.postDelayed(aTAcquireRewardPopView3.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
            }
        };
        this.f23315m = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public final void run() {
                if (ATAcquireRewardPopView.this.f23311h > 0) {
                    ATAcquireRewardPopView.j(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.postDelayed(aTAcquireRewardPopView.f23315m, 1000L);
                } else {
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                    ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView.this.setVisibility(8);
                    ATAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f23316n = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8
            @Override // java.lang.Runnable
            public final void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                        ATAcquireRewardPopView.this.setVisibility(8);
                        ATAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                ATAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f23317o = new View.OnTouchListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ATAcquireRewardPopView.this.f23307d = motionEvent.getX();
                    ATAcquireRewardPopView.this.f23308e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        ATAcquireRewardPopView.this.f23309f = motionEvent.getX();
                        ATAcquireRewardPopView.this.f23310g = motionEvent.getY();
                    }
                } else if (ATAcquireRewardPopView.this.f23309f <= ATAcquireRewardPopView.this.f23307d) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                } else if (Math.abs(ATAcquireRewardPopView.this.f23309f - ATAcquireRewardPopView.this.f23307d) <= 50.0f || Math.abs(ATAcquireRewardPopView.this.f23310g - ATAcquireRewardPopView.this.f23308e) >= 100.0f) {
                    a aVar2 = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused3 = ATAcquireRewardPopView.this.f23307d;
                    float unused4 = ATAcquireRewardPopView.this.f23308e;
                    aVar2.b();
                } else {
                    if (ATAcquireRewardPopView.this.f23312j) {
                        return false;
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                    ATAcquireRewardPopView.p(ATAcquireRewardPopView.this);
                    View e9 = ATAcquireRewardPopView.e(ATAcquireRewardPopView.this);
                    View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                    }
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView2.postDelayed(aTAcquireRewardPopView2.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
                }
                return false;
            }
        };
        this.f23318p = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                }
            }
        };
        this.f23319q = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    ATAcquireRewardPopView.this.f23305b.f23389T.a();
                }
                ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                ATAcquireRewardPopView.this.setVisibility(8);
                ATAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public ATAcquireRewardPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23304a = "ATAcquireRewardPopView";
        this.f23307d = 0.0f;
        this.f23308e = 0.0f;
        this.f23309f = 0.0f;
        this.f23310g = 0.0f;
        this.f23314l = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = ATAcquireRewardPopView.this.f23305b.f23405q.contains(str);
                ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                View e9 = contains ? ATAcquireRewardPopView.e(aTAcquireRewardPopView2) : ATAcquireRewardPopView.f(aTAcquireRewardPopView2);
                View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                }
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    if (contains) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    } else {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                }
                ATAcquireRewardPopView aTAcquireRewardPopView3 = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView3.postDelayed(aTAcquireRewardPopView3.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
            }
        };
        this.f23315m = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public final void run() {
                if (ATAcquireRewardPopView.this.f23311h > 0) {
                    ATAcquireRewardPopView.j(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.postDelayed(aTAcquireRewardPopView.f23315m, 1000L);
                } else {
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                    ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView.this.setVisibility(8);
                    ATAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f23316n = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8
            @Override // java.lang.Runnable
            public final void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                        ATAcquireRewardPopView.this.setVisibility(8);
                        ATAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                ATAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f23317o = new View.OnTouchListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ATAcquireRewardPopView.this.f23307d = motionEvent.getX();
                    ATAcquireRewardPopView.this.f23308e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        ATAcquireRewardPopView.this.f23309f = motionEvent.getX();
                        ATAcquireRewardPopView.this.f23310g = motionEvent.getY();
                    }
                } else if (ATAcquireRewardPopView.this.f23309f <= ATAcquireRewardPopView.this.f23307d) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                } else if (Math.abs(ATAcquireRewardPopView.this.f23309f - ATAcquireRewardPopView.this.f23307d) <= 50.0f || Math.abs(ATAcquireRewardPopView.this.f23310g - ATAcquireRewardPopView.this.f23308e) >= 100.0f) {
                    a aVar2 = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused3 = ATAcquireRewardPopView.this.f23307d;
                    float unused4 = ATAcquireRewardPopView.this.f23308e;
                    aVar2.b();
                } else {
                    if (ATAcquireRewardPopView.this.f23312j) {
                        return false;
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                    ATAcquireRewardPopView.p(ATAcquireRewardPopView.this);
                    View e9 = ATAcquireRewardPopView.e(ATAcquireRewardPopView.this);
                    View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                    }
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView2.postDelayed(aTAcquireRewardPopView2.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
                }
                return false;
            }
        };
        this.f23318p = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                }
            }
        };
        this.f23319q = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    ATAcquireRewardPopView.this.f23305b.f23389T.a();
                }
                ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                ATAcquireRewardPopView.this.setVisibility(8);
                ATAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public ATAcquireRewardPopView(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f23304a = "ATAcquireRewardPopView";
        this.f23307d = 0.0f;
        this.f23308e = 0.0f;
        this.f23309f = 0.0f;
        this.f23310g = 0.0f;
        this.f23314l = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = ATAcquireRewardPopView.this.f23305b.f23405q.contains(str);
                ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                View e9 = contains ? ATAcquireRewardPopView.e(aTAcquireRewardPopView2) : ATAcquireRewardPopView.f(aTAcquireRewardPopView2);
                View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                }
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    if (contains) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    } else {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                }
                ATAcquireRewardPopView aTAcquireRewardPopView3 = ATAcquireRewardPopView.this;
                aTAcquireRewardPopView3.postDelayed(aTAcquireRewardPopView3.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
            }
        };
        this.f23315m = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public final void run() {
                if (ATAcquireRewardPopView.this.f23311h > 0) {
                    ATAcquireRewardPopView.j(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.postDelayed(aTAcquireRewardPopView.f23315m, 1000L);
                } else {
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a();
                    }
                    ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                    ATAcquireRewardPopView.this.setVisibility(8);
                    ATAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f23316n = new Runnable() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8
            @Override // java.lang.Runnable
            public final void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.8.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                        ATAcquireRewardPopView.this.setVisibility(8);
                        ATAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                ATAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f23317o = new View.OnTouchListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ATAcquireRewardPopView.this.f23307d = motionEvent.getX();
                    ATAcquireRewardPopView.this.f23308e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        ATAcquireRewardPopView.this.f23309f = motionEvent.getX();
                        ATAcquireRewardPopView.this.f23310g = motionEvent.getY();
                    }
                } else if (ATAcquireRewardPopView.this.f23309f <= ATAcquireRewardPopView.this.f23307d) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                } else if (Math.abs(ATAcquireRewardPopView.this.f23309f - ATAcquireRewardPopView.this.f23307d) <= 50.0f || Math.abs(ATAcquireRewardPopView.this.f23310g - ATAcquireRewardPopView.this.f23308e) >= 100.0f) {
                    a aVar2 = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused3 = ATAcquireRewardPopView.this.f23307d;
                    float unused4 = ATAcquireRewardPopView.this.f23308e;
                    aVar2.b();
                } else {
                    if (ATAcquireRewardPopView.this.f23312j) {
                        return false;
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView.removeCallbacks(aTAcquireRewardPopView.f23315m);
                    ATAcquireRewardPopView.p(ATAcquireRewardPopView.this);
                    View e9 = ATAcquireRewardPopView.e(ATAcquireRewardPopView.this);
                    View childAt = ATAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        ATAcquireRewardPopView.a(ATAcquireRewardPopView.this, childAt, e9);
                    }
                    if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                        ATAcquireRewardPopView.this.f23305b.f23389T.a(ATAcquireRewardPopView.this.f23305b.f23394e);
                    }
                    ATAcquireRewardPopView aTAcquireRewardPopView2 = ATAcquireRewardPopView.this;
                    aTAcquireRewardPopView2.postDelayed(aTAcquireRewardPopView2.f23316n, com.anythink.basead.exoplayer.i.a.f8669f);
                }
                return false;
            }
        };
        this.f23318p = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    a aVar = ATAcquireRewardPopView.this.f23305b.f23389T;
                    float unused = ATAcquireRewardPopView.this.f23307d;
                    float unused2 = ATAcquireRewardPopView.this.f23308e;
                    aVar.b();
                }
            }
        };
        this.f23319q = new View.OnClickListener() { // from class: com.anythink.expressad.widget.rewardpopview.ATAcquireRewardPopView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATAcquireRewardPopView.this.f23305b.f23389T != null) {
                    ATAcquireRewardPopView.this.f23305b.f23389T.a();
                }
                ATAcquireRewardPopView.i(ATAcquireRewardPopView.this);
                ATAcquireRewardPopView.this.setVisibility(8);
                ATAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    private View a() {
        String str;
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        ATGradientAndShadowTextView.a aVar = new ATGradientAndShadowTextView.a();
        c cVar = this.f23305b;
        aVar.f23339a = cVar.f23376F;
        aVar.f23340b = cVar.f23377G;
        aVar.f23341c = cVar.f23378H;
        ATGradientAndShadowTextView aTGradientAndShadowTextView = new ATGradientAndShadowTextView(getContext(), aVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, v.b(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        aTGradientAndShadowTextView.setLayoutParams(layoutParams2);
        c cVar2 = this.f23305b;
        int i = cVar2.f23392c;
        if (i == 1) {
            str = cVar2.f23398j;
        } else if (i == 2) {
            str = cVar2.f23404p;
        } else {
            str = "";
        }
        aTGradientAndShadowTextView.setGravity(17);
        aTGradientAndShadowTextView.setText(" " + str + " ");
        linearLayout.addView(aTGradientAndShadowTextView);
        GradientDrawable a9 = a(new int[]{b.f23362r, b.f23363s, b.f23363s, b.f23364t}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f23305b.f23373C);
        c cVar3 = this.f23305b;
        textView.setText(String.format(cVar3.f23399k, Integer.valueOf(cVar3.f23394e)));
        int b9 = v.b(getContext(), 6.0f);
        int b10 = v.b(getContext(), 32.0f);
        textView.setPadding(b10, b9, b10, b9);
        textView.setBackgroundDrawable(a9);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private LayerDrawable a(int i, int i4, int i6, int i9) {
        int[] iArr = {i, i4};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable a9 = a(iArr, orientation);
        a9.setCornerRadius(v.b(getContext(), 12.0f));
        GradientDrawable a10 = a(new int[]{i6, i9}, orientation);
        a10.setCornerRadius(v.b(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a9, a10});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        return layerDrawable;
    }

    private static GradientDrawable a(int i, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i4);
        return gradientDrawable;
    }

    private static GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    private void a(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        this.f23306c = animationSet;
        animationSet.addAnimation(translateAnimation);
        this.f23306c.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new AnonymousClass4(view));
        this.f23306c.setAnimationListener(new AnonymousClass5(view, alphaAnimation2));
        view.startAnimation(this.f23306c);
    }

    private void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    public static /* synthetic */ void a(ATAcquireRewardPopView aTAcquireRewardPopView, View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        aTAcquireRewardPopView.f23306c = animationSet;
        animationSet.addAnimation(translateAnimation);
        aTAcquireRewardPopView.f23306c.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(aTAcquireRewardPopView.new AnonymousClass4(view));
        aTAcquireRewardPopView.f23306c.setAnimationListener(aTAcquireRewardPopView.new AnonymousClass5(view, alphaAnimation2));
        view.startAnimation(aTAcquireRewardPopView.f23306c);
    }

    public static /* synthetic */ void a(ATAcquireRewardPopView aTAcquireRewardPopView, View view, View view2) {
        aTAcquireRewardPopView.removeView(view);
        aTAcquireRewardPopView.addView(view2);
    }
}
