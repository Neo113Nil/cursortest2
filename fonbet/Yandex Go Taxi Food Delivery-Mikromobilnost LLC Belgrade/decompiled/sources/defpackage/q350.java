package defpackage;

import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Action;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Reason;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Service;
import com.yandex.go.messenger_native.api.NativeMessengerAnalyticsFacade$Status;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class q350 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[NativeMessengerAnalyticsFacade$Service.values().length];
        try {
            iArr[NativeMessengerAnalyticsFacade$Service.TAXI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeMessengerAnalyticsFacade$Service.MARKETPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[NativeMessengerAnalyticsFacade$Reason.values().length];
        try {
            iArr2[NativeMessengerAnalyticsFacade$Reason.CLOSE_TAPPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NativeMessengerAnalyticsFacade$Reason.STATUS_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NativeMessengerAnalyticsFacade$Reason.OTHER_CHAT_OPENED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NativeMessengerAnalyticsFacade$Reason.BACK_PRESSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[NativeMessengerAnalyticsFacade$Reason.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[NativeMessengerAnalyticsFacade$Action.values().length];
        try {
            iArr3[NativeMessengerAnalyticsFacade$Action.CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[NativeMessengerAnalyticsFacade$Status.values().length];
        try {
            iArr4[NativeMessengerAnalyticsFacade$Status.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[NativeMessengerAnalyticsFacade$Status.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
