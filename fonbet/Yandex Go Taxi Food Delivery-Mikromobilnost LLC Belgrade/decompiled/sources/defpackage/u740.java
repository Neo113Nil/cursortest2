package defpackage;

import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketOrderAction;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketTappedButtonName;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class u740 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[MtTicketActivationType.values().length];
        try {
            iArr[MtTicketActivationType.QR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtTicketActivationType.NFC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[MtTicketOrderAction.values().length];
        try {
            iArr2[MtTicketOrderAction.Scroll.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MtTicketOrderAction.TicketPaging.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MtTicketOrderAction.Deeplink.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MtTicketOrderAction.CopyToClipboard.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MtTicketOrderAction.Update.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[MtTicketTappedButtonName.values().length];
        try {
            iArr3[MtTicketTappedButtonName.NameRoute.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[MtTicketTappedButtonName.VisualCode.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[MtTicketTappedButtonName.HowActivate.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[MtTicketTappedButtonName.Activate.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
