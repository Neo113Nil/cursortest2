package app.cash.local.views.brand.orders;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class CameraViewport {
    public final LatLng target;
    public final float zoom;

    public CameraViewport(LatLng latLng, float f) {
        this.target = latLng;
        this.zoom = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraViewport)) {
            return false;
        }
        CameraViewport cameraViewport = (CameraViewport) obj;
        return this.target.equals(cameraViewport.target) && Float.compare(this.zoom, cameraViewport.zoom) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.zoom) + (this.target.hashCode() * 31);
    }

    public final String toString() {
        return "CameraViewport(target=" + this.target + ", zoom=" + this.zoom + ")";
    }
}
