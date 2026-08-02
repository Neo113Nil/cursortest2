package com.squareup.cash.instruments.backend.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentVerifier$Args {
    public final String accountNumber;
    public final ClientScenario clientScenario;
    public final String flowToken;
    public final String pan;
    public final String routingNumber;

    public InstrumentVerifier$Args(String str, String str2, String str3, ClientScenario clientScenario, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.pan = str;
        this.routingNumber = str2;
        this.accountNumber = str3;
        this.clientScenario = clientScenario;
        this.flowToken = str4;
        if (str == null) {
            if (str2 == null || str3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentVerifier$Args)) {
            return false;
        }
        InstrumentVerifier$Args instrumentVerifier$Args = (InstrumentVerifier$Args) obj;
        return Intrinsics.areEqual(this.pan, instrumentVerifier$Args.pan) && Intrinsics.areEqual(this.routingNumber, instrumentVerifier$Args.routingNumber) && Intrinsics.areEqual(this.accountNumber, instrumentVerifier$Args.accountNumber) && this.clientScenario == instrumentVerifier$Args.clientScenario && Intrinsics.areEqual(this.flowToken, instrumentVerifier$Args.flowToken);
    }

    public final int hashCode() {
        String str = this.pan;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.routingNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accountNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClientScenario clientScenario = this.clientScenario;
        int hashCode4 = (hashCode3 + (clientScenario == null ? 0 : clientScenario.hashCode())) * 31;
        String str4 = this.flowToken;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Args(pan=", this.pan, ", routingNumber=", this.routingNumber, ", accountNumber=");
        m.append(this.accountNumber);
        m.append(", clientScenario=");
        m.append(this.clientScenario);
        m.append(", flowToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flowToken, ")");
    }
}
