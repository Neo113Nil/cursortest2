package com.squareup.cash.db2;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import dev.zacsweers.metro.Provider;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OfflineConfig {
    public final StatusResult attempted_add_cash_status_result;
    public final StatusResult attempted_bill_status_result;
    public final StatusResult attempted_cash_out_status_result;
    public final StatusResult attempted_payment_status_result;
    public final boolean enabled;
    public final StatusResult error_add_cash_status_result;
    public final StatusResult error_cash_out_status_result;
    public final ScenarioPlan error_transfer_scenario_plan;
    public final String external_status_url;
    public final StatusResult offline_add_cash_status_result;
    public final StatusResult offline_bill_status_result;
    public final StatusResult offline_cash_out_status_result;
    public final StatusResult offline_payment_status_result;
    public final ScenarioPlan offline_transfer_scenario_plan;
    public final List retry_intervals;

    public OfflineConfig(boolean z, String str, StatusResult statusResult, StatusResult statusResult2, StatusResult statusResult3, StatusResult statusResult4, StatusResult statusResult5, StatusResult statusResult6, StatusResult statusResult7, StatusResult statusResult8, List list, StatusResult statusResult9, StatusResult statusResult10, ScenarioPlan scenarioPlan, ScenarioPlan scenarioPlan2) {
        this.enabled = z;
        this.external_status_url = str;
        this.attempted_payment_status_result = statusResult;
        this.offline_payment_status_result = statusResult2;
        this.attempted_bill_status_result = statusResult3;
        this.offline_bill_status_result = statusResult4;
        this.attempted_cash_out_status_result = statusResult5;
        this.offline_cash_out_status_result = statusResult6;
        this.attempted_add_cash_status_result = statusResult7;
        this.offline_add_cash_status_result = statusResult8;
        this.retry_intervals = list;
        this.error_cash_out_status_result = statusResult9;
        this.error_add_cash_status_result = statusResult10;
        this.offline_transfer_scenario_plan = scenarioPlan;
        this.error_transfer_scenario_plan = scenarioPlan2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineConfig)) {
            return false;
        }
        OfflineConfig offlineConfig = (OfflineConfig) obj;
        return this.enabled == offlineConfig.enabled && Intrinsics.areEqual(this.external_status_url, offlineConfig.external_status_url) && Intrinsics.areEqual(this.attempted_payment_status_result, offlineConfig.attempted_payment_status_result) && Intrinsics.areEqual(this.offline_payment_status_result, offlineConfig.offline_payment_status_result) && Intrinsics.areEqual(this.attempted_bill_status_result, offlineConfig.attempted_bill_status_result) && Intrinsics.areEqual(this.offline_bill_status_result, offlineConfig.offline_bill_status_result) && Intrinsics.areEqual(this.attempted_cash_out_status_result, offlineConfig.attempted_cash_out_status_result) && Intrinsics.areEqual(this.offline_cash_out_status_result, offlineConfig.offline_cash_out_status_result) && Intrinsics.areEqual(this.attempted_add_cash_status_result, offlineConfig.attempted_add_cash_status_result) && Intrinsics.areEqual(this.offline_add_cash_status_result, offlineConfig.offline_add_cash_status_result) && Intrinsics.areEqual(this.retry_intervals, offlineConfig.retry_intervals) && Intrinsics.areEqual(this.error_cash_out_status_result, offlineConfig.error_cash_out_status_result) && Intrinsics.areEqual(this.error_add_cash_status_result, offlineConfig.error_add_cash_status_result) && Intrinsics.areEqual(this.offline_transfer_scenario_plan, offlineConfig.offline_transfer_scenario_plan) && Intrinsics.areEqual(this.error_transfer_scenario_plan, offlineConfig.error_transfer_scenario_plan);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        String str = this.external_status_url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StatusResult statusResult = this.attempted_payment_status_result;
        int hashCode3 = (hashCode2 + (statusResult == null ? 0 : statusResult.hashCode())) * 31;
        StatusResult statusResult2 = this.offline_payment_status_result;
        int hashCode4 = (hashCode3 + (statusResult2 == null ? 0 : statusResult2.hashCode())) * 31;
        StatusResult statusResult3 = this.attempted_bill_status_result;
        int hashCode5 = (hashCode4 + (statusResult3 == null ? 0 : statusResult3.hashCode())) * 31;
        StatusResult statusResult4 = this.offline_bill_status_result;
        int hashCode6 = (hashCode5 + (statusResult4 == null ? 0 : statusResult4.hashCode())) * 31;
        StatusResult statusResult5 = this.attempted_cash_out_status_result;
        int hashCode7 = (hashCode6 + (statusResult5 == null ? 0 : statusResult5.hashCode())) * 31;
        StatusResult statusResult6 = this.offline_cash_out_status_result;
        int hashCode8 = (hashCode7 + (statusResult6 == null ? 0 : statusResult6.hashCode())) * 31;
        StatusResult statusResult7 = this.attempted_add_cash_status_result;
        int hashCode9 = (hashCode8 + (statusResult7 == null ? 0 : statusResult7.hashCode())) * 31;
        StatusResult statusResult8 = this.offline_add_cash_status_result;
        int hashCode10 = (hashCode9 + (statusResult8 == null ? 0 : statusResult8.hashCode())) * 31;
        List list = this.retry_intervals;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        StatusResult statusResult9 = this.error_cash_out_status_result;
        int hashCode12 = (hashCode11 + (statusResult9 == null ? 0 : statusResult9.hashCode())) * 31;
        StatusResult statusResult10 = this.error_add_cash_status_result;
        int hashCode13 = (hashCode12 + (statusResult10 == null ? 0 : statusResult10.hashCode())) * 31;
        ScenarioPlan scenarioPlan = this.offline_transfer_scenario_plan;
        int hashCode14 = (hashCode13 + (scenarioPlan == null ? 0 : scenarioPlan.hashCode())) * 31;
        ScenarioPlan scenarioPlan2 = this.error_transfer_scenario_plan;
        return hashCode14 + (scenarioPlan2 != null ? scenarioPlan2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("OfflineConfig(enabled=", ", external_status_url=", this.external_status_url, ", attempted_payment_status_result=", this.enabled);
        m.append(this.attempted_payment_status_result);
        m.append(", offline_payment_status_result=");
        m.append(this.offline_payment_status_result);
        m.append(", attempted_bill_status_result=");
        m.append(this.attempted_bill_status_result);
        m.append(", offline_bill_status_result=");
        m.append(this.offline_bill_status_result);
        m.append(", attempted_cash_out_status_result=");
        m.append(this.attempted_cash_out_status_result);
        m.append(", offline_cash_out_status_result=");
        m.append(this.offline_cash_out_status_result);
        m.append(", attempted_add_cash_status_result=");
        m.append(this.attempted_add_cash_status_result);
        m.append(", offline_add_cash_status_result=");
        m.append(this.offline_add_cash_status_result);
        m.append(", retry_intervals=");
        m.append(this.retry_intervals);
        m.append(", error_cash_out_status_result=");
        m.append(this.error_cash_out_status_result);
        m.append(", error_add_cash_status_result=");
        m.append(this.error_add_cash_status_result);
        m.append(", offline_transfer_scenario_plan=");
        m.append(this.offline_transfer_scenario_plan);
        m.append(", error_transfer_scenario_plan=");
        m.append(this.error_transfer_scenario_plan);
        m.append(")");
        return m.toString();
    }

    /* loaded from: classes.dex */
    public final class Adapter {
        public final Object attempted_add_cash_status_resultAdapter;
        public final Object attempted_bill_status_resultAdapter;
        public final Object attempted_cash_out_status_resultAdapter;
        public final Object attempted_payment_status_resultAdapter;
        public final Object error_add_cash_status_resultAdapter;
        public final Object error_cash_out_status_resultAdapter;
        public final Object error_transfer_scenario_planAdapter;
        public final Object offline_add_cash_status_resultAdapter;
        public final Object offline_bill_status_resultAdapter;
        public final Object offline_cash_out_status_resultAdapter;
        public final Object offline_payment_status_resultAdapter;
        public final Object offline_transfer_scenario_planAdapter;
        public final Object retry_intervalsAdapter;

        public /* synthetic */ Adapter(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13) {
            this.attempted_payment_status_resultAdapter = provider;
            this.offline_payment_status_resultAdapter = provider2;
            this.attempted_bill_status_resultAdapter = provider3;
            this.offline_bill_status_resultAdapter = provider4;
            this.attempted_cash_out_status_resultAdapter = provider5;
            this.offline_cash_out_status_resultAdapter = provider6;
            this.attempted_add_cash_status_resultAdapter = provider7;
            this.offline_add_cash_status_resultAdapter = provider8;
            this.error_cash_out_status_resultAdapter = provider9;
            this.error_add_cash_status_resultAdapter = provider10;
            this.offline_transfer_scenario_planAdapter = provider11;
            this.error_transfer_scenario_planAdapter = provider12;
            this.retry_intervalsAdapter = provider13;
        }

        public Adapter(WireAdapter wireAdapter, WireAdapter wireAdapter2, WireAdapter wireAdapter3, WireAdapter wireAdapter4, WireAdapter wireAdapter5, WireAdapter wireAdapter6, WireAdapter wireAdapter7, WireAdapter wireAdapter8, WireRepeatedAdapter wireRepeatedAdapter, WireAdapter wireAdapter9, WireAdapter wireAdapter10, WireAdapter wireAdapter11, WireAdapter wireAdapter12) {
            this.attempted_payment_status_resultAdapter = wireAdapter;
            this.offline_payment_status_resultAdapter = wireAdapter2;
            this.attempted_bill_status_resultAdapter = wireAdapter3;
            this.offline_bill_status_resultAdapter = wireAdapter4;
            this.attempted_cash_out_status_resultAdapter = wireAdapter5;
            this.offline_cash_out_status_resultAdapter = wireAdapter6;
            this.attempted_add_cash_status_resultAdapter = wireAdapter7;
            this.offline_add_cash_status_resultAdapter = wireAdapter8;
            this.retry_intervalsAdapter = wireRepeatedAdapter;
            this.error_cash_out_status_resultAdapter = wireAdapter9;
            this.error_add_cash_status_resultAdapter = wireAdapter10;
            this.offline_transfer_scenario_planAdapter = wireAdapter11;
            this.error_transfer_scenario_planAdapter = wireAdapter12;
        }
    }
}
