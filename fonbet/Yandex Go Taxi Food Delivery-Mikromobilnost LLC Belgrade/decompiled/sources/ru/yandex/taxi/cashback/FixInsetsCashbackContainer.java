package ru.yandex.taxi.cashback;

import android.content.Context;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.jx81;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lru/yandex/taxi/cashback/FixInsetsCashbackContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dispatchApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FixInsetsCashbackContainer extends FrameLayout {
    public FixInsetsCashbackContainer(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        return jx81.d() ? super.dispatchApplyWindowInsets(insets) : insets;
    }
}
