package defpackage;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class erh {
    public abstract void onRouteChanged(krh krhVar, irh irhVar);

    public void onRouteSelected(@NonNull krh krhVar, @NonNull irh irhVar, int i) {
        onRouteSelected(krhVar, irhVar);
    }

    public void onRouteUnselected(@NonNull krh krhVar, @NonNull irh irhVar, int i) {
        onRouteUnselected(krhVar, irhVar);
    }

    public void onRouteSelected(krh krhVar, irh irhVar) {
    }

    public void onRouteUnselected(krh krhVar, irh irhVar) {
    }

    public void onRouteSelected(@NonNull krh krhVar, @NonNull irh irhVar, int i, @NonNull irh irhVar2) {
        onRouteSelected(krhVar, irhVar, i);
    }

    public void onProviderAdded(krh krhVar, hrh hrhVar) {
    }

    public void onProviderChanged(krh krhVar, hrh hrhVar) {
    }

    public void onProviderRemoved(krh krhVar, hrh hrhVar) {
    }

    public void onRouteAdded(krh krhVar, irh irhVar) {
    }

    public void onRoutePresentationDisplayChanged(@NonNull krh krhVar, @NonNull irh irhVar) {
    }

    public void onRouteRemoved(krh krhVar, irh irhVar) {
    }

    public void onRouteVolumeChanged(@NonNull krh krhVar, @NonNull irh irhVar) {
    }

    public void onRouterParamsChanged(@NonNull krh krhVar, mrh mrhVar) {
    }
}
