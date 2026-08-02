package defpackage;

import android.util.Log;
import android.util.Property;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes3.dex */
public final class hhj extends Property {
    public static final hhj a = new hhj(Float.TYPE, Constants.KEY_VALUE);

    @Override // android.util.Property
    public final Object get(Object obj) {
        Object d = ((dxt) obj).d();
        d.getClass();
        return Float.valueOf((float) ((Double) d).doubleValue());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        Log.i("NumberValueProperty", "set variable value: " + floatValue);
        ((dxt) obj).i(Double.valueOf((double) floatValue));
    }
}
