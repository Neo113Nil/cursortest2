package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.model.OffersErrorReason;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTicketType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class yc31 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OffersErrorReason.values().length];
        try {
            iArr[OffersErrorReason.TransportLoadingError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OffersErrorReason.RouteStatsLoadingError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OffersErrorReason.HubLoadingError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[FooterTicketType.values().length];
        try {
            iArr2[FooterTicketType.MASSTRANSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FooterTicketType.AEROEXPRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FooterTicketType.SUBURBAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[FooterTicketType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
