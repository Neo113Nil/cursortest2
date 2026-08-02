package defpackage;

import com.yandex.delivery.mapper.model.ForwardingId;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ty31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ForwardingId.values().length];
        try {
            iArr[ForwardingId.PERFORMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ForwardingId.INAPP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
