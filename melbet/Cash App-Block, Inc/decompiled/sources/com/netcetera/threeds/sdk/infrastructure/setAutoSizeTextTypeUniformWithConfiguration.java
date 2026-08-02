package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setAutoSizeTextTypeUniformWithConfiguration {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int ThreeDS2Service;
    private static int getWarnings;

    static {
        init$0();
        ThreeDS2Service = 0;
        getWarnings = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, Object[] objArr) {
        int i;
        byte b2;
        int i2;
        byte[] bArr = $$a;
        int i3 = 15 - (b * 4);
        ?? r6 = 4 - (s * 2);
        ?? r7 = 84 - (s2 * 2);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            byte b3 = r7;
            i2 = 0;
            byte b4 = r6;
            int i4 = r6;
            ?? r72 = b4 + b3;
            i = i4 + 1;
            b2 = r72;
            bArr2[i2] = b2;
            i2++;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b3 = bArr[i];
            int i5 = i;
            b4 = b2;
            i4 = i5;
            ?? r722 = b4 + b3;
            i = i4 + 1;
            b2 = r722;
            bArr2[i2] = b2;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i = r6;
            b2 = r7;
            i2 = 0;
            bArr2[i2] = b2;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{102, 38, -14, -96, 20, 10, -13, 0, -33, 15, -33, 33, 18, 13, 4, -13, -6, 2};
        $$b = 44;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        Context context = (Context) objArr[0];
        setMax setmax = (setMax) objArr[1];
        setHorizontalGravity sethorizontalgravity = (setHorizontalGravity) objArr[2];
        setWeightSum setweightsum = (setWeightSum) objArr[3];
        getWarnings = (ThreeDS2Service + 117) % 128;
        try {
            Object[] objArr2 = {context, setmax, sethorizontalgravity, setweightsum};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(88933999);
            if (obj == null) {
                Class cls = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 67, (char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9695);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr3 = new Object[1];
                a(b, b2, b2, objArr3);
                obj = cls.getMethod((String) objArr3[0], Context.class, setMax.class, setHorizontalGravity.class, setWeightSum.class);
                map.put(88933999, obj);
            }
            setFillViewport ThreeDS2ServiceInstance = setAutoSizeTextTypeUniformWithPresetSizes.ThreeDS2ServiceInstance((setFillViewport) ((Method) obj).invoke(null, objArr2));
            int i4 = getWarnings;
            ThreeDS2Service = ((i4 ^ 81) + ((i4 & 81) << 1)) % 128;
            return ThreeDS2ServiceInstance;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static setFillViewport initialize(Context context, setMax setmax, setHorizontalGravity sethorizontalgravity, setWeightSum setweightsum) {
        return (setFillViewport) initialize(new Object[]{context, setmax, sethorizontalgravity, setweightsum}, 1469317069, -1469317069, (int) System.currentTimeMillis());
    }
}
