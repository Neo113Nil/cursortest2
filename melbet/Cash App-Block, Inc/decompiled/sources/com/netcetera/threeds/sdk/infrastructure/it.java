package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class it implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {98, 104, -90, -34, -18, -8, 15, 2, 35, -13, 35, -31, -16, -11, -2, 15, 8, 0, 30, -35, -3, 1, 21, -11, 13, 0};
    private static final int $$b = 239;
    private final setScrollCaptureCallback ThreeDS2Service;
    private final setLetterSpacing get;

    public it(setLetterSpacing setletterspacing, setScrollCaptureCallback setscrollcapturecallback) {
        this.get = setletterspacing;
        this.ThreeDS2Service = setscrollcapturecallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i * 2) + 4;
        byte[] bArr = $$a;
        int i6 = 84 - (s * 2);
        int i7 = 23 - (i2 * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 = i6 + (-i8) + 2;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i6 = i6 + (-i8) + 2;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.get, this.ThreeDS2Service};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-464187887);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(Color.argb(0, 0, 0, 0) + 47, (char) (ImageFormat.getBitsPerPixel(0) + 25645), TextUtils.getOffsetAfter("", 0) + 11489);
                byte b = $$a[17];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(View.getDefaultSize(0, 0) + 47, (char) (25644 - (Process.myPid() >> 22)), 11489 - (ViewConfiguration.getEdgeSlop() >> 16)), setScrollCaptureCallback.class);
                map.put(-464187887, obj);
            }
            ((Method) obj).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
