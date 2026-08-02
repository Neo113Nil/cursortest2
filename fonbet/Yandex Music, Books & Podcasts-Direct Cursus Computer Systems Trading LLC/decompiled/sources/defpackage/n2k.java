package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class n2k extends View {
    public tje a;
    public oc9 b;
    public pje c;
    public final ir5 d;

    public /* synthetic */ n2k(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb9 getCurrentAdapter() {
        ViewPager2 viewPager;
        oc9 oc9Var = this.b;
        qon adapter = (oc9Var == null || (viewPager = oc9Var.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof hb9) {
            return (hb9) adapter;
        }
        return null;
    }

    public final void c(oc9 oc9Var) {
        oc9 oc9Var2 = this.b;
        ir5 ir5Var = this.d;
        if (oc9Var2 != null) {
            oc9Var2.e.remove(ir5Var);
            oc9Var2.getViewPager().g(ir5Var);
        }
        oc9Var.e.add(ir5Var);
        oc9Var.getViewPager().b(ir5Var);
        if (oc9Var == this.b) {
            return;
        }
        this.b = oc9Var;
        if (oc9Var.getViewPager().getAdapter() == null) {
            xq0.x("Attached pager adapter is null!");
            return;
        }
        tje tjeVar = this.a;
        if (tjeVar != null) {
            f(tjeVar);
        }
        oc9Var.setPagerOnItemsCountChange$div_release(new uvg(21, (lb9) this));
    }

    public final void f(tje tjeVar) {
        hb9 currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            int size = currentAdapter.u().size();
            tjeVar.f = size;
            dje djeVar = tjeVar.c;
            djeVar.h(size);
            tjeVar.b();
            tjeVar.h = tjeVar.l / 2.0f;
            int C = currentAdapter.C(currentAdapter.p.getCurrentItem$div_release());
            tjeVar.m = C;
            tjeVar.n = 0.0f;
            djeVar.b(C);
            tjeVar.a(C, 0.0f);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object obj;
        RectF i;
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        tje tjeVar = this.a;
        if (tjeVar != null) {
            hkq hkqVar = tjeVar.b;
            dje djeVar = tjeVar.c;
            es6 es6Var = tjeVar.e;
            Iterator it = ((ArrayList) es6Var.b).iterator();
            while (it.hasNext()) {
                sje sjeVar = (sje) it.next();
                float f = sjeVar.c;
                int i2 = sjeVar.a;
                hkqVar.o(canvas, f, tjeVar.h, sjeVar.d, djeVar.k(i2), djeVar.n(i2), djeVar.d(i2));
            }
            Iterator it2 = ((ArrayList) es6Var.b).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((sje) obj).b) {
                        break;
                    }
                }
            }
            sje sjeVar2 = (sje) obj;
            if (sjeVar2 == null || (i = djeVar.i(sjeVar2.c, tjeVar.h, tjeVar.k, wyf.N(tjeVar.d))) == null) {
                return;
            }
            hkqVar.w(canvas, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        tje tjeVar;
        ViewPager2 viewPager;
        qon adapter;
        weo j0;
        weo j02;
        weo j03;
        weo j04;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        pje pjeVar = this.c;
        float f = 0.0f;
        float w = (pjeVar == null || (j04 = pjeVar.b.j0()) == null) ? 0.0f : j04.w();
        pje pjeVar2 = this.c;
        float w2 = (pjeVar2 == null || (j03 = pjeVar2.c.j0()) == null) ? 0.0f : j03.w();
        pje pjeVar3 = this.c;
        int max = (int) (Math.max(w, Math.max(w2, (pjeVar3 == null || (j02 = pjeVar3.d.j0()) == null) ? 0.0f : j02.w())) + getPaddingTop() + getPaddingBottom());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        pje pjeVar4 = this.c;
        if (pjeVar4 != null && (j0 = pjeVar4.b.j0()) != null) {
            f = j0.A();
        }
        pje pjeVar5 = this.c;
        kje kjeVar = pjeVar5 != null ? pjeVar5.e : null;
        if (kjeVar instanceof ije) {
            float f2 = ((ije) kjeVar).a;
            oc9 oc9Var = this.b;
            paddingLeft = getPaddingLeft() + ((int) ((f2 * ((oc9Var == null || (viewPager = oc9Var.getViewPager()) == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.c())) + f));
            paddingRight = getPaddingRight();
        } else {
            if (kjeVar instanceof jje) {
                i3 = size2;
                if (mode2 != Integer.MIN_VALUE) {
                    size2 = Math.min(i3, size2);
                } else if (mode2 != 1073741824) {
                    size2 = i3;
                }
                setMeasuredDimension(size2, size);
                tjeVar = this.a;
                if (tjeVar == null) {
                    tjeVar.c((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
                    return;
                }
                return;
            }
            if (kjeVar != null) {
                b6e.s();
                return;
            } else {
                paddingLeft = getPaddingLeft() + ((int) f);
                paddingRight = getPaddingRight();
            }
        }
        i3 = paddingRight + paddingLeft;
        if (mode2 != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size2, size);
        tjeVar = this.a;
        if (tjeVar == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setStyle(@NotNull pje pjeVar) {
        nsh nshVar;
        dje djeVar;
        this.c = pjeVar;
        wdp wdpVar = pjeVar.b;
        if (wdpVar instanceof oje) {
            x3n x3nVar = new x3n();
            x3nVar.a = pjeVar;
            x3nVar.b = new Paint(1);
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            x3nVar.c = paint;
            x3nVar.d = new RectF();
            nshVar = x3nVar;
        } else {
            if (!(wdpVar instanceof nje)) {
                b6e.s();
                return;
            }
            nshVar = new nsh(pjeVar);
        }
        int D = ouj.D(pjeVar.a);
        if (D == 0) {
            anx anxVar = new anx();
            anxVar.b = pjeVar;
            anxVar.c = new ArgbEvaluator();
            anxVar.d = new SparseArray();
            djeVar = anxVar;
        } else if (D == 1) {
            djeVar = new ttq(pjeVar, 1);
        } else {
            if (D != 2) {
                b6e.s();
                return;
            }
            djeVar = new ttq(pjeVar, 0);
        }
        tje tjeVar = new tje(pjeVar, nshVar, djeVar, this);
        tjeVar.c((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        f(tjeVar);
        this.a = tjeVar;
        requestLayout();
    }

    public n2k(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public n2k(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public n2k(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ir5(this);
    }
}
