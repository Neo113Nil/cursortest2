package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class iq implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {102, 38, -14, -96, 7, -3, 13, -9, -6, 13, -1, 19, -19};
    private static final int $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE;
    private final setScrollCaptureCallback ThreeDS2Service;
    private final setLetterSpacing initialize;

    public iq(setLetterSpacing setletterspacing, setScrollCaptureCallback setscrollcapturecallback) {
        this.initialize = setletterspacing;
        this.ThreeDS2Service = setscrollcapturecallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2;
        int i3 = (b * 4) + 4;
        byte[] bArr = $$a;
        int i4 = (s * 2) + 105;
        int i5 = (b2 * 3) + 10;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i4 = i5;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 2;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 2;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.initialize, this.ThreeDS2Service};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1012945024);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize((ViewConfiguration.getScrollDefaultDelay() >> 16) + 47, (char) (25644 - TextUtils.getTrimmedLength("")), 11489 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                byte b = (byte) ($$a[10] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 25644), (-16765727) - Color.rgb(0, 0, 0)), setScrollCaptureCallback.class);
                map.put(1012945024, obj);
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
