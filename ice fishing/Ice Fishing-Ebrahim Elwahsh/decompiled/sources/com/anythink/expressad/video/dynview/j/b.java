package com.anythink.expressad.video.dynview.j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.dynview.widget.AnyThinkFramLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkRelativeLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.video.module.AnythinkClickCTAView;
import com.anythink.expressad.video.widget.SoundImageView;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f21434a = "anythink_top_play_bg";

    /* renamed from: b, reason: collision with root package name */
    private String f21435b = "anythink_top_finger_bg";

    /* renamed from: c, reason: collision with root package name */
    private String f21436c = "anythink_bottom_play_bg";

    /* renamed from: d, reason: collision with root package name */
    private String f21437d = "anythink_bottom_finger_bg";

    /* renamed from: e, reason: collision with root package name */
    private String f21438e = "anythink_tv_count";

    /* renamed from: f, reason: collision with root package name */
    private String f21439f = "anythink_sound_switch";

    /* renamed from: g, reason: collision with root package name */
    private String f21440g = "anythink_top_control";

    /* renamed from: h, reason: collision with root package name */
    private String f21441h = "anythink_tv_title";
    private String i = "anythink_tv_desc";

    /* renamed from: j, reason: collision with root package name */
    private String f21442j = "anythink_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private String f21443k = "anythink_sv_starlevel";

    /* renamed from: l, reason: collision with root package name */
    private String f21444l = "anythink_sv_heat_count_level";

    /* renamed from: m, reason: collision with root package name */
    private String f21445m = "anythink_tv_cta";

    /* renamed from: n, reason: collision with root package name */
    private String f21446n = "anythink_native_ec_controller";

    /* renamed from: o, reason: collision with root package name */
    private String f21447o = "anythink_reward_shape_choice_rl";

    /* renamed from: p, reason: collision with root package name */
    private String f21448p = "#FFFFFF";

    /* renamed from: q, reason: collision with root package name */
    private String f21449q = "#FF000000";

    /* renamed from: r, reason: collision with root package name */
    private String f21450r = "#40000000";

    /* renamed from: s, reason: collision with root package name */
    private String f21451s = "#CAEF79";

    /* renamed from: t, reason: collision with root package name */
    private String f21452t = "#2196F3";

    /* renamed from: u, reason: collision with root package name */
    private String f21453u = "#402196F3";

    /* renamed from: v, reason: collision with root package name */
    private String f21454v = "#8FC31F";

    /* renamed from: w, reason: collision with root package name */
    private String f21455w = "#03A9F4";

    /* renamed from: x, reason: collision with root package name */
    private String f21456x = "#FF89C120";

    /* renamed from: y, reason: collision with root package name */
    private String f21457y = "#FF2BAE5D";

    /* renamed from: z, reason: collision with root package name */
    private boolean f21458z = false;

    private static void a() {
    }

    private void b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f21440g));
        if (relativeLayout != null) {
            if (com.anythink.expressad.video.dynview.a.b.f21286a == 0 && com.anythink.expressad.video.dynview.a.b.f21287b == 0 && com.anythink.expressad.video.dynview.a.b.f21288c == 0 && com.anythink.expressad.video.dynview.a.b.f21289d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private void d(View view, com.anythink.expressad.video.dynview.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f21446n));
        if (relativeLayout != null) {
            if (cVar.e() == 1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.f21286a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.f21288c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.f21287b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.f21289d);
                relativeLayout.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.f21286a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.f21288c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.f21287b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.f21289d);
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void c(View view, com.anythink.expressad.video.dynview.c cVar) {
        if (view == null || cVar == null) {
            return;
        }
        if (view.getContext() != null) {
            this.f21458z = false;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(a(this.f21443k));
            View findViewById = view.findViewById(a(this.f21445m));
            if (linearLayout != null && (linearLayout instanceof AnyThinkLevelLayoutView)) {
                if (cVar.e() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f21446n));
            if (relativeLayout != null) {
                if (cVar.e() == 1) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.f21286a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.f21288c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.f21287b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.f21289d);
                    relativeLayout.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.f21286a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.f21288c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.f21287b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.f21289d);
                    relativeLayout.setLayoutParams(layoutParams2);
                }
            }
            if (findViewById != null) {
                if (findViewById instanceof TextView) {
                    TextView textView = (TextView) findViewById;
                    textView.setTextColor(Color.parseColor(this.f21448p));
                    textView.setTextSize(22.0f);
                    com.anythink.expressad.video.dynview.i.b.a.a(findViewById, 1.0f, cVar.i() == 1302 ? 25 : 5, this.f21451s, new String[]{this.f21456x, this.f21457y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                int i = cVar.i();
                if (i == 404 || i == 704 || i == 1402) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    new com.anythink.expressad.video.dynview.h.b();
                    animatorSet.playTogether(com.anythink.expressad.video.dynview.h.b.c(findViewById));
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.anythink.expressad.video.dynview.j.b.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    if (view instanceof AnyThinkFramLayout) {
                        ((AnyThinkFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof AnyThinkRelativeLayout) {
                        ((AnyThinkRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
        }
        new com.anythink.expressad.video.dynview.h.b();
        com.anythink.expressad.video.dynview.h.b.e(view);
    }

    public final void a(View view) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        if (view == null || !(view instanceof AnyThinkFramLayout)) {
            return;
        }
        AnyThinkFramLayout anyThinkFramLayout = (AnyThinkFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            this.f21458z = false;
            ImageView imageView = (ImageView) view.findViewById(a(this.f21434a));
            ImageView imageView2 = (ImageView) view.findViewById(a(this.f21435b));
            ImageView imageView3 = (ImageView) view.findViewById(a(this.f21436c));
            ImageView imageView4 = (ImageView) view.findViewById(a(this.f21437d));
            ObjectAnimator objectAnimator4 = null;
            if (imageView != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator = com.anythink.expressad.video.dynview.h.b.a(imageView);
            } else {
                objectAnimator = null;
            }
            if (imageView2 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator2 = com.anythink.expressad.video.dynview.h.b.b(imageView2);
            } else {
                objectAnimator2 = null;
            }
            if (imageView3 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator3 = com.anythink.expressad.video.dynview.h.b.a(imageView3);
            } else {
                objectAnimator3 = null;
            }
            if (imageView4 != null) {
                new com.anythink.expressad.video.dynview.h.b();
                objectAnimator4 = com.anythink.expressad.video.dynview.h.b.b(imageView4);
            }
            if (objectAnimator == null || objectAnimator3 == null || objectAnimator2 == null || objectAnimator4 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimator, objectAnimator3, objectAnimator2, objectAnimator4);
            anyThinkFramLayout.setAnimatorSet(animatorSet);
        }
    }

    public final void b(View view, com.anythink.expressad.video.dynview.c cVar) {
        Context context;
        int b9;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.e() == 1) {
            view.setBackgroundDrawable(context.getResources().getDrawable(k.a(context, this.f21447o, k.f19790c)));
            TextView textView = (TextView) view.findViewById(a(this.f21441h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f21449q));
            }
            TextView textView2 = (TextView) view.findViewById(a(this.i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f21449q));
            }
            b9 = v.b(context, 2.0f);
        } else {
            b9 = v.b(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int b10 = v.b(context, 8.0f);
        View findViewById = view.findViewById(a(this.f21442j));
        if (findViewById != null) {
            if (cVar.f() != null && (cVar.f() instanceof AnythinkClickCTAView)) {
                new com.anythink.expressad.video.dynview.h.b();
                ((AnythinkClickCTAView) cVar.f()).setObjectAnimator(com.anythink.expressad.video.dynview.h.b.c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.f21448p));
                textView3.setTextSize(15.0f);
                String str = this.f21454v;
                String str2 = this.f21451s;
                com.anythink.expressad.video.dynview.i.b.a.a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(b9, b9, b9, b10);
            layoutParams.height = v.b(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, com.anythink.expressad.video.dynview.c cVar) {
        String str;
        String str2;
        String str3;
        float f6;
        RelativeLayout relativeLayout;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        this.f21458z = false;
        TextView textView = (TextView) view.findViewById(a(this.f21438e));
        TextView textView2 = (TextView) view.findViewById(a("anythink_reward_click_tv"));
        if (textView != null) {
            textView.setBackgroundResource(k.a(context, "anythink_reward_shape_progress", k.f19790c));
            textView.setTextColor(Color.parseColor(this.f21448p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof AnyThinkTextView) {
                new com.anythink.expressad.video.dynview.h.b();
                ((AnyThinkTextView) textView2).setObjectAnimator(com.anythink.expressad.video.dynview.h.b.c(textView2));
            }
        }
        String str4 = this.f21449q;
        String str5 = this.f21451s;
        int i = cVar.i();
        float f9 = 10.0f;
        if (i == 302) {
            str = this.f21452t;
            str2 = this.f21455w;
            str4 = this.f21448p;
            str5 = this.f21453u;
        } else {
            if (i == 802) {
                str = this.f21448p;
                str4 = this.f21449q;
                f9 = 25.0f;
                str3 = this.f21450r;
                f6 = 0.5f;
                str2 = str;
            } else if (i != 5002010) {
                str = this.f21454v;
                str2 = this.f21451s;
                f9 = 5.0f;
            } else {
                String str6 = this.f21454v;
                str4 = this.f21448p;
                str = str6;
                str2 = str;
                f6 = 1.0f;
                str3 = str2;
            }
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(str4));
                com.anythink.expressad.video.dynview.i.b.a.a(textView2, f6, f9, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
            if (cVar.f() != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.f().getLayoutParams();
                layoutParams.setMargins(0, 0, 0, 0);
                cVar.f().setLayoutParams(layoutParams);
            }
            relativeLayout = (RelativeLayout) view.findViewById(a(this.f21440g));
            if (relativeLayout == null) {
                if (com.anythink.expressad.video.dynview.a.b.f21286a == 0 && com.anythink.expressad.video.dynview.a.b.f21287b == 0 && com.anythink.expressad.video.dynview.a.b.f21288c == 0 && com.anythink.expressad.video.dynview.a.b.f21289d == 0) {
                    return;
                }
                relativeLayout.setVisibility(4);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
                alphaAnimation.setDuration(200L);
                relativeLayout.startAnimation(alphaAnimation);
                relativeLayout.setVisibility(0);
                return;
            }
            return;
        }
        str3 = str5;
        f6 = 1.0f;
        if (textView2 != null) {
        }
        if (cVar.f() != null) {
        }
        relativeLayout = (RelativeLayout) view.findViewById(a(this.f21440g));
        if (relativeLayout == null) {
        }
    }

    private static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private void a(Context context, View view, com.anythink.expressad.video.dynview.c cVar) {
        SoundImageView soundImageView = (SoundImageView) view.findViewById(a(this.f21439f));
        int b9 = v.b(context, 60.0f);
        int b10 = v.b(context, 10.0f);
        if (soundImageView != null) {
            cVar.e();
            ((FrameLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(b10, 0, 0, b9);
        }
    }

    private static int a(String str) {
        return k.a(t.b().g(), str, "id");
    }
}
