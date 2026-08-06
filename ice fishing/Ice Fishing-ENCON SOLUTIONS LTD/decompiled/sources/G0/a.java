package G0;

import com.yandex.varioqub.config.FetchError;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f641a;

    static {
        int[] iArr = new int[FetchError.values().length];
        f641a = iArr;
        try {
            iArr[FetchError.REQUEST_THROTTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f641a[FetchError.EMPTY_RESULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f641a[FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f641a[FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f641a[FetchError.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f641a[FetchError.INTERNAL_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
