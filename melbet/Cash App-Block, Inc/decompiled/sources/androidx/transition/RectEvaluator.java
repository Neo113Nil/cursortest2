package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public final class RectEvaluator implements TypeEvaluator {
    public final /* synthetic */ int $r8$classId = 0;
    public Rect mRect;

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i = rect.left + ((int) ((rect2.left - r0) * f));
                int i2 = rect.top + ((int) ((rect2.top - r1) * f));
                int i3 = rect.right + ((int) ((rect2.right - r2) * f));
                int i4 = rect.bottom + ((int) ((rect2.bottom - r6) * f));
                Rect rect3 = this.mRect;
                if (rect3 == null) {
                    return new Rect(i, i2, i3, i4);
                }
                rect3.set(i, i2, i3, i4);
                return rect3;
            default:
                Rect rect4 = (Rect) obj;
                Rect rect5 = (Rect) obj2;
                int i5 = rect4.left + ((int) ((rect5.left - r0) * f));
                int i6 = rect4.top + ((int) ((rect5.top - r1) * f));
                int i7 = rect4.right + ((int) ((rect5.right - r2) * f));
                int i8 = rect4.bottom + ((int) ((rect5.bottom - r6) * f));
                Rect rect6 = this.mRect;
                rect6.set(i5, i6, i7, i8);
                return rect6;
        }
    }

    public /* synthetic */ RectEvaluator() {
    }
}
