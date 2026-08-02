package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.feed.global.div.custom.slide_to_confirm.SlideToConfirmDivViewHolder;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wns0 implements plk {
    public final i3y b = a.b(LazyThreadSafetyMode.NONE, new s7s0(6));

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        v3k v3kVar;
        if (view instanceof SlideToConfirmDivViewHolder) {
            JSONObject jSONObject = clkVar.i;
            vns0 vns0Var = null;
            if (jSONObject != null) {
                Object opt = jSONObject.opt("on_slide_finish_action");
                JSONObject jSONObject2 = opt instanceof JSONObject ? (JSONObject) opt : null;
                if (jSONObject2 != null) {
                    kvo kvoVar = v3k.m;
                    v3kVar = kp50.p((u2l) this.b.getValue(), jSONObject2);
                } else {
                    v3kVar = null;
                }
                String J = cvw.J("title", jSONObject);
                if (J != null) {
                    String J2 = cvw.J("subtitle", jSONObject);
                    String J3 = cvw.J("title_progress", jSONObject);
                    String str = J3 == null ? J : J3;
                    String J4 = cvw.J("subtitle_progress", jSONObject);
                    vns0Var = new vns0(v3kVar, J, J2, str, J4 == null ? J2 : J4);
                }
            }
            if (vns0Var != null) {
                ((SlideToConfirmDivViewHolder) view).bind(vns0Var);
            }
        }
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        return new SlideToConfirmDivViewHolder(div2View, rvoVar);
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, "slide_to_confirm");
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        SlideToConfirmDivViewHolder slideToConfirmDivViewHolder = view instanceof SlideToConfirmDivViewHolder ? (SlideToConfirmDivViewHolder) view : null;
        if (slideToConfirmDivViewHolder != null) {
            slideToConfirmDivViewHolder.release();
        }
    }
}
