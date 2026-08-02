package defpackage;

import android.view.ContextThemeWrapper;
import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;

/* loaded from: classes3.dex */
public final class xlk implements qr51 {
    public final YbDivKitCustomBlockTypes a = YbDivKitCustomBlockTypes.NUMBER_KEYBOARD_TYPE;

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        return new NumberKeyboardView(new ContextThemeWrapper(div2View.getContext(), n1i0.YbSdkDivKitNumberKeyboardStyle), null, 0, Integer.valueOf(xah0.ybsdk_number_keyboard_id), 6, null);
    }

    @Override // defpackage.qr51
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
    }

    @Override // defpackage.qr51
    public final YbDivKitCustomBlockTypes getCustomType() {
        return this.a;
    }

    @Override // defpackage.qr51
    public final boolean isCustomTypeSupported(String str) {
        return xz91.b(this, str);
    }

    @Override // defpackage.qr51
    public final void release() {
    }
}
