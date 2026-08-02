package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public class qw extends SecretKeySpec {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ThreeDS2Service = 21053;
    private static char ThreeDS2ServiceInstance = 54700;
    private static char get = 52508;
    private static int getSDKVersion = 1;
    private static char getWarnings = 16485;
    private static int initialize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qw(byte[] bArr) {
        super(bArr, ((String) r1[0]).intern());
        Object[] objArr = new Object[1];
        a("쫲\udcb6柭郻", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr);
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2;
        $11 = ($10 + 91) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr = new char[charArray.length];
        int i3 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i4 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i5 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            cArr2[i3] = charArray[i5];
            char c = 1;
            cArr2[1] = charArray[i5 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                $11 = ($10 + 45) % 128;
                char c2 = cArr2[c];
                char c3 = cArr2[i3];
                char c4 = c;
                int i8 = i4;
                char[] cArr3 = cArr2;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (getWarnings ^ (-1730380012335540218L))));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(get);
                    objArr2[i8] = Integer.valueOf(i10);
                    objArr2[c4] = Integer.valueOf(i9);
                    objArr2[i3] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        i2 = i3;
                    } else {
                        i2 = i3;
                        obj = ((Class) removeParam.initialize((-16777149) - Color.rgb(i3, i3, i3), (char) (Color.green(i3) + 62396), 5353 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr3[c4] = charValue;
                    char c5 = cArr3[i2];
                    int i11 = i6;
                    int i12 = (charValue + i6) ^ ((charValue << 4) + ((char) (ThreeDS2Service ^ (-1730380012335540218L))));
                    int i13 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(ThreeDS2ServiceInstance);
                    objArr3[i8] = Integer.valueOf(i13);
                    objArr3[c4] = Integer.valueOf(i12);
                    objArr3[i2] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(Color.alpha(i2) + 67, (char) (62397 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), View.MeasureSpec.getMode(i2) + 5352)).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr3[i2] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i6 = i11 - 40503;
                    i7++;
                    c = c4;
                    i4 = i8;
                    cArr2 = cArr3;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i14 = i3;
            int i15 = i4;
            char[] cArr4 = cArr2;
            char c6 = c;
            int i16 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr[i16] = cArr4[i14];
            cArr[i16 + 1] = cArr4[c6];
            Object[] objArr4 = new Object[i15];
            objArr4[c6] = configurationBuilder;
            objArr4[i14] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 54, (char) (39910 - View.getDefaultSize(i14, i14)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7059)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i4 = i15;
            cArr2 = cArr4;
            i3 = 0;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rf.get(getEncoded().length));
        sb.append(" bit ");
        Object[] objArr = new Object[1];
        a("쫲\udcb6柭郻", 3 - View.resolveSizeAndState(0, 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(" key");
        String sb2 = sb.toString();
        int i = getSDKVersion + 53;
        initialize = i % 128;
        if (i % 2 == 0) {
            return sb2;
        }
        throw null;
    }
}
