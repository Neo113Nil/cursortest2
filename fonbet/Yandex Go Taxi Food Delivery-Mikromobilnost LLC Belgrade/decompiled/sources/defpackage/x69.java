package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.d0;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final class x69 extends zzs0 {
    public final PositionLayoutManager b;
    public final int c;
    public final d0 d;

    public x69(PositionLayoutManager positionLayoutManager, int i, int i2) {
        super(i);
        this.b = positionLayoutManager;
        this.c = i2;
        this.d = d0.a(positionLayoutManager, 0);
    }

    @Override // defpackage.zzs0
    public final int a(View view) {
        View X;
        d0 d0Var = this.d;
        int c = (d0Var.c(view) / 2) + d0Var.e(view);
        PositionLayoutManager positionLayoutManager = this.b;
        int i = this.c;
        if (i >= 0 && i < positionLayoutManager.getItemCount() && (X = positionLayoutManager.X(i)) != null) {
            c = (((d0Var.c(X) / 2) + d0Var.e(X)) + c) / 2;
        }
        int l = (positionLayoutManager.f0() ? (d0Var.l() / 2) + d0Var.k() : d0Var.f() / 2) - c;
        int i2 = this.a;
        boolean z = i2 == 0;
        boolean z2 = i2 == positionLayoutManager.getItemCount() - 1;
        boolean z3 = i2 == 1;
        boolean z4 = i2 == positionLayoutManager.getItemCount() + (-2);
        View X2 = positionLayoutManager.X(i2 + 1);
        View X3 = positionLayoutManager.X(i2 - 1);
        return (!z || X2 == null) ? (!z2 || X3 == null) ? (!z3 || X3 == null) ? (!z4 || X2 == null) ? l : f(X2, view, l) : g(X3, view, l) : f(view, X3, l) : g(view, X2, l);
    }

    @Override // defpackage.zzs0
    public final PointF b(int i) {
        PositionLayoutManager positionLayoutManager = this.b;
        int K1 = positionLayoutManager.K1();
        int M1 = ((positionLayoutManager.M1() - K1) / 2) + K1;
        if (i != M1) {
            return new PointF((i < M1) != zzs0.d(positionLayoutManager) ? -1.0f : 1.0f, 0.0f);
        }
        return c(positionLayoutManager, i);
    }

    public final int f(View view, View view2, int i) {
        PositionLayoutManager positionLayoutManager = this.b;
        if (!zzs0.d(positionLayoutManager) ? i < 0 : i > 0) {
            return i;
        }
        d0 d0Var = this.d;
        int c = d0Var.c(view);
        int e = zzs0.d(positionLayoutManager) ? d0Var.e(view2) : d0Var.b(view2);
        if (!zzs0.d(positionLayoutManager)) {
            e = d0Var.f() - e;
        }
        return Integer.signum(i) * Math.min(Math.abs(positionLayoutManager.getPaddingEnd() + (c - e)), Math.abs(i));
    }

    public final int g(View view, View view2, int i) {
        PositionLayoutManager positionLayoutManager = this.b;
        if (!zzs0.d(positionLayoutManager) ? i > 0 : i < 0) {
            return i;
        }
        d0 d0Var = this.d;
        int c = d0Var.c(view);
        int b = zzs0.d(positionLayoutManager) ? d0Var.b(view2) : d0Var.e(view2);
        return Integer.signum(i) * Math.min(Math.abs(positionLayoutManager.getPaddingStart() + (zzs0.d(positionLayoutManager) ? (b + c) - positionLayoutManager.H : c - b)), Math.abs(i));
    }
}
