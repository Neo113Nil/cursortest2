package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* loaded from: classes4.dex */
public final class rb4 extends Property {
    public final PointF a;
    public final Rect b;
    public PointF c;

    public rb4(PointF pointF, Rect rect) {
        super(PointF.class, "position");
        this.a = pointF;
        this.b = rect;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return this.c;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        PointF pointF2 = this.c;
        if (pointF2 == null || !pointF2.equals(pointF)) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            view.setTranslationX(round - view.getLeft());
            view.setTranslationY(round2 - view.getTop());
            if (this.b == null) {
                return;
            }
            float scaleY = view.getScaleY() * view.getHeight();
            float scaleX = view.getScaleX() * view.getWidth();
            float scaleY2 = view.getScaleY() * r3.height();
            float scaleX2 = view.getScaleX() * r3.width();
            PointF pointF3 = this.c;
            if (pointF3 != null) {
                PointF pointF4 = this.a;
                float f = pointF4.y;
                float f2 = pointF.y;
                float f3 = scaleY - scaleY2;
                if (f - f2 < f3 || pointF4.x - pointF.x < scaleX - scaleX2) {
                    int i = (int) (f2 - pointF3.y);
                    int i2 = (int) (pointF.x - pointF3.x);
                    Rect clipBounds = view.getClipBounds();
                    if (clipBounds == null) {
                        clipBounds = new Rect();
                        clipBounds.set(0, 0, view.getWidth(), view.getHeight());
                        view.setClipBounds(clipBounds);
                    }
                    int i3 = clipBounds.top;
                    int i4 = clipBounds.left;
                    int i5 = clipBounds.right;
                    int i6 = clipBounds.bottom;
                    if (pointF4.y - pointF.y < f3 && scaleY2 < scaleY) {
                        if (i < 0) {
                            i3 = (int) Math.min(f3, i3 - i);
                        } else if (i > 0) {
                            i6 = (int) Math.max(i3 + scaleY2, i6 - i);
                        }
                    }
                    float f4 = scaleX - scaleX2;
                    if (pointF4.x - pointF.x < f4 && scaleX2 < scaleX) {
                        if (i2 < 0) {
                            i4 = (int) Math.min(f4, i4 + i2);
                        } else if (i2 > 0) {
                            i5 = (int) Math.max(i4 + scaleX2, i5 - i2);
                        }
                    }
                    if (clipBounds.top != i3 || clipBounds.left != i4 || clipBounds.right != i5 || clipBounds.bottom != i6) {
                        clipBounds.set(i4, i3, i5, i6);
                        view.setClipBounds(clipBounds);
                    }
                    this.c.set(pointF);
                    return;
                }
            }
            if (pointF3 == null) {
                this.c = new PointF();
            }
            this.c.set(pointF);
        }
    }
}
