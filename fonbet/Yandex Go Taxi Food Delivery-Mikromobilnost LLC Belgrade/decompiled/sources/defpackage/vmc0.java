package defpackage;

import com.yandex.plus.core.graphql.type.PLAQUE_NOTIFICATION_POSITION;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class vmc0 implements b70 {
    public static final List a = Collections.singletonList("position");

    public static smc0 c(xdx xdxVar) {
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position;
        PLAQUE_NOTIFICATION_POSITION plaque_notification_position2 = null;
        while (xdxVar.h2(a) == 0) {
            String nextString = xdxVar.nextString();
            PLAQUE_NOTIFICATION_POSITION.Companion.getClass();
            PLAQUE_NOTIFICATION_POSITION[] values = PLAQUE_NOTIFICATION_POSITION.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    plaque_notification_position = null;
                    break;
                }
                plaque_notification_position = values[i];
                if (jl40.l(plaque_notification_position.getRawValue(), nextString)) {
                    break;
                }
                i++;
            }
            plaque_notification_position2 = plaque_notification_position == null ? PLAQUE_NOTIFICATION_POSITION.UNKNOWN__ : plaque_notification_position;
        }
        return new smc0(plaque_notification_position2);
    }
}
