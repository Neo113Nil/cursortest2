package defpackage;

import com.yandex.messaging.sdk.MessengerInviteLinkHandleFlag;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class rnp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessengerInviteLinkHandleFlag.values().length];
        try {
            iArr[MessengerInviteLinkHandleFlag.NOT_HANDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessengerInviteLinkHandleFlag.HANDLE_ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessengerInviteLinkHandleFlag.HANDLE_CURRENT_ENVIRONMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
