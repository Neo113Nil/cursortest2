package coil3.compose;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes3.dex */
public final class FixedSizeColorPainter extends Painter {
    public static final int $stable = Painter.$stable;
    public final long color;
    public final long intrinsicSize = 9205357640488583168L;

    public FixedSizeColorPainter(long j) {
        this.color = j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        drawScope.getClass();
        DrawScope.m747drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
    }
}
