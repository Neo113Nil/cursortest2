package com.anythink.basead.ui.guidetoclickv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView;
import com.anythink.basead.ui.guidetoclickv2.picverify.TextSeekbar;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class PicVerifyG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    PictureVerifyView f11748d;

    /* renamed from: e, reason: collision with root package name */
    TextSeekbar f11749e;

    /* renamed from: f, reason: collision with root package name */
    String f11750f;

    /* renamed from: g, reason: collision with root package name */
    ValueAnimator f11751g;

    /* renamed from: h, reason: collision with root package name */
    ValueAnimator f11752h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11753j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11754k;

    /* renamed from: l, reason: collision with root package name */
    private final int f11755l;

    /* renamed from: m, reason: collision with root package name */
    private final int f11756m;

    /* renamed from: n, reason: collision with root package name */
    private final int f11757n;

    /* renamed from: o, reason: collision with root package name */
    private final int f11758o;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View$4, reason: invalid class name */
    public class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass4() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PicVerifyG2CV2View.this.f11749e.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View$5, reason: invalid class name */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PicVerifyG2CV2View picVerifyG2CV2View = PicVerifyG2CV2View.this;
            if (picVerifyG2CV2View.i != intValue) {
                picVerifyG2CV2View.i = intValue;
                picVerifyG2CV2View.f11749e.setProgress(intValue);
            }
        }
    }

    public PicVerifyG2CV2View(Context context) {
        super(context);
        this.f11755l = 30;
        this.f11756m = 15;
        this.f11757n = 500;
        this.f11758o = 300;
        this.i = -1;
    }

    private void d() {
        this.f11749e.setProgress(0);
    }

    private void e() {
        if (this.f11751g == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 15);
            this.f11751g = ofInt;
            ofInt.addUpdateListener(new AnonymousClass4());
            this.f11751g.setRepeatMode(2);
            this.f11751g.setRepeatCount(-1);
            this.f11751g.setDuration(500L);
        }
        if (this.f11751g.isStarted() || this.f11752h != null) {
            return;
        }
        this.f11751g.start();
    }

    private void f() {
        ValueAnimator valueAnimator = this.f11751g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public boolean canStartNextAnim() {
        return this.f11752h == null;
    }

    public void loadImage(String str) {
        this.f11750f = str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.f11751g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f11752h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public static /* synthetic */ void d(PicVerifyG2CV2View picVerifyG2CV2View) {
        ValueAnimator valueAnimator = picVerifyG2CV2View.f11751g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_pic_vertify", "layout"), this);
        this.f11748d = (PictureVerifyView) findViewById(q.a(getContext(), "myoffer_g2c_picvertify", "id"));
        this.f11749e = (TextSeekbar) findViewById(q.a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        final int a9 = q.a(getContext(), 48.0f);
        this.f11748d.setBlockSize(a9);
        this.f11748d.callback(new PictureVerifyView.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.1
            @Override // com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView.a
            public final void a() {
                c.a aVar = PicVerifyG2CV2View.this.f11620c;
                if (aVar != null) {
                    aVar.a(11, 16);
                }
            }

            @Override // com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView.a
            public final void b() {
            }
        });
        if (!TextUtils.isEmpty(this.f11750f)) {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f11750f), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, PicVerifyG2CV2View.this.f11750f)) {
                        DisplayMetrics displayMetrics = PicVerifyG2CV2View.this.getContext().getResources().getDisplayMetrics();
                        int[] a10 = am.a(displayMetrics.widthPixels, displayMetrics.heightPixels, bitmap.getWidth() / bitmap.getHeight());
                        int i6 = a9 * 2;
                        if (bitmap.getWidth() < i6 || bitmap.getHeight() < i6) {
                            BaseG2CV2View.b bVar = PicVerifyG2CV2View.this.f11618a;
                            if (bVar != null) {
                                bVar.a();
                                return;
                            }
                            return;
                        }
                        int a11 = q.a(PicVerifyG2CV2View.this.getContext(), 180.0f);
                        if (a10[0] < a11 || a10[1] < a11) {
                            BaseG2CV2View.b bVar2 = PicVerifyG2CV2View.this.f11618a;
                            if (bVar2 != null) {
                                bVar2.a();
                                return;
                            }
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = PicVerifyG2CV2View.this.f11748d.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a10[0];
                            layoutParams.height = a10[1];
                            PicVerifyG2CV2View.this.f11748d.setLayoutParams(layoutParams);
                        }
                        PicVerifyG2CV2View.this.f11748d.setImageBitmap(bitmap);
                        PicVerifyG2CV2View.this.post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((RelativeLayout.LayoutParams) PicVerifyG2CV2View.this.f11749e.getLayoutParams()).setMargins(0, (a9 / 2) + (PicVerifyG2CV2View.this.getMeasuredHeight() / 2), 0, 0);
                                PicVerifyG2CV2View.this.f11749e.setVisibility(0);
                                PicVerifyG2CV2View.a(PicVerifyG2CV2View.this);
                            }
                        });
                    }
                }
            });
        }
        this.f11749e.setProgressDrawable(getResources().getDrawable(q.a(getContext(), "myoffer_g2c_seek_bar_bg", k.f20419c)));
        TextSeekbar textSeekbar = this.f11749e;
        Context context = getContext();
        int a10 = q.a(getContext(), "myoffer_seek_bar_icon", k.f20419c);
        textSeekbar.setThumb(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), a10), q.a(getContext(), 60.0f), q.a(getContext(), 24.0f), false)));
        this.f11749e.setThumbOffset(0);
        this.f11749e.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i6, boolean z6) {
                if (!z6) {
                    PicVerifyG2CV2View.this.f11748d.move(i6);
                    if (i6 == 100) {
                        PicVerifyG2CV2View.this.f11748d.loose();
                        return;
                    }
                    return;
                }
                if (PicVerifyG2CV2View.this.f11754k) {
                    PicVerifyG2CV2View.this.f11754k = false;
                    if (i6 > 30) {
                        PicVerifyG2CV2View.this.f11753j = false;
                    } else {
                        PicVerifyG2CV2View.this.f11753j = true;
                    }
                }
                if (!PicVerifyG2CV2View.this.f11753j) {
                    seekBar.setProgress(0);
                } else if (i6 > 30) {
                    PicVerifyG2CV2View.a(PicVerifyG2CV2View.this, i6);
                } else {
                    PicVerifyG2CV2View.this.f11748d.move(i6);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                PicVerifyG2CV2View.this.f11754k = true;
                PicVerifyG2CV2View.d(PicVerifyG2CV2View.this);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                if (PicVerifyG2CV2View.this.f11753j) {
                    PicVerifyG2CV2View.this.f11748d.loose();
                }
                PicVerifyG2CV2View.a(PicVerifyG2CV2View.this);
            }
        });
    }

    private void a(int i) {
        this.f11749e.setClickable(false);
        this.f11749e.setEnabled(false);
        this.f11749e.getProgressDrawable().setAlpha(p.f9259b);
        if (this.f11752h == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
            this.f11752h = ofInt;
            ofInt.addUpdateListener(new AnonymousClass5());
            this.f11752h.setDuration(300L);
            this.f11752h.start();
        }
    }

    private BitmapDrawable a(Context context, int i, int i4, int i6) {
        return new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), i), i4, i6, false));
    }

    public static /* synthetic */ void a(PicVerifyG2CV2View picVerifyG2CV2View) {
        if (picVerifyG2CV2View.f11751g == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 15);
            picVerifyG2CV2View.f11751g = ofInt;
            ofInt.addUpdateListener(picVerifyG2CV2View.new AnonymousClass4());
            picVerifyG2CV2View.f11751g.setRepeatMode(2);
            picVerifyG2CV2View.f11751g.setRepeatCount(-1);
            picVerifyG2CV2View.f11751g.setDuration(500L);
        }
        if (picVerifyG2CV2View.f11751g.isStarted() || picVerifyG2CV2View.f11752h != null) {
            return;
        }
        picVerifyG2CV2View.f11751g.start();
    }

    public static /* synthetic */ void a(PicVerifyG2CV2View picVerifyG2CV2View, int i) {
        picVerifyG2CV2View.f11749e.setClickable(false);
        picVerifyG2CV2View.f11749e.setEnabled(false);
        picVerifyG2CV2View.f11749e.getProgressDrawable().setAlpha(p.f9259b);
        if (picVerifyG2CV2View.f11752h == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
            picVerifyG2CV2View.f11752h = ofInt;
            ofInt.addUpdateListener(picVerifyG2CV2View.new AnonymousClass5());
            picVerifyG2CV2View.f11752h.setDuration(300L);
            picVerifyG2CV2View.f11752h.start();
        }
    }
}
