package defpackage;

import com.yandex.go.panorama.impl.GoPanoramaView;
import com.yandex.mapkit.places.panorama.ErrorListener;
import com.yandex.mapkit.places.panorama.PanoramaView;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.runtime.Error;

/* loaded from: classes13.dex */
public final class zpt implements ErrorListener {
    public final /* synthetic */ GoPanoramaView a;

    public zpt(GoPanoramaView goPanoramaView) {
        this.a = goPanoramaView;
    }

    @Override // com.yandex.mapkit.places.panorama.ErrorListener
    public final void onPanoramaOpenError(Player player, Error error) {
        PanoramaView panoView;
        GoPanoramaView goPanoramaView = this.a;
        sls onPanoramaErrorLoad = goPanoramaView.getOnPanoramaErrorLoad();
        if (onPanoramaErrorLoad != null) {
            onPanoramaErrorLoad.invoke();
        }
        panoView = goPanoramaView.getPanoView();
        panoView.getPlayer().removeErrorListener(this);
    }
}
