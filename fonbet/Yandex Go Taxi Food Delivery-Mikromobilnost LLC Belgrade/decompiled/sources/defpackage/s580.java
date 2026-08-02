package defpackage;

import android.util.Size;
import com.yandex.go.superapp.order.multi.old.view.OrderStackView;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes14.dex */
public final class s580 {
    public final lw70 a;
    public final y3u0 b;
    public final h080 c;

    public s580(lw70 lw70Var, y3u0 y3u0Var, h080 h080Var) {
        this.a = lw70Var;
        this.b = y3u0Var;
        this.c = h080Var;
    }

    public final ScreenRect a(Size size, int i, int i2, int i3) {
        OrderStackView orderStackView;
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            return null;
        }
        h080 h080Var = this.c;
        int i4 = h080Var.l;
        orderStackView = this.a.a.orderStackView;
        int max = Math.max(orderStackView != null ? orderStackView.getCardTop() : 0, i4);
        if (this.b.a()) {
            max += h080Var.a;
        }
        return new ScreenRect(new ScreenPoint(i, i2), new ScreenPoint(size.getWidth() - i, Math.max(i4 + i2 + i3, max - i3)));
    }
}
