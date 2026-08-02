package defpackage;

import com.ybsdk.feature.savings.internal.network.dto.FundRequestStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ups {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FundRequestStatusDto.values().length];
        try {
            iArr[FundRequestStatusDto.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FundRequestStatusDto.READY_FOR_OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FundRequestStatusDto.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FundRequestStatusDto.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
