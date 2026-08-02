package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.datasource.openapi.models.u6;
import defpackage.e3o;
import defpackage.fmq;
import defpackage.hr2;
import defpackage.xz0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class GiftProgressView extends AppCompatTextView {
    public static final /* synthetic */ int n = 0;
    public final int h;
    public final float i;
    public final float j;
    public final ShapeDrawable k;
    public boolean l;
    public final fmq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftProgressView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.h = r1.k(R.dimen.plus_sdk_panel_daily_gift_progress_content_height, this);
        this.i = r1.k(R.dimen.plus_sdk_panel_daily_gift_progress_corner_radius, this);
        float k = r1.k(R.dimen.plus_sdk_panel_daily_gift_progress_score_margin_start, this);
        this.j = k;
        this.k = new ShapeDrawable();
        setTextSize(14.0f);
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        setTypeface(e3o.a(context, com.yandex.plus.bdui.plus.analytics.b.v(R.attr.plus_sdk_fontFamily_medium, theme).resourceId));
        setGravity(8388627);
        setTextAlignment(5);
        setPadding((int) k, getPaddingTop(), (int) k, getPaddingBottom());
        this.m = new fmq(11, false);
    }

    public static final void p(GiftProgressView giftProgressView, d dVar) {
        CharSequence charSequence = dVar.b;
        float f = dVar.f;
        giftProgressView.setText(charSequence);
        fmq fmqVar = giftProgressView.m;
        ValueAnimator valueAnimator = (ValueAnimator) fmqVar.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        fmqVar.c = null;
        ValueAnimator valueAnimator2 = (ValueAnimator) fmqVar.d;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.cancel();
        }
        fmqVar.d = null;
        fmqVar.b = false;
        if (!giftProgressView.l) {
            giftProgressView.q(dVar, f);
            giftProgressView.r(dVar, f);
            return;
        }
        giftProgressView.q(dVar, 0.0f);
        com.yandex.plus.bdui.templating.render.a aVar = new com.yandex.plus.bdui.templating.render.a(8, giftProgressView, dVar);
        u6 u6Var = new u6(13);
        com.yandex.plus.bdui.plus.webview.navigation.a aVar2 = new com.yandex.plus.bdui.plus.webview.navigation.a(24);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new hr2(25, aVar));
        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators.b(u6Var, fmqVar, dVar, aVar2));
        fmqVar.c = ofFloat;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        fmq fmqVar = this.m;
        ValueAnimator valueAnimator = (ValueAnimator) fmqVar.c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        fmqVar.c = null;
        ValueAnimator valueAnimator2 = (ValueAnimator) fmqVar.d;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.cancel();
        }
        fmqVar.d = null;
        fmqVar.b = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.h);
    }

    public final void q(d dVar, float f) {
        c cVar = dVar.e;
        b bVar = cVar instanceof b ? (b) cVar : null;
        Integer valueOf = bVar != null ? Integer.valueOf(bVar.a) : null;
        c cVar2 = dVar.a;
        b bVar2 = cVar2 instanceof b ? (b) cVar2 : null;
        Integer valueOf2 = bVar2 != null ? Integer.valueOf(bVar2.a) : null;
        if (r1.q(this)) {
            f = 1.0f - f;
        }
        int[] v0 = CollectionsKt.v0(xz0.w(new Integer[]{valueOf, valueOf, valueOf2}));
        float[] fArr = {0.0f, f, f};
        ShapeDrawable shapeDrawable = this.k;
        Paint paint = shapeDrawable.getPaint();
        float width = getWidth();
        if (r1.q(this)) {
            v0 = xz0.Q(v0);
        }
        int[] iArr = v0;
        if (r1.q(this)) {
            fArr = xz0.P(fArr);
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr2[i] = this.i;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr2, null, null));
        setBackground(shapeDrawable);
    }

    public final void r(d dVar, float f) {
        c cVar = dVar.c;
        b bVar = cVar instanceof b ? (b) cVar : null;
        Integer valueOf = bVar != null ? Integer.valueOf(bVar.a) : null;
        c cVar2 = dVar.d;
        b bVar2 = cVar2 instanceof b ? (b) cVar2 : null;
        Integer valueOf2 = bVar2 != null ? Integer.valueOf(bVar2.a) : null;
        float width = this.j / getWidth();
        if (r1.q(this)) {
            f = 1.0f - f;
        }
        float f2 = f - width;
        int[] v0 = CollectionsKt.v0(xz0.w(new Integer[]{valueOf, valueOf, valueOf2}));
        float[] fArr = {0.0f, f2, f2};
        TextPaint paint = getPaint();
        float width2 = getWidth();
        if (r1.q(this)) {
            v0 = xz0.Q(v0);
        }
        int[] iArr = v0;
        if (r1.q(this)) {
            fArr = xz0.P(fArr);
        }
        paint.setShader(new LinearGradient(0.0f, 0.0f, width2, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ GiftProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
