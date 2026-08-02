package com.squareup.cash.instruments.backend.api;

import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BankAccountLinker$Args {
    public final String accountNumber;
    public final ClientScenario clientScenario;
    public final String flowToken;
    public final RequestContext requestContext;
    public final String routingNumber;

    public BankAccountLinker$Args(String str, String str2, RequestContext requestContext, ClientScenario clientScenario, String str3) {
        str2.getClass();
        requestContext.getClass();
        str3.getClass();
        this.routingNumber = str;
        this.accountNumber = str2;
        this.requestContext = requestContext;
        this.clientScenario = clientScenario;
        this.flowToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccountLinker$Args)) {
            return false;
        }
        BankAccountLinker$Args bankAccountLinker$Args = (BankAccountLinker$Args) obj;
        return this.routingNumber.equals(bankAccountLinker$Args.routingNumber) && Intrinsics.areEqual(this.accountNumber, bankAccountLinker$Args.accountNumber) && Intrinsics.areEqual(this.requestContext, bankAccountLinker$Args.requestContext) && this.clientScenario == bankAccountLinker$Args.clientScenario && Intrinsics.areEqual(this.flowToken, bankAccountLinker$Args.flowToken);
    }

    public final int hashCode() {
        int hashCode = (this.requestContext.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.routingNumber.hashCode() * 31, 31, this.accountNumber)) * 31;
        ClientScenario clientScenario = this.clientScenario;
        return this.flowToken.hashCode() + ((hashCode + (clientScenario == null ? 0 : clientScenario.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Args(routingNumber=", this.routingNumber, ", accountNumber=", this.accountNumber, ", requestContext=");
        m.append(this.requestContext);
        m.append(", clientScenario=");
        m.append(this.clientScenario);
        m.append(", flowToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flowToken, ")");
    }
}
