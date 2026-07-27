package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2045kJ implements InterfaceC1094Mw {
    public final /* synthetic */ C1839gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2045kJ(JSONObject jSONObject, C1839gi c1839gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1839gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1094Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1094Mw
    public final Collection<String> A7p() {
        return AbstractC1095Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1094Mw
    public final EnumC1093Mv A8K() {
        return AbstractC1095Mx.A00(this.A02);
    }
}
