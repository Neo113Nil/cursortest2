package defpackage;

import com.yandex.go.user_session.data.model.InvalidSessionReason;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class vzq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InvalidSessionReason.values().length];
        try {
            iArr[InvalidSessionReason.NoSession.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InvalidSessionReason.MaxTtlExpired.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InvalidSessionReason.MaxTtlInactivityExpired.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InvalidSessionReason.UidChanged.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InvalidSessionReason.AppVersionChanged.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
