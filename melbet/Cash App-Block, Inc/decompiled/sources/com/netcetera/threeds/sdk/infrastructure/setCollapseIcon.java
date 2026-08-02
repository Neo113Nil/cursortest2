package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class setCollapseIcon implements setSubtitle<List<setTextIsSelectable>, ns> {
    private static int ThreeDS2Service = 1;
    private static int get;

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitle
    public /* synthetic */ List<setTextIsSelectable> ThreeDS2ServiceInstance(ns nsVar) {
        int i = ThreeDS2Service;
        int i2 = (i & (-70)) | ((~i) & 69);
        int i3 = -(-((i & 69) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        int i5 = i4 % 2;
        List<setTextIsSelectable> list = get(nsVar);
        if (i5 != 0) {
            int i6 = 20 / 0;
        }
        return list;
    }

    public List<setTextIsSelectable> get(ns nsVar) {
        ArrayList arrayList = new ArrayList();
        int i = get;
        int i2 = i & 87;
        int i3 = i | 87;
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        int i4 = 0;
        while (i4 < nsVar.getWarnings()) {
            int i5 = ThreeDS2Service;
            int i6 = ((i5 ^ 73) - (~(-(-((i5 & 73) << 1))))) - 1;
            get = i6 % 128;
            if (i6 % 2 != 0) {
                nsVar.ThreeDS2Service(i4);
                throw null;
            }
            Object ThreeDS2Service2 = nsVar.ThreeDS2Service(i4);
            if (ThreeDS2Service2 instanceof JSONObject) {
                nq initialize = nq.initialize((JSONObject) ThreeDS2Service2);
                Iterator<String> it = initialize.get();
                int i7 = get;
                ThreeDS2Service = ((i7 & 63) + (i7 | 63)) % 128;
                while (it.hasNext()) {
                    String next = it.next();
                    arrayList.add(new setTextIsSelectable(next, initialize.initialize(next)));
                    int i8 = ThreeDS2Service;
                    get = (((i8 | 61) << 1) - (i8 ^ 61)) % 128;
                }
            }
            int i9 = (i4 & 6) + (i4 | 6);
            int i10 = (i9 ^ (-1)) + (i9 << 1);
            i4 = (-2) - (((i10 ^ (-3)) + ((i10 & (-3)) << 1)) ^ (-1));
            int i11 = get;
            int i12 = ((i11 ^ 35) | (i11 & 35)) << 1;
            int i13 = -(((~i11) & 35) | (i11 & (-36)));
            ThreeDS2Service = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        }
        int i14 = ThreeDS2Service;
        get = ((i14 & 93) + (i14 | 93)) % 128;
        return arrayList;
    }
}
