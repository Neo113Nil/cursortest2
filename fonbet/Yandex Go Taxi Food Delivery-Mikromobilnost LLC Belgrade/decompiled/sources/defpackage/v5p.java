package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.FTTransportKind;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class v5p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FTTransportKind.values().length];
        try {
            iArr[FTTransportKind.variable.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FTTransportKind.oauth_token.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FTTransportKind.gen_uuid.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
