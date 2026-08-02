package com.squareup.cash.onboarding.util;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AliasRegistrar$Args {
    public final String accountToken;
    public final String alias;
    public final ClientScenario clientScenario;
    public final DeliveryMechanism deliveryMechanism;
    public final String flowToken;
    public final boolean prefilledFromPhone;
    public final RequestContext requestContext;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class DeliveryMechanism {
        public static final /* synthetic */ DeliveryMechanism[] $VALUES;
        public static final DeliveryMechanism EMAIL;
        public static final DeliveryMechanism SMS;
        public static final DeliveryMechanism VOICE;

        static {
            DeliveryMechanism deliveryMechanism = new DeliveryMechanism("SMS", 0);
            SMS = deliveryMechanism;
            DeliveryMechanism deliveryMechanism2 = new DeliveryMechanism("EMAIL", 1);
            EMAIL = deliveryMechanism2;
            DeliveryMechanism deliveryMechanism3 = new DeliveryMechanism("VOICE", 2);
            VOICE = deliveryMechanism3;
            $VALUES = new DeliveryMechanism[]{deliveryMechanism, deliveryMechanism2, deliveryMechanism3};
        }

        public static DeliveryMechanism valueOf(String str) {
            return (DeliveryMechanism) Enum.valueOf(DeliveryMechanism.class, str);
        }

        public static DeliveryMechanism[] values() {
            return (DeliveryMechanism[]) $VALUES.clone();
        }
    }

    public AliasRegistrar$Args(String str, DeliveryMechanism deliveryMechanism, RequestContext requestContext, ClientScenario clientScenario, String str2, boolean z, String str3, int i) {
        z = (i & 32) != 0 ? false : z;
        str3 = (i & 64) != 0 ? null : str3;
        str.getClass();
        deliveryMechanism.getClass();
        requestContext.getClass();
        str2.getClass();
        this.alias = str;
        this.deliveryMechanism = deliveryMechanism;
        this.requestContext = requestContext;
        this.clientScenario = clientScenario;
        this.flowToken = str2;
        this.prefilledFromPhone = z;
        this.accountToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasRegistrar$Args)) {
            return false;
        }
        AliasRegistrar$Args aliasRegistrar$Args = (AliasRegistrar$Args) obj;
        return Intrinsics.areEqual(this.alias, aliasRegistrar$Args.alias) && this.deliveryMechanism == aliasRegistrar$Args.deliveryMechanism && Intrinsics.areEqual(this.requestContext, aliasRegistrar$Args.requestContext) && this.clientScenario == aliasRegistrar$Args.clientScenario && Intrinsics.areEqual(this.flowToken, aliasRegistrar$Args.flowToken) && this.prefilledFromPhone == aliasRegistrar$Args.prefilledFromPhone && Intrinsics.areEqual(this.accountToken, aliasRegistrar$Args.accountToken);
    }

    public final String getAccountToken() {
        return this.accountToken;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final ClientScenario getClientScenario() {
        return this.clientScenario;
    }

    public final DeliveryMechanism getDeliveryMechanism() {
        return this.deliveryMechanism;
    }

    public final String getFlowToken() {
        return this.flowToken;
    }

    public final boolean getPrefilledFromPhone() {
        return this.prefilledFromPhone;
    }

    public final RequestContext getRequestContext() {
        return this.requestContext;
    }

    public final int hashCode() {
        int hashCode = (this.requestContext.hashCode() + ((this.deliveryMechanism.hashCode() + (this.alias.hashCode() * 31)) * 31)) * 31;
        ClientScenario clientScenario = this.clientScenario;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (clientScenario == null ? 0 : clientScenario.hashCode())) * 31, 31, this.flowToken), 31, this.prefilledFromPhone);
        String str = this.accountToken;
        return m + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Args(alias=");
        sb.append(this.alias);
        sb.append(", deliveryMechanism=");
        sb.append(this.deliveryMechanism);
        sb.append(", requestContext=");
        sb.append(this.requestContext);
        sb.append(", clientScenario=");
        sb.append(this.clientScenario);
        sb.append(", flowToken=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.flowToken, ", prefilledFromPhone=", this.prefilledFromPhone, ", accountToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accountToken, ")");
    }
}
