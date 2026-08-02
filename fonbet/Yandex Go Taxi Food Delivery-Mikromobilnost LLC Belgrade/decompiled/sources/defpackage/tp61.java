package defpackage;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class tp61 implements plk {
    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(div2View.getContext());
        JSONObject jSONObject = clkVar.i;
        if (jSONObject != null) {
            if (jSONObject.has("is_focusable")) {
                customizableMediaView.setFocusable(jSONObject.optBoolean("is_focusable"));
            }
            if (jSONObject.has("descendant_focusability")) {
                customizableMediaView.setDescendantFocusability(jSONObject.optInt("descendant_focusability"));
            }
        }
        return customizableMediaView;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return "media".equals(str);
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
    }
}
