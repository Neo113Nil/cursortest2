package ru.yandex.taxi.plus.design.gradient;

import android.view.View;
import defpackage.euy0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"ru/yandex/taxi/plus/design/gradient/TextViewTextGradientController$LayoutChangeImpl", "Landroid/view/View$OnLayoutChangeListener;", "<init>", "(Leuy0;)V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "lastWidth", CA20Status.STATUS_USER_I, "lastHeight", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextViewTextGradientController$LayoutChangeImpl implements View.OnLayoutChangeListener {
    final /* synthetic */ euy0 this$0;
    private int lastWidth = -1;
    private int lastHeight = -1;

    public TextViewTextGradientController$LayoutChangeImpl(euy0 euy0Var) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        int i = right - left;
        int i2 = bottom - top;
        if (this.lastWidth == i && this.lastHeight == i2) {
            return;
        }
        this.lastWidth = i;
        this.lastHeight = i2;
        throw null;
    }
}
