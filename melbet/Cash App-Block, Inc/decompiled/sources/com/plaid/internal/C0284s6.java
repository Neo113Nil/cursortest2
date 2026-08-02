package com.plaid.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.plaid.internal.Y6;
import retrofit2.Response;

/* renamed from: com.plaid.internal.s6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0284s6 implements InterfaceC0214k7 {
    public final InterfaceC0178g7 a;
    public String b;

    public C0284s6(InterfaceC0178g7 interfaceC0178g7) {
        interfaceC0178g7.getClass();
        this.a = interfaceC0178g7;
    }

    @Override // com.plaid.internal.InterfaceC0214k7
    public final C0179h a(InterfaceC0163f1 interfaceC0163f1, C0251p c0251p) {
        interfaceC0163f1.getClass();
        c0251p.getClass();
        String str = this.b;
        if (str == null) {
            C0179h a = C0179h.a(new Exception("FAILURE: sessionVerificationId is null"));
            a.getClass();
            return a;
        }
        InterfaceC0178g7 interfaceC0178g7 = this.a;
        String a2 = interfaceC0163f1.a();
        a2.getClass();
        try {
            Response execute = interfaceC0178g7.a(str, a2).execute();
            if (execute.rawResponse.isSuccessful) {
                C0179h a3 = C0179h.a(String.valueOf(execute.body));
                a3.getClass();
                return a3;
            }
            Y6.a.a("Prove Finish Step failure - response: " + execute);
            C0179h a4 = C0179h.a(new Exception("FAILURE: " + execute));
            a4.getClass();
            return a4;
        } catch (Exception e) {
            Y6.a.a("Prove Finish Step failure - exception: " + e);
            C0179h a5 = C0179h.a(new Exception(Boxes$$ExternalSyntheticOutline1.m(e, "FAILURE: ")));
            a5.getClass();
            return a5;
        }
    }
}
