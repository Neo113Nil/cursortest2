package defpackage;

import ru.yandex.taxi.order.map.controller.internal.Command$CommandType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class zz8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Command$CommandType.values().length];
        try {
            iArr[Command$CommandType.Add.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Command$CommandType.Update.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Command$CommandType.Remove.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
