package defpackage;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.internal.dto.ResponseStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class xnk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ResponseStatus.values().length];
        try {
            iArr[ResponseStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResponseStatus.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResponseStatus.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DataWithStatusResponse.Status.values().length];
        try {
            iArr2[DataWithStatusResponse.Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DataWithStatusResponse.Status.FAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DataWithStatusResponse.Status.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
