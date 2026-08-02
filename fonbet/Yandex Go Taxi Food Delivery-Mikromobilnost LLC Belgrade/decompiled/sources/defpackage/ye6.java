package defpackage;

import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ye6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacesMapConfig$RevealingState.values().length];
        try {
            iArr[PlacesMapConfig$RevealingState.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesMapConfig$RevealingState.ANCHORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlacesMapConfig$RevealingState.EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
