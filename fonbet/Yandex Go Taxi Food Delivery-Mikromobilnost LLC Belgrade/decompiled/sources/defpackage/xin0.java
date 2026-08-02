package defpackage;

import com.yandex.go.scooters.promotions.api.domain.model.ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority;
import com.yandex.go.scooters.promotions.api.domain.model.ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xin0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.values().length];
        try {
            iArr[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationStyle.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.values().length];
        try {
            iArr2[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.HIGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScootersPromotions$TopBannerCommunication$TopBannerCommunicationPriority.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
