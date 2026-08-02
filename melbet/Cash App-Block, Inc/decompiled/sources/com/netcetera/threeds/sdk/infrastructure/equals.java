package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class equals {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;
    private final Map<String, setCollapsible> ThreeDS2ServiceInstance = new HashMap();

    public void ThreeDS2Service(setCollapsible setcollapsible) {
        int i = initialize;
        int i2 = (-2) - (((i & 108) + (i | 108)) ^ (-1));
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        Map<String, setCollapsible> map = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            map.put(setcollapsible.ThreeDS2Service(), setcollapsible);
            throw null;
        }
        map.put(setcollapsible.ThreeDS2Service(), setcollapsible);
        int i4 = ThreeDS2Service;
        int i5 = ((((i4 ^ 113) | (i4 & 113)) << 1) - (~(-(((~i4) & 113) | (i4 & (-114)))))) - 1;
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
    }

    public List<setCollapsible> ThreeDS2ServiceInstance() {
        List<setCollapsible> unmodifiableList = Collections.unmodifiableList(new ArrayList(this.ThreeDS2ServiceInstance.values()));
        int i = ThreeDS2Service + 116;
        int i2 = (i ^ (-1)) + (i << 1);
        initialize = i2 % 128;
        if (i2 % 2 != 0) {
            return unmodifiableList;
        }
        throw null;
    }
}
