package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import defpackage.bvm;
import defpackage.cvm;
import defpackage.dag;
import defpackage.dek;
import defpackage.dvm;
import defpackage.evm;
import defpackage.fvm;
import defpackage.hy7;
import defpackage.jj4;
import defpackage.lna;
import defpackage.qgg;
import defpackage.rn5;
import defpackage.zdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ProgressResultView extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final rn5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressResultView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_view_progress_result_full, this);
        int i2 = R.id.brand_image;
        ImageView imageView = (ImageView) dag.v(R.id.brand_image, this);
        if (imageView != null) {
            i2 = R.id.close_button;
            PaymentButtonView paymentButtonView = (PaymentButtonView) dag.v(R.id.close_button, this);
            if (paymentButtonView != null) {
                i2 = R.id.exitButtonView;
                ImageView imageView2 = (ImageView) dag.v(R.id.exitButtonView, this);
                if (imageView2 != null) {
                    i2 = R.id.header_layout;
                    if (((FrameLayout) dag.v(R.id.header_layout, this)) != null) {
                        i2 = R.id.progress_bar;
                        ProgressBar progressBar = (ProgressBar) dag.v(R.id.progress_bar, this);
                        if (progressBar != null) {
                            i2 = R.id.result_image;
                            ImageView imageView3 = (ImageView) dag.v(R.id.result_image, this);
                            if (imageView3 != null) {
                                i2 = R.id.result_subtitle;
                                TextView textView = (TextView) dag.v(R.id.result_subtitle, this);
                                if (textView != null) {
                                    i2 = R.id.result_text;
                                    TextView textView2 = (TextView) dag.v(R.id.result_text, this);
                                    if (textView2 != null) {
                                        i2 = R.id.root_layout;
                                        if (((ConstraintLayout) dag.v(R.id.root_layout, this)) != null) {
                                            this.a = new rn5(this, imageView, paymentButtonView, imageView2, progressBar, imageView3, textView, textView2);
                                            setOrientation(1);
                                            setGravity(1);
                                            paymentButtonView.setState(new dek(zdk.b));
                                            String string = context.getString(R.string.paymentsdk_prebuilt_close);
                                            string.getClass();
                                            paymentButtonView.t(string, null, null);
                                            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                                            if (layoutParams2 == null) {
                                                return;
                                            }
                                            Resources.Theme theme = context.getTheme();
                                            theme.getClass();
                                            TypedValue b0 = qgg.b0(R.attr.paymentsdk_progressResultCenterBrandIcon, theme);
                                            layoutParams2.gravity = (b0 == null || b0.data == 0) ? 8388611 : 1;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setBrandIconVisible(boolean z) {
        ((ImageView) this.a.b).setVisibility(z ? 0 : 8);
    }

    public final void setCloseCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        ((PaymentButtonView) this.a.c).setOnClickListener(new hy7(6, function0));
    }

    public final void setExitButtonCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        ((ImageView) this.a.d).setOnClickListener(new hy7(5, function0));
    }

    public final void setOnCloseButtonVisible(@NotNull Function0<Unit> function0) {
        function0.getClass();
        qgg.l0((PaymentButtonView) this.a.c, new lna(4, function0));
    }

    public final void setOnProgressBarVisible(@NotNull Function0<Unit> function0) {
        function0.getClass();
        qgg.l0((ProgressBar) this.a.e, new lna(5, function0));
    }

    public final void setState(@NotNull fvm fvmVar) {
        fvmVar.getClass();
        boolean z = fvmVar instanceof dvm;
        rn5 rn5Var = this.a;
        if (z) {
            ((ImageView) rn5Var.d).setVisibility(0);
            ((ProgressBar) rn5Var.e).setVisibility(0);
            ((ImageView) rn5Var.f).setVisibility(8);
            dvm dvmVar = (dvm) fvmVar;
            ((PaymentButtonView) rn5Var.c).setVisibility(dvmVar.b ? 0 : 8);
            ((TextView) rn5Var.h).setText(dvmVar.a);
            ((TextView) rn5Var.g).setVisibility(8);
            return;
        }
        if (fvmVar instanceof evm) {
            ImageView imageView = (ImageView) rn5Var.d;
            ImageView imageView2 = (ImageView) rn5Var.f;
            imageView.setVisibility(8);
            ((ProgressBar) rn5Var.e).setVisibility(8);
            imageView2.setVisibility(0);
            ((PaymentButtonView) rn5Var.c).setVisibility(8);
            ((TextView) rn5Var.g).setVisibility(8);
            imageView2.setImageResource(2131232464);
            ((TextView) rn5Var.h).setText(((evm) fvmVar).a);
            return;
        }
        if (!(fvmVar instanceof cvm)) {
            if (fvmVar instanceof bvm) {
                ImageView imageView3 = (ImageView) rn5Var.d;
                ImageView imageView4 = (ImageView) rn5Var.f;
                imageView3.setVisibility(8);
                ((ProgressBar) rn5Var.e).setVisibility(8);
                imageView4.setVisibility(0);
                ((PaymentButtonView) rn5Var.c).setVisibility(8);
                ((TextView) rn5Var.g).setVisibility(8);
                imageView4.setImageResource(2131232463);
                ((TextView) rn5Var.h).setText(((bvm) fvmVar).a);
                return;
            }
            return;
        }
        ImageView imageView5 = (ImageView) rn5Var.d;
        TextView textView = (TextView) rn5Var.g;
        ImageView imageView6 = (ImageView) rn5Var.f;
        imageView5.setVisibility(8);
        ((ProgressBar) rn5Var.e).setVisibility(8);
        imageView6.setVisibility(0);
        ((PaymentButtonView) rn5Var.c).setVisibility(8);
        imageView6.setImageResource(2131232463);
        TextView textView2 = (TextView) rn5Var.h;
        cvm cvmVar = (cvm) fvmVar;
        Integer num = cvmVar.b;
        textView2.setText(cvmVar.a);
        if (num != null) {
            textView.setVisibility(0);
            textView.setText(num.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressResultView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ProgressResultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressResultView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
