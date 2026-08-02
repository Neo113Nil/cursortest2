package com.squareup.cash.recurring.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecurringPreferenceQueries$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RecurringPreferenceQueries f$1;

    public /* synthetic */ RecurringPreferenceQueries$$ExternalSyntheticLambda5(RecurringPreferenceQueries recurringPreferenceQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                int i2 = RecurringPreferenceQueries$selectForId$2.$r8$clinit;
                break;
            case 2:
                int i3 = RecurringPreferenceQueries$selectForStock$2.$r8$clinit;
                break;
            default:
                int i4 = RecurringPreferenceQueries$selectForType$2.$r8$clinit;
                break;
        }
        this.f$1 = recurringPreferenceQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RecurringPreferenceQueries recurringPreferenceQueries = this.f$1;
        switch (i) {
            case 0:
                int i2 = RecurringPreferenceQueries$selectForType$2.$r8$clinit;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                recurringPreferenceQueries.recurring_preferenceAdapter.getClass();
                String string2 = androidCursor.getString(0);
                string2.getClass();
                Boolean bool = androidCursor.getBoolean(1);
                bool.getClass();
                Recurring_preference.Adapter adapter = recurringPreferenceQueries.recurring_preferenceAdapter;
                Object m = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 2, adapter.amountAdapter);
                Object m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 3, adapter.scheduleAdapter);
                Long l = androidCursor.getLong(4);
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 5, adapter.typeAdapter);
                String string3 = androidCursor.getString(6);
                Money money = (Money) m;
                RecurringSchedule recurringSchedule = (RecurringSchedule) m2;
                money.getClass();
                recurringSchedule.getClass();
                return new Recurring_preference(string2, bool.booleanValue(), money, recurringSchedule, l, (ScheduledTransactionPreference.Type) m3, string3);
            case 1:
                int i3 = RecurringPreferenceQueries$selectForId$2.$r8$clinit;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                recurringPreferenceQueries.recurring_preferenceAdapter.getClass();
                String string4 = androidCursor2.getString(0);
                string4.getClass();
                Boolean bool2 = androidCursor2.getBoolean(1);
                bool2.getClass();
                Recurring_preference.Adapter adapter2 = recurringPreferenceQueries.recurring_preferenceAdapter;
                Object m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 2, adapter2.amountAdapter);
                Object m5 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 3, adapter2.scheduleAdapter);
                Long l2 = androidCursor2.getLong(4);
                Enum m6 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 5, adapter2.typeAdapter);
                String string5 = androidCursor2.getString(6);
                Money money2 = (Money) m4;
                RecurringSchedule recurringSchedule2 = (RecurringSchedule) m5;
                money2.getClass();
                recurringSchedule2.getClass();
                return new Recurring_preference(string4, bool2.booleanValue(), money2, recurringSchedule2, l2, (ScheduledTransactionPreference.Type) m6, string5);
            default:
                int i4 = RecurringPreferenceQueries$selectForStock$2.$r8$clinit;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Recurring_preference.Adapter adapter3 = recurringPreferenceQueries.recurring_preferenceAdapter;
                adapter3.getClass();
                String string6 = androidCursor3.getString(0);
                string6.getClass();
                Boolean bool3 = androidCursor3.getBoolean(1);
                bool3.getClass();
                Object m7 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 2, adapter3.amountAdapter);
                Object m8 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 3, adapter3.scheduleAdapter);
                Long l3 = androidCursor3.getLong(4);
                Enum m9 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 5, adapter3.typeAdapter);
                String string7 = androidCursor3.getString(6);
                Money money3 = (Money) m7;
                RecurringSchedule recurringSchedule3 = (RecurringSchedule) m8;
                money3.getClass();
                recurringSchedule3.getClass();
                return new Recurring_preference(string6, bool3.booleanValue(), money3, recurringSchedule3, l3, (ScheduledTransactionPreference.Type) m9, string7);
        }
    }
}
