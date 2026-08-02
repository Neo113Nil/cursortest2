package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2066kJ implements InterfaceC1115Mw {
    public final /* synthetic */ C1860gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2066kJ(JSONObject jSONObject, C1860gi c1860gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1860gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1115Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1115Mw
    public final Collection<String> A7p() {
        return AbstractC1116Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1115Mw
    public final EnumC1114Mv A8K() {
        return AbstractC1116Mx.A00(this.A02);
    }
}
