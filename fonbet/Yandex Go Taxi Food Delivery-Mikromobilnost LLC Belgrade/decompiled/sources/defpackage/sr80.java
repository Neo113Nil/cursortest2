package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.d0;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final class sr80 extends zzs0 {
    public final PositionLayoutManager b;
    public final ArrayList c;
    public final jh20 d;
    public final d0 e;

    public sr80(PositionLayoutManager positionLayoutManager, int i, ArrayList arrayList, jh20 jh20Var) {
        super(i);
        this.b = positionLayoutManager;
        this.c = arrayList;
        this.d = jh20Var;
        this.e = d0.a(positionLayoutManager, 0);
    }

    @Override // defpackage.zzs0
    public final int a(View view) {
        Integer num;
        int paddingEnd;
        int k;
        int e;
        d0 d0Var = this.e;
        int i = this.a;
        PositionLayoutManager positionLayoutManager = this.b;
        if (i == 0) {
            if (zzs0.d(positionLayoutManager)) {
                k = d0Var.g();
                e = d0Var.b(view);
            } else {
                k = d0Var.k();
                e = d0Var.e(view);
            }
            return k - e;
        }
        View X = positionLayoutManager.X(i);
        if (X == null) {
            return (positionLayoutManager.f0() ? (d0Var.l() / 2) + d0Var.k() : d0Var.f() / 2) - ((d0Var.c(view) / 2) + d0Var.e(view));
        }
        ArrayList arrayList = new ArrayList();
        for (qr80 qr80Var : this.c) {
            View X2 = positionLayoutManager.X(qr80Var.b);
            if (X2 != null) {
                k2x b = this.d.b(qr80Var.a);
                int i2 = qr80Var.b;
                if (b == null) {
                    float f = i2 < i ? 0.7f : 0.3f;
                    paddingEnd = zzs0.d(positionLayoutManager) ? g(X2) - m810.b(d0Var.c(X2) * f) : g(X2) + m810.b(d0Var.c(X2) * f);
                } else {
                    int i3 = b.a;
                    int i4 = b.b;
                    paddingEnd = i2 < i ? zzs0.d(positionLayoutManager) ? i4 + X2.getPaddingEnd() + f(X2) : (f(X2) - X2.getPaddingEnd()) - i4 : zzs0.d(positionLayoutManager) ? (g(X2) - X2.getPaddingStart()) - i3 : X2.getPaddingStart() + g(X2) + i3;
                }
                num = Integer.valueOf(paddingEnd);
            } else {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        int g = g(X);
        int f2 = f(X);
        int min = Math.min(g, f2);
        int max = Math.max(g, f2);
        int i5 = max - min;
        int i6 = positionLayoutManager.H;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int min2 = Math.min(min, intValue);
            int max2 = Math.max(max, intValue);
            int i7 = max2 - min2;
            if (i7 < i6) {
                max = max2;
                min = min2;
                i5 = i7;
            }
        }
        return (positionLayoutManager.f0() ? (d0Var.l() / 2) + d0Var.k() : d0Var.f() / 2) - ((i5 / 2) + min);
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
        if (i != 0) {
            PositionLayoutManager positionLayoutManager = this.b;
            if (i != positionLayoutManager.getItemCount() - 1 && positionLayoutManager.X(i) != null) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    qr80 qr80Var = (qr80) it.next();
                    if (positionLayoutManager.X(qr80Var.b) == null) {
                        return qr80Var.b;
                    }
                }
            }
        }
        return i;
    }

    public final int f(View view) {
        boolean d = zzs0.d(this.b);
        d0 d0Var = this.e;
        return d ? d0Var.e(view) : d0Var.b(view);
    }

    public final int g(View view) {
        boolean d = zzs0.d(this.b);
        d0 d0Var = this.e;
        return d ? d0Var.b(view) : d0Var.e(view);
    }
}
