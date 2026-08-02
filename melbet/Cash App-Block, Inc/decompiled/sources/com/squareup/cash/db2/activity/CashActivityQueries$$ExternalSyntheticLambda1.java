package com.squareup.cash.db2.activity;

import androidx.compose.ui.node.NodeChain;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.InvestmentOrderType;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.RollupType;
import com.squareup.protos.franklin.ui.TransactionType;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashActivityQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentQueries f$1;

    public /* synthetic */ CashActivityQueries$$ExternalSyntheticLambda1(PaymentQueries paymentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                CashActivityQueries$allActivityByPaymentType$2 cashActivityQueries$allActivityByPaymentType$2 = CashActivityQueries$allActivityByPaymentType$2.INSTANCE;
                break;
            case 2:
                CashActivityQueries$activity$2 cashActivityQueries$activity$2 = CashActivityQueries$activity$2.INSTANCE;
                break;
            default:
                CashActivityQueries$forToken$2 cashActivityQueries$forToken$2 = CashActivityQueries$forToken$2.INSTANCE;
                break;
        }
        this.f$1 = paymentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v16, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v41, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v46, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CashActivityQueries$forToken$2 cashActivityQueries$forToken$2 = CashActivityQueries$forToken$2.INSTANCE;
                PaymentQueries paymentQueries = this.f$1;
                ComponentRegistry.Builder builder = paymentQueries.customerAdapter;
                NodeChain nodeChain = paymentQueries.paymentAdapter;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Boolean bool = androidCursor.getBoolean(1);
                bool.getClass();
                Long l = androidCursor.getLong(2);
                l.getClass();
                String string2 = androidCursor.getString(3);
                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 4);
                String string3 = androidCursor.getString(5);
                String m2 = Matcher$$ExternalSyntheticOutline0.m(string3, androidCursor, 6);
                String string4 = androidCursor.getString(7);
                String string5 = androidCursor.getString(8);
                PaymentState paymentState = string5 != null ? (PaymentState) ((EnumColumnAdapter) nodeChain.innerCoordinator).decode(string5) : null;
                String string6 = androidCursor.getString(9);
                Role role = string6 != null ? (Role) ((EnumColumnAdapter) nodeChain.sentinelHead).decode(string6) : null;
                Long l2 = androidCursor.getLong(10);
                String string7 = androidCursor.getString(11);
                CurrencyCode currencyCode = string7 != null ? (CurrencyCode) ((EnumColumnAdapter) nodeChain.outerCoordinator).decode(string7) : null;
                Boolean bool2 = androidCursor.getBoolean(12);
                Boolean m3 = Matcher$$ExternalSyntheticOutline0.m(bool2, androidCursor, 13);
                Boolean bool3 = androidCursor.getBoolean(14);
                bool3.getClass();
                Long l3 = androidCursor.getLong(15);
                String string8 = androidCursor.getString(16);
                ?? bytes = androidCursor.getBytes(17);
                Image image = bytes != 0 ? (Image) ((WireAdapter) builder.lazyFetcherFactories).decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(18);
                Color color = bytes2 != 0 ? (Color) ((WireAdapter) builder.lazyDecoderFactories).decode(bytes2) : null;
                String string9 = androidCursor.getString(19);
                String string10 = androidCursor.getString(20);
                ?? bytes3 = androidCursor.getBytes(21);
                MerchantData merchantData = bytes3 != 0 ? (MerchantData) ((WireAdapter) builder.mappers).decode(bytes3) : null;
                String string11 = androidCursor.getString(22);
                String string12 = androidCursor.getString(23);
                String string13 = androidCursor.getString(24);
                Boolean bool4 = androidCursor.getBoolean(25);
                Boolean m4 = Matcher$$ExternalSyntheticOutline0.m(bool4, androidCursor, 26);
                Boolean bool5 = androidCursor.getBoolean(27);
                bool5.getClass();
                Long l4 = androidCursor.getLong(28);
                l4.getClass();
                String string14 = androidCursor.getString(29);
                String string15 = androidCursor.getString(30);
                RollupType rollupType = string15 != null ? (RollupType) ((EnumColumnAdapter) nodeChain.buffer).decode(string15) : null;
                String string16 = androidCursor.getString(31);
                InvestmentOrderType investmentOrderType = string16 != null ? (InvestmentOrderType) ((EnumColumnAdapter) nodeChain.stack).decode(string16) : null;
                String string17 = androidCursor.getString(32);
                String string18 = androidCursor.getString(33);
                String string19 = androidCursor.getString(34);
                String string20 = androidCursor.getString(35);
                Long l5 = androidCursor.getLong(36);
                Boolean bool6 = androidCursor.getBoolean(37);
                Boolean m5 = Matcher$$ExternalSyntheticOutline0.m(bool6, androidCursor, 38);
                Boolean bool7 = androidCursor.getBoolean(39);
                bool7.getClass();
                Enum m6 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 40, (EnumColumnAdapter) nodeChain.layoutNode);
                String string21 = androidCursor.getString(41);
                Object[] objArr = {m1431m, bool, l, string2, m, string3, m2, string4, paymentState, role, l2, currencyCode, bool2, m3, bool3, l3, string8, image, color, string9, string10, merchantData, string11, string12, string13, bool4, m4, bool5, l4, string14, rollupType, investmentOrderType, string17, string18, string19, string20, l5, bool6, m5, bool7, m6, string21 != null ? (TransactionType) ((EnumColumnAdapter) nodeChain.cachedDiffer).decode(string21) : null};
                if (objArr.length != 42) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 42 arguments");
                    break;
                } else {
                    String str = (String) objArr[0];
                    boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                    long longValue = ((Number) objArr[2]).longValue();
                    String str2 = (String) objArr[3];
                    String str3 = (String) objArr[4];
                    String str4 = (String) objArr[5];
                    String str5 = (String) objArr[6];
                    String str6 = (String) objArr[7];
                    PaymentState paymentState2 = (PaymentState) objArr[8];
                    Role role2 = (Role) objArr[9];
                    Long l6 = (Long) objArr[10];
                    CurrencyCode currencyCode2 = (CurrencyCode) objArr[11];
                    boolean booleanValue2 = ((Boolean) objArr[12]).booleanValue();
                    boolean booleanValue3 = ((Boolean) objArr[13]).booleanValue();
                    boolean booleanValue4 = ((Boolean) objArr[14]).booleanValue();
                    Long l7 = (Long) objArr[15];
                    String str7 = (String) objArr[16];
                    Image image2 = (Image) objArr[17];
                    Color color2 = (Color) objArr[18];
                    String str8 = (String) objArr[19];
                    String str9 = (String) objArr[20];
                    MerchantData merchantData2 = (MerchantData) objArr[21];
                    String str10 = (String) objArr[22];
                    String str11 = (String) objArr[23];
                    String str12 = (String) objArr[24];
                    boolean booleanValue5 = ((Boolean) objArr[25]).booleanValue();
                    boolean booleanValue6 = ((Boolean) objArr[26]).booleanValue();
                    boolean booleanValue7 = ((Boolean) objArr[27]).booleanValue();
                    long longValue2 = ((Number) objArr[28]).longValue();
                    String str13 = (String) objArr[29];
                    RollupType rollupType2 = (RollupType) objArr[30];
                    InvestmentOrderType investmentOrderType2 = (InvestmentOrderType) objArr[31];
                    String str14 = (String) objArr[32];
                    String str15 = (String) objArr[33];
                    String str16 = (String) objArr[34];
                    String str17 = (String) objArr[35];
                    Long l8 = (Long) objArr[36];
                    boolean booleanValue8 = ((Boolean) objArr[37]).booleanValue();
                    boolean booleanValue9 = ((Boolean) objArr[38]).booleanValue();
                    boolean booleanValue10 = ((Boolean) objArr[39]).booleanValue();
                    Orientation orientation = (Orientation) objArr[40];
                    TransactionType transactionType = (TransactionType) objArr[41];
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                    orientation.getClass();
                    break;
                }
            case 1:
                CashActivityQueries$allActivityByPaymentType$2 cashActivityQueries$allActivityByPaymentType$2 = CashActivityQueries$allActivityByPaymentType$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                Boolean bool8 = androidCursor2.getBoolean(1);
                bool8.getClass();
                Long l9 = androidCursor2.getLong(2);
                l9.getClass();
                String string22 = androidCursor2.getString(3);
                String m7 = Matcher$$ExternalSyntheticOutline0.m(string22, androidCursor2, 4);
                String string23 = androidCursor2.getString(5);
                String m8 = Matcher$$ExternalSyntheticOutline0.m(string23, androidCursor2, 6);
                String string24 = androidCursor2.getString(7);
                String string25 = androidCursor2.getString(8);
                PaymentQueries paymentQueries2 = this.f$1;
                PaymentState paymentState3 = string25 != null ? (PaymentState) ((EnumColumnAdapter) paymentQueries2.paymentAdapter.innerCoordinator).decode(string25) : null;
                String string26 = androidCursor2.getString(9);
                Role role3 = string26 != null ? (Role) ((EnumColumnAdapter) paymentQueries2.paymentAdapter.sentinelHead).decode(string26) : null;
                Long l10 = androidCursor2.getLong(10);
                String string27 = androidCursor2.getString(11);
                CurrencyCode currencyCode3 = string27 != null ? (CurrencyCode) ((EnumColumnAdapter) paymentQueries2.paymentAdapter.outerCoordinator).decode(string27) : null;
                Boolean bool9 = androidCursor2.getBoolean(12);
                Boolean m9 = Matcher$$ExternalSyntheticOutline0.m(bool9, androidCursor2, 13);
                Boolean bool10 = androidCursor2.getBoolean(14);
                bool10.getClass();
                Long l11 = androidCursor2.getLong(15);
                String string28 = androidCursor2.getString(16);
                ?? bytes4 = androidCursor2.getBytes(17);
                Image image3 = bytes4 != 0 ? (Image) ((WireAdapter) paymentQueries2.customerAdapter.lazyFetcherFactories).decode(bytes4) : null;
                ?? bytes5 = androidCursor2.getBytes(18);
                Color color3 = bytes5 != 0 ? (Color) ((WireAdapter) paymentQueries2.customerAdapter.lazyDecoderFactories).decode(bytes5) : null;
                String string29 = androidCursor2.getString(19);
                String string30 = androidCursor2.getString(20);
                ?? bytes6 = androidCursor2.getBytes(21);
                MerchantData merchantData3 = bytes6 != 0 ? (MerchantData) ((WireAdapter) paymentQueries2.customerAdapter.mappers).decode(bytes6) : null;
                String string31 = androidCursor2.getString(22);
                String string32 = androidCursor2.getString(23);
                String string33 = androidCursor2.getString(24);
                Boolean bool11 = androidCursor2.getBoolean(25);
                Boolean m10 = Matcher$$ExternalSyntheticOutline0.m(bool11, androidCursor2, 26);
                Boolean bool12 = androidCursor2.getBoolean(27);
                bool12.getClass();
                Long l12 = androidCursor2.getLong(28);
                l12.getClass();
                String string34 = androidCursor2.getString(29);
                String string35 = androidCursor2.getString(30);
                RollupType rollupType3 = string35 != null ? (RollupType) ((EnumColumnAdapter) paymentQueries2.paymentAdapter.buffer).decode(string35) : null;
                String string36 = androidCursor2.getString(31);
                InvestmentOrderType investmentOrderType3 = string36 != null ? (InvestmentOrderType) ((EnumColumnAdapter) paymentQueries2.paymentAdapter.stack).decode(string36) : null;
                String string37 = androidCursor2.getString(32);
                String string38 = androidCursor2.getString(33);
                String string39 = androidCursor2.getString(34);
                String string40 = androidCursor2.getString(35);
                Long l13 = androidCursor2.getLong(36);
                Boolean bool13 = androidCursor2.getBoolean(37);
                Boolean m11 = Matcher$$ExternalSyntheticOutline0.m(bool13, androidCursor2, 38);
                Boolean bool14 = androidCursor2.getBoolean(39);
                bool14.getClass();
                Enum m12 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 40, (EnumColumnAdapter) paymentQueries2.paymentAdapter.layoutNode);
                String string41 = androidCursor2.getString(41);
                Object[] objArr2 = {m1431m2, bool8, l9, string22, m7, string23, m8, string24, paymentState3, role3, l10, currencyCode3, bool9, m9, bool10, l11, string28, image3, color3, string29, string30, merchantData3, string31, string32, string33, bool11, m10, bool12, l12, string34, rollupType3, investmentOrderType3, string37, string38, string39, string40, l13, bool13, m11, bool14, m12, string41 != null ? (TransactionType) ((EnumColumnAdapter) paymentQueries2.paymentAdapter.cachedDiffer).decode(string41) : null};
                if (objArr2.length != 42) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 42 arguments");
                    break;
                } else {
                    String str18 = (String) objArr2[0];
                    boolean booleanValue11 = ((Boolean) objArr2[1]).booleanValue();
                    long longValue3 = ((Number) objArr2[2]).longValue();
                    String str19 = (String) objArr2[3];
                    String str20 = (String) objArr2[4];
                    String str21 = (String) objArr2[5];
                    String str22 = (String) objArr2[6];
                    String str23 = (String) objArr2[7];
                    PaymentState paymentState4 = (PaymentState) objArr2[8];
                    Role role4 = (Role) objArr2[9];
                    Long l14 = (Long) objArr2[10];
                    CurrencyCode currencyCode4 = (CurrencyCode) objArr2[11];
                    boolean booleanValue12 = ((Boolean) objArr2[12]).booleanValue();
                    boolean booleanValue13 = ((Boolean) objArr2[13]).booleanValue();
                    boolean booleanValue14 = ((Boolean) objArr2[14]).booleanValue();
                    Long l15 = (Long) objArr2[15];
                    String str24 = (String) objArr2[16];
                    Image image4 = (Image) objArr2[17];
                    Color color4 = (Color) objArr2[18];
                    String str25 = (String) objArr2[19];
                    String str26 = (String) objArr2[20];
                    MerchantData merchantData4 = (MerchantData) objArr2[21];
                    String str27 = (String) objArr2[22];
                    String str28 = (String) objArr2[23];
                    String str29 = (String) objArr2[24];
                    boolean booleanValue15 = ((Boolean) objArr2[25]).booleanValue();
                    boolean booleanValue16 = ((Boolean) objArr2[26]).booleanValue();
                    boolean booleanValue17 = ((Boolean) objArr2[27]).booleanValue();
                    long longValue4 = ((Number) objArr2[28]).longValue();
                    String str30 = (String) objArr2[29];
                    RollupType rollupType4 = (RollupType) objArr2[30];
                    InvestmentOrderType investmentOrderType4 = (InvestmentOrderType) objArr2[31];
                    String str31 = (String) objArr2[32];
                    String str32 = (String) objArr2[33];
                    String str33 = (String) objArr2[34];
                    String str34 = (String) objArr2[35];
                    Long l16 = (Long) objArr2[36];
                    boolean booleanValue18 = ((Boolean) objArr2[37]).booleanValue();
                    boolean booleanValue19 = ((Boolean) objArr2[38]).booleanValue();
                    boolean booleanValue20 = ((Boolean) objArr2[39]).booleanValue();
                    Orientation orientation2 = (Orientation) objArr2[40];
                    TransactionType transactionType2 = (TransactionType) objArr2[41];
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str18, str19, str20, str21, str22);
                    orientation2.getClass();
                    break;
                }
            default:
                CashActivityQueries$activity$2 cashActivityQueries$activity$2 = CashActivityQueries$activity$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                Boolean bool15 = androidCursor3.getBoolean(1);
                bool15.getClass();
                Long l17 = androidCursor3.getLong(2);
                l17.getClass();
                String string42 = androidCursor3.getString(3);
                String m13 = Matcher$$ExternalSyntheticOutline0.m(string42, androidCursor3, 4);
                String string43 = androidCursor3.getString(5);
                String m14 = Matcher$$ExternalSyntheticOutline0.m(string43, androidCursor3, 6);
                String string44 = androidCursor3.getString(7);
                String string45 = androidCursor3.getString(8);
                PaymentQueries paymentQueries3 = this.f$1;
                PaymentState paymentState5 = string45 != null ? (PaymentState) ((EnumColumnAdapter) paymentQueries3.paymentAdapter.innerCoordinator).decode(string45) : null;
                String string46 = androidCursor3.getString(9);
                Role role5 = string46 != null ? (Role) ((EnumColumnAdapter) paymentQueries3.paymentAdapter.sentinelHead).decode(string46) : null;
                Long l18 = androidCursor3.getLong(10);
                String string47 = androidCursor3.getString(11);
                CurrencyCode currencyCode5 = string47 != null ? (CurrencyCode) ((EnumColumnAdapter) paymentQueries3.paymentAdapter.outerCoordinator).decode(string47) : null;
                Boolean bool16 = androidCursor3.getBoolean(12);
                Boolean m15 = Matcher$$ExternalSyntheticOutline0.m(bool16, androidCursor3, 13);
                Boolean bool17 = androidCursor3.getBoolean(14);
                bool17.getClass();
                Long l19 = androidCursor3.getLong(15);
                String string48 = androidCursor3.getString(16);
                ?? bytes7 = androidCursor3.getBytes(17);
                Image image5 = bytes7 != 0 ? (Image) ((WireAdapter) paymentQueries3.customerAdapter.lazyFetcherFactories).decode(bytes7) : null;
                ?? bytes8 = androidCursor3.getBytes(18);
                Color color5 = bytes8 != 0 ? (Color) ((WireAdapter) paymentQueries3.customerAdapter.lazyDecoderFactories).decode(bytes8) : null;
                String string49 = androidCursor3.getString(19);
                String string50 = androidCursor3.getString(20);
                ?? bytes9 = androidCursor3.getBytes(21);
                MerchantData merchantData5 = bytes9 != 0 ? (MerchantData) ((WireAdapter) paymentQueries3.customerAdapter.mappers).decode(bytes9) : null;
                String string51 = androidCursor3.getString(22);
                String string52 = androidCursor3.getString(23);
                String string53 = androidCursor3.getString(24);
                Boolean bool18 = androidCursor3.getBoolean(25);
                Boolean m16 = Matcher$$ExternalSyntheticOutline0.m(bool18, androidCursor3, 26);
                Boolean bool19 = androidCursor3.getBoolean(27);
                bool19.getClass();
                Long l20 = androidCursor3.getLong(28);
                l20.getClass();
                String string54 = androidCursor3.getString(29);
                String string55 = androidCursor3.getString(30);
                RollupType rollupType5 = string55 != null ? (RollupType) ((EnumColumnAdapter) paymentQueries3.paymentAdapter.buffer).decode(string55) : null;
                String string56 = androidCursor3.getString(31);
                InvestmentOrderType investmentOrderType5 = string56 != null ? (InvestmentOrderType) ((EnumColumnAdapter) paymentQueries3.paymentAdapter.stack).decode(string56) : null;
                String string57 = androidCursor3.getString(32);
                String string58 = androidCursor3.getString(33);
                String string59 = androidCursor3.getString(34);
                String string60 = androidCursor3.getString(35);
                Long l21 = androidCursor3.getLong(36);
                Boolean bool20 = androidCursor3.getBoolean(37);
                Boolean m17 = Matcher$$ExternalSyntheticOutline0.m(bool20, androidCursor3, 38);
                Boolean bool21 = androidCursor3.getBoolean(39);
                bool21.getClass();
                Enum m18 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 40, (EnumColumnAdapter) paymentQueries3.paymentAdapter.layoutNode);
                String string61 = androidCursor3.getString(41);
                Object[] objArr3 = {m1431m3, bool15, l17, string42, m13, string43, m14, string44, paymentState5, role5, l18, currencyCode5, bool16, m15, bool17, l19, string48, image5, color5, string49, string50, merchantData5, string51, string52, string53, bool18, m16, bool19, l20, string54, rollupType5, investmentOrderType5, string57, string58, string59, string60, l21, bool20, m17, bool21, m18, string61 != null ? (TransactionType) ((EnumColumnAdapter) paymentQueries3.paymentAdapter.cachedDiffer).decode(string61) : null};
                if (objArr3.length != 42) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 42 arguments");
                    break;
                } else {
                    String str35 = (String) objArr3[0];
                    boolean booleanValue21 = ((Boolean) objArr3[1]).booleanValue();
                    long longValue5 = ((Number) objArr3[2]).longValue();
                    String str36 = (String) objArr3[3];
                    String str37 = (String) objArr3[4];
                    String str38 = (String) objArr3[5];
                    String str39 = (String) objArr3[6];
                    String str40 = (String) objArr3[7];
                    PaymentState paymentState6 = (PaymentState) objArr3[8];
                    Role role6 = (Role) objArr3[9];
                    Long l22 = (Long) objArr3[10];
                    CurrencyCode currencyCode6 = (CurrencyCode) objArr3[11];
                    boolean booleanValue22 = ((Boolean) objArr3[12]).booleanValue();
                    boolean booleanValue23 = ((Boolean) objArr3[13]).booleanValue();
                    boolean booleanValue24 = ((Boolean) objArr3[14]).booleanValue();
                    Long l23 = (Long) objArr3[15];
                    String str41 = (String) objArr3[16];
                    Image image6 = (Image) objArr3[17];
                    Color color6 = (Color) objArr3[18];
                    String str42 = (String) objArr3[19];
                    String str43 = (String) objArr3[20];
                    MerchantData merchantData6 = (MerchantData) objArr3[21];
                    String str44 = (String) objArr3[22];
                    String str45 = (String) objArr3[23];
                    String str46 = (String) objArr3[24];
                    boolean booleanValue25 = ((Boolean) objArr3[25]).booleanValue();
                    boolean booleanValue26 = ((Boolean) objArr3[26]).booleanValue();
                    boolean booleanValue27 = ((Boolean) objArr3[27]).booleanValue();
                    long longValue6 = ((Number) objArr3[28]).longValue();
                    String str47 = (String) objArr3[29];
                    RollupType rollupType6 = (RollupType) objArr3[30];
                    InvestmentOrderType investmentOrderType6 = (InvestmentOrderType) objArr3[31];
                    String str48 = (String) objArr3[32];
                    String str49 = (String) objArr3[33];
                    String str50 = (String) objArr3[34];
                    String str51 = (String) objArr3[35];
                    Long l24 = (Long) objArr3[36];
                    boolean booleanValue28 = ((Boolean) objArr3[37]).booleanValue();
                    boolean booleanValue29 = ((Boolean) objArr3[38]).booleanValue();
                    boolean booleanValue30 = ((Boolean) objArr3[39]).booleanValue();
                    Orientation orientation3 = (Orientation) objArr3[40];
                    TransactionType transactionType3 = (TransactionType) objArr3[41];
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str35, str36, str37, str38, str39);
                    orientation3.getClass();
                    break;
                }
        }
        return null;
    }
}
