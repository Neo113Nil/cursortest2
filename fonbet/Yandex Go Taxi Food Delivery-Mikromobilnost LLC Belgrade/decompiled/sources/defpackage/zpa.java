package defpackage;

import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationDetailsBrickView;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final /* synthetic */ class zpa implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersStationAboutLocationView b;

    public /* synthetic */ zpa(ChargersStationAboutLocationView chargersStationAboutLocationView, int i) {
        this.a = i;
        this.b = chargersStationAboutLocationView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        g18 bindPhoto;
        zy11 bricksAdapter$lambda$0$0;
        zy11 descriptionsAdapter$lambda$0$2;
        switch (this.a) {
            case 0:
                bindPhoto = this.b.bindPhoto((GoImageView) obj, (cqa) obj2);
                return bindPhoto;
            case 1:
                bricksAdapter$lambda$0$0 = ChargersStationAboutLocationView.bricksAdapter$lambda$0$0(this.b, (ChargersStationDetailsBrickView) obj, (dqa) obj2);
                return bricksAdapter$lambda$0$0;
            default:
                descriptionsAdapter$lambda$0$2 = ChargersStationAboutLocationView.descriptionsAdapter$lambda$0$2(this.b, (RobotoTextView) obj, (dqa) obj2);
                return descriptionsAdapter$lambda$0$2;
        }
    }
}
