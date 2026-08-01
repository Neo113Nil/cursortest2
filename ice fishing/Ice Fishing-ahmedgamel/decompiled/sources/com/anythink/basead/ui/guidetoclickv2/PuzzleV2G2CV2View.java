package com.anythink.basead.ui.guidetoclickv2;

import D.y;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.anythink.basead.ui.guidetoclickv2.picverify.TextSeekbar;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class PuzzleV2G2CV2View extends BaseLifecycleG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    ImageView f10980d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f10981e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f10982f;

    /* renamed from: g, reason: collision with root package name */
    ImageView f10983g;

    /* renamed from: h, reason: collision with root package name */
    int f10984h;
    Animation i;

    /* renamed from: j, reason: collision with root package name */
    TextSeekbar f10985j;

    /* renamed from: k, reason: collision with root package name */
    int f10986k;

    /* renamed from: l, reason: collision with root package name */
    boolean f10987l;

    /* renamed from: m, reason: collision with root package name */
    ValueAnimator f10988m;

    /* renamed from: n, reason: collision with root package name */
    int f10989n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10990o;

    /* renamed from: p, reason: collision with root package name */
    private final int f10991p;

    /* renamed from: q, reason: collision with root package name */
    private final int f10992q;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View$5, reason: invalid class name */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
            if (puzzleV2G2CV2View.f10989n != intValue) {
                puzzleV2G2CV2View.f10989n = intValue;
                puzzleV2G2CV2View.f10985j.setProgress(intValue);
            }
        }
    }

    public PuzzleV2G2CV2View(Context context) {
        super(context);
        this.f10991p = 30;
        this.f10989n = -1;
        this.f10992q = 300;
    }

    public static /* synthetic */ int a(int i) {
        if (i < 15) {
            return 0;
        }
        if (i > 85) {
            return 100;
        }
        return i - 15;
    }

    private void c(int i) {
        TextSeekbar textSeekbar = this.f10985j;
        if (textSeekbar != null) {
            textSeekbar.setClickable(false);
            this.f10985j.setEnabled(false);
            if (this.f10988m == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
                this.f10988m = ofInt;
                ofInt.addUpdateListener(new AnonymousClass5());
                this.f10988m.setDuration(300L);
                this.f10988m.start();
            }
        }
    }

    private static int d(int i) {
        if (i < 15) {
            return 0;
        }
        if (i > 85) {
            return 100;
        }
        return i - 15;
    }

    private void f() {
        removeAllViews();
        d();
    }

    private void g() {
        if (this.i != null || this.f10983g == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, this.f10984h, 0.0f, 0.0f);
        this.i = translateAnimation;
        translateAnimation.setDuration(1000L);
        this.i.setRepeatCount(-1);
        this.f10983g.startAnimation(this.i);
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void b() {
        super.b();
        Animation animation = this.i;
        if (animation != null) {
            animation.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public boolean canStartNextAnim() {
        ValueAnimator valueAnimator = this.f10988m;
        return valueAnimator == null || !valueAnimator.isRunning();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View
    public final int e() {
        return 45;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        Animation animation = this.i;
        if (animation != null) {
            animation.cancel();
        }
    }

    private void b(int i) {
        ImageView imageView = this.f10981e;
        if (imageView != null) {
            imageView.setTranslationX((i * this.f10986k) / 100);
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i6) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_puzzle_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f10980d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.f10981e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_lucky_bag_iv", "id"));
        this.f10982f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_lucky_bag_mask_iv", "id"));
        this.f10983g = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_g2c_finger", "id"));
        if (this.f10981e != null) {
            String a9 = g.a().a(b.d.f12126l);
            if (!TextUtils.isEmpty(a9)) {
                y.f().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.1
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        ImageView imageView = PuzzleV2G2CV2View.this.f10981e;
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                });
            }
        }
        if (this.f10983g != null) {
            String a10 = g.a().a(b.d.f12125k);
            if (!TextUtils.isEmpty(a10)) {
                y.f().a(new e(3, a10), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.2
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        ImageView imageView = PuzzleV2G2CV2View.this.f10983g;
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                });
            }
        }
        this.f10984h = q.a(getContext(), 20.0f);
        this.f10986k = q.a(getContext(), 176.0f);
        TextSeekbar textSeekbar = (TextSeekbar) findViewById(q.a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        this.f10985j = textSeekbar;
        if (textSeekbar != null) {
            textSeekbar.hideAll();
            this.f10985j.setProgressDrawable(null);
            this.f10985j.setThumb(null);
            this.f10985j.setThumbOffset(0);
            this.f10985j.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.3
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i9, boolean z3) {
                    int a11 = PuzzleV2G2CV2View.a(i9);
                    if (!z3) {
                        PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this, a11);
                        if (a11 == 100 && i9 == 100) {
                            PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this);
                            return;
                        }
                        return;
                    }
                    PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
                    if (puzzleV2G2CV2View.f10987l) {
                        puzzleV2G2CV2View.f10987l = false;
                        if (a11 > 30) {
                            puzzleV2G2CV2View.f10990o = false;
                        } else {
                            puzzleV2G2CV2View.f10990o = true;
                        }
                    }
                    if (!PuzzleV2G2CV2View.this.f10990o) {
                        seekBar.setProgress(0);
                    } else if (a11 > 30) {
                        PuzzleV2G2CV2View.a(PuzzleV2G2CV2View.this, i9);
                    } else {
                        PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this, a11);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
                    puzzleV2G2CV2View.f10987l = true;
                    ImageView imageView = puzzleV2G2CV2View.f10983g;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    Animation animation = PuzzleV2G2CV2View.this.i;
                    if (animation != null) {
                        animation.cancel();
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    if (PuzzleV2G2CV2View.this.f10990o) {
                        PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this, 0);
                        ImageView imageView = PuzzleV2G2CV2View.this.f10983g;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        Animation animation = PuzzleV2G2CV2View.this.i;
                        if (animation != null) {
                            animation.start();
                        }
                    }
                }
            });
        }
        ImageView imageView = this.f10980d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PuzzleV2G2CV2View.this.c();
                }
            });
        }
        if (this.i != null || this.f10983g == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, this.f10984h, 0.0f, 0.0f);
        this.i = translateAnimation;
        translateAnimation.setDuration(1000L);
        this.i.setRepeatCount(-1);
        this.f10983g.startAnimation(this.i);
    }

    public PuzzleV2G2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10991p = 30;
        this.f10989n = -1;
        this.f10992q = 300;
    }

    public static /* synthetic */ void b(PuzzleV2G2CV2View puzzleV2G2CV2View, int i) {
        ImageView imageView = puzzleV2G2CV2View.f10981e;
        if (imageView != null) {
            imageView.setTranslationX((i * puzzleV2G2CV2View.f10986k) / 100);
        }
    }

    public static /* synthetic */ void b(PuzzleV2G2CV2View puzzleV2G2CV2View) {
        puzzleV2G2CV2View.removeAllViews();
        puzzleV2G2CV2View.d();
    }

    public PuzzleV2G2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10991p = 30;
        this.f10989n = -1;
        this.f10992q = 300;
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View, com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a() {
        super.a();
        Animation animation = this.i;
        if (animation != null) {
            animation.start();
        }
    }

    public static /* synthetic */ void a(PuzzleV2G2CV2View puzzleV2G2CV2View, int i) {
        TextSeekbar textSeekbar = puzzleV2G2CV2View.f10985j;
        if (textSeekbar != null) {
            textSeekbar.setClickable(false);
            puzzleV2G2CV2View.f10985j.setEnabled(false);
            if (puzzleV2G2CV2View.f10988m == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
                puzzleV2G2CV2View.f10988m = ofInt;
                ofInt.addUpdateListener(puzzleV2G2CV2View.new AnonymousClass5());
                puzzleV2G2CV2View.f10988m.setDuration(300L);
                puzzleV2G2CV2View.f10988m.start();
            }
        }
    }
}
