package defpackage;

import com.yandex.go.chargers.orchestrator_user_events.api.ChargersOrchestratorUserEventType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class raa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersOrchestratorUserEventType.values().length];
        try {
            iArr[ChargersOrchestratorUserEventType.DISCOVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersOrchestratorUserEventType.STATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersOrchestratorUserEventType.OFFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersOrchestratorUserEventType.ORDER_LEASING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersOrchestratorUserEventType.ORDER_FINISH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
