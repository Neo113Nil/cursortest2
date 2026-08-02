package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2043jv extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C2042ju A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C2043jv(C2042ju c2042ju, Map map, Map map2) {
        this.A00 = c2042ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C2030ji c2030ji;
        C1860gi c1860gi;
        C2030ji c2030ji2;
        c2030ji = this.A00.A01;
        if (!TextUtils.isEmpty(c2030ji.A7O())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1860gi = this.A00.A0A;
            VA A0A = c1860gi.A0A();
            c2030ji2 = this.A00.A01;
            A0A.AC3(c2030ji2.A7O(), hashMap);
        }
    }
}
