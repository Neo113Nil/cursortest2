package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.ybsdk.core.common.utils.theme.LateInitColorCallbackImpl;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s4f0 implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object obj;
        Expression expression;
        Expression expression2;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "round_progress")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null) {
                JSONObject jSONObject = bpkVar.b;
                Integer valueOf = jSONObject != null ? Integer.valueOf(jSONObject.optInt("line_width")) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    valueOf = null;
                }
                JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("light") : null;
                JSONObject optJSONObject2 = jSONObject != null ? jSONObject.optJSONObject("dark") : null;
                ColorModel attr = new ColorModel.Attr(ung0.ybColor_fill_default_700);
                ColorModel attr2 = new ColorModel.Attr(ung0.ybColor_control_default);
                int optInt = jSONObject != null ? jSONObject.optInt("progress") : 0;
                b bVar = ColorModel.Hex.Companion;
                String optString = optJSONObject != null ? optJSONObject.optString("filled_color") : null;
                bVar.getClass();
                ColorModel a = b.a(optString);
                if (a == null) {
                    a = attr;
                }
                ColorModel a2 = b.a(optJSONObject2 != null ? optJSONObject2.optString("filled_color") : null);
                if (a2 != null) {
                    attr = a2;
                }
                ColorModel.LateInitColor lateInitColor = new ColorModel.LateInitColor(new LateInitColorCallbackImpl(a, attr));
                ColorModel a3 = b.a(optJSONObject != null ? optJSONObject.optString("unfilled_color") : null);
                if (a3 == null) {
                    a3 = attr2;
                }
                ColorModel a4 = b.a(optJSONObject2 != null ? optJSONObject2.optString("unfilled_color") : null);
                if (a4 != null) {
                    attr2 = a4;
                }
                ColorModel.LateInitColor lateInitColor2 = new ColorModel.LateInitColor(new LateInitColorCallbackImpl(a3, attr2));
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                Object c = egkVar.getWidth().c();
                sqk sqkVar = c instanceof sqk ? (sqk) c : null;
                Object b = (sqkVar == null || (expression2 = sqkVar.b) == null) ? null : expression2.b();
                Long l = b instanceof Long ? (Long) b : null;
                Object c2 = egkVar.getHeight().c();
                sqk sqkVar2 = c2 instanceof sqk ? (sqk) c2 : null;
                Object b2 = (sqkVar2 == null || (expression = sqkVar2.b) == null) ? null : expression.b();
                Long l2 = b2 instanceof Long ? (Long) b2 : null;
                if (l == null) {
                    l = l2;
                }
                CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(view.getContext());
                if (l != null) {
                    circularProgressIndicator.setIndicatorSize(kp50.r((int) l.longValue()));
                }
                circularProgressIndicator.setProgress(optInt);
                circularProgressIndicator.setTrackThickness(valueOf != null ? kp50.r(valueOf.intValue()) : rje.d(vvg0.ybsdk_prize_progress_bar_thickness, circularProgressIndicator.getContext()));
                circularProgressIndicator.setTrackColor(lateInitColor2.get(circularProgressIndicator.getContext()));
                circularProgressIndicator.setIndicatorColor(lateInitColor.get(circularProgressIndicator.getContext()));
                com.ybsdk.core.utils.ext.view.b.l(view);
                viewGroup.addView(circularProgressIndicator, viewGroup.getLayoutParams());
            }
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        Object obj = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, "round_progress")) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.removeView(uh6.v(viewGroup, viewGroup.getChildCount() - 1));
    }
}
