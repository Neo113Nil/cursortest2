package ru.yandex.taxi.design;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.agh0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.g18;
import defpackage.lbm;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qm60;
import defpackage.zrh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/yandex/taxi/design/NumberCheckoutView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lpav;", "imageLoader", "Lzy11;", "initDependencies", "(Lpav;)V", "", "number", "setNumber", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/Typeface;", "typeface", "setNumberTypeface", "(Landroid/graphics/Typeface;)V", "", "textSize", "setNumberTextSize", "(F)V", "hint", "setHint", "", "iconUrl", "setIcon", "(Ljava/lang/String;)V", "onDetachedFromWindow", "()V", "Lqm60;", "binding", "Lqm60;", "Lpav;", "Lg18;", "loadMainIconCancellable", "Lg18;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NumberCheckoutView extends GoLinearLayout {
    public static final int $stable = 8;
    private final qm60 binding;
    private pav imageLoader;
    private g18 loadMainIconCancellable;

    public NumberCheckoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, null);
        LayoutInflater.from(context).inflate(zrh0.number_checkout_layout, this);
        int i = agh0.number_checkout_hint;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = agh0.number_image;
            GoImageView goImageView = (GoImageView) cma1.O(i, this);
            if (goImageView != null) {
                i = agh0.number_label;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                if (robotoTextView2 != null) {
                    this.binding = new qm60(this, robotoTextView, goImageView, robotoTextView2);
                    setOrientation(1);
                    setBackgroundResource(f1h0.bg_rectangle_round_16dp_minor);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void initDependencies(pav imageLoader) {
        this.imageLoader = imageLoader;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.loadMainIconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadMainIconCancellable = null;
        super.onDetachedFromWindow();
    }

    public final void setHint(CharSequence hint) {
        this.binding.b.setText(hint);
    }

    public final void setIcon(String iconUrl) {
        lbm a;
        g18 g18Var = this.loadMainIconCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.binding.c.setVisibility((iconUrl == null || iconUrl.length() <= 0) ? 8 : 0);
        if (iconUrl == null || iconUrl.length() == 0) {
            return;
        }
        pav pavVar = this.imageLoader;
        this.loadMainIconCancellable = (pavVar == null || (a = pavVar.a(this.binding.c)) == null) ? null : ((nac) a).c(iconUrl);
    }

    public final void setNumber(CharSequence number) {
        this.binding.d.setText(number);
    }

    public final void setNumberTextSize(float textSize) {
        this.binding.d.setTextSize(textSize);
    }

    public final void setNumberTypeface(Typeface typeface) {
        this.binding.d.setTypeface(typeface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NumberCheckoutView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NumberCheckoutView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
