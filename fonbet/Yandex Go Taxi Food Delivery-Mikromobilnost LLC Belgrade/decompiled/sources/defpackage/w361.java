package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.OperationStatusView;

/* loaded from: classes4.dex */
public final class w361 implements zo31 {
    public final OperationStatusView a;
    public final AppCompatImageView b;
    public final OperationProgressView c;
    public final OperationProgressView d;

    public w361(OperationStatusView operationStatusView, AppCompatImageView appCompatImageView, OperationProgressView operationProgressView, OperationProgressView operationProgressView2) {
        this.a = operationStatusView;
        this.b = appCompatImageView;
        this.c = operationProgressView;
        this.d = operationProgressView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
