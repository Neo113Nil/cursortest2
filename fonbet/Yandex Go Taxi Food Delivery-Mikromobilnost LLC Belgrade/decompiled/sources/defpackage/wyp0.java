package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import flex.theme.ThemedColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class wyp0 extends RecyclerView.d {
    public final cfx a;
    public final exy0 b;
    public uyp0 x;
    public final Rect c = new Rect();
    public final Paint w = new Paint();
    public final ArrayList y = new ArrayList();

    public wyp0(efx efxVar, exy0 exy0Var) {
        this.a = efxVar;
        this.b = exy0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
        }
        if (this.x == null) {
            f(recyclerView);
            uyp0 uyp0Var = new uyp0(this, recyclerView, 0);
            recyclerView.addOnChildAttachStateChangeListener(uyp0Var);
            this.x = uyp0Var;
        }
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            vyp0 vyp0Var = (vyp0) it.next();
            boolean z = vyp0Var.b;
            Rect rect = this.c;
            if (z) {
                i = recyclerView.getPaddingTop();
            } else {
                recyclerView.getDecoratedBoundsWithMargins(vyp0Var.a, rect);
                i = rect.top;
            }
            if (vyp0Var.d) {
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            } else {
                recyclerView.getDecoratedBoundsWithMargins(vyp0Var.c, rect);
                i2 = rect.bottom;
            }
            rect.top = i;
            rect.bottom = i2;
            rect.right = canvas.getWidth();
            rect.left = 0;
            int a = this.b.a(vyp0Var.e);
            Paint paint = this.w;
            paint.setColor(a);
            canvas.drawRect(rect, paint);
        }
        canvas.restore();
    }

    public final void f(RecyclerView recyclerView) {
        Integer num;
        boolean z;
        syp0 syp0Var;
        ArrayList arrayList = this.y;
        arrayList.clear();
        List f = this.a.f();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        Integer num2 = null;
        View view = null;
        Integer num3 = null;
        View view2 = null;
        ThemedColor themedColor = null;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition < 0 || childAdapterPosition >= f.size()) {
                num3 = num3;
            } else {
                u0x u0xVar = (u0x) f.get(childAdapterPosition);
                aul aulVar = u0xVar instanceof aul ? (aul) u0xVar : null;
                ThemedColor themedColor2 = (aulVar == null || (syp0Var = aulVar.c) == null) ? null : syp0Var.a;
                if (!jl40.l(themedColor2, themedColor)) {
                    if (num2 != null && num2.intValue() == 0) {
                        num = num3;
                        z = true;
                    } else {
                        num = num3;
                        z = false;
                    }
                    vyp0 vyp0Var = (view == null || view2 == null || themedColor == null) ? null : new vyp0(view, z, view2, num != null && num.intValue() == f.size() - 1, themedColor);
                    if (vyp0Var != null) {
                        arrayList.add(vyp0Var);
                    }
                    num2 = Integer.valueOf(childAdapterPosition);
                    themedColor = themedColor2;
                    view = childAt;
                }
                num3 = Integer.valueOf(childAdapterPosition);
                view2 = childAt;
            }
            i++;
        }
        Integer num4 = num3;
        vyp0 vyp0Var2 = (view == null || view2 == null || themedColor == null) ? null : new vyp0(view, num2 != null && num2.intValue() == 0, view2, num4 != null && num4.intValue() == f.size() - 1, themedColor);
        if (vyp0Var2 != null) {
            arrayList.add(vyp0Var2);
        }
    }
}
