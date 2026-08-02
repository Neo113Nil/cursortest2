package just.adapter.sticky;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.jgb1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Ljust/adapter/sticky/LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "source", "Landroid/view/ViewGroup$LayoutParams;", "<init>", "(Landroid/view/ViewGroup$LayoutParams;)V", "initialMarginTop", "", "getInitialMarginTop", "()I", "initialMarginBottom", "getInitialMarginBottom", "initialMarginLeft", "getInitialMarginLeft", "initialMarginRight", "getInitialMarginRight", "just-adapter-sticky_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LayoutParams extends FrameLayout.LayoutParams {
    private final int initialMarginBottom;
    private final int initialMarginLeft;
    private final int initialMarginRight;
    private final int initialMarginTop;

    public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.initialMarginTop = jgb1.g(layoutParams);
        this.initialMarginBottom = jgb1.c(layoutParams);
        this.initialMarginLeft = jgb1.d(layoutParams);
        this.initialMarginRight = jgb1.f(layoutParams);
    }

    public final int getInitialMarginBottom() {
        return this.initialMarginBottom;
    }

    public final int getInitialMarginLeft() {
        return this.initialMarginLeft;
    }

    public final int getInitialMarginRight() {
        return this.initialMarginRight;
    }

    public final int getInitialMarginTop() {
        return this.initialMarginTop;
    }
}
