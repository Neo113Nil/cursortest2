package defpackage;

import com.yandex.go.taxi.summary.shared.promo.models.NotificationTrail$Switch$ClickPolicy;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wqf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NotificationTrail$Switch$ClickPolicy.values().length];
        try {
            iArr[NotificationTrail$Switch$ClickPolicy.SWITCH_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NotificationTrail$Switch$ClickPolicy.INDEPENDENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NotificationTrail$Switch$ClickPolicy.BODY_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
