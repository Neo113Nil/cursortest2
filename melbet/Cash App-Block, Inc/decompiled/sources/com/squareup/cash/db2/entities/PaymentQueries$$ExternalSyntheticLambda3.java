package com.squareup.cash.db2.entities;

import androidx.compose.ui.node.NodeChain;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentQueries f$1;

    public /* synthetic */ PaymentQueries$$ExternalSyntheticLambda3(PaymentQueries paymentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                PaymentQueries$forExternalId$2 paymentQueries$forExternalId$2 = PaymentQueries$forExternalId$2.INSTANCE;
                break;
            default:
                PaymentQueries$forToken$2 paymentQueries$forToken$2 = PaymentQueries$forToken$2.INSTANCE;
                break;
        }
        this.f$1 = paymentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Money money;
        int i = this.$r8$classId;
        PaymentQueries paymentQueries = this.f$1;
        switch (i) {
            case 0:
                PaymentQueries$forToken$2 paymentQueries$forToken$2 = PaymentQueries$forToken$2.INSTANCE;
                NodeChain nodeChain = paymentQueries.paymentAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Long l = androidCursor.getLong(1);
                String string2 = androidCursor.getString(2);
                CurrencyCode currencyCode = string2 != null ? (CurrencyCode) ((EnumColumnAdapter) nodeChain.outerCoordinator).decode(string2) : null;
                String string3 = androidCursor.getString(3);
                string3.getClass();
                String string4 = androidCursor.getString(4);
                Role role = string4 != null ? (Role) ((EnumColumnAdapter) nodeChain.sentinelHead).decode(string4) : null;
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 5, (EnumColumnAdapter) nodeChain.layoutNode);
                String string5 = androidCursor.getString(6);
                String m2 = Matcher$$ExternalSyntheticOutline0.m(string5, androidCursor, 7);
                String string6 = androidCursor.getString(8);
                string6.getClass();
                String string7 = androidCursor.getString(9);
                String string8 = androidCursor.getString(10);
                ?? bytes = androidCursor.getBytes(11);
                money = bytes != 0 ? (Money) ((WireAdapter) nodeChain.current).decode(bytes) : null;
                String string9 = androidCursor.getString(12);
                Orientation orientation = (Orientation) m;
                string3.getClass();
                orientation.getClass();
                string5.getClass();
                m2.getClass();
                string6.getClass();
                return new ForToken(m1431m, l, currencyCode, string3, role, orientation, string5, m2, string6, string7, string8, money, string9);
            default:
                PaymentQueries$forExternalId$2 paymentQueries$forExternalId$2 = PaymentQueries$forExternalId$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                Long l2 = androidCursor2.getLong(1);
                String string10 = androidCursor2.getString(2);
                CurrencyCode currencyCode2 = string10 != null ? (CurrencyCode) ((EnumColumnAdapter) paymentQueries.paymentAdapter.outerCoordinator).decode(string10) : null;
                String string11 = androidCursor2.getString(3);
                string11.getClass();
                String string12 = androidCursor2.getString(4);
                Role role2 = string12 != null ? (Role) ((EnumColumnAdapter) paymentQueries.paymentAdapter.sentinelHead).decode(string12) : null;
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 5, (EnumColumnAdapter) paymentQueries.paymentAdapter.layoutNode);
                String string13 = androidCursor2.getString(6);
                String m4 = Matcher$$ExternalSyntheticOutline0.m(string13, androidCursor2, 7);
                String string14 = androidCursor2.getString(8);
                string14.getClass();
                String string15 = androidCursor2.getString(9);
                String string16 = androidCursor2.getString(10);
                ?? bytes2 = androidCursor2.getBytes(11);
                money = bytes2 != 0 ? (Money) ((WireAdapter) paymentQueries.paymentAdapter.current).decode(bytes2) : null;
                String string17 = androidCursor2.getString(12);
                Orientation orientation2 = (Orientation) m3;
                string11.getClass();
                orientation2.getClass();
                string13.getClass();
                m4.getClass();
                string14.getClass();
                return new ForExternalId(m1431m2, l2, currencyCode2, string11, role2, orientation2, string13, m4, string14, string15, string16, money, string17);
        }
    }
}
