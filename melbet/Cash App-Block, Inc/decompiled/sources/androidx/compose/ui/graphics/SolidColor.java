package androidx.compose.ui.graphics;

import kotlin.ULong;

/* loaded from: classes.dex */
public final class SolidColor extends Brush {
    public final long value;

    public SolidColor(long j) {
        this.value = j;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo670applyToPq9zytI(float f, long j, Paint paint) {
        AndroidPaint androidPaint = (AndroidPaint) paint;
        androidPaint.setAlpha(1.0f);
        long j2 = this.value;
        if (f != 1.0f) {
            j2 = Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j2) * f, j2, 14);
        }
        androidPaint.m659setColor8_81llA(j2);
        if (androidPaint.internalShader != null) {
            androidPaint.setShader(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SolidColor) {
            return Color.m676equalsimpl0(this.value, ((SolidColor) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) Color.m682toStringimpl(this.value)) + ')';
    }
}
