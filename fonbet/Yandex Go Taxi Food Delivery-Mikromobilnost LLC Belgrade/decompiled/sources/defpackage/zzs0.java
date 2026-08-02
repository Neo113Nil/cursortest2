package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public abstract class zzs0 {
    public final int a;

    public zzs0(int i) {
        this.a = i;
    }

    public static boolean d(RecyclerView.e eVar) {
        return eVar.b.getLayoutDirection() == 1;
    }

    public abstract int a(View view);

    public abstract PointF b(int i);

    public final PointF c(PositionLayoutManager positionLayoutManager, int i) {
        int a;
        View X = positionLayoutManager.X(i);
        if (X == null || (a = a(X)) == 0) {
            return null;
        }
        return new PointF(Integer.signum(a), 0.0f);
    }

    public int e() {
        return this.a;
    }
}
