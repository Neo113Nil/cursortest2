package com.plaid.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.plaid.internal.C0095a6;
import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;
import retrofit2.Response;

/* renamed from: com.plaid.internal.u6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0302u6 implements InterfaceC0214k7 {
    public final InterfaceC0178g7 a;
    public String b;

    public C0302u6(InterfaceC0178g7 interfaceC0178g7) {
        interfaceC0178g7.getClass();
        this.a = interfaceC0178g7;
    }

    @Override // com.plaid.internal.InterfaceC0214k7
    public final C0179h a(InterfaceC0205j7 interfaceC0205j7, C0251p c0251p) {
        interfaceC0205j7.getClass();
        c0251p.getClass();
        String str = this.b;
        if (str == null) {
            C0179h a = C0179h.a(new Exception("FAILURE: sessionVerificationId is null"));
            a.getClass();
            return a;
        }
        SilentNetworkAuth$LinkSNAProveStartRequest build = SilentNetworkAuth$LinkSNAProveStartRequest.newBuilder().a(interfaceC0205j7.a().a()).b(str).build();
        InterfaceC0178g7 interfaceC0178g7 = this.a;
        build.getClass();
        try {
            Response execute = interfaceC0178g7.a(build).execute();
            if (execute.rawResponse.isSuccessful) {
                SilentNetworkAuth$LinkSNAProveStartResponse silentNetworkAuth$LinkSNAProveStartResponse = (SilentNetworkAuth$LinkSNAProveStartResponse) execute.body;
                String redirectTargetUrl = silentNetworkAuth$LinkSNAProveStartResponse != null ? silentNetworkAuth$LinkSNAProveStartResponse.getRedirectTargetUrl() : null;
                if (redirectTargetUrl != null) {
                    C0095a6.a.a(C0095a6.a, "Prove Start Step success - redirectTargetUrl: ".concat(redirectTargetUrl));
                    C0179h a2 = C0179h.a(redirectTargetUrl);
                    a2.getClass();
                    return a2;
                }
            }
            Y6.a.a("Prove Start Step failure - response: " + execute);
            C0179h a3 = C0179h.a(new Exception("FAILURE: " + execute));
            a3.getClass();
            return a3;
        } catch (Exception e) {
            Y6.a.a("Prove Start Step failure - exception: " + e);
            C0179h a4 = C0179h.a(new Exception(Boxes$$ExternalSyntheticOutline1.m(e, "FAILURE: ")));
            a4.getClass();
            return a4;
        }
    }
}
