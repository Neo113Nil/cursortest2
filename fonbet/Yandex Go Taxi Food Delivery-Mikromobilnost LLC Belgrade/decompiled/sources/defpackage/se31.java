package defpackage;

import android.view.View;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;

/* loaded from: classes6.dex */
public final /* synthetic */ class se31 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ VerticalInternalTariffView b;

    public /* synthetic */ se31(VerticalInternalTariffView verticalInternalTariffView, int i) {
        this.a = i;
        this.b = verticalInternalTariffView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 _init_$lambda$2;
        zy11 _init_$lambda$3;
        int i = this.a;
        VerticalInternalTariffView verticalInternalTariffView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$2 = VerticalInternalTariffView._init_$lambda$2(verticalInternalTariffView, (View) obj, (mr31) obj2);
                return _init_$lambda$2;
            default:
                _init_$lambda$3 = VerticalInternalTariffView._init_$lambda$3(verticalInternalTariffView, ((Integer) obj).intValue(), (mr31) obj2);
                return _init_$lambda$3;
        }
    }
}
