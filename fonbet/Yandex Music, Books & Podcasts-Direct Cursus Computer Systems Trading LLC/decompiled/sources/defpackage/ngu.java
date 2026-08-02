package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ngu extends FrameLayout {
    public mgu a;
    public int b;
    public Rect c;
    public boolean d;
    public Integer e;

    public /* synthetic */ ngu(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final boolean getAnimateOnScroll() {
        return this.d;
    }

    public final int getCollapsiblePaddingBottom() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.e = Integer.valueOf(i2);
        mgu mguVar = this.a;
        if (mguVar != null) {
            mguVar.getClass();
            i2 = View.MeasureSpec.makeMeasureSpec(mguVar.a(i, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setAnimateOnScroll(boolean z) {
        this.d = z;
    }

    public final void setCollapsiblePaddingBottom(int i) {
        if (this.b != i) {
            this.b = i;
        }
    }

    public final void setHeightCalculator(mgu mguVar) {
        this.a = mguVar;
    }

    public ngu(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ngu(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public ngu(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
    }
}
