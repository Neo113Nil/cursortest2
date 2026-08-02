package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.transfer.utils.UnconditionalWidget;
import com.ybsdk.widgets.common.StadiumButtonView;

/* loaded from: classes14.dex */
public final class x961 implements zo31 {
    public final ConstraintLayout a;
    public final StadiumButtonView b;
    public final UnconditionalWidget c;

    public x961(ConstraintLayout constraintLayout, StadiumButtonView stadiumButtonView, UnconditionalWidget unconditionalWidget) {
        this.a = constraintLayout;
        this.b = stadiumButtonView;
        this.c = unconditionalWidget;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
