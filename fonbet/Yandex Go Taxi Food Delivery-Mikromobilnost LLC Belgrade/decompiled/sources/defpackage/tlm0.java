package defpackage;

import com.yandex.mobile.drive.scan.ScanMode$DriverLicense$LicenseSide;
import com.yandex.mobile.drive.scan.ScanMode$Passport$PassportPage;
import com.yandex.mobile.drive.scan.ScanMode$Selfie$SelfieWith;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class tlm0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ScanMode$DriverLicense$LicenseSide.values().length];
        try {
            iArr[ScanMode$DriverLicense$LicenseSide.Front.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanMode$DriverLicense$LicenseSide.Back.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScanMode$Passport$PassportPage.values().length];
        try {
            iArr2[ScanMode$Passport$PassportPage.Bio.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScanMode$Passport$PassportPage.Registration.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ScanMode$Selfie$SelfieWith.values().length];
        try {
            iArr3[ScanMode$Selfie$SelfieWith.License.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ScanMode$Selfie$SelfieWith.Passport.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
