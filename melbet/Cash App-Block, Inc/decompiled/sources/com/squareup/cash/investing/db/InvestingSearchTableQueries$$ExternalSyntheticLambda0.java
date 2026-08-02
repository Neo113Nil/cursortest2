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
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSearchTableQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingDiscoveryQueries f$1;

    public /* synthetic */ InvestingSearchTableQueries$$ExternalSyntheticLambda0(InvestingDiscoveryQueries investingDiscoveryQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                InvestingSearchTableQueries$entityBySearch$2 investingSearchTableQueries$entityBySearch$2 = InvestingSearchTableQueries$entityBySearch$2.INSTANCE;
                break;
            default:
                InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2 investingSearchTableQueries$entityWithUpComingIpoBySearch$2 = InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2.INSTANCE;
                break;
        }
        this.f$1 = investingDiscoveryQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v11, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SyncInvestmentEntity.ReleaseStage releaseStage;
        int i = this.$r8$classId;
        InvestingDiscoveryQueries investingDiscoveryQueries = this.f$1;
        switch (i) {
            case 0:
                InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2 investingSearchTableQueries$entityWithUpComingIpoBySearch$2 = InvestingSearchTableQueries$entityWithUpComingIpoBySearch$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor, 0);
                String string2 = androidCursor.getString(1);
                String m2 = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 3, (EnumColumnAdapter) investingDiscoveryQueries.investment_entityAdapter.zza);
                String string3 = androidCursor.getString(4);
                string3.getClass();
                String string4 = androidCursor.getString(5);
                Long l = androidCursor.getLong(6);
                String string5 = androidCursor.getString(7);
                zzlj zzljVar = investingDiscoveryQueries.investment_entityAdapter;
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
                releaseStage = string7 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar.zzf).decode(string7) : null;
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
            default:
                InvestingSearchTableQueries$entityBySearch$2 investingSearchTableQueries$entityBySearch$2 = InvestingSearchTableQueries$entityBySearch$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m5 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                String string8 = androidCursor2.getString(1);
                String m6 = Matcher$$ExternalSyntheticOutline0.m(string8, androidCursor2, 2);
                Enum m7 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 3, (EnumColumnAdapter) investingDiscoveryQueries.investment_entityAdapter.zza);
                String string9 = androidCursor2.getString(4);
                string9.getClass();
                String string10 = androidCursor2.getString(5);
                Long l3 = androidCursor2.getLong(6);
                String string11 = androidCursor2.getString(7);
                zzlj zzljVar2 = investingDiscoveryQueries.investment_entityAdapter;
                Enum m8 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 8, (EnumColumnAdapter) zzljVar2.zzb);
                String string12 = androidCursor2.getString(9);
                ?? bytes4 = androidCursor2.getBytes(10);
                List list3 = bytes4 != 0 ? (List) ((WireRepeatedAdapter) zzljVar2.zzc).decode(bytes4) : null;
                Long l4 = androidCursor2.getLong(11);
                Boolean bool2 = androidCursor2.getBoolean(12);
                bool2.getClass();
                ?? bytes5 = androidCursor2.getBytes(13);
                Color color2 = bytes5 != 0 ? (Color) ((WireAdapter) zzljVar2.zze).decode(bytes5) : null;
                ?? bytes6 = androidCursor2.getBytes(14);
                Image image2 = bytes6 != 0 ? (Image) ((WireAdapter) zzljVar2.zzd).decode(bytes6) : null;
                String string13 = androidCursor2.getString(15);
                releaseStage = string13 != null ? (SyncInvestmentEntity.ReleaseStage) ((EnumColumnAdapter) zzljVar2.zzf).decode(string13) : null;
                long longValue2 = m5.longValue();
                InvestmentEntityType investmentEntityType2 = (InvestmentEntityType) m7;
                InvestmentEntityStatus investmentEntityStatus2 = (InvestmentEntityStatus) m8;
                List list4 = list3;
                boolean booleanValue2 = bool2.booleanValue();
                string8.getClass();
                m6.getClass();
                investmentEntityType2.getClass();
                string9.getClass();
                investmentEntityStatus2.getClass();
                return new Investment_entity(longValue2, string8, m6, investmentEntityType2, string9, string10, l3, string11, investmentEntityStatus2, string12, list4, l4, booleanValue2, color2, image2, releaseStage);
        }
    }
}
