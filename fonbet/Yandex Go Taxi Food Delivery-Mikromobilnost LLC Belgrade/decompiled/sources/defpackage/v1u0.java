package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.d0;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final class v1u0 extends zzs0 {
    public final PositionLayoutManager b;
    public final float c;
    public final d0 d;

    public v1u0(PositionLayoutManager positionLayoutManager, int i, int i2, float f) {
        super(i2 >= 0 ? Math.min(i, i2) : i);
        this.b = positionLayoutManager;
        this.c = f;
        this.d = d0.a(positionLayoutManager, 0);
    }

    @Override // defpackage.zzs0
    public final int a(View view) {
        int k;
        int e;
        d0 d0Var = this.d;
        int i = this.a;
        PositionLayoutManager positionLayoutManager = this.b;
        if (i != 0) {
            View X = positionLayoutManager.X(i);
            if (X == null) {
                return d0Var.b(view);
            }
            int c = (int) (this.c * d0Var.c(view));
            return zzs0.d(positionLayoutManager) ? (d0Var.f() - d0Var.b(X)) - c : (-d0Var.e(X)) + c;
        }
        if (zzs0.d(positionLayoutManager)) {
            k = d0Var.g();
            e = d0Var.b(view);
        } else {
            k = d0Var.k();
            e = d0Var.e(view);
        }
        return k - e;
    }

    @Override // defpackage.zzs0
    public final PointF b(int i) {
        PositionLayoutManager positionLayoutManager = this.b;
        int K1 = positionLayoutManager.K1();
        if (i != K1) {
            return new PointF((i < K1) != zzs0.d(positionLayoutManager) ? -1.0f : 1.0f, 0.0f);
        }
        return c(positionLayoutManager, i);
    }

    @Override // defpackage.zzs0
    public final int e() {
        int i = this.a;
        return i == 0 ? i : i - 1;
    }
}
