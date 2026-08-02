package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class ca implements replace {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int[] ThreeDS2ServiceInstance = {-1637303185, -1286617305, -417871690, -1509193551, -1921134223, -1144753532, 1175290393, 54715180, 13653824, -77660723, -795827103, 140525014, 361566922, 1443188212, 653725244, 43283224, -903217918, -735728395};
    private final replace get;
    private final no getWarnings;
    private final initCause initialize;

    public ca(replace replaceVar, initCause initcause) {
        this.getWarnings = (no) nu.initialize(new Object[]{ca.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
        this.initialize = initcause;
        this.get = replaceVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 53) % 128;
        TextUtils.getOffsetAfter("", 0);
        initializeVar.ThreeDS2Service(this.initialize);
        replace replaceVar = this.get;
        if (replaceVar != null) {
            replaceVar.ThreeDS2Service(initializeVar);
            ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 35) % 128;
        }
    }

    public ca(initCause initcause) {
        this(null, initcause);
    }
}
