package a3;

import android.os.Build;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4334a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0.charAt(0) <= 'Z') goto L15;
     */
    static {
        int i = Build.VERSION.SDK_INT;
        int i6 = 33554432;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() == 1) {
                    if (str.charAt(0) >= 'S') {
                    }
                }
            }
            i6 = 0;
        }
        f4334a = i6;
    }
}
