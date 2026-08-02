package com.netcetera.threeds.sdk.infrastructure;

import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class cl implements replace {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int cleanup;
    private final getVersion ThreeDS2Service;
    private final no get = (no) nu.initialize(new Object[]{cl.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final replace initialize;

    public cl(replace replaceVar, getVersion getversion) {
        this.initialize = replaceVar;
        this.ThreeDS2Service = getversion;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        int i = ThreeDS2ServiceInitializationCallback + 103;
        cleanup = i % 128;
        long j = i % 2 != 0 ? 1L : 0L;
        ExpandableListView.getPackedPositionChild(j);
        ExpandableListView.getPackedPositionType(j);
        initializeVar.get(this.ThreeDS2Service);
        this.initialize.ThreeDS2Service(initializeVar);
    }
}
