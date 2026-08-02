package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class io implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {PnmConstants.PPM_RAW_CODE, 9, 122, 120, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0};
    private static final int $$b = EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE;
    private final setLetterSpacing ThreeDS2Service;
    private final setAllCaps initialize;

    public io(setLetterSpacing setletterspacing, setAllCaps setallcaps) {
        this.ThreeDS2Service = setletterspacing;
        this.initialize = setallcaps;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6;
        int i7 = (i3 * 4) + 4;
        byte[] bArr = $$a;
        int i8 = 23 - (i * 3);
        int i9 = (i2 * 4) + 84;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i10 = i8;
            i4 = i7;
            i6 = 0;
            i7 = i7 + i10 + 2;
            i4++;
            i5 = i6;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i7;
            if (i6 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i10 = bArr[i4];
            i7 = i7 + i10 + 2;
            i4++;
            i5 = i6;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i7;
            if (i6 == i8) {
            }
        } else {
            i7 = i9;
            i4 = i7;
            i5 = 0;
            i6 = i5 + 1;
            bArr2[i5] = (byte) i7;
            if (i6 == i8) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2Service, this.initialize};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1515473963);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 47, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 25644), 11488 - ImageFormat.getBitsPerPixel(0));
                byte b = $$a[17];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(47 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (25643 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.MeasureSpec.getSize(0) + 11489), setAllCaps.class);
                map.put(-1515473963, obj);
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
