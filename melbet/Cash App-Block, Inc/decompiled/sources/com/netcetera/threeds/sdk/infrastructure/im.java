package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class im implements Runnable {
    private static final byte[] $$a = {5, 76, 58, -94, -7, 3, -13, 9, 6, -13, 1, -19, 19};
    private static final int $$b = 38;
    private final setLetterSpacing getWarnings;

    public im(setLetterSpacing setletterspacing) {
        this.getWarnings = setletterspacing;
    }

    private static void a(int i, int i2, short s, Object[] objArr) {
        int i3 = i2 * 3;
        int i4 = 3 - (s * 4);
        int i5 = (i * 4) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 10];
        int i6 = i3 + 9;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i5 + (-i4)) - 2;
            i4 = i4;
            bArr = bArr;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            int i9 = i4 + 1;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i5 = (i5 + (-bArr[i9])) - 2;
            i4 = i9;
            bArr = bArr3;
            i7 = i8;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        setLetterSpacing setletterspacing = this.getWarnings;
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(544757300);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(47 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (25645 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 11489);
                byte b = (byte) ($$a[10] - 1);
                byte b2 = b;
                Object[] objArr = new Object[1];
                a(b, b2, b2, objArr);
                obj = cls.getMethod((String) objArr[0], null);
                map.put(544757300, obj);
            }
            ((Method) obj).invoke(setletterspacing, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
