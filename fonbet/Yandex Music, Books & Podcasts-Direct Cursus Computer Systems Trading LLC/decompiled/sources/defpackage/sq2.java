package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes3.dex */
public final class sq2 implements xfu {
    public int a = 0;
    public final /* synthetic */ xo9 b;

    public sq2(xo9 xo9Var) {
        this.b = xo9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r1 <= r5) goto L32;
     */
    @Override // defpackage.xfu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, float f, int i2) {
        ngu nguVar;
        mgu mguVar;
        mgu mguVar2;
        int i3 = this.a;
        xo9 xo9Var = this.b;
        if (i3 != 0 && (nguVar = xo9Var.e) != null && (mguVar = xo9Var.f) != null) {
            jua juaVar = (jua) mguVar;
            juaVar.d = i;
            juaVar.e = f;
            if (nguVar.d && (mguVar2 = nguVar.a) != null && mguVar2.b(i, f)) {
                Rect rect = nguVar.c;
                if (rect == null) {
                    rect = new Rect();
                    nguVar.c = rect;
                }
                nguVar.getLocalVisibleRect(rect);
                if (rect.height() != nguVar.getHeight()) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(nguVar.getWidth(), 1073741824);
                    Integer num = nguVar.e;
                    int a = mguVar2.a(makeMeasureSpec, num != null ? num.intValue() : View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (a != nguVar.getHeight()) {
                        int i4 = rect.top;
                        if (a <= rect.bottom) {
                        }
                    }
                }
                if (nguVar.isInLayout()) {
                    nguVar.post(new he0(10, nguVar));
                } else {
                    nguVar.requestLayout();
                }
            }
        }
        if (xo9Var.l) {
            return;
        }
        xo9Var.c.getClass();
    }

    @Override // defpackage.xfu
    public final void b(int i) {
        ngu nguVar;
        xo9 xo9Var = this.b;
        mgu mguVar = xo9Var.f;
        if (mguVar == null) {
            xo9Var.d.requestLayout();
            return;
        }
        if (this.a != 0 || mguVar == null || (nguVar = xo9Var.e) == null) {
            return;
        }
        jua juaVar = (jua) mguVar;
        juaVar.d = i;
        juaVar.e = 0.0f;
        nguVar.requestLayout();
    }

    @Override // defpackage.xfu
    public final void c(int i) {
        or2 or2Var;
        ngu nguVar;
        this.a = i;
        if (i == 0) {
            xo9 xo9Var = this.b;
            int currentItem = xo9Var.d.getCurrentItem();
            mgu mguVar = xo9Var.f;
            if (mguVar != null && (nguVar = xo9Var.e) != null) {
                jua juaVar = (jua) mguVar;
                juaVar.d = currentItem;
                juaVar.e = 0.0f;
                nguVar.requestLayout();
            }
            if (!xo9Var.l) {
                v1s v1sVar = xo9Var.c;
                if (v1sVar.getSelectedTabPosition() != currentItem && (or2Var = (or2) v1sVar.a.get(currentItem)) != null) {
                    qr2 qr2Var = or2Var.c;
                    if (qr2Var == null) {
                        xq0.x("Tab not attached to a TabLayout");
                        return;
                    }
                    qr2Var.k(or2Var, true);
                }
            }
            xo9Var.l = false;
        }
    }
}
