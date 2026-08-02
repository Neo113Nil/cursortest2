package com.squareup.cash.investing.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import okio.internal.DefaultSocket;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestmentHoldingQueries$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestmentEntityQueries f$1;

    public /* synthetic */ InvestmentHoldingQueries$$ExternalSyntheticLambda5(InvestmentEntityQueries investmentEntityQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                InvestmentHoldingQueries$holdingsForState$2 investmentHoldingQueries$holdingsForState$2 = InvestmentHoldingQueries$holdingsForState$2.INSTANCE;
                break;
            case 2:
                InvestmentHoldingQueries$holdingForToken$2 investmentHoldingQueries$holdingForToken$2 = InvestmentHoldingQueries$holdingForToken$2.INSTANCE;
                break;
            case 3:
                InvestmentHoldingQueries$myHoldings$2 investmentHoldingQueries$myHoldings$2 = InvestmentHoldingQueries$myHoldings$2.INSTANCE;
                break;
            case 4:
                InvestmentHoldingQueries$forToken$2 investmentHoldingQueries$forToken$2 = InvestmentHoldingQueries$forToken$2.INSTANCE;
                break;
            default:
                InvestmentHoldingQueries$rawHoldings$2 investmentHoldingQueries$rawHoldings$2 = InvestmentHoldingQueries$rawHoldings$2.INSTANCE;
                break;
        }
        this.f$1 = investmentEntityQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v21, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v22, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v28, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v24, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v18, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v20, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v27, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v29, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Serializable serializable;
        int i = this.$r8$classId;
        InvestmentEntityQueries investmentEntityQueries = this.f$1;
        switch (i) {
            case 0:
                InvestmentHoldingQueries$rawHoldings$2 investmentHoldingQueries$rawHoldings$2 = InvestmentHoldingQueries$rawHoldings$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                string2.getClass();
                Long l = androidCursor.getLong(2);
                l.getClass();
                String string3 = androidCursor.getString(3);
                CurrencyCode currencyCode = string3 != null ? (CurrencyCode) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).decode(string3) : null;
                DefaultSocket defaultSocket = investmentEntityQueries.investment_holdingAdapter;
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 4, (EnumColumnAdapter) defaultSocket.closeBits);
                ?? bytes = androidCursor.getBytes(5);
                SyncInvestmentHolding.DailyGainParams dailyGainParams = bytes != 0 ? (SyncInvestmentHolding.DailyGainParams) ((WireAdapter) defaultSocket.source).decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(6);
                return investmentHoldingQueries$rawHoldings$2.invoke(m1431m, string2, l, currencyCode, m, dailyGainParams, bytes2 != 0 ? (Money) ((WireAdapter) defaultSocket.sink).decode(bytes2) : null);
            case 1:
                InvestmentHoldingQueries$holdingsForState$2 investmentHoldingQueries$holdingsForState$2 = InvestmentHoldingQueries$holdingsForState$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string4 = androidCursor2.getString(1);
                string4.getClass();
                Long l2 = androidCursor2.getLong(2);
                l2.getClass();
                String string5 = androidCursor2.getString(3);
                CurrencyCode currencyCode2 = string5 != null ? (CurrencyCode) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).decode(string5) : null;
                DefaultSocket defaultSocket2 = investmentEntityQueries.investment_holdingAdapter;
                zzlj zzljVar = investmentEntityQueries.investment_entityAdapter;
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 4, (EnumColumnAdapter) defaultSocket2.closeBits);
                ?? bytes3 = androidCursor2.getBytes(5);
                SyncInvestmentHolding.DailyGainParams dailyGainParams2 = bytes3 != 0 ? (SyncInvestmentHolding.DailyGainParams) ((WireAdapter) defaultSocket2.source).decode(bytes3) : null;
                ?? bytes4 = androidCursor2.getBytes(6);
                Money money = bytes4 != 0 ? (Money) ((WireAdapter) defaultSocket2.sink).decode(bytes4) : null;
                Long l3 = androidCursor2.getLong(7);
                l3.getClass();
                String string6 = androidCursor2.getString(8);
                string6.getClass();
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 9, (EnumColumnAdapter) zzljVar.zza);
                String string7 = androidCursor2.getString(10);
                string7.getClass();
                String string8 = androidCursor2.getString(11);
                Long l4 = androidCursor2.getLong(12);
                String string9 = androidCursor2.getString(13);
                Enum m4 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 14, (EnumColumnAdapter) zzljVar.zzb);
                String string10 = androidCursor2.getString(15);
                ?? bytes5 = androidCursor2.getBytes(16);
                List list = bytes5 != 0 ? (List) ((WireRepeatedAdapter) zzljVar.zzc).decode(bytes5) : null;
                Long l5 = androidCursor2.getLong(17);
                Boolean bool = androidCursor2.getBoolean(18);
                bool.getClass();
                ?? bytes6 = androidCursor2.getBytes(19);
                Color color = bytes6 != 0 ? (Color) ((WireAdapter) zzljVar.zze).decode(bytes6) : null;
                ?? bytes7 = androidCursor2.getBytes(20);
                Image image = bytes7 != 0 ? (Image) ((WireAdapter) zzljVar.zzd).decode(bytes7) : null;
                String string11 = androidCursor2.getString(21);
                serializable = string11 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar.zzf).decode(string11) : null;
                long longValue = l2.longValue();
                SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = (SyncInvestmentHolding.InvestmentHoldingState) m2;
                long longValue2 = l3.longValue();
                InvestmentEntityType investmentEntityType = (InvestmentEntityType) m3;
                InvestmentEntityStatus investmentEntityStatus = (InvestmentEntityStatus) m4;
                List list2 = list;
                boolean booleanValue = bool.booleanValue();
                investmentHoldingState.getClass();
                investmentEntityType.getClass();
                investmentEntityStatus.getClass();
                return new OwnedHoldings(m1431m2, string4, longValue, currencyCode2, investmentHoldingState, dailyGainParams2, money, longValue2, string6, investmentEntityType, string7, string8, l4, string9, investmentEntityStatus, string10, list2, l5, booleanValue, color, image, serializable);
            case 2:
                InvestmentHoldingQueries$holdingForToken$2 investmentHoldingQueries$holdingForToken$2 = InvestmentHoldingQueries$holdingForToken$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                String string12 = androidCursor3.getString(1);
                string12.getClass();
                Long l6 = androidCursor3.getLong(2);
                l6.getClass();
                String string13 = androidCursor3.getString(3);
                CurrencyCode currencyCode3 = string13 != null ? (CurrencyCode) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).decode(string13) : null;
                DefaultSocket defaultSocket3 = investmentEntityQueries.investment_holdingAdapter;
                zzlj zzljVar2 = investmentEntityQueries.investment_entityAdapter;
                Enum m5 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 4, (EnumColumnAdapter) defaultSocket3.closeBits);
                ?? bytes8 = androidCursor3.getBytes(5);
                SyncInvestmentHolding.DailyGainParams dailyGainParams3 = bytes8 != 0 ? (SyncInvestmentHolding.DailyGainParams) ((WireAdapter) defaultSocket3.source).decode(bytes8) : null;
                ?? bytes9 = androidCursor3.getBytes(6);
                Money money2 = bytes9 != 0 ? (Money) ((WireAdapter) defaultSocket3.sink).decode(bytes9) : null;
                Long l7 = androidCursor3.getLong(7);
                l7.getClass();
                String string14 = androidCursor3.getString(8);
                string14.getClass();
                Enum m6 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 9, (EnumColumnAdapter) zzljVar2.zza);
                String string15 = androidCursor3.getString(10);
                string15.getClass();
                String string16 = androidCursor3.getString(11);
                Long l8 = androidCursor3.getLong(12);
                String string17 = androidCursor3.getString(13);
                Enum m7 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 14, (EnumColumnAdapter) zzljVar2.zzb);
                String string18 = androidCursor3.getString(15);
                ?? bytes10 = androidCursor3.getBytes(16);
                List list3 = bytes10 != 0 ? (List) ((WireRepeatedAdapter) zzljVar2.zzc).decode(bytes10) : null;
                Long l9 = androidCursor3.getLong(17);
                Boolean bool2 = androidCursor3.getBoolean(18);
                bool2.getClass();
                ?? bytes11 = androidCursor3.getBytes(19);
                Color color2 = bytes11 != 0 ? (Color) ((WireAdapter) zzljVar2.zze).decode(bytes11) : null;
                ?? bytes12 = androidCursor3.getBytes(20);
                Image image2 = bytes12 != 0 ? (Image) ((WireAdapter) zzljVar2.zzd).decode(bytes12) : null;
                String string19 = androidCursor3.getString(21);
                serializable = string19 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar2.zzf).decode(string19) : null;
                long longValue3 = l6.longValue();
                SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState2 = (SyncInvestmentHolding.InvestmentHoldingState) m5;
                long longValue4 = l7.longValue();
                InvestmentEntityType investmentEntityType2 = (InvestmentEntityType) m6;
                InvestmentEntityStatus investmentEntityStatus2 = (InvestmentEntityStatus) m7;
                List list4 = list3;
                boolean booleanValue2 = bool2.booleanValue();
                investmentHoldingState2.getClass();
                investmentEntityType2.getClass();
                investmentEntityStatus2.getClass();
                return new OwnedHoldings(m1431m3, string12, longValue3, currencyCode3, investmentHoldingState2, dailyGainParams3, money2, longValue4, string14, investmentEntityType2, string15, string16, l8, string17, investmentEntityStatus2, string18, list4, l9, booleanValue2, color2, image2, serializable);
            case 3:
                InvestmentHoldingQueries$myHoldings$2 investmentHoldingQueries$myHoldings$2 = InvestmentHoldingQueries$myHoldings$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                String m1431m4 = re$$ExternalSyntheticOutline0.m1431m(androidCursor4, 0);
                String string20 = androidCursor4.getString(1);
                string20.getClass();
                Long l10 = androidCursor4.getLong(2);
                l10.getClass();
                String string21 = androidCursor4.getString(3);
                CurrencyCode currencyCode4 = string21 != null ? (CurrencyCode) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).decode(string21) : null;
                DefaultSocket defaultSocket4 = investmentEntityQueries.investment_holdingAdapter;
                zzlj zzljVar3 = investmentEntityQueries.investment_entityAdapter;
                Enum m8 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 4, (EnumColumnAdapter) defaultSocket4.closeBits);
                ?? bytes13 = androidCursor4.getBytes(5);
                SyncInvestmentHolding.DailyGainParams dailyGainParams4 = bytes13 != 0 ? (SyncInvestmentHolding.DailyGainParams) ((WireAdapter) defaultSocket4.source).decode(bytes13) : null;
                ?? bytes14 = androidCursor4.getBytes(6);
                Money money3 = bytes14 != 0 ? (Money) ((WireAdapter) defaultSocket4.sink).decode(bytes14) : null;
                Long l11 = androidCursor4.getLong(7);
                l11.getClass();
                String string22 = androidCursor4.getString(8);
                string22.getClass();
                Enum m9 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 9, (EnumColumnAdapter) zzljVar3.zza);
                String string23 = androidCursor4.getString(10);
                string23.getClass();
                String string24 = androidCursor4.getString(11);
                Long l12 = androidCursor4.getLong(12);
                String string25 = androidCursor4.getString(13);
                Enum m10 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 14, (EnumColumnAdapter) zzljVar3.zzb);
                String string26 = androidCursor4.getString(15);
                ?? bytes15 = androidCursor4.getBytes(16);
                List list5 = bytes15 != 0 ? (List) ((WireRepeatedAdapter) zzljVar3.zzc).decode(bytes15) : null;
                Long l13 = androidCursor4.getLong(17);
                Boolean bool3 = androidCursor4.getBoolean(18);
                bool3.getClass();
                ?? bytes16 = androidCursor4.getBytes(19);
                Color color3 = bytes16 != 0 ? (Color) ((WireAdapter) zzljVar3.zze).decode(bytes16) : null;
                ?? bytes17 = androidCursor4.getBytes(20);
                Image image3 = bytes17 != 0 ? (Image) ((WireAdapter) zzljVar3.zzd).decode(bytes17) : null;
                String string27 = androidCursor4.getString(21);
                serializable = string27 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar3.zzf).decode(string27) : null;
                long longValue5 = l10.longValue();
                SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState3 = (SyncInvestmentHolding.InvestmentHoldingState) m8;
                long longValue6 = l11.longValue();
                InvestmentEntityType investmentEntityType3 = (InvestmentEntityType) m9;
                InvestmentEntityStatus investmentEntityStatus3 = (InvestmentEntityStatus) m10;
                List list6 = list5;
                boolean booleanValue3 = bool3.booleanValue();
                investmentHoldingState3.getClass();
                investmentEntityType3.getClass();
                investmentEntityStatus3.getClass();
                return new OwnedHoldings(m1431m4, string20, longValue5, currencyCode4, investmentHoldingState3, dailyGainParams4, money3, longValue6, string22, investmentEntityType3, string23, string24, l12, string25, investmentEntityStatus3, string26, list6, l13, booleanValue3, color3, image3, serializable);
            default:
                InvestmentHoldingQueries$forToken$2 investmentHoldingQueries$forToken$2 = InvestmentHoldingQueries$forToken$2.INSTANCE;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                String m1431m5 = re$$ExternalSyntheticOutline0.m1431m(androidCursor5, 0);
                String string28 = androidCursor5.getString(1);
                string28.getClass();
                Long l14 = androidCursor5.getLong(2);
                l14.getClass();
                String string29 = androidCursor5.getString(3);
                CurrencyCode currencyCode5 = string29 != null ? (CurrencyCode) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).decode(string29) : null;
                DefaultSocket defaultSocket5 = investmentEntityQueries.investment_holdingAdapter;
                Enum m11 = NavAction$$ExternalSyntheticOutline0.m(androidCursor5, 4, (EnumColumnAdapter) defaultSocket5.closeBits);
                ?? bytes18 = androidCursor5.getBytes(5);
                SyncInvestmentHolding.DailyGainParams dailyGainParams5 = bytes18 != 0 ? (SyncInvestmentHolding.DailyGainParams) ((WireAdapter) defaultSocket5.source).decode(bytes18) : null;
                ?? bytes19 = androidCursor5.getBytes(6);
                return investmentHoldingQueries$forToken$2.invoke(m1431m5, string28, l14, currencyCode5, m11, dailyGainParams5, bytes19 != 0 ? (Money) ((WireAdapter) defaultSocket5.sink).decode(bytes19) : null);
        }
    }
}
