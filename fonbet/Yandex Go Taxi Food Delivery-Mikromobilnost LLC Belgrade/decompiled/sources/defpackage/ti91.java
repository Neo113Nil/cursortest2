package defpackage;

import android.text.SpannableStringBuilder;
import androidx.compose.ui.platform.ViewLayer;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.a;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class ti91 {
    public static final boolean b(DivLineHeightTextView divLineHeightTextView, SpannableStringBuilder spannableStringBuilder, DivBackgroundSpan divBackgroundSpan, int i, int i2, rvo rvoVar) {
        if (divLineHeightTextView.getTextRoundedBgHelper() == null) {
            divLineHeightTextView.setTextRoundedBgHelper$div_release(new a(divLineHeightTextView, rvoVar));
            return false;
        }
        ArrayList arrayList = divLineHeightTextView.getTextRoundedBgHelper().c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DivBackgroundSpan divBackgroundSpan2 = (DivBackgroundSpan) it.next();
                if (jl40.l(divBackgroundSpan2.getBorder(), divBackgroundSpan.getBorder()) && jl40.l(divBackgroundSpan2.getBackground(), divBackgroundSpan.getBackground()) && divBackgroundSpan2.getBaselineOffset() == divBackgroundSpan.getBaselineOffset() && divBackgroundSpan2.getAlignmentVertical() == divBackgroundSpan.getAlignmentVertical() && jl40.l(divBackgroundSpan2.getLineHeight(), divBackgroundSpan.getLineHeight()) && jl40.l(divBackgroundSpan2.getFontSize(), divBackgroundSpan.getFontSize()) && jl40.l(divBackgroundSpan2.getTopOffset(), divBackgroundSpan.getTopOffset()) && jl40.l(divBackgroundSpan2.getTypeface(), divBackgroundSpan.getTypeface()) && jl40.l(divBackgroundSpan2.getFontFeatureSettings(), divBackgroundSpan.getFontFeatureSettings()) && jl40.l(divBackgroundSpan2.getFontVariationSettings(), divBackgroundSpan.getFontVariationSettings()) && i2 == spannableStringBuilder.getSpanEnd(divBackgroundSpan2) && i == spannableStringBuilder.getSpanStart(divBackgroundSpan2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static f530 c(f530 f530Var, zx40 zx40Var) {
        return f530Var.k(new ntu(zx40Var));
    }

    public static void d(ViewLayer viewLayer, nja1 nja1Var) {
        viewLayer.setRenderEffect(null);
    }

    public abstract String a();
}
