package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes15.dex */
public final class xb3 {
    public final iv31 a;

    public xb3(j1w j1wVar) {
        View view = j1wVar.b;
        int i = e9h0.chat_input_attach_container;
        this.a = new iv31(view, i, i);
    }

    public final View a(int i) {
        View a = this.a.a();
        View findViewById = a.findViewById(e9h0.chat_input_panel_image_preview_container);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.width = i;
            layoutParams2.height = i;
            findViewById.setLayoutParams(layoutParams2);
        }
        View findViewById2 = a.findViewById(e9h0.chat_input_panel_image_preview);
        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) (layoutParams3 instanceof FrameLayout.LayoutParams ? layoutParams3 : null);
        if (layoutParams4 != null) {
            layoutParams4.width = i;
            layoutParams4.height = i;
            findViewById2.setLayoutParams(layoutParams4);
        }
        return a;
    }
}
