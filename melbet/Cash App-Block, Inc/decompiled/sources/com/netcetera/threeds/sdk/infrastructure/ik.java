package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ik implements Runnable {
    private static final byte[] $$a = {75, 5, 106, -89, -8, 9};
    private static final int $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE;
    private final setLetterSpacing getWarnings;

    public ik(setLetterSpacing setletterspacing) {
        this.getWarnings = setletterspacing;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = 103 - (i2 * 2);
        int i5 = s * 3;
        int i6 = (i * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[3 - i5];
        int i7 = 2 - i5;
        if (bArr == null) {
            int i8 = i6;
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i7;
            int i11 = i10 + i6;
            i6 = i8 + 1;
            i4 = i11 + 6;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i8 = i6;
            i6 = bArr[i6];
            bArr3 = bArr;
            i10 = i12;
            int i112 = i10 + i6;
            i6 = i8 + 1;
            i4 = i112 + 6;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Object[] objArr = {this.getWarnings};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1890286152);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(46 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (25644 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11489);
                Object[] objArr2 = new Object[1];
                a((short) 0, 0, 0, objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(47 - TextUtils.indexOf("", ""), (char) (25644 - (Process.myTid() >> 22)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11489));
                map.put(-1890286152, obj);
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
