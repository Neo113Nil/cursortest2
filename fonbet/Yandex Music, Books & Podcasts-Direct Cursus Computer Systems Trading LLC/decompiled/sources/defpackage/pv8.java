package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class pv8 extends FrameLayout {
    public ov8 a;
    public final xhk b;
    public final int c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv8(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = lv8.d;
        View inflate = LayoutInflater.from(context).inflate(R.layout.paymentsdk_number_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.paymentsdk_number_view_cursor;
        View v = dag.v(R.id.paymentsdk_number_view_cursor, inflate);
        if (v != null) {
            i2 = R.id.paymentsdk_number_view_number;
            TextView textView = (TextView) dag.v(R.id.paymentsdk_number_view_number, inflate);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.b = new xhk(constraintLayout, v, textView);
                Resources.Theme theme = constraintLayout.getContext().getTheme();
                theme.getClass();
                this.c = bfg.F(R.attr.paymentsdk_cvv_input_text_color, theme);
                this.d = constraintLayout.getContext().getColor(R.color.paymentsdk_divkit_success_cvv_color);
                setState(this.a);
                return;
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setState$lambda$1$lambda$0(xhk xhkVar) {
        xhkVar.getClass();
        xhkVar.c.setText("·");
    }

    public final void setState(@NotNull ov8 ov8Var) {
        Animation animation;
        lv8 lv8Var = lv8.e;
        lv8 lv8Var2 = lv8.d;
        lv8 lv8Var3 = lv8.c;
        lv8 lv8Var4 = lv8.b;
        lv8 lv8Var5 = lv8.a;
        ov8Var.getClass();
        boolean z = ov8Var instanceof mv8;
        boolean equals = z ? true : ov8Var.equals(lv8Var5);
        xhk xhkVar = this.b;
        if (equals) {
            xhkVar.b.startAnimation(AnimationUtils.loadAnimation(xhkVar.a.getContext(), R.anim.paymentsdk_flash_animation));
        } else {
            if ((ov8Var.equals(lv8Var4) ? true : ov8Var.equals(lv8Var3) ? true : ov8Var.equals(lv8Var2) ? true : ov8Var.equals(lv8Var) ? true : ov8Var instanceof nv8) && (animation = xhkVar.b.getAnimation()) != null) {
                animation.cancel();
            }
        }
        boolean equals2 = ov8Var.equals(lv8Var4);
        int i = this.c;
        if (equals2) {
            View view = xhkVar.b;
            TextView textView = xhkVar.c;
            view.setVisibility(4);
            textView.setText("·");
            textView.setVisibility(0);
            textView.setTextColor(i);
        } else if (ov8Var.equals(lv8Var2)) {
            xhkVar.b.setVisibility(4);
            xhkVar.c.setVisibility(4);
        } else if (ov8Var instanceof nv8) {
            TextView textView2 = xhkVar.c;
            textView2.setTextColor(i);
            xhkVar.b.setVisibility(4);
            textView2.setVisibility(0);
            textView2.setText(((nv8) ov8Var).a);
            textView2.postDelayed(new sr7(6, xhkVar), 200L);
        } else if (ov8Var.equals(lv8Var3)) {
            View view2 = xhkVar.b;
            TextView textView3 = xhkVar.c;
            view2.setVisibility(4);
            textView3.setVisibility(0);
            textView3.setText("·");
            textView3.setTextColor(-65536);
        } else if (ov8Var.equals(lv8Var5)) {
            xhkVar.b.setVisibility(0);
            xhkVar.c.setVisibility(4);
        } else if (z) {
            xhkVar.b.setVisibility(((mv8) ov8Var).a ? 0 : 8);
            xhkVar.c.setVisibility(8);
        } else if (ov8Var.equals(lv8Var)) {
            View view3 = xhkVar.b;
            TextView textView4 = xhkVar.c;
            view3.setVisibility(4);
            textView4.setVisibility(0);
            textView4.setText("·");
            textView4.setTextColor(this.d);
        }
        this.a = ov8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pv8(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ pv8(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pv8(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
