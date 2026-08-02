package com.squareup.cash.recurring.db;

import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class RecurringPreferenceQueries extends TransacterImpl {
    public final Recurring_preference.Adapter recurring_preferenceAdapter;

    /* loaded from: classes6.dex */
    public final class SelectForTypeQuery extends Query {

        /* renamed from: type, reason: collision with root package name */
        public final ScheduledTransactionPreference.Type f1194type;

        public SelectForTypeQuery(ScheduledTransactionPreference.Type type2, RecurringPreferenceQueries$$ExternalSyntheticLambda5 recurringPreferenceQueries$$ExternalSyntheticLambda5) {
            super(recurringPreferenceQueries$$ExternalSyntheticLambda5);
            this.f1194type = type2;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            RecurringPreferenceQueries.this.driver.addListener(new String[]{"recurring_preference"}, listener);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            RecurringPreferenceQueries recurringPreferenceQueries = RecurringPreferenceQueries.this;
            return recurringPreferenceQueries.driver.executeQuery(471991770, "SELECT recurring_preference.entity_id, recurring_preference.enabled, recurring_preference.amount, recurring_preference.schedule, recurring_preference.next_reload_at, recurring_preference.type, recurring_preference.investment_entity_token\nFROM recurring_preference\nWHERE type = ? AND enabled = 1", function1, 1, new OpenSourceKt$$ExternalSyntheticLambda11(24, recurringPreferenceQueries, this));
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            listener.getClass();
            RecurringPreferenceQueries.this.driver.removeListener(new String[]{"recurring_preference"}, listener);
        }

        public final String toString() {
            return "RecurringPreference.sq:selectForType";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringPreferenceQueries(AndroidSqliteDriver androidSqliteDriver, Recurring_preference.Adapter adapter) {
        super(androidSqliteDriver);
        adapter.getClass();
        this.recurring_preferenceAdapter = adapter;
    }

    /* loaded from: classes6.dex */
    public final class SelectForIdQuery extends Query {
        public final /* synthetic */ int $r8$classId = 0;
        public final String entity_id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectForIdQuery(RecurringPreferenceQueries recurringPreferenceQueries, String str, RecurringPreferenceQueries$$ExternalSyntheticLambda5 recurringPreferenceQueries$$ExternalSyntheticLambda5) {
            super(recurringPreferenceQueries$$ExternalSyntheticLambda5);
            str.getClass();
            RecurringPreferenceQueries.this = recurringPreferenceQueries;
            this.entity_id = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            RecurringPreferenceQueries recurringPreferenceQueries = RecurringPreferenceQueries.this;
            switch (i) {
                case 0:
                    recurringPreferenceQueries.driver.addListener(new String[]{"recurring_preference"}, listener);
                    break;
                default:
                    recurringPreferenceQueries.driver.addListener(new String[]{"recurring_preference"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            RecurringPreferenceQueries recurringPreferenceQueries = RecurringPreferenceQueries.this;
            switch (i) {
                case 0:
                    return recurringPreferenceQueries.driver.executeQuery(-1617384517, "SELECT recurring_preference.entity_id, recurring_preference.enabled, recurring_preference.amount, recurring_preference.schedule, recurring_preference.next_reload_at, recurring_preference.type, recurring_preference.investment_entity_token\nFROM recurring_preference\nWHERE entity_id = ? AND enabled = 1", function1, 1, new OpenSourceKt$$ExternalSyntheticLambda11(23, recurringPreferenceQueries, this));
                default:
                    return recurringPreferenceQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT recurring_preference.entity_id, recurring_preference.enabled, recurring_preference.amount, recurring_preference.schedule, recurring_preference.next_reload_at, recurring_preference.type, recurring_preference.investment_entity_token\n    |FROM recurring_preference\n    |WHERE investment_entity_token ", this.entity_id == null ? "IS" : "=", " ? AND enabled = 1\n    "), function1, 1, new RealSandboxer$$ExternalSyntheticLambda0(this, 4));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            RecurringPreferenceQueries recurringPreferenceQueries = RecurringPreferenceQueries.this;
            listener.getClass();
            switch (i) {
                case 0:
                    recurringPreferenceQueries.driver.removeListener(new String[]{"recurring_preference"}, listener);
                    break;
                default:
                    recurringPreferenceQueries.driver.removeListener(new String[]{"recurring_preference"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "RecurringPreference.sq:selectForId";
                default:
                    return "RecurringPreference.sq:selectForStock";
            }
        }

        public SelectForIdQuery(String str, RecurringPreferenceQueries$$ExternalSyntheticLambda5 recurringPreferenceQueries$$ExternalSyntheticLambda5, byte b) {
            super(recurringPreferenceQueries$$ExternalSyntheticLambda5);
            this.entity_id = str;
        }
    }
}
