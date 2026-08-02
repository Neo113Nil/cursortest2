package com.netcetera.threeds.sdk.infrastructure;

import java.util.Iterator;

/* loaded from: classes5.dex */
public class setMenu {
    private static int ThreeDS2ServiceInstance = 1;
    private static int initialize;
    private final nh get;
    private final getView getWarnings;

    public setMenu(getView getview, nh nhVar) {
        this.getWarnings = getview;
        this.get = nhVar;
    }

    public findFragmentById getWarnings(nq nqVar) {
        int i = initialize + 73;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            this.getWarnings.getWarnings().iterator();
            throw null;
        }
        findFragmentById findfragmentbyid = (findFragmentById) findFragmentById.initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
        Iterator<setCollapsible> it = this.getWarnings.getWarnings().iterator();
        while (it.hasNext()) {
            int i2 = ThreeDS2ServiceInstance;
            initialize = ((i2 & 103) + (i2 | 103)) % 128;
            findfragmentbyid.get(it.next().getWarnings(nqVar, this.get.ThreeDS2ServiceInstance()));
            int i3 = initialize;
            int i4 = (i3 | 5) << 1;
            int i5 = -(((~i3) & 5) | (i3 & (-6)));
            ThreeDS2ServiceInstance = ((i4 & i5) + (i5 | i4)) % 128;
        }
        int i6 = ThreeDS2ServiceInstance;
        int i7 = (i6 & (-120)) | ((~i6) & 119);
        int i8 = -(-((i6 & 119) << 1));
        int i9 = (i7 & i8) + (i8 | i7);
        initialize = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 25 / 0;
        }
        return findfragmentbyid;
    }
}
