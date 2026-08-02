package com.squareup.cash.cdf.account;

import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountRecoveryStart implements Event {
    public static final zzc Companion = new zzc(14);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final Entrypoint entry_point;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Entrypoint {
        public static final /* synthetic */ Entrypoint[] $VALUES;
        public static final Entrypoint ALIAS_ENTRY;
        public static final Entrypoint ALIAS_ENTRY_HELPITEM;
        public static final Entrypoint ALIAS_PICKER;
        public static final Entrypoint ALIAS_VERIFY;

        static {
            Entrypoint entrypoint = new Entrypoint("ALIAS_PICKER", 0);
            ALIAS_PICKER = entrypoint;
            Entrypoint entrypoint2 = new Entrypoint("ALIAS_VERIFY", 1);
            ALIAS_VERIFY = entrypoint2;
            Entrypoint entrypoint3 = new Entrypoint("ALIAS_ENTRY", 2);
            ALIAS_ENTRY = entrypoint3;
            Entrypoint entrypoint4 = new Entrypoint("ALIAS_ENTRY_HELPITEM", 3);
            ALIAS_ENTRY_HELPITEM = entrypoint4;
            $VALUES = new Entrypoint[]{entrypoint, entrypoint2, entrypoint3, entrypoint4};
        }

        public static Entrypoint valueOf(String str) {
            return (Entrypoint) Enum.valueOf(Entrypoint.class, str);
        }

        public static Entrypoint[] values() {
            return (Entrypoint[]) $VALUES.clone();
        }
    }

    public AccountRecoveryStart(String str, Entrypoint entrypoint, String str2) {
        this.client_scenario = str;
        this.entry_point = entrypoint;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Account", "cdf_action", "Recovery");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "entry_point", entrypoint);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountRecoveryStart)) {
            return false;
        }
        AccountRecoveryStart accountRecoveryStart = (AccountRecoveryStart) obj;
        return Intrinsics.areEqual(this.client_scenario, accountRecoveryStart.client_scenario) && this.entry_point == accountRecoveryStart.entry_point && Intrinsics.areEqual(this.flow_token, accountRecoveryStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Recovery Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (this.entry_point.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.flow_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountRecoveryStart(client_scenario=");
        sb.append(this.client_scenario);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
