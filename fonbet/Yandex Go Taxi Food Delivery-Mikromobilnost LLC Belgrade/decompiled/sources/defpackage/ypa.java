package defpackage;

import android.content.Context;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final /* synthetic */ class ypa implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ChargersStationAboutLocationView c;

    public /* synthetic */ ypa(Context context, ChargersStationAboutLocationView chargersStationAboutLocationView, int i) {
        this.a = i;
        this.b = context;
        this.c = chargersStationAboutLocationView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ShimmeringBar photosAdapter$lambda$0$0;
        ShimmeringBar descriptionsAdapter$lambda$0$0;
        switch (this.a) {
            case 0:
                photosAdapter$lambda$0$0 = ChargersStationAboutLocationView.photosAdapter$lambda$0$0(this.b, this.c);
                return photosAdapter$lambda$0$0;
            default:
                descriptionsAdapter$lambda$0$0 = ChargersStationAboutLocationView.descriptionsAdapter$lambda$0$0(this.b, this.c);
                return descriptionsAdapter$lambda$0$0;
        }
    }
}
