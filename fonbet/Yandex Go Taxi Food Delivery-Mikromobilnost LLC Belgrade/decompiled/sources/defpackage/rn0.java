package defpackage;

import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class rn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.values().length];
        try {
            iArr[AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.POINT_A.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.POINT_B.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
