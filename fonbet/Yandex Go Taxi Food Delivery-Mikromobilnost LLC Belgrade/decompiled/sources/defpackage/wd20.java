package defpackage;

import ru.yandex.taxi.plus.api.dto.Action;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class wd20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action.Type.values().length];
        try {
            iArr[Action.Type.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action.Type.URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Action.Type.OPEN_TYPED_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Action.Type.SETTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Action.Type.PLUS_SDK_HOOK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Action.Type.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
