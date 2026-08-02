package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Pair;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class x211 extends x3 {
    public final Context c;
    public final avc0 w;

    public x211(Context context, ListItemComponent listItemComponent) {
        super(listItemComponent, jph0.transport_and_plate_layout);
        this.c = context;
        this.w = new avc0();
    }

    public final void Ug(Bitmap bitmap, String str) {
        CarIndexContainerView carIndexContainerView = (CarIndexContainerView) this.b;
        if (!y211.a.h(str)) {
            carIndexContainerView.bind((bvc0) null, new zp01(17));
            return;
        }
        String str2 = gvu0.u0(str) + "\u2009" + str.substring(1, 4) + "\u2009" + str.substring(4);
        avc0 avc0Var = this.w;
        if (jl40.l(avc0Var.b, str2)) {
            return;
        }
        int i = xng0.controlMinor;
        Context context = this.c;
        avc0Var.c = new a78(qje.t(i, context), qje.u(context.getTheme(), xng0.textOnControlMinor), gw00.e(new Pair(str2, new w68(0.03f, 16.0f, 24))));
        avc0Var.b = str2;
        bvc0 bvc0Var = new bvc0(avc0Var);
        if (bitmap != null) {
            carIndexContainerView.bind(bvc0Var, bitmap);
        } else {
            carIndexContainerView.bind(bvc0Var, new zp01(18));
        }
        carIndexContainerView.setContentDescription(str);
    }
}
