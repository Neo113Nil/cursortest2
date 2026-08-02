package com.squareup.cash.activity.backend;

import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;

/* loaded from: classes5.dex */
public interface PaymentHistoryActivityItem extends ActivityItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type FORMATTED_PAYMENT_HISTORY;
        public static final Type ORDER;
        public static final Type PAYCHECKS;

        static {
            Type type2 = new Type("FORMATTED_PAYMENT_HISTORY", 0);
            FORMATTED_PAYMENT_HISTORY = type2;
            Type type3 = new Type("ORDER", 1);
            ORDER = type3;
            Type type4 = new Type("PAYCHECKS", 2);
            PAYCHECKS = type4;
            $VALUES = new Type[]{type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    Role getRole();

    PaymentState getState();

    TransactionType getTransactionType();

    UiPayment getUiPayment();

    UiCustomer getUiRecipient();

    UiCustomer getUiSender();

    boolean isOffline();
}
