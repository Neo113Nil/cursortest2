package com.squareup.cash.investing.backend.real;

import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentEntityRanking;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class InvestmentEntitySyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final /* synthetic */ int $r8$classId;
    public final InvestmentEntityQueries investmentEntityQueries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntitySyncEntityStorageObserver(CashAccountDatabaseImpl cashAccountDatabaseImpl, int i) {
        super(AndroidSyncValueSpecs.InvestmentEntity);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                super(AndroidSyncValueSpecs.InvestmentEntityRanking);
                this.investmentEntityQueries = cashAccountDatabaseImpl.investmentEntityQueries;
                break;
            default:
                this.investmentEntityQueries = cashAccountDatabaseImpl.investmentEntityQueries;
                break;
        }
    }

    private final void onDeleteAllEntities$com$squareup$cash$investing$backend$real$InvestmentEntitySyncEntityStorageObserver() {
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                this.investmentEntityQueries.resetOrdering();
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType) {
        int i = this.$r8$classId;
        InvestmentEntityQueries investmentEntityQueries = this.investmentEntityQueries;
        str.getClass();
        syncEntityType.getClass();
        switch (i) {
            case 0:
                investmentEntityQueries.getClass();
                investmentEntityQueries.driver.execute(-1844823736, "DELETE\nFROM investment_entity\nWHERE token = ?", new ClusterItemKt$$ExternalSyntheticLambda3(str, 2));
                investmentEntityQueries.notifyQueries(-1844823736, new InvestmentEntityQueries$$ExternalSyntheticLambda1(0));
                break;
            default:
                investmentEntityQueries.resetOrdering();
                break;
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(final String str, SyncEntityType syncEntityType, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SyncInvestmentEntity syncInvestmentEntity = (SyncInvestmentEntity) obj;
                str.getClass();
                syncEntityType.getClass();
                syncInvestmentEntity.getClass();
                final String str2 = syncInvestmentEntity.symbol;
                str2.getClass();
                final InvestmentEntityType investmentEntityType = syncInvestmentEntity.f1391type;
                investmentEntityType.getClass();
                final String str3 = syncInvestmentEntity.color;
                final String str4 = syncInvestmentEntity.display_name;
                str4.getClass();
                final String str5 = syncInvestmentEntity.icon_url;
                final InvestmentEntityStatus investmentEntityStatus = syncInvestmentEntity.status;
                investmentEntityStatus.getClass();
                final Long l = syncInvestmentEntity.outstanding_shares;
                final String str6 = syncInvestmentEntity.about_text;
                final List list = syncInvestmentEntity.about_detail_rows;
                Boolean bool = syncInvestmentEntity.delisted;
                final boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Color color = syncInvestmentEntity.themed_color;
                if (color == null) {
                    color = syncInvestmentEntity.entity_color;
                }
                final Color color2 = color;
                final Image image = syncInvestmentEntity.icon;
                final SyncInvestmentEntity.ReleaseStage releaseStage = syncInvestmentEntity.release_stage;
                final InvestmentEntityQueries investmentEntityQueries = this.investmentEntityQueries;
                investmentEntityQueries.getClass();
                investmentEntityQueries.driver.execute(-434582775, "INSERT OR REPLACE INTO investment_entity\n  (token, symbol, type, display_name, icon_url, outstanding_shares, color, status, about_text,\n  about_detail_rows, delisted, entity_color, icon, release_stage)\nVALUES\n  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        AndroidStatement androidStatement = (AndroidStatement) obj2;
                        Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str, 1, str2);
                        InvestmentEntityQueries investmentEntityQueries2 = investmentEntityQueries;
                        androidStatement.bindString(2, (String) ((EnumColumnAdapter) investmentEntityQueries2.investment_entityAdapter.zza).encode(investmentEntityType));
                        androidStatement.bindString(3, str4);
                        androidStatement.bindString(4, str5);
                        androidStatement.bindLong(5, l);
                        androidStatement.bindString(6, str3);
                        zzlj zzljVar = investmentEntityQueries2.investment_entityAdapter;
                        androidStatement.bindString(7, (String) ((EnumColumnAdapter) zzljVar.zzb).encode(investmentEntityStatus));
                        androidStatement.bindString(8, str6);
                        List list2 = list;
                        androidStatement.bindBytes(9, list2 != null ? (byte[]) ((WireRepeatedAdapter) zzljVar.zzc).encode(list2) : null);
                        androidStatement.bindBoolean(10, Boolean.valueOf(booleanValue));
                        Color color3 = color2;
                        androidStatement.bindBytes(11, color3 != null ? (byte[]) ((WireAdapter) zzljVar.zze).encode(color3) : null);
                        Image image2 = image;
                        androidStatement.bindBytes(12, image2 != null ? (byte[]) ((WireAdapter) zzljVar.zzd).encode(image2) : null);
                        SyncInvestmentEntity.ReleaseStage releaseStage2 = releaseStage;
                        androidStatement.bindString(13, releaseStage2 != null ? (String) ((EnumColumnAdapter) zzljVar.zzf).encode(releaseStage2) : null);
                        return Unit.INSTANCE;
                    }
                });
                investmentEntityQueries.notifyQueries(-434582775, new InvestmentEntityQueries$$ExternalSyntheticLambda1(26));
                break;
            default:
                SyncInvestmentEntityRanking syncInvestmentEntityRanking = (SyncInvestmentEntityRanking) obj;
                str.getClass();
                syncEntityType.getClass();
                syncInvestmentEntityRanking.getClass();
                if (syncInvestmentEntityRanking.ranking_type == SyncInvestmentEntityRanking.RankingType.SEARCH_AND_CATEGORY_VIEWS) {
                    this.investmentEntityQueries.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(16, this, syncInvestmentEntityRanking));
                    break;
                }
                break;
        }
    }
}
