package defpackage;

import android.view.View;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public final class r861 implements zo31 {
    public final DivSkeletonsView a;
    public final YbDivView b;
    public final OperationProgressView c;

    public r861(DivSkeletonsView divSkeletonsView, YbDivView ybDivView, OperationProgressView operationProgressView) {
        this.a = divSkeletonsView;
        this.b = ybDivView;
        this.c = operationProgressView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
