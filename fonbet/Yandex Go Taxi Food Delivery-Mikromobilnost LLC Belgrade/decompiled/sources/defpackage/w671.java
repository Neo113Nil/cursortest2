package defpackage;

import android.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class w671 implements plk {
    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        int i;
        String str = null;
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = clkVar.i;
        JSONObject jSONObject2 = clkVar.i;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            str = "#000000";
        } else if (jSONObject2 != null) {
            str = jSONObject2.getString("progress_color");
        }
        try {
            i = Color.parseColor(str);
        } catch (Throwable unused) {
            i = ModalContentViewContainer.BASE_SHADOW_COLOR;
        }
        Drawable drawable = progressBar.getContext().getDrawable(R$drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        if (jSONObject2 != null && jSONObject2.has("is_focusable")) {
            progressBar.setFocusable(jSONObject2.optBoolean("is_focusable"));
        }
        return progressBar;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, "close_progress_view");
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
