package com.netcetera.threeds.sdk.infrastructure;

import java.security.Security;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class pg {
    private static Logger initialize = LoggerFactory.getLogger((Class<?>) pg.class);

    public static boolean ThreeDS2Service(String str, String str2) {
        Iterator<String> it = Security.getAlgorithms(str).iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }
}
