package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.widgets.common.chip.ChipListView;

/* loaded from: classes3.dex */
public final class q961 implements zo31 {
    public final LinearLayout a;
    public final ChipListView b;
    public final TextView c;

    public q961(LinearLayout linearLayout, ChipListView chipListView, TextView textView) {
        this.a = linearLayout;
        this.b = chipListView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
