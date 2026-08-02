package app.cash.local.views.brand.orders;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class LatLngSet {
    public final LatLng latLng;

    /* renamed from: type, reason: collision with root package name */
    public final MarkerType f923type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MarkerType {
        public static final /* synthetic */ MarkerType[] $VALUES;
        public static final MarkerType BRAND;
        public static final MarkerType DELIVERY;
        public static final MarkerType DRIVER;

        static {
            MarkerType markerType = new MarkerType("DELIVERY", 0);
            DELIVERY = markerType;
            MarkerType markerType2 = new MarkerType("DRIVER", 1);
            DRIVER = markerType2;
            MarkerType markerType3 = new MarkerType("BRAND", 2);
            BRAND = markerType3;
            $VALUES = new MarkerType[]{markerType, markerType2, markerType3};
        }

        public static MarkerType valueOf(String str) {
            return (MarkerType) Enum.valueOf(MarkerType.class, str);
        }

        public static MarkerType[] values() {
            return (MarkerType[]) $VALUES.clone();
        }
    }

    public LatLngSet(LatLng latLng, MarkerType markerType) {
        this.latLng = latLng;
        this.f923type = markerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngSet)) {
            return false;
        }
        LatLngSet latLngSet = (LatLngSet) obj;
        return this.latLng.equals(latLngSet.latLng) && this.f923type == latLngSet.f923type;
    }

    public final int hashCode() {
        return this.f923type.hashCode() + (this.latLng.hashCode() * 31);
    }

    public final String toString() {
        return "LatLngSet(latLng=" + this.latLng + ", type=" + this.f923type + ")";
    }
}
