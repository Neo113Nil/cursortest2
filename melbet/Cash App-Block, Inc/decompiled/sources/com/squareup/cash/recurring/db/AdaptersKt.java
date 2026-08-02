package com.squareup.cash.recurring.db;

import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final Recurring_preference.Adapter recurringPreferenceAdapter = new Recurring_preference.Adapter(new WireAdapter(Money.ADAPTER), new WireAdapter(RecurringSchedule.ADAPTER), new EnumColumnAdapter(ScheduledTransactionPreference.Type.values()));
}
