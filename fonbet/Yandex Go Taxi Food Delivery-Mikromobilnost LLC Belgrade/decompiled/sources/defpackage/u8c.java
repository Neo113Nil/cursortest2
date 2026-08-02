package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public final class u8c extends x170 {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', LicenseUtility.SEPARATOR, '$', ':', '/', '.', '+', 'A', 'B', 'C', 'D'};
    public static final int[] b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean a(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
