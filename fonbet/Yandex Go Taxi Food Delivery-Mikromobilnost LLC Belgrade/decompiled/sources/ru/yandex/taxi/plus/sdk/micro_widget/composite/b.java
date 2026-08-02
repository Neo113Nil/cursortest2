package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import android.content.Context;
import android.view.View;
import defpackage.brc0;
import defpackage.bvf0;
import defpackage.c2d0;
import defpackage.hic0;
import defpackage.hy60;
import defpackage.ike;
import defpackage.lb7;
import defpackage.ljz0;
import defpackage.pse;
import defpackage.qmc0;
import defpackage.soc0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wls;
import defpackage.xe20;
import defpackage.zy11;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.plaque.PlaqueView;

/* loaded from: classes6.dex */
public final class b {
    public final String a;
    public final xe20 b;
    public final c2d0 c;
    public final ru.yandex.taxi.plus.sdk.micro_widget.repository.a d;
    public final c0 e;
    public final tt2 f;
    public final ljz0 g;
    public final PlaqueView h;
    public ike i;
    public final hy60 j;

    public b(Context context, lb7 lb7Var, qmc0 qmc0Var, String str, xe20 xe20Var, c2d0 c2d0Var, ru.yandex.taxi.plus.sdk.micro_widget.repository.a aVar, c0 c0Var, tt2 tt2Var, ljz0 ljz0Var) {
        this.a = str;
        this.b = xe20Var;
        this.c = c2d0Var;
        this.d = aVar;
        this.e = c0Var;
        this.f = tt2Var;
        this.g = ljz0Var;
        qmc0Var.getClass();
        PlaqueView plaqueView = new PlaqueView(context, (hic0) qmc0Var.g.getValue(), lb7Var, qmc0Var.c, qmc0Var.d);
        this.h = plaqueView;
        this.j = new hy60(new wls() { // from class: ru.yandex.taxi.plus.sdk.micro_widget.composite.a
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                brc0 brc0Var = (brc0) obj2;
                String b = brc0Var.b();
                Object a = brc0Var.a();
                soc0 soc0Var = a instanceof soc0 ? (soc0) a : null;
                if (soc0Var == null) {
                    soc0Var = soc0.d;
                }
                b bVar = b.this;
                ike ikeVar = bVar.i;
                if (ikeVar != null) {
                    tje.N(ikeVar, null, null, new CompositeMicroWidgetsViewHolder$onEndStateChangeListener$1$1(bVar, b, soc0Var, null), 3);
                }
                return zy11.a;
            }
        });
        plaqueView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.plus.sdk.micro_widget.composite.CompositeMicroWidgetsViewHolder$OnStateChangeListener
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                b bVar = b.this;
                bVar.h.addPlaqueStateListener(bVar.j);
                b.this.i = bvf0.M(bvf0.b(), new pse("CompositeMicroWidgetsViewHolder"));
                b bVar2 = b.this;
                ike ikeVar = bVar2.i;
                if (ikeVar != null) {
                    tje.N(ikeVar, null, null, new CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1(bVar2, null), 3);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                b bVar = b.this;
                bVar.h.removePlaqueStateListener(bVar.j);
                ike ikeVar = b.this.i;
                if (ikeVar != null) {
                    bvf0.j(ikeVar, null);
                }
            }
        });
    }
}
