package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class qe8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[YbCardStatusEntity.values().length];
        try {
            iArr[YbCardStatusEntity.BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YbCardStatusEntity.REISSUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SamsungPayState.InitializationResult.values().length];
        try {
            iArr2[SamsungPayState.InitializationResult.NEED_UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SamsungPayState.InitializationResult.NEED_ACTIVATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SamsungPayState.InitializationResult.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SamsungPayState.InitializationResult.NOT_SUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
