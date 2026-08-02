package defpackage;

import com.yandex.go.panorama.impl.GoPanoramaView;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.PanoramaView;
import com.yandex.runtime.Error;

/* loaded from: classes13.dex */
public final class ypt implements PanoramaService.SearchListener {
    public final /* synthetic */ GoPanoramaView a;

    public ypt(GoPanoramaView goPanoramaView) {
        this.a = goPanoramaView;
    }

    @Override // com.yandex.mapkit.places.panorama.PanoramaService.SearchListener
    public final void onPanoramaSearchError(Error error) {
        g8e.A(jst.e, "Panorama search request is failed");
    }

    @Override // com.yandex.mapkit.places.panorama.PanoramaService.SearchListener
    public final void onPanoramaSearchResult(String str) {
        PanoramaView panoView;
        panoView = this.a.getPanoView();
        panoView.getPlayer().openPanorama(str);
    }
}
