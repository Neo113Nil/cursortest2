package p0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0324b(Class cls, String str, int i) {
        super(cls, str);
        this.f4152a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f4152a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(w.f4216a.o((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f4152a) {
            case 0:
                C0327e c0327e = (C0327e) obj;
                PointF pointF = (PointF) obj2;
                c0327e.getClass();
                c0327e.f4155a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0327e.f4156b = round;
                int i = c0327e.f4159f + 1;
                c0327e.f4159f = i;
                if (i == c0327e.f4160g) {
                    w.a(c0327e.e, c0327e.f4155a, round, c0327e.f4157c, c0327e.f4158d);
                    c0327e.f4159f = 0;
                    c0327e.f4160g = 0;
                    break;
                }
                break;
            case 1:
                C0327e c0327e2 = (C0327e) obj;
                PointF pointF2 = (PointF) obj2;
                c0327e2.getClass();
                c0327e2.f4157c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0327e2.f4158d = round2;
                int i2 = c0327e2.f4160g + 1;
                c0327e2.f4160g = i2;
                if (c0327e2.f4159f == i2) {
                    w.a(c0327e2.e, c0327e2.f4155a, c0327e2.f4156b, c0327e2.f4157c, round2);
                    c0327e2.f4159f = 0;
                    c0327e2.f4160g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f4216a.A((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
