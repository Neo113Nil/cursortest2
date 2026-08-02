package defpackage;

import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewUiState$ExpansionState;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewUiState$FocusButtonState$FocusButtonMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class uvs {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[GasStationsOverviewUiState$ExpansionState.values().length];
        try {
            iArr[GasStationsOverviewUiState$ExpansionState.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GasStationsOverviewUiState$ExpansionState.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[GasStationsOverviewUiState$FocusButtonState$FocusButtonMode.values().length];
        try {
            iArr2[GasStationsOverviewUiState$FocusButtonState$FocusButtonMode.USER_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[GasStationsOverviewUiState$FocusButtonState$FocusButtonMode.ROUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
