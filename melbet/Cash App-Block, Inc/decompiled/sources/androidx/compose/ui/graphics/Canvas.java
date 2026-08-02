package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface Canvas {
    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static void m672clipRectmtrdDE$default(Canvas canvas, Rect rect) {
        canvas.getClass();
        canvas.mo648clipRectN_I0leg(rect.left, rect.top, rect.right, rect.bottom, 1);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo647clipPathmtrdDE(AndroidPath androidPath, int i);

    /* renamed from: clipRect-N_I0leg */
    void mo648clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: concat-58bKbWc */
    void mo649concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo650drawCircle9KIMszo(float f, long j, Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo651drawImaged4ec7I(AndroidImageBitmap androidImageBitmap, long j, Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo652drawImageRectHPBpro0(AndroidImageBitmap androidImageBitmap, long j, long j2, long j3, long j4, Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo653drawLineWko1d7g(long j, long j2, Paint paint);

    void drawOval(float f, float f2, float f3, float f4, Paint paint);

    void drawPath(AndroidPath androidPath, Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo654drawPointsO7TthRY(ArrayList arrayList, Paint paint);

    void drawRect(float f, float f2, float f3, float f4, Paint paint);

    void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint);

    void enableZ();

    void restore();

    void rotate(float f);

    void save();

    void saveLayer(Rect rect, Paint paint);

    void scale(float f, float f2);

    void translate(float f, float f2);
}
