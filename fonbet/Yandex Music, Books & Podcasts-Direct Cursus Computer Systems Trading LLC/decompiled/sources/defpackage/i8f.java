package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i8f extends won {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final Paint h;
    public final int i;

    public i8f(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        this.a = f;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
        this.g = f8;
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStrokeWidth(f2);
        this.h = paint;
        this.i = paint.getAlpha();
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        v8f v8fVar;
        int i;
        boolean z;
        rect.getClass();
        view.getClass();
        kpnVar.getClass();
        qon adapter = recyclerView.getAdapter();
        r8f r8fVar = adapter instanceof r8f ? (r8f) adapter : null;
        if (r8fVar == null) {
            su4.s(2, null, "Trying to get offset for RV with null JuicyCatalogMenuActionsAdapter adapter", null);
            return;
        }
        ArrayList arrayList = r8fVar.g;
        View O = recyclerView.O(view);
        opn a0 = O == null ? null : recyclerView.a0(O);
        Integer valueOf = a0 != null ? Integer.valueOf(a0.c()) : null;
        v8f v = valueOf != null ? r8fVar.v(valueOf.intValue()) : null;
        v8f v8fVar2 = v8f.a;
        if (v == v8fVar2 || v == (v8fVar = v8f.b) || v == v8f.f) {
            return;
        }
        if (v == v8f.c) {
            rect.set(0, (int) this.d, 0, (int) this.e);
            return;
        }
        boolean z2 = true;
        if (v == v8f.g) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((f8f) it.next()) instanceof z7f) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((f8f) it2.next()) instanceof e8f) {
                        break;
                    }
                }
            }
            z2 = false;
            rect.set(0, 0, 0, (int) ((z || z2) ? this.g : this.f));
            return;
        }
        boolean z3 = r8fVar.v(0) == v8fVar2;
        boolean z4 = r8fVar.v(0) == v8fVar || r8fVar.v(1) == v8fVar || (arrayList.size() >= 3 && r8fVar.v(2) == v8fVar);
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((f8f) it3.next()) instanceof a8f) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        if (z3) {
            i++;
        }
        if (z4) {
            i++;
        }
        int Y = RecyclerView.Y(view);
        int i2 = Y - i;
        int b = kpnVar.b() - i;
        boolean z5 = i2 == 0;
        boolean z6 = b > 0 && i2 == b + (-2);
        int u = r8fVar.u(Y);
        int u2 = i2 != 0 ? r8fVar.u(Y - 1) : u;
        int u3 = i2 != b - 1 ? r8fVar.u(Y + 1) : u;
        boolean z7 = u2 != u;
        boolean z8 = u3 != u;
        boolean z9 = z5 || z7;
        boolean z10 = z6 || z8;
        view.setOutlineProvider(new qgo(this.c, (z9 && z10) ? pgo.a : z9 ? pgo.b : z10 ? pgo.d : pgo.c));
        view.setClipToOutline(true);
        rect.set(0, z5 ? (int) this.a : 0, 0, (z6 || z8) ? (int) this.b : 0);
    }

    @Override // defpackage.won
    public final void h(Canvas canvas, RecyclerView recyclerView, kpn kpnVar) {
        Canvas canvas2;
        canvas.getClass();
        kpnVar.getClass();
        qon adapter = recyclerView.getAdapter();
        r8f r8fVar = adapter instanceof r8f ? (r8f) adapter : null;
        if (r8fVar == null) {
            su4.s(2, null, "Trying to get offset for RV with null JuicyCatalogMenuActionsAdapter", null);
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            int c = recyclerView.a0(childAt).c();
            if (c != -1) {
                int u = r8fVar.u(c);
                int i3 = c + 1;
                int u2 = i3 < r8fVar.g.size() ? r8fVar.u(i3) : -1;
                boolean z = u2 != u;
                if (u2 != -1 && !z) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    float translationY = childAt.getTranslationY() + childAt.getBottom();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    int alpha = (int) (childAt.getAlpha() * this.i);
                    Paint paint = this.h;
                    paint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawLine(paddingLeft, translationY, width, translationY, paint);
                    i = i2;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i = i2;
            canvas = canvas2;
        }
    }
}
