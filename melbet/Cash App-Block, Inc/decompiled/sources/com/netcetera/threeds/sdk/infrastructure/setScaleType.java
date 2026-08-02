package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public class setScaleType implements Callable {
    private static final byte[] $$a = {93, 117, 76, -7, 20, 10, -13, 0, -33, 15, -33, 33, 18, 13, 4, -13, -6, 2};
    private static final int $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    private final Object get;

    public setScaleType(Object obj) {
        this.get = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, Object[] objArr) {
        int i3;
        int i4 = 84 - (i2 * 3);
        int i5 = i * 2;
        byte[] bArr = $$a;
        int i6 = 3 - (b * 4);
        byte[] bArr2 = new byte[15 - i5];
        int i7 = 14 - i5;
        if (bArr == null) {
            int i8 = i6;
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i7;
            int i11 = i6 + i10;
            int i12 = i8;
            i4 = i11;
            i6 = i12;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i6 + 1;
            int i14 = i4;
            i8 = i13;
            i6 = bArr[i13];
            i9 = i3 + 1;
            bArr3 = bArr;
            i10 = i14;
            int i112 = i6 + i10;
            int i122 = i8;
            i4 = i112;
            i6 = i122;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        try {
            Object[] objArr = {this.get};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(315037690);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(67 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 8950 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 74, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37820), TextUtils.indexOf((CharSequence) "", '0') + 8014));
                map.put(315037690, obj);
            }
            return ((Method) obj).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
