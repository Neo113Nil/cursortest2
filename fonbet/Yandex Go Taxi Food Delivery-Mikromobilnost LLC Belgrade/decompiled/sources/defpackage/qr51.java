package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;

/* loaded from: classes2.dex */
public interface qr51 {
    View a(clk clkVar, Div2View div2View, b bVar);

    void b(View view, clk clkVar, Div2View div2View, b bVar);

    YbDivKitCustomBlockTypes getCustomType();

    boolean isCustomTypeSupported(String str);

    void release();
}
