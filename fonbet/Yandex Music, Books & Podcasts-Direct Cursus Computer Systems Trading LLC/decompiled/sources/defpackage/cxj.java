package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class cxj extends gc9 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxj(yon yonVar, int i) {
        super(yonVar);
        this.d = i;
    }

    @Override // defpackage.gc9
    public final int b(View view) {
        int Y;
        int i;
        switch (this.d) {
            case 0:
                zon zonVar = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                Y = yon.Y(view);
                i = ((ViewGroup.MarginLayoutParams) zonVar).rightMargin;
                break;
            default:
                zon zonVar2 = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                Y = yon.T(view);
                i = ((ViewGroup.MarginLayoutParams) zonVar2).bottomMargin;
                break;
        }
        return Y + i;
    }

    @Override // defpackage.gc9
    public final int c(View view) {
        int X;
        int i;
        switch (this.d) {
            case 0:
                zon zonVar = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                X = yon.X(view) + ((ViewGroup.MarginLayoutParams) zonVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) zonVar).rightMargin;
                break;
            default:
                zon zonVar2 = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                X = yon.W(view) + ((ViewGroup.MarginLayoutParams) zonVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) zonVar2).bottomMargin;
                break;
        }
        return X + i;
    }

    @Override // defpackage.gc9
    public final int d(View view) {
        int W;
        int i;
        switch (this.d) {
            case 0:
                zon zonVar = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                W = yon.W(view) + ((ViewGroup.MarginLayoutParams) zonVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) zonVar).bottomMargin;
                break;
            default:
                zon zonVar2 = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                W = yon.X(view) + ((ViewGroup.MarginLayoutParams) zonVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) zonVar2).rightMargin;
                break;
        }
        return W + i;
    }

    @Override // defpackage.gc9
    public final int e(View view) {
        int V;
        int i;
        switch (this.d) {
            case 0:
                zon zonVar = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                V = yon.V(view);
                i = ((ViewGroup.MarginLayoutParams) zonVar).leftMargin;
                break;
            default:
                zon zonVar2 = (zon) view.getLayoutParams();
                ((yon) this.b).getClass();
                V = yon.Z(view);
                i = ((ViewGroup.MarginLayoutParams) zonVar2).topMargin;
                break;
        }
        return V - i;
    }

    @Override // defpackage.gc9
    public final int f() {
        switch (this.d) {
            case 0:
                return ((yon) this.b).n;
            default:
                return ((yon) this.b).o;
        }
    }

    @Override // defpackage.gc9
    public final int g() {
        int i;
        int d0;
        switch (this.d) {
            case 0:
                yon yonVar = (yon) this.b;
                i = yonVar.n;
                d0 = yonVar.d0();
                break;
            default:
                yon yonVar2 = (yon) this.b;
                i = yonVar2.o;
                d0 = yonVar2.b0();
                break;
        }
        return i - d0;
    }

    @Override // defpackage.gc9
    public final int h() {
        switch (this.d) {
            case 0:
                return ((yon) this.b).d0();
            default:
                return ((yon) this.b).b0();
        }
    }

    @Override // defpackage.gc9
    public final int j() {
        switch (this.d) {
            case 0:
                return ((yon) this.b).l;
            default:
                return ((yon) this.b).m;
        }
    }

    @Override // defpackage.gc9
    public final int k() {
        switch (this.d) {
            case 0:
                return ((yon) this.b).m;
            default:
                return ((yon) this.b).l;
        }
    }

    @Override // defpackage.gc9
    public final int n() {
        switch (this.d) {
            case 0:
                return ((yon) this.b).c0();
            default:
                return ((yon) this.b).e0();
        }
    }

    @Override // defpackage.gc9
    public final int o() {
        int c0;
        int d0;
        switch (this.d) {
            case 0:
                yon yonVar = (yon) this.b;
                c0 = yonVar.n - yonVar.c0();
                d0 = yonVar.d0();
                break;
            default:
                yon yonVar2 = (yon) this.b;
                c0 = yonVar2.o - yonVar2.e0();
                d0 = yonVar2.b0();
                break;
        }
        return c0 - d0;
    }

    @Override // defpackage.gc9
    public final int p(View view) {
        switch (this.d) {
            case 0:
                yon yonVar = (yon) this.b;
                Rect rect = (Rect) this.c;
                yonVar.j0(rect, view);
                return rect.right;
            default:
                yon yonVar2 = (yon) this.b;
                Rect rect2 = (Rect) this.c;
                yonVar2.j0(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.gc9
    public final int q(View view) {
        switch (this.d) {
            case 0:
                yon yonVar = (yon) this.b;
                Rect rect = (Rect) this.c;
                yonVar.j0(rect, view);
                return rect.left;
            default:
                yon yonVar2 = (yon) this.b;
                Rect rect2 = (Rect) this.c;
                yonVar2.j0(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.gc9
    public final void r(int i) {
        switch (this.d) {
            case 0:
                ((yon) this.b).p0(i);
                break;
            default:
                ((yon) this.b).q0(i);
                break;
        }
    }
}
