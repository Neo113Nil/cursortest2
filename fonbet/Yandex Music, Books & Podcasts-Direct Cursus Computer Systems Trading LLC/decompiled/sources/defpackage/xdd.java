package defpackage;

import ru.yandex.quasar.glagol.ResponseMessage$Status;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class xdd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ResponseMessage$Status.values().length];
        try {
            iArr[ResponseMessage$Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResponseMessage$Status.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResponseMessage$Status.UNSUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
