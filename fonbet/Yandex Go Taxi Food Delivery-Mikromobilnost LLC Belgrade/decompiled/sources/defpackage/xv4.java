package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.barcode.BarcodeView;

/* loaded from: classes12.dex */
public final class xv4 extends kz4 {
    public xv4() {
        super(iv4.Companion.serializer());
    }

    @Override // defpackage.kz4
    public final void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl) {
        ((BarcodeView) view).bind();
    }

    @Override // defpackage.kz4
    public final View b(Context context, Object obj) {
        return new BarcodeView(context, (iv4) obj);
    }
}
