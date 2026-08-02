package defpackage;

import android.view.View;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.internal.dto.DivKitSpinnerCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitSpinnerCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import com.ybsdk.widgets.common.OperationProgressView;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zlk implements qr51 {
    public static final ColorModel.Attr c = new ColorModel.Attr(ung0.ybColor_textIcon_primaryInverted);
    public final DivKitSpinnerCustomPropsDtoJsonAdapter a = new DivKitSpinnerCustomPropsDtoJsonAdapter(new Moshi.Builder().build());
    public final YbDivKitCustomBlockTypes b = YbDivKitCustomBlockTypes.SPINNER_BLOCK_TYPE;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        OperationProgressView operationProgressView = new OperationProgressView(div2View.getContext(), null, 0, 6, null);
        operationProgressView.setSpinnerRadiusPercent(1.0f);
        operationProgressView.setScaleStrokeWidthEnabled(false);
        return operationProgressView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r4 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // defpackage.qr51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        DivKitSpinnerCustomPropsDto fromJson;
        DivKitSpinnerCustomPropsDto divKitSpinnerCustomPropsDto;
        ColorModel colorModel;
        Float circumference;
        Float spinnerThickness;
        if (view instanceof OperationProgressView) {
            JSONObject jSONObject = clkVar.i;
            if (jSONObject != null) {
                try {
                    fromJson = this.a.fromJson(String.valueOf(jSONObject));
                } catch (Exception e) {
                    x4c.g("Failed to parse DivKit customProps in \"custom_type\"", e, "spinner", null, 8);
                }
                divKitSpinnerCustomPropsDto = fromJson;
                if (divKitSpinnerCustomPropsDto != null) {
                    Themes<String> spinnerColor = divKitSpinnerCustomPropsDto.getSpinnerColor();
                    String light = spinnerColor != null ? spinnerColor.getLight() : null;
                    Themes<String> spinnerColor2 = divKitSpinnerCustomPropsDto.getSpinnerColor();
                    ColorModel e2 = lvy0.e(light, spinnerColor2 != null ? spinnerColor2.getDark() : null);
                    colorModel = e2 != null ? new ColorModel.Raw(e2.get(((OperationProgressView) view).getContext())) : null;
                }
                colorModel = c;
                OperationProgressView operationProgressView = (OperationProgressView) view;
                operationProgressView.setSpinnerColor(colorModel);
                operationProgressView.configureAnimation(OperationProgressView.Animation.Required);
                operationProgressView.setSpinnerThickness((divKitSpinnerCustomPropsDto != null || (spinnerThickness = divKitSpinnerCustomPropsDto.getSpinnerThickness()) == null) ? 3.0f : spinnerThickness.floatValue());
                operationProgressView.setSpinnerCircumference((divKitSpinnerCustomPropsDto != null || (circumference = divKitSpinnerCustomPropsDto.getCircumference()) == null) ? 0.5f : circumference.floatValue());
                operationProgressView.render(pc70.a);
            }
            fromJson = null;
            divKitSpinnerCustomPropsDto = fromJson;
            if (divKitSpinnerCustomPropsDto != null) {
            }
            colorModel = c;
            OperationProgressView operationProgressView2 = (OperationProgressView) view;
            operationProgressView2.setSpinnerColor(colorModel);
            operationProgressView2.configureAnimation(OperationProgressView.Animation.Required);
            operationProgressView2.setSpinnerThickness((divKitSpinnerCustomPropsDto != null || (spinnerThickness = divKitSpinnerCustomPropsDto.getSpinnerThickness()) == null) ? 3.0f : spinnerThickness.floatValue());
            operationProgressView2.setSpinnerCircumference((divKitSpinnerCustomPropsDto != null || (circumference = divKitSpinnerCustomPropsDto.getCircumference()) == null) ? 0.5f : circumference.floatValue());
            operationProgressView2.render(pc70.a);
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
