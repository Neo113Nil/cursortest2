package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ip implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {114, 64, -72, -72, 4, 21, -23, 16, 23, 2, 1, 11, -1, 18};
    private static final int $$b = 144;
    private final setLetterSpacing ThreeDS2Service;
    private final setScroller ThreeDS2ServiceInstance;

    public ip(setLetterSpacing setletterspacing, setScroller setscroller) {
        this.ThreeDS2Service = setletterspacing;
        this.ThreeDS2ServiceInstance = setscroller;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = (i2 * 3) + 4;
        int i5 = (i * 2) + 103;
        int i6 = b * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[11 - i6];
        int i7 = 10 - i6;
        if (bArr == null) {
            i5 = i7;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i4;
            i5 = (i5 + i4) - 6;
            i4 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            byte[] bArr4 = bArr;
            i9 = i4;
            i4 = b2;
            i8 = i3 + 1;
            bArr3 = bArr4;
            i5 = (i5 + i4) - 6;
            i4 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2Service, this.ThreeDS2ServiceInstance};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1839738045);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 47, (char) (25644 - KeyEvent.normalizeMetaState(0)), TextUtils.getCapsMode("", 0, 0) + 11489);
                byte b = (byte) ($$a[10] - 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 46, (char) (Color.green(0) + 25644), 11489 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1))), setScroller.class);
                map.put(-1839738045, obj);
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
