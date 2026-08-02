package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class in implements setScrollCaptureHint.ThreeDS2Service {
    private static final byte[] $$a = {121, 105, 114, 117, -7, 3, -13, 9, 6, -13, 1, -19, 19};
    private static final int $$b = 140;
    private final setLetterSpacing ThreeDS2ServiceInstance;
    private final replace get;

    public in(setLetterSpacing setletterspacing, replace replaceVar) {
        this.ThreeDS2ServiceInstance = setletterspacing;
        this.get = replaceVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2;
        int i3 = b3 + 4;
        int i4 = 105 - (b * 2);
        int i5 = (b2 * 4) + 10;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i3;
            i4 = (i4 + (-i3)) - 2;
            i3 = i6;
            bArr = bArr3;
            i = i2;
            int i7 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b4 = bArr[i7];
            byte[] bArr4 = bArr;
            i6 = i7;
            i3 = b4;
            bArr3 = bArr4;
            i4 = (i4 + (-i3)) - 2;
            i3 = i6;
            bArr = bArr3;
            i = i2;
            int i72 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i722 = i3 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        try {
            Object[] objArr = {this.ThreeDS2ServiceInstance, this.get};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(2124375252);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 46, (char) (View.resolveSizeAndState(0, 0, 0) + 25644), TextUtils.indexOf("", "") + 11489);
                byte b = $$a[10];
                byte b2 = (byte) (b - 1);
                Object[] objArr2 = new Object[1];
                a(b2, b2, (byte) (-b), objArr2);
                obj = cls.getDeclaredMethod((String) objArr2[0], (Class) removeParam.initialize(48 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25643), TextUtils.indexOf((CharSequence) "", '0', 0) + 11490), replace.class);
                map.put(2124375252, obj);
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
