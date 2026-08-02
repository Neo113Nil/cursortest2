package defpackage;

import android.view.View;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.internal.dto.DivKitPlusBadgeCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitPlusBadgeCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.ui.DivCustomPlusBadgeView;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ylk implements qr51 {
    public final DivKitPlusBadgeCustomPropsDtoJsonAdapter a = new DivKitPlusBadgeCustomPropsDtoJsonAdapter(new Moshi.Builder().build());
    public final YbDivKitCustomBlockTypes b = YbDivKitCustomBlockTypes.PLUS_BADGE_BLOCK_TYPE;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        return new DivCustomPlusBadgeView(div2View.getContext(), null, 0, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // defpackage.qr51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        DivKitPlusBadgeCustomPropsDto fromJson;
        List<String> actions;
        if (view instanceof DivCustomPlusBadgeView) {
            JSONObject jSONObject = clkVar.i;
            if (jSONObject != null) {
                try {
                    fromJson = this.a.fromJson(jSONObject.toString());
                } catch (Throwable th) {
                    x4c.g("Failed to parse DivKit customProps in \"custom_type\"", th, YbDivKitCustomBlockTypes.PLUS_BADGE_BLOCK_TYPE, null, 8);
                }
                DivCustomPlusBadgeView divCustomPlusBadgeView = (DivCustomPlusBadgeView) view;
                DivKitPlusBadgeCustomPropsDto divKitPlusBadgeCustomPropsDto = fromJson;
                actions = divKitPlusBadgeCustomPropsDto != null ? divKitPlusBadgeCustomPropsDto.getActions() : null;
                if (actions == null) {
                    actions = EmptyList.a;
                }
                divCustomPlusBadgeView.setClickActions(actions);
            }
            fromJson = null;
            DivCustomPlusBadgeView divCustomPlusBadgeView2 = (DivCustomPlusBadgeView) view;
            DivKitPlusBadgeCustomPropsDto divKitPlusBadgeCustomPropsDto2 = fromJson;
            if (divKitPlusBadgeCustomPropsDto2 != null) {
            }
            if (actions == null) {
            }
            divCustomPlusBadgeView2.setClickActions(actions);
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
