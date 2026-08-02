package defpackage;

import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldImeAction;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w7l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FieldImeAction.values().length];
        try {
            iArr[FieldImeAction.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FieldImeAction.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
