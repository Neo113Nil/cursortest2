package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class il implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {71, -105, PnmConstants.PBM_TEXT_CODE, -20, -7, 3, -13, 9, 6, -13, 1, -19, 19};
    private static final int $$b = 35;
    private final setLetterSpacing getWarnings;

    public il(setLetterSpacing setletterspacing) {
        this.getWarnings = setletterspacing;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = (s * 4) + 105;
        int i6 = i * 2;
        byte[] bArr2 = new byte[i6 + 10];
        int i7 = i6 + 9;
        if (bArr == null) {
            i2 = i4;
            int i8 = i7;
            i3 = 0;
            i4 = (i4 + (-i8)) - 2;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i3++;
            i8 = bArr[i2];
            i4 = (i4 + (-i8)) - 2;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i4 = i5;
            i2 = i4;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.getWarnings};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1167713146);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(47 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (25644 - Color.green(0)), 11489 - View.getDefaultSize(0, 0));
                byte b = $$a[10];
                byte b2 = (byte) (b - 1);
                byte b3 = (byte) (-b);
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(47 - ExpandableListView.getPackedPositionType(0L), (char) (Color.blue(0) + 25644), 11489 - (KeyEvent.getMaxKeyCode() >> 16)));
                map.put(1167713146, obj);
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
