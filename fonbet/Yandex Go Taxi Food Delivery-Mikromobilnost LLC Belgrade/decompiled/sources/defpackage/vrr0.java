package defpackage;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vrr0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SharingPersonalGoalsServiceName.values().length];
        try {
            iArr[SharingPersonalGoalsServiceName.SCOOTERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharingPersonalGoalsServiceName.CHARGERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharingPersonalGoalsServiceName.DRIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SharingPersonalGoalsDisplayContext.values().length];
        try {
            iArr2[SharingPersonalGoalsDisplayContext.OFFER_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SharingPersonalGoalsDisplayContext.RIDE_FINISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SharingPersonalGoalsDisplayContext.DISCOVERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
