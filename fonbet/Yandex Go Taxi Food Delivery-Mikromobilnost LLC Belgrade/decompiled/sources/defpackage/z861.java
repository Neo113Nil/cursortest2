package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;

/* loaded from: classes3.dex */
public final class z861 implements zo31 {
    public final ConstraintLayout a;
    public final YbDivView b;
    public final m2y c;

    public z861(ConstraintLayout constraintLayout, YbDivView ybDivView, m2y m2yVar) {
        this.a = constraintLayout;
        this.b = ybDivView;
        this.c = m2yVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
