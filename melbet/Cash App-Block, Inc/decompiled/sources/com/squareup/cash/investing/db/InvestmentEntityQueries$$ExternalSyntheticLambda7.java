package com.squareup.cash.investing.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestmentEntityQueries$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestmentEntityQueries f$1;

    public /* synthetic */ InvestmentEntityQueries$$ExternalSyntheticLambda7(InvestmentEntityQueries investmentEntityQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                InvestmentEntityQueries$withHoldings$2 investmentEntityQueries$withHoldings$2 = InvestmentEntityQueries$withHoldings$2.INSTANCE;
                break;
            case 2:
                InvestmentEntityQueries$forTokens$2 investmentEntityQueries$forTokens$2 = InvestmentEntityQueries$forTokens$2.INSTANCE;
                break;
            default:
                InvestmentEntityQueries$forToken$2 investmentEntityQueries$forToken$2 = InvestmentEntityQueries$forToken$2.INSTANCE;
                break;
        }
        this.f$1 = investmentEntityQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InvestmentEntityQueries investmentEntityQueries = this.f$1;
        switch (i) {
            case 0:
                InvestmentEntityQueries$forToken$2 investmentEntityQueries$forToken$2 = InvestmentEntityQueries$forToken$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                String m2 = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                zzlj zzljVar = investmentEntityQueries.investment_entityAdapter;
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 3, (EnumColumnAdapter) zzljVar.zza);
                String string3 = androidCursor.getString(4);
                string3.getClass();
                String string4 = androidCursor.getString(5);
                Long l = androidCursor.getLong(6);
                String string5 = androidCursor.getString(7);
                Enum m4 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 8, (EnumColumnAdapter) zzljVar.zzb);
                String string6 = androidCursor.getString(9);
                ?? bytes = androidCursor.getBytes(10);
                List list = bytes != 0 ? (List) ((WireRepeatedAdapter) zzljVar.zzc).decode(bytes) : null;
                Long l2 = androidCursor.getLong(11);
                Boolean bool = androidCursor.getBoolean(12);
                bool.getClass();
                ?? bytes2 = androidCursor.getBytes(13);
                Color color = bytes2 != 0 ? (Color) ((WireAdapter) zzljVar.zze).decode(bytes2) : null;
                ?? bytes3 = androidCursor.getBytes(14);
                Image image = bytes3 != 0 ? (Image) ((WireAdapter) zzljVar.zzd).decode(bytes3) : null;
                String string7 = androidCursor.getString(15);
                SyncInvestmentEntity.ReleaseStage releaseStage = string7 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar.zzf).decode(string7) : null;
                long longValue = m.longValue();
                InvestmentEntityType investmentEntityType = (InvestmentEntityType) m3;
                InvestmentEntityStatus investmentEntityStatus = (InvestmentEntityStatus) m4;
                List list2 = list;
                boolean booleanValue = bool.booleanValue();
                string2.getClass();
                m2.getClass();
                investmentEntityType.getClass();
                string3.getClass();
                investmentEntityStatus.getClass();
                return new Investment_entity(longValue, string2, m2, investmentEntityType, string3, string4, l, string5, investmentEntityStatus, string6, list2, l2, booleanValue, color, image, releaseStage);
            case 1:
                InvestmentEntityQueries$withHoldings$2 investmentEntityQueries$withHoldings$2 = InvestmentEntityQueries$withHoldings$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string8 = androidCursor2.getString(0);
                String string9 = androidCursor2.getString(1);
                Long l3 = androidCursor2.getLong(2);
                String string10 = androidCursor2.getString(3);
                CurrencyCode currencyCode = string10 != null ? (CurrencyCode) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.socket).decode(string10) : null;
                String string11 = androidCursor2.getString(4);
                SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState = string11 != null ? (SyncInvestmentHolding.InvestmentHoldingState) ((EnumColumnAdapter) investmentEntityQueries.investment_holdingAdapter.closeBits).decode(string11) : null;
                ?? bytes4 = androidCursor2.getBytes(5);
                SyncInvestmentHolding.DailyGainParams dailyGainParams = bytes4 != 0 ? (SyncInvestmentHolding.DailyGainParams) ((WireAdapter) investmentEntityQueries.investment_holdingAdapter.source).decode(bytes4) : null;
                ?? bytes5 = androidCursor2.getBytes(6);
                Money money = bytes5 != 0 ? (Money) ((WireAdapter) investmentEntityQueries.investment_holdingAdapter.sink).decode(bytes5) : null;
                String string12 = androidCursor2.getString(7);
                String m5 = Matcher$$ExternalSyntheticOutline0.m(string12, androidCursor2, 8);
                Boolean bool2 = androidCursor2.getBoolean(9);
                bool2.getClass();
                ?? bytes6 = androidCursor2.getBytes(10);
                Color color2 = bytes6 != 0 ? (Color) ((WireAdapter) investmentEntityQueries.investment_entityAdapter.zze).decode(bytes6) : null;
                boolean booleanValue2 = bool2.booleanValue();
                string12.getClass();
                m5.getClass();
                return new WithHoldings(string8, string9, l3, currencyCode, investmentHoldingState, dailyGainParams, money, string12, m5, booleanValue2, color2);
            default:
                InvestmentEntityQueries$forTokens$2 investmentEntityQueries$forTokens$2 = InvestmentEntityQueries$forTokens$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                Long m6 = re$$ExternalSyntheticOutline0.m(androidCursor3, 0);
                String string13 = androidCursor3.getString(1);
                String m7 = Matcher$$ExternalSyntheticOutline0.m(string13, androidCursor3, 2);
                zzlj zzljVar2 = investmentEntityQueries.investment_entityAdapter;
                Enum m8 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 3, (EnumColumnAdapter) zzljVar2.zza);
                String string14 = androidCursor3.getString(4);
                string14.getClass();
                String string15 = androidCursor3.getString(5);
                Long l4 = androidCursor3.getLong(6);
                String string16 = androidCursor3.getString(7);
                Enum m9 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 8, (EnumColumnAdapter) zzljVar2.zzb);
                String string17 = androidCursor3.getString(9);
                ?? bytes7 = androidCursor3.getBytes(10);
                List list3 = bytes7 != 0 ? (List) ((WireRepeatedAdapter) zzljVar2.zzc).decode(bytes7) : null;
                Long l5 = androidCursor3.getLong(11);
                Boolean bool3 = androidCursor3.getBoolean(12);
                bool3.getClass();
                ?? bytes8 = androidCursor3.getBytes(13);
                Color color3 = bytes8 != 0 ? (Color) ((WireAdapter) zzljVar2.zze).decode(bytes8) : null;
                ?? bytes9 = androidCursor3.getBytes(14);
                Image image2 = bytes9 != 0 ? (Image) ((WireAdapter) zzljVar2.zzd).decode(bytes9) : null;
                String string18 = androidCursor3.getString(15);
                SyncInvestmentEntity.ReleaseStage releaseStage2 = string18 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar2.zzf).decode(string18) : null;
                long longValue2 = m6.longValue();
                InvestmentEntityType investmentEntityType2 = (InvestmentEntityType) m8;
                InvestmentEntityStatus investmentEntityStatus2 = (InvestmentEntityStatus) m9;
                List list4 = list3;
                boolean booleanValue3 = bool3.booleanValue();
                string13.getClass();
                m7.getClass();
                investmentEntityType2.getClass();
                string14.getClass();
                investmentEntityStatus2.getClass();
                return new Investment_entity(longValue2, string13, m7, investmentEntityType2, string14, string15, l4, string16, investmentEntityStatus2, string17, list4, l5, booleanValue3, color3, image2, releaseStage2);
        }
    }
}
