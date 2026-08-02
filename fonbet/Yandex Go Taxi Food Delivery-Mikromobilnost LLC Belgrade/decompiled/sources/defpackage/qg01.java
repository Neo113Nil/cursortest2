package defpackage;

import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsStatusDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qg01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FundDocsStatusDto.values().length];
        try {
            iArr[FundDocsStatusDto.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FundDocsStatusDto.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
