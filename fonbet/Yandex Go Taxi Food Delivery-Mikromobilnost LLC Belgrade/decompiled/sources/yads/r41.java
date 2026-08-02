package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.aq41;
import defpackage.b281;
import defpackage.m810;

/* loaded from: classes6.dex */
public final class r41 extends LinearLayout {
    public final qq a;
    public final TextView b;

    public r41(Context context, b281 b281Var) {
        super(context);
        qq qqVar = new qq(context);
        this.a = qqVar;
        TextView textView = new TextView(context);
        this.b = textView;
        aq41 aq41Var = new aq41(7, this);
        setOrientation(0);
        int b = m810.b(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        setPadding(b, b, b, b);
        qqVar.setOnClickListener(aq41Var);
        addView(qqVar);
        int b2 = m810.b(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        textView.setPadding(b2, b2, b2, b2);
        int b3 = m810.b(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(b3, -65536);
        textView.setBackgroundDrawable(gradientDrawable);
        addView(textView);
        int b4 = m810.b(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMargins(b4, 0, b4, b4);
        textView.setLayoutParams(layoutParams);
        textView.setVisibility(8);
    }

    public static final void a(r41 r41Var, View view) {
        boolean isSelected = r41Var.a.isSelected();
        r41Var.a.setSelected(!isSelected);
        r41Var.b.setVisibility(!isSelected ? 0 : 8);
    }

    public final void setDescription(String str) {
        this.b.setText(str);
    }
}
