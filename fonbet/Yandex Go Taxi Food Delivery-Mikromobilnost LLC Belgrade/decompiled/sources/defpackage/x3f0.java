package defpackage;

import com.yandex.messaging.ui.settings.privacy.PrivacyType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class x3f0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PrivacyType.values().length];
        try {
            iArr[PrivacyType.Write.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PrivacyType.Invites.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PrivacyType.Calls.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PrivacyType.OnlineStatus.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PrivacyType.Search.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
