package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ir implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {83, 79, -10, 64, -4, -21, 23, -16, -23, -2, -1, -11, 1, -18};
    private static final int $$b = 59;
    private final setCursorVisible getWarnings;
    private final setLetterSpacing initialize;

    public ir(setLetterSpacing setletterspacing, setCursorVisible setcursorvisible) {
        this.initialize = setletterspacing;
        this.getWarnings = setcursorvisible;
    }

    private static void a(byte b, short s, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i = s * 4;
        int i2 = (s2 * 4) + 4;
        int i3 = (b * 3) + 103;
        byte[] bArr2 = new byte[i + 11];
        int i4 = i + 10;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + (-i4)) - 6;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + (-bArr[i2])) - 6;
                i2++;
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.initialize, this.getWarnings};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-42385641);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 47, (char) (25644 - ExpandableListView.getPackedPositionGroup(0L)), 11489 - (Process.myTid() >> 22));
                byte b = (byte) ($$a[12] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 47, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25644), KeyEvent.keyCodeFromString("") + 11489), setCursorVisible.class);
                map.put(-42385641, obj);
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
