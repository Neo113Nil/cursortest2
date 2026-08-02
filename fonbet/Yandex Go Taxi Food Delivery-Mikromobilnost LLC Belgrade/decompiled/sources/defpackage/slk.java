package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.internal.dto.DivKitGradientPillCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitGradientPillCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.dto.GradientPillBackgroundColorDto;
import com.ybsdk.feature.divkit.internal.dto.GradientPillBackgroundGradientDto;
import com.ybsdk.feature.divkit.internal.ui.DivCustomGradientPillView;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class slk implements qr51 {
    public final DivKitGradientPillCustomPropsDtoJsonAdapter a = new DivKitGradientPillCustomPropsDtoJsonAdapter(new Moshi.Builder().build());
    public final YbDivKitCustomBlockTypes b = YbDivKitCustomBlockTypes.GRADIENT_PILL_TYPE;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        DivCustomGradientPillView divCustomGradientPillView = new DivCustomGradientPillView(div2View.getContext(), null, 0, 6, null);
        nlk customContainerChildFactory$div_release = div2View.getCustomContainerChildFactory$div_release();
        List list = clkVar.q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View b = nlk.b(customContainerChildFactory$div_release, (m3k) it.next(), bVar, div2View);
                divCustomGradientPillView.addView(b);
                ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.gravity = 17;
                }
            }
        }
        return divCustomGradientPillView;
    }

    @Override // defpackage.qr51
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        Div2View div2View2;
        b bVar2;
        ArrayList arrayList;
        DivKitGradientPillCustomPropsDto fromJson;
        GradientPillBackgroundGradientDto backgroundGradient;
        List<GradientPillBackgroundColorDto> colorMap;
        if (view instanceof DivCustomGradientPillView) {
            try {
                JSONObject jSONObject = clkVar.i;
                if (jSONObject == null || (fromJson = this.a.fromJson(jSONObject.toString())) == null || (backgroundGradient = fromJson.getBackgroundGradient()) == null || (colorMap = backgroundGradient.getColorMap()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (GradientPillBackgroundColorDto gradientPillBackgroundColorDto : colorMap) {
                        ColorModel e = lvy0.e(gradientPillBackgroundColorDto.getColor().getLight(), gradientPillBackgroundColorDto.getColor().getDark());
                        ColorModel.Raw raw = e != null ? new ColorModel.Raw(e.get(((DivCustomGradientPillView) view).getContext())) : null;
                        rlk rlkVar = raw != null ? new rlk(gradientPillBackgroundColorDto.getPosition(), raw) : null;
                        if (rlkVar != null) {
                            arrayList.add(rlkVar);
                        }
                    }
                }
                if (arrayList != null) {
                    ((DivCustomGradientPillView) view).updateBackgroundGradient(arrayList);
                }
            } catch (Exception e2) {
                x4c.g("Failed to parse DivKit customProps in \"custom_type\"", e2, YbDivKitCustomBlockTypes.GRADIENT_PILL_TYPE, null, 8);
            }
            nlk customContainerChildFactory$div_release = div2View.getCustomContainerChildFactory$div_release();
            List list = clkVar.q;
            if (list != null) {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    m3k m3kVar = (m3k) obj;
                    View childAt = ((DivCustomGradientPillView) view).getChildAt(i);
                    if (childAt == null) {
                        div2View2 = div2View;
                        bVar2 = bVar;
                    } else {
                        rvo expressionResolver = div2View.getExpressionResolver();
                        customContainerChildFactory$div_release.getClass();
                        div2View2 = div2View;
                        bVar2 = bVar;
                        nlk.a(childAt, i, m3kVar, bVar2, div2View2, expressionResolver);
                    }
                    bVar = bVar2;
                    div2View = div2View2;
                    i = i2;
                }
            }
        }
    }

    @Override // defpackage.qr51
    public final YbDivKitCustomBlockTypes getCustomType() {
        return this.b;
    }

    @Override // defpackage.qr51
    public final boolean isCustomTypeSupported(String str) {
        return xz91.b(this, str);
    }

    @Override // defpackage.qr51
    public final void release() {
    }
}
