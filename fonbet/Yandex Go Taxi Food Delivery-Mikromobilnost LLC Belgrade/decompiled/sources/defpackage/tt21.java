package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class tt21 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StatusAvailability.values().length];
        try {
            iArr[StatusAvailability.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatusAvailability.Away.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StatusAvailability.Busy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StatusAvailability.Dnd.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
