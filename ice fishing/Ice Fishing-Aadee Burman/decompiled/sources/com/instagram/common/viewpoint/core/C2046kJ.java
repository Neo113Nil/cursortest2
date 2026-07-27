package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2046kJ implements InterfaceC1095Mw {
    public final /* synthetic */ C1840gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2046kJ(JSONObject jSONObject, C1840gi c1840gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1840gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1095Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1095Mw
    public final Collection<String> A7p() {
        return AbstractC1096Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1095Mw
    public final EnumC1094Mv A8K() {
        return AbstractC1096Mx.A00(this.A02);
    }
}
