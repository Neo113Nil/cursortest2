package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.widget.SuperLineHeightTextView;

/* loaded from: classes11.dex */
public abstract class xok extends ggk {
    public static void c(DivView divView, h2b h2bVar, TextView textView, CharSequence charSequence, ctk ctkVar, int i, int i2, int i3, int i4) {
        Resources resources = textView.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(i3);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i4);
        EmptyDrawable emptyDrawable = new EmptyDrawable(dimensionPixelSize, dimensionPixelSize2);
        emptyDrawable.setBounds(0, 0, emptyDrawable.getIntrinsicWidth(), emptyDrawable.getIntrinsicHeight());
        textView.setCompoundDrawables(emptyDrawable, null, null, null);
        textView.setText(charSequence);
        textView.setCompoundDrawablePadding(resources.getDimensionPixelSize(atg0.div_compound_drawable_padding));
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(i2);
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(atg0.div_compound_drawable_vertical_padding);
        textView.setPadding(dimensionPixelOffset, dimensionPixelOffset3, dimensionPixelOffset2, dimensionPixelOffset3);
        divView.addLoadReference(h2bVar.loadImage(ctkVar.a.toString(), new zsk(1, new wok(divView, dimensionPixelSize, dimensionPixelSize2, resources, textView)), 0), textView);
    }

    public static SuperLineHeightTextView d(syk sykVar, Context context, int i, int i2) {
        sykVar.getClass();
        SuperLineHeightTextView superLineHeightTextView = new SuperLineHeightTextView(context, null, i);
        superLineHeightTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        superLineHeightTextView.setId(i2);
        return superLineHeightTextView;
    }

    public static int e(int i, Context context) {
        return context.getResources().getDimensionPixelOffset(i);
    }

    public static void f(AppCompatTextView appCompatTextView, CharSequence charSequence, cty0 cty0Var) {
        if (TextUtils.isEmpty(charSequence)) {
            appCompatTextView.setVisibility(8);
            return;
        }
        cty0Var.b(appCompatTextView);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(0);
    }
}
