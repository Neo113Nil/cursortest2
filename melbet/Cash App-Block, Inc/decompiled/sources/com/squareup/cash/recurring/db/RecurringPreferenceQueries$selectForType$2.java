package com.squareup.cash.recurring.db;

import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecurringPreferenceQueries$selectForType$2 extends FunctionReferenceImpl implements Function7 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public RecurringPreferenceQueries$selectForType$2() {
        super(7, Recurring_preference.class, "<init>", "<init>(Ljava/lang/String;ZLcom/squareup/protos/common/Money;Lcom/squareup/protos/repeatedly/common/RecurringSchedule;Ljava/lang/Long;Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = ((RecurringPreferenceId) obj).entityId;
        Money money = (Money) obj3;
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj4;
        ScheduledTransactionPreference.Type type2 = (ScheduledTransactionPreference.Type) obj6;
        str.getClass();
        money.getClass();
        recurringSchedule.getClass();
        type2.getClass();
        return new Recurring_preference(str, ((Boolean) obj2).booleanValue(), money, recurringSchedule, (Long) obj5, type2, (String) serializable);
    }
}
