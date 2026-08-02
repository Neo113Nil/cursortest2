package D;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0276f extends E.e {
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException(Wv.i(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i6 = 0;
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (!hashSet.contains(Integer.valueOf(i9))) {
                    strArr2[i6] = strArr[i9];
                    i6++;
                }
            }
        }
        if (activity instanceof InterfaceC0275e) {
            ((InterfaceC0275e) activity).validateRequestPermissionsRequestCode(i);
        }
        AbstractC0272b.b(activity, strArr, i);
    }

    public static boolean e(PermissionsActivity permissionsActivity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? AbstractC0274d.a(permissionsActivity, str) : i == 31 ? AbstractC0273c.b(permissionsActivity, str) : AbstractC0272b.c(permissionsActivity, str);
        }
        return false;
    }
}
