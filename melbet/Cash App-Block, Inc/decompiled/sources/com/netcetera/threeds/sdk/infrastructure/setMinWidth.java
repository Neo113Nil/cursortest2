package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setMinWidth {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        Context context = (Context) objArr[0];
        setItemsCanFocus setitemscanfocus = (setItemsCanFocus) objArr[1];
        setWeightSum setweightsum = (setWeightSum) objArr[2];
        try {
            Object[] objArr2 = {context, setweightsum, setitemscanfocus};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1311405292);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(65 - ImageFormat.getBitsPerPixel(0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 36452), 9570 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("ThreeDS2Service", Context.class, setWeightSum.class, setItemsCanFocus.class);
                map.put(1311405292, obj);
            }
            setMinHeight setminheight = (setMinHeight) ((Method) obj).invoke(null, objArr2);
            setIndeterminateDrawableTiled setindeterminatedrawabletiled = new setIndeterminateDrawableTiled(setweightsum, setminheight, setOverscrollFooter.ThreeDS2ServiceInstance(setminheight));
            int i4 = get;
            int i5 = i4 & 3;
            int i6 = i4 | 3;
            ThreeDS2ServiceInstance = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            return setindeterminatedrawabletiled;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static setMinHeight getWarnings(Context context, setItemsCanFocus setitemscanfocus, setWeightSum setweightsum) {
        return (setMinHeight) getWarnings(new Object[]{context, setitemscanfocus, setweightsum}, 2022403212, -2022403212, (int) System.currentTimeMillis());
    }
}
