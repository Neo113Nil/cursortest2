package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class is implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {3, -6, 44, 27, -20, -10, 13, 0, 33, -15, 33, -33, -18, -13, -4, 13, 6, -2};
    private static final int $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    private final setLetterSpacing get;
    private final setScrollCaptureCallback getWarnings;

    public is(setLetterSpacing setletterspacing, setScrollCaptureCallback setscrollcapturecallback) {
        this.get = setletterspacing;
        this.getWarnings = setscrollcapturecallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2;
        int i3 = 4 - (b * 2);
        int i4 = (s2 * 3) + 84;
        byte[] bArr = $$a;
        int i5 = 15 - (s * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i3;
            i4 += -i3;
            i3 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i3];
            byte[] bArr4 = bArr;
            i7 = i3;
            i3 = b2;
            i6 = i2;
            bArr3 = bArr4;
            i4 += -i3;
            i3 = i7 + 1;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.get, this.getWarnings};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1714744924);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(47 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (25644 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), KeyEvent.getDeadChar(0, 0) + 11489);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(47 - Color.argb(0, 0, 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25645), 11489 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), setScrollCaptureCallback.class);
                map.put(1714744924, obj);
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
