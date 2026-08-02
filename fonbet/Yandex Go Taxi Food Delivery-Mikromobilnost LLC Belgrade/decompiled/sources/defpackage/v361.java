package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.OperationStatusView;
import com.ybsdk.widgets.common.OperationProgressView;

/* loaded from: classes3.dex */
public final class v361 implements zo31 {
    public final OperationStatusView a;
    public final AppCompatImageView b;
    public final OperationProgressView c;
    public final OperationProgressView d;

    public v361(OperationStatusView operationStatusView, AppCompatImageView appCompatImageView, OperationProgressView operationProgressView, OperationProgressView operationProgressView2) {
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
