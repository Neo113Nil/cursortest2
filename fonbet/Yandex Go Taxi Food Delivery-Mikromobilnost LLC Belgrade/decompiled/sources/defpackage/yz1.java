package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.map.IconStyle;
import ru.yandex.taxi.altpins.source.overlay.a;

/* loaded from: classes5.dex */
public final class yz1 implements d02 {
    public final /* synthetic */ a a;

    public yz1(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.d02
    public final void w1(sz1 sz1Var) {
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(0.5f, 1.0f));
        a aVar = this.a;
        f4c0 f4c0Var = aVar.x;
        f4c0Var.x(aVar.c.a(sz1Var));
        f4c0Var.D(iconStyle);
        f4c0Var.i(true);
        f4c0Var.o(ru.yandex.taxi.map.utils.a.F(sz1Var.h));
        f4c0Var.k(11.0f);
    }
}
