package com.yandex.plus.home.animation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.btf;
import defpackage.hr2;
import defpackage.jyr;
import defpackage.vq2;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d extends View {
    public static final /* synthetic */ int r = 0;
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final int[] e;
    public final float[] f;
    public final float g;
    public final float h;
    public final float i;
    public final jyr j;
    public final jyr k;
    public final float l;
    public final float m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull final Context context) {
        super(context);
        context.getClass();
        final int i = 0;
        this.a = btf.b(new Function0() { // from class: com.yandex.plus.home.animation.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                d dVar = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        int i3 = d.r;
                        Drawable e = com.yandex.plus.home.common.utils.a.e(context2, R.drawable.plus_sdk_plus_loading_anim_points);
                        e.getClass();
                        int i4 = (int) dVar.i;
                        return vq2.N(e, i4, i4, 4);
                    default:
                        int i5 = d.r;
                        Drawable e2 = com.yandex.plus.home.common.utils.a.e(context2, R.drawable.plus_sdk_plus_loading_anim_mask);
                        e2.getClass();
                        int i6 = (int) dVar.h;
                        return vq2.N(e2, i6, i6, 4);
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0() { // from class: com.yandex.plus.home.animation.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                d dVar = this;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        int i3 = d.r;
                        Drawable e = com.yandex.plus.home.common.utils.a.e(context2, R.drawable.plus_sdk_plus_loading_anim_points);
                        e.getClass();
                        int i4 = (int) dVar.i;
                        return vq2.N(e, i4, i4, 4);
                    default:
                        int i5 = d.r;
                        Drawable e2 = com.yandex.plus.home.common.utils.a.e(context2, R.drawable.plus_sdk_plus_loading_anim_mask);
                        e2.getClass();
                        int i6 = (int) dVar.h;
                        return vq2.N(e2, i6, i6, 4);
                }
            }
        });
        this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.home.animation.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                int i4 = 2;
                d dVar = this.b;
                switch (i3) {
                    case 0:
                        int i5 = (int) dVar.h;
                        Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        return d.a(dVar);
                    case 2:
                        int i6 = d.r;
                        return Float.valueOf(dVar.getWidth() / 2.0f);
                    case 3:
                        int i7 = d.r;
                        return Float.valueOf(dVar.getHeight() / 2.0f);
                    case 4:
                        int i8 = d.r;
                        Paint paint = new Paint();
                        float f = (dVar.h / 2) + dVar.g;
                        paint.setShader(new LinearGradient(0.0f, f, f, 0.0f, dVar.e, dVar.f, Shader.TileMode.REPEAT));
                        return paint;
                    default:
                        int i9 = d.r;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
                        ofFloat.setDuration(1440L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setRepeatCount(-1);
                        ofFloat.addUpdateListener(new hr2(22, dVar));
                        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i4, dVar));
                        return ofFloat;
                }
            }
        });
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.home.animation.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                int i4 = 2;
                d dVar = this.b;
                switch (i3) {
                    case 0:
                        int i5 = (int) dVar.h;
                        Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        return d.a(dVar);
                    case 2:
                        int i6 = d.r;
                        return Float.valueOf(dVar.getWidth() / 2.0f);
                    case 3:
                        int i7 = d.r;
                        return Float.valueOf(dVar.getHeight() / 2.0f);
                    case 4:
                        int i8 = d.r;
                        Paint paint = new Paint();
                        float f = (dVar.h / 2) + dVar.g;
                        paint.setShader(new LinearGradient(0.0f, f, f, 0.0f, dVar.e, dVar.f, Shader.TileMode.REPEAT));
                        return paint;
                    default:
                        int i9 = d.r;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
                        ofFloat.setDuration(1440L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setRepeatCount(-1);
                        ofFloat.addUpdateListener(new hr2(22, dVar));
                        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i4, dVar));
                        return ofFloat;
                }
            }
        });
        this.e = new int[]{r1.i(R.color.plus_sdk_home_loading_anim_fox, this), r1.i(R.color.plus_sdk_home_loading_anim_purple, this), r1.i(R.color.plus_sdk_home_loading_anim_violet, this), r1.i(R.color.plus_sdk_home_loading_anim_sky_blue, this)};
        final int i3 = 4;
        this.f = new float[]{0.25f, 0.42f, 0.57f, 0.75f};
        float k = r1.k(R.dimen.plus_sdk_gradient_radius, this);
        this.g = k;
        float f = k * 2.1f;
        this.h = f;
        float f2 = 0.48f * f;
        this.i = f2;
        final int i4 = 2;
        this.j = btf.b(new Function0(this) { // from class: com.yandex.plus.home.animation.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                int i42 = 2;
                d dVar = this.b;
                switch (i32) {
                    case 0:
                        int i5 = (int) dVar.h;
                        Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        return d.a(dVar);
                    case 2:
                        int i6 = d.r;
                        return Float.valueOf(dVar.getWidth() / 2.0f);
                    case 3:
                        int i7 = d.r;
                        return Float.valueOf(dVar.getHeight() / 2.0f);
                    case 4:
                        int i8 = d.r;
                        Paint paint = new Paint();
                        float f3 = (dVar.h / 2) + dVar.g;
                        paint.setShader(new LinearGradient(0.0f, f3, f3, 0.0f, dVar.e, dVar.f, Shader.TileMode.REPEAT));
                        return paint;
                    default:
                        int i9 = d.r;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
                        ofFloat.setDuration(1440L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setRepeatCount(-1);
                        ofFloat.addUpdateListener(new hr2(22, dVar));
                        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i42, dVar));
                        return ofFloat;
                }
            }
        });
        final int i5 = 3;
        this.k = btf.b(new Function0(this) { // from class: com.yandex.plus.home.animation.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                int i42 = 2;
                d dVar = this.b;
                switch (i32) {
                    case 0:
                        int i52 = (int) dVar.h;
                        Bitmap createBitmap = Bitmap.createBitmap(i52, i52, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        return d.a(dVar);
                    case 2:
                        int i6 = d.r;
                        return Float.valueOf(dVar.getWidth() / 2.0f);
                    case 3:
                        int i7 = d.r;
                        return Float.valueOf(dVar.getHeight() / 2.0f);
                    case 4:
                        int i8 = d.r;
                        Paint paint = new Paint();
                        float f3 = (dVar.h / 2) + dVar.g;
                        paint.setShader(new LinearGradient(0.0f, f3, f3, 0.0f, dVar.e, dVar.f, Shader.TileMode.REPEAT));
                        return paint;
                    default:
                        int i9 = d.r;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
                        ofFloat.setDuration(1440L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setRepeatCount(-1);
                        ofFloat.addUpdateListener(new hr2(22, dVar));
                        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i42, dVar));
                        return ofFloat;
                }
            }
        });
        float f3 = 2;
        this.l = f / f3;
        this.m = f2 / f3;
        this.n = btf.b(new Function0(this) { // from class: com.yandex.plus.home.animation.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                int i42 = 2;
                d dVar = this.b;
                switch (i32) {
                    case 0:
                        int i52 = (int) dVar.h;
                        Bitmap createBitmap = Bitmap.createBitmap(i52, i52, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        return d.a(dVar);
                    case 2:
                        int i6 = d.r;
                        return Float.valueOf(dVar.getWidth() / 2.0f);
                    case 3:
                        int i7 = d.r;
                        return Float.valueOf(dVar.getHeight() / 2.0f);
                    case 4:
                        int i8 = d.r;
                        Paint paint = new Paint();
                        float f32 = (dVar.h / 2) + dVar.g;
                        paint.setShader(new LinearGradient(0.0f, f32, f32, 0.0f, dVar.e, dVar.f, Shader.TileMode.REPEAT));
                        return paint;
                    default:
                        int i9 = d.r;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
                        ofFloat.setDuration(1440L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setRepeatCount(-1);
                        ofFloat.addUpdateListener(new hr2(22, dVar));
                        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i42, dVar));
                        return ofFloat;
                }
            }
        });
        this.o = btf.b(new s(19));
        final int i6 = 5;
        this.p = btf.b(new Function0(this) { // from class: com.yandex.plus.home.animation.c
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                int i42 = 2;
                d dVar = this.b;
                switch (i32) {
                    case 0:
                        int i52 = (int) dVar.h;
                        Bitmap createBitmap = Bitmap.createBitmap(i52, i52, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return createBitmap;
                    case 1:
                        return d.a(dVar);
                    case 2:
                        int i62 = d.r;
                        return Float.valueOf(dVar.getWidth() / 2.0f);
                    case 3:
                        int i7 = d.r;
                        return Float.valueOf(dVar.getHeight() / 2.0f);
                    case 4:
                        int i8 = d.r;
                        Paint paint = new Paint();
                        float f32 = (dVar.h / 2) + dVar.g;
                        paint.setShader(new LinearGradient(0.0f, f32, f32, 0.0f, dVar.e, dVar.f, Shader.TileMode.REPEAT));
                        return paint;
                    default:
                        int i9 = d.r;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
                        ofFloat.setDuration(1440L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setRepeatCount(-1);
                        ofFloat.addUpdateListener(new hr2(22, dVar));
                        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i42, dVar));
                        return ofFloat;
                }
            }
        });
        setBackgroundColor(com.yandex.plus.home.common.utils.a.b(context, R.attr.backgroundColor));
    }

    public static Canvas a(d dVar) {
        return new Canvas(dVar.getGradientDropsBitmap());
    }

    private final ValueAnimator getAnimation() {
        return (ValueAnimator) this.p.getValue();
    }

    private final Bitmap getDropsMask() {
        return (Bitmap) this.b.getValue();
    }

    private final Bitmap getGradientDropsBitmap() {
        return (Bitmap) this.c.getValue();
    }

    private final Canvas getGradientDropsCanvas() {
        return (Canvas) this.d.getValue();
    }

    private final Paint getGradientPaint() {
        return (Paint) this.n.getValue();
    }

    private final Paint getMaskPaint() {
        return (Paint) this.o.getValue();
    }

    private final Bitmap getPlusIcon() {
        return (Bitmap) this.a.getValue();
    }

    private final float getViewCenterX() {
        return ((Number) this.j.getValue()).floatValue();
    }

    private final float getViewCenterY() {
        return ((Number) this.k.getValue()).floatValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getAnimation().cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Canvas gradientDropsCanvas = getGradientDropsCanvas();
        float f = this.g;
        Paint gradientPaint = getGradientPaint();
        float f2 = this.l;
        gradientDropsCanvas.drawCircle(f2, f2, f, gradientPaint);
        Canvas gradientDropsCanvas2 = getGradientDropsCanvas();
        float f3 = this.q;
        int save = gradientDropsCanvas2.save();
        gradientDropsCanvas2.rotate(f3, f2, f2);
        try {
            getGradientDropsCanvas().drawBitmap(getDropsMask(), 0.0f, 0.0f, getMaskPaint());
            gradientDropsCanvas2.restoreToCount(save);
            Bitmap plusIcon = getPlusIcon();
            float viewCenterX = getViewCenterX();
            float f4 = this.m;
            canvas.drawBitmap(plusIcon, viewCenterX - f4, getViewCenterY() - f4, (Paint) null);
            canvas.drawBitmap(getGradientDropsBitmap(), getViewCenterX() - f2, getViewCenterY() - f2, (Paint) null);
        } catch (Throwable th) {
            gradientDropsCanvas2.restoreToCount(save);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getAnimation().start();
    }
}
