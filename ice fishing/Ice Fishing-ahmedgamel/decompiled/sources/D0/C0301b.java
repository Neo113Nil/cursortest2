package D0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: D0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0301b(Class cls, String str, int i) {
        super(cls, str);
        this.f546a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f546a) {
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
                return Float.valueOf(y.f619a.h((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f546a) {
            case 0:
                C0304e c0304e = (C0304e) obj;
                PointF pointF = (PointF) obj2;
                c0304e.getClass();
                c0304e.f549a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0304e.f550b = round;
                int i = c0304e.f554f + 1;
                c0304e.f554f = i;
                if (i == c0304e.f555g) {
                    y.a(c0304e.f553e, c0304e.f549a, round, c0304e.f551c, c0304e.f552d);
                    c0304e.f554f = 0;
                    c0304e.f555g = 0;
                    break;
                }
                break;
            case 1:
                C0304e c0304e2 = (C0304e) obj;
                PointF pointF2 = (PointF) obj2;
                c0304e2.getClass();
                c0304e2.f551c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0304e2.f552d = round2;
                int i6 = c0304e2.f555g + 1;
                c0304e2.f555g = i6;
                if (c0304e2.f554f == i6) {
                    y.a(c0304e2.f553e, c0304e2.f549a, c0304e2.f550b, c0304e2.f551c, round2);
                    c0304e2.f554f = 0;
                    c0304e2.f555g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                y.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                y.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                y.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                y.f619a.l((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
