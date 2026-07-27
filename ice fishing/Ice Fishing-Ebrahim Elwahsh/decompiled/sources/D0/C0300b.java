package D0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: D0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0300b(Class cls, String str, int i) {
        super(cls, str);
        this.f601a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f601a) {
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
                return Float.valueOf(y.f674a.j((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f601a) {
            case 0:
                C0303e c0303e = (C0303e) obj;
                PointF pointF = (PointF) obj2;
                c0303e.getClass();
                c0303e.f604a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0303e.f605b = round;
                int i = c0303e.f609f + 1;
                c0303e.f609f = i;
                if (i == c0303e.f610g) {
                    y.a(c0303e.f608e, c0303e.f604a, round, c0303e.f606c, c0303e.f607d);
                    c0303e.f609f = 0;
                    c0303e.f610g = 0;
                    break;
                }
                break;
            case 1:
                C0303e c0303e2 = (C0303e) obj;
                PointF pointF2 = (PointF) obj2;
                c0303e2.getClass();
                c0303e2.f606c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0303e2.f607d = round2;
                int i4 = c0303e2.f610g + 1;
                c0303e2.f610g = i4;
                if (c0303e2.f609f == i4) {
                    y.a(c0303e2.f608e, c0303e2.f604a, c0303e2.f605b, c0303e2.f606c, round2);
                    c0303e2.f609f = 0;
                    c0303e2.f610g = 0;
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
                y.f674a.o((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
