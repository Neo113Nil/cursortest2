package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.api.data.AutoTopupUserStatus;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class y32 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[AutoTopupUserStatus.values().length];
        try {
            iArr[AutoTopupUserStatus.NOT_REGISTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoTopupUserStatus.ANONYMOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AutoTopupUserStatus.IDENTIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AutoTopupUserStatus.KYC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AutoTopupUserStatus.KYC_EDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[AutoTopupType.values().length];
        try {
            iArr2[AutoTopupType.BALANCE_THRESHOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[AutoTopupType.UP_TO_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[SettingStatus.values().length];
        try {
            iArr3[SettingStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[SettingStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}
