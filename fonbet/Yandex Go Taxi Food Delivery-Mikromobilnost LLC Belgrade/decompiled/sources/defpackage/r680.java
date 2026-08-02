package defpackage;

import android.content.res.Resources;
import androidx.recyclerview.widget.x0;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.shortcuts.impl.view.adapter.t;
import java.util.List;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class r680 extends t {
    public final yln B;
    public final mmp0 C;

    public r680(Resources resources, a aVar, w3s0 w3s0Var, c cVar, x3s0 x3s0Var, x3s0 x3s0Var2, List list, dz70 dz70Var, wor0 wor0Var, n170 n170Var, c1f c1fVar, j1s0 j1s0Var, t4s0 t4s0Var, k3s0 k3s0Var, x1s0 x1s0Var, yln ylnVar, mmp0 mmp0Var, e eVar, mqv0 mqv0Var, ru.yandex.taxi.design.utils.a aVar2, pdc pdcVar, ip11 ip11Var, sxr0 sxr0Var, ykn0 ykn0Var, String str) {
        super(resources, aVar, w3s0Var, cVar, x3s0Var, null, x3s0Var2, wor0Var, list, dz70Var, c1fVar, n170Var, t4s0Var, k3s0Var, j1s0Var, x1s0Var, ylnVar, mmp0Var, eVar, mqv0Var, aVar2, pdcVar, ip11Var, sxr0Var, ykn0Var, str);
        this.B = ylnVar;
        this.C = mmp0Var;
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.t, defpackage.fnt0
    public final kl3 a(int i) {
        return ((e6v) getItem(i)) instanceof rr00 ? ent0.b : super.a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        wys wysVar = (wys) x0Var;
        super.onViewAttachedToWindow(wysVar);
        if (wysVar instanceof co70) {
            wysVar.a.addOnLayoutChangeListener(this.B);
            this.C.run();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(x0 x0Var) {
        wys wysVar = (wys) x0Var;
        super.onViewDetachedFromWindow(wysVar);
        if (wysVar instanceof co70) {
            wysVar.a.removeOnLayoutChangeListener(this.B);
            this.C.run();
        }
    }
}
