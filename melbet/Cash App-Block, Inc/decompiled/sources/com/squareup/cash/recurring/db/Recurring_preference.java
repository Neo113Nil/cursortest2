package com.squareup.cash.recurring.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Recurring_preference {
    public final Money amount;
    public final boolean enabled;
    public final String entity_id;
    public final String investment_entity_token;
    public final Long next_reload_at;
    public final RecurringSchedule schedule;

    /* renamed from: type, reason: collision with root package name */
    public final ScheduledTransactionPreference.Type f1195type;

    /* loaded from: classes.dex */
    public final class Adapter {
        public final WireAdapter amountAdapter;
        public final WireAdapter scheduleAdapter;
        public final EnumColumnAdapter typeAdapter;

        public Adapter(WireAdapter wireAdapter, WireAdapter wireAdapter2, EnumColumnAdapter enumColumnAdapter) {
            this.amountAdapter = wireAdapter;
            this.scheduleAdapter = wireAdapter2;
            this.typeAdapter = enumColumnAdapter;
        }
    }

    public Recurring_preference(String str, boolean z, Money money, RecurringSchedule recurringSchedule, Long l, ScheduledTransactionPreference.Type type2, String str2) {
        str.getClass();
        money.getClass();
        recurringSchedule.getClass();
        type2.getClass();
        this.entity_id = str;
        this.enabled = z;
        this.amount = money;
        this.schedule = recurringSchedule;
        this.next_reload_at = l;
        this.f1195type = type2;
        this.investment_entity_token = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recurring_preference)) {
            return false;
        }
        Recurring_preference recurring_preference = (Recurring_preference) obj;
        return Intrinsics.areEqual(this.entity_id, recurring_preference.entity_id) && this.enabled == recurring_preference.enabled && Intrinsics.areEqual(this.amount, recurring_preference.amount) && Intrinsics.areEqual(this.schedule, recurring_preference.schedule) && Intrinsics.areEqual(this.next_reload_at, recurring_preference.next_reload_at) && this.f1195type == recurring_preference.f1195type && Intrinsics.areEqual(this.investment_entity_token, recurring_preference.investment_entity_token);
    }

    public final int hashCode() {
        int hashCode = (this.schedule.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entity_id.hashCode() * 31, 31, this.enabled), 31)) * 31;
        Long l = this.next_reload_at;
        int hashCode2 = (this.f1195type.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str = this.investment_entity_token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Recurring_preference(entity_id=", RecurringPreferenceId.m3732toStringimpl(this.entity_id), ", enabled=", ", amount=", this.enabled);
        m1540m.append(this.amount);
        m1540m.append(", schedule=");
        m1540m.append(this.schedule);
        m1540m.append(", next_reload_at=");
        m1540m.append(this.next_reload_at);
        m1540m.append(", type=");
        m1540m.append(this.f1195type);
        m1540m.append(", investment_entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.investment_entity_token, ")");
    }
}
