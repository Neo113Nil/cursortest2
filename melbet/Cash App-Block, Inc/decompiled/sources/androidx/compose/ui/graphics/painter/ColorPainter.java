package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class ColorPainter extends Painter {
    public final long color;
    public ColorFilter colorFilter;
    public float alpha = 1.0f;
    public final long intrinsicSize = 9205357640488583168L;

    public ColorPainter(long j) {
        this.color = j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return Color.m676equalsimpl0(this.color, ((ColorPainter) obj).color);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DrawScope.m747drawRectnJ9OG0$default(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) Color.m682toStringimpl(this.color)) + ')';
    }
}
