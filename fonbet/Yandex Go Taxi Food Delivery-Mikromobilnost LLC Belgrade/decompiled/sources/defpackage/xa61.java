package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes4.dex */
public final class xa61 implements zo31 {
    public final LinearLayout a;
    public final RecyclerView b;

    public xa61(LinearLayout linearLayout, YbButtonView ybButtonView, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
