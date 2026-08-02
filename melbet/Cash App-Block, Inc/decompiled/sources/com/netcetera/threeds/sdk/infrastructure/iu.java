package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class iu implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {PnmConstants.PPM_RAW_CODE, 91, 76, 65, 4, 21, -23, 16, 23, 2, 1, 11, -1, 18};
    private static final int $$b = 104;
    private final setLetterSpacing ThreeDS2Service;

    public iu(setLetterSpacing setletterspacing) {
        this.ThreeDS2Service = setletterspacing;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 103 - (i2 * 4);
        int i5 = i * 2;
        int i6 = 4 - (b * 2);
        byte[] bArr2 = new byte[11 - i5];
        int i7 = 10 - i5;
        if (bArr == null) {
            int i8 = i7;
            i3 = 0;
            i4 = (i4 + i8) - 6;
            i6++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i3++;
            i4 = (i4 + i8) - 6;
            i6++;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2Service};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(727069665);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(47 - (Process.myTid() >> 22), (char) (View.combineMeasuredStates(0, 0) + 25644), 11489 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                byte b = (byte) ($$a[10] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 48, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 25644), (ViewConfiguration.getScrollBarSize() >> 8) + 11489));
                map.put(727069665, obj);
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
