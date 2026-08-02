package com.yandex.payment.sdk.ui.view.payment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.aek;
import defpackage.bek;
import defpackage.cek;
import defpackage.dag;
import defpackage.dek;
import defpackage.eek;
import defpackage.fek;
import defpackage.jj4;
import defpackage.mmo;
import defpackage.qgg;
import defpackage.t7g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class PaymentButtonView extends ConstraintLayout {
    public final mmo q;
    public final int r;
    public final int s;
    public final int t;
    public ColorStateList u;
    public ColorStateList v;
    public ColorStateList w;
    public final int x;
    public fek y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentButtonView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_view_payment_button, this);
        int i2 = R.id.brand_icon;
        ImageView imageView = (ImageView) dag.v(R.id.brand_icon, this);
        if (imageView != null) {
            i2 = R.id.pay_subtotal_text;
            TextView textView = (TextView) dag.v(R.id.pay_subtotal_text, this);
            if (textView != null) {
                i2 = R.id.pay_text;
                TextView textView2 = (TextView) dag.v(R.id.pay_text, this);
                if (textView2 != null) {
                    i2 = R.id.pay_total_text;
                    TextView textView3 = (TextView) dag.v(R.id.pay_total_text, this);
                    if (textView3 != null) {
                        i2 = R.id.progress_bar;
                        ProgressBar progressBar = (ProgressBar) dag.v(R.id.progress_bar, this);
                        if (progressBar != null) {
                            i2 = R.id.sbp_icon;
                            ImageView imageView2 = (ImageView) dag.v(R.id.sbp_icon, this);
                            if (imageView2 != null) {
                                this.q = new mmo(this, imageView, textView, textView2, textView3, progressBar, imageView2);
                                Resources.Theme theme = context.getTheme();
                                theme.getClass();
                                TypedValue b0 = qgg.b0(R.attr.paymentsdk_payButtonBackground, theme);
                                int i3 = b0 != null ? b0.resourceId : 0;
                                this.r = i3;
                                this.s = R.drawable.paymentsdk_pay_button_sbp_light;
                                this.t = R.drawable.paymentsdk_pay_button_sbp_dark;
                                this.u = textView2.getTextColors();
                                this.v = textView3.getTextColors();
                                this.w = textView.getTextColors();
                                this.x = getResources().getColor(R.color.paymentsdk_sbp_main_color);
                                setBackgroundResource(i3);
                                textView.setPaintFlags(textView.getPaintFlags() | 16);
                                return;
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "javaClass";
    }

    public final fek getCurrentState() {
        return this.y;
    }

    public final void setBrandIcon(@NotNull Drawable drawable) {
        drawable.getClass();
        ((ImageView) this.q.b).setImageDrawable(drawable);
    }

    public final void setState(@NotNull fek fekVar) {
        fekVar.getClass();
        if (fekVar.equals(this.y)) {
            return;
        }
        fek fekVar2 = this.y;
        boolean z = fekVar2 instanceof dek;
        mmo mmoVar = this.q;
        if (z && (((dek) fekVar2).a instanceof bek)) {
            setBackgroundResource(this.r);
            ((TextView) mmoVar.d).setTextColor(this.u);
            ((TextView) mmoVar.e).setTextColor(this.v);
            ((TextView) mmoVar.c).setTextColor(this.w);
        }
        boolean z2 = fekVar instanceof dek;
        if (z2) {
            t7g t7gVar = ((dek) fekVar).a;
            if (t7gVar instanceof bek) {
                if (((bek) t7gVar).b) {
                    setBackgroundResource(this.s);
                    ((ImageView) mmoVar.g).setImageResource(R.drawable.paymentsdk_ic_sbp_logo_light);
                    ((TextView) mmoVar.d).setTextColor(this.u);
                    ((TextView) mmoVar.e).setTextColor(this.v);
                    ((TextView) mmoVar.c).setTextColor(this.w);
                } else {
                    setBackgroundResource(this.t);
                    ((ImageView) mmoVar.g).setImageResource(R.drawable.paymentsdk_ic_sbp_logo_dark);
                    TextView textView = (TextView) mmoVar.d;
                    int i = this.x;
                    textView.setTextColor(i);
                    ((TextView) mmoVar.e).setTextColor(i);
                    ((TextView) mmoVar.c).setTextColor(i);
                }
            }
        }
        this.y = fekVar;
        if (fekVar instanceof cek) {
            setEnabled(false);
            ProgressBar progressBar = (ProgressBar) mmoVar.f;
            ImageView imageView = (ImageView) mmoVar.b;
            progressBar.setVisibility(8);
            ((TextView) mmoVar.d).setEnabled(false);
            ((TextView) mmoVar.e).setEnabled(false);
            ((TextView) mmoVar.c).setEnabled(false);
            imageView.setVisibility(0);
            imageView.setEnabled(false);
            ((ImageView) mmoVar.g).setVisibility(8);
            return;
        }
        if (!z2) {
            if (fekVar instanceof eek) {
                setEnabled(false);
                ((ProgressBar) mmoVar.f).setVisibility(0);
                ((TextView) mmoVar.d).setEnabled(false);
                ((TextView) mmoVar.e).setEnabled(false);
                ((TextView) mmoVar.c).setEnabled(false);
                ((ImageView) mmoVar.b).setVisibility(8);
                ((ImageView) mmoVar.g).setVisibility(8);
                return;
            }
            return;
        }
        setEnabled(true);
        ProgressBar progressBar2 = (ProgressBar) mmoVar.f;
        ImageView imageView2 = (ImageView) mmoVar.b;
        progressBar2.setVisibility(8);
        ((TextView) mmoVar.d).setEnabled(true);
        ((TextView) mmoVar.e).setEnabled(true);
        ((TextView) mmoVar.c).setEnabled(true);
        t7g t7gVar2 = ((dek) fekVar).a;
        imageView2.setVisibility(t7gVar2 instanceof aek ? 0 : 8);
        imageView2.setEnabled(true);
        ((ImageView) mmoVar.g).setVisibility(t7gVar2 instanceof bek ? 0 : 8);
    }

    public final void setSubTotalTextAppearance(int i) {
        mmo mmoVar = this.q;
        ((TextView) mmoVar.c).setTextAppearance(i);
        this.w = ((TextView) mmoVar.c).getTextColors();
    }

    public final void setTextAppearance(int i) {
        mmo mmoVar = this.q;
        ((TextView) mmoVar.d).setTextAppearance(i);
        this.u = ((TextView) mmoVar.d).getTextColors();
    }

    public final void setTotalTextAppearance(int i) {
        mmo mmoVar = this.q;
        ((TextView) mmoVar.e).setTextAppearance(i);
        this.v = ((TextView) mmoVar.e).getTextColors();
    }

    public final void t(String str, String str2, String str3) {
        str.getClass();
        setContentDescription(getContext().getString(R.string.paymentsdk_prebuilt_button_text_content_description, str));
        mmo mmoVar = this.q;
        TextView textView = (TextView) mmoVar.d;
        TextView textView2 = (TextView) mmoVar.c;
        textView.setText(str);
        TextView textView3 = (TextView) mmoVar.e;
        textView3.setText(str2);
        int i = 8;
        textView3.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
        textView2.setText(str3);
        if (str3 != null && str3.length() != 0) {
            i = 0;
        }
        textView2.setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PaymentButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
