package com.squareup.cash.onboarding.util;

import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AliasVerifier$Args {
    public final String alias;
    public final AliasType aliasType;
    public final ClientScenario clientScenario;
    public final String code;
    public final String flowToken;
    public final RequestContext requestContext;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class AliasType {
        public static final /* synthetic */ AliasType[] $VALUES;
        public static final AliasType EMAIL;
        public static final AliasType SMS;

        static {
            AliasType aliasType = new AliasType("SMS", 0);
            SMS = aliasType;
            AliasType aliasType2 = new AliasType("EMAIL", 1);
            EMAIL = aliasType2;
            $VALUES = new AliasType[]{aliasType, aliasType2};
        }

        public static AliasType valueOf(String str) {
            return (AliasType) Enum.valueOf(AliasType.class, str);
        }

        public static AliasType[] values() {
            return (AliasType[]) $VALUES.clone();
        }
    }

    public AliasVerifier$Args(String str, AliasType aliasType, String str2, RequestContext requestContext, ClientScenario clientScenario, String str3) {
        str.getClass();
        str2.getClass();
        requestContext.getClass();
        str3.getClass();
        this.alias = str;
        this.aliasType = aliasType;
        this.code = str2;
        this.requestContext = requestContext;
        this.clientScenario = clientScenario;
        this.flowToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasVerifier$Args)) {
            return false;
        }
        AliasVerifier$Args aliasVerifier$Args = (AliasVerifier$Args) obj;
        return Intrinsics.areEqual(this.alias, aliasVerifier$Args.alias) && this.aliasType == aliasVerifier$Args.aliasType && Intrinsics.areEqual(this.code, aliasVerifier$Args.code) && Intrinsics.areEqual(this.requestContext, aliasVerifier$Args.requestContext) && this.clientScenario == aliasVerifier$Args.clientScenario && Intrinsics.areEqual(this.flowToken, aliasVerifier$Args.flowToken);
    }

    public final int hashCode() {
        int hashCode = (this.requestContext.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.aliasType.hashCode() + (this.alias.hashCode() * 31)) * 31, 31, this.code)) * 31;
        ClientScenario clientScenario = this.clientScenario;
        return this.flowToken.hashCode() + ((hashCode + (clientScenario == null ? 0 : clientScenario.hashCode())) * 31);
    }

    public final String toString() {
        return "Args(alias=" + this.alias + ", aliasType=" + this.aliasType + ", code=" + this.code + ", requestContext=" + this.requestContext + ", clientScenario=" + this.clientScenario + ", flowToken=" + this.flowToken + ")";
    }
}
