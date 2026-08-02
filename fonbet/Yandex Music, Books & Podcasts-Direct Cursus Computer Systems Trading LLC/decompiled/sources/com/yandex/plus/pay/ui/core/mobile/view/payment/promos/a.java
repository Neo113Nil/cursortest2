package com.yandex.plus.pay.ui.core.mobile.view.payment.promos;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.kpn;
import defpackage.won;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a extends won {
    public final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.won
    public final void f(Rect rect, View view, RecyclerView recyclerView, kpn kpnVar) {
        rect.getClass();
        view.getClass();
        kpnVar.getClass();
        int Z = RecyclerView.Z(view);
        if (!this.a) {
            rect.bottom = Z > 0 ? -r1.k(R.dimen.pay_sdk_promo_card_overlapping, view) : 0;
        } else if (Z != 0) {
            rect.top = r1.k(R.dimen.pay_sdk_promo_card_space_tablet, view);
        }
    }
}
