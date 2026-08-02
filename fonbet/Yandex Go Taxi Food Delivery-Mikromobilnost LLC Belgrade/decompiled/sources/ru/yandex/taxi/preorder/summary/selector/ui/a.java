package ru.yandex.taxi.preorder.summary.selector.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.czo0;
import defpackage.elx0;
import defpackage.ffx;
import defpackage.glx0;
import defpackage.hbp0;
import defpackage.j69;
import defpackage.m810;
import defpackage.qsg0;
import defpackage.vsx0;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final class a {
    public final glx0 a;
    public final RecyclerView b;
    public final PositionLayoutManager c;
    public final vsx0 d;
    public final n0 e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final hbp0 f = new hbp0(new czo0(14), "TariffsViewPositionHandler", null);

    public a(glx0 glx0Var, RecyclerView recyclerView, PositionLayoutManager positionLayoutManager, vsx0 vsx0Var) {
        this.a = glx0Var;
        this.b = recyclerView;
        this.c = positionLayoutManager;
        this.d = vsx0Var;
    }

    public final void a() {
        hbp0 hbp0Var = this.f;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new TariffsViewPositionHandler$attach$1(this, null), 3);
    }

    public final ArrayList b() {
        glx0 glx0Var = this.a;
        int itemCount = glx0Var.getItemCount();
        ArrayList arrayList = new ArrayList(itemCount);
        for (int i = 0; i < itemCount; i++) {
            elx0 item = glx0Var.getItem(i);
            if (item != null) {
                Map map = item.t;
                String str = item.j == TariffOrderFlow.SHUTTLE_FLOW ? TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY : item.b;
                String str2 = item.a;
                View X = this.c.X(i);
                float f = 0.0f;
                if (X != null) {
                    RecyclerView recyclerView = this.b;
                    int i2 = -recyclerView.getResources().getDimensionPixelSize(qsg0.tariff_small_card_items_offset);
                    if (Math.min(recyclerView.getWidth(), X.getRight() - i2) - Math.max(0, X.getLeft() + i2) >= 0.0f) {
                        f = m810.b((r12 / (X.getWidth() - (i2 * 2))) * 100.0f) / 100.0f;
                    }
                }
                boolean z = item.u;
                arrayList.add(new j69(str, str2, f, z, ((CharSequence) map.get(Boolean.valueOf(z))) != null ? String.valueOf((CharSequence) map.get(Boolean.valueOf(item.u))) : null, !item.y));
            }
        }
        return arrayList;
    }
}
