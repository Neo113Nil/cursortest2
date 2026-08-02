package com.anythink.basead.ui.guidetoclickv2;

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
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.ui.guidetoclickv2.picverify.TextSeekbar;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class PuzzleV2G2CV2View extends BaseLifecycleG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    ImageView f11766d;

    /* renamed from: e, reason: collision with root package name */
    ImageView f11767e;

    /* renamed from: f, reason: collision with root package name */
    ImageView f11768f;

    /* renamed from: g, reason: collision with root package name */
    ImageView f11769g;

    /* renamed from: h, reason: collision with root package name */
    int f11770h;
    Animation i;

    /* renamed from: j, reason: collision with root package name */
    TextSeekbar f11771j;

    /* renamed from: k, reason: collision with root package name */
    int f11772k;

    /* renamed from: l, reason: collision with root package name */
    boolean f11773l;

    /* renamed from: m, reason: collision with root package name */
    ValueAnimator f11774m;

    /* renamed from: n, reason: collision with root package name */
    int f11775n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f11776o;

    /* renamed from: p, reason: collision with root package name */
    private final int f11777p;

    /* renamed from: q, reason: collision with root package name */
    private final int f11778q;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View$5, reason: invalid class name */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
            if (puzzleV2G2CV2View.f11775n != intValue) {
                puzzleV2G2CV2View.f11775n = intValue;
                puzzleV2G2CV2View.f11771j.setProgress(intValue);
            }
        }
    }

    public PuzzleV2G2CV2View(Context context) {
        super(context);
        this.f11777p = 30;
        this.f11775n = -1;
        this.f11778q = 300;
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
        TextSeekbar textSeekbar = this.f11771j;
        if (textSeekbar != null) {
            textSeekbar.setClickable(false);
            this.f11771j.setEnabled(false);
            if (this.f11774m == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
                this.f11774m = ofInt;
                ofInt.addUpdateListener(new AnonymousClass5());
                this.f11774m.setDuration(300L);
                this.f11774m.start();
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
        if (this.i != null || this.f11769g == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, this.f11770h, 0.0f, 0.0f);
        this.i = translateAnimation;
        translateAnimation.setDuration(1000L);
        this.i.setRepeatCount(-1);
        this.f11769g.startAnimation(this.i);
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
        ValueAnimator valueAnimator = this.f11774m;
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
        ImageView imageView = this.f11767e;
        if (imageView != null) {
            imageView.setTranslationX((i * this.f11772k) / 100);
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_puzzle_v2", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.f11766d = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.f11767e = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_lucky_bag_iv", "id"));
        this.f11768f = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_lucky_bag_mask_iv", "id"));
        this.f11769g = (ImageView) findViewById(q.a(getContext(), "myoffer_g2c_item_g2c_finger", "id"));
        if (this.f11767e != null) {
            String a9 = g.a().a(b.d.f12912l);
            if (!TextUtils.isEmpty(a9)) {
                k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.1
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        ImageView imageView = PuzzleV2G2CV2View.this.f11767e;
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                });
            }
        }
        if (this.f11769g != null) {
            String a10 = g.a().a(b.d.f12911k);
            if (!TextUtils.isEmpty(a10)) {
                k.j().a(new e(3, a10), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.2
                    @Override // com.anythink.core.common.res.b.a
                    public final void onFail(String str, String str2) {
                    }

                    @Override // com.anythink.core.common.res.b.a
                    public final void onSuccess(String str, Bitmap bitmap) {
                        ImageView imageView = PuzzleV2G2CV2View.this.f11769g;
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                    }
                });
            }
        }
        this.f11770h = q.a(getContext(), 20.0f);
        this.f11772k = q.a(getContext(), 176.0f);
        TextSeekbar textSeekbar = (TextSeekbar) findViewById(q.a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        this.f11771j = textSeekbar;
        if (textSeekbar != null) {
            textSeekbar.hideAll();
            this.f11771j.setProgressDrawable(null);
            this.f11771j.setThumb(null);
            this.f11771j.setThumbOffset(0);
            this.f11771j.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.3
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i6, boolean z6) {
                    int a11 = PuzzleV2G2CV2View.a(i6);
                    if (!z6) {
                        PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this, a11);
                        if (a11 == 100 && i6 == 100) {
                            PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this);
                            return;
                        }
                        return;
                    }
                    PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
                    if (puzzleV2G2CV2View.f11773l) {
                        puzzleV2G2CV2View.f11773l = false;
                        if (a11 > 30) {
                            puzzleV2G2CV2View.f11776o = false;
                        } else {
                            puzzleV2G2CV2View.f11776o = true;
                        }
                    }
                    if (!PuzzleV2G2CV2View.this.f11776o) {
                        seekBar.setProgress(0);
                    } else if (a11 > 30) {
                        PuzzleV2G2CV2View.a(PuzzleV2G2CV2View.this, i6);
                    } else {
                        PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this, a11);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    PuzzleV2G2CV2View puzzleV2G2CV2View = PuzzleV2G2CV2View.this;
                    puzzleV2G2CV2View.f11773l = true;
                    ImageView imageView = puzzleV2G2CV2View.f11769g;
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
                    if (PuzzleV2G2CV2View.this.f11776o) {
                        PuzzleV2G2CV2View.b(PuzzleV2G2CV2View.this, 0);
                        ImageView imageView = PuzzleV2G2CV2View.this.f11769g;
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
        ImageView imageView = this.f11766d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PuzzleV2G2CV2View.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PuzzleV2G2CV2View.this.c();
                }
            });
        }
        if (this.i != null || this.f11769g == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, this.f11770h, 0.0f, 0.0f);
        this.i = translateAnimation;
        translateAnimation.setDuration(1000L);
        this.i.setRepeatCount(-1);
        this.f11769g.startAnimation(this.i);
    }

    public PuzzleV2G2CV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11777p = 30;
        this.f11775n = -1;
        this.f11778q = 300;
    }

    public static /* synthetic */ void b(PuzzleV2G2CV2View puzzleV2G2CV2View, int i) {
        ImageView imageView = puzzleV2G2CV2View.f11767e;
        if (imageView != null) {
            imageView.setTranslationX((i * puzzleV2G2CV2View.f11772k) / 100);
        }
    }

    public static /* synthetic */ void b(PuzzleV2G2CV2View puzzleV2G2CV2View) {
        puzzleV2G2CV2View.removeAllViews();
        puzzleV2G2CV2View.d();
    }

    public PuzzleV2G2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11777p = 30;
        this.f11775n = -1;
        this.f11778q = 300;
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
        TextSeekbar textSeekbar = puzzleV2G2CV2View.f11771j;
        if (textSeekbar != null) {
            textSeekbar.setClickable(false);
            puzzleV2G2CV2View.f11771j.setEnabled(false);
            if (puzzleV2G2CV2View.f11774m == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
                puzzleV2G2CV2View.f11774m = ofInt;
                ofInt.addUpdateListener(puzzleV2G2CV2View.new AnonymousClass5());
                puzzleV2G2CV2View.f11774m.setDuration(300L);
                puzzleV2G2CV2View.f11774m.start();
            }
        }
    }
}
