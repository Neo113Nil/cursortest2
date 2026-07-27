package D;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0288g extends E.e {
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (TextUtils.isEmpty(strArr[i6])) {
                throw new IllegalArgumentException(u1.h.g(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i6], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i6));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof InterfaceC0287f) {
            ((InterfaceC0287f) activity).validateRequestPermissionsRequestCode(i);
        }
        AbstractC0284c.b(activity, strArr, i);
    }

    public static boolean e(PermissionsActivity permissionsActivity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? AbstractC0286e.a(permissionsActivity, str) : i == 31 ? AbstractC0285d.b(permissionsActivity, str) : AbstractC0284c.c(permissionsActivity, str);
        }
        return false;
    }
}
