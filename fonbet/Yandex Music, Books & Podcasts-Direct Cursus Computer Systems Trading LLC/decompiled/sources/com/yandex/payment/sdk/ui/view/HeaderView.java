package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.dag;
import defpackage.grb;
import defpackage.hy7;
import defpackage.jj4;
import defpackage.rdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class HeaderView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final rdk q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_view_header, this);
        int i2 = R.id.action_button;
        TextView textView = (TextView) dag.v(R.id.action_button, this);
        if (textView != null) {
            i2 = R.id.back_button;
            ImageView imageView = (ImageView) dag.v(R.id.back_button, this);
            if (imageView != null) {
                i2 = R.id.back_button_space;
                Space space = (Space) dag.v(R.id.back_button_space, this);
                if (space != null) {
                    i2 = R.id.brand_icon;
                    ImageView imageView2 = (ImageView) dag.v(R.id.brand_icon, this);
                    if (imageView2 != null) {
                        i2 = R.id.close_button;
                        ImageView imageView3 = (ImageView) dag.v(R.id.close_button, this);
                        if (imageView3 != null) {
                            i2 = R.id.title_text;
                            TextView textView2 = (TextView) dag.v(R.id.title_text, this);
                            if (textView2 != null) {
                                i2 = R.id.topContainer;
                                if (((ConstraintLayout) dag.v(R.id.topContainer, this)) != null) {
                                    this.q = new rdk(this, textView, imageView, space, imageView2, imageView3, textView2, 19);
                                    imageView.setVisibility(8);
                                    space.setVisibility(8);
                                    textView.setVisibility(8);
                                    imageView3.setVisibility(8);
                                    return;
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

    public static void u(HeaderView headerView) {
        grb grbVar = grb.x;
        rdk rdkVar = headerView.q;
        ((ImageView) rdkVar.c).setVisibility(8);
        ((ImageView) rdkVar.c).setOnClickListener(new hy7(3, grbVar));
        ((Space) rdkVar.d).setVisibility(8);
    }

    public final void setBrandIconVisible(boolean z) {
        ((ImageView) this.q.e).setVisibility(z ? 0 : 8);
    }

    public final void setTitleText(Integer num) {
        String str;
        if (num != null) {
            str = getContext().getString(num.intValue());
        } else {
            str = null;
        }
        setTitleTextString(str);
    }

    public final void setTitleTextString(String str) {
        rdk rdkVar = this.q;
        if (str == null) {
            ((TextView) rdkVar.g).setVisibility(8);
        } else {
            ((TextView) rdkVar.g).setVisibility(0);
            ((TextView) rdkVar.g).setText(str);
        }
    }

    public final void t(Integer num, Function0 function0) {
        function0.getClass();
        rdk rdkVar = this.q;
        if (num == null) {
            ((TextView) rdkVar.b).setVisibility(8);
            return;
        }
        TextView textView = (TextView) rdkVar.b;
        TextView textView2 = (TextView) rdkVar.b;
        textView.setVisibility(0);
        textView2.setText(num.intValue());
        textView2.setContentDescription(getContext().getString(R.string.paymentsdk_prebuilt_button_text_content_description, getContext().getString(num.intValue())));
        textView2.setOnClickListener(new hy7(1, function0));
    }

    public final void v(Function0 function0, boolean z) {
        function0.getClass();
        rdk rdkVar = this.q;
        ((ImageView) rdkVar.f).setVisibility(z ? 0 : 8);
        ((ImageView) rdkVar.f).setOnClickListener(new hy7(2, function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ HeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
