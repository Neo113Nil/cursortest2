package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mb4 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb4(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
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
                return null;
            case 6:
                return Float.valueOf(((zpa) obj).b());
            case 7:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 8:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 9:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 10:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 11:
                return Float.valueOf(((t6g) obj).i);
            case 12:
                return Float.valueOf(((v6g) obj).j);
            case 13:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 14:
                return Float.valueOf(yhu.a.z((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pb4 pb4Var = (pb4) obj;
                PointF pointF = (PointF) obj2;
                pb4Var.getClass();
                pb4Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                pb4Var.b = round;
                int i = pb4Var.f + 1;
                pb4Var.f = i;
                if (i == pb4Var.g) {
                    yhu.a(pb4Var.e, pb4Var.a, round, pb4Var.c, pb4Var.d);
                    pb4Var.f = 0;
                    pb4Var.g = 0;
                    break;
                }
                break;
            case 1:
                pb4 pb4Var2 = (pb4) obj;
                PointF pointF2 = (PointF) obj2;
                pb4Var2.getClass();
                pb4Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                pb4Var2.d = round2;
                int i2 = pb4Var2.g + 1;
                pb4Var2.g = i2;
                if (pb4Var2.f == i2) {
                    yhu.a(pb4Var2.e, pb4Var2.a, pb4Var2.b, pb4Var2.c, round2);
                    pb4Var2.f = 0;
                    pb4Var2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                yhu.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                yhu.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                yhu.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                View view4 = (View) obj;
                PointF pointF6 = (PointF) obj2;
                view4.setScaleX(pointF6.x);
                view4.setScaleY(pointF6.y);
                break;
            case 6:
                zpa zpaVar = (zpa) obj;
                float floatValue = ((Float) obj2).floatValue();
                if (zpaVar.i != floatValue) {
                    zpaVar.i = floatValue;
                    zpaVar.invalidateSelf();
                    break;
                }
                break;
            case 7:
                View view5 = (View) obj;
                view5.getLayoutParams().width = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case 8:
                View view6 = (View) obj;
                view6.getLayoutParams().height = ((Float) obj2).intValue();
                view6.requestLayout();
                break;
            case 9:
                View view7 = (View) obj;
                view7.setPaddingRelative(((Float) obj2).intValue(), view7.getPaddingTop(), view7.getPaddingEnd(), view7.getPaddingBottom());
                break;
            case 10:
                View view8 = (View) obj;
                view8.setPaddingRelative(view8.getPaddingStart(), view8.getPaddingTop(), ((Float) obj2).intValue(), view8.getPaddingBottom());
                break;
            case 11:
                t6g t6gVar = (t6g) obj;
                t6gVar.i = ((Float) obj2).floatValue();
                ArrayList arrayList = (ArrayList) t6gVar.c;
                ((gqa) arrayList.get(0)).a = 0.0f;
                float x = hyf.x(((int) (r14 * 333.0f)) / 667, 0.0f, 1.0f);
                gqa gqaVar = (gqa) arrayList.get(0);
                gqa gqaVar2 = (gqa) arrayList.get(1);
                k5c k5cVar = t6gVar.e;
                float interpolation = k5cVar.getInterpolation(x);
                gqaVar2.a = interpolation;
                gqaVar.b = interpolation;
                gqa gqaVar3 = (gqa) arrayList.get(1);
                gqa gqaVar4 = (gqa) arrayList.get(2);
                float interpolation2 = k5cVar.getInterpolation(x + 0.49925038f);
                gqaVar4.a = interpolation2;
                gqaVar3.b = interpolation2;
                ((gqa) arrayList.get(2)).b = 1.0f;
                if (t6gVar.h && ((gqa) arrayList.get(1)).b < 1.0f) {
                    ((gqa) arrayList.get(2)).c = ((gqa) arrayList.get(1)).c;
                    ((gqa) arrayList.get(1)).c = ((gqa) arrayList.get(0)).c;
                    ((gqa) arrayList.get(0)).c = t6gVar.f.e[t6gVar.g];
                    t6gVar.h = false;
                }
                ((qie) t6gVar.b).invalidateSelf();
                break;
            case 12:
                v6g v6gVar = (v6g) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                v6gVar.j = floatValue2;
                int i3 = (int) (floatValue2 * 1800.0f);
                Interpolator[] interpolatorArr = v6gVar.f;
                ArrayList arrayList2 = (ArrayList) v6gVar.c;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    gqa gqaVar5 = (gqa) arrayList2.get(i4);
                    int i5 = i4 * 2;
                    int i6 = v6g.m[i5];
                    int[] iArr = v6g.l;
                    gqaVar5.a = hyf.x(interpolatorArr[i5].getInterpolation(hyf.x((i3 - i6) / iArr[i5], 0.0f, 1.0f)), 0.0f, 1.0f);
                    gqaVar5.b = hyf.x(interpolatorArr[i5 + 1].getInterpolation(hyf.x((i3 - r5[r6]) / iArr[r6], 0.0f, 1.0f)), 0.0f, 1.0f);
                }
                if (v6gVar.i) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((gqa) it.next()).c = v6gVar.g.e[v6gVar.h];
                    }
                    v6gVar.i = false;
                }
                ((qie) v6gVar.b).invalidateSelf();
                break;
            case 13:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 14:
                yhu.a.H((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
