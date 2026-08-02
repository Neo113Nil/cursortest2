package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class y371 implements plk {
    public static Integer a(clk clkVar, String str) {
        Object failure;
        JSONObject jSONObject = clkVar.i;
        try {
            failure = Integer.valueOf(Color.parseColor(jSONObject != null ? jSONObject.optString(str) : null));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Integer) (failure instanceof Result.Failure ? null : failure);
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer a = a(clkVar, "progress_color");
        if (a != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(a.intValue()));
        }
        Integer a2 = a(clkVar, "background_color");
        if (a2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(a2.intValue()));
        }
        JSONObject jSONObject = clkVar.i;
        if (jSONObject != null && jSONObject.has("is_focusable")) {
            progressBar.setFocusable(jSONObject.optBoolean("is_focusable"));
        }
        return progressBar;
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
