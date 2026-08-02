package ru.yandex.taxi.surge.dialog;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ayt;
import defpackage.byt;
import defpackage.cma1;
import defpackage.cyt;
import defpackage.nqw0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tp11;
import defpackage.tsg0;
import defpackage.w511;
import defpackage.wxt;
import defpackage.x8s;
import defpackage.xng0;
import defpackage.xxt;
import defpackage.yrh0;
import defpackage.yxt;
import defpackage.zfh0;
import defpackage.zxt;
import io.appmetrica.analytics.impl.C0553n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/yandex/taxi/surge/dialog/GradientComponentView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwxt;", C0553n3.g, "Lzy11;", "renderGradientBackground", "(Lwxt;)V", "firstColor", "secondColor", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "leftBound", "rightBound", "Landroid/graphics/drawable/ShapeDrawable;", "createGradientDrawable", "(IIFFF)Landroid/graphics/drawable/ShapeDrawable;", "contentDrawable", "Landroid/graphics/drawable/Drawable;", "createRippleDrawable", "(Landroid/graphics/drawable/ShapeDrawable;F)Landroid/graphics/drawable/Drawable;", "topLineLayout", "bottomLineLayout", "Lxxt;", Constants.KEY_DATA, "renderBody", "(Lcom/yandex/go/design/view/GoLinearLayout;Lcom/yandex/go/design/view/GoLinearLayout;Lxxt;)V", "lineLayout", "Lyxt;", "line", "renderLine", "(Lcom/yandex/go/design/view/GoLinearLayout;Lyxt;)V", "Lcyt;", ClidProvider.STATE, "render", "(Lcyt;)V", "Lnqw0;", "binding", "Lnqw0;", "getBinding", "()Lnqw0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GradientComponentView extends GoLinearLayout {
    private final nqw0 binding;

    public GradientComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        View inflate = LayoutInflater.from(context).inflate(yrh0.surge_info_content_gradient_component, (ViewGroup) this, false);
        GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
        int i2 = zfh0.lead_body;
        if (((GoLinearLayout) cma1.O(i2, inflate)) != null) {
            i2 = zfh0.lead_bottom_line;
            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i2, inflate);
            if (goLinearLayout2 != null) {
                i2 = zfh0.lead_top_line;
                GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i2, inflate);
                if (goLinearLayout3 != null) {
                    i2 = zfh0.trail_body;
                    if (((GoLinearLayout) cma1.O(i2, inflate)) != null) {
                        i2 = zfh0.trail_bottom_line;
                        GoLinearLayout goLinearLayout4 = (GoLinearLayout) cma1.O(i2, inflate);
                        if (goLinearLayout4 != null) {
                            i2 = zfh0.trail_top_line;
                            GoLinearLayout goLinearLayout5 = (GoLinearLayout) cma1.O(i2, inflate);
                            if (goLinearLayout5 != null) {
                                this.binding = new nqw0(goLinearLayout, goLinearLayout, goLinearLayout2, goLinearLayout3, goLinearLayout4, goLinearLayout5);
                                addView(goLinearLayout);
                                setClickable(true);
                                setFocusable(true);
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final ShapeDrawable createGradientDrawable(final int firstColor, final int secondColor, final float cornerRadius, final float leftBound, final float rightBound) {
        final RectShape rectShape = new RectShape();
        return new ShapeDrawable(leftBound, rightBound, firstColor, secondColor, cornerRadius, rectShape) { // from class: ru.yandex.taxi.surge.dialog.GradientComponentView$createGradientDrawable$1
            final /* synthetic */ float $cornerRadius;
            final /* synthetic */ int $firstColor;
            final /* synthetic */ float $leftBound;
            final /* synthetic */ float $rightBound;
            final /* synthetic */ int $secondColor;
            private int cachedFirstColor;
            private float cachedLeftBound;
            private float cachedRightBound;
            private int cachedSecondColor;
            private LinearGradient cachedShader;
            private float cachedWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(rectShape);
                this.$leftBound = leftBound;
                this.$rightBound = rightBound;
                this.$firstColor = firstColor;
                this.$secondColor = secondColor;
                this.$cornerRadius = cornerRadius;
                this.cachedLeftBound = leftBound;
                this.cachedRightBound = rightBound;
                this.cachedFirstColor = firstColor;
                this.cachedSecondColor = secondColor;
            }

            @Override // android.graphics.drawable.ShapeDrawable
            public void onDraw(Shape shape, Canvas canvas, Paint paint) {
                Rect bounds = getBounds();
                float width = bounds.width();
                float height = bounds.height();
                float f = this.$leftBound;
                float f2 = width * f;
                float f3 = this.$rightBound;
                float f4 = width * f3;
                if (this.cachedShader == null || this.cachedWidth != width || this.cachedLeftBound != f || this.cachedRightBound != f3 || this.cachedFirstColor != this.$firstColor || this.cachedSecondColor != this.$secondColor) {
                    this.cachedShader = new LinearGradient(f2, 0.0f, f4, 0.0f, new int[]{this.$firstColor, this.$secondColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.cachedWidth = width;
                    this.cachedLeftBound = this.$leftBound;
                    this.cachedRightBound = this.$rightBound;
                    this.cachedFirstColor = this.$firstColor;
                    this.cachedSecondColor = this.$secondColor;
                }
                paint.setShader(this.cachedShader);
                if (canvas != null) {
                    float f5 = this.$cornerRadius;
                    canvas.drawRoundRect(0.0f, 0.0f, width, height, f5, f5, paint);
                }
            }
        };
    }

    private final Drawable createRippleDrawable(ShapeDrawable contentDrawable, float cornerRadius) {
        int t = qje.t(xng0.controlPressed, getContext());
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = cornerRadius;
        }
        return new RippleDrawable(ColorStateList.valueOf(t), contentDrawable, new ShapeDrawable(new RoundRectShape(fArr, null, null)));
    }

    private final void renderBody(GoLinearLayout topLineLayout, GoLinearLayout bottomLineLayout, xxt data) {
        topLineLayout.removeAllViews();
        bottomLineLayout.removeAllViews();
        renderLine(topLineLayout, data.a);
        renderLine(bottomLineLayout, data.b);
    }

    private final void renderGradientBackground(wxt background) {
        int m = s8o.m(background.a, getContext());
        int m2 = s8o.m(background.b, getContext());
        float r = tje.r(tsg0.gradient_component_corner_radius, getContext());
        this.binding.b.setBackground(createRippleDrawable(createGradientDrawable(m, m2, r, background.c, background.d), r));
    }

    private final void renderLine(GoLinearLayout lineLayout, yxt line) {
        for (byt bytVar : line.a) {
            if (bytVar instanceof ayt) {
                RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
                ayt aytVar = (ayt) bytVar;
                robotoTextView.setText(aytVar.a);
                robotoTextView.setTextSize(aytVar.b);
                robotoTextView.setTextColor(s8o.m(aytVar.d, robotoTextView.getContext()));
                Boolean bool = tp11.a;
                tp11.b(x8s.b(aytVar.c), robotoTextView);
                robotoTextView.setIncludeFontPadding(false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                robotoTextView.setLayoutParams(layoutParams);
                lineLayout.addView(robotoTextView);
            } else {
                if (!(bytVar instanceof zxt)) {
                    w511.b();
                    return;
                }
                zxt zxtVar = (zxt) bytVar;
                int u = tje.u(zxtVar.b, getContext());
                GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
                goImageView.setAdjustViewBounds(true);
                goImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(u, u);
                layoutParams2.gravity = 16;
                goImageView.setLayoutParams(layoutParams2);
                Drawable drawable = zxtVar.a;
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    mutate.setTint(s8o.m(zxtVar.c, getContext()));
                    goImageView.setImageDrawable(mutate);
                }
                lineLayout.addView(goImageView);
            }
        }
    }

    public final nqw0 getBinding() {
        return this.binding;
    }

    public final void render(cyt state) {
        this.binding.a.setContentDescription(state.d.a);
        renderGradientBackground(state.c);
        nqw0 nqw0Var = this.binding;
        renderBody(nqw0Var.d, nqw0Var.c, state.a);
        nqw0 nqw0Var2 = this.binding;
        renderBody(nqw0Var2.f, nqw0Var2.e, state.b);
    }

    public GradientComponentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GradientComponentView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GradientComponentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
